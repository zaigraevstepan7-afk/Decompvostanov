/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NNIo
 *  KDFzREm.NNNwS
 *  KDFzREm.NNuU
 */
package KDFzREm;

import KDFzREm.My;
import KDFzREm.NNIo;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.Rf;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.jj;
import KDFzREm.jl;
import KDFzREm.jn;
import KDFzREm.jt;
import KDFzREm.jv;
import KDFzREm.lQ;
import KDFzREm.lT;
import KDFzREm.lY;
import KDFzREm.ld;
import KDFzREm.lv;
import KDFzREm.uF;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;

@UZ(L="SwingAnimations", y=UR.VISUAL, N=Uz.WORLD)
public class jG
extends UM {
    private static short[] i;
    private static byte[] R;
    private static float[] M;
    private static boolean[] B;
    private static short[] Z;
    public Object[] L;
    private static short[] z;
    private static float[] U;
    private static short[] W;
    private static short[] m;
    private static String[] P;
    private static short[] s;
    private static short[] T;
    private static float[] b;
    private static String[] j;
    public Object[] u;
    private static boolean[] v;
    private static /* synthetic */ String llkmq0nII;
    private static /* synthetic */ int[] Ilmtm;

    private static /* synthetic */ int L(int n) {
        return -Integer.rotateLeft(Integer.rotateRight(Integer.rotateRight(-Integer.rotateRight(n, 4), 14), 15) ^ 0xE963A4AE, 18);
    }

    private static /* synthetic */ String M(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-30, -61, 73, -49, -101, -85, 103, -49, 126, 123, 9, 74, 24, -85, 88, 22};
        int n = 0;
        int n2 = 123;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 47;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void P() {
        M = new float[]{8.0f, 1.0f};
        b = new float[]{10.0f, 1.0f, 8.0f, 3.0f, 10.0f, 1.0f, 1.5707964f, 2.0f};
        U = new float[]{10.0f};
    }

    private static void T() {
        R = new byte[]{4, 2, 3, -1, 7, 2};
    }

    public jG() {
        jG.lOtsm("jpxr", -492064567, -1142416380, -1142416379, -1142416378, -492064567, (jG)this);
        jj jj2 = new jj(this, (String)((Object)jG.lOtsm("yicnt", -492064563, -1142416380, -1142416358, -1142416357, -492064563)[0]), (boolean)jG.lOtsm("ctluut", -492064563, -1142416380, -1142416348, -1142416347, -492064563)[0]);
        jG.lOtsm("ywlalso", -492064565, -1142416380, -1142416377, -1142416384, -492064565, (jG)this)[jG.lOtsm("ywlalso", -492064563, -1142416380, -1142416346, -1142416382, -492064563)[0]] = jj2;
        jv jv2 = new jv(this, (String)((Object)jG.lOtsm("ctluut", -492064563, -1142416380, -1142416358, -1142416357, -492064563)[1]), (boolean)jG.lOtsm("jpxr", -492064563, -1142416380, -1142416348, -1142416347, -492064563)[1]);
        jG.lOtsm("apahoe", -492064565, -1142416380, -1142416377, -1142416384, -492064565, (jG)this)[jG.lOtsm("ctluut", -492064563, -1142416380, -1142416346, -1142416382, -492064563)[1]] = jv2;
        jn jn2 = new jn(this, (String)((Object)jG.lOtsm("wolv", -492064563, -1142416380, -1142416345, -1142416357, -492064563)[0]), (boolean)jG.lOtsm("apahoe", -492064563, -1142416380, -1142416348, -1142416347, -492064563)[2]);
        jG.lOtsm("ctluut", -492064565, -1142416380, -1142416377, -1142416384, -492064565, (jG)this)[jG.lOtsm("ywlalso", -492064563, -1142416380, -1142416346, -1142416382, -492064563)[2]] = jn2;
        jt jt2 = new jt(this, (String)((Object)jG.lOtsm("ywlalso", -492064563, -1142416380, -1142416345, -1142416357, -492064563)[1]), (boolean)jG.lOtsm("ctluut", -492064563, -1142416380, -1142416348, -1142416347, -492064563)[3]);
        jG.lOtsm("yicnt", -492064565, -1142416380, -1142416377, -1142416384, -492064565, (jG)this)[jG.lOtsm("hwfimubo", -492064563, -1142416380, -1142416346, -1142416382, -492064563)[3]] = jt2;
        lv[] lvArray = new jl[jG.lOtsm("hwfimubo", -492064563, -1142416380, -1142416369, -1142416376, -492064563)[0]];
        lvArray[jG.lOtsm("ywlalso", -492064563, -1142416380, -1142416348, -1142416347, -492064563)[4]] = (jj)((Object)jG.lOtsm("apahoe", -492064565, -1142416380, -1142416377, -1142416384, -492064565, (jG)this)[jG.lOtsm("jpxr", -492064563, -1142416380, -1142416352, -1142416382, -492064563)[0]]);
        lvArray[jG.lOtsm("hwfimubo", -492064563, -1142416380, -1142416348, -1142416347, -492064563)[5]] = (jv)((Object)jG.lOtsm("apahoe", -492064565, -1142416380, -1142416377, -1142416384, -492064565, (jG)this)[jG.lOtsm("pzpra", -492064563, -1142416380, -1142416352, -1142416382, -492064563)[1]]);
        lvArray[jG.lOtsm("apahoe", -492064563, -1142416380, -1142416369, -1142416376, -492064563)[1]] = (jn)((Object)jG.lOtsm("xmdzpnj", -492064565, -1142416380, -1142416377, -1142416384, -492064565, (jG)this)[jG.lOtsm("hwfimubo", -492064563, -1142416380, -1142416352, -1142416382, -492064563)[2]]);
        lvArray[jG.lOtsm("apahoe", -492064563, -1142416380, -1142416369, -1142416376, -492064563)[2]] = (jt)((Object)jG.lOtsm("jpxr", -492064565, -1142416380, -1142416377, -1142416384, -492064565, (jG)this)[jG.lOtsm("hwfimubo", -492064563, -1142416380, -1142416351, -1142416382, -492064563)[0]]);
        CallSite callSite = jG.lOtsm("ctluut", -492064569, -1142416350, -1142416364, -1142416349, -492064569, (lY)this, (String)((Object)jG.lOtsm("pzpra", -492064563, -1142416380, -1142416345, -1142416357, -492064563)[2]), (lv[])lvArray);
        jG.lOtsm("hwfimubo", -492064565, -1142416380, -1142416377, -1142416384, -492064565, (jG)this)[jG.lOtsm("ywlalso", -492064563, -1142416380, -1142416351, -1142416382, -492064563)[1]] = callSite;
        lQ lQ2 = (lQ)((Object)jG.lOtsm("ctluut", -492064567, -1142416356, -1142416364, -1142416337, -492064567, (lQ)((Object)jG.lOtsm("jpxr", -492064569, -1142416350, -1142416364, -1142416338, -492064569, (lY)this, (String)((Object)jG.lOtsm("wolv", -492064563, -1142416380, -1142416345, -1142416357, -492064563)[3]), (float)jG.lOtsm("apahoe", -492064563, -1142416380, -1142416340, -1142416339, -492064563)[0], (float)jG.lOtsm("jpxr", -492064563, -1142416380, -1142416340, -1142416339, -492064563)[1], (float)jG.lOtsm("xmdzpnj", -492064563, -1142416380, -1142416379, -1142416339, -492064563)[0], (float)jG.lOtsm("hwfimubo", -492064563, -1142416380, -1142416379, -1142416339, -492064563)[1])), lw2 -> {
            jG.lOtsm("ywlalso", -492064567, -1142416380, -1142416379, -1142416378, 1672107980, (jG)this);
            return (boolean)jG.lOtsm("wolv", -492064567, -1142416373, -1142416364, -1142416371, 1672107980, (jl)((jl)((Object)jG.lOtsm("xmdzpnj", -492064567, -1142416375, -1142416383, -1142416374, 1672107980, (ld)((ld)((Object)jG.lOtsm("apahoe", -492064565, -1142416380, -1142416377, -1142416384, -1118375119, (jG)this)[jG.lOtsm("apahoe", -492064563, -1142416380, -1142416383, -1142416382, -1530793120)[3]]))))));
        }));
        jG.lOtsm("yicnt", -492064565, -1142416380, -1142416377, -1142416384, -492064565, (jG)this)[jG.lOtsm("apahoe", -492064563, -1142416380, -1142416351, -1142416382, -492064563)[2]] = lQ2;
        lQ lQ3 = (lQ)((Object)jG.lOtsm("ywlalso", -492064567, -1142416356, -1142416364, -1142416337, -492064567, (lQ)((Object)jG.lOtsm("yicnt", -492064569, -1142416350, -1142416364, -1142416338, -492064569, (lY)this, (String)((Object)jG.lOtsm("ctluut", -492064563, -1142416380, -1142416345, -1142416357, -492064563)[4]), (float)jG.lOtsm("ctluut", -492064563, -1142416380, -1142416379, -1142416339, -492064563)[2], (float)jG.lOtsm("yicnt", -492064563, -1142416380, -1142416379, -1142416339, -492064563)[3], (float)jG.lOtsm("apahoe", -492064563, -1142416380, -1142416379, -1142416339, -492064563)[4], (float)jG.lOtsm("pzpra", -492064563, -1142416380, -1142416379, -1142416339, -492064563)[5])), lw2 -> {
            jG.lOtsm("jpxr", -492064567, -1142416380, -1142416379, -1142416378, 1672107980, (jG)this);
            return (boolean)jG.lOtsm("hwfimubo", -492064567, -1142416373, -1142416377, -1142416371, 1672107980, (jl)((jl)((Object)jG.lOtsm("jpxr", -492064567, -1142416375, -1142416383, -1142416374, 1672107980, (ld)((ld)((Object)jG.lOtsm("wolv", -492064565, -1142416380, -1142416377, -1142416384, -1066418367, (jG)this)[jG.lOtsm("apahoe", -492064563, -1142416380, -1142416383, -1142416382, 2020039237)[2]]))))));
        }));
        jG.lOtsm("yicnt", -492064565, -1142416380, -1142416377, -1142416384, -492064565, (jG)this)[jG.lOtsm("jpxr", -492064563, -1142416380, -1142416344, -1142416382, -492064563)[0]] = lQ3;
        lT lT2 = (lT)((Object)jG.lOtsm("xmdzpnj", -492064567, -1142416362, -1142416364, -1142416337, -492064567, (lT)((Object)jG.lOtsm("ctluut", -492064569, -1142416350, -1142416364, -1142416343, -492064569, (lY)this, (String)((Object)jG.lOtsm("xmdzpnj", -492064563, -1142416380, -1142416345, -1142416357, -492064563)[5]), (boolean)jG.lOtsm("wolv", -492064563, -1142416380, -1142416348, -1142416347, -492064563)[6])), lw2 -> {
            jG.lOtsm("yicnt", -492064567, -1142416380, -1142416379, -1142416378, 1672107980, (jG)this);
            return (boolean)jG.lOtsm("yicnt", -492064567, -1142416381, -1142416372, -1142416371, 1672107980, (jv)((jv)((Object)jG.lOtsm("ywlalso", -492064565, -1142416380, -1142416377, -1142416384, -506163877, (jG)this)[jG.lOtsm("apahoe", -492064563, -1142416380, -1142416383, -1142416382, -2067697278)[1]])));
        }));
        jG.lOtsm("apahoe", -492064565, -1142416380, -1142416370, -1142416384, -492064565, (jG)this)[jG.lOtsm("pzpra", -492064563, -1142416380, -1142416344, -1142416382, -492064563)[1]] = lT2;
        CallSite callSite2 = jG.lOtsm("xmdzpnj", -492064569, -1142416350, -1142416364, -1142416343, -492064569, (lY)this, (String)((Object)jG.lOtsm("yicnt", -492064563, -1142416380, -1142416345, -1142416357, -492064563)[6]), (boolean)jG.lOtsm("yicnt", -492064563, -1142416380, -1142416348, -1142416347, -492064563)[7]);
        jG.lOtsm("yicnt", -492064565, -1142416380, -1142416370, -1142416384, -492064565, (jG)this)[jG.lOtsm("apahoe", -492064563, -1142416380, -1142416363, -1142416382, -492064563)[0]] = callSite2;
    }

    static {
        jG.ntfClinit();
    }

    private static /* synthetic */ String B(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-8, -1, 41, 111, -3, 66, 30, -102, 90, -89, -3, -93, -70, 120, -41, 33};
        int n = 0;
        int n2 = 243;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 149;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String Z(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{86, 88, 77, 110, -69, -6, 12, 115, 75, 125, -85, -112, -80, 29, 94, 119};
        int n = 0;
        int n2 = 136;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 125;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String i(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-15, 13, 40, -55, 88, 99, -22, -17, 29, 1, 38, 49, 97, 56, 44, -32};
        int n = 0;
        int n2 = 247;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 99;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int i(int n) {
        return Integer.rotateRight(Integer.rotateLeft(Integer.rotateLeft(-n ^ 0x6BC75CF8, 25), 4), 1) ^ 0x9BE18835;
    }

    private void b() {
        CallSite callSite;
        if (jG.lOtsm("ywlalso", -492064565, -1142416380, -1142416377, -1142416384, -492064565, (jG)this) == null) {
            jG.lOtsm("wolv", -492064566, -1142416380, -1142416377, -1142416384, -492064566, (jG)this, (Object[])new Object[jG.lOtsm("xmdzpnj", -492064563, -1142416380, -1142416369, -1142416376, -492064563)[4]]);
            callSite = jG.lOtsm("jpxr", -492064565, -1142416380, -1142416377, -1142416384, -492064565, (jG)this);
        }
        if (jG.lOtsm("ywlalso", -492064565, -1142416380, -1142416370, -1142416384, -492064565, (jG)this) == null) {
            jG.lOtsm("ywlalso", -492064566, -1142416380, -1142416370, -1142416384, -492064566, (jG)this, (Object[])new Object[jG.lOtsm("xmdzpnj", -492064563, -1142416380, -1142416369, -1142416376, -492064563)[5]]);
            callSite = jG.lOtsm("pzpra", -492064565, -1142416380, -1142416370, -1142416384, -492064565, (jG)this);
        }
    }

    private static void s() {
        T = new short[]{0, 1, 2, 3};
        Z = new short[]{0, 1, 2};
        W = new short[]{3, 4, 5};
        m = new short[]{6, 0};
        s = new short[]{1, 1, 6, 1};
        z = new short[]{0, 4, 4, 6, 5};
        i = new short[]{0, 1, 4, 4};
    }

    public lT m() {
        jG.lOtsm("hwfimubo", -492064567, -1142416380, -1142416379, -1142416378, 1672107980, (jG)this);
        return (lT)((Object)jG.lOtsm("yicnt", -492064565, -1142416380, -1142416370, -1142416384, 951473336, (jG)this)[jG.lOtsm("ctluut", -492064563, -1142416380, -1142416383, -1142416382, 2068746922)[0]]);
    }

    private static void v() {
        P = new String[]{"swing-1", "swing-2"};
        j = new String[]{"swing-3", "swing-4", "swing", "swing-strength", "spin-smoothness", "spinning", "only-while-have-target"};
    }

    private static void j() {
        v = new boolean[]{true, false, false, false, false, true, false, false};
        B = new boolean[]{true};
    }

    private static /* synthetic */ String U(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-38, -125, 35, 118, 100, 5, 92, -63, -80, -34, -6, -88, -12, 122, -69, -16};
        int n = 0;
        int n2 = 15;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 109;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String z(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{31, 28, 52, -21, 93, 75, 3, -114, -109, 48, -56, 73, -99, 20, -116, -61};
        int n = 0;
        int n2 = 239;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 93;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{63, 67, 8, 64, 76, 6, 38, -87, 4, -126, -86, 94, 82, -51, 110, 111};
        int n = 0;
        int n2 = 112;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 117;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int u(int n) {
        return Integer.rotateRight(Integer.rotateLeft(-Integer.rotateRight(Integer.rotateLeft(-Integer.rotateLeft(n, 25), 23), 18), 11), 18);
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-94, 89, 58, -20, 69, -19, -93, -79, -77, -56, -40, -88, 112, 29, 10, -103};
        int n = 0;
        int n2 = 3;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 17;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int y(int n) {
        return Integer.rotateRight(-Integer.rotateLeft(Integer.rotateRight(Integer.rotateLeft(Integer.rotateLeft(Integer.rotateLeft(n, 13), 25), 15), 20), 25), 28);
    }

    @uF
    public void N(Rf rf) {
        CallSite callSite;
        block4: {
            block3: {
                jG.lOtsm("yicnt", -492064567, -1142416380, -1142416379, -1142416378, 1672107980, (jG)this);
                callSite = jG.lOtsm("ctluut", -492064567, -1142416342, -1142416383, -1142416341, 1672107980, (Rf)rf);
                if (jG.lOtsm("ctluut", -492064569, -1142416367, -1142416366, -1142416365, 1672107980, (boolean)jG.lOtsm("pzpra", -492064567, -1142416361, -1142416368, -1142416371, 1672107980, (Boolean)((Boolean)((Object)jG.lOtsm("yicnt", -492064567, -1142416362, -1142416383, -1142416374, 1672107980, (lT)((lT)((Object)jG.lOtsm("pzpra", -492064565, -1142416380, -1142416370, -1142416384, 1279514127, (jG)this)[jG.lOtsm("apahoe", -492064563, -1142416380, -1142416363, -1142416382, -1104848515)[3]]))))))) != false) break block3;
                if (jG.lOtsm("jpxr", -492064567, -1142416330, -1142416329, -1142416341, 1672107980, (NNNwS)((NNNwS)jG.lOtsm("wolv", -492064565, -1142416331, -1142416346, -1142416384, -789238142, (NNuU)((NNuU)jG.lOtsm("xmdzpnj", -492064565, -1142416380, -1142416366, -1142416384, 291802578, (jG)this)[jG.lOtsm("hwfimubo", -492064563, -1142416380, -1142416332, -1142416382, -1437560693)[0]]))[jG.lOtsm("ctluut", -492064563, -1142416380, -1142416332, -1142416382, 627971033)[1]])) == callSite) break block4;
            }
            return;
        }
        jG.lOtsm("ctluut", -492064567, -1142416373, -1142416364, -1142416327, 1672107980, (jl)((jl)((Object)jG.lOtsm("hwfimubo", -492064567, -1142416375, -1142416383, -1142416374, 1672107980, (ld)((ld)((Object)jG.lOtsm("ctluut", -492064565, -1142416380, -1142416377, -1142416384, 2037237664, (jG)this)[jG.lOtsm("wolv", -492064563, -1142416380, -1142416332, -1142416382, 560370558)[2]]))))), (NNIo)jG.lOtsm("jpxr", -492064567, -1142416342, -1142416370, -1142416336, 1672107980, (Rf)rf), (int)(callSite == jG.lOtsm("yicnt", -492064563, -1142416335, -1142416334, -1142416333, -886923875) ? jG.lOtsm("wolv", -492064563, -1142416380, -1142416369, -1142416376, 1971087948)[3] : jG.lOtsm("pzpra", -492064563, -1142416380, -1142416324, -1142416347, 618993364)[0]), (float)jG.lOtsm("ywlalso", -492064569, -1142416322, -1142416344, -1142416321, 1672107980, (double)((double)(jG.lOtsm("xmdzpnj", -492064567, -1142416342, -1142416369, -1142416323, 1672107980, (Rf)rf) * jG.lOtsm("hwfimubo", -492064563, -1142416380, -1142416379, -1142416339, -1215367163)[6] * jG.lOtsm("pzpra", -492064563, -1142416380, -1142416379, -1142416339, 971586543)[7]))), (float)jG.lOtsm("yicnt", -492064567, -1142416355, -1142416328, -1142416323, 1672107980, (Float)((Float)((Object)jG.lOtsm("apahoe", -492064567, -1142416356, -1142416383, -1142416374, 1672107980, (lQ)((lQ)((Object)jG.lOtsm("wolv", -492064565, -1142416380, -1142416377, -1142416384, 2047306374, (jG)this)[jG.lOtsm("pzpra", -492064563, -1142416380, -1142416332, -1142416382, -1697175932)[3]])))))), (float)(jG.lOtsm("ctluut", -492064567, -1142416355, -1142416328, -1142416323, 1672107980, (Float)((Float)((Object)jG.lOtsm("pzpra", -492064567, -1142416356, -1142416383, -1142416374, 1672107980, (lQ)((lQ)((Object)jG.lOtsm("yicnt", -492064565, -1142416380, -1142416377, -1142416384, 751016902, (jG)this)[jG.lOtsm("jpxr", -492064563, -1142416380, -1142416332, -1142416382, -404626952)[4]])))))) * jG.lOtsm("wolv", -492064563, -1142416380, -1142416372, -1142416339, 1219094344)[0]), (float)jG.lOtsm("hwfimubo", -492064567, -1142416342, -1142416369, -1142416323, 1672107980, (Rf)rf), (float)jG.lOtsm("hwfimubo", -492064567, -1142416342, -1142416377, -1142416323, 1672107980, (Rf)rf));
        jG.lOtsm("pzpra", -492064567, -1142416342, -1142416364, -1142416378, 1672107980, (Rf)rf);
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateRight(-Integer.rotateLeft(Integer.rotateLeft(Integer.rotateRight(-Integer.rotateLeft(n, 28), 4), 6), 19), 22) ^ 0x1DFC2B6C;
    }

    @uF
    public void N(My my) {
        jG.lOtsm("ctluut", -492064567, -1142416380, -1142416379, -1142416378, 1672107980, (jG)this);
        if (jG.lOtsm("jpxr", -492064569, -1142416367, -1142416366, -1142416365, 1672107980, (boolean)jG.lOtsm("wolv", -492064567, -1142416361, -1142416368, -1142416371, 1672107980, (Boolean)((Boolean)((Object)jG.lOtsm("wolv", -492064567, -1142416362, -1142416383, -1142416374, 1672107980, (lT)((lT)((Object)jG.lOtsm("xmdzpnj", -492064565, -1142416380, -1142416370, -1142416384, 1670036878, (jG)this)[jG.lOtsm("ywlalso", -492064563, -1142416380, -1142416363, -1142416382, -425296632)[1]]))))))) != false) {
            return;
        }
        jG.lOtsm("ctluut", -492064567, -1142416360, -1142416364, -1142416359, 1672107980, (My)my, (int)jG.lOtsm("apahoe", -492064567, -1142416355, -1142416354, -1142416353, 1672107980, (Float)((Float)((Object)jG.lOtsm("ywlalso", -492064567, -1142416356, -1142416383, -1142416374, 1672107980, (lQ)((lQ)((Object)jG.lOtsm("wolv", -492064565, -1142416380, -1142416377, -1142416384, -492202349, (jG)this)[jG.lOtsm("wolv", -492064563, -1142416380, -1142416363, -1142416382, 1124819836)[2]])))))));
    }

    private static /* synthetic */ String R(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-99, -89, -58, -79, -4, -11, 43, 74, 65, 20, 102, 0, 5, 30, 108, -10};
        int n = 0;
        int n2 = 89;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 109;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        llkmq0nII = "&\u00a8h\u00d1\u000b(1\u00f5\u008fq.\b(^\u0018a\u001e\u00909\f\u00a0D\u00ca/\fs\u00b6\u00a0}!\u0006\u00a8I\u00f4;3L\u00dc\u00830%~\\p\u0018\u00edX\u0085-\u00dc\u001c'y\u00b6\u00bdk;N\t[I\u00d6\u0007\u00a8I\u00f4;3L\u00dc\u00830%s\\\u00b1\u00be\u00b1[\u00a8I\u00f4;3L\u00dc\u00830%~\\p\u0018\u00ef\u0005\u0085-\u00dc\u001c'y\u00b6\u00bdk;N\t[I\u00d5?\u00afF\u00f6\u0007\u001b[\u00f4\u00c1s?\u001cNp9\u00ca5\u009eP\u00f5\u0010fr\u00fd\u00d5H\u00a8h\u00d1\u000b(1\u00ec\u009av%\b\u0001I\u001cc\u0014\u008dm\u00deR\u0019l\u00fc\u008av*F\u0013YI),\u00afF\u00f6\u0007\u001b[\u00f4\u00c1s>\u001cz\u00b5\u00a8h\u00d1\u000b(1\u00f5\u008fq.\b4H\u00007\u0080\u00839?\u00afF\u00f6\u0007\u001b[\u00f4\u00c1Q+O\\\f\u00a0D\u00ca/\fs\u00b6\u00bbiFO\u00a6H\u00a0+\u00f6r\u0088m\u00d1\t\u001f\u007f\u00f5\u009bz\u00a1\u00a0D\u00ca/\fs\u00b6\u00a0Q<r\u00888\u00a0D\u00ca/\fs\u00b6\u0084i_\u00a9[\u00be+\u00eaN:\u00cdT&\u00a8I\u00f4;3L\u00dc\u00830%~\\p\u0018ax\u0085-\u00dc\u001c'y\u00b6\u00bdk;N\t[IFH\u00a2D\u00991\u0002Z\u00df\u0094M\fJHP#;v\u008dg\u00dc\u0019\u0016(\u00a8\u00d6-y\u00be\u00da'Y\u00a0D\u00ca/\fs\u00b6\u0082K\u001f\u008bm\u00dc\u0018(p\u00cf\u008fs<Bg\u008av\u00e6\u001c%k\u00fc\u0006\u00ad+\u00fc6\rX\u00e3\u00bcZ$\b*EI.U\u00cdN\u00fb9\u000fd\u00cb\u00abrfi)u\u001d?\u0006\u00a8I\u00f4;3L\u00dc\u00830\u0007i.SI\u00c5h\u00a2D\u00f6;`H\u00fcv\u00dd\u0081v\u00d8\u0012-A\u00af\u00de)q\b\u0085t\u00d1R%\u007f\u00f7\u00890\u000fK\b]\u0006_\u00a0D\u00ca/\fs\u00b6\u00a3f\u00a5\u00a0D\u00ca/\fs\u00b6\u0084s\u0010i{Y\u00a0D\u00ca/\fs\u00b6\u00a0Q\u0007P4\u00b7\u00a0D\u00ca/\fs\u00b6\u0082N'\u00cdN\u00da\u001c?\u007f\u00b6\u0082~'@Hs\u00104j\u0087v\u008b\u00da\u0085t\u00d1R%\u007f\u00f7\u00890\u000bH\bP\u0017\u00fc\u00deJ\u00cdDD\u00a0D\u00ca/\fs\u00b6\u00bcyH\u00cdK2J\u00cdXK\u00a0D\u00ca/\fs\u00b6\u0084X\u00c6\u00cdN\u00fb9\u000fd\u00cb\u00abrfi\u0005TI[\u00a0D\u00ca/\fs\u00b6\u0082tE\u00a0D\u00ca/\fs\u00b6\u00a0Q\u001eb9\u00a2K\u00b7e\u00a0D\u00ca/\fs\u00b6\u0082{\u0099";
        Ilmtm = new int[]{36044810, 16449537, 17629187, 27459585, 19, 24838145, 39256066, 16515082, 0x1070001, 0x2230003, 30736385, 0x2220001, 14614530, 39387146, 32309268, 29949962, 0x10C0001, 40042497, 21889034, 0x2010011, 22544396, 13893642, 30670849, 17301508, 31653898, 28311567, 23330824, 35586051, 29294602, 23855119, 0x1060001, 11796499, 27525121, 4915202, 14548993, 21757953, 21823489, 30605313, 37683210, 5111865, 5046273, 0x2550002, 0x1100030, 8847404, 21626881, 1966125, 34930698, 36700175, 11730945, 15663116, 30801933, 27590667, 24903696, 1245195, 20971530, 13041677, 21692417, 34734083, 38338572, 14745604, 15007754, 25952279};
        jG.s();
        jG.T();
        jG.j();
        jG.P();
        jG.v();
    }

    private static /* synthetic */ CallSite lOtsm(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = Ilmtm[n2 ^ 0xBBE81C04];
        int n7 = n6 >>> 16;
        String string2 = jG.I1iqq(llkmq0nII.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0xBBE81C04);
        n6 = Ilmtm[n3 ^ 0xBBE81C04];
        int n8 = n6 >>> 16;
        String string3 = jG.I1iqq(llkmq0nII.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0xBBE81C04);
        n6 = Ilmtm[n4 ^ 0xBBE81C04];
        int n9 = n6 >>> 16;
        String string4 = jG.I1iqq(llkmq0nII.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0xBBE81C04);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xE2ABB07F) + -178;
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

    private static /* synthetic */ CallSite lIksIpjt(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = Ilmtm[n2 ^ 0xBBE81C04];
        int n7 = n6 >>> 16;
        String string2 = jG.I1iqq(llkmq0nII.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0xBBE81C04);
        n6 = Ilmtm[n3 ^ 0xBBE81C04];
        int n8 = n6 >>> 16;
        String string3 = jG.I1iqq(llkmq0nII.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0xBBE81C04);
        n6 = Ilmtm[n4 ^ 0xBBE81C04];
        int n9 = n6 >>> 16;
        String string4 = jG.I1iqq(llkmq0nII.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0xBBE81C04);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xE2ABB07F) + -178;
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

    private static /* synthetic */ String I1iqq(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-37, 49, -55, 107, -90, -100, -53, -88, 39, -71, -43, -69, -49, -11, -44, 53};
        byte[] byArray3 = new byte[]{32, -63, 124, 77, -36, 93, -60, -88, -114, -77, 87, 68, 91, -79, 78, -34};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void Oljjj(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[62];
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
        llkmq0nII = stringBuilder.toString();
        Ilmtm = nArray;
    }

    private static /* synthetic */ CallSite lIjlj(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = Ilmtm[n2 ^ 0xBBE81C04];
        int n8 = n7 >>> 16;
        String string2 = jG.I1iqq(llkmq0nII.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0xBBE81C04);
        n7 = Ilmtm[n3 ^ 0xBBE81C04];
        int n9 = n7 >>> 16;
        String string3 = jG.I1iqq(llkmq0nII.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0xBBE81C04);
        n7 = Ilmtm[n4 ^ 0xBBE81C04];
        int n10 = n7 >>> 16;
        String string4 = jG.I1iqq(llkmq0nII.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0xBBE81C04);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xE2ABB07F) + -178;
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

    private static /* synthetic */ CallSite I1ktpt(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = Ilmtm[n2 ^ 0xBBE81C04];
        int n7 = n6 >>> 16;
        String string2 = jG.I1iqq(llkmq0nII.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0xBBE81C04);
        n6 = Ilmtm[n3 ^ 0xBBE81C04];
        int n8 = n6 >>> 16;
        String string3 = jG.I1iqq(llkmq0nII.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0xBBE81C04);
        n6 = Ilmtm[n4 ^ 0xBBE81C04];
        int n9 = n6 >>> 16;
        String string4 = jG.I1iqq(llkmq0nII.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0xBBE81C04);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xE2ABB07F) + -178;
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
