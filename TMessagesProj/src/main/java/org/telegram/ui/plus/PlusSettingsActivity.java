package org.telegram.ui.plus;

import android.content.Context;
import android.text.InputType;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;

import java.util.ArrayList;

public class PlusSettingsActivity extends BaseFragment {

    private RecyclerListView listView;
    private ListAdapter adapter;
    private final ArrayList<Item> items = new ArrayList<>();

    private static final int TYPE_HEADER = 0;
    private static final int TYPE_CHECK = 1;
    private static final int TYPE_SETTING = 2;
    private static final int TYPE_INFO = 3;

    private static final int ID_STEALTH_TYPING = 1;
    private static final int ID_STEALTH_READ = 2;
    private static final int ID_LOCK_SECRET = 3;
    private static final int ID_HIDE_KEYBOARD = 4;
    private static final int ID_AUTOPLAY_VOICE = 5;
    private static final int ID_SWIPE = 6;
    private static final int ID_PIXEL = 7;
    private static final int ID_GEMINI_KEY = 8;
    private static final int ID_GEMINI_MODEL = 9;
    private static final int ID_FOLDER_BASE = 1000;

    @Override
    public View createView(Context context) {
        PlusConfig.load();
        actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        actionBar.setAllowOverlayTitle(true);
        actionBar.setTitle("Плюшки");
        actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int id) {
                if (id == -1) {
                    finishFragment();
                }
            }
        });

        fragmentView = new FrameLayout(context);
        FrameLayout frameLayout = (FrameLayout) fragmentView;
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));

        listView = new RecyclerListView(context);
        listView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false));
        listView.setVerticalScrollBarEnabled(false);
        listView.setAdapter(adapter = new ListAdapter());
        frameLayout.addView(listView, LayoutHelper.createFrame(LayoutHelper.MATCH_PARENT, LayoutHelper.MATCH_PARENT));
        listView.setOnItemClickListener((view, position) -> {
            if (position < 0 || position >= items.size()) {
                return;
            }
            Item item = items.get(position);
            if (item.id == ID_STEALTH_TYPING) {
                PlusConfig.setBoolean("stealthTyping", !PlusConfig.stealthTyping);
                ((TextCheckCell) view).setChecked(PlusConfig.stealthTyping);
            } else if (item.id == ID_STEALTH_READ) {
                PlusConfig.setBoolean("stealthRead", !PlusConfig.stealthRead);
                ((TextCheckCell) view).setChecked(PlusConfig.stealthRead);
            } else if (item.id == ID_LOCK_SECRET) {
                PlusConfig.setBoolean("lockSecretChats", !PlusConfig.lockSecretChats);
                ((TextCheckCell) view).setChecked(PlusConfig.lockSecretChats);
            } else if (item.id == ID_HIDE_KEYBOARD) {
                PlusConfig.setBoolean("hideKeyboardOnScroll", !PlusConfig.hideKeyboardOnScroll);
                ((TextCheckCell) view).setChecked(PlusConfig.hideKeyboardOnScroll);
            } else if (item.id == ID_AUTOPLAY_VOICE) {
                PlusConfig.setBoolean("autoplayVoice", !PlusConfig.autoplayVoice);
                ((TextCheckCell) view).setChecked(PlusConfig.autoplayVoice);
            } else if (item.id == ID_PIXEL) {
                PlusConfig.setBoolean("pixelMaterial", !PlusConfig.pixelMaterial);
                ((TextCheckCell) view).setChecked(PlusConfig.pixelMaterial);
                Theme.refreshThemeColors();
            } else if (item.id == ID_SWIPE) {
                PlusConfig.cycleSwipeAction();
                ((TextSettingsCell) view).setTextAndValue("Свайп по сообщению", PlusConfig.swipeActionName(), true);
            } else if (item.id == ID_GEMINI_KEY) {
                editGeminiKey();
            } else if (item.id >= ID_FOLDER_BASE) {
                int filterId = item.id - ID_FOLDER_BASE;
                boolean locked = !PlusConfig.isFolderLocked(filterId);
                PlusConfig.setFolderLocked(filterId, locked);
                ((TextCheckCell) view).setChecked(locked);
            }
        });
        rebuildItems();
        return fragmentView;
    }

    private void editGeminiKey() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), getResourceProvider());
        builder.setTitle("Ключ Gemini");
        LinearLayout layout = new LinearLayout(getParentActivity());
        layout.setOrientation(LinearLayout.VERTICAL);
        int pad = AndroidUtilities.dp(24);
        layout.setPadding(pad, AndroidUtilities.dp(8), pad, 0);
        EditText editText = new EditText(getParentActivity());
        editText.setText(PlusConfig.getGeminiApiKey());
        editText.setInputType(InputType.TYPE_CLASS_TEXT);
        editText.setTextColor(Theme.getColor(Theme.key_dialogTextBlack));
        layout.addView(editText, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT));
        builder.setView(layout);
        builder.setPositiveButton(LocaleController.getString(R.string.OK), (d, w) -> {
            PlusConfig.setGeminiApiKey(editText.getText().toString());
            if (adapter != null) {
                rebuildItems();
                adapter.notifyDataSetChanged();
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        showDialog(builder.create());
    }

    private void rebuildItems() {
        items.clear();
        items.add(new Item(TYPE_HEADER, 0, "Приватность"));
        items.add(new Item(TYPE_CHECK, ID_STEALTH_TYPING, "Не отправлять «печатает»"));
        items.add(new Item(TYPE_CHECK, ID_STEALTH_READ, "Не отправлять прочтение"));
        items.add(new Item(TYPE_CHECK, ID_LOCK_SECRET, "Биометрия на секретные чаты"));
        items.add(new Item(TYPE_INFO, 0, "Stealth работает только локально: собеседник не видит набор и галочки прочтения. Чужие сообщения не сохраняются после удаления."));

        items.add(new Item(TYPE_HEADER, 0, "Папки"));
        ArrayList<MessagesController.DialogFilter> filters = getMessagesController().getDialogFilters();
        boolean anyFolder = false;
        for (int i = 0; i < filters.size(); i++) {
            MessagesController.DialogFilter filter = filters.get(i);
            if (filter.isDefault()) {
                continue;
            }
            anyFolder = true;
            items.add(new Item(TYPE_CHECK, ID_FOLDER_BASE + filter.id, "Биометрия: " + filter.name));
        }
        if (!anyFolder) {
            items.add(new Item(TYPE_INFO, 0, "Создайте папки в настройках Telegram, затем их можно закрыть биометрией."));
        } else {
            items.add(new Item(TYPE_INFO, 0, "Закрытая папка попросит отпечаток или пароль устройства."));
        }

        items.add(new Item(TYPE_HEADER, 0, "Чат"));
        items.add(new Item(TYPE_CHECK, ID_HIDE_KEYBOARD, "Скрывать клавиатуру при скролле"));
        items.add(new Item(TYPE_CHECK, ID_AUTOPLAY_VOICE, "Автовоспроизведение голосовых"));
        items.add(new Item(TYPE_SETTING, ID_SWIPE, "Свайп по сообщению"));
        items.add(new Item(TYPE_INFO, 0, "В меню сообщения: копировать фото, сохранить оригинал, упомянуть, ID/JSON. Долгий тап по аватарке открывает медиапрофиль."));

        items.add(new Item(TYPE_HEADER, 0, "Gemini"));
        items.add(new Item(TYPE_SETTING, ID_GEMINI_KEY, "API-ключ"));
        items.add(new Item(TYPE_SETTING, ID_GEMINI_MODEL, "Модель"));
        items.add(new Item(TYPE_INFO, 0, "Режимы: перевод, саммари, формальный стиль, запятые и заглавные, поиск ошибок. Premium Telegram не трогаем."));

        items.add(new Item(TYPE_HEADER, 0, "Внешний вид"));
        items.add(new Item(TYPE_CHECK, ID_PIXEL, "Material You как на Pixel"));
        items.add(new Item(TYPE_INFO, 0, "Системный акцент Android 12+ для шапки, кнопок и переключателей."));
    }

    private static class Item {
        final int type;
        final int id;
        final String text;

        Item(int type, int id, String text) {
            this.type = type;
            this.id = id;
            this.text = text;
        }
    }

    private class ListAdapter extends RecyclerListView.SelectionAdapter {
        @Override
        public boolean isEnabled(RecyclerView.ViewHolder holder) {
            int type = holder.getItemViewType();
            return type == TYPE_CHECK || type == TYPE_SETTING;
        }

        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view;
            if (viewType == TYPE_HEADER) {
                view = new HeaderCell(getContext());
                view.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
            } else if (viewType == TYPE_CHECK) {
                view = new TextCheckCell(getContext());
                view.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
            } else if (viewType == TYPE_SETTING) {
                view = new TextSettingsCell(getContext());
                view.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
            } else {
                view = new TextInfoPrivacyCell(getContext());
            }
            return new RecyclerListView.Holder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
            Item item = items.get(position);
            boolean divider = position + 1 < items.size() && items.get(position + 1).type == item.type;
            if (holder.getItemViewType() == TYPE_HEADER) {
                ((HeaderCell) holder.itemView).setText(item.text);
            } else if (holder.getItemViewType() == TYPE_INFO) {
                ((TextInfoPrivacyCell) holder.itemView).setText(item.text);
            } else if (holder.getItemViewType() == TYPE_SETTING) {
                TextSettingsCell cell = (TextSettingsCell) holder.itemView;
                if (item.id == ID_SWIPE) {
                    cell.setTextAndValue(item.text, PlusConfig.swipeActionName(), divider);
                } else if (item.id == ID_GEMINI_KEY) {
                    String key = PlusConfig.getGeminiApiKey();
                    String masked = key.length() <= 8 ? key : key.substring(0, 6) + "…" + key.substring(key.length() - 4);
                    cell.setTextAndValue(item.text, masked, divider);
                } else if (item.id == ID_GEMINI_MODEL) {
                    cell.setTextAndValue(item.text, PlusConfig.getGeminiModel(), divider);
                }
            } else if (holder.getItemViewType() == TYPE_CHECK) {
                TextCheckCell cell = (TextCheckCell) holder.itemView;
                boolean checked = false;
                if (item.id == ID_STEALTH_TYPING) {
                    checked = PlusConfig.stealthTyping;
                } else if (item.id == ID_STEALTH_READ) {
                    checked = PlusConfig.stealthRead;
                } else if (item.id == ID_LOCK_SECRET) {
                    checked = PlusConfig.lockSecretChats;
                } else if (item.id == ID_HIDE_KEYBOARD) {
                    checked = PlusConfig.hideKeyboardOnScroll;
                } else if (item.id == ID_AUTOPLAY_VOICE) {
                    checked = PlusConfig.autoplayVoice;
                } else if (item.id == ID_PIXEL) {
                    checked = PlusConfig.pixelMaterial;
                } else if (item.id >= ID_FOLDER_BASE) {
                    checked = PlusConfig.isFolderLocked(item.id - ID_FOLDER_BASE);
                }
                cell.setTextAndCheck(item.text, checked, divider);
            }
        }

        @Override
        public int getItemCount() {
            return items.size();
        }

        @Override
        public int getItemViewType(int position) {
            return items.get(position).type;
        }
    }
}
