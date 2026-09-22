/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NNNwS
 *  KDFzREm.NNuU
 */
package KDFzREm;

import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.Ru;
import KDFzREm.TB;
import KDFzREm.TE;
import KDFzREm.TU;
import KDFzREm.TW;
import KDFzREm.TZ;
import KDFzREm.Tz;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.ih;
import KDFzREm.lG;
import KDFzREm.lT;
import KDFzREm.lY;
import KDFzREm.ld;
import KDFzREm.ll;
import KDFzREm.lv;
import KDFzREm.uF;
import KDFzREm.ue;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;

@UZ(L="Scaffold", y=UR.PLAYER, N=Uz.BASE)
public class TM
extends UM {
    private static short[] u;
    public Object[] L;
    private static boolean[] i;
    private static short[] R;
    private static String[] M;
    private static byte[] B;
    private static String[] Z;
    private static boolean[] z;
    private static short[] U;
    private static boolean[] W;
    private static float[] m;
    private static short[] P;
    private static /* synthetic */ String Ilpsmip;
    private static /* synthetic */ int[] ll0rq;

    private static /* synthetic */ int L(int n) {
        return (Integer.rotateLeft(Integer.rotateLeft((n ^ 0x7B7B3DA) + 1, 9), 17) ^ 0x4C7D8647) + 1;
    }

    private static /* synthetic */ String M(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{71, -96, 5, 59, 35, 12, 50, 29, -84, 119, -88, -18, 15, -2, 3, 52};
        int n = 0;
        int n2 = 43;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 141;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    public boolean P() {
        TM.lllqkn("kfhac", -1698693405, -517298553, -517298554, -517298555, 1282234732, 1754277345, (TM)this);
        return (boolean)TM.lllqkn("odzuie", -1698693405, -517298541, -517298542, -517298537, 1282234732, 1754277345, (Boolean)((Boolean)((Object)TM.lllqkn("odzuie", -1698693405, -517298540, -517298547, -517298548, 1282234732, 1754277345, (lT)((lT)((Object)TM.lllqkn("menzy", -1698693407, -517298553, -517298558, -517298559, 1772114574, 897459405, (TM)this)[TM.lllqkn("menzy", -1698693401, -517298553, -517298538, -517298545, -91032220, 86663032)[1]]))))));
    }

    private static void T() {
        B = new byte[]{3, 2, 2, 6};
    }

    public TM() {
        TM.lllqkn("wmep", -1698693405, -517298553, -517298554, -517298555, -1698693405, -1698693405, (TM)this);
        TU tU = new TU(this, (String)((Object)TM.lllqkn("hzgnspqs", -1698693401, -517298553, -517298529, -517298530, -1698693401, -1698693401)[0]), (boolean)TM.lllqkn("hecnj", -1698693401, -517298553, -517298531, -517298532, -1698693401, -1698693401)[0]);
        TM.lllqkn("kfhac", -1698693407, -517298553, -517298558, -517298559, -1698693407, -1698693407, (TM)this)[TM.lllqkn("hecnj", -1698693401, -517298553, -517298533, -517298545, -1698693401, -1698693401)[0]] = tU;
        lv[] lvArray = new Tz[TM.lllqkn("yiittqlo", -1698693401, -517298553, -517298543, -517298544, -1698693401, -1698693401)[0]];
        lvArray[TM.lllqkn("hecnj", -1698693401, -517298553, -517298531, -517298532, -1698693401, -1698693401)[1]] = new TZ(this, (String)((Object)TM.lllqkn("odzuie", -1698693401, -517298553, -517298529, -517298530, -1698693401, -1698693401)[2]), (boolean)TM.lllqkn("hzgnspqs", -1698693401, -517298553, -517298531, -517298532, -1698693401, -1698693401)[2]);
        lvArray[TM.lllqkn("odzuie", -1698693401, -517298553, -517298547, -517298532, -1698693401, -1698693401)[0]] = new TB(this, (String)((Object)TM.lllqkn("tldb", -1698693401, -517298553, -517298529, -517298530, -1698693401, -1698693401)[3]), (boolean)TM.lllqkn("wmep", -1698693401, -517298553, -517298547, -517298532, -1698693401, -1698693401)[1]);
        lvArray[TM.lllqkn("menzy", -1698693401, -517298553, -517298543, -517298544, -1698693401, -1698693401)[1]] = (TU)((Object)TM.lllqkn("kfhac", -1698693407, -517298553, -517298558, -517298559, -1698693407, -1698693407, (TM)this)[TM.lllqkn("hpiwaavb", -1698693401, -517298553, -517298533, -517298545, -1698693401, -1698693401)[1]]);
        CallSite callSite = TM.lllqkn("hzgnspqs", -1698693395, -517298534, -517298535, -517298536, -1698693395, -1698693395, (lY)this, (String)((Object)TM.lllqkn("hpiwaavb", -1698693401, -517298553, -517298529, -517298530, -1698693401, -1698693401)[1]), (lv[])lvArray);
        TM.lllqkn("odzuie", -1698693407, -517298553, -517298558, -517298559, -1698693407, -1698693407, (TM)this)[TM.lllqkn("wmep", -1698693401, -517298553, -517298533, -517298545, -1698693401, -1698693401)[2]] = callSite;
        lT lT2 = (lT)((Object)TM.lllqkn("yiittqlo", -1698693405, -517298540, -517298535, -517298522, -1698693405, -1698693405, (lT)((Object)TM.lllqkn("hecnj", -1698693395, -517298534, -517298535, -517298521, -1698693395, -1698693395, (lY)this, (String)((Object)TM.lllqkn("yiittqlo", -1698693401, -517298553, -517298529, -517298530, -1698693401, -1698693401)[4]), (boolean)TM.lllqkn("lhyr", -1698693401, -517298553, -517298547, -517298532, -1698693401, -1698693401)[2])), lw2 -> {
            TM.lllqkn("lhyr", -1698693405, -517298553, -517298554, -517298555, 1282234732, 1754277345, (TM)this);
            return (boolean)TM.lllqkn("lhyr", -1698693405, -517298528, -517298538, -517298537, 1282234732, 1754277345, (TU)((TU)((Object)TM.lllqkn("lhyr", -1698693407, -517298553, -517298558, -517298559, 1340045879, 2036301788, (TM)this)[TM.lllqkn("yiittqlo", -1698693401, -517298553, -517298538, -517298545, -211911128, -169833488)[3]])));
        }));
        TM.lllqkn("wmep", -1698693407, -517298553, -517298558, -517298559, -1698693407, -1698693407, (TM)this)[TM.lllqkn("hecnj", -1698693401, -517298553, -517298533, -517298545, -1698693401, -1698693401)[3]] = lT2;
        lv[] lvArray2 = new ue[TM.lllqkn("hpiwaavb", -1698693401, -517298553, -517298543, -517298544, -1698693401, -1698693401)[2]];
        lvArray2[TM.lllqkn("wmep", -1698693401, -517298553, -517298547, -517298532, -1698693401, -1698693401)[3]] = new TW(this, (String)((Object)TM.lllqkn("yiittqlo", -1698693401, -517298553, -517298523, -517298530, -1698693401, -1698693401)[0]), (boolean)TM.lllqkn("menzy", -1698693401, -517298553, -517298524, -517298532, -1698693401, -1698693401)[0]);
        lvArray2[TM.lllqkn("hecnj", -1698693401, -517298553, -517298524, -517298532, -1698693401, -1698693401)[1]] = new TE(this, (String)((Object)TM.lllqkn("tldb", -1698693401, -517298553, -517298523, -517298530, -1698693401, -1698693401)[1]), (boolean)TM.lllqkn("kfhac", -1698693401, -517298553, -517298524, -517298532, -1698693401, -1698693401)[2]);
        CallSite callSite2 = TM.lllqkn("yiittqlo", -1698693395, -517298534, -517298535, -517298536, -1698693395, -1698693395, (lY)this, (String)((Object)TM.lllqkn("lhyr", -1698693401, -517298553, -517298529, -517298530, -1698693401, -1698693401)[5]), (lv[])lvArray2);
        TM.lllqkn("kfhac", -1698693407, -517298553, -517298558, -517298559, -1698693407, -1698693407, (TM)this)[TM.lllqkn("tldb", -1698693401, -517298553, -517298533, -517298545, -1698693401, -1698693401)[4]] = callSite2;
        CallSite callSite3 = TM.lllqkn("wmep", -1698693395, -517298534, -517298535, -517298521, -1698693395, -1698693395, (lY)this, (String)((Object)TM.lllqkn("yiittqlo", -1698693401, -517298553, -517298523, -517298530, -1698693401, -1698693401)[2]), (boolean)TM.lllqkn("menzy", -1698693401, -517298553, -517298524, -517298532, -1698693401, -1698693401)[3]);
        TM.lllqkn("wmep", -1698693407, -517298553, -517298558, -517298559, -1698693407, -1698693407, (TM)this)[TM.lllqkn("kfhac", -1698693401, -517298553, -517298533, -517298545, -1698693401, -1698693401)[5]] = callSite3;
        CallSite callSite4 = TM.lllqkn("menzy", -1698693395, -517298534, -517298535, -517298527, -1698693395, -1698693395, (lY)this, (String)((Object)TM.lllqkn("hecnj", -1698693401, -517298553, -517298523, -517298530, -1698693401, -1698693401)[3]), (lG)new lG((float)TM.lllqkn("menzy", -1698693401, -517298553, -517298525, -517298526, -1698693401, -1698693401)[0], (float)TM.lllqkn("hpiwaavb", -1698693401, -517298553, -517298525, -517298526, -1698693401, -1698693401)[1]), (lG)new lG((float)TM.lllqkn("hzgnspqs", -1698693401, -517298553, -517298525, -517298526, -1698693401, -1698693401)[2], (float)TM.lllqkn("yiittqlo", -1698693401, -517298553, -517298525, -517298526, -1698693401, -1698693401)[3]), (float)TM.lllqkn("yiittqlo", -1698693401, -517298553, -517298525, -517298526, -1698693401, -1698693401)[4]);
        TM.lllqkn("yiittqlo", -1698693407, -517298553, -517298558, -517298559, -1698693407, -1698693407, (TM)this)[TM.lllqkn("hzgnspqs", -1698693401, -517298553, -517298533, -517298545, -1698693401, -1698693401)[6]] = callSite4;
    }

    static {
        TM.ntfClinit();
    }

    private static /* synthetic */ String B(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-38, 36, -100, -114, 32, -118, 118, -51, 116, -124, 98, 57, 22, -14, 71, 99};
        int n = 0;
        int n2 = 209;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 223;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String Z(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{50, -124, 46, -38, 60, -117, 27, -29, 72, -62, -43, 58, -50, 2, -96, -79};
        int n = 0;
        int n2 = 235;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 245;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    @Override
    public boolean Z() {
        TM.lllqkn("odzuie", -1698693405, -517298553, -517298554, -517298555, -1698693405, -1698693405, (TM)this);
        return (boolean)TM.lllqkn("yiittqlo", -1698693405, -517298552, -517298547, -517298537, -1698693405, -1698693405, (Tz)((Tz)((Object)TM.lllqkn("yiittqlo", -1698693405, -517298546, -517298547, -517298548, -1698693405, -1698693405, (ld)((ld)((Object)TM.lllqkn("yiittqlo", -1698693407, -517298553, -517298558, -517298559, -1698693407, -1698693407, (TM)this)[TM.lllqkn("yiittqlo", -1698693401, -517298553, -517298551, -517298545, -1698693401, -1698693401)[3]]))))));
    }

    @Override
    public boolean i() {
        TM.lllqkn("odzuie", -1698693405, -517298553, -517298554, -517298555, 1282234732, 1754277345, (TM)this);
        if ((NNNwS)TM.lllqkn("odzuie", -1698693407, -517298513, -517298514, -517298559, -1119774047, 728963355, (NNuU)((NNuU)TM.lllqkn("odzuie", -1698693407, -517298553, -517298556, -517298559, -1049804850, 1193341470, (TM)this)[TM.lllqkn("odzuie", -1698693401, -517298553, -517298551, -517298545, -1513490327, 1243946080)[0]]))[TM.lllqkn("tldb", -1698693401, -517298553, -517298551, -517298545, 481601071, -1762001137)[1]] == null) {
            return (boolean)TM.lllqkn("hecnj", -1698693406, -517298515, -517298547, -517298537, 1282234732, 1754277345, (UM)this);
        }
        return (boolean)TM.lllqkn("menzy", -1698693405, -517298552, -517298529, -517298537, 1282234732, 1754277345, (Tz)((Tz)((Object)TM.lllqkn("hecnj", -1698693405, -517298546, -517298547, -517298548, 1282234732, 1754277345, (ld)((ld)((Object)TM.lllqkn("hecnj", -1698693407, -517298553, -517298558, -517298559, 791865562, 260605873, (TM)this)[TM.lllqkn("kfhac", -1698693401, -517298553, -517298551, -517298545, -209742320, -206258063)[2]]))))));
    }

    private static /* synthetic */ String i(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-20, 82, 115, -58, 22, 55, -20, 55, -42, -75, 62, -44, 115, -25, 126, -78};
        int n = 0;
        int n2 = 58;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 45;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int i(int n) {
        return Integer.rotateLeft(Integer.rotateLeft(Integer.rotateRight(-n, 19), 9), 30) ^ 0x88882EB2;
    }

    private void b() {
        if (TM.lllqkn("kfhac", -1698693407, -517298553, -517298558, -517298559, -1698693407, -1698693407, (TM)this) == null) {
            TM.lllqkn("hpiwaavb", -1698693408, -517298553, -517298558, -517298559, -1698693408, -1698693408, (TM)this, (Object[])new Object[TM.lllqkn("lhyr", -1698693401, -517298553, -517298543, -517298544, -1698693401, -1698693401)[3]]);
            CallSite callSite = TM.lllqkn("menzy", -1698693407, -517298553, -517298558, -517298559, -1698693407, -1698693407, (TM)this);
        }
    }

    private static void s() {
        M = new String[]{"telly", "mode", "grim", "basic", "auto-jump", "safe-walk"};
        Z = new String[]{"sneak", "none", "save-y", "delay"};
    }

    private static void n() {
        m = new float[]{0.0f, 6.0f, 0.0f, 3.0f, 1.0f};
    }

    public lG m() {
        TM.lllqkn("yiittqlo", -1698693405, -517298553, -517298554, -517298555, 1282234732, 1754277345, (TM)this);
        return (lG)((Object)TM.lllqkn("yiittqlo", -1698693405, -517298539, -517298547, -517298548, 1282234732, 1754277345, (ll)((ll)((Object)TM.lllqkn("wmep", -1698693407, -517298553, -517298558, -517298559, -1242263767, 1954821455, (TM)this)[TM.lllqkn("lhyr", -1698693401, -517298553, -517298538, -517298545, -547438387, -1136776078)[2]]))));
    }

    private static void v() {
        R = new short[]{0, 0, 1, 2, 3, 4, 5};
        u = new short[]{0, 4, 1, 1};
        P = new short[]{3, 0, 2, 0, 4};
        U = new short[]{1, 4, 5, 0};
    }

    private static void j() {
        W = new boolean[]{false, false, true};
        i = new boolean[]{true, false, true, false};
        z = new boolean[]{true, true, false, true, false, false, true, true};
    }

    private static /* synthetic */ String U(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-86, 84, -110, 89, 80, 76, -4, 101, 116, 121, -124, -19, 51, 66, 34, -36};
        int n = 0;
        int n2 = 102;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 175;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String z(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-56, -34, 61, -58, -25, -43, -50, 104, 110, 44, -102, -85, -85, -110, 0, -109};
        int n = 0;
        int n2 = 3;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 165;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-70, 42, 100, 127, 65, -7, -104, 120, 31, -99, 33, -45, 31, 124, -41, -103};
        int n = 0;
        int n2 = 21;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 213;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int u(int n) {
        return -Integer.rotateLeft(-Integer.rotateRight(Integer.rotateLeft(-n ^ 0xAF5BA1E5, 12), 25), 31);
    }

    private boolean y(ih ih2) {
        block6: {
            block5: {
                TM.lllqkn("hecnj", -1698693405, -517298553, -517298554, -517298555, 1282234732, 1754277345, (TM)this);
                if (TM.lllqkn("odzuie", -1698693405, -517298528, -517298538, -517298537, 1282234732, 1754277345, (TU)((TU)((Object)TM.lllqkn("lhyr", -1698693407, -517298553, -517298558, -517298559, -56723395, -1365967782, (TM)this)[TM.lllqkn("menzy", -1698693401, -517298553, -517298560, -517298545, -797793651, -2055804912)[1]]))) == false) break block5;
                if (TM.lllqkn("wmep", -1698693405, -517298541, -517298542, -517298537, 1282234732, 1754277345, (Boolean)((Boolean)((Object)TM.lllqkn("tldb", -1698693405, -517298540, -517298547, -517298548, 1282234732, 1754277345, (lT)((lT)((Object)TM.lllqkn("hzgnspqs", -1698693407, -517298553, -517298558, -517298559, -1423595687, -421964439, (TM)this)[TM.lllqkn("wmep", -1698693401, -517298553, -517298560, -517298545, -1351343754, -1396669672)[2]])))))) == false) break block5;
                if (TM.lllqkn("hecnj", -1698693405, -517298516, -517298533, -517298537, 1282234732, 1754277345, (ih)ih2) == false) break block6;
            }
            return (boolean)TM.lllqkn("lhyr", -1698693401, -517298553, -517298524, -517298532, -1043323168, -121039583)[4];
        }
        if (TM.lllqkn("tldb", -1698693405, -517298516, -517298547, -517298537, 1282234732, 1754277345, (ih)ih2) == false && TM.lllqkn("kfhac", -1698693405, -517298516, -517298529, -517298537, 1282234732, 1754277345, (ih)ih2) == false && TM.lllqkn("kfhac", -1698693405, -517298516, -517298551, -517298537, 1282234732, 1754277345, (ih)ih2) == false && TM.lllqkn("hecnj", -1698693405, -517298516, -517298523, -517298537, 1282234732, 1754277345, (ih)ih2) == false) {
            return (boolean)TM.lllqkn("yiittqlo", -1698693401, -517298553, -517298524, -517298532, -138662564, 1050632465)[5];
        }
        if (TM.lllqkn("kfhac", -1698693405, -517298517, -517298518, -517298537, 1282234732, 1754277345, (NNNwS)((NNNwS)TM.lllqkn("hzgnspqs", -1698693407, -517298513, -517298514, -517298559, -1221416145, 325650970, (NNuU)((NNuU)TM.lllqkn("menzy", -1698693407, -517298553, -517298556, -517298559, -163017204, -1093708909, (TM)this)[TM.lllqkn("odzuie", -1698693401, -517298553, -517298560, -517298545, -281180180, -656775792)[3]]))[TM.lllqkn("hecnj", -1698693401, -517298553, -517298560, -517298545, -737507781, -1715089073)[4]])) != false) {
            TM.lllqkn("yiittqlo", -1698693405, -517298516, -517298547, -517298519, 1282234732, 1754277345, (ih)ih2, (boolean)TM.lllqkn("hecnj", -1698693401, -517298553, -517298524, -517298532, -1721928673, 185004976)[6]);
        }
        return (boolean)TM.lllqkn("odzuie", -1698693401, -517298553, -517298524, -517298532, -167651388, -724893248)[7];
    }

    private static /* synthetic */ int y(int n) {
        return Integer.rotateLeft(Integer.rotateLeft(-Integer.rotateLeft(-Integer.rotateLeft(n, 28) ^ 0x9908F094, 2), 19), 22);
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{99, 98, -25, 28, 52, -124, -84, -119, -37, -107, 44, 38, 57, -85, -38, -98};
        int n = 0;
        int n2 = 133;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 213;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String E(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{77, 31, -23, 91, -50, 45, 5, -51, -42, -117, -70, -62, 75, 32, -62, -50};
        int n = 0;
        int n2 = 132;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 101;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateLeft(Integer.rotateRight(Integer.rotateLeft(-Integer.rotateRight(Integer.rotateLeft(n, 10), 28), 23), 9), 20) ^ 0xDF26589E;
    }

    @uF
    public void N(ih ih2) {
        TM.lllqkn("tldb", -1698693405, -517298553, -517298554, -517298555, 1282234732, 1754277345, (TM)this);
        if (TM.lllqkn("hpiwaavb", -1698693405, -517298553, -517298556, -517298557, 1282234732, 1754277345, (TM)this, (ih)ih2) != false) {
            return;
        }
        TM.lllqkn("lhyr", -1698693405, -517298549, -517298556, -517298550, 1282234732, 1754277345, (ue)((ue)((Object)TM.lllqkn("kfhac", -1698693405, -517298546, -517298547, -517298548, 1282234732, 1754277345, (ld)((ld)((Object)TM.lllqkn("hzgnspqs", -1698693407, -517298553, -517298558, -517298559, -803839797, 48126992, (TM)this)[TM.lllqkn("wmep", -1698693401, -517298553, -517298560, -517298545, -2128732522, 1562172484)[0]]))))), (Object)ih2);
    }

    @uF
    public void N(Ru ru) {
        TM.lllqkn("hecnj", -1698693405, -517298553, -517298554, -517298555, 1282234732, 1754277345, (TM)this);
        TM.lllqkn("yiittqlo", -1698693405, -517298552, -517298558, -517298555, 1282234732, 1754277345, (Tz)((Tz)((Object)TM.lllqkn("hecnj", -1698693405, -517298546, -517298547, -517298548, 1282234732, 1754277345, (ld)((ld)((Object)TM.lllqkn("wmep", -1698693407, -517298553, -517298558, -517298559, 297418250, -1474541265, (TM)this)[TM.lllqkn("hecnj", -1698693401, -517298553, -517298538, -517298545, -1420016345, -992039307)[0]]))))));
    }

    private static /* synthetic */ String R(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{21, -65, -94, -124, -10, 107, 16, -13, 14, 32, 75, 67, 96, 82, -68, 45};
        int n = 0;
        int n2 = 73;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 243;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite lllpm(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = ll0rq[n2 ^ 0xE12AA687];
        int n8 = n7 >>> 16;
        String string2 = TM.lIIOI(Ilpsmip.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0xE12AA687);
        n7 = ll0rq[n3 ^ 0xE12AA687];
        int n9 = n7 >>> 16;
        String string3 = TM.lIIOI(Ilpsmip.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0xE12AA687);
        n7 = ll0rq[n4 ^ 0xE12AA687];
        int n10 = n7 >>> 16;
        String string4 = TM.lIIOI(Ilpsmip.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0xE12AA687);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x9ABFFE55) + -178;
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

    private static /* synthetic */ String lIIOI(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-7, 72, -21, 82, 21, 73, -96, 6, -91, 45, 99, 115, -31, 45, -38, -77};
        byte[] byArray3 = new byte[]{-37, -106, -128, 44, -88, -78, 46, -3, -35, 112, 22, -44, -53, 104, -85, 64};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void IIk0iO(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[47];
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
        Ilpsmip = stringBuilder.toString();
        ll0rq = nArray;
    }

    private static /* synthetic */ CallSite lllqkn(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = ll0rq[n2 ^ 0xE12AA687];
        int n8 = n7 >>> 16;
        String string2 = TM.lIIOI(Ilpsmip.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0xE12AA687);
        n7 = ll0rq[n3 ^ 0xE12AA687];
        int n9 = n7 >>> 16;
        String string3 = TM.lIIOI(Ilpsmip.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0xE12AA687);
        n7 = ll0rq[n4 ^ 0xE12AA687];
        int n10 = n7 >>> 16;
        String string4 = TM.lIIOI(Ilpsmip.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0xE12AA687);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x9ABFFE55) + -178;
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

    private static /* synthetic */ void ntfClinit() {
        Ilpsmip = "wK\n\u00ce.R!\u00d8<\u0085\u00f6bg\u00de;[\u0014\u0001\n\u00ce.R!\u00d8<\u0080\u00f2h\n\u00ce.R!\u00d8<\u0080\u00fa\u00b4\n\u00ce.R!\u00d8<\u00b9\u00d3\u00e3\u00fa\n\u00ce.R!\u00d8<\u0099\u00fb\u00a2\u0002\u00c3\u0010F\u001e\u00e7V\u0081\u00b1\u00f6cig\u009d\u0080\u00fc/\u00a78a\n\u00d2<\u00bf\u00ea\u00e8S<L\u00cc\u00ad\u00c1\n\u00ce.R!\u00d8<\u0080\u00d9\u00a1v\u0019o\u00b1\u009b\u00d8\u000b\u00e5{l#\u008eU\u00c5\u00d2\u00d1~\u0014Q\u00a5\u00a4\u00e7a\u00e48;\u00fcg\u00d2\u0017\n\u00ce.R!\u00d8<\u0080\u00ca\u00d1\n\u00ce.R!\u00d8<\u0080\u00f5\u00c8\u00f7+\u00fc<o\u0000\u00ea!\u00d8\u00a6\u00a8\u0002\u00b9\u00eb\u001d\u00fa\n\u00ce.R!\u00d8<\u00a2\u00d0\u00d4M\u0001\u0096\u0083\u0014\u00a1\u0018K \u00f3i\u00be\u00db\u00f7\u0015;C\u00cc&\u00e5\u00a8\u00fdx\u0002\u00e25v\u0005\u009a\u007f\u008d\u00f0\u00fd\u0015\u0001_\u0085\u00f7M)\u00b3\u00d1\u0002\u00e25v\u0005\u009a\u007f\u008d\u00f0\u00fd\u0015\u001dI\u009d\u0084\u00e9:\u00b3%\f\u00b2\u0002\u00e25v\u0005\u009a\u007f\u008d\u00f0\u00fd\u0015\u001dI\u009d\u00fb\u00f9:\u00b3}V\u00bc\u00b7\f\u00fc\u0002\u00c3\u0010F\u001e\u00e7V\u0081\u00b1\u00f3Ri\u0002\u00ad\u00de\u009f\n\u00ce.R!\u00d8<\u00b8\u00d3q\u0002\u00e25v\u0005\u009af\u0098\u00f7\u00f6\u00154^\u0099\u0099-'\u00e7:/4\u00c7v\u0088\u00f7\u00f9[&N\u00cc\u00d3\u0015\u0005\u00cc\u0012z6\u00f0~\u00c3\u00f2\u00ed\u00010\u0002\u00c3\u0010F\u001e\u00e7V\u0081\u00b1\u00f6cig\u009d\u00a1n/\u00a78a\n\u00d2<\u00bf\u00ea\u00e8S<L\u00cc\u009bT\u0005\u00cc\u0012z6\u00f0~\u00c3\u00f2\u00ec\u0001{g\u00bc\u0084^4\u00da\u0011mK\u00d9w\u00d7\u00be/\u00fe5/\b\u00d4}\u008b\u00b1\u00d8U=G\u0092\u009a\u00ba\u00fc\u0002\u00c3\u0010F\u001e\u00e7V\u0081\u00b1\u00f6cig\u009d\u009b\u00a2/\u00a78a\n\u00d2<\u00bf\u00ea\u00e8S<L\u00cc\u00a0\u00fd\u0002\u00c3\u0010F\u001e\u00e7V\u0081\u00b1\u00f6ni\u00fb\n\u00ce.R!\u00d8<\u00a2\u00d0\u00efo^p!\u00e78e\u0005\u00dbE\u008d\u00f2\u00ef_(g\u00c4>a\u0012\u00d4<\u0080\u00ff\u00f4]}d\u0095je-\u00fcoI\b\u00a7\n\u00ce.R!\u00d8<\u00b8\u00cb\u0010S\n\u00ce.R!\u00d8<\u00b8\u00e4";
        ll0rq = new int[]{18284554, 917505, 720899, 15532033, 17235983, 0x1D00001, 14286867, 0x1040001, 10747906, 1769482, 11730945, 31260692, 0x30000A, 15663125, 0x1160001, 33423370, 8323075, 0xEE0001, 0x11000A, 8519690, 25559057, 30474252, 9830401, 17104898, 12976129, 13041683, 12910593, 983042, 3080193, 9175050, 12845057, 21823545, 26673197, 18939948, 33357825, 12779521, 10682369, 32571394, 3801157, 32702474, 29622284, 1, 2424842, 65546, 10878989, 9895948, 11796495};
        TM.v();
        TM.T();
        TM.j();
        TM.n();
        TM.s();
    }
}
