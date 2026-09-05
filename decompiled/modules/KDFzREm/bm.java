/*
 * Decompiled with CFR 0.152.
 */
package KDFzREm;

import KDFzREm.MR;
import KDFzREm.MU;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.bP;
import KDFzREm.jQ;
import KDFzREm.lQ;
import KDFzREm.lY;
import KDFzREm.lb;
import KDFzREm.lv;
import KDFzREm.lw;
import KDFzREm.uA;
import KDFzREm.uF;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.FloatBuffer;
import java.nio.charset.StandardCharsets;

@UZ(L="Fog", y=UR.VISUAL, N=Uz.WORLD)
public class bm
extends UM {
    private static float[] u;
    private static byte[] i;
    private static short[] R;
    private static short[] M;
    private static int[] B;
    public Object[] L;
    private static boolean[] Z;
    private static short[] z;
    private static boolean[] U;
    private static float[] W;
    private static short[] m;
    private static String[] P;
    private static short[] s;
    private static /* synthetic */ String lOs0q0r;
    private static /* synthetic */ int[] ootnjq0m;

    private static /* synthetic */ int L(int n) {
        return -Integer.rotateLeft(-Integer.rotateRight(-Integer.rotateLeft(n, 4), 2), 2);
    }

    private static /* synthetic */ String M(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{76, -92, -121, 65, -27, 49, -61, -44, -9, 127, 22, -79, 106, -53, -81, 122};
        int n = 0;
        int n2 = 46;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 183;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void P() {
        P = new String[]{"color", "blur", "details", "color", "distance", "radius"};
    }

    private void T() {
        if (bm.llmOlk0("lqlb", 627120981, 1780007502, 1780007501, 1780007498, 627120981, 627120981, 627120981, (bm)this) == null) {
            bm.llmOlk0("czkii", 627120980, 1780007502, 1780007501, 1780007498, 627120980, 627120980, 627120980, (bm)this, (Object[])new Object[bm.llmOlk0("nlwbdkdx", 627120979, 1780007502, 1780007493, 1780007508, 627120979, 627120979, 627120979)[2]]);
            CallSite callSite = bm.llmOlk0("unydym", 627120981, 1780007502, 1780007501, 1780007498, 627120981, 627120981, 627120981, (bm)this);
        }
    }

    public bm() {
        bm.llmOlk0("qozwwzb", 627120983, 1780007502, 1780007503, 1780007500, 627120983, 627120983, 627120983, (bm)this);
        lv lv2 = new lv((String)((Object)bm.llmOlk0("unydym", 627120979, 1780007502, 1780007527, 1780007524, 627120979, 627120979, 627120979)[0]), (boolean)bm.llmOlk0("nlwbdkdx", 627120979, 1780007502, 1780007494, 1780007506, 627120979, 627120979, 627120979)[0]);
        bm.llmOlk0("qozwwzb", 627120981, 1780007502, 1780007501, 1780007498, 627120981, 627120981, 627120981, (bm)this)[bm.llmOlk0("lqlb", 627120979, 1780007502, 1780007525, 1780007496, 627120979, 627120979, 627120979)[0]] = lv2;
        lv lv3 = new lv((String)((Object)bm.llmOlk0("czkii", 627120979, 1780007502, 1780007527, 1780007524, 627120979, 627120979, 627120979)[1]), (boolean)bm.llmOlk0("unydym", 627120979, 1780007502, 1780007494, 1780007506, 627120979, 627120979, 627120979)[1]);
        bm.llmOlk0("qozwwzb", 627120981, 1780007502, 1780007501, 1780007498, 627120981, 627120981, 627120981, (bm)this)[bm.llmOlk0("xwqe", 627120979, 1780007502, 1780007525, 1780007496, 627120979, 627120979, 627120979)[1]] = lv3;
        lv[] lvArray = new lv[bm.llmOlk0("unydym", 627120979, 1780007502, 1780007493, 1780007508, 627120979, 627120979, 627120979)[0]];
        lvArray[bm.llmOlk0("qozwwzb", 627120979, 1780007502, 1780007494, 1780007506, 627120979, 627120979, 627120979)[2]] = (lv)((Object)bm.llmOlk0("unydym", 627120981, 1780007502, 1780007501, 1780007498, 627120981, 627120981, 627120981, (bm)this)[bm.llmOlk0("ofvv", 627120979, 1780007502, 1780007525, 1780007496, 627120979, 627120979, 627120979)[2]]);
        lvArray[bm.llmOlk0("xwqe", 627120979, 1780007502, 1780007494, 1780007506, 627120979, 627120979, 627120979)[3]] = (lv)((Object)bm.llmOlk0("unydym", 627120981, 1780007502, 1780007501, 1780007498, 627120981, 627120981, 627120981, (bm)this)[bm.llmOlk0("czkii", 627120979, 1780007502, 1780007525, 1780007496, 627120979, 627120979, 627120979)[3]]);
        CallSite callSite = bm.llmOlk0("unydym", 627120985, 1780007522, 1780007512, 1780007523, 627120985, 627120985, 627120985, (lY)this, (String)((Object)bm.llmOlk0("mthvj", 627120979, 1780007502, 1780007527, 1780007524, 627120979, 627120979, 627120979)[2]), (lv[])lvArray);
        bm.llmOlk0("nlwbdkdx", 627120981, 1780007502, 1780007501, 1780007498, 627120981, 627120981, 627120981, (bm)this)[bm.llmOlk0("ofvv", 627120979, 1780007502, 1780007525, 1780007496, 627120979, 627120979, 627120979)[4]] = callSite;
        lb lb2 = (lb)((Object)bm.llmOlk0("qozwwzb", 627120983, 1780007492, 1780007510, 1780007551, 627120983, 627120983, 627120983, (lb)((Object)bm.llmOlk0("lqlb", 627120985, 1780007522, 1780007510, 1780007550, 627120985, 627120985, 627120985, (lY)this, (String)((Object)bm.llmOlk0("ijyaju", 627120979, 1780007502, 1780007527, 1780007524, 627120979, 627120979, 627120979)[3]), (int)bm.llmOlk0("xwqe", 627120979, 1780007502, 1780007520, 1780007521, 627120979, 627120979, 627120979)[0])), lw2 -> {
            CallSite callSite;
            bm.llmOlk0("xwqe", 627120983, 1780007502, 1780007503, 1780007500, -1237679802, -1926169019, 586063734, (bm)this);
            if (bm.llmOlk0("ofvv", 627120983, 1780007497, 1780007494, 1780007495, -1237679802, -1926169019, 586063734, (lv)((lv)((Object)bm.llmOlk0("ofvv", 627120981, 1780007502, 1780007501, 1780007498, -937830751, 1635183003, 1013907014, (bm)this)[bm.llmOlk0("ijyaju", 627120979, 1780007502, 1780007511, 1780007496, -217316015, 661213510, 1063122018)[2]]))) == false) {
                if (bm.llmOlk0("mthvj", 627120983, 1780007497, 1780007494, 1780007495, -1237679802, -1926169019, 586063734, (lv)((lv)((Object)bm.llmOlk0("ofvv", 627120981, 1780007502, 1780007501, 1780007498, -779668308, 1952002637, 1994494430, (bm)this)[bm.llmOlk0("czkii", 627120979, 1780007502, 1780007511, 1780007496, -1847715356, 769668065, 1123054254)[3]]))) == false) {
                    callSite = bm.llmOlk0("xwqe", 627120979, 1780007502, 1780007509, 1780007506, 31866041, 1038677406, -1602062840)[3];
                    return (boolean)callSite;
                }
            }
            callSite = bm.llmOlk0("ijyaju", 627120979, 1780007502, 1780007509, 1780007506, -884866013, -388680315, -2051519020)[2];
            return (boolean)callSite;
        }));
        bm.llmOlk0("unydym", 627120981, 1780007502, 1780007501, 1780007498, 627120981, 627120981, 627120981, (bm)this)[bm.llmOlk0("czkii", 627120979, 1780007502, 1780007525, 1780007496, 627120979, 627120979, 627120979)[5]] = lb2;
        lQ lQ2 = (lQ)((Object)bm.llmOlk0("lqlb", 627120983, 1780007530, 1780007510, 1780007551, 627120983, 627120983, 627120983, (lQ)((Object)bm.llmOlk0("qozwwzb", 627120985, 1780007522, 1780007510, 1780007548, 627120985, 627120985, 627120985, (lY)this, (String)((Object)bm.llmOlk0("ofvv", 627120979, 1780007502, 1780007527, 1780007524, 627120979, 627120979, 627120979)[4]), (float)bm.llmOlk0("czkii", 627120979, 1780007502, 1780007519, 1780007514, 627120979, 627120979, 627120979)[0], (float)bm.llmOlk0("ijyaju", 627120979, 1780007502, 1780007519, 1780007514, 627120979, 627120979, 627120979)[1], (float)bm.llmOlk0("unydym", 627120979, 1780007502, 1780007519, 1780007514, 627120979, 627120979, 627120979)[2], (float)bm.llmOlk0("nlwbdkdx", 627120979, 1780007502, 1780007519, 1780007514, 627120979, 627120979, 627120979)[3])), lw2 -> {
            bm.llmOlk0("lqlb", 627120983, 1780007502, 1780007503, 1780007500, -1237679802, -1926169019, 586063734, (bm)this);
            return (boolean)bm.llmOlk0("mthvj", 627120983, 1780007497, 1780007494, 1780007495, -1237679802, -1926169019, 586063734, (lv)((lv)((Object)bm.llmOlk0("qozwwzb", 627120981, 1780007502, 1780007501, 1780007498, 1159310929, -1756131514, -1214561959, (bm)this)[bm.llmOlk0("czkii", 627120979, 1780007502, 1780007511, 1780007496, -1905688586, 1995009867, 817381640)[1]])));
        }));
        bm.llmOlk0("unydym", 627120981, 1780007502, 1780007501, 1780007498, 627120981, 627120981, 627120981, (bm)this)[bm.llmOlk0("mthvj", 627120979, 1780007502, 1780007525, 1780007496, 627120979, 627120979, 627120979)[6]] = lQ2;
        bP bP2 = new bP();
        bm.llmOlk0("qozwwzb", 627120981, 1780007502, 1780007501, 1780007498, 627120981, 627120981, 627120981, (bm)this)[bm.llmOlk0("ofvv", 627120979, 1780007502, 1780007549, 1780007496, 627120979, 627120979, 627120979)[0]] = bP2;
        CallSite callSite2 = bm.llmOlk0("lqlb", 627120985, 1780007546, 1780007547, 1780007544, 627120985, 627120985, 627120985, (int)bm.llmOlk0("nlwbdkdx", 627120979, 1780007502, 1780007493, 1780007508, 627120979, 627120979, 627120979)[1]);
        bm.llmOlk0("nlwbdkdx", 627120981, 1780007502, 1780007501, 1780007498, 627120981, 627120981, 627120981, (bm)this)[bm.llmOlk0("lqlb", 627120979, 1780007502, 1780007549, 1780007496, 627120979, 627120979, 627120979)[1]] = callSite2;
        lQ lQ3 = (lQ)((Object)bm.llmOlk0("czkii", 627120983, 1780007545, 1780007510, 1780007542, 627120983, 627120983, 627120983, (lw)((Object)bm.llmOlk0("nlwbdkdx", 627120983, 1780007530, 1780007510, 1780007551, 627120983, 627120983, 627120983, (lQ)((Object)bm.llmOlk0("nlwbdkdx", 627120985, 1780007522, 1780007510, 1780007548, 627120985, 627120985, 627120985, (lY)this, (String)((Object)bm.llmOlk0("unydym", 627120979, 1780007502, 1780007527, 1780007524, 627120979, 627120979, 627120979)[5]), (float)bm.llmOlk0("mthvj", 627120979, 1780007502, 1780007519, 1780007514, 627120979, 627120979, 627120979)[4], (float)bm.llmOlk0("ofvv", 627120979, 1780007502, 1780007519, 1780007514, 627120979, 627120979, 627120979)[5], (float)bm.llmOlk0("mthvj", 627120979, 1780007502, 1780007519, 1780007514, 627120979, 627120979, 627120979)[6], (float)bm.llmOlk0("lqlb", 627120979, 1780007502, 1780007517, 1780007514, 627120979, 627120979, 627120979)[0])), lw2 -> {
            bm.llmOlk0("unydym", 627120983, 1780007502, 1780007503, 1780007500, -1237679802, -1926169019, 586063734, (bm)this);
            return (boolean)bm.llmOlk0("mthvj", 627120983, 1780007497, 1780007494, 1780007495, -1237679802, -1926169019, 586063734, (lv)((lv)((Object)bm.llmOlk0("czkii", 627120981, 1780007502, 1780007501, 1780007498, -222053789, -2123964094, -462285121, (bm)this)[bm.llmOlk0("qozwwzb", 627120979, 1780007502, 1780007511, 1780007496, -1391492729, -259314231, 445125053)[0]])));
        })), (lw2, f) -> {
            bm.llmOlk0("qozwwzb", 627120983, 1780007502, 1780007503, 1780007500, -1237679802, -1926169019, 586063734, (bm)this);
            bm.llmOlk0("nlwbdkdx", 627120985, 1780007535, 1780007510, 1780007532, -1237679802, -1926169019, 586063734, (FloatBuffer)((FloatBuffer)((Object)bm.llmOlk0("nlwbdkdx", 627120981, 1780007502, 1780007501, 1780007498, 1589641288, 594031634, 1840508145, (bm)this)[bm.llmOlk0("nlwbdkdx", 627120979, 1780007502, 1780007499, 1780007496, 1264309201, 155519732, 1794148354)[5]])), (int)bm.llmOlk0("mthvj", 627120985, 1780007504, 1780007505, 1780007534, -1237679802, -1926169019, 586063734, (int)bm.llmOlk0("ijyaju", 627120979, 1780007502, 1780007509, 1780007506, 1265812623, -149853870, 1587307698)[0], (int)(bm.llmOlk0("ofvv", 627120983, 1780007507, 1780007488, 1780007489, -1237679802, -1926169019, 586063734, (Float)f) - bm.llmOlk0("xwqe", 627120979, 1780007502, 1780007509, 1780007506, -1479500562, 106883026, 1979727818)[1])));
        }));
        bm.llmOlk0("ijyaju", 627120981, 1780007502, 1780007501, 1780007498, 627120981, 627120981, 627120981, (bm)this)[bm.llmOlk0("xwqe", 627120979, 1780007502, 1780007549, 1780007496, 627120979, 627120979, 627120979)[2]] = lQ3;
        bm.llmOlk0("mthvj", 627120985, 1780007535, 1780007510, 1780007532, 627120985, 627120985, 627120985, (FloatBuffer)((FloatBuffer)((Object)bm.llmOlk0("nlwbdkdx", 627120981, 1780007502, 1780007501, 1780007498, 627120981, 627120981, 627120981, (bm)this)[bm.llmOlk0("unydym", 627120979, 1780007502, 1780007549, 1780007496, 627120979, 627120979, 627120979)[3]])), (int)bm.llmOlk0("ijyaju", 627120985, 1780007504, 1780007505, 1780007534, 627120985, 627120985, 627120985, (int)bm.llmOlk0("czkii", 627120979, 1780007502, 1780007494, 1780007506, 627120979, 627120979, 627120979)[4], (int)(bm.llmOlk0("ofvv", 627120983, 1780007507, 1780007488, 1780007489, 627120983, 627120983, 627120983, (Float)((Float)((Object)bm.llmOlk0("ijyaju", 627120983, 1780007530, 1780007493, 1780007490, 627120983, 627120983, 627120983, (lQ)((lQ)((Object)bm.llmOlk0("ofvv", 627120981, 1780007502, 1780007501, 1780007498, 627120981, 627120981, 627120981, (bm)this)[bm.llmOlk0("ijyaju", 627120979, 1780007502, 1780007533, 1780007496, 627120979, 627120979, 627120979)[0]])))))) - bm.llmOlk0("czkii", 627120979, 1780007502, 1780007494, 1780007506, 627120979, 627120979, 627120979)[5])));
    }

    static {
        bm.ntfClinit();
    }

    private static /* synthetic */ String B(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-76, -72, -11, -46, -104, -51, -91, 8, -16, -8, 45, 20, 61, 108, 76, 107};
        int n = 0;
        int n2 = 146;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 55;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String i(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{40, -8, 101, -86, -56, -82, -87, 27, -25, 121, 26, -92, -6, 49, 101, 111};
        int n = 0;
        int n2 = 225;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 113;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int i(int n) {
        return (Integer.rotateLeft(Integer.rotateRight(Integer.rotateRight(Integer.rotateRight(n, 22), 19), 23), 17) ^ 0xBE0346E9) + 1;
    }

    private static void b() {
        u = new float[]{50.0f, 10.0f, 150.0f, 1.0f, 12.0f, 8.0f, 20.0f};
        W = new float[]{1.0f, 255.0f, 255.0f, 255.0f, 255.0f};
    }

    private static void s() {
        U = new boolean[]{true, true, false, true, false, true};
        Z = new boolean[]{false, true, true, false};
    }

    private static void m() {
        z = new short[]{0, 1, 0, 1, 2, 3, 4};
        M = new short[]{5, 7, 6, 7};
        s = new short[]{6, 1, 5, 3};
        m = new short[]{4, 6, 7, 0, 3, 7};
        R = new short[]{1, 1, 0, 1};
    }

    private static void v() {
        B = new int[]{1297584127};
    }

    private static void j() {
        i = new byte[]{2, 20, 8};
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{106, -24, 110, -50, -54, -14, -119, -109, -94, -23, -98, -3, -50, 96, 113, 45};
        int n = 0;
        int n2 = 58;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 29;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int u(int n) {
        return Integer.rotateLeft(Integer.rotateRight(Integer.rotateRight(n ^ 0xFA59BFD2, 6), 4) ^ 0x9207B56E, 8) ^ 0x97433F15;
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-24, 120, -70, -18, -9, 6, -94, 17, 74, 89, -78, 14, 113, -119, -77, -1};
        int n = 0;
        int n2 = 183;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 167;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int y(int n) {
        return Integer.rotateRight(-Integer.rotateRight(Integer.rotateLeft(Integer.rotateRight(n, 17), 2), 18) ^ 0x10DFB85D, 3) ^ 0xC83B9B1D;
    }

    @uF(y=uA.BEFORE, N={jQ.class})
    public void N(MR mR) {
        bm.llmOlk0("xwqe", 627120983, 1780007502, 1780007503, 1780007500, -1237679802, -1926169019, 586063734, (bm)this);
        if (bm.llmOlk0("lqlb", 627120983, 1780007497, 1780007494, 1780007495, -1237679802, -1926169019, 586063734, (lv)((lv)((Object)bm.llmOlk0("xwqe", 627120981, 1780007502, 1780007501, 1780007498, -2110031317, -557897159, -2141549496, (bm)this)[bm.llmOlk0("czkii", 627120979, 1780007502, 1780007533, 1780007496, -1087382735, -61136958, -799574626)[1]]))) == false) {
            return;
        }
        bm.llmOlk0("ofvv", 627120983, 1780007529, 1780007510, 1780007526, -1237679802, -1926169019, 586063734, (bP)((bP)((Object)bm.llmOlk0("ijyaju", 627120981, 1780007502, 1780007501, 1780007498, -1306378486, 71833345, -385403573, (bm)this)[bm.llmOlk0("czkii", 627120979, 1780007502, 1780007533, 1780007496, 111918873, -700382195, 2051898144)[2]])), (MR)mR, (int)bm.llmOlk0("ofvv", 627120983, 1780007491, 1780007488, 1780007489, -1237679802, -1926169019, 586063734, (Integer)((Object)bm.llmOlk0("czkii", 627120983, 1780007492, 1780007493, 1780007490, -1237679802, -1926169019, 586063734, (lb)((lb)((Object)bm.llmOlk0("qozwwzb", 627120981, 1780007502, 1780007501, 1780007498, -709630354, 983088336, 314181907, (bm)this)[bm.llmOlk0("lqlb", 627120979, 1780007502, 1780007533, 1780007496, -871332594, 790470724, 1826027730)[3]]))))), (float)bm.llmOlk0("nlwbdkdx", 627120983, 1780007507, 1780007531, 1780007528, -1237679802, -1926169019, 586063734, (Float)((Float)((Object)bm.llmOlk0("qozwwzb", 627120983, 1780007530, 1780007493, 1780007490, -1237679802, -1926169019, 586063734, (lQ)((lQ)((Object)bm.llmOlk0("ijyaju", 627120981, 1780007502, 1780007501, 1780007498, -1029639346, 2125298155, 112715064, (bm)this)[bm.llmOlk0("ofvv", 627120979, 1780007502, 1780007499, 1780007496, 225942886, 1271202745, -2129153359)[0]])))))), (int)bm.llmOlk0("lqlb", 627120983, 1780007507, 1780007488, 1780007489, -1237679802, -1926169019, 586063734, (Float)((Float)((Object)bm.llmOlk0("mthvj", 627120983, 1780007530, 1780007493, 1780007490, -1237679802, -1926169019, 586063734, (lQ)((lQ)((Object)bm.llmOlk0("qozwwzb", 627120981, 1780007502, 1780007501, 1780007498, 862508095, -800882332, 1400136366, (bm)this)[bm.llmOlk0("mthvj", 627120979, 1780007502, 1780007499, 1780007496, -763085693, 720485757, 281494325)[1]])))))), (FloatBuffer)((FloatBuffer)((Object)bm.llmOlk0("nlwbdkdx", 627120981, 1780007502, 1780007501, 1780007498, -492016079, -693441925, -1058422833, (bm)this)[bm.llmOlk0("nlwbdkdx", 627120979, 1780007502, 1780007499, 1780007496, 69590159, -1638786226, 1940807152)[2]])));
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateRight(Integer.rotateLeft(-Integer.rotateLeft(Integer.rotateLeft(Integer.rotateRight(n, 31), 29), 2) ^ 0x25EE4ABD, 27), 4);
    }

    @uF
    public void N(MU mU) {
        bm.llmOlk0("unydym", 627120983, 1780007502, 1780007503, 1780007500, -1237679802, -1926169019, 586063734, (bm)this);
        if (bm.llmOlk0("lqlb", 627120983, 1780007497, 1780007494, 1780007495, -1237679802, -1926169019, 586063734, (lv)((lv)((Object)bm.llmOlk0("mthvj", 627120981, 1780007502, 1780007501, 1780007498, -211828981, -2031736155, 1124330382, (bm)this)[bm.llmOlk0("qozwwzb", 627120979, 1780007502, 1780007499, 1780007496, -837358510, -1809430971, 708048367)[3]]))) != false) {
            CallSite callSite = bm.llmOlk0("unydym", 627120983, 1780007491, 1780007488, 1780007489, -1237679802, -1926169019, 586063734, (Integer)((Object)bm.llmOlk0("xwqe", 627120983, 1780007492, 1780007493, 1780007490, -1237679802, -1926169019, 586063734, (lb)((lb)((Object)bm.llmOlk0("lqlb", 627120981, 1780007502, 1780007501, 1780007498, 443169236, -1860467430, 584822404, (bm)this)[bm.llmOlk0("czkii", 627120979, 1780007502, 1780007499, 1780007496, -600308822, -1359363658, 1689821078)[4]])))));
            bm.llmOlk0("ijyaju", 627120983, 1780007515, 1780007512, 1780007513, -1237679802, -1926169019, 586063734, (MU)mU, (float)((float)bm.llmOlk0("ofvv", 627120985, 1780007518, 1780007519, 1780007516, -1237679802, -1926169019, 586063734, (int)callSite) / bm.llmOlk0("ofvv", 627120979, 1780007502, 1780007517, 1780007514, -1141710189, -1157030491, -564390539)[1]));
            bm.llmOlk0("lqlb", 627120983, 1780007515, 1780007510, 1780007513, -1237679802, -1926169019, 586063734, (MU)mU, (float)((float)bm.llmOlk0("lqlb", 627120985, 1780007518, 1780007510, 1780007516, -1237679802, -1926169019, 586063734, (int)callSite) / bm.llmOlk0("xwqe", 627120979, 1780007502, 1780007517, 1780007514, -1805601945, 1973123668, -935870496)[2]));
            bm.llmOlk0("nlwbdkdx", 627120983, 1780007515, 1780007501, 1780007513, -1237679802, -1926169019, 586063734, (MU)mU, (float)((float)bm.llmOlk0("ofvv", 627120985, 1780007518, 1780007493, 1780007516, -1237679802, -1926169019, 586063734, (int)callSite) / bm.llmOlk0("mthvj", 627120979, 1780007502, 1780007517, 1780007514, -1450267943, -1964824750, 1927908229)[3]));
            bm.llmOlk0("ijyaju", 627120983, 1780007515, 1780007519, 1780007513, -1237679802, -1926169019, 586063734, (MU)mU, (float)((float)bm.llmOlk0("xwqe", 627120985, 1780007518, 1780007512, 1780007516, -1237679802, -1926169019, 586063734, (int)callSite) / bm.llmOlk0("lqlb", 627120979, 1780007502, 1780007517, 1780007514, 1598778253, 1380570982, 2115741568)[4]));
        }
    }

    private static /* synthetic */ int R(int n) {
        return Integer.rotateRight(Integer.rotateRight(-Integer.rotateRight(n ^ 0x1A5977CC, 31), 28), 2);
    }

    private static /* synthetic */ String R(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-76, 56, -95, -48, -3, -47, 123, 51, -112, 11, 24, -127, 103, -33, 8, 79};
        int n = 0;
        int n2 = 0;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 239;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        lOs0q0r = "@\u00ead\u00f9\u00a0+\u00fbA\u00ba\u00d1X\u00ea\u00c4\u00e4\u0018i\u0096\u0093;l\u00d5\u00bb\u000f\u00df\u0003\u00f9\u00c7G\u00f6\u00f0\u00b8\u00ec\u009d\u0019\u0003T\u0084\u00ead\u00f9\u00a0+\u00fbA\u00ba\u00c4D*d\u00f9\u00a0+\u00fbA\u00ba\u00ca_\u0097l\u00f4\u009e?\u00c4~\u00d0\u00cb\u0006\u00dc\u008d\u00cc\u00c7\u00b1\u00ee\u00f3J\u00de\u00ac\u0018\u0091B\u00fc\u00c9\u0006\u00d7\u00b3\u0098\u00ef\u0083\u00e5\u00caF\u00d9\u00bf\u000b\u0085\u0005\u00c3\u0097\t\u00e5Bzoi\u0018\t\u00e9MYA\u00c71\t\u00f3\u00b0\u0018\u00c8M\u00ba\u00caH\u00ff\u00b8\u00d8\u00c1\u0095\u0016|C\u00cb\u00e1\u00d7\u00edW\u00f1\u0089l\u00d5\u00bb\u000f\u00df\u0003\u00e0\u00d2@\u00fd\u00f0\u0091\u00fb\u0099\u00c4\u00d5I\u00d0\u00b4V\u00ee^\u00f0\u00c2@\u00f2\u00be\u0083\u00eb\u00cc\u008e\u00edk\u00fb\u009c\u0003\u00eci\u00f8\u0089E\u00e6\u00e4\u00a0R\u00da\u00bb\r\u00dbj\u00f9\u00c9H\u00e5\u009d\u0082\u00e8\u0091\u0019\u00b1yN\u00cb\u008c\u0018\u00d2Y\u00f0rA\u00c9\u00bbV\u00d2M\u00fb\u00c1\u0006\u00d7\u00b3\u0098\u00ef\u0083\u00aes\u0011i\u0096\u0096\u0013\u00dfZ\u00f4\u0089G\u00f8\u00b0\u00d8\u00c8\u009bqXT\u00fd\u00af\u001f\u00d8I\u00e7\u009d\u0097l\u00f4\u009e?\u00c4~\u00d0\u00cb\u0006\u00fd\u00b8\u00cc\u00a7\u00bb\u00ec\u00fbf\u00c5\u0088<\u00d3\u0003\u00f9\u00d1\u0012rA\u00c9\u00bbV\u00d2M\u00fb\u00c1\u0006\u00d8\u00b1\u0083\u00eb\u0090\u0019jbs\u00f5*d\u00f9\u00a0+\u00fbA\u00ba\u00c4yRd\u00f9\u00a0+\u00fbA\u00ba\u00caB+d\u00f9\u00a0+\u00fbA\u00ba\u00cax\u0018l\u00d5\u00bb\u000f\u00df\u0003\u00fb\u00cfF\u00be\u0099\u009b\u00e1\u0096trU\u00d9\u00bc\u001c\u00cc\u0017\u00dc\u008f\u007f\u00efR\u0089i\u00f6\u00f30\u0089l\u00f4\u009e?\u00c4~\u00d0\u00cb\u0006\u00fd\u0086\u00cc\u00c2\u009d\u00c6\u00d7A\u0090\u00b6\u0018\u00d0K\u00ba\u00f5]\u00e3\u00b6\u0099\u00e9\u00cc\u00ee\u0088l\u00f4\u009e?\u00c4~\u00d0\u00cb\u0006\u00fd\u00bd\u00cc\u0011\t\u00f9\u001c\t\u00f6\u00d4zA\u00c9\u00bbV\u00d2M\u00fb\u00c1\u0006\u00dc\u00be\u0083\u00e6\u00f5l\u00d5\u00bb\u000f\u00df\u0003\u00f9\u00c7G\u00f6\u00f0\u00a4\u00fa\u0085i\u00c0G\u0084L*d\u00f9\u00a0+\u00fbA\u00ba\u00ca^\u000fR\u00d8\u00f5\u0015\u00c9F\u00f2\u00ca\u0006\u00d3\u00aa\u0091\u00e8\u0092\u000e5T\u00d6\u00b6\n0l\u00f4\u009e?\u00c4~\u00d0\u00cb\u0006\u00fd\u0086\u00cc\u00c2\u009d\u001dnA\u0090\u00b6\u0018\u00d0K\u00ba\u00f5]\u00e3\u00b6\u0099\u00e9\u00cc'Tk\u00fb\u009c\u0003\u00eci\u00f8\u0089E\u00e7\u00e4\u00de\u00c2\u00bc8^Z\u00ed\u009f\u0014\u0091@\u00ff\u009d\u00ead\u00f9\u00a0+\u00fbA\u00ba\u00c2\u007f;f\u00a5L\u00d0\u00bb\r\u00e8M\u00f9\u00d3L\u00e5d\u00f9\u00a0+\u00fbA\u00ba\u00caK\u0088d\u00f9\u00a0+\u00fbA\u00ba\u00eb|\u0018l\u00f4\u009e?\u00c4~\u00d0\u00cb\u0006\u00fd\u0086\u00cc\u00c2\u009daFA\u0090\u00b6\u0018\u00d0K\u00ba\u00f5]\u00e3\u00b6\u0099\u00e9\u00ccFvf\u00f9\u00f35\u00f5h\u00d3\u00dc{\u00d4\u00b2\u00d8\u00e2\u00a6;\u00f5bIf\u0096\u00962\u00faj\u00ef\u00f4l\u00fc\u00f0\u00ba\u00db\u00cc";
        ootnjq0m = new int[]{2424842, 19070977, 6815747, 28835841, 1179667, 14352385, 0x1210002, 3080202, 720897, 6356995, 36110346, 8585217, 7274516, 0x1100011, 12845064, 26411011, 34668554, 26607617, 917508, 8716289, 35323906, 36765706, 1, 40697871, 8781825, 8650753, 40566786, 851969, 6553602, 0xCC000F, 26673166, 7077891, 22937605, 65546, 21102618, 14417921, 20447242, 35454986, 26214403, 19136522, 3735592, 22806529, 27590675, 786433, 19791882, 30933049, 22872065, 0x660002, 23265325, 8847404, 37421104, 7012353, 29556757, 11730961, 14483481, 28901386, 16121882};
        bm.m();
        bm.j();
        bm.v();
        bm.s();
        bm.b();
        bm.P();
    }

    private static /* synthetic */ CallSite llmOlk0(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = ootnjq0m[n2 ^ 0x6A18C24E];
        int n9 = n8 >>> 16;
        String string2 = bm.llmkr(lOs0q0r.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x6A18C24E);
        n8 = ootnjq0m[n3 ^ 0x6A18C24E];
        int n10 = n8 >>> 16;
        String string3 = bm.llmkr(lOs0q0r.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x6A18C24E);
        n8 = ootnjq0m[n4 ^ 0x6A18C24E];
        int n11 = n8 >>> 16;
        String string4 = bm.llmkr(lOs0q0r.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x6A18C24E);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x25611BE1) + -178;
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

    private static /* synthetic */ void ll0nkj(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[57];
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
        lOs0q0r = stringBuilder.toString();
        ootnjq0m = nArray;
    }

    private static /* synthetic */ String llmkr(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-18, -41, 81, -9, -113, 64, -10, 79, 80, -2, 79, -114, -38, -34, 45, 81};
        byte[] byArray3 = new byte[]{115, -20, 126, -97, -114, -22, -122, 13, 6, -12, 117, 83, -98, -69, -74, 83};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite OljpmIk(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = ootnjq0m[n2 ^ 0x6A18C24E];
        int n8 = n7 >>> 16;
        String string2 = bm.llmkr(lOs0q0r.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0x6A18C24E);
        n7 = ootnjq0m[n3 ^ 0x6A18C24E];
        int n9 = n7 >>> 16;
        String string3 = bm.llmkr(lOs0q0r.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0x6A18C24E);
        n7 = ootnjq0m[n4 ^ 0x6A18C24E];
        int n10 = n7 >>> 16;
        String string4 = bm.llmkr(lOs0q0r.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0x6A18C24E);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x25611BE1) + -178;
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

    private static /* synthetic */ CallSite Illkitr(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) throws Exception {
        int n9 = ootnjq0m[n2 ^ 0x6A18C24E];
        int n10 = n9 >>> 16;
        String string2 = bm.llmkr(lOs0q0r.substring(n10, n10 + (n9 & 0xFFFF)), n2 ^ 0x6A18C24E);
        n9 = ootnjq0m[n3 ^ 0x6A18C24E];
        int n11 = n9 >>> 16;
        String string3 = bm.llmkr(lOs0q0r.substring(n11, n11 + (n9 & 0xFFFF)), n3 ^ 0x6A18C24E);
        n9 = ootnjq0m[n4 ^ 0x6A18C24E];
        int n12 = n9 >>> 16;
        String string4 = bm.llmkr(lOs0q0r.substring(n12, n12 + (n9 & 0xFFFF)), n4 ^ 0x6A18C24E);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x25611BE1) + -178;
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

    private static /* synthetic */ CallSite I1kIplsj0(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = ootnjq0m[n2 ^ 0x6A18C24E];
        int n9 = n8 >>> 16;
        String string2 = bm.llmkr(lOs0q0r.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x6A18C24E);
        n8 = ootnjq0m[n3 ^ 0x6A18C24E];
        int n10 = n8 >>> 16;
        String string3 = bm.llmkr(lOs0q0r.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x6A18C24E);
        n8 = ootnjq0m[n4 ^ 0x6A18C24E];
        int n11 = n8 >>> 16;
        String string4 = bm.llmkr(lOs0q0r.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x6A18C24E);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x25611BE1) + -178;
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
