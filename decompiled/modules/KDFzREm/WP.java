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
import KDFzREm.PB;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.WT;
import KDFzREm.Wb;
import KDFzREm.Wj;
import KDFzREm.Ws;
import KDFzREm.Wv;
import KDFzREm.ie;
import KDFzREm.ih;
import KDFzREm.lQ;
import KDFzREm.lT;
import KDFzREm.lY;
import KDFzREm.ld;
import KDFzREm.lv;
import KDFzREm.uA;
import KDFzREm.uF;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;

@UZ(L="SprintReset", y=UR.COMBAT, N=Uz.TOOLS)
public class WP
extends UM {
    private static short[] R;
    private static byte[] M;
    private static boolean[] B;
    public Object[] L;
    private static short[] Z;
    private static short[] z;
    private static String[] U;
    private static short[] W;
    private static short[] m;
    private static double[] P;
    private static short[] s;
    private static boolean[] T;
    private static short[] b;
    private static float[] j;
    private static boolean[] v;
    private static byte[] n;
    public Object[] u;
    public Object[] i;
    private static short[] t;
    private static /* synthetic */ String III0pI;
    private static /* synthetic */ int[] OOlmmqOp;

    private static /* synthetic */ int L(int n) {
        return -Integer.rotateLeft(Integer.rotateLeft(Integer.rotateLeft(n, 15) ^ 0xD41B3186, 20), 30);
    }

    private static /* synthetic */ String M(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-82, 107, 36, -54, 42, -113, -56, -37, -77, 82, -73, 28, 113, -17, 101, 3};
        int n = 0;
        int n2 = 185;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 177;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void P() {
        v = new boolean[]{true, false, false, false, false, true, true};
        B = new boolean[]{false, true, true, true, false, false, true, false};
        T = new boolean[]{false};
    }

    private static void T() {
        U = new String[]{"w-tap", "s-tap", "shift-tap", "no-stop", "mode", "chance", "ground-only", "delay"};
    }

    public WP() {
        WP.IlrIppjkp("esrbsm", -325807683, -1659604609, -1659604610, -1659604611, -325807683, (WP)this);
        Wv wv = new Wv(this, (String)((Object)WP.IlrIppjkp("esrbsm", -325807687, -1659604609, -1659604612, -1659604613, -325807687)[0]), (boolean)WP.IlrIppjkp("esrbsm", -325807687, -1659604609, -1659604614, -1659604615, -325807687)[0]);
        WP.IlrIppjkp("urxt", -325807681, -1659604609, -1659604616, -1659604617, -325807681, (WP)this)[WP.IlrIppjkp("esrbsm", -325807687, -1659604609, -1659604618, -1659604619, -325807687)[0]] = wv;
        WT wT = new WT(this, (String)((Object)WP.IlrIppjkp("qftxmo", -325807687, -1659604609, -1659604612, -1659604613, -325807687)[1]), (boolean)WP.IlrIppjkp("gtcp", -325807687, -1659604609, -1659604614, -1659604615, -325807687)[1]);
        WP.IlrIppjkp("liegcgbv", -325807681, -1659604609, -1659604616, -1659604617, -325807681, (WP)this)[WP.IlrIppjkp("qftxmo", -325807687, -1659604609, -1659604618, -1659604619, -325807687)[1]] = wT;
        Wb wb = new Wb(this, (String)((Object)WP.IlrIppjkp("ccmoo", -325807687, -1659604609, -1659604612, -1659604613, -325807687)[2]), (boolean)WP.IlrIppjkp("dsllqub", -325807687, -1659604609, -1659604614, -1659604615, -325807687)[2]);
        WP.IlrIppjkp("gtcp", -325807681, -1659604609, -1659604620, -1659604617, -325807681, (WP)this)[WP.IlrIppjkp("wril", -325807687, -1659604609, -1659604618, -1659604619, -325807687)[2]] = wb;
        Ws ws = new Ws(this, (String)((Object)WP.IlrIppjkp("urxt", -325807687, -1659604609, -1659604612, -1659604613, -325807687)[3]), (boolean)WP.IlrIppjkp("mknwzb", -325807687, -1659604609, -1659604614, -1659604615, -325807687)[3]);
        WP.IlrIppjkp("edbwb", -325807681, -1659604609, -1659604620, -1659604617, -325807681, (WP)this)[WP.IlrIppjkp("ccmoo", -325807687, -1659604609, -1659604618, -1659604619, -325807687)[3]] = ws;
        lv[] lvArray = new Wj[WP.IlrIppjkp("mknwzb", -325807687, -1659604609, -1659604621, -1659604622, -325807687)[0]];
        lvArray[WP.IlrIppjkp("liegcgbv", -325807687, -1659604609, -1659604614, -1659604615, -325807687)[4]] = (Wv)((Object)WP.IlrIppjkp("liegcgbv", -325807681, -1659604609, -1659604616, -1659604617, -325807681, (WP)this)[WP.IlrIppjkp("urxt", -325807687, -1659604609, -1659604618, -1659604619, -325807687)[4]]);
        lvArray[WP.IlrIppjkp("esrbsm", -325807687, -1659604609, -1659604614, -1659604615, -325807687)[5]] = (WT)((Object)WP.IlrIppjkp("ccmoo", -325807681, -1659604609, -1659604616, -1659604617, -325807681, (WP)this)[WP.IlrIppjkp("urxt", -325807687, -1659604609, -1659604618, -1659604619, -325807687)[5]]);
        lvArray[WP.IlrIppjkp("jamvincg", -325807687, -1659604609, -1659604621, -1659604622, -325807687)[1]] = (Wb)((Object)WP.IlrIppjkp("gtcp", -325807681, -1659604609, -1659604620, -1659604617, -325807681, (WP)this)[WP.IlrIppjkp("wril", -325807687, -1659604609, -1659604623, -1659604619, -325807687)[0]]);
        lvArray[WP.IlrIppjkp("jamvincg", -325807687, -1659604609, -1659604621, -1659604622, -325807687)[2]] = (Ws)((Object)WP.IlrIppjkp("qftxmo", -325807681, -1659604609, -1659604620, -1659604617, -325807681, (WP)this)[WP.IlrIppjkp("urxt", -325807687, -1659604609, -1659604623, -1659604619, -325807687)[1]]);
        CallSite callSite = WP.IlrIppjkp("esrbsm", -325807693, -1659604624, -1659604625, -1659604626, -325807693, (lY)this, (String)((Object)WP.IlrIppjkp("urxt", -325807687, -1659604609, -1659604612, -1659604613, -325807687)[4]), (lv[])lvArray);
        WP.IlrIppjkp("esrbsm", -325807681, -1659604609, -1659604620, -1659604617, -325807681, (WP)this)[WP.IlrIppjkp("edbwb", -325807687, -1659604609, -1659604623, -1659604619, -325807687)[2]] = callSite;
        CallSite callSite2 = WP.IlrIppjkp("qitujbed", -325807683, -1659604630, -1659604625, -1659604631, -325807683, (lQ)((Object)WP.IlrIppjkp("mdud", -325807693, -1659604624, -1659604625, -1659604628, -325807693, (lY)this, (String)((Object)WP.IlrIppjkp("wril", -325807687, -1659604609, -1659604612, -1659604613, -325807687)[5]), (float)WP.IlrIppjkp("mknwzb", -325807687, -1659604609, -1659604610, -1659604627, -325807687)[0], (float)WP.IlrIppjkp("esrbsm", -325807687, -1659604609, -1659604610, -1659604627, -325807687)[1], (float)WP.IlrIppjkp("urxt", -325807687, -1659604609, -1659604610, -1659604627, -325807687)[2], (float)WP.IlrIppjkp("liegcgbv", -325807687, -1659604609, -1659604610, -1659604627, -325807687)[3])), (Supplier)((Supplier)((Object)WP.IlrIppjkp("ccmoo", -325807687, -1659604629, -1659604625, -1659604617, -325807687)[WP.IlrIppjkp("qftxmo", -325807687, -1659604609, -1659604623, -1659604619, -325807687)[3]])));
        WP.IlrIppjkp("wril", -325807681, -1659604609, -1659604620, -1659604617, -325807681, (WP)this)[WP.IlrIppjkp("wril", -325807687, -1659604609, -1659604623, -1659604619, -325807687)[4]] = callSite2;
        CallSite callSite3 = WP.IlrIppjkp("wril", -325807693, -1659604624, -1659604625, -1659604632, -325807693, (lY)this, (String)((Object)WP.IlrIppjkp("liegcgbv", -325807687, -1659604609, -1659604612, -1659604613, -325807687)[6]), (boolean)WP.IlrIppjkp("qitujbed", -325807687, -1659604609, -1659604614, -1659604615, -325807687)[6]);
        WP.IlrIppjkp("dsllqub", -325807681, -1659604609, -1659604620, -1659604617, -325807681, (WP)this)[WP.IlrIppjkp("mknwzb", -325807687, -1659604609, -1659604633, -1659604619, -325807687)[0]] = callSite3;
        lQ lQ2 = (lQ)((Object)WP.IlrIppjkp("mdud", -325807683, -1659604630, -1659604625, -1659604634, -325807683, (lQ)((Object)WP.IlrIppjkp("mknwzb", -325807683, -1659604630, -1659604625, -1659604631, -325807683, (lQ)((Object)WP.IlrIppjkp("qftxmo", -325807693, -1659604624, -1659604625, -1659604628, -325807693, (lY)this, (String)((Object)WP.IlrIppjkp("mknwzb", -325807687, -1659604609, -1659604612, -1659604613, -325807687)[7]), (float)WP.IlrIppjkp("wril", -325807687, -1659604609, -1659604610, -1659604627, -325807687)[4], (float)WP.IlrIppjkp("edbwb", -325807687, -1659604609, -1659604610, -1659604627, -325807687)[5], (float)WP.IlrIppjkp("edbwb", -325807687, -1659604609, -1659604610, -1659604627, -325807687)[6], (float)WP.IlrIppjkp("mdud", -325807687, -1659604609, -1659604610, -1659604627, -325807687)[7])), (Supplier)((Supplier)((Object)WP.IlrIppjkp("ccmoo", -325807687, -1659604629, -1659604625, -1659604617, -325807687)[WP.IlrIppjkp("esrbsm", -325807687, -1659604609, -1659604633, -1659604619, -325807687)[1]])))), lw2 -> {
            WP.IlrIppjkp("mdud", -325807683, -1659604609, -1659604610, -1659604611, 1026636054, (WP)this);
            return (boolean)WP.IlrIppjkp("jamvincg", -325807683, -1659604640, -1659604625, -1659604641, 1026636054, (Wj)((Wj)((Object)WP.IlrIppjkp("mdud", -325807683, -1659604637, -1659604638, -1659604639, 1026636054, (ld)((ld)((Object)WP.IlrIppjkp("mdud", -325807681, -1659604609, -1659604620, -1659604617, 244843758, (WP)this)[WP.IlrIppjkp("jqzuevdb", -325807687, -1659604609, -1659604636, -1659604619, 840291968)[0]]))))));
        }));
        WP.IlrIppjkp("jamvincg", -325807681, -1659604609, -1659604620, -1659604617, -325807681, (WP)this)[WP.IlrIppjkp("jamvincg", -325807687, -1659604609, -1659604635, -1659604619, -325807687)[0]] = lQ2;
    }

    static {
        WP.ntfClinit();
    }

    private static /* synthetic */ String B(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{6, -37, 6, -55, 73, -80, 54, 19, 100, 3, 124, 122, -23, -44, 45, 39};
        int n = 0;
        int n2 = 131;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 213;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String Z(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-62, -71, 112, 96, 102, 21, -90, 19, 84, 9, -85, 40, 74, 63, -120, 5};
        int n = 0;
        int n2 = 189;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 69;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int i(int n) {
        return Integer.rotateRight(Integer.rotateLeft(Integer.rotateLeft((n ^ 0xDF8A99AC) + 1, 4) ^ 0x859A629, 24), 11);
    }

    private static /* synthetic */ String i(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-68, -4, 56, 77, 83, -95, -77, 97, -86, 110, 60, 78, -32, -24, 49, -52};
        int n = 0;
        int n2 = 175;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 195;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void b() {
        j = new float[]{100.0f, 1.0f, 100.0f, 1.0f, 1.0f, 1.0f, 10.0f, 1.0f};
    }

    private static void s() {
        P = new double[]{100.0};
    }

    private static void n() {
        Z = new short[]{0, 1, 0, 1, 0, 1};
        s = new short[]{0, 1, 2, 0, 3};
        W = new short[]{4, 3};
        m = new short[]{5, 5, 0, 4, 6};
        b = new short[]{4, 0};
        t = new short[]{4, 2, 3, 1, 2, 0, 2, 2};
        R = new short[]{2, 1, 1, 1, 0, 0, 0, 2};
        z = new short[]{2};
    }

    public int m() {
        WP.IlrIppjkp("liegcgbv", -325807683, -1659604609, -1659604610, -1659604611, 1026636054, (WP)this);
        return (int)WP.IlrIppjkp("esrbsm", -325807683, -1659604642, -1659604643, -1659604644, 1026636054, (Float)((Float)((Object)WP.IlrIppjkp("ccmoo", -325807683, -1659604630, -1659604638, -1659604639, 1026636054, (lQ)((lQ)((Object)WP.IlrIppjkp("qitujbed", -325807681, -1659604609, -1659604620, -1659604617, -872012055, (WP)this)[WP.IlrIppjkp("jamvincg", -325807687, -1659604609, -1659604635, -1659604619, -466037486)[1]]))))));
    }

    private static void v() {
        n = new byte[]{4, 2, 3, 2, 10};
        M = new byte[]{2, 6, 3, 2};
    }

    private void j() {
        CallSite callSite;
        if (WP.IlrIppjkp("mknwzb", -325807681, -1659604609, -1659604616, -1659604617, -325807681, (WP)this) == null) {
            WP.IlrIppjkp("jqzuevdb", -325807682, -1659604609, -1659604616, -1659604617, -325807682, (WP)this, (Object[])new Object[WP.IlrIppjkp("gtcp", -325807687, -1659604609, -1659604670, -1659604622, -325807687)[0]]);
            callSite = WP.IlrIppjkp("jamvincg", -325807681, -1659604609, -1659604616, -1659604617, -325807681, (WP)this);
        }
        if (WP.IlrIppjkp("edbwb", -325807681, -1659604609, -1659604620, -1659604617, -325807681, (WP)this) == null) {
            WP.IlrIppjkp("qftxmo", -325807682, -1659604609, -1659604620, -1659604617, -325807682, (WP)this, (Object[])new Object[WP.IlrIppjkp("mknwzb", -325807687, -1659604609, -1659604670, -1659604622, -325807687)[1]]);
            callSite = WP.IlrIppjkp("jamvincg", -325807681, -1659604609, -1659604620, -1659604617, -325807681, (WP)this);
        }
        if (WP.IlrIppjkp("liegcgbv", -325807681, -1659604609, -1659604638, -1659604617, -325807681, (WP)this) == null) {
            WP.IlrIppjkp("liegcgbv", -325807682, -1659604609, -1659604638, -1659604617, -325807682, (WP)this, (Object[])new Object[WP.IlrIppjkp("jqzuevdb", -325807687, -1659604609, -1659604670, -1659604622, -325807687)[2]]);
            callSite = WP.IlrIppjkp("mdud", -325807681, -1659604609, -1659604638, -1659604617, -325807681, (WP)this);
            callSite[WP.IlrIppjkp("esrbsm", -325807687, -1659604609, -1659604647, -1659604615, -325807687)[4]] = WP.IlrIppjkp("esrbsm", -325807693, -1659604646, -1659604648, -1659604649, -325807693, (int)WP.IlrIppjkp("urxt", -325807687, -1659604609, -1659604647, -1659604615, -325807687)[5]);
            callSite[WP.IlrIppjkp("esrbsm", -325807687, -1659604609, -1659604647, -1659604615, -325807687)[6]] = WP.IlrIppjkp("urxt", -325807693, -1659604646, -1659604648, -1659604649, -325807693, (int)WP.IlrIppjkp("esrbsm", -325807687, -1659604609, -1659604647, -1659604615, -325807687)[7]);
            callSite[WP.IlrIppjkp("jqzuevdb", -325807687, -1659604609, -1659604670, -1659604622, -325807687)[3]] = WP.IlrIppjkp("wril", -325807693, -1659604646, -1659604648, -1659604649, -325807693, (int)WP.IlrIppjkp("jamvincg", -325807687, -1659604609, -1659604654, -1659604615, -325807687)[0]);
        }
    }

    private static /* synthetic */ String z(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{48, -108, -74, -19, -51, -105, 18, 1, 122, 97, -37, 99, -15, -40, -14, -106};
        int n = 0;
        int n2 = 185;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 183;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-76, -8, -53, 106, -66, 3, -128, -108, -90, 48, -19, -34, 27, 122, 46, 18};
        int n = 0;
        int n2 = 237;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 249;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int u(int n) {
        return Integer.rotateRight(Integer.rotateRight(Integer.rotateLeft(-Integer.rotateLeft(Integer.rotateRight(n ^ 0xAE46599E, 10), 4), 28), 20), 7);
    }

    private static /* synthetic */ int y(int n) {
        return Integer.rotateRight(Integer.rotateRight(Integer.rotateRight(Integer.rotateRight(n, 22), 1) ^ 0xF1B5DF5D, 3), 2);
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{99, 84, 58, 69, 74, -91, 116, 25, 50, -127, -123, 65, 113, 3, 57, 33};
        int n = 0;
        int n2 = 163;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 71;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    @uF(y=uA.AFTER, L={PB.class})
    public void N(ih ih2) {
        WP.IlrIppjkp("urxt", -325807683, -1659604609, -1659604610, -1659604611, 1026636054, (WP)this);
        WP wP = this;
        CallSite callSite = WP.IlrIppjkp("dsllqub", -325807693, -1659604646, -1659604648, -1659604649, 1026636054, (int)(WP.IlrIppjkp("liegcgbv", -325807683, -1659604646, -1659604643, -1659604644, 1026636054, (Integer)((Object)WP.IlrIppjkp("dsllqub", -325807681, -1659604609, -1659604638, -1659604617, -1539138583, (WP)wP)[WP.IlrIppjkp("qftxmo", -325807687, -1659604609, -1659604645, -1659604619, -958557279)[7]])) - WP.IlrIppjkp("ccmoo", -325807687, -1659604609, -1659604647, -1659604615, -564701256)[1]));
        WP.IlrIppjkp("jqzuevdb", -325807681, -1659604609, -1659604638, -1659604617, -657707840, (WP)wP)[WP.IlrIppjkp("jamvincg", -325807687, -1659604609, -1659604650, -1659604619, 2031722180)[0]] = callSite;
        if (WP.IlrIppjkp("jamvincg", -325807683, -1659604646, -1659604643, -1659604644, 1026636054, (Integer)((Object)WP.IlrIppjkp("jamvincg", -325807681, -1659604609, -1659604638, -1659604617, -2068761901, (WP)this)[WP.IlrIppjkp("esrbsm", -325807687, -1659604609, -1659604650, -1659604619, 1787695208)[1]])) > 0) {
            WP wP2 = this;
            CallSite callSite2 = WP.IlrIppjkp("gtcp", -325807693, -1659604646, -1659604648, -1659604649, 1026636054, (int)(WP.IlrIppjkp("wril", -325807683, -1659604646, -1659604643, -1659604644, 1026636054, (Integer)((Object)WP.IlrIppjkp("esrbsm", -325807681, -1659604609, -1659604638, -1659604617, -88044675, (WP)wP2)[WP.IlrIppjkp("jamvincg", -325807687, -1659604609, -1659604650, -1659604619, 378884848)[2]])) - WP.IlrIppjkp("wril", -325807687, -1659604609, -1659604647, -1659604615, -1790543133)[2]));
            WP.IlrIppjkp("urxt", -325807681, -1659604609, -1659604638, -1659604617, -512183335, (WP)wP2)[WP.IlrIppjkp("mknwzb", -325807687, -1659604609, -1659604650, -1659604619, 781977733)[3]] = callSite2;
            return;
        }
        if (WP.IlrIppjkp("gtcp", -325807683, -1659604646, -1659604643, -1659604644, 1026636054, (Integer)((Object)WP.IlrIppjkp("mdud", -325807681, -1659604609, -1659604638, -1659604617, -570350458, (WP)this)[WP.IlrIppjkp("jamvincg", -325807687, -1659604609, -1659604650, -1659604619, 412241602)[4]])) <= 0) {
            return;
        }
        WP wP3 = this;
        CallSite callSite3 = WP.IlrIppjkp("wril", -325807693, -1659604646, -1659604648, -1659604649, 1026636054, (int)(WP.IlrIppjkp("jqzuevdb", -325807683, -1659604646, -1659604643, -1659604644, 1026636054, (Integer)((Object)WP.IlrIppjkp("mdud", -325807681, -1659604609, -1659604638, -1659604617, 2052666273, (WP)wP3)[WP.IlrIppjkp("urxt", -325807687, -1659604609, -1659604650, -1659604619, -1014387994)[5]])) - WP.IlrIppjkp("jamvincg", -325807687, -1659604609, -1659604647, -1659604615, 303985684)[3]));
        WP.IlrIppjkp("mknwzb", -325807681, -1659604609, -1659604638, -1659604617, 1355621959, (WP)wP3)[WP.IlrIppjkp("jqzuevdb", -325807687, -1659604609, -1659604650, -1659604619, 710476774)[6]] = callSite3;
        WP.IlrIppjkp("ccmoo", -325807683, -1659604640, -1659604651, -1659604652, 1026636054, (Wj)((Wj)((Object)WP.IlrIppjkp("urxt", -325807683, -1659604637, -1659604638, -1659604639, 1026636054, (ld)((ld)((Object)WP.IlrIppjkp("jamvincg", -325807681, -1659604609, -1659604620, -1659604617, -855963135, (WP)this)[WP.IlrIppjkp("qftxmo", -325807687, -1659604609, -1659604650, -1659604619, 1303808846)[7]]))))), (Object)ih2);
    }

    private static /* synthetic */ long N(long l) {
        return 0x48E8529560672E4DL ^ -Long.rotateLeft(0x6FF5589824FD30F1L ^ -Long.rotateRight(-l, 31), 42);
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateRight(-Integer.rotateLeft(Integer.rotateLeft(-Integer.rotateRight(-n ^ 0x425C33B6, 8), 17), 23), 20);
    }

    @uF
    public void N(ie ie2) {
        WP.IlrIppjkp("dsllqub", -325807683, -1659604609, -1659604610, -1659604611, 1026636054, (WP)this);
        if (WP.IlrIppjkp("edbwb", -325807683, -1659604656, -1659604657, -1659604641, 1026636054, (Boolean)((Boolean)((Object)WP.IlrIppjkp("qftxmo", -325807681, -1659604655, -1659604650, -1659604617, 3557688, (NNNwS)((NNNwS)WP.IlrIppjkp("ccmoo", -325807681, -1659604653, -1659604654, -1659604617, 1172737188, (NNuU)((NNuU)WP.IlrIppjkp("liegcgbv", -325807681, -1659604609, -1659604651, -1659604617, -1401892878, (WP)this)[WP.IlrIppjkp("gtcp", -325807687, -1659604609, -1659604635, -1659604619, 694445280)[2]]))[WP.IlrIppjkp("esrbsm", -325807687, -1659604609, -1659604635, -1659604619, 922613519)[3]]))[WP.IlrIppjkp("ccmoo", -325807687, -1659604609, -1659604635, -1659604619, 1188961284)[4]]))) == false) {
            return;
        }
        if (WP.IlrIppjkp("jqzuevdb", -325807683, -1659604656, -1659604657, -1659604641, 1026636054, (Boolean)((Boolean)((Object)WP.IlrIppjkp("jqzuevdb", -325807683, -1659604659, -1659604638, -1659604639, 1026636054, (lT)((lT)((Object)WP.IlrIppjkp("esrbsm", -325807681, -1659604609, -1659604620, -1659604617, 733473733, (WP)this)[WP.IlrIppjkp("liegcgbv", -325807687, -1659604609, -1659604658, -1659604619, -963301367)[0]])))))) != false) {
            if (WP.IlrIppjkp("urxt", -325807683, -1659604655, -1659604660, -1659604641, 1026636054, (NNNwS)((NNNwS)WP.IlrIppjkp("mknwzb", -325807681, -1659604653, -1659604654, -1659604617, -1119033793, (NNuU)((NNuU)WP.IlrIppjkp("edbwb", -325807681, -1659604609, -1659604651, -1659604617, -873650455, (WP)this)[WP.IlrIppjkp("mdud", -325807687, -1659604609, -1659604658, -1659604619, -628143864)[1]]))[WP.IlrIppjkp("urxt", -325807687, -1659604609, -1659604645, -1659604619, 213242716)[0]])) == false) {
                return;
            }
        }
        if (WP.IlrIppjkp("esrbsm", -325807683, -1659604646, -1659604643, -1659604644, 1026636054, (Integer)((Object)WP.IlrIppjkp("ccmoo", -325807681, -1659604609, -1659604638, -1659604617, 687482703, (WP)this)[WP.IlrIppjkp("jqzuevdb", -325807687, -1659604609, -1659604645, -1659604619, -1867543057)[1]])) <= 0) {
            if (WP.IlrIppjkp("liegcgbv", -325807693, -1659604661, -1659604662, -1659604663, 1026636054) * WP.IlrIppjkp("qftxmo", -325807687, -1659604609, -1659604664, -1659604665, 1541269883)[0] <= (double)WP.IlrIppjkp("wril", -325807683, -1659604642, -1659604666, -1659604667, 1026636054, (Float)((Float)((Object)WP.IlrIppjkp("mdud", -325807683, -1659604630, -1659604638, -1659604639, 1026636054, (lQ)((lQ)((Object)WP.IlrIppjkp("mdud", -325807681, -1659604609, -1659604620, -1659604617, -1112266027, (WP)this)[WP.IlrIppjkp("liegcgbv", -325807687, -1659604609, -1659604645, -1659604619, -1437349512)[2]]))))))) {
                CallSite callSite = WP.IlrIppjkp("ccmoo", -325807693, -1659604646, -1659604648, -1659604649, 1026636054, (int)WP.IlrIppjkp("esrbsm", -325807693, -1659604668, -1659604625, -1659604669, 1026636054, (int)WP.IlrIppjkp("dsllqub", -325807687, -1659604609, -1659604647, -1659604615, -1682796026)[0], (int)WP.IlrIppjkp("wril", -325807687, -1659604609, -1659604621, -1659604622, 2038674380)[3]));
                WP.IlrIppjkp("gtcp", -325807681, -1659604609, -1659604638, -1659604617, 1469597922, (WP)this)[WP.IlrIppjkp("liegcgbv", -325807687, -1659604609, -1659604645, -1659604619, 941920604)[3]] = callSite;
                CallSite callSite2 = WP.IlrIppjkp("qitujbed", -325807693, -1659604646, -1659604648, -1659604649, 1026636054, (int)WP.IlrIppjkp("jqzuevdb", -325807683, -1659604640, -1659604651, -1659604644, 1026636054, (Wj)((Wj)((Object)WP.IlrIppjkp("edbwb", -325807683, -1659604637, -1659604638, -1659604639, 1026636054, (ld)((ld)((Object)WP.IlrIppjkp("edbwb", -325807681, -1659604609, -1659604620, -1659604617, 440674629, (WP)this)[WP.IlrIppjkp("edbwb", -325807687, -1659604609, -1659604645, -1659604619, 1816711158)[4]])))))));
                WP.IlrIppjkp("qftxmo", -325807681, -1659604609, -1659604638, -1659604617, -1378724316, (WP)this)[WP.IlrIppjkp("mknwzb", -325807687, -1659604609, -1659604645, -1659604619, 104091455)[5]] = callSite2;
                CallSite callSite3 = WP.IlrIppjkp("edbwb", -325807693, -1659604646, -1659604648, -1659604649, 1026636054, (int)WP.IlrIppjkp("qftxmo", -325807687, -1659604609, -1659604621, -1659604622, -1785072526)[4]);
                WP.IlrIppjkp("esrbsm", -325807681, -1659604609, -1659604638, -1659604617, 1504844140, (WP)this)[WP.IlrIppjkp("wril", -325807687, -1659604609, -1659604645, -1659604619, -337024014)[6]] = callSite3;
            }
        }
    }

    private static /* synthetic */ String R(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-39, -65, -94, 113, -15, 125, -40, 34, 46, 61, 27, -65, -18, 63, 13, 102};
        int n = 0;
        int n2 = 229;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 91;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int R(int n) {
        return Integer.rotateRight(-Integer.rotateRight(-Integer.rotateRight(-n ^ 0xE12BBFC6, 8), 15), 10);
    }

    private static /* synthetic */ void ntfClinit() {
        III0pI = "d+\u008ed\u00b9\u00ec\u00a5\u008b\u00e2~'\u0013!\u0002\u00b1H\u0090\u00f2\u00a8\u00fc\u00bbiyr\u00e7\u00b6\u00c0&\u007f/\u00d5`\u00b7\u00e6\u009d\u0096\u00852gB\u00b2\u009d\u0091\u0001O\b\u00bc%\u009a\u00c3\u00be\u00ff\u00ac\u0014PF\u00f3\u0096\u00fb|\u00a4/\u008cm\u00f9\u00e4\u009b\u00d7\u00b1iSG\u00b3\u009b\u00de\u008cK\n\u00bcv\u0084\u00cd\u0097\u0096\u00ba-\u0014\u0014\u00ac?\u0002\u0090m\u00a0\u00e9\u00d5\u00d5\u00b7(r\u0004\u008f\u008e\u00d8p\n)\u00c1}\f\u0080!g\u00b3\u0007kxI\"\u0095m\u00a2\u00de\u009b\u00d5\u00a3#\u00aa/\u0096y\u00b3\u00c7\u009cK\n\u00bcv\u0084\u00cd\u0097\u0096\u0081,\u00d1g\u00bcT!\u0095`\u00b3\u00e9\u0094\u00ef\u00b7*`N\u00d8\u000b\u0007\u00b3%\u009fh\n\u00bcv\u0084\u00cd\u0097\u0096\u00ba\"p\u0094\u00a2\u001d\u00a8g\u00b6f\u00b7\u00fe\u009b\u0096\u00ba'{L\u00f3\u00b5\u00c8z\u00e5-\u008e7\u008e\b\u0090\u0010j/\u008cm\u00f9\u00e4\u009b\u00d7\u00b1iWD\u00b3\u0096\u00cfqn\\\u00a4\u0007\u0002\u0090m\u00a0\u00e9\u00d5\u00cc\u00a2/y\u0004\u00ba\u008f\u00c4\u009b['\u0095b\u00f9\u00d8\u0088\u00dc\u00b2/vJ\u00a8\u009f\u0091\u00d1c\u0005\u00beJ\u00ac\u00da\u00bf\u00d4\u00f9*b\u0010\u001eg\u00a0\u000e/\u008cm\u00f9\u00e4\u009b\u00d7\u00b1iXJ\u00a8\u0092rO}\u00f4\u0002\u00b1H\u0090\u00f2\u00a8\u00fc\u00bbiyr\u00e7\u00b6\u00c0q\u00aa/\u00d5`\u00b7\u00e6\u009d\u0096\u00852gB\u00b2\u009d\u0091J\u00f5\u0002\u00b1H\u0090\u00f2\u00a8\u00fc\u00bbiy\u007f\u00e7\u007fh\n\u00bcv\u0084\u00cd\u0097\u0096\u0098\b`~\u001b/\u008cm\u00f9\u00e4\u009b\u00d7\u00b1i\\E\u00a8\u009f\u00cd|\u0003\u00d4\u0002\u0090m\u00a0\u00e9\u00d5\u00d5\u00b7(r\u0004\u0093\u0098\u00c0\u009d\u00ec:\u00c1\u00d4\n:\n\u00bcv\u0084\u00cd\u0097\u0096\u00ba\u0017\u00f3\u00cb\n\u00bcv\u0084\u00cd\u0097\u0096\u0098\b[\\\u008f\u00bc \u008eZ\u00b7\u00e4\u008f\u00dc\"\u0002\u0090m\u00a0\u00e9\u00d5\u00d5\u00b7(r\u0004\u0093\u0098\u00c0\"i:\u00c1%\u0080\u00fdg\u00ac\u0003/\u0094h\u00b9\u00e5\u009e\n\u00bcv\u0084\u00cd\u0097\u0096\u00ba\u0012\u00a7\u0007\u00d3@\u00bc\u00e9\u008c\u00d8\u00f9*tE\u00bb\u00d5\u00e3\u0096\u00fb+\u009di\u00a4\u00b3g\u0002\u0090m\u00a0\u00e9\u00d5\u00cc\u00a2/y\u0004\u00ba\u008f\u00c4s;'\u0095b\u00f9\u00db\u008f\u00c9\u00a6*|N\u00ae\u00c1\u0083\\\u0004\n\u00bcv\u0084\u00cd\u0097\u0096\u00ba\u0017.M/\n\u00bcv\u0084\u00cd\u0097\u0096\u00ba\tA\n\u00bcv\u0084\u00cd\u0097\u0096\u00a1\u001c\r}\n\u00bcv\u0084\u00cd\u0097\u0096\u0081\u0016ugg\u00be\u00e6\u0002\u00b1H\u0090\u00f2\u00a8\u00fc\u00bbiyr\u00e7\u00b6\u00c0\u0099\u00b8/\u00d5`\u00b7\u00e6\u009d\u0096\u00852gB\u00b2\u009d\u0091\u00a3\u0082\u0005\u00beJ\u00ac\u00da\u00bf\u00d4\u00f9*c\u0010\u00f5\u00b6\u00e1\u00bc\u00884\u00a8I\u00bb\u00a7\u0096\u00dd\u00ed";
        OOlmmqOp = new int[]{35454986, 0xDD0001, 28508163, 14417921, 5832723, 7471105, 5636098, 13172737, 23658515, 36110337, 11599874, 21692417, 34013185, 7077890, 0x1880001, 4980746, 7602177, 36372537, 13041666, 786480, 34078730, 25034762, 31195179, 18743341, 10420225, 14549036, 0xB00001, 11468801, 0xA5000A, 0x11C0001, 11730964, 8781834, 17432579, 3932175, 26607624, 7274499, 13238273, 22544401, 35389441, 0x7F0007, 29753366, 0x11D0001, 7208961, 27131925, 21757964, 0x11B0001, 25755661, 13303825, 9633804, 5767169, 29097994, 12, 17629198, 28704774, 36175875, 4915201, 24903682, 7667722, 0x900003, 34734090, 0xA00005, 7536641};
        WP.n();
        WP.v();
        WP.s();
        WP.P();
        WP.b();
        WP.T();
    }

    private static /* synthetic */ CallSite IlrIppjkp(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = OOlmmqOp[n2 ^ 0x9D14717F];
        int n7 = n6 >>> 16;
        String string2 = WP.l1triIk(III0pI.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0x9D14717F);
        n6 = OOlmmqOp[n3 ^ 0x9D14717F];
        int n8 = n6 >>> 16;
        String string3 = WP.l1triIk(III0pI.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0x9D14717F);
        n6 = OOlmmqOp[n4 ^ 0x9D14717F];
        int n9 = n6 >>> 16;
        String string4 = WP.l1triIk(III0pI.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0x9D14717F);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xEC94910B) + -178;
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

    private static /* synthetic */ String l1triIk(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-40, 88, -2, -5, -46, 33, -9, 87, 4, -105, -87, -68, -47, 13, 22, -18};
        byte[] byArray3 = new byte[]{-1, -127, -74, -37, 20, 57, 59, 12, -12, 43, 15, 98, 77, -107, -21, -77};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite ooIrr(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = OOlmmqOp[n2 ^ 0x9D14717F];
        int n8 = n7 >>> 16;
        String string2 = WP.l1triIk(III0pI.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0x9D14717F);
        n7 = OOlmmqOp[n3 ^ 0x9D14717F];
        int n9 = n7 >>> 16;
        String string3 = WP.l1triIk(III0pI.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0x9D14717F);
        n7 = OOlmmqOp[n4 ^ 0x9D14717F];
        int n10 = n7 >>> 16;
        String string4 = WP.l1triIk(III0pI.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0x9D14717F);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xEC94910B) + -178;
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

    private static /* synthetic */ void lIqOOn0(String[] stringArray) {
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
        III0pI = stringBuilder.toString();
        OOlmmqOp = nArray;
    }
}
