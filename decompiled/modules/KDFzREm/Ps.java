/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NNNwS
 *  KDFzREm.NNuU
 *  KDFzREm.NXi
 *  KDFzREm.NbK
 *  KDFzREm.NjL
 */
package KDFzREm;

import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import KDFzREm.NbK;
import KDFzREm.NjL;
import KDFzREm.PP;
import KDFzREm.PT;
import KDFzREm.Pb;
import KDFzREm.Pj;
import KDFzREm.Pm;
import KDFzREm.Ru;
import KDFzREm.UB;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uv;
import KDFzREm.Uz;
import KDFzREm.il;
import KDFzREm.iw;
import KDFzREm.lL;
import KDFzREm.lQ;
import KDFzREm.lT;
import KDFzREm.lY;
import KDFzREm.ld;
import KDFzREm.ln;
import KDFzREm.lv;
import KDFzREm.uF;
import KDFzREm.uh;
import KDFzREm.ur;
import KDFzREm.zK;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;

@UZ(L="ElytraTarget", y=UR.MOVEMENT, N=Uz.BASE)
public class Ps
extends UM {
    private static String[] i;
    private static boolean[] R;
    private static short[] M;
    private static boolean[] B;
    public Object[] L;
    private static float[] Z;
    private static short[] z;
    private static float[] U;
    private static byte[] W;
    public Object[] u;
    private static float[] m;
    private static short[] P;
    private static short[] s;
    private static String[] T;
    private static /* synthetic */ String lOljIpj;
    private static /* synthetic */ int[] I1lIk0Iql;

    private static /* synthetic */ int L(int n) {
        return Integer.rotateRight(Integer.rotateRight(Integer.rotateLeft((Integer.rotateLeft(n, 20) ^ 0x4C412478) + 1, 7), 30), 10);
    }

    private static /* synthetic */ String M(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-108, -95, 36, -86, -37, -28, 10, 57, -66, -107, 38, -99, 113, -67, -88, 41};
        int n = 0;
        int n2 = 217;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 13;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void P() {
        W = new byte[]{4, 2, 3, 3, 6, 5};
    }

    private static void T() {
        R = new boolean[]{true, false, false, false, true};
        B = new boolean[]{true, false, false, true, true, false};
    }

    public Ps() {
        Ps.l1rlsil("fhzildgg", -332544194, -461515209, -461515210, -461515211, -332544194, (Ps)this);
        CallSite callSite = Ps.l1rlsil("xlmnupz", -332544208, -461515241, -461515213, -461515242, -332544208, (lY)this, (String)((Object)Ps.l1rlsil("vtjiii", -332544198, -461515209, -461515221, -461515222, -332544198)[0]), (float)Ps.l1rlsil("ovvqmrt", -332544198, -461515209, -461515223, -461515224, -332544198)[0], (float)Ps.l1rlsil("vvhn", -332544198, -461515209, -461515223, -461515224, -332544198)[1], (float)Ps.l1rlsil("xlmnupz", -332544198, -461515209, -461515223, -461515224, -332544198)[2], (float)Ps.l1rlsil("boufzvo", -332544198, -461515209, -461515223, -461515224, -332544198)[3]);
        Ps.l1rlsil("xlmnupz", -332544196, -461515209, -461515215, -461515216, -332544196, (Ps)this)[Ps.l1rlsil("fhzildgg", -332544198, -461515209, -461515243, -461515202, -332544198)[0]] = callSite;
        CallSite callSite2 = Ps.l1rlsil("sldqb", -332544208, -461515241, -461515213, -461515245, -332544208, (lY)this, (String)((Object)Ps.l1rlsil("fsqjzhm", -332544198, -461515209, -461515221, -461515222, -332544198)[1]), (boolean)Ps.l1rlsil("ovvqmrt", -332544198, -461515209, -461515244, -461515231, -332544198)[0]);
        Ps.l1rlsil("fhzildgg", -332544196, -461515209, -461515215, -461515216, -332544196, (Ps)this)[Ps.l1rlsil("ovvqmrt", -332544198, -461515209, -461515243, -461515202, -332544198)[1]] = callSite2;
        lQ lQ2 = (lQ)((Object)Ps.l1rlsil("sldqb", -332544194, -461515203, -461515213, -461515246, -332544194, (lQ)((Object)Ps.l1rlsil("fhzildgg", -332544208, -461515241, -461515213, -461515242, -332544208, (lY)this, (String)((Object)Ps.l1rlsil("xlmnupz", -332544198, -461515209, -461515204, -461515222, -332544198)[0]), (float)Ps.l1rlsil("vvhn", -332544198, -461515209, -461515210, -461515224, -332544198)[0], (float)Ps.l1rlsil("rsitb", -332544198, -461515209, -461515210, -461515224, -332544198)[1], (float)Ps.l1rlsil("svtogo", -332544198, -461515209, -461515210, -461515224, -332544198)[2], (float)Ps.l1rlsil("vtjiii", -332544198, -461515209, -461515210, -461515224, -332544198)[3])), lw2 -> {
            Ps.l1rlsil("vvhn", -332544194, -461515209, -461515210, -461515211, -828870362, (Ps)this);
            return (boolean)Ps.l1rlsil("svtogo", -332544194, -461515232, -461515146, -461515214, -828870362, (Boolean)((Boolean)((Object)Ps.l1rlsil("svtogo", -332544194, -461515145, -461515204, -461515205, -828870362, (lT)((lT)((Object)Ps.l1rlsil("fhzildgg", -332544196, -461515209, -461515215, -461515216, -812884480, (Ps)this)[Ps.l1rlsil("vtjiii", -332544198, -461515209, -461515201, -461515202, -1830111898)[6]]))))));
        }));
        Ps.l1rlsil("iiaqg", -332544196, -461515209, -461515215, -461515216, -332544196, (Ps)this)[Ps.l1rlsil("sldqb", -332544198, -461515209, -461515243, -461515202, -332544198)[2]] = lQ2;
        Pj pj = new Pj(this, (String)((Object)Ps.l1rlsil("xlmnupz", -332544198, -461515209, -461515204, -461515222, -332544198)[1]), (boolean)Ps.l1rlsil("svtogo", -332544198, -461515209, -461515244, -461515231, -332544198)[1]);
        Ps.l1rlsil("boufzvo", -332544196, -461515209, -461515229, -461515216, -332544196, (Ps)this)[Ps.l1rlsil("fhzildgg", -332544198, -461515209, -461515243, -461515202, -332544198)[3]] = pj;
        PP pP = new PP(this, (String)((Object)Ps.l1rlsil("svtogo", -332544198, -461515209, -461515204, -461515222, -332544198)[2]), (boolean)Ps.l1rlsil("ovvqmrt", -332544198, -461515209, -461515244, -461515231, -332544198)[2]);
        Ps.l1rlsil("ovvqmrt", -332544196, -461515209, -461515229, -461515216, -332544196, (Ps)this)[Ps.l1rlsil("svtogo", -332544198, -461515209, -461515243, -461515202, -332544198)[4]] = pP;
        lv[] lvArray = new PT[Ps.l1rlsil("svtogo", -332544198, -461515209, -461515227, -461515228, -332544198)[0]];
        lvArray[Ps.l1rlsil("vvhn", -332544198, -461515209, -461515244, -461515231, -332544198)[3]] = new Pb(this, (String)((Object)Ps.l1rlsil("ovvqmrt", -332544198, -461515209, -461515204, -461515222, -332544198)[4]), (boolean)Ps.l1rlsil("rsitb", -332544198, -461515209, -461515244, -461515231, -332544198)[4]);
        lvArray[Ps.l1rlsil("rsitb", -332544198, -461515209, -461515230, -461515231, -332544198)[0]] = new Pm(this, (String)((Object)Ps.l1rlsil("ovvqmrt", -332544198, -461515209, -461515204, -461515222, -332544198)[5]), (boolean)Ps.l1rlsil("iiaqg", -332544198, -461515209, -461515230, -461515231, -332544198)[1]);
        lvArray[Ps.l1rlsil("fsqjzhm", -332544198, -461515209, -461515227, -461515228, -332544198)[1]] = (PP)((Object)Ps.l1rlsil("vtjiii", -332544196, -461515209, -461515229, -461515216, -332544196, (Ps)this)[Ps.l1rlsil("vvhn", -332544198, -461515209, -461515243, -461515202, -332544198)[5]]);
        lvArray[Ps.l1rlsil("ovvqmrt", -332544198, -461515209, -461515227, -461515228, -332544198)[2]] = (Pj)((Object)Ps.l1rlsil("boufzvo", -332544196, -461515209, -461515229, -461515216, -332544196, (Ps)this)[Ps.l1rlsil("svtogo", -332544198, -461515209, -461515247, -461515202, -332544198)[0]]);
        CallSite callSite3 = Ps.l1rlsil("iiaqg", -332544208, -461515241, -461515213, -461515248, -332544208, (lY)this, (String)((Object)Ps.l1rlsil("fhzildgg", -332544198, -461515209, -461515204, -461515222, -332544198)[3]), (lv[])lvArray);
        Ps.l1rlsil("fhzildgg", -332544196, -461515209, -461515229, -461515216, -332544196, (Ps)this)[Ps.l1rlsil("iiaqg", -332544198, -461515209, -461515247, -461515202, -332544198)[1]] = callSite3;
        lQ lQ3 = (lQ)((Object)Ps.l1rlsil("xlmnupz", -332544194, -461515203, -461515213, -461515246, -332544194, (lQ)((Object)Ps.l1rlsil("fsqjzhm", -332544208, -461515241, -461515213, -461515242, -332544208, (lY)this, (String)((Object)Ps.l1rlsil("xlmnupz", -332544198, -461515209, -461515204, -461515222, -332544198)[6]), (float)Ps.l1rlsil("iiaqg", -332544198, -461515209, -461515210, -461515224, -332544198)[4], (float)Ps.l1rlsil("svtogo", -332544198, -461515209, -461515210, -461515224, -332544198)[5], (float)Ps.l1rlsil("fsqjzhm", -332544198, -461515209, -461515210, -461515224, -332544198)[6], (float)Ps.l1rlsil("ovvqmrt", -332544198, -461515209, -461515210, -461515224, -332544198)[7])), lw2 -> {
            Ps.l1rlsil("xlmnupz", -332544194, -461515209, -461515210, -461515211, -828870362, (Ps)this);
            return (boolean)Ps.l1rlsil("iiaqg", -332544194, -461515219, -461515220, -461515214, -828870362, (Pj)((Pj)((Object)Ps.l1rlsil("ovvqmrt", -332544196, -461515209, -461515229, -461515216, -1775434266, (Ps)this)[Ps.l1rlsil("vvhn", -332544198, -461515209, -461515201, -461515202, 1930571012)[5]])));
        }));
        Ps.l1rlsil("vvhn", -332544196, -461515209, -461515229, -461515216, -332544196, (Ps)this)[Ps.l1rlsil("fhzildgg", -332544198, -461515209, -461515233, -461515202, -332544198)[0]] = lQ3;
        ln ln2 = (ln)((Object)Ps.l1rlsil("fsqjzhm", -332544194, -461515237, -461515213, -461515246, -332544194, (ln)((Object)Ps.l1rlsil("ovvqmrt", -332544208, -461515241, -461515213, -461515236, -332544208, (lY)this, (String)((Object)Ps.l1rlsil("rsitb", -332544198, -461515209, -461515204, -461515222, -332544198)[7]), (zK)((zK)((Object)Ps.l1rlsil("sldqb", -332544198, -461515234, -461515235, -461515216, -332544198)[Ps.l1rlsil("rsitb", -332544198, -461515209, -461515233, -461515202, -332544198)[1]])))), lw2 -> {
            Ps.l1rlsil("svtogo", -332544194, -461515209, -461515210, -461515211, -828870362, (Ps)this);
            return (boolean)Ps.l1rlsil("ovvqmrt", -332544194, -461515165, -461515220, -461515214, -828870362, (PP)((PP)((Object)Ps.l1rlsil("vvhn", -332544196, -461515209, -461515229, -461515216, -853277682, (Ps)this)[Ps.l1rlsil("vvhn", -332544198, -461515209, -461515201, -461515202, -564084922)[4]])));
        }));
        Ps.l1rlsil("sldqb", -332544196, -461515209, -461515229, -461515216, -332544196, (Ps)this)[Ps.l1rlsil("svtogo", -332544198, -461515209, -461515233, -461515202, -332544198)[2]] = ln2;
    }

    static {
        Ps.ntfClinit();
    }

    private static /* synthetic */ String B(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-24, -23, -44, -72, -69, 12, 65, 47, 34, -14, 0, 89, -59, 78, 106, 34};
        int n = 0;
        int n2 = 159;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 131;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String Z(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{111, -51, -22, 85, -26, 32, 123, -118, -15, 118, -117, 112, -4, -59, 39, 115};
        int n = 0;
        int n2 = 27;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 91;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int i(int n) {
        return (-Integer.rotateRight(-Integer.rotateRight(n ^ 0x3B45A380, 22), 12) ^ 0xC9B0D4) + 1;
    }

    private static /* synthetic */ String i(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-39, -101, 34, 117, 43, -67, -67, -60, -1, -87, -37, -84, -36, 7, -27, -31};
        int n = 0;
        int n2 = 2;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 243;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void b() {
        T = new String[]{"chase-distance", "overtake"};
        i = new String[]{"overtake-distance", "timing-firework-use", "bind-firework-use", "firework-use", "none-firework-use", "auto-firework-use", "delay-ticks", "manual-hotkey"};
    }

    private static void s() {
        Z = new float[]{50.0f, 10.0f, 200.0f, 5.0f};
        m = new float[]{5.0f, 0.0f, 6.0f, 1.0f, 20.0f, 2.0f, 60.0f, 1.0f};
        U = new float[]{-1.0f, 1.0f, -1.0f, 1.0f};
    }

    private void m() {
        CallSite callSite;
        if (Ps.l1rlsil("boufzvo", -332544196, -461515209, -461515215, -461515216, -332544196, (Ps)this) == null) {
            Ps.l1rlsil("svtogo", -332544195, -461515209, -461515215, -461515216, -332544195, (Ps)this, (Object[])new Object[Ps.l1rlsil("iiaqg", -332544198, -461515209, -461515227, -461515228, -332544198)[3]]);
            callSite = Ps.l1rlsil("xlmnupz", -332544196, -461515209, -461515215, -461515216, -332544196, (Ps)this);
        }
        if (Ps.l1rlsil("iiaqg", -332544196, -461515209, -461515229, -461515216, -332544196, (Ps)this) == null) {
            Ps.l1rlsil("iiaqg", -332544195, -461515209, -461515229, -461515216, -332544195, (Ps)this, (Object[])new Object[Ps.l1rlsil("fhzildgg", -332544198, -461515209, -461515227, -461515228, -332544198)[4]]);
            callSite = Ps.l1rlsil("vtjiii", -332544196, -461515209, -461515229, -461515216, -332544196, (Ps)this);
            callSite[Ps.l1rlsil("sldqb", -332544198, -461515209, -461515227, -461515228, -332544198)[5]] = Ps.l1rlsil("fsqjzhm", -332544208, -461515232, -461515217, -461515218, -332544208, (boolean)Ps.l1rlsil("sldqb", -332544198, -461515209, -461515230, -461515231, -332544198)[5]);
        }
    }

    private static void j() {
        P = new short[]{0, 1, 2, 0, 1, 1};
        M = new short[]{0, 2};
        s = new short[]{3, 0, 4, 5, 4, 0, 4, 5};
        z = new short[]{1, 2, 0, 2, 1, 0, 1};
    }

    private static /* synthetic */ String U(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{120, 31, 120, 22, -41, -99, 82, -44, -100, -4, -120, 50, -3, -55, 33, -26};
        int n = 0;
        int n2 = 193;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 11;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String z(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{10, 15, -109, -75, -47, -71, -73, 26, 31, -107, -46, 77, 46, -38, -33, 117};
        int n = 0;
        int n2 = 252;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 241;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{3, -57, -12, 100, -41, -46, 92, 8, 102, -105, -120, 47, 68, -59, 47, -41};
        int n = 0;
        int n2 = 40;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 79;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int u(int n) {
        return Integer.rotateLeft(Integer.rotateLeft(Integer.rotateLeft(Integer.rotateLeft(n, 10) ^ 0x89AA3E95, 10) ^ 0xC2B9E313, 18) ^ 0x7791C38E, 24);
    }

    private static /* synthetic */ int y(int n) {
        return Integer.rotateLeft(-Integer.rotateLeft(Integer.rotateRight(-n ^ 0x3F70AF6C, 25), 28), 4);
    }

    @Override
    public void y() {
        Ps.l1rlsil("rsitb", -332544194, -461515209, -461515210, -461515211, -332544194, (Ps)this);
        CallSite callSite = Ps.l1rlsil("iiaqg", -332544208, -461515232, -461515217, -461515218, -332544208, (boolean)Ps.l1rlsil("rsitb", -332544198, -461515209, -461515230, -461515231, -332544198)[2]);
        Ps.l1rlsil("boufzvo", -332544196, -461515209, -461515229, -461515216, -332544196, (Ps)this)[Ps.l1rlsil("boufzvo", -332544198, -461515209, -461515233, -461515202, -332544198)[3]] = callSite;
        Ps.l1rlsil("sldqb", -332544193, -461515166, -461515262, -461515211, -332544193, (UM)this);
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{44, 63, 1, 0, 3, 23, 108, 23, 45, 105, 58, 98, -72, -42, 72, -29};
        int n = 0;
        int n2 = 61;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 159;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String E(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{63, -73, 72, 43, -50, 120, -117, -100, -13, 46, -109, 21, -24, -122, -70, -35};
        int n = 0;
        int n2 = 4;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 159;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    @uF
    public void N(uh uh2) {
        Ps.l1rlsil("boufzvo", -332544194, -461515209, -461515210, -461515211, -828870362, (Ps)this);
        if (Ps.l1rlsil("vvhn", -332544208, -461515212, -461515213, -461515214, -828870362) == false) {
            return;
        }
        Ps.l1rlsil("fsqjzhm", -332544194, -461515225, -461515213, -461515226, -828870362, (uh)uh2, (float)Ps.l1rlsil("fsqjzhm", -332544194, -461515206, -461515207, -461515208, -828870362, (Float)((Float)((Object)Ps.l1rlsil("boufzvo", -332544194, -461515203, -461515204, -461515205, -828870362, (lQ)((lQ)((Object)Ps.l1rlsil("iiaqg", -332544196, -461515209, -461515215, -461515216, -1278773957, (Ps)this)[Ps.l1rlsil("xlmnupz", -332544198, -461515209, -461515201, -461515202, -1284250476)[2]])))))));
    }

    @uF
    public void N(Ru ru) {
        Ps.l1rlsil("vvhn", -332544194, -461515209, -461515210, -461515211, -828870362, (Ps)this);
        CallSite callSite = Ps.l1rlsil("rsitb", -332544194, -461515240, -461515257, -461515258, -828870362, (UB)((Object)Ps.l1rlsil("iiaqg", -332544208, -461515238, -461515229, -461515239, -828870362)));
        if (Ps.l1rlsil("vtjiii", -332544194, -461515259, -461515233, -461515214, -828870362, (Uv)((Object)callSite)) == false) {
            return;
        }
        Ps.l1rlsil("fsqjzhm", -332544194, -461515261, -461515262, -461515263, -828870362, (PT)((PT)((Object)Ps.l1rlsil("sldqb", -332544194, -461515260, -461515204, -461515205, -828870362, (ld)((ld)((Object)Ps.l1rlsil("ovvqmrt", -332544196, -461515209, -461515229, -461515216, -1454726055, (Ps)this)[Ps.l1rlsil("fhzildgg", -332544198, -461515209, -461515201, -461515202, 303195844)[3]]))))), (Object)ru);
    }

    @uF
    public void N(ur ur2) {
        Ps.l1rlsil("svtogo", -332544194, -461515209, -461515210, -461515211, -828870362, (Ps)this);
        if (Ps.l1rlsil("fsqjzhm", -332544208, -461515212, -461515213, -461515214, -828870362) == false) {
            return;
        }
        CallSite callSite = Ps.l1rlsil("ovvqmrt", -332544194, -461515264, -461515262, -461515249, -828870362, (ur)ur2);
        CallSite callSite2 = Ps.l1rlsil("vtjiii", -332544208, -461515250, -461515213, -461515254, -828870362, (lL)((Object)Ps.l1rlsil("xlmnupz", -332544208, -461515250, -461515213, -461515251, -828870362)), (NXi)Ps.l1rlsil("iiaqg", -332544208, -461515252, -461515213, -461515253, -828870362, (NbK)callSite));
        if (Ps.l1rlsil("iiaqg", -332544194, -461515264, -461515215, -461515214, -828870362, (ur)ur2) == false && Ps.l1rlsil("ovvqmrt", -332544194, -461515255, -461515256, -461515214, -828870362, (NjL)callSite) != false) {
            if (Ps.l1rlsil("iiaqg", -332544194, -461515232, -461515146, -461515214, -828870362, (Boolean)((Boolean)((Object)Ps.l1rlsil("sldqb", -332544194, -461515145, -461515204, -461515205, -828870362, (lT)((lT)((Object)Ps.l1rlsil("fsqjzhm", -332544196, -461515209, -461515215, -461515216, 669234883, (Ps)this)[Ps.l1rlsil("fhzildgg", -332544198, -461515209, -461515201, -461515202, 1603271601)[0]])))))) != false) {
                CallSite callSite3 = Ps.l1rlsil("ovvqmrt", -332544194, -461515255, -461515147, -461515148, -828870362, (NjL)callSite);
                CallSite callSite4 = Ps.l1rlsil("sldqb", -332544194, -461515150, -461515204, -461515152, -828870362, (NXi)Ps.l1rlsil("vtjiii", -332544194, -461515150, -461515215, -461515151, -828870362, (NXi)Ps.l1rlsil("rsitb", -332544194, -461515150, -461515229, -461515148, -828870362, (NXi)Ps.l1rlsil("iiaqg", -332544194, -461515255, -461515149, -461515148, -828870362, (NjL)callSite)), (double)((double)Ps.l1rlsil("xlmnupz", -332544194, -461515206, -461515207, -461515208, -828870362, (Float)((Float)((Object)Ps.l1rlsil("rsitb", -332544194, -461515203, -461515204, -461515205, -828870362, (lQ)((lQ)((Object)Ps.l1rlsil("svtogo", -332544196, -461515209, -461515215, -461515216, 1245913094, (Ps)this)[Ps.l1rlsil("vvhn", -332544198, -461515209, -461515201, -461515202, 16631166)[1]])))))))), (NXi)callSite3);
                Ps.l1rlsil("ovvqmrt", -332544194, -461515255, -461515138, -461515139, -828870362, (NjL)callSite, (double)Ps.l1rlsil("svtogo", -332544196, -461515150, -461515247, -461515137, -1006641825, (NXi)callSite4), (double)Ps.l1rlsil("fhzildgg", -332544196, -461515150, -461515230, -461515137, -510137379, (NXi)callSite4), (double)Ps.l1rlsil("rsitb", -332544196, -461515150, -461515223, -461515137, -497200239, (NXi)callSite4));
                callSite2 = Ps.l1rlsil("fhzildgg", -332544208, -461515250, -461515213, -461515254, -828870362, (lL)((Object)Ps.l1rlsil("vtjiii", -332544208, -461515250, -461515213, -461515251, -828870362)), (NXi)Ps.l1rlsil("rsitb", -332544208, -461515252, -461515213, -461515253, -828870362, (NbK)callSite));
                Ps.l1rlsil("vtjiii", -332544194, -461515255, -461515138, -461515139, -828870362, (NjL)callSite, (double)Ps.l1rlsil("svtogo", -332544196, -461515150, -461515247, -461515137, 1977221622, (NXi)callSite3), (double)Ps.l1rlsil("vvhn", -332544196, -461515150, -461515230, -461515137, -1780607557, (NXi)callSite3), (double)Ps.l1rlsil("xlmnupz", -332544196, -461515150, -461515223, -461515137, 1954508981, (NXi)callSite3));
            }
        }
        Ps.l1rlsil("xlmnupz", -332544194, -461515264, -461515213, -461515161, -828870362, (ur)ur2, (lL)((Object)Ps.l1rlsil("vtjiii", -332544194, -461515140, -461515213, -461515144, -828870362, (lL)((Object)Ps.l1rlsil("fhzildgg", -332544194, -461515140, -461515213, -461515143, -828870362, (lL)((Object)Ps.l1rlsil("vtjiii", -332544208, -461515250, -461515213, -461515251, -828870362)), (float)(Ps.l1rlsil("fsqjzhm", -332544194, -461515140, -461515262, -461515208, -828870362, (lL)((Object)callSite2)) + Ps.l1rlsil("vvhn", -332544208, -461515141, -461515262, -461515142, -828870362, (float)Ps.l1rlsil("rsitb", -332544198, -461515209, -461515220, -461515224, 1092560082)[0], (float)Ps.l1rlsil("svtogo", -332544198, -461515209, -461515220, -461515224, 1581678890)[1])), (float)(Ps.l1rlsil("boufzvo", -332544194, -461515140, -461515244, -461515208, -828870362, (lL)((Object)callSite2)) + Ps.l1rlsil("iiaqg", -332544208, -461515141, -461515262, -461515142, -828870362, (float)Ps.l1rlsil("iiaqg", -332544198, -461515209, -461515220, -461515224, -524330245)[2], (float)Ps.l1rlsil("iiaqg", -332544198, -461515209, -461515220, -461515224, 1855946847)[3])))), (boolean)Ps.l1rlsil("rsitb", -332544198, -461515209, -461515230, -461515231, 1797830683)[4])));
    }

    private static /* synthetic */ int N(int n) {
        return -Integer.rotateLeft(Integer.rotateRight(-Integer.rotateRight(n ^ 0x81A1E320, 28), 27), 24) ^ 0xAB213D88;
    }

    @uF(u=true)
    public void N(iw iw2) {
        block3: {
            block2: {
                Ps.l1rlsil("vvhn", -332544194, -461515209, -461515210, -461515211, -332544194, (Ps)this);
                if (Ps.l1rlsil("fsqjzhm", -332544194, -461515237, -461515213, -461515162, -332544194, (ln)((ln)((Object)Ps.l1rlsil("ovvqmrt", -332544196, -461515209, -461515229, -461515216, -332544196, (Ps)this)[Ps.l1rlsil("vtjiii", -332544198, -461515209, -461515233, -461515202, -332544198)[4]])), (il)iw2) == false) break block2;
                if (Ps.l1rlsil("fsqjzhm", -332544194, -461515164, -461515256, -461515214, -828870362, (NNNwS)((NNNwS)Ps.l1rlsil("vvhn", -332544196, -461515163, -461515221, -461515216, 1158363807, (NNuU)((NNuU)Ps.l1rlsil("rsitb", -332544196, -461515209, -461515262, -461515216, 2054581052, (Ps)this)[Ps.l1rlsil("svtogo", -332544198, -461515209, -461515233, -461515202, 1024920053)[5]]))[Ps.l1rlsil("fhzildgg", -332544198, -461515209, -461515233, -461515202, -1986706676)[6]])) != false) break block3;
            }
            return;
        }
        CallSite callSite = Ps.l1rlsil("vtjiii", -332544208, -461515232, -461515217, -461515218, -828870362, (boolean)Ps.l1rlsil("rsitb", -332544198, -461515209, -461515230, -461515231, -772430937)[3]);
        Ps.l1rlsil("xlmnupz", -332544196, -461515209, -461515229, -461515216, 538699848, (Ps)this)[Ps.l1rlsil("ovvqmrt", -332544198, -461515209, -461515233, -461515202, 979895051)[7]] = callSite;
    }

    private static /* synthetic */ String R(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{64, -103, 119, -113, -54, 16, -24, -61, -20, 2, -117, -54, -37, -123, -38, 80};
        int n = 0;
        int n2 = 99;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 179;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        lOljIpj = "ld2\u00ffu\u00c5\u00fa=>P\u00db\u000b_\u00f5e\u00f6\u00c91>l\u00c9\u0007Mz0\u00aa\u00c7F\u0015\u00cd4t2\u00fdK\u00be\u00e9/\u0002\u00d8{\u00fe\u00dc\u0016xe\u00c4\rY\nO\u00f9\u00f8kA\u00dd;\u00f2\u00da6'6\u009eZObG\u00aa\u00aao\u0012\u0088n\u00f5\u008b3%4\u009c\rK1N7:\u00f2K\u00d1\u00c5\u0002Tm\u0087'r<D\u00e1OT2\u00ffu\u00c5\u00fa=>N\u00f0\u0000\u0011\r2\u00ffu\u00c5\u00fa=>P\u00fcX_\u00f5D\u00d3\u00f9*CE\u00c5F\u007f#Dn:\u00f2K\u00d1\u00c5\u0002Tm\u0087\u0005sn3\u00a2\u00cc0\u0017\u0096c\u00f6\u00d17>S\u00dc\u001bC;\u0018\u00f3\u00f7o:\u00f2K\u00d1\u00c5\u0002Tm\u0087\u0005~n\u001d\u00dc0\u00a2:\u00d3n\u00e1\u00de\u007f}a\u00c6\u000e\u0005\u0006\u000b\u00ba\u00c4\u0097\u0011\u0082u2\u00ffu\u00c5\u00fa=>N\u00c2%*.X0\u0090C\u00dc\u00fb\u0016kR\u00ed\u0004\u0005 \u0017\u00f3\u00c8b2\u00ffu\u00c5\u00fa=>l\u00e4\u00172\u00ffu\u00c5\u00fa=>l\u00f922\u00ffu\u00c5\u00fa=>U\u00de\u00c9\u000b:\u00f2K\u00d1\u00c5\u0002Tm\u0087'H\u001eD\u00e1\u00e1h2\u00ffu\u00c5\u00fa=>N\u00f0\u0000\u0011(_\u00e3d2\u00ffu\u00c5\u00fa=>u\u00c0\u001b\u0013\u00cdg\u00f8\u00db\u000f$8\u0099]=2\u00ffu\u00c5\u00fa=>l\u00faX:\u00f2K\u00d1\u00c5\u0002Tm\u0087\u0005sn3\u00a2\u0002\u0006\u0017\u0096c\u00f6\u00d17>S\u00dc\u001bC;\u0018\u00f3%60\u00ff&\u00db\u00f4\u0014Wz\u00fa,Gz\u0013\u0099Xq_\u00f5D\u00d3\u00f9*CE\u00c5Fd?3\u00f3h2\u00ffu\u00c5\u00fa=>l\u00c6^,\u0090C\u00fd\u00de&p/\u00c4\bD2P\u008a\f\u0019\u001a\u00dcn\u00f9\u0084\b22\u00ffu\u00c5\u00fa=>N\u00e6\u001c\u007fu\u0017\u00cfn\u00b8\u00d31\u007fg\u0087+E:\u0013\u00adbqd2\u00ffu\u00c5\u00fa=>l\u00c3X\u001a\u00d6n\u00e3\u00e91}u\u00cd\u0007:\u00f2K\u00d1\u00c5\u0002Tm\u0087\u0005fnV\u0084(k0\u00c3]\u00d2\u00d2\u007fdr\u0093Q_\u00ef@-%\u00ea\u0013\u00cdg\u00f8\u00db\u000f'1\u009aQ\u0012\u0019\u00d6c\u00f2\u00de>Ga\u00c4\u001cO\u00af_\u00ff\u0001:\u00f2K\u00d1\u00c5\u0002Tm\u0087\u0005sn3\u00a2\u00fa_\u0017\u0096c\u00f6\u00d17>S\u00dc\u001bC;\u0018\u00f3\u00d7b2\u00ffu\u00c5\u00fa=>z\u00e3R\u0003\u00194\u008c\u00ddS$\u00fcb\u00b8\u00d3>*t_\u00f5D\u00d3\u00f9*CE\u00c5FF\u0019Dd\u00cc2\u00ffu\u00c5\u00fa=>U\u00ea\u00cf_\u00f5D\u00d3\u00f9*CE\u00c5Fd\r\u0016\u00f3X:\u00f2K\u00d1\u00c5\u0002Tm\u0087\u0000FnV\u0092\u0016_\u00f5D\u00d3\u00f9*CE\u00c5F\u007f\u0017D\u0014\u0013\u00cdg\u00f8\u00db\u000f&3\u0099Q\u0013|K2\u00ffu\u00c5\u00fa=>N\u00f0\u0000\u00ac:\u00d3n\u00e1\u00de\u007f}a\u00c6\u000e\u0005\u001a\u001d\u00a2f\u00e7\u0002\u0082&\u00c1\u00af,\u0090C\u00dc\u00fb\u0016kR\u00ed\u0004\u000593\u00f3B7:\u00f2K\u00d1\u00c5\u0002Tm\u0087\u0005sn3\u00a2bi\u0017\u0096c\u00f6\u00d17>S\u00dc\u001bC;\u0018\u00f3XS=\u00fdI\u00ed\u00ed\u0015|/\u00c4\u001f\u0011|3\u0083GY\f\u00ebJ\u00fa\u0090<u;\u0093\u0017\u00cfn\u00b8\u00d31\u007fg\u0087/F:\u001e\u00bcw\u00d10\u00ff&\u00d1\u00ac2\u00ffu\u00c5\u00fa=>w\u00c3#K2\u00ffu\u00c5\u00fa=>U\u00e5)\u00172\u00ffu\u00c5\u00fa=>P\u00c2\u00d1:\u00f2K\u00d1\u00c5\u0002Tm\u0087\u0005fn3\u0083\u00e9\u00bf\f\u00ebJ\u00fa\u0090\u001eIi\u0093@f\u001e;\u008e\u00d7\u00ab3\u00d4 \u00fb\u00f3ky3\u00ac2\u00ffu\u00c5\u00fa=>l\u00cc\u001d=2\u00ffu\u00c5\u00fa=>z\u00e3(:\u00d3n\u00e1\u00de\u007fdt\u00c1\u0005\u00053\n\u00a6\u00cet\u001f\u00d6a\u00b8\u00ef\"td\u00c1\nK!\u001a\u00f3\u0084L=\u00fdI\u00ed\u00ed\u0015|/\u00c4\u001e\u0011\u00bc4\u00160\u00ff&\u00db\u00f4\u0014Wz\u00fa,Gz\u0013\u00848h2\u00ffu\u00c5\u00fa=>w\u00f2b2\u00ffu\u00c5\u00fa=>w\u00e5T2\u00ffu\u00c5\u00fa=>u\u00da\r2\u00ffu\u00c5\u00fa=>P\u00f8/\u0017\u00d5z\u00f2\u00f06d2\u00ffu\u00c5\u00fa=>l\u00fc\u00b22\u00ffu\u00c5\u00fa=>y+\u0013\u00cdg\u00f8\u00db\u000f$7\u009aY\u00ac2\u0090C\u00dc\u00fb\u0016kR\u00ed\u0004\u0005\u001b'\u00a18\u00ac2\u00ffu\u00c5\u00fa=>N\u00e6']\u0006\u00df,D:\u00d3n\u00e1\u00de\u007f}a\u00c6\u000e\u0005\u001a\u001d\u00a2f|\u0002\u0082\u00b5";
        I1lIk0Iql = new int[]{65546, 57278465, 32440323, 51838986, 27459585, 19005443, 15073281, 69140499, 52494337, 32702466, 15794186, 32636929, 720916, 50462735, 30081034, 34340867, 19202058, 14090255, 14024705, 60882946, 56557569, 46661633, 69009410, 0x1B00011, 64684039, 26017814, 53280778, 43515905, 0x3110001, 11993107, 39124993, 11862018, 29425674, 21233712, 53215233, 70385665, 8847405, 57999404, 0x1050001, 46727225, 13959169, 57344010, 2424878, 34537528, 25362442, 65798153, 41811982, 39190538, 1, 7929870, 16449546, 56623114, 7274506, 56492033, 44302357, 63373322, 24379407, 20578314, 38207502, 62717962, 17170460, 53936167, 13238283, 32833547, 65142794, 0x200000C, 42729484, 39845903, 66387979, 43581451, 0x4000010, 5439516, 11796481, 19857419, 2031622, 15138826, 62062602, 51511301, 61014032, 45678607, 30736410, 40828943, 27525132, 68157453, 64028682, 52559882};
        Ps.j();
        Ps.P();
        Ps.s();
        Ps.T();
        Ps.b();
    }

    private static /* synthetic */ void l1IpI(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[86];
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
        lOljIpj = stringBuilder.toString();
        I1lIk0Iql = nArray;
    }

    private static /* synthetic */ String lIsssj(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{74, 19, -51, 51, 58, 12, 99, 116, -77, 101, 85, 22, 60, 105, -83, -50};
        byte[] byArray3 = new byte[]{117, -124, -43, -111, 70, 3, -101, -126, 32, 125, -126, -23, -105, -82, 113, 7};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite OlrkOs0s(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = I1lIk0Iql[n2 ^ 0xE47DD637];
        int n9 = n8 >>> 16;
        String string2 = Ps.lIsssj(lOljIpj.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0xE47DD637);
        n8 = I1lIk0Iql[n3 ^ 0xE47DD637];
        int n10 = n8 >>> 16;
        String string3 = Ps.lIsssj(lOljIpj.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0xE47DD637);
        n8 = I1lIk0Iql[n4 ^ 0xE47DD637];
        int n11 = n8 >>> 16;
        String string4 = Ps.lIsssj(lOljIpj.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0xE47DD637);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xEC2DC788) + -178;
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

    private static /* synthetic */ CallSite l1rlsil(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = I1lIk0Iql[n2 ^ 0xE47DD637];
        int n7 = n6 >>> 16;
        String string2 = Ps.lIsssj(lOljIpj.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0xE47DD637);
        n6 = I1lIk0Iql[n3 ^ 0xE47DD637];
        int n8 = n6 >>> 16;
        String string3 = Ps.lIsssj(lOljIpj.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0xE47DD637);
        n6 = I1lIk0Iql[n4 ^ 0xE47DD637];
        int n9 = n6 >>> 16;
        String string4 = Ps.lIsssj(lOljIpj.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0xE47DD637);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xEC2DC788) + -178;
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

    private static /* synthetic */ CallSite lIOssllt(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = I1lIk0Iql[n2 ^ 0xE47DD637];
        int n7 = n6 >>> 16;
        String string2 = Ps.lIsssj(lOljIpj.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0xE47DD637);
        n6 = I1lIk0Iql[n3 ^ 0xE47DD637];
        int n8 = n6 >>> 16;
        String string3 = Ps.lIsssj(lOljIpj.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0xE47DD637);
        n6 = I1lIk0Iql[n4 ^ 0xE47DD637];
        int n9 = n6 >>> 16;
        String string4 = Ps.lIsssj(lOljIpj.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0xE47DD637);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xEC2DC788) + -178;
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
