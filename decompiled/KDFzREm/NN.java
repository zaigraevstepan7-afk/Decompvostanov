/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap$FastEntrySet
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 */
package KDFzREm;

import KDFzREm.F;
import KDFzREm.il;
import KDFzREm.zK;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class NN {
    private static short[] y;
    public Object[] N;
    private static byte[] L;
    private static boolean[] u;
    private static /* synthetic */ String lIItr;
    private static /* synthetic */ int[] IImrOrmq;

    private static /* synthetic */ int L(int n) {
        return Integer.rotateRight(-Integer.rotateRight((Integer.rotateLeft(n, 9) ^ 0x3AFB9E01) + 1, 23), 7);
    }

    private static void L() {
        L = new byte[]{2};
    }

    private void L(F f2) {
        NN.OOpjj("ayns", 1544511419, 2084944003, 2084944002, 2084944001, -266883849, (NN)this, (F)f2);
        NN.OOpjj("sbbbyg", 1544511419, 2084944003, 2084944010, 2084944009, -266883849, (NN)this, (int)NN.OOpjj("cdrcsn", 1544511419, 2084944005, 2084944004, 2084944011, -266883849, (zK)((Object)NN.OOpjj("wqbpns", 1544511419, 2084944000, 2084944007, 2084944006, -266883849, (F)f2))), (F)f2);
    }

    public NN() {
        NN.OOpjj("ayns", 1544511419, 2084944003, 2084944010, 2084944040, 1544511419, (NN)this);
        Int2ObjectOpenHashMap int2ObjectOpenHashMap = new Int2ObjectOpenHashMap();
        NN.OOpjj("sbbbyg", 1544511417, 2084944003, 2084944010, 2084944008, 1544511417, (NN)this)[NN.OOpjj("wqbpns", 1544511423, 2084944003, 2084944007, 2084944015, 1544511423)[0]] = int2ObjectOpenHashMap;
        Consumer<Object> consumer = this::L;
        NN.OOpjj("cbcgle", 1544511417, 2084944003, 2084944010, 2084944008, 1544511417, (NN)this)[NN.OOpjj("wurryr", 1544511423, 2084944003, 2084944007, 2084944015, 1544511423)[1]] = consumer;
    }

    static {
        NN.ntfClinit();
    }

    private static void u() {
        y = new short[]{0, 1, 1, 0, 0, 0, 0};
    }

    private void u(F f2) {
        CallSite callSite = NN.OOpjj("wvzrtef", 1544511412, 2084944030, 2084944029, 2084944028, 1544511412, (Int2ObjectMap.FastEntrySet)NN.OOpjj("wurryr", 1544511419, 2084944012, 2084944024, 2084944031, 1544511419, (Int2ObjectOpenHashMap)((Int2ObjectOpenHashMap)NN.OOpjj("wqbpns", 1544511417, 2084944003, 2084944010, 2084944008, 1544511417, (NN)this)[NN.OOpjj("plxlzzp", 1544511423, 2084944003, 2084944007, 2084944015, 1544511423)[5]])));
        while (NN.OOpjj("wqbpns", 1544511412, 2084944035, 2084944034, 2084944033, 1544511412, (ObjectIterator)callSite) != false) {
            Int2ObjectMap.Entry entry = (Int2ObjectMap.Entry)NN.OOpjj("inrwuf", 1544511412, 2084944035, 2084944032, 2084944039, -266883849, (ObjectIterator)callSite);
            List list = (List)((Object)NN.OOpjj("vuxpx", 1544511412, 2084944038, 2084944037, 2084944039, -266883849, (Int2ObjectMap.Entry)entry));
            NN.OOpjj("cdrcsn", 1544511412, 2084944017, 2084944036, 2084944043, -266883849, (List)list, f3 -> (boolean)(f3 == f2 ? NN.OOpjj("vuxpx", 1544511423, 2084944003, 2084944002, 2084944054, 1448673120)[2] : NN.OOpjj("waqtogv", 1544511423, 2084944003, 2084944002, 2084944054, 1290680609)[3]));
            if (NN.OOpjj("wqbpns", 1544511412, 2084944017, 2084944042, 2084944033, -266883849, (List)list) == false) continue;
            NN.OOpjj("inrwuf", 1544511412, 2084944035, 2084944041, 2084944040, -266883849, (ObjectIterator)callSite);
        }
    }

    private static /* synthetic */ int u(int n) {
        return Integer.rotateLeft(-Integer.rotateRight(Integer.rotateLeft(Integer.rotateRight(n, 26), 12), 14), 17);
    }

    private static void y() {
        u = new boolean[]{true, false, true, false};
    }

    public void y(il il2) {
        List list = (List)((Object)NN.OOpjj("wvzrtef", 1544511419, 2084944012, 2084944019, 2084944018, -266883849, (Int2ObjectOpenHashMap)((Int2ObjectOpenHashMap)NN.OOpjj("waqtogv", 1544511417, 2084944003, 2084944010, 2084944008, -245726488, (NN)this)[NN.OOpjj("sbbbyg", 1544511423, 2084944003, 2084944007, 2084944015, 838628548)[3]]), (int)NN.OOpjj("zrbim", 1544511419, 2084944014, 2084944013, 2084944011, -266883849, (il)il2)));
        if (list == null) {
            return;
        }
        CallSite callSite = NN.OOpjj("zrbim", 1544511412, 2084944022, 2084944053, 2084944052, -266883849, (Stream)((Object)NN.OOpjj("wqbpns", 1544511412, 2084944022, 2084944021, 2084944020, -266883849, (Stream)((Object)NN.OOpjj("plxlzzp", 1544511412, 2084944017, 2084944016, 2084944023, -266883849, (List)list)), f2 -> (boolean)NN.OOpjj("cdrcsn", 1544511419, 2084944000, 2084944002, 2084944055, -266883849, (F)f2, (il)il2))));
        if (NN.OOpjj("waqtogv", 1544511412, 2084944017, 2084944042, 2084944033, -266883849, (List)((Object)callSite)) != false) {
            callSite = NN.OOpjj("cdrcsn", 1544511412, 2084944022, 2084944053, 2084944052, -266883849, (Stream)((Object)NN.OOpjj("wvzrtef", 1544511412, 2084944022, 2084944021, 2084944020, -266883849, (Stream)((Object)NN.OOpjj("pbvea", 1544511412, 2084944017, 2084944016, 2084944023, -266883849, (List)list)), f2 -> (boolean)NN.OOpjj("zrbim", 1544511419, 2084944000, 2084944007, 2084944055, -266883849, (F)f2, (il)il2))));
        }
        NN.OOpjj("cbcgle", 1544511412, 2084944017, 2084944027, 2084944026, -266883849, (List)((Object)callSite), f2 -> NN.OOpjj("inrwuf", 1544511419, 2084944000, 2084944004, 2084944047, -266883849, (F)f2, (il)il2));
    }

    public void y(F f2) {
        NN.OOpjj("inrwuf", 1544511419, 2084944003, 2084944002, 2084944001, 1544511419, (NN)this, (F)f2);
        NN.OOpjj("inrwuf", 1544511419, 2084944003, 2084944010, 2084944009, 1544511419, (NN)this, (int)NN.OOpjj("cdrcsn", 1544511419, 2084944005, 2084944004, 2084944011, 1544511419, (zK)((Object)NN.OOpjj("cdrcsn", 1544511419, 2084944000, 2084944007, 2084944006, 1544511419, (F)f2))), (F)f2);
        NN.OOpjj("inrwuf", 1544511419, 2084944000, 2084944010, 2084944026, 1544511419, (F)f2, (Consumer)((Consumer)((Object)NN.OOpjj("inrwuf", 1544511417, 2084944003, 2084944010, 2084944008, 1544511417, (NN)this)[NN.OOpjj("plxlzzp", 1544511423, 2084944003, 2084944007, 2084944015, 1544511423)[2]])));
    }

    private void N(int n2, F f2) {
        if (NN.OOpjj("cbcgle", 1544511419, 2084944000, 2084944046, 2084944033, 1544511419, (F)f2) != false) {
            return;
        }
        List list = (List)((Object)NN.OOpjj("wqbpns", 1544511419, 2084944012, 2084944045, 2084944044, -266883849, (Int2ObjectOpenHashMap)((Int2ObjectOpenHashMap)NN.OOpjj("wvzrtef", 1544511417, 2084944003, 2084944010, 2084944008, 727717745, (NN)this)[NN.OOpjj("plxlzzp", 1544511423, 2084944003, 2084944007, 2084944015, -1493549468)[6]]), n2, n -> new ArrayList()));
        if (NN.OOpjj("ayns", 1544511412, 2084944022, 2084944051, 2084944043, -266883849, (Stream)((Object)NN.OOpjj("cbcgle", 1544511412, 2084944017, 2084944016, 2084944023, -266883849, (List)list)), f3 -> (boolean)(f3 == f2 ? NN.OOpjj("wqbpns", 1544511423, 2084944003, 2084944002, 2084944054, -1429108263)[0] : NN.OOpjj("wurryr", 1544511423, 2084944003, 2084944002, 2084944054, -1602939829)[1])) != false) {
            return;
        }
        NN.OOpjj("wurryr", 1544511412, 2084944017, 2084944050, 2084944049, -266883849, (List)list, (Object)f2);
    }

    private void N() {
        if (NN.OOpjj("wqbpns", 1544511417, 2084944003, 2084944010, 2084944008, 1544511417, (NN)this) == null) {
            NN.OOpjj("wqbpns", 1544511416, 2084944003, 2084944010, 2084944008, 1544511416, (NN)this, (Object[])new Object[NN.OOpjj("wvzrtef", 1544511423, 2084944003, 2084944004, 2084944025, 1544511423)[0]]);
            CallSite callSite = NN.OOpjj("inrwuf", 1544511417, 2084944003, 2084944010, 2084944008, 1544511417, (NN)this);
        }
    }

    public void N(il il2) {
        List list = (List)((Object)NN.OOpjj("zrbim", 1544511419, 2084944012, 2084944019, 2084944018, 1544511419, (Int2ObjectOpenHashMap)((Int2ObjectOpenHashMap)NN.OOpjj("sbbbyg", 1544511417, 2084944003, 2084944010, 2084944008, 1544511417, (NN)this)[NN.OOpjj("inrwuf", 1544511423, 2084944003, 2084944007, 2084944015, 1544511423)[4]]), (int)NN.OOpjj("waqtogv", 1544511419, 2084944014, 2084944013, 2084944011, 1544511419, (il)il2)));
        if (list == null) {
            return;
        }
        NN.OOpjj("cbcgle", 1544511412, 2084944022, 2084944027, 2084944026, -266883849, (Stream)((Object)NN.OOpjj("waqtogv", 1544511412, 2084944022, 2084944021, 2084944020, -266883849, (Stream)((Object)NN.OOpjj("vuxpx", 1544511412, 2084944017, 2084944016, 2084944023, -266883849, (List)list)), f2 -> (boolean)NN.OOpjj("plxlzzp", 1544511419, 2084944000, 2084944010, 2084944048, -266883849, (F)f2, (int)NN.OOpjj("wvzrtef", 1544511419, 2084944014, 2084944013, 2084944011, -266883849, (il)il2)))), f2 -> NN.OOpjj("plxlzzp", 1544511419, 2084944000, 2084944010, 2084944047, -266883849, (F)f2, (il)il2));
    }

    public void N(F f2) {
        NN.OOpjj("plxlzzp", 1544511419, 2084944003, 2084944002, 2084944001, -266883849, (NN)this, (F)f2);
    }

    private static /* synthetic */ int N(int n) {
        return (Integer.rotateRight(Integer.rotateLeft(Integer.rotateRight(n, 5), 2), 18) ^ 0xC28F2795) + 1;
    }

    private static /* synthetic */ void ntfClinit() {
        lIItr = "\u00c7\u00b1\u0097\u00f3\u00d7q\u00f3\u00a8L\u008en\u00e6\u00a1\u0083B\u0091\u008a\u00fb\u00af\u00a2\u00b26\u00d1\u0097\u00d2\u00f2A\u00e8\u00d5e\u0082/\u00c7\u00b5\u00e5v\u0099\u00ec\u00f4\u00ec\u00d8n\u00ff\u00ee\u000f\u008bs\u00e8\u00a1\u00aaA\u00c2\u0084\u00ed\u00af\u00f0\u00da(\u00fb\u00e9T\u009c/\u00c8\u00e0\u00b8\u0012\u00fe\u0092\u00f2\u00be\u00fa\u00c2J\u00f3\u00f7\u0004\u00a9a\u00f2\u00fa\u0089N\u00c5\u0082\u00e1\u0088\u00fc\u00c2\u00ea\u00ec\u00a9\u00fc\u00d7j\u0011\u00d1\u0097\u00f0\u00c2(\u00e7\u00e9I\u0082i\u00ae\u00ea\u00bfI/_\u00f9\u00a8\u00ed\u00c3s\u00fb\u00eb\u000f\u0086n\u00f5\u00fd\u00e3inM\u00aa\u0094\u00fb\u00dcb\u00f1\u00f3f\u009an\u00e2\u00fa\u00a5On\u0002\u00b1\u0097\u00f3\u00d7q\u00f3\u00a8L\u008en\u00e6\u00a1\u0083Bj\\\u00fb\u00af\u00a2\u00bb\u00dc\u009d\u00e3\u00e4B\u00ff\u00a8I\u0083\u0086\u00b1\u0081P\u00ec\u00f4\u00ec\u00d8n\u00ff\u00ee\u000f\u008bs\u00e8\u00a1\u00aaAsM\u00ed\u00af\u00f0\u00da(\u00fb\u00e9T\u009c/\u00c8\u00e0\u00b8\u0012O[\u00f2\u00be\u00fa\u00c2H\u00e2\u00e2N\u00a7a\u00f2\u00e6\u0081Ap\u0086\u00d4\u0090\u00dd\u00f0}\u00c0\u00c2M\u00c0F\u00ba\u00a7\u009a7\u00b1\u0092\u0011\u00b1\u0097\u00f0\u00c2(\u00e7\u00e9I\u0082i\u00ae\u00ea\u00bfI/_\u00f9\u00a8\u00ed\u00c3s\u00fb\u00eb\u000f\u0080b\u00eb\u00eb\u00afTs\u0016\u00d7\u00b9\u00f3\u00d3d\u00e6\u00ceT\u008ar\u00e0\u00fa\u00a3R;\u0095\u00d1\u00f2\u00d5\u00dcf\u00e4\u00e6\u000f\u0083a\u00ef\u00e9\u00e3om\u00d7\u00fd\u00b8\u00ed\u008dG#\u00b1\u0097\u00f3\u00d7q\u00f3\u00a8U\u009bi\u00ed\u00a1\u0080I\u00c3\u007f\u00a3S\u00dc\u009d\u00e3\u00e4B\u00ff\u00a8Z\u00a4\u00c7\u00b1\u0097\u00f3\u00d7q\u00f3\u00a8U\u009bi\u00ed\u00a1\u00bfT\u0089\u008a\u00f9\u00b6\u00b6\u00e5s\u00e0\u00e2A\u0082;i\u00ec\u00f4\u00ec\u00d8n\u00ff\u00ee\u000f\u008bs\u00e8\u00a1\u00aaA\u0088t\u00ed\u00af\u00f0\u00da(\u00fb\u00e9T\u009c/\u00c8\u00e0\u00b8\u0012\u00b4b\u00f2\u00be\u00fa\u00c2J\u00f3\u00f7\u0004\u00aan\u00f5\u00fc\u00b5E\u00da\u0095y\u00fd\u00b6\u00f6\u00c0b\u00db\u00e1\u00d5\u00f9\u00a8\u00d7\u00d3\u007f\u00e62\u00fd\u00afl\u00f7\u0097\u00f0\u00c5s~\u00f1\u00b7\u00ed\u00d3u\u0089\u00b1\u0097\u00f0\u00c2(\u00e7\u00e9I\u0082i\u00ae\u00ea\u00bfI\u009e\u00c7\u00f9\u00a8\u00ed\u00c3s\u00fb\u00eb\u000f\u0086n\u00f5\u00fd\u00e3i\u00df\u00d5\u00aa\u0094\u00fb\u00dcb\u00f1\u00f3m\u008ep\u00a5\u00c8\u00adS\u00c5\u00e4\u00f6\u00af\u00eb\u00cfT\u00f7\u00f3\u001b\u00c8(\u00b1\u0097\u00d2\u00f2A\u00e8\u00d5e\u0082/\u00fb\u00c5\u00f7\u0096l\u00fd\u00b6\u00f6\u00c0by\u00f7\u00a9\u00dc\u00d7d\u00fa7\u00d4\u00b1\u00f8\u00c0f\u00bd\u00f2T\u0086l\u00ae\u00e8\u00b9N\"k\u00f1\u00b4\u00f7\u0099W\u00e0\u00e2D\u0086c\u00e0\u00fa\u00a9\u001bhE\u00b1\u00d1\u00f2\u00c3\u00fa\u00cb\u00b9\u00f6\u00af\u00ab\u00f9e\u00f8\u00e2C\u009bE\u00ef\u00fa\u00beY\u00ca\u00b5\u00ec\u00f3\u00d4\u00b1\u00f8\u00c0f\u00bd\u00f2T\u0086l\u00ae\u00e8\u00b9N\"\u00af\u00f1\u00b4\u00f7\u0099D\u00fd\u00e9S\u009am\u00e4\u00fc\u00f7\t\u0017\u00d2\u00dc\u009d\u00e3\u00e4B\u00ff\u00a8f\u00dc\u00fc\u00bfM\u00f8\u00b1\u008d[\u00c2\u00b2\u00eb\u009e\u00f4\u00c6s\u00eb\u00c7\u00d4\u0090\u00dd\u00f0}\u00c0\u00c2M\u00c0i\u00ed\u00b5\u00e5z\u00c4\u00f9\u00ad\u00f8\u0099r\u00e6\u00eeL\u00c0L\u00e8\u00fd\u00b8#\u00d4\u00b1\u00f8\u00c0f\u00bd\u00f2T\u0086l\u00ae\u00e8\u00b9N\u00d3\u007f\u00f1\u00b4\u00f7\u0099W\u00e0\u00e2D\u0086c\u00e0\u00fa\u00a9\u001b\u0099G\u00f2\u00ba\u00ef\u00d7(\u00e7\u00f3I\u0083/\u00f2\u00fa\u00beE\u00d1f\u00b7\u0088\u00ed\u00c4b\u00f3\u00ea\u001b\u0089\u00d4\u0090\u00dd\u00f0}\u00c0\u00c2M\u00c0i\u00ed\u00b5\u00e5v\u001e\u00dc\u009d\u00e3\u00e4B\u00ff\u00a8n\u00a1<\u00ec\u00f4\u00ec\u00d8n\u00ff\u00ee\u000f\u008bs\u00e8\u00a1\u00aaA|!\u00ed\u00af\u00f0\u00da(\u00fd\u00e5J\u008ac\u00f5\u00fd\u00e3om?\u00fd\u00b8\u00ed\u00ffs\u00f7\u00f5A\u009bo\u00f3j\u00f9\u00ad\u00f8\u0099r\u00e6\u00eeL\u00c0s\u00f5\u00fc\u00a9A\u0096/\u00cb\u00af\u00eb\u00d3f\u00ff^\u00ec\u00be\u00eb\u00d7s\u00fd\u00f5\u008b\u00d4\u00b1\u00f8\u00c0f\u00bd\u00ebA\u0081g\u00ae\u00c1\u00aeJ\u00fc\u00b3\u00ec\u00e0\u007f\u00fd\u00af\u00cf\u00d7k\u00e7\u00e24\u00f6\u00a2\u00d4\u00d7s\u00f1\u00ef\u00f7\u00fd\u00a3\u00ed\u0086\u00d4\u00b1\u00f8\u00c0f\u00bd\u00ebA\u0081g\u00ae\u00c1\u00aeJ\u00d3\u00cd\u00ec\u00e0\u00b0\u00ecT\u00f7\u00b6\u00e9\u00c3s\u00f7\u00ceF\u00aeb\u00f2\u00eb\u00a2T";
        IImrOrmq = new int[]{48889866, 32899073, 0xE0000E, 40632329, 33882113, 32964622, 21561354, 20316161, 0xEE0003, 27131905, 1376271, 54460435, 37224450, 0xA3000A, 41418753, 0xB00030, 28180483, 18939925, 43253774, 5832710, 22216731, 52428823, 28770310, 44171321, 34340871, 38535200, 27000834, 37355538, 29163577, 2359349, 53936136, 15794224, 49545260, 27721735, 11337731, 56754180, 20, 23986222, 55705608, 27197448, 34799649, 41811975, 0x2060006, 41484291, 47906831, 0x140001, 58392591, 6225988, 56229896, 41222147, 57016341, 36962308, 42270735, 41680898, 28377094, 20381714};
        NN.u();
        NN.L();
        NN.y();
    }

    private static /* synthetic */ CallSite OOpjj(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = IImrOrmq[n2 ^ 0x7C45B883];
        int n7 = n6 >>> 16;
        String string2 = NN.OOltknIn(lIItr.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0x7C45B883);
        n6 = IImrOrmq[n3 ^ 0x7C45B883];
        int n8 = n6 >>> 16;
        String string3 = NN.OOltknIn(lIItr.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0x7C45B883);
        n6 = IImrOrmq[n4 ^ 0x7C45B883];
        int n9 = n6 >>> 16;
        String string4 = NN.OOltknIn(lIItr.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0x7C45B883);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x5C0F5F0D) + -178;
        switch (n) {
            case 0: {
                MethodHandle methodHandle = lookup.findStaticGetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 1: {
                MethodHandle methodHandle = lookup.findStaticSetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 2: {
                MethodHandle methodHandle = lookup.findGetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 3: {
                MethodHandle methodHandle = lookup.findSetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 4: {
                MethodType methodType2 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                MethodHandle methodHandle = lookup.findVirtual(clazz, string3, methodType2);
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 5: {
                MethodType methodType3 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                if (string3.equals("<init>")) {
                    MethodHandle methodHandle = lookup.findConstructor(clazz, methodType3);
                    return new ConstantCallSite(methodHandle.asType(methodType));
                }
                MethodHandle methodHandle = lookup.findSpecial(clazz, string3, methodType3, lookup.lookupClass());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 6: {
                MethodType methodType4 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                MethodHandle methodHandle = lookup.findStatic(clazz, string3, methodType4);
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 7: {
                MethodType methodType5 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                MethodHandle methodHandle = lookup.findVirtual(clazz, string3, methodType5);
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
        }
        throw new IllegalArgumentException("invalid native bootstrap selector");
    }

    private static /* synthetic */ CallSite l1OIn(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = IImrOrmq[n2 ^ 0x7C45B883];
        int n9 = n8 >>> 16;
        String string2 = NN.OOltknIn(lIItr.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x7C45B883);
        n8 = IImrOrmq[n3 ^ 0x7C45B883];
        int n10 = n8 >>> 16;
        String string3 = NN.OOltknIn(lIItr.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x7C45B883);
        n8 = IImrOrmq[n4 ^ 0x7C45B883];
        int n11 = n8 >>> 16;
        String string4 = NN.OOltknIn(lIItr.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x7C45B883);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x5C0F5F0D) + -178;
        switch (n) {
            case 0: {
                MethodHandle methodHandle = lookup.findStaticGetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 1: {
                MethodHandle methodHandle = lookup.findStaticSetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 2: {
                MethodHandle methodHandle = lookup.findGetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 3: {
                MethodHandle methodHandle = lookup.findSetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 4: {
                MethodType methodType2 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                MethodHandle methodHandle = lookup.findVirtual(clazz, string3, methodType2);
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 5: {
                MethodType methodType3 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                if (string3.equals("<init>")) {
                    MethodHandle methodHandle = lookup.findConstructor(clazz, methodType3);
                    return new ConstantCallSite(methodHandle.asType(methodType));
                }
                MethodHandle methodHandle = lookup.findSpecial(clazz, string3, methodType3, lookup.lookupClass());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 6: {
                MethodType methodType4 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                MethodHandle methodHandle = lookup.findStatic(clazz, string3, methodType4);
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 7: {
                MethodType methodType5 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                MethodHandle methodHandle = lookup.findVirtual(clazz, string3, methodType5);
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
        }
        throw new IllegalArgumentException("invalid native bootstrap selector");
    }

    private static /* synthetic */ void llnnI0jkr(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[56];
        for (int i = 0; i < stringArray.length; ++i) {
            String string = stringArray[i];
            int n = 0;
            while (n < string.length()) {
                int n2 = string.charAt(n) << 8 | string.charAt(n + 1);
                int n3 = string.charAt(n + 2) << 8 | string.charAt(n + 3);
                int n4 = n + 4;
                nArray[n2] = stringBuilder.length() << 16 | n3;
                stringBuilder.append(string, n4, n4 + n3);
                n = n4 + n3;
            }
        }
        lIItr = stringBuilder.toString();
        IImrOrmq = nArray;
    }

    private static /* synthetic */ CallSite l1rik(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = IImrOrmq[n2 ^ 0x7C45B883];
        int n8 = n7 >>> 16;
        String string2 = NN.OOltknIn(lIItr.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0x7C45B883);
        n7 = IImrOrmq[n3 ^ 0x7C45B883];
        int n9 = n7 >>> 16;
        String string3 = NN.OOltknIn(lIItr.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0x7C45B883);
        n7 = IImrOrmq[n4 ^ 0x7C45B883];
        int n10 = n7 >>> 16;
        String string4 = NN.OOltknIn(lIItr.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0x7C45B883);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x5C0F5F0D) + -178;
        switch (n) {
            case 0: {
                MethodHandle methodHandle = lookup.findStaticGetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 1: {
                MethodHandle methodHandle = lookup.findStaticSetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 2: {
                MethodHandle methodHandle = lookup.findGetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 3: {
                MethodHandle methodHandle = lookup.findSetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 4: {
                MethodType methodType2 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                MethodHandle methodHandle = lookup.findVirtual(clazz, string3, methodType2);
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 5: {
                MethodType methodType3 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                if (string3.equals("<init>")) {
                    MethodHandle methodHandle = lookup.findConstructor(clazz, methodType3);
                    return new ConstantCallSite(methodHandle.asType(methodType));
                }
                MethodHandle methodHandle = lookup.findSpecial(clazz, string3, methodType3, lookup.lookupClass());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 6: {
                MethodType methodType4 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                MethodHandle methodHandle = lookup.findStatic(clazz, string3, methodType4);
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 7: {
                MethodType methodType5 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                MethodHandle methodHandle = lookup.findVirtual(clazz, string3, methodType5);
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
        }
        throw new IllegalArgumentException("invalid native bootstrap selector");
    }

    private static /* synthetic */ String OOltknIn(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{108, -51, 103, 91, -47, 115, -11, 114, -100, -125, 85, 116, -73, 57, -68, -62};
        byte[] byArray3 = new byte[]{21, -55, -72, -70, 74, -10, 80, 91, 58, -41, -92, -29, 125, 53, -22, 62};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }
}
