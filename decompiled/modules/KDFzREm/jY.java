/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NjL
 */
package KDFzREm;

import KDFzREm.MR;
import KDFzREm.NjL;
import KDFzREm.Ru;
import KDFzREm.Ry;
import KDFzREm.UB;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.jd;
import KDFzREm.jk;
import KDFzREm.jw;
import KDFzREm.kW;
import KDFzREm.lY;
import KDFzREm.ld;
import KDFzREm.lv;
import KDFzREm.uF;
import KDFzREm.uc;
import KDFzREm.ue;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;

@UZ(L="TargetEsp", y=UR.VISUAL, N=Uz.WORLD)
public class jY
extends UM {
    public Object[] L;
    private static short[] u;
    private static String[] i;
    private static byte[] R;
    private static short[] M;
    private static int[] B;
    private static boolean[] Z;
    private static boolean[] z;
    private static short[] U;
    private static boolean[] W;
    private static /* synthetic */ String lItnj;
    private static /* synthetic */ int[] IljIpjsi;

    private static /* synthetic */ int L(int n) {
        return -Integer.rotateRight(Integer.rotateLeft(Integer.rotateRight(Integer.rotateLeft(n, 28), 1), 27), 2);
    }

    public static void L(NjL njL) {
        jY.I1s00n("xaqrjhyq", 1316056289, 1141244332, 1141244346, 1141244294, 1316065785, (NjL)njL, (int)jY.I1s00n("wzxndgk", 1316056299, 1141244332, 1141244293, 1141244330, 754532577)[2]);
    }

    private static /* synthetic */ int M(int n) {
        return Integer.rotateRight(Integer.rotateLeft((Integer.rotateRight(Integer.rotateRight(Integer.rotateLeft(-n, 21), 28), 8) ^ 0x47073F61) + 1, 9), 29);
    }

    private static /* synthetic */ String M(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-66, -68, -99, 83, 59, 46, -7, -54, 62, 106, 116, 12, -111, 77, -110, 91};
        int n = 0;
        int n2 = 143;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 217;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    public NjL P() {
        jY.I1s00n("hbfybqv", 1316056303, 1141244332, 1141244326, 1141244327, 1316065785, (jY)this);
        return (NjL)jY.I1s00n("eaazusl", 1316056301, 1141244332, 1141244333, 1141244334, -439871991, (jY)this)[jY.I1s00n("hbfybqv", 1316056299, 1141244332, 1141244299, 1141244321, -396086963)[0]];
    }

    public NjL T() {
        jY.I1s00n("zllxmfh", 1316056303, 1141244332, 1141244326, 1141244327, 1316065785, (jY)this);
        return (NjL)jY.I1s00n("eaazusl", 1316056301, 1141244332, 1141244333, 1141244334, -375504948, (jY)this)[jY.I1s00n("qfwue", 1316056299, 1141244332, 1141244320, 1141244321, 1755784206)[5]];
    }

    public jY() {
        jY.I1s00n("qfwue", 1316056303, 1141244332, 1141244326, 1141244327, 1316056303, (jY)this);
        lv[] lvArray = new ue[jY.I1s00n("xaqrjhyq", 1316056299, 1141244332, 1141244335, 1141244328, 1316056299)[0]];
        lvArray[jY.I1s00n("xaqrjhyq", 1316056299, 1141244332, 1141244288, 1141244330, 1316056299)[0]] = new jk(this, (String)((Object)jY.I1s00n("zllxmfh", 1316056299, 1141244332, 1141244296, 1141244295, 1316056299)[1]), (boolean)jY.I1s00n("hbfybqv", 1316056299, 1141244332, 1141244288, 1141244330, 1316056299)[1]);
        lvArray[jY.I1s00n("zllxmfh", 1316056299, 1141244332, 1141244288, 1141244330, 1316056299)[2]] = new jd(this, (String)((Object)jY.I1s00n("wzxndgk", 1316056299, 1141244332, 1141244296, 1141244295, 1316056299)[2]), (boolean)jY.I1s00n("qfwue", 1316056299, 1141244332, 1141244293, 1141244330, 1316056299)[0]);
        lvArray[jY.I1s00n("eaazusl", 1316056299, 1141244332, 1141244335, 1141244328, 1316056299)[1]] = new jw(this, (String)((Object)jY.I1s00n("zllxmfh", 1316056299, 1141244332, 1141244296, 1141244295, 1316056299)[3]), (boolean)jY.I1s00n("wzxndgk", 1316056299, 1141244332, 1141244293, 1141244330, 1316056299)[1]);
        CallSite callSite = jY.I1s00n("wzxndgk", 1316056289, 1141244289, 1141244346, 1141244290, 1316056289, (lY)this, (String)((Object)jY.I1s00n("qfwue", 1316056299, 1141244332, 1141244296, 1141244295, 1316056299)[0]), (lv[])lvArray);
        jY.I1s00n("wzxndgk", 1316056301, 1141244332, 1141244333, 1141244334, 1316056301, (jY)this)[jY.I1s00n("tnkufn", 1316056299, 1141244332, 1141244351, 1141244321, 1316056299)[0]] = callSite;
        CallSite callSite2 = jY.I1s00n("xaqrjhyq", 1316056289, 1141244289, 1141244346, 1141244317, 1316056289, (lY)this, (String)((Object)jY.I1s00n("qfwue", 1316056299, 1141244332, 1141244296, 1141244295, 1316056299)[4]), (int)jY.I1s00n("qfwue", 1316056299, 1141244332, 1141244291, 1141244316, 1316056299)[0]);
        jY.I1s00n("xaqrjhyq", 1316056301, 1141244332, 1141244333, 1141244334, 1316056301, (jY)this)[jY.I1s00n("eaazusl", 1316056299, 1141244332, 1141244351, 1141244321, 1316056299)[1]] = callSite2;
        jY.I1s00n("xaqrjhyq", 1316056303, 1141244339, 1141244346, 1141244318, 1316056303, (uc)((Object)jY.I1s00n("zllxmfh", 1316056289, 1141244322, 1141244333, 1141244336, 1316056289)), Ru.class, ru -> {
            jY.I1s00n("eaazusl", 1316056303, 1141244332, 1141244326, 1141244327, 1316065785, (jY)this);
            if (jY.I1s00n("wzxndgk", 1316056303, 1141244331, 1141244292, 1141244342, 1316065785, (Integer)((Object)jY.I1s00n("wzxndgk", 1316056301, 1141244332, 1141244333, 1141244334, 217177200, (jY)this)[jY.I1s00n("bmuhfiko", 1316056299, 1141244332, 1141244299, 1141244321, -1756089804)[3]])) < jY.I1s00n("bmuhfiko", 1316056303, 1141244341, 1141244344, 1141244342, 1316065785, (kW)((Object)jY.I1s00n("wzxndgk", 1316056289, 1141244322, 1141244347, 1141244340, 1316065785))) - jY.I1s00n("wzxndgk", 1316056303, 1141244331, 1141244292, 1141244342, 1316065785, (Integer)((Object)jY.I1s00n("hbfybqv", 1316056301, 1141244332, 1141244333, 1141244334, -647865708, (jY)this)[jY.I1s00n("hbfybqv", 1316056299, 1141244332, 1141244299, 1141244321, 2065304175)[4]]))) {
                NjL njL = (NjL)jY.I1s00n("wzxndgk", 1316056301, 1141244332, 1141244333, 1141244334, 21936808, (jY)this)[jY.I1s00n("bmuhfiko", 1316056299, 1141244332, 1141244299, 1141244321, -1145079639)[5]];
                jY.I1s00n("bmuhfiko", 1316056303, 1141244332, 1141244344, 1141244345, 1316065785, (jY)this, null);
                if (njL != null) {
                    jY.I1s00n("eaazusl", 1316056303, 1141244339, 1141244333, 1141244300, 1316065785, (uc)((Object)jY.I1s00n("hbfybqv", 1316056289, 1141244322, 1141244333, 1141244336, 1316065785)), (Object)jY.I1s00n("eaazusl", 1316056289, 1141244337, 1141244346, 1141244338, 1316065785, (NjL)njL, null));
                }
            }
        });
    }

    static {
        jY.ntfClinit();
    }

    private static /* synthetic */ String i(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-109, 62, -109, -63, -109, 125, 64, -104, -55, -48, 63, -117, 12, -55, -127, -88};
        int n = 0;
        int n2 = 22;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 155;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int i(int n) {
        return Integer.rotateLeft(-n ^ 0x6A9BF1CC, 25) ^ 0xE564D784;
    }

    private void b() {
        if (jY.I1s00n("xaqrjhyq", 1316056301, 1141244332, 1141244333, 1141244334, 1316056301, (jY)this) == null) {
            jY.I1s00n("tnkufn", 1316056300, 1141244332, 1141244333, 1141244334, 1316056300, (jY)this, (Object[])new Object[jY.I1s00n("hbfybqv", 1316056299, 1141244332, 1141244335, 1141244328, 1316056299)[2]]);
            CallSite callSite = jY.I1s00n("zllxmfh", 1316056301, 1141244332, 1141244333, 1141244334, 1316056301, (jY)this);
            callSite[jY.I1s00n("hbfybqv", 1316056299, 1141244332, 1141244335, 1141244328, 1316056299)[3]] = jY.I1s00n("hbfybqv", 1316056289, 1141244331, 1141244324, 1141244325, 1316056289, (int)jY.I1s00n("hbfybqv", 1316056299, 1141244332, 1141244329, 1141244330, 1316056299)[4]);
            callSite[jY.I1s00n("bmuhfiko", 1316056299, 1141244332, 1141244335, 1141244328, 1316056299)[4]] = jY.I1s00n("qfwue", 1316056289, 1141244331, 1141244324, 1141244325, 1316056289, (int)jY.I1s00n("eaazusl", 1316056299, 1141244332, 1141244329, 1141244330, 1316056299)[5]);
        }
    }

    public boolean s() {
        jY.I1s00n("bmuhfiko", 1316056303, 1141244332, 1141244326, 1141244327, 1316065785, (jY)this);
        return (boolean)((NjL)jY.I1s00n("tnkufn", 1316056301, 1141244332, 1141244333, 1141244334, 1134899758, (jY)this)[jY.I1s00n("eaazusl", 1316056299, 1141244332, 1141244320, 1141244321, -1878338191)[3]] != null ? jY.I1s00n("wzxndgk", 1316056299, 1141244332, 1141244329, 1141244330, -84751934)[2] : jY.I1s00n("hbfybqv", 1316056299, 1141244332, 1141244329, 1141244330, -376065221)[3]);
    }

    private static void n() {
        z = new boolean[]{false, false, true};
        Z = new boolean[]{false, true, true};
        W = new boolean[]{true, false, true, false, false, false};
    }

    public boolean m() {
        jY.I1s00n("zllxmfh", 1316056303, 1141244332, 1141244326, 1141244327, 1316065785, (jY)this);
        return (boolean)((NjL)jY.I1s00n("zllxmfh", 1316056301, 1141244332, 1141244333, 1141244334, 1794227646, (jY)this)[jY.I1s00n("bmuhfiko", 1316056299, 1141244332, 1141244320, 1141244321, 2078803228)[2]] != null ? jY.I1s00n("wzxndgk", 1316056299, 1141244332, 1141244329, 1141244330, 163925481)[0] : jY.I1s00n("tnkufn", 1316056299, 1141244332, 1141244329, 1141244330, 1513671635)[1]);
    }

    private static void t() {
        i = new String[]{"mode", "square", "jello", "scan", "color"};
    }

    private static void v() {
        B = new int[]{-11104513};
    }

    private static void j() {
        M = new short[]{4, 5, 1};
        u = new short[]{4, 4, 1, 0, 0, 0, 1};
        U = new short[]{1, 2, 3, 2, 3, 1};
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{73, 13, -38, 124, 72, -52, -22, 57, -64, 46, 102, -13, -65, 4, -66, -9};
        int n = 0;
        int n2 = 219;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 255;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int u(int n) {
        return -Integer.rotateLeft(Integer.rotateLeft((n ^ 0x366943FD) + 1, 9) ^ 0x420313A8, 1) ^ 0x905DF9C0;
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-49, -107, 40, -55, -114, 29, 92, 62, -117, 99, -12, -78, 80, -79, -114, 125};
        int n = 0;
        int n2 = 181;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            ++n2;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    public void y(NjL njL) {
        jY.I1s00n("wzxndgk", 1316056303, 1141244332, 1141244326, 1141244327, 1316065785, (jY)this);
        NjL njL2 = njL;
        jY.I1s00n("qfwue", 1316056301, 1141244332, 1141244333, 1141244334, 1215630438, (jY)this)[jY.I1s00n("hbfybqv", 1316056299, 1141244332, 1141244320, 1141244321, -289872826)[6]] = njL2;
    }

    public void y(int n) {
        jY.I1s00n("xaqrjhyq", 1316056303, 1141244332, 1141244326, 1141244327, 1316065785, (jY)this);
        CallSite callSite = jY.I1s00n("tnkufn", 1316056289, 1141244331, 1141244324, 1141244325, 1316065785, n);
        jY.I1s00n("xaqrjhyq", 1316056301, 1141244332, 1141244333, 1141244334, -1492378503, (jY)this)[jY.I1s00n("xaqrjhyq", 1316056299, 1141244332, 1141244299, 1141244321, -1157744758)[1]] = callSite;
    }

    public void N(NjL njL) {
        jY.I1s00n("eaazusl", 1316056303, 1141244332, 1141244326, 1141244327, 1316065785, (jY)this);
        NjL njL2 = njL;
        jY.I1s00n("hbfybqv", 1316056301, 1141244332, 1141244333, 1141244334, 471922314, (jY)this)[jY.I1s00n("zllxmfh", 1316056299, 1141244332, 1141244320, 1141244321, -411712161)[4]] = njL2;
    }

    public void N(int n) {
        jY.I1s00n("hbfybqv", 1316056303, 1141244332, 1141244326, 1141244327, 1316065785, (jY)this);
        CallSite callSite = jY.I1s00n("bmuhfiko", 1316056289, 1141244331, 1141244324, 1141244325, 1316065785, n);
        jY.I1s00n("bmuhfiko", 1316056301, 1141244332, 1141244333, 1141244334, 138264244, (jY)this)[jY.I1s00n("hbfybqv", 1316056299, 1141244332, 1141244299, 1141244321, 1285328911)[2]] = callSite;
    }

    public static void N(NjL njL, int n) {
        CallSite callSite = jY.I1s00n("eaazusl", 1316056303, 1141244348, 1141244349, 1141244350, 1316065785, (UB)((Object)jY.I1s00n("wzxndgk", 1316056289, 1141244322, 1141244320, 1141244323, 1316065785)));
        NjL njL2 = (NjL)jY.I1s00n("xaqrjhyq", 1316056301, 1141244332, 1141244333, 1141244334, 2065218268, (jY)((Object)callSite))[jY.I1s00n("xaqrjhyq", 1316056299, 1141244332, 1141244351, 1141244321, 1359742439)[2]];
        jY.I1s00n("tnkufn", 1316056303, 1141244332, 1141244344, 1141244345, 1316065785, (jY)((Object)callSite), (NjL)njL);
        if (njL != null) {
            jY.I1s00n("tnkufn", 1316056303, 1141244332, 1141244346, 1141244345, 1316065785, (jY)((Object)callSite), (NjL)njL);
        }
        jY.I1s00n("hbfybqv", 1316056303, 1141244332, 1141244344, 1141244343, 1316065785, (jY)((Object)callSite), (int)jY.I1s00n("bmuhfiko", 1316056303, 1141244341, 1141244344, 1141244342, 1316065785, (kW)((Object)jY.I1s00n("zllxmfh", 1316056289, 1141244322, 1141244347, 1141244340, 1316065785))));
        jY.I1s00n("qfwue", 1316056303, 1141244332, 1141244346, 1141244343, 1316065785, (jY)((Object)callSite), n);
        if (njL2 != njL) {
            jY.I1s00n("bmuhfiko", 1316056303, 1141244339, 1141244333, 1141244300, 1316065785, (uc)((Object)jY.I1s00n("hbfybqv", 1316056289, 1141244322, 1141244333, 1141244336, 1316065785)), (Object)jY.I1s00n("qfwue", 1316056289, 1141244337, 1141244346, 1141244338, 1316065785, (NjL)njL2, (NjL)njL));
        }
    }

    @uF
    public void N(Ry ry) {
        jY.I1s00n("qfwue", 1316056303, 1141244332, 1141244326, 1141244327, 1316065785, (jY)this);
        if (jY.I1s00n("tnkufn", 1316056303, 1141244332, 1141244301, 1141244302, 1316065785, (jY)this) != false) {
            jY.I1s00n("bmuhfiko", 1316056303, 1141244298, 1141244344, 1141244300, 1316065785, (ue)((ue)((Object)jY.I1s00n("tnkufn", 1316056303, 1141244303, 1141244296, 1141244297, 1316065785, (ld)((ld)((Object)jY.I1s00n("hbfybqv", 1316056301, 1141244332, 1141244333, 1141244334, 227667327, (jY)this)[jY.I1s00n("tnkufn", 1316056299, 1141244332, 1141244320, 1141244321, -1772325684)[1]]))))), (Object)ry);
        }
    }

    @uF
    public void N(MR mR) {
        jY.I1s00n("hbfybqv", 1316056303, 1141244332, 1141244326, 1141244327, 1316065785, (jY)this);
        if (jY.I1s00n("zllxmfh", 1316056303, 1141244332, 1141244301, 1141244302, 1316065785, (jY)this) != false) {
            jY.I1s00n("wzxndgk", 1316056303, 1141244298, 1141244344, 1141244300, 1316065785, (ue)((ue)((Object)jY.I1s00n("zllxmfh", 1316056303, 1141244303, 1141244296, 1141244297, 1316065785, (ld)((ld)((Object)jY.I1s00n("zllxmfh", 1316056301, 1141244332, 1141244333, 1141244334, 774554907, (jY)this)[jY.I1s00n("eaazusl", 1316056299, 1141244332, 1141244320, 1141244321, -2115087968)[0]]))))), (Object)mR);
        }
    }

    private static /* synthetic */ int R(int n) {
        return Integer.rotateRight(-Integer.rotateRight(Integer.rotateRight(Integer.rotateLeft(Integer.rotateLeft(n, 9), 22), 6), 23), 8);
    }

    private static /* synthetic */ String R(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{74, -46, -74, -72, 53, -99, 108, 74, -110, -75, -80, -11, -101, -10, -103, 77};
        int n = 0;
        int n2 = 212;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 151;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void G() {
        R = new byte[]{3, 2, 6, 2, 3};
    }

    private static /* synthetic */ void ntfClinit() {
        lItnj = "T\u00afx\u0001\u001f\u0014\u000bS\u00ed\u00a8\u00ac\u007fi\u0003\u00f84|\u00b7(0;5\u007f!H\u00d1\u008a\u00ee\u0019R5\u00a6s]1\u0004i\"_\u00ac\u00ba\u00e6\u0013P^(\u00b50;5\u007f!H\u00d1\u008a\u00ee\u0019m.\u00a6\u00e5U<:}\u001d`\u00c6\u00a2\u00acZ^L\u00d19\u008d\u00bbxX\u0012Z\tU\u00ac\u009c\u00f7Dn\u0019\u00fah\u00b7\u0081R38A5w\u00ee\u00e0\u00ef@<^\u00d1\u0018\u00a8\u008bc%;VH^\u00e7\u00f4\u00ae'\u00b4U<:}\u001d`\u00c6\u00a2\u00acxm;\u00a6zVv\u00b5U\u001d\u001fM\u0006\u001d\u00ef\u00ae\u00edQ(4\u00f12\r\u00ee\";5\u007f!H\u00d1\u008a\u00ee\u0019r\u000f\u00a6z(\u0018K\u0082U<:}\u001d`\u00c6\u00a2\u00acxm;\u00a6\u001a`\u00fc\u00930;5\u007f!H\u00d1\u008a\u00ee\u0019l \u00a6|U<:}\u001d`\u00c6\u00a2\u00acZ^L\u00d19\u000e\"xX\u0012Z\tU\u00ac\u009c\u00f7Dn\u0019\u00fah&}U<:}\u001d`\u00c6\u00a2\u00acZeL\u00af~\u00cbB\u00b50-\u00fc0;5\u007f!H\u00d1\u008a\u00ee\u0019r\u0014\u00a6\u008fP\u00e5U<:}\u001d`\u00c6\u00a2\u00acxm;\u00a6\u001f\u00a7\u0089_\r,~\n\u001d\u00cd\u00a5\u00cf\r.;\u00d6\u0017\u00aa\u00b7K2\u0013\u0014\u000ee\u00b8\u00b40;\u0014Z\u0011S\u00ac\u00a3\u00e2X`X\u00d21j\u00f9z\u0003E\u00c8n\u00cdx\u001b\u000b^(T\u009f]1\u0004i\"_\u00ac\u009a\u00c1K]1\u0004i\"_\u00ac\u00ba\u00e0\u00d2w\u0003(Z\u000bG\u00e6&P%]1\u0004i\"_\u00ac\u00a3\u00e8R]1\u0004i\"_\u00ac\u00a3\u00e7\u00130!\u009f]1\u0004i\"_\u00ac\u00a5\u00da\u0090\u00820>\u00c6U\u001d\u001fM\u0006\u001d\u00ef\u00ae\u00edQ(8\u00ff9\u001b\u00femL\u00fcU\u001d\u001fM\u0006\u001d\u00ef\u00ae\u00edQ(8\u00ff9\n\u00b7mLWm\"P^2Q\u0006D\u00e2\u00e0\u00efWi\u0010\u00b2\u001an~|\u0010\u001bI\\A]1\u0004i\"_\u00ac\u00a4\u00d4\\[\u0086]1\u0004i\"_\u00ac\u00b6cC\u00a15J`U\u001d\u001fM\u0006\u001d\u00ef\u00ae\u00edQ($\u00e9! U~L%]1\u0004i\"_\u00ac\u00a6\u00d4";
        IljIpjsi = new int[]{25624586, 11010049, 26542099, 11075585, 31260674, 16252929, 31981570, 65553, 21692423, 29163542, 21561345, 25427971, 32112641, 32178178, 31391753, 1179662, 22151178, 23986177, 0x2E000E, 1, 16187393, 0x770010, 8847361, 16121857, 0xBB000E, 30605322, 26345475, 2752516, 16580622, 0x200000A, 17629224, 22806538, 27787285, 7733249, 16384003, 24772618, 21626881, 20250644, 0x20000A, 0x1910001, 23461896, 24051713, 0xAA0011, 32309267, 7667713, 24117258, 3932217, 16318465, 17498114, 13172781, 0x880020};
        jY.j();
        jY.G();
        jY.v();
        jY.n();
        jY.t();
    }

    private static /* synthetic */ void lIiIOnI(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[51];
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
        lItnj = stringBuilder.toString();
        IljIpjsi = nArray;
    }

    private static /* synthetic */ CallSite I1s00n(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = IljIpjsi[n2 ^ 0x440601AC];
        int n7 = n6 >>> 16;
        String string2 = jY.OOtmr0m0p(lItnj.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0x440601AC);
        n6 = IljIpjsi[n3 ^ 0x440601AC];
        int n8 = n6 >>> 16;
        String string3 = jY.OOtmr0m0p(lItnj.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0x440601AC);
        n6 = IljIpjsi[n4 ^ 0x440601AC];
        int n9 = n6 >>> 16;
        String string4 = jY.OOtmr0m0p(lItnj.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0x440601AC);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x4E716C59) + -178;
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

    private static /* synthetic */ String OOtmr0m0p(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{33, -20, 79, -11, 26, -117, 43, -102, -28, 25, -67, 38, 56, -68, 117, -11};
        byte[] byArray3 = new byte[]{-65, -128, -46, -58, -36, -10, 3, 48, 110, 24, -9, 37, -102, -45, 99, 42};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite oosliiqs(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) throws Exception {
        int n9 = IljIpjsi[n2 ^ 0x440601AC];
        int n10 = n9 >>> 16;
        String string2 = jY.OOtmr0m0p(lItnj.substring(n10, n10 + (n9 & 0xFFFF)), n2 ^ 0x440601AC);
        n9 = IljIpjsi[n3 ^ 0x440601AC];
        int n11 = n9 >>> 16;
        String string3 = jY.OOtmr0m0p(lItnj.substring(n11, n11 + (n9 & 0xFFFF)), n3 ^ 0x440601AC);
        n9 = IljIpjsi[n4 ^ 0x440601AC];
        int n12 = n9 >>> 16;
        String string4 = jY.OOtmr0m0p(lItnj.substring(n12, n12 + (n9 & 0xFFFF)), n4 ^ 0x440601AC);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x4E716C59) + -178;
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
}
