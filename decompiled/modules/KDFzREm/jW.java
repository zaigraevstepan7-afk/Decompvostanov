/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NNuU
 *  KDFzREm.NxU
 */
package KDFzREm;

import KDFzREm.BJ;
import KDFzREm.Bg;
import KDFzREm.MN;
import KDFzREm.NNuU;
import KDFzREm.NxU;
import KDFzREm.Ry;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.ZU;
import KDFzREm.ZZ;
import KDFzREm.Zn;
import KDFzREm.Zu;
import KDFzREm.Zz;
import KDFzREm.jE;
import KDFzREm.jP;
import KDFzREm.jU;
import KDFzREm.jZ;
import KDFzREm.jm;
import KDFzREm.jz;
import KDFzREm.lQ;
import KDFzREm.lY;
import KDFzREm.lb;
import KDFzREm.ld;
import KDFzREm.lv;
import KDFzREm.uF;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;

@UZ(L="SkyCustomization", y=UR.VISUAL, N=Uz.WORLD)
public class jW
extends UM {
    private static int[] R;
    private static String[] M;
    private static short[] B;
    private static short[] Z;
    private static byte[] z;
    private static String[] U;
    private static float[] W;
    private static short[] m;
    private static float[] P;
    public Object[] L;
    private static float[] s;
    private static short[] T;
    private static short[] b;
    private static byte[] j;
    private static byte[] v;
    public Object[] u;
    private static String[] n;
    private static short[] t;
    public static Object[] i;
    private static short[] G;
    private static boolean[] l;
    private static short[] d;
    private static short[] w;
    private static boolean[] k;
    private static short[] Y;
    private static float[] Q;
    private static float[] O;
    private static /* synthetic */ String Olnkt;
    private static /* synthetic */ int[] I1jkkpk;

    private static /* synthetic */ int L(int n) {
        return Integer.rotateRight(Integer.rotateRight(-Integer.rotateRight(n, 6) ^ 0xF71014CB, 26) ^ 0x685817B4, 27) ^ 0x832B839;
    }

    private static /* synthetic */ int M(int n) {
        return Integer.rotateLeft(Integer.rotateRight(n, 2) ^ 0xD5C508F2, 1);
    }

    private static /* synthetic */ String M(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{41, 100, -99, -13, -127, -20, 16, 111, 45, 21, 41, 75, -22, -59, -81, -98};
        int n = 0;
        int n2 = 189;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            ++n2;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String P(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{51, -68, 88, 87, 117, -106, -61, -14, 80, 60, -54, 120, 102, -28, 125, -60};
        int n = 0;
        int n2 = 138;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 17;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    public lQ P() {
        jW.lOtOnmtIr("ojbvib", 1011008070, -1233844576, -1233844575, -1233844574, 578216345, -72440742, (jW)this);
        return (lQ)((Object)jW.lOtOnmtIr("dwppsd", 1011008068, -1233844576, -1233844573, -1233844572, 780757112, 998445165, (jW)this)[jW.lOtOnmtIr("dyjqgpz", 1011008066, -1233844576, -1233844562, -1233844570, -1348498904, 1888782556)[0]]);
    }

    public lQ T() {
        jW.lOtOnmtIr("jyjyoag", 1011008070, -1233844576, -1233844575, -1233844574, 578216345, -72440742, (jW)this);
        return (lQ)((Object)jW.lOtOnmtIr("dwppsd", 1011008068, -1233844576, -1233844573, -1233844572, 2068976337, 665826141, (jW)this)[jW.lOtOnmtIr("raqg", 1011008066, -1233844576, -1233844563, -1233844570, -2111318377, -887602217)[7]]);
    }

    public jW() {
        jW.lOtOnmtIr("ebkqavqh", 1011008070, -1233844576, -1233844575, -1233844574, 1011008070, 1011008070, (jW)this);
        lv[] lvArray = new jP[jW.lOtOnmtIr("jyjyoag", 1011008066, -1233844576, -1233844600, -1233844605, 1011008066, 1011008066)[0]];
        lvArray[jW.lOtOnmtIr("oewfcta", 1011008066, -1233844576, -1233844599, -1233844598, 1011008066, 1011008066)[0]] = new jP((String)((Object)jW.lOtOnmtIr("hizormch", 1011008066, -1233844576, -1233844602, -1233844601, 1011008066, 1011008066)[1]), (boolean)jW.lOtOnmtIr("smbraxl", 1011008066, -1233844576, -1233844599, -1233844598, 1011008066, 1011008066)[1], (boolean)jW.lOtOnmtIr("hizormch", 1011008066, -1233844576, -1233844599, -1233844598, 1011008066, 1011008066)[2]);
        lvArray[jW.lOtOnmtIr("oewfcta", 1011008066, -1233844576, -1233844599, -1233844598, 1011008066, 1011008066)[3]] = new jP((String)((Object)jW.lOtOnmtIr("ojbvib", 1011008066, -1233844576, -1233844602, -1233844601, 1011008066, 1011008066)[2]), (boolean)jW.lOtOnmtIr("dwppsd", 1011008066, -1233844576, -1233844599, -1233844598, 1011008066, 1011008066)[4], (boolean)jW.lOtOnmtIr("lwong", 1011008066, -1233844576, -1233844599, -1233844598, 1011008066, 1011008066)[5]);
        CallSite callSite = jW.lOtOnmtIr("raqg", 1011008072, -1233844597, -1233844565, -1233844596, 1011008072, 1011008072, (lY)this, (String)((Object)jW.lOtOnmtIr("dwppsd", 1011008066, -1233844576, -1233844602, -1233844601, 1011008066, 1011008066)[0]), (lv[])lvArray);
        jW.lOtOnmtIr("jyjyoag", 1011008068, -1233844576, -1233844573, -1233844572, 1011008068, 1011008068, (jW)this)[jW.lOtOnmtIr("oewfcta", 1011008066, -1233844576, -1233844595, -1233844570, 1011008066, 1011008066)[0]] = callSite;
        CallSite callSite2 = jW.lOtOnmtIr("ebkqavqh", 1011008072, -1233844597, -1233844565, -1233844591, 1011008072, 1011008072, (lY)this, (String)((Object)jW.lOtOnmtIr("ojbvib", 1011008066, -1233844576, -1233844594, -1233844601, 1011008066, 1011008066)[0]), (int)jW.lOtOnmtIr("dwppsd", 1011008066, -1233844576, -1233844593, -1233844592, 1011008066, 1011008066)[0]);
        jW.lOtOnmtIr("dyjqgpz", 1011008068, -1233844576, -1233844573, -1233844572, 1011008068, 1011008068, (jW)this)[jW.lOtOnmtIr("ebkqavqh", 1011008066, -1233844576, -1233844595, -1233844570, 1011008066, 1011008066)[1]] = callSite2;
        CallSite callSite3 = jW.lOtOnmtIr("hizormch", 1011008072, -1233844597, -1233844565, -1233844591, 1011008072, 1011008072, (lY)this, (String)((Object)jW.lOtOnmtIr("jyjyoag", 1011008066, -1233844576, -1233844594, -1233844601, 1011008066, 1011008066)[1]), (int)jW.lOtOnmtIr("jyjyoag", 1011008066, -1233844576, -1233844593, -1233844592, 1011008066, 1011008066)[1]);
        jW.lOtOnmtIr("ebkqavqh", 1011008068, -1233844576, -1233844573, -1233844572, 1011008068, 1011008068, (jW)this)[jW.lOtOnmtIr("hizormch", 1011008066, -1233844576, -1233844595, -1233844570, 1011008066, 1011008066)[2]] = callSite3;
        lQ lQ2 = (lQ)((Object)jW.lOtOnmtIr("ojbvib", 1011008070, -1233844555, -1233844565, -1233844588, 1011008070, 1011008070, (lQ)((Object)jW.lOtOnmtIr("hizormch", 1011008072, -1233844597, -1233844565, -1233844589, 1011008072, 1011008072, (lY)this, (String)((Object)jW.lOtOnmtIr("smbraxl", 1011008066, -1233844576, -1233844594, -1233844601, 1011008066, 1011008066)[2]), (float)jW.lOtOnmtIr("ebkqavqh", 1011008066, -1233844576, -1233844590, -1233844556, 1011008066, 1011008066)[0], (float)jW.lOtOnmtIr("smbraxl", 1011008066, -1233844576, -1233844590, -1233844556, 1011008066, 1011008066)[1], (float)jW.lOtOnmtIr("jyjyoag", 1011008066, -1233844576, -1233844590, -1233844556, 1011008066, 1011008066)[2], (float)jW.lOtOnmtIr("smbraxl", 1011008066, -1233844576, -1233844590, -1233844556, 1011008066, 1011008066)[3])), lw2 -> {
            jW.lOtOnmtIr("hizormch", 1011008070, -1233844576, -1233844575, -1233844574, 578216345, -72440742, (jW)this);
            return (boolean)jW.lOtOnmtIr("oewfcta", 1011008070, -1233844566, -1233844565, -1233844564, 578216345, -72440742, (jP)((jP)((Object)jW.lOtOnmtIr("dyjqgpz", 1011008070, -1233844569, -1233844568, -1233844567, 578216345, -72440742, (ld)((ld)((Object)jW.lOtOnmtIr("dwppsd", 1011008068, -1233844576, -1233844573, -1233844572, -315869985, -1916285927, (jW)this)[jW.lOtOnmtIr("jyjyoag", 1011008066, -1233844576, -1233844571, -1233844570, 156192336, 1460198103)[7]]))))));
        }));
        jW.lOtOnmtIr("dyjqgpz", 1011008068, -1233844576, -1233844573, -1233844572, 1011008068, 1011008068, (jW)this)[jW.lOtOnmtIr("nevskdsl", 1011008066, -1233844576, -1233844587, -1233844570, 1011008066, 1011008066)[0]] = lQ2;
        lQ lQ3 = (lQ)((Object)jW.lOtOnmtIr("dyjqgpz", 1011008070, -1233844555, -1233844565, -1233844588, 1011008070, 1011008070, (lQ)((Object)jW.lOtOnmtIr("hizormch", 1011008072, -1233844597, -1233844565, -1233844589, 1011008072, 1011008072, (lY)this, (String)((Object)jW.lOtOnmtIr("oewfcta", 1011008066, -1233844576, -1233844594, -1233844601, 1011008066, 1011008066)[3]), (float)jW.lOtOnmtIr("oewfcta", 1011008066, -1233844576, -1233844590, -1233844556, 1011008066, 1011008066)[4], (float)jW.lOtOnmtIr("smbraxl", 1011008066, -1233844576, -1233844590, -1233844556, 1011008066, 1011008066)[5], (float)jW.lOtOnmtIr("dyjqgpz", 1011008066, -1233844576, -1233844590, -1233844556, 1011008066, 1011008066)[6], (float)jW.lOtOnmtIr("jyjyoag", 1011008066, -1233844576, -1233844586, -1233844556, 1011008066, 1011008066)[0])), lw2 -> {
            jW.lOtOnmtIr("lwong", 1011008070, -1233844576, -1233844575, -1233844574, 578216345, -72440742, (jW)this);
            return (boolean)jW.lOtOnmtIr("lwong", 1011008070, -1233844566, -1233844565, -1233844564, 578216345, -72440742, (jP)((jP)((Object)jW.lOtOnmtIr("jyjyoag", 1011008070, -1233844569, -1233844568, -1233844567, 578216345, -72440742, (ld)((ld)((Object)jW.lOtOnmtIr("dyjqgpz", 1011008068, -1233844576, -1233844573, -1233844572, 1754366491, -1261265845, (jW)this)[jW.lOtOnmtIr("dwppsd", 1011008066, -1233844576, -1233844571, -1233844570, 178104088, -959563858)[6]]))))));
        }));
        jW.lOtOnmtIr("jyjyoag", 1011008068, -1233844576, -1233844573, -1233844572, 1011008068, 1011008068, (jW)this)[jW.lOtOnmtIr("lwong", 1011008066, -1233844576, -1233844587, -1233844570, 1011008066, 1011008066)[1]] = lQ3;
        lQ lQ4 = (lQ)((Object)jW.lOtOnmtIr("lwong", 1011008070, -1233844555, -1233844565, -1233844588, 1011008070, 1011008070, (lQ)((Object)jW.lOtOnmtIr("ebkqavqh", 1011008072, -1233844597, -1233844565, -1233844589, 1011008072, 1011008072, (lY)this, (String)((Object)jW.lOtOnmtIr("lwong", 1011008066, -1233844576, -1233844594, -1233844601, 1011008066, 1011008066)[4]), (float)jW.lOtOnmtIr("nevskdsl", 1011008066, -1233844576, -1233844586, -1233844556, 1011008066, 1011008066)[1], (float)jW.lOtOnmtIr("smbraxl", 1011008066, -1233844576, -1233844585, -1233844556, 1011008066, 1011008066)[0], (float)jW.lOtOnmtIr("nevskdsl", 1011008066, -1233844576, -1233844585, -1233844556, 1011008066, 1011008066)[1], (float)jW.lOtOnmtIr("smbraxl", 1011008066, -1233844576, -1233844585, -1233844556, 1011008066, 1011008066)[2])), lw2 -> {
            jW.lOtOnmtIr("oewfcta", 1011008070, -1233844576, -1233844575, -1233844574, 578216345, -72440742, (jW)this);
            return (boolean)jW.lOtOnmtIr("dwppsd", 1011008070, -1233844566, -1233844565, -1233844564, 578216345, -72440742, (jP)((jP)((Object)jW.lOtOnmtIr("dyjqgpz", 1011008070, -1233844569, -1233844568, -1233844567, 578216345, -72440742, (ld)((ld)((Object)jW.lOtOnmtIr("smbraxl", 1011008068, -1233844576, -1233844573, -1233844572, 757973566, 1142893363, (jW)this)[jW.lOtOnmtIr("ebkqavqh", 1011008066, -1233844576, -1233844571, -1233844570, -1255138929, -1387099239)[5]]))))));
        }));
        jW.lOtOnmtIr("hizormch", 1011008068, -1233844576, -1233844573, -1233844572, 1011008068, 1011008068, (jW)this)[jW.lOtOnmtIr("ojbvib", 1011008066, -1233844576, -1233844584, -1233844570, 1011008066, 1011008066)[0]] = lQ4;
        CallSite callSite4 = jW.lOtOnmtIr("ebkqavqh", 1011008072, -1233844597, -1233844565, -1233844589, 1011008072, 1011008072, (lY)this, (String)((Object)jW.lOtOnmtIr("dwppsd", 1011008066, -1233844576, -1233844583, -1233844601, 1011008066, 1011008066)[0]), (float)jW.lOtOnmtIr("smbraxl", 1011008066, -1233844576, -1233844557, -1233844556, 1011008066, 1011008066)[0], (float)jW.lOtOnmtIr("ebkqavqh", 1011008066, -1233844576, -1233844557, -1233844556, 1011008066, 1011008066)[1], (float)jW.lOtOnmtIr("ojbvib", 1011008066, -1233844576, -1233844557, -1233844556, 1011008066, 1011008066)[2], (float)jW.lOtOnmtIr("ebkqavqh", 1011008066, -1233844576, -1233844557, -1233844556, 1011008066, 1011008066)[3]);
        jW.lOtOnmtIr("jyjyoag", 1011008068, -1233844576, -1233844561, -1233844572, 1011008068, 1011008068, (jW)this)[jW.lOtOnmtIr("ojbvib", 1011008066, -1233844576, -1233844584, -1233844570, 1011008066, 1011008066)[1]] = callSite4;
        lv[] lvArray2 = new jm[jW.lOtOnmtIr("ojbvib", 1011008066, -1233844576, -1233844600, -1233844605, 1011008066, 1011008066)[1]];
        lvArray2[jW.lOtOnmtIr("oewfcta", 1011008066, -1233844576, -1233844599, -1233844598, 1011008066, 1011008066)[6]] = new jm((String)((Object)jW.lOtOnmtIr("nevskdsl", 1011008066, -1233844576, -1233844583, -1233844601, 1011008066, 1011008066)[2]), (int)jW.lOtOnmtIr("raqg", 1011008066, -1233844576, -1233844599, -1233844598, 1011008066, 1011008066)[7], (boolean)jW.lOtOnmtIr("dyjqgpz", 1011008066, -1233844576, -1233844582, -1233844598, 1011008066, 1011008066)[0]);
        lvArray2[jW.lOtOnmtIr("nevskdsl", 1011008066, -1233844576, -1233844582, -1233844598, 1011008066, 1011008066)[1]] = new jm((String)((Object)jW.lOtOnmtIr("oewfcta", 1011008066, -1233844576, -1233844583, -1233844601, 1011008066, 1011008066)[3]), (int)jW.lOtOnmtIr("nevskdsl", 1011008066, -1233844576, -1233844600, -1233844605, 1011008066, 1011008066)[2], (boolean)jW.lOtOnmtIr("lwong", 1011008066, -1233844576, -1233844582, -1233844598, 1011008066, 1011008066)[2]);
        lvArray2[jW.lOtOnmtIr("nevskdsl", 1011008066, -1233844576, -1233844600, -1233844605, 1011008066, 1011008066)[3]] = new jm((String)((Object)jW.lOtOnmtIr("ebkqavqh", 1011008066, -1233844576, -1233844583, -1233844601, 1011008066, 1011008066)[4]), (int)jW.lOtOnmtIr("nevskdsl", 1011008066, -1233844576, -1233844606, -1233844605, 1011008066, 1011008066)[0], (boolean)jW.lOtOnmtIr("jyjyoag", 1011008066, -1233844576, -1233844582, -1233844598, 1011008066, 1011008066)[3]);
        lvArray2[jW.lOtOnmtIr("dwppsd", 1011008066, -1233844576, -1233844606, -1233844605, 1011008066, 1011008066)[1]] = new jm((String)((Object)jW.lOtOnmtIr("ebkqavqh", 1011008066, -1233844576, -1233844583, -1233844601, 1011008066, 1011008066)[5]), (int)jW.lOtOnmtIr("dyjqgpz", 1011008066, -1233844576, -1233844606, -1233844605, 1011008066, 1011008066)[2], (boolean)jW.lOtOnmtIr("ebkqavqh", 1011008066, -1233844576, -1233844582, -1233844598, 1011008066, 1011008066)[4]);
        CallSite callSite5 = jW.lOtOnmtIr("dyjqgpz", 1011008072, -1233844597, -1233844565, -1233844596, 1011008072, 1011008072, (lY)this, (String)((Object)jW.lOtOnmtIr("jyjyoag", 1011008066, -1233844576, -1233844583, -1233844601, 1011008066, 1011008066)[1]), (lv[])lvArray2);
        jW.lOtOnmtIr("jyjyoag", 1011008068, -1233844576, -1233844561, -1233844572, 1011008068, 1011008068, (jW)this)[jW.lOtOnmtIr("jyjyoag", 1011008066, -1233844576, -1233844584, -1233844570, 1011008066, 1011008066)[2]] = callSite5;
        CallSite callSite6 = jW.lOtOnmtIr("ebkqavqh", 1011008072, -1233844579, -1233844565, -1233844578, 1011008072, 1011008072, (Bg)((Bg)((Object)jW.lOtOnmtIr("ebkqavqh", 1011008066, -1233844581, -1233844565, -1233844572, 1011008066, 1011008066)[jW.lOtOnmtIr("hizormch", 1011008066, -1233844576, -1233844580, -1233844570, 1011008066, 1011008066)[0]])), (int)jW.lOtOnmtIr("ojbvib", 1011008066, -1233844576, -1233844580, -1233844570, 1011008066, 1011008066)[1], (int)jW.lOtOnmtIr("nevskdsl", 1011008066, -1233844576, -1233844580, -1233844570, 1011008066, 1011008066)[2]);
        jW.lOtOnmtIr("dyjqgpz", 1011008068, -1233844576, -1233844561, -1233844572, 1011008068, 1011008068, (jW)this)[jW.lOtOnmtIr("ebkqavqh", 1011008066, -1233844576, -1233844577, -1233844570, 1011008066, 1011008066)[0]] = callSite6;
        CallSite callSite7 = jW.lOtOnmtIr("jyjyoag", 1011008072, -1233844512, -1233844568, -1233844511, 1011008072, 1011008072, () -> {
            jW.lOtOnmtIr("jyjyoag", 1011008070, -1233844576, -1233844575, -1233844574, 1011008070, 1011008070, (jW)this);
            return (int)(jW.lOtOnmtIr("nevskdsl", 1011008068, -1233844546, -1233844565, -1233844545, 1011008068, 1011008068, (NxU)jW.lOtOnmtIr("smbraxl", 1011008070, -1233844549, -1233844548, -1233844547, 1011008070, 1011008070, (NNuU)((NNuU)jW.lOtOnmtIr("dyjqgpz", 1011008068, -1233844576, -1233844550, -1233844572, 1011008068, 1011008068, (jW)this)[jW.lOtOnmtIr("dwppsd", 1011008066, -1233844576, -1233844571, -1233844570, 1011008066, 1011008066)[3]]))) / jW.lOtOnmtIr("nevskdsl", 1011008070, -1233844608, -1233844565, -1233844607, 1011008070, 1011008070, (jm)((jm)((Object)jW.lOtOnmtIr("smbraxl", 1011008070, -1233844569, -1233844568, -1233844567, 1011008070, 1011008070, (ld)((ld)((Object)jW.lOtOnmtIr("oewfcta", 1011008068, -1233844576, -1233844561, -1233844572, 1011008068, 1011008068, (jW)this)[jW.lOtOnmtIr("dwppsd", 1011008066, -1233844576, -1233844571, -1233844570, 1011008066, 1011008066)[4]])))))));
        }, () -> {
            jW.lOtOnmtIr("hizormch", 1011008070, -1233844576, -1233844575, -1233844574, 1011008070, 1011008070, (jW)this);
            return (int)(jW.lOtOnmtIr("oewfcta", 1011008068, -1233844546, -1233844550, -1233844545, 1011008068, 1011008068, (NxU)jW.lOtOnmtIr("hizormch", 1011008070, -1233844549, -1233844548, -1233844547, 1011008070, 1011008070, (NNuU)((NNuU)jW.lOtOnmtIr("ebkqavqh", 1011008068, -1233844576, -1233844550, -1233844572, 1011008068, 1011008068, (jW)this)[jW.lOtOnmtIr("lwong", 1011008066, -1233844576, -1233844571, -1233844570, 1011008066, 1011008066)[1]]))) / jW.lOtOnmtIr("oewfcta", 1011008070, -1233844608, -1233844565, -1233844607, 1011008070, 1011008070, (jm)((jm)((Object)jW.lOtOnmtIr("ebkqavqh", 1011008070, -1233844569, -1233844568, -1233844567, 1011008070, 1011008070, (ld)((ld)((Object)jW.lOtOnmtIr("hizormch", 1011008068, -1233844576, -1233844561, -1233844572, 1011008068, 1011008068, (jW)this)[jW.lOtOnmtIr("smbraxl", 1011008066, -1233844576, -1233844571, -1233844570, 1011008066, 1011008066)[2]])))))));
        });
        jW.lOtOnmtIr("dyjqgpz", 1011008068, -1233844576, -1233844561, -1233844572, 1011008068, 1011008068, (jW)this)[jW.lOtOnmtIr("ojbvib", 1011008066, -1233844576, -1233844577, -1233844570, 1011008066, 1011008066)[1]] = callSite7;
        CallSite callSite8 = jW.lOtOnmtIr("hizormch", 1011008072, -1233844512, -1233844568, -1233844511, 1011008072, 1011008072, () -> {
            jW.lOtOnmtIr("ebkqavqh", 1011008070, -1233844576, -1233844575, -1233844574, 1011008070, 1011008070, (jW)this);
            return (int)(jW.lOtOnmtIr("ojbvib", 1011008068, -1233844546, -1233844565, -1233844545, 1011008068, 1011008068, (NxU)jW.lOtOnmtIr("lwong", 1011008070, -1233844549, -1233844548, -1233844547, 1011008070, 1011008070, (NNuU)((NNuU)jW.lOtOnmtIr("nevskdsl", 1011008068, -1233844576, -1233844550, -1233844572, 1011008068, 1011008068, (jW)this)[jW.lOtOnmtIr("hizormch", 1011008066, -1233844576, -1233844562, -1233844570, 1011008066, 1011008066)[6]]))) / (jW.lOtOnmtIr("oewfcta", 1011008070, -1233844608, -1233844565, -1233844607, 1011008070, 1011008070, (jm)((jm)((Object)jW.lOtOnmtIr("jyjyoag", 1011008070, -1233844569, -1233844568, -1233844567, 1011008070, 1011008070, (ld)((ld)((Object)jW.lOtOnmtIr("hizormch", 1011008068, -1233844576, -1233844561, -1233844572, 1011008068, 1011008068, (jW)this)[jW.lOtOnmtIr("nevskdsl", 1011008066, -1233844576, -1233844571, -1233844570, 1011008066, 1011008066)[0]])))))) * jW.lOtOnmtIr("nevskdsl", 1011008066, -1233844576, -1233844606, -1233844605, 1011008066, 1011008066)[4]));
        }, () -> {
            jW.lOtOnmtIr("jyjyoag", 1011008070, -1233844576, -1233844575, -1233844574, 1011008070, 1011008070, (jW)this);
            return (int)(jW.lOtOnmtIr("oewfcta", 1011008068, -1233844546, -1233844550, -1233844545, 1011008068, 1011008068, (NxU)jW.lOtOnmtIr("jyjyoag", 1011008070, -1233844549, -1233844548, -1233844547, 1011008070, 1011008070, (NNuU)((NNuU)jW.lOtOnmtIr("smbraxl", 1011008068, -1233844576, -1233844550, -1233844572, 1011008068, 1011008068, (jW)this)[jW.lOtOnmtIr("hizormch", 1011008066, -1233844576, -1233844562, -1233844570, 1011008066, 1011008066)[4]]))) / (jW.lOtOnmtIr("oewfcta", 1011008070, -1233844608, -1233844565, -1233844607, 1011008070, 1011008070, (jm)((jm)((Object)jW.lOtOnmtIr("ebkqavqh", 1011008070, -1233844569, -1233844568, -1233844567, 1011008070, 1011008070, (ld)((ld)((Object)jW.lOtOnmtIr("raqg", 1011008068, -1233844576, -1233844561, -1233844572, 1011008068, 1011008068, (jW)this)[jW.lOtOnmtIr("dyjqgpz", 1011008066, -1233844576, -1233844562, -1233844570, 1011008066, 1011008066)[5]])))))) * jW.lOtOnmtIr("oewfcta", 1011008066, -1233844576, -1233844606, -1233844605, 1011008066, 1011008066)[3]));
        });
        jW.lOtOnmtIr("dyjqgpz", 1011008068, -1233844576, -1233844561, -1233844572, 1011008068, 1011008068, (jW)this)[jW.lOtOnmtIr("lwong", 1011008066, -1233844576, -1233844577, -1233844570, 1011008066, 1011008066)[2]] = callSite8;
        CallSite callSite9 = jW.lOtOnmtIr("smbraxl", 1011008070, -1233844507, -1233844565, -1233844508, 1011008070, 1011008070, (Zn)((Object)jW.lOtOnmtIr("jyjyoag", 1011008070, -1233844507, -1233844565, -1233844506, 1011008070, 1011008070, (Zn)((Object)jW.lOtOnmtIr("dwppsd", 1011008070, -1233844509, -1233844565, -1233844508, 1011008070, 1011008070, (ZU)((Object)jW.lOtOnmtIr("oewfcta", 1011008072, -1233844553, -1233844565, -1233844510, 1011008072, 1011008072)), (ZZ)new jU(this, (Zu)((Object)jW.lOtOnmtIr("oewfcta", 1011008068, -1233844576, -1233844561, -1233844572, 1011008068, 1011008068, (jW)this)[jW.lOtOnmtIr("raqg", 1011008066, -1233844576, -1233844577, -1233844570, 1011008066, 1011008066)[3]])))), (BJ)((BJ)((Object)jW.lOtOnmtIr("dwppsd", 1011008068, -1233844576, -1233844561, -1233844572, 1011008068, 1011008068, (jW)this)[jW.lOtOnmtIr("ojbvib", 1011008066, -1233844576, -1233844577, -1233844570, 1011008066, 1011008066)[4]])))), (ZZ)new jE((Zu)((Object)jW.lOtOnmtIr("oewfcta", 1011008068, -1233844576, -1233844561, -1233844572, 1011008068, 1011008068, (jW)this)[jW.lOtOnmtIr("lwong", 1011008066, -1233844576, -1233844577, -1233844570, 1011008066, 1011008066)[5]])));
        NNuU nNuU = (NNuU)jW.lOtOnmtIr("ebkqavqh", 1011008068, -1233844576, -1233844550, -1233844572, 1011008068, 1011008068, (jW)this)[jW.lOtOnmtIr("nevskdsl", 1011008066, -1233844576, -1233844577, -1233844570, 1011008066, 1011008066)[6]];
        jW.lOtOnmtIr("lwong", 1011008072, -1233844505, -1233844504, -1233844503, 1011008072, 1011008072, (Object)nNuU);
        CallSite callSite10 = jW.lOtOnmtIr("raqg", 1011008070, -1233844507, -1233844565, -1233844500, 1011008070, 1011008070, (Zn)((Object)jW.lOtOnmtIr("ebkqavqh", 1011008070, -1233844507, -1233844573, -1233844506, 1011008070, 1011008070, (Zn)((Object)jW.lOtOnmtIr("raqg", 1011008070, -1233844507, -1233844573, -1233844502, 1011008070, 1011008070, (Zn)((Object)callSite9), () -> ((NNuU)nNuU).e())), (BJ)((BJ)((Object)jW.lOtOnmtIr("ojbvib", 1011008068, -1233844576, -1233844561, -1233844572, 1011008068, 1011008068, (jW)this)[jW.lOtOnmtIr("dyjqgpz", 1011008066, -1233844576, -1233844501, -1233844570, 1011008066, 1011008066)[0]])))));
        jW.lOtOnmtIr("lwong", 1011008068, -1233844576, -1233844561, -1233844572, 1011008068, 1011008068, (jW)this)[jW.lOtOnmtIr("lwong", 1011008066, -1233844576, -1233844501, -1233844570, 1011008066, 1011008066)[1]] = callSite10;
        CallSite callSite11 = jW.lOtOnmtIr("raqg", 1011008070, -1233844507, -1233844565, -1233844508, 1011008070, 1011008070, (Zn)((Object)jW.lOtOnmtIr("lwong", 1011008070, -1233844507, -1233844565, -1233844506, 1011008070, 1011008070, (Zn)((Object)jW.lOtOnmtIr("smbraxl", 1011008070, -1233844509, -1233844565, -1233844508, 1011008070, 1011008070, (ZU)((Object)jW.lOtOnmtIr("ebkqavqh", 1011008072, -1233844553, -1233844565, -1233844510, 1011008072, 1011008072)), (ZZ)new jZ(this, (Zu)((Object)jW.lOtOnmtIr("dwppsd", 1011008068, -1233844576, -1233844561, -1233844572, 1011008068, 1011008068, (jW)this)[jW.lOtOnmtIr("jyjyoag", 1011008066, -1233844576, -1233844501, -1233844570, 1011008066, 1011008066)[2]])))), (BJ)((BJ)((Object)jW.lOtOnmtIr("raqg", 1011008068, -1233844576, -1233844561, -1233844572, 1011008068, 1011008068, (jW)this)[jW.lOtOnmtIr("hizormch", 1011008066, -1233844576, -1233844501, -1233844570, 1011008066, 1011008066)[3]])))), (ZZ)new jz((Zu)((Object)jW.lOtOnmtIr("smbraxl", 1011008068, -1233844576, -1233844561, -1233844572, 1011008068, 1011008068, (jW)this)[jW.lOtOnmtIr("dyjqgpz", 1011008066, -1233844576, -1233844501, -1233844570, 1011008066, 1011008066)[4]])));
        NNuU nNuU2 = (NNuU)jW.lOtOnmtIr("dwppsd", 1011008068, -1233844576, -1233844550, -1233844572, 1011008068, 1011008068, (jW)this)[jW.lOtOnmtIr("hizormch", 1011008066, -1233844576, -1233844501, -1233844570, 1011008066, 1011008066)[5]];
        jW.lOtOnmtIr("smbraxl", 1011008072, -1233844505, -1233844504, -1233844503, 1011008072, 1011008072, (Object)nNuU2);
        CallSite callSite12 = jW.lOtOnmtIr("raqg", 1011008070, -1233844507, -1233844565, -1233844500, 1011008070, 1011008070, (Zn)((Object)jW.lOtOnmtIr("ebkqavqh", 1011008070, -1233844507, -1233844573, -1233844506, 1011008070, 1011008070, (Zn)((Object)jW.lOtOnmtIr("ojbvib", 1011008070, -1233844507, -1233844573, -1233844502, 1011008070, 1011008070, (Zn)((Object)callSite11), () -> ((NNuU)nNuU2).e())), (BJ)((BJ)((Object)jW.lOtOnmtIr("ebkqavqh", 1011008068, -1233844576, -1233844561, -1233844572, 1011008068, 1011008068, (jW)this)[jW.lOtOnmtIr("ojbvib", 1011008066, -1233844576, -1233844554, -1233844570, 1011008066, 1011008066)[0]])))));
        jW.lOtOnmtIr("lwong", 1011008068, -1233844576, -1233844561, -1233844572, 1011008068, 1011008068, (jW)this)[jW.lOtOnmtIr("dyjqgpz", 1011008066, -1233844576, -1233844554, -1233844570, 1011008066, 1011008066)[1]] = callSite12;
    }

    static {
        jW.ntfClinit();
    }

    private static /* synthetic */ String B(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{87, -66, -116, 77, -16, 42, -79, 45, -34, -33, 41, -43, -59, 22, 36, -103};
        int n = 0;
        int n2 = 26;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 231;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private void J() {
        CallSite callSite;
        if (jW.lOtOnmtIr("raqg", 1011008068, -1233844576, -1233844573, -1233844572, 1011008068, 1011008068, (jW)this) == null) {
            jW.lOtOnmtIr("smbraxl", 1011008069, -1233844576, -1233844573, -1233844572, 1011008069, 1011008069, (jW)this, (Object[])new Object[jW.lOtOnmtIr("dwppsd", 1011008066, -1233844576, -1233844606, -1233844605, 1011008066, 1011008066)[5]]);
            callSite = jW.lOtOnmtIr("jyjyoag", 1011008068, -1233844576, -1233844573, -1233844572, 1011008068, 1011008068, (jW)this);
        }
        if (jW.lOtOnmtIr("oewfcta", 1011008068, -1233844576, -1233844561, -1233844572, 1011008068, 1011008068, (jW)this) == null) {
            jW.lOtOnmtIr("jyjyoag", 1011008069, -1233844576, -1233844561, -1233844572, 1011008069, 1011008069, (jW)this, (Object[])new Object[jW.lOtOnmtIr("ojbvib", 1011008066, -1233844576, -1233844606, -1233844605, 1011008066, 1011008066)[6]]);
            callSite = jW.lOtOnmtIr("hizormch", 1011008068, -1233844576, -1233844561, -1233844572, 1011008068, 1011008068, (jW)this);
            callSite[jW.lOtOnmtIr("hizormch", 1011008066, -1233844576, -1233844606, -1233844605, 1011008066, 1011008066)[7]] = jW.lOtOnmtIr("ojbvib", 1011008072, -1233844560, -1233844604, -1233844603, 1011008072, 1011008072, (float)jW.lOtOnmtIr("nevskdsl", 1011008066, -1233844576, -1233844557, -1233844556, 1011008066, 1011008066)[7]);
        }
    }

    private static /* synthetic */ String Z(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-62, -16, 107, -26, -110, -33, -60, -122, 60, -45, 120, 85, 64, -113, 61, 24};
        int n = 0;
        int n2 = 137;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 209;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String i(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{65, 1, -86, 7, 70, -49, 105, -4, 103, -55, 2, 24, -8, 52, -120, 78};
        int n = 0;
        int n2 = 115;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 145;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int i(int n) {
        return -Integer.rotateRight(Integer.rotateLeft(Integer.rotateLeft(n ^ 0xF84DAA9C, 21), 13) ^ 0x3BBA0F32, 16);
    }

    public BJ b() {
        jW.lOtOnmtIr("ojbvib", 1011008070, -1233844576, -1233844575, -1233844574, 578216345, -72440742, (jW)this);
        return (BJ)((Object)jW.lOtOnmtIr("jyjyoag", 1011008068, -1233844576, -1233844561, -1233844572, 2077052385, 660832605, (jW)this)[jW.lOtOnmtIr("ebkqavqh", 1011008066, -1233844576, -1233844562, -1233844570, -533212306, 806872165)[2]]);
    }

    public lQ s() {
        jW.lOtOnmtIr("lwong", 1011008070, -1233844576, -1233844575, -1233844574, 578216345, -72440742, (jW)this);
        return (lQ)((Object)jW.lOtOnmtIr("oewfcta", 1011008068, -1233844576, -1233844561, -1233844572, 464457395, 2080779026, (jW)this)[jW.lOtOnmtIr("dyjqgpz", 1011008066, -1233844576, -1233844562, -1233844570, -1395340726, 1001101530)[1]]);
    }

    private static /* synthetic */ String s(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-43, -60, 65, 20, -9, -71, 82, 27, 110, 120, 61, 45, 9, 105, 88, 60};
        int n = 0;
        int n2 = 57;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 89;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    public lb n() {
        jW.lOtOnmtIr("smbraxl", 1011008070, -1233844576, -1233844575, -1233844574, 578216345, -72440742, (jW)this);
        return (lb)((Object)jW.lOtOnmtIr("jyjyoag", 1011008068, -1233844576, -1233844573, -1233844572, 968535835, 921897386, (jW)this)[jW.lOtOnmtIr("ojbvib", 1011008066, -1233844576, -1233844563, -1233844570, 463318558, -910551331)[4]]);
    }

    private static void l() {
        k = new boolean[]{false, true, true, true, false, false, false, true};
        l = new boolean[]{true, true, false, false, false, false, true};
    }

    private static void d() {
        U = new String[]{"mode", "chroma", "borealis"};
        M = new String[]{"aurora-first", "aurora-second", "intensity", "softness", "coverage"};
        n = new String[]{"speed", "downscale", "_1x", "_2x", "_4x", "_8x"};
    }

    private static /* synthetic */ String m(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-94, 37, -10, -1, -4, 120, 67, 65, 115, -97, 110, -89, 8, 18, -84, 122};
        int n = 0;
        int n2 = 230;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 59;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    public lQ m() {
        jW.lOtOnmtIr("dwppsd", 1011008070, -1233844576, -1233844575, -1233844574, 578216345, -72440742, (jW)this);
        return (lQ)((Object)jW.lOtOnmtIr("ojbvib", 1011008068, -1233844576, -1233844573, -1233844572, -568865968, -1114009134, (jW)this)[jW.lOtOnmtIr("oewfcta", 1011008066, -1233844576, -1233844563, -1233844570, 519463922, -1556768476)[6]]);
    }

    private static void o() {
        P = new float[]{1.5f, 0.0f, 3.0f, 0.05f, 0.4f, 0.0f, 1.0f};
        Q = new float[]{0.01f, 0.5f};
        s = new float[]{0.0f, 0.67f, 0.01f};
        W = new float[]{1.0f, 0.0f, 5.0f, 0.05f, 0.05f, 100000.0f, 0.05f, 0.0f};
        O = new float[]{0.05f};
    }

    private static void k() {
        j = new byte[]{2, 4, 2, 2};
        z = new byte[]{4, 3, 8, 3, 3, 6, 8, 7};
        v = new byte[]{2, 3};
    }

    public lb t() {
        jW.lOtOnmtIr("ebkqavqh", 1011008070, -1233844576, -1233844575, -1233844574, 578216345, -72440742, (jW)this);
        return (lb)((Object)jW.lOtOnmtIr("ojbvib", 1011008068, -1233844576, -1233844573, -1233844572, -77918153, -1585034659, (jW)this)[jW.lOtOnmtIr("smbraxl", 1011008066, -1233844576, -1233844563, -1233844570, -1728231338, 683258136)[5]]);
    }

    private static void g() {
        R = new int[]{-14425478, -8766209};
    }

    public BJ v() {
        jW.lOtOnmtIr("smbraxl", 1011008070, -1233844576, -1233844575, -1233844574, 578216345, -72440742, (jW)this);
        return (BJ)((Object)jW.lOtOnmtIr("smbraxl", 1011008068, -1233844576, -1233844561, -1233844572, -454889518, -225207990, (jW)this)[jW.lOtOnmtIr("ebkqavqh", 1011008066, -1233844576, -1233844562, -1233844570, -399927618, -1710082730)[3]]);
    }

    public ld<jP> j() {
        jW.lOtOnmtIr("lwong", 1011008070, -1233844576, -1233844575, -1233844574, 578216345, -72440742, (jW)this);
        return (ld)((Object)jW.lOtOnmtIr("dyjqgpz", 1011008068, -1233844576, -1233844573, -1233844572, 810547455, 1898661857, (jW)this)[jW.lOtOnmtIr("lwong", 1011008066, -1233844576, -1233844563, -1233844570, 909209966, 2075383941)[3]]);
    }

    private static /* synthetic */ String U(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-71, -109, 76, -115, 62, -53, -32, 93, 58, 81, 90, 108, -2, -67, -23, -75};
        int n = 0;
        int n2 = 217;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 211;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String z(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{99, 89, 84, 60, 22, -111, 126, -28, 60, 125, 26, -4, -103, 90, 91, 24};
        int n = 0;
        int n2 = 41;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 11;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int u(int n) {
        return Integer.rotateLeft(Integer.rotateRight(-Integer.rotateLeft(Integer.rotateRight(n, 6), 26), 22) ^ 0x80DB5231, 12) ^ 0xBCCE5183;
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-16, -52, -120, 77, 84, -108, 35, -55, -84, 79, -16, -87, 54, -67, 47, -96};
        int n = 0;
        int n2 = 255;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 45;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int y(int n) {
        return Integer.rotateLeft(-Integer.rotateLeft(Integer.rotateRight(Integer.rotateRight(n, 25), 17) ^ 0xF1EC7B73, 9), 6) ^ 0xE7D8DF5D;
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{99, -21, -30, 113, 89, 90, -72, -53, 109, -87, -18, 80, 92, 46, 37, -71};
        int n = 0;
        int n2 = 216;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 133;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String E(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{85, -59, -1, -122, -96, 112, -30, 73, 56, 65, -39, -44, 8, 66, 33, 37};
        int n = 0;
        int n2 = 57;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 115;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    @uF
    public void N(Ry ry) {
        jW.lOtOnmtIr("ebkqavqh", 1011008070, -1233844576, -1233844575, -1233844574, 578216345, -72440742, (jW)this);
        CallSite callSite = jW.lOtOnmtIr("jyjyoag", 1011008072, -1233844560, -1233844604, -1233844603, 578216345, -72440742, (float)((jW.lOtOnmtIr("nevskdsl", 1011008070, -1233844560, -1233844559, -1233844558, 578216345, -72440742, (Float)((Float)((Object)jW.lOtOnmtIr("ebkqavqh", 1011008068, -1233844576, -1233844561, -1233844572, -1864744047, -840454452, (jW)this)[jW.lOtOnmtIr("dyjqgpz", 1011008066, -1233844576, -1233844554, -1233844570, -656256789, -90187289)[2]]))) + jW.lOtOnmtIr("nevskdsl", 1011008066, -1233844576, -1233844557, -1233844556, -1383239743, 1965634334)[4] * jW.lOtOnmtIr("lwong", 1011008070, -1233844560, -1233844559, -1233844558, 578216345, -72440742, (Float)((Float)((Object)jW.lOtOnmtIr("ebkqavqh", 1011008070, -1233844555, -1233844568, -1233844567, 578216345, -72440742, (lQ)((lQ)((Object)jW.lOtOnmtIr("ebkqavqh", 1011008068, -1233844576, -1233844561, -1233844572, 1118403806, 215200475, (jW)this)[jW.lOtOnmtIr("jyjyoag", 1011008066, -1233844576, -1233844554, -1233844570, 438237474, -1060566774)[3]]))))))) % jW.lOtOnmtIr("hizormch", 1011008066, -1233844576, -1233844557, -1233844556, -173624415, -560514956)[5]));
        jW.lOtOnmtIr("dyjqgpz", 1011008068, -1233844576, -1233844561, -1233844572, -1474109565, 1529271148, (jW)this)[jW.lOtOnmtIr("nevskdsl", 1011008066, -1233844576, -1233844554, -1233844570, -334586902, -2066700351)[4]] = callSite;
    }

    public float N(float f) {
        jW.lOtOnmtIr("hizormch", 1011008070, -1233844576, -1233844575, -1233844574, 578216345, -72440742, (jW)this);
        return (float)(jW.lOtOnmtIr("ojbvib", 1011008070, -1233844560, -1233844559, -1233844558, 578216345, -72440742, (Float)((Float)((Object)jW.lOtOnmtIr("dwppsd", 1011008068, -1233844576, -1233844561, -1233844572, 499042460, 1647882375, (jW)this)[jW.lOtOnmtIr("ojbvib", 1011008066, -1233844576, -1233844563, -1233844570, 622758532, -1704482028)[1]]))) + f * jW.lOtOnmtIr("nevskdsl", 1011008066, -1233844576, -1233844557, -1233844556, 1229185527, -6288861)[6] * jW.lOtOnmtIr("hizormch", 1011008070, -1233844560, -1233844559, -1233844558, 578216345, -72440742, (Float)((Float)((Object)jW.lOtOnmtIr("ebkqavqh", 1011008070, -1233844555, -1233844568, -1233844567, 578216345, -72440742, (lQ)((lQ)((Object)jW.lOtOnmtIr("jyjyoag", 1011008068, -1233844576, -1233844561, -1233844572, -357161510, 498325063, (jW)this)[jW.lOtOnmtIr("ojbvib", 1011008066, -1233844576, -1233844563, -1233844570, -60138024, 624741241)[2]])))))));
    }

    @uF
    public void N(MN mN) {
        jW.lOtOnmtIr("nevskdsl", 1011008070, -1233844576, -1233844575, -1233844574, 578216345, -72440742, (jW)this);
        if (jW.lOtOnmtIr("smbraxl", 1011008070, -1233844566, -1233844565, -1233844564, 578216345, -72440742, (jP)((jP)((Object)jW.lOtOnmtIr("nevskdsl", 1011008070, -1233844569, -1233844568, -1233844567, 578216345, -72440742, (ld)((ld)((Object)jW.lOtOnmtIr("dyjqgpz", 1011008068, -1233844576, -1233844573, -1233844572, -648226543, 1931563939, (jW)this)[jW.lOtOnmtIr("hizormch", 1011008066, -1233844576, -1233844554, -1233844570, 1000440539, -299606936)[5]])))))) != false) {
            jW.lOtOnmtIr("nevskdsl", 1011008070, -1233844553, -1233844552, -1233844551, 578216345, -72440742, (Zz)((Zz)((Object)jW.lOtOnmtIr("ebkqavqh", 1011008068, -1233844576, -1233844561, -1233844572, -948865578, -1582620715, (jW)this)[jW.lOtOnmtIr("dwppsd", 1011008066, -1233844576, -1233844554, -1233844570, 1452513157, 452000335)[6]])), (Object)mN);
        } else {
            jW.lOtOnmtIr("lwong", 1011008070, -1233844553, -1233844552, -1233844551, 578216345, -72440742, (Zz)((Zz)((Object)jW.lOtOnmtIr("jyjyoag", 1011008068, -1233844576, -1233844561, -1233844572, 592142815, -1033080002, (jW)this)[jW.lOtOnmtIr("smbraxl", 1011008066, -1233844576, -1233844563, -1233844570, -443217926, -1542386310)[0]])), (Object)mN);
        }
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateLeft(Integer.rotateRight((Integer.rotateLeft(Integer.rotateRight(n, 3) ^ 0x52DCA761, 4) ^ 0xF03F3807) + 1, 21) ^ 0x80FF6AE9, 1);
    }

    private static /* synthetic */ String W(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-23, 3, -113, -78, 10, -5, -104, -4, -1, 50, -89, 83, 115, -125, 38, 25};
        int n = 0;
        int n2 = 245;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 73;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String R(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-47, 47, 23, -39, -47, 125, 88, -29, 97, 6, -108, -69, -102, 46, 13, 17};
        int n = 0;
        int n2 = 118;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 135;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int R(int n) {
        return -Integer.rotateLeft(-Integer.rotateLeft(n ^ 0xE0DB85D6, 10), 31);
    }

    private static void G() {
        Z = new short[]{0, 1, 2};
        b = new short[]{3, 4};
        B = new short[]{5, 0, 1};
        d = new short[]{2, 4096, 1024};
        Y = new short[]{2, 3, 4, 2, 3, 2, 0};
        T = new short[]{3, 5, 2, 4, 2, 0};
        w = new short[]{4, 6, 7, 0, 7, 0, 5};
        t = new short[]{6, 7, 0, 0, 1, 2, 3, 4};
        G = new short[]{5, 0, 3, 4, 0, 1, 0};
        m = new short[]{1, 0, 1, 0, 1, 0, 0, 0};
    }

    private static void Y() {
        i = new Object[]{3, Float.valueOf(0.05f)};
    }

    private static /* synthetic */ void ntfClinit() {
        Olnkt = "\u00c9\u00efPE\u00f1F\u000b\u00e8EP\u00daC\u0084O\u00f1F\u000b\u00e8EP\u00dak\u009d\u0003\u001b\u00d0q\u0004\u00d3rX\u00bbn\u00a3\u00cc5^\u00dd0\u00f9j\u0010\u00cca\u0012\u0099`\u00a3\u00e5oa\u00c5\u001c\u00a8\u0005\u00d2;h,\u00f9j\u0010\u00cca\u0012\u0080u\u00a4\u00eeoT\u00c4\u0000\u00a2p\u00dco\u001f\u0095SH\u0085q\u00a1\u00eb%@\u008aG\u008dO\u00f1F\u000b\u00e8EP\u00da[\u00a3\u00b9\\\u00f1F\u000b\u00e8EP\u00da[\u0098[@L\u00f7\u00d3@ \u00f1F\u000b\u00e8EP\u00dam\u00a9\u00a8\u00d4l\u0004\u00dfO[\u0098\u009cL:\u00feFG\u00a7D\u00a0\u00ad\u000eJ\u00e4Uq\u00f9K5\u00fczo\u00b0l\u00e2\u00c0'\t\u00f8'\u00e8\u0015\u00feD7\u00c0Rx\u0098.\u0097\u00f7{\u0014(\u009cL:\u00feFG\u00a7D\u00a0\u00ad\u001ag\u008a\u00c4\u00ff}?\u00f9K5\u00fczo\u00b0l\u00e2\u00ee\u0019\t\u00fd\u0004\u00a0a\u00d4/\u001d\u00dbnZ\u00daR\u00b9\u00f0)\\\u00d6U\u0087Q\u00f3FX\u00f6Ky\u00b3{\u009f\u00c7-\u001d\u00dd?\u00fa\u00b3\u009cZ\u0018\u0096\u00f9K5\u00fczo\u00b0l\u00e2\u00c0\n\t\u0098\"\u008a\u00fa\u00f3z#\u00ffm\u0012\u00afo\u00f6E\u00f1F\u000b\u00e8EP\u00daO\u0083\u00f7\u0015#\u00d9o\u0010\u00ceV\\\u0099t\u00a8N\u00f1F\u000b\u00e8EP\u00da[\u00a3\u00fem\u00f9K5\u00fczo\u00b0l\u00e2\u00ee\u0019\t\u00fd\u0004\u00a03\u00d4/\u001d\u00dbnZ\u00daR\u00b9\u00f0)\\\u00d6U\u0088l\u00f9K5\u00fczo\u00b0l\u00e2\u00ee\"\t\u00e5\u00e6\b\u00f1F\u000b\u00e8EP\u00daC\u00bc\u00f4\f\u00cde\u0012\u00cftX\u00afN\u00f1F\u000b\u00e8EP\u00dam\u009c\u0018\u00fc\u00eaz(\u009cV \u00f1F\u000b\u00e8EP\u00da[\u00b7\u00efm\u009cI\u00e9\u00f9j\u0010\u00cca\u0012\u0099`\u00a3\u00e5o}\u00d3\u0004\u00a4\u00a2\u00c1;X\u00ec\u00b3\u00f9K5\u00fczo\u00b0l\u00e2\u00ee\u0019\t\u00fd\u0004\u00a0\u00ed\u00d4/\u001d\u00dbnZ\u00daR\u00b9\u00f0)\\\u00d6U\u009a\u00d7\u00feD7\u00c0Rx\u0098.\u00a1\u00f4{\u001b\u00fd%\u0085\u00dd\u00cfR4\u00d7/Q\u0091:\u00e9\u00f9j\u0010\u00cca\u0012\u0099`\u00a3\u00e5o}\u00d3\u0004\u00a4\u00a2\u00c1;X\u00f6j\\\u0083`\u00e2\u00ee!\\\u00d6A\u008e\u00a3\u00dfe\u0012\u00ce;\u00aa\u00ebZh\u00ff\u00b3\u009cL:\u00feFG\u00a7D\u00a0\u00ad\u001aH\u008a\u0000\u000f\u0085\u00f3\b\u00f1F\u000b\u00e8EP\u00dak\u009a(\u009cF\u00fb\u00f1F\u000b\u00e8EP\u00da[\u00b8\u001e\u00e9\u009cL\u001b\u00dbv\\\u00dam\u00ac\u00ec'\u001d\u00fe\f\u00ab\u00a4\u00d6tJ)\u00d4v\u0010\u0095l\\\u009bf\u00e2\u00c4,]\u00d0\u001a\u0001\u00d4v\u0010\u0095uI\u009cm\u00e2\u00cd\"X\u00d4\r\u00b5\u0018\u00f6\u00f9j\u0010\u00cca\u0012\u0080u\u00a4\u00eeoT\u00c4\u0000\u00a2\u00aa\u00dco\u001f\u0095PO\u0090e\u00a4\u00e1!F\u00d4U\u00e8\u0092\u00feD7\u00c0Rx\u0098.\u00a1\u00f5{E\u00f1F\u000b\u00e8EP\u00dam\u00a6\b\u00f1F\u000b\u00e8EP\u00dak\u00a0g\u0012\u00f1F\u000b\u00e8EP\u00daO\u00b5\u00d7\u00f6\u00f9K5\u00fczo\u00b0l\u00e2\u00d8\u001a\t\u0098\"\u008a\u009a\u00f3z#\u00ffm\u0012\u00afo\u00f6_\u00ef\u0085\u00f9j\u0010\u00cca\u0012\u0099`\u00a3\u00e5o}\u00d3\u0004\u00a4\u00bd\u00c1;+-\u00f3)=\u00d0aK\u0094.\u00a1\u00e3.U\u009e(\u00adj\u00d4tJm\u00f9j\u0010\u00cca\u0012\u0080u\u00a4\u00eeoT\u00c4\u0000\u00a21\u00dco\u001f\u0095IS\u0081R\u00b8\u00f20^\u00d8\u000b\u00b3~\u00f9j\u0010\u00cca\u0012\u0080u\u00a4\u00eeoT\u00c4\u0000\u00a21\u00dco\u001f\u0095IS\u0081R\u00b8\u00f20^\u00d8\u000b\u00b3~\u009cL:\u00feFG\u00a7D\u00a0\u00ad\u0002x\u008a";
        I1jkkpk = new int[]{35520522, 35323905, 25296899, 7274497, 47317011, 34209793, 23003138, 7667722, 35258369, 37093396, 851978, 7602177, 0xF30003, 0xC00001, 37027841, 7536641, 38404111, 18677770, 36175875, 0x700001, 35389442, 24379402, 1, 25493514, 23855111, 26411029, 12713985, 0x111000C, 0x1310001, 8781839, 44761099, 26148865, 0x2A0000A, 26214403, 0x1810001, 7405570, 0x7F0007, 48627732, 34078721, 2490387, 0x170001, 34013185, 0x2D00002, 43384842, 27787321, 0x1800001, 0xB10001, 23789569, 25034754, 20054061, 131073, 0xC30030, 40501292, 44695553, 65537, 16121857, 48562177, 24313857, 3735553, 196618, 0xC10001, 36372490, 9764892, 34275329, 23134218, 49938510, 11665422, 6619146, 45482010, 19333130, 16187418, 39387153, 1572878, 31522854, 3801131, 34144257, 34340878};
        jW.G();
        jW.k();
        jW.g();
        jW.l();
        jW.o();
        jW.d();
        jW.Y();
    }

    private static /* synthetic */ CallSite lOtOnmtIr(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = I1jkkpk[n2 ^ 0xB67506A0];
        int n8 = n7 >>> 16;
        String string2 = jW.lOmjOjknj(Olnkt.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0xB67506A0);
        n7 = I1jkkpk[n3 ^ 0xB67506A0];
        int n9 = n7 >>> 16;
        String string3 = jW.lOmjOjknj(Olnkt.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0xB67506A0);
        n7 = I1jkkpk[n4 ^ 0xB67506A0];
        int n10 = n7 >>> 16;
        String string4 = jW.lOmjOjknj(Olnkt.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0xB67506A0);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x3C42C2F0) + -178;
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

    private static /* synthetic */ CallSite l1Oqkq(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) throws Exception {
        int n9 = I1jkkpk[n2 ^ 0xB67506A0];
        int n10 = n9 >>> 16;
        String string2 = jW.lOmjOjknj(Olnkt.substring(n10, n10 + (n9 & 0xFFFF)), n2 ^ 0xB67506A0);
        n9 = I1jkkpk[n3 ^ 0xB67506A0];
        int n11 = n9 >>> 16;
        String string3 = jW.lOmjOjknj(Olnkt.substring(n11, n11 + (n9 & 0xFFFF)), n3 ^ 0xB67506A0);
        n9 = I1jkkpk[n4 ^ 0xB67506A0];
        int n12 = n9 >>> 16;
        String string4 = jW.lOmjOjknj(Olnkt.substring(n12, n12 + (n9 & 0xFFFF)), n4 ^ 0xB67506A0);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x3C42C2F0) + -178;
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

    private static /* synthetic */ void lOnkm(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[77];
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
        Olnkt = stringBuilder.toString();
        I1jkkpk = nArray;
    }

    private static /* synthetic */ String lOmjOjknj(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{4, 111, 109, -76, -70, 10, -97, 65, 0, -94, 71, 1, 93, 19, -38, -59};
        byte[] byArray3 = new byte[]{114, -19, -16, 64, -108, -8, -23, -42, -17, -84, 93, 8, 45, -120, -59, 33};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite l1q0tOplI(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = I1jkkpk[n2 ^ 0xB67506A0];
        int n7 = n6 >>> 16;
        String string2 = jW.lOmjOjknj(Olnkt.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0xB67506A0);
        n6 = I1jkkpk[n3 ^ 0xB67506A0];
        int n8 = n6 >>> 16;
        String string3 = jW.lOmjOjknj(Olnkt.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0xB67506A0);
        n6 = I1jkkpk[n4 ^ 0xB67506A0];
        int n9 = n6 >>> 16;
        String string4 = jW.lOmjOjknj(Olnkt.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0xB67506A0);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x3C42C2F0) + -178;
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
