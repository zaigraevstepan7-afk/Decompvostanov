/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NNNYO
 *  KDFzREm.NNNZg
 *  KDFzREm.NNNwS
 *  KDFzREm.NNPg
 *  KDFzREm.NNde
 *  KDFzREm.NNiz
 *  KDFzREm.NNnC
 *  KDFzREm.NNnS
 *  KDFzREm.NNnf
 *  KDFzREm.NNty
 *  KDFzREm.NNuU
 *  KDFzREm.NNyx
 *  KDFzREm.NXi
 *  KDFzREm.NbK
 *  KDFzREm.Ned
 *  KDFzREm.ow
 *  baritone.api.IBaritone
 *  baritone.api.behavior.IPathingBehavior
 *  baritone.api.pathing.goals.Goal
 *  baritone.api.pathing.goals.GoalBlock
 *  baritone.api.process.ICustomGoalProcess
 *  org.joml.Vector2f
 *  org.joml.Vector3d
 *  org.joml.Vector3dc
 */
package KDFzREm;

import KDFzREm.BY;
import KDFzREm.Bm;
import KDFzREm.MB;
import KDFzREm.MM;
import KDFzREm.NNNYO;
import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNPg;
import KDFzREm.NNde;
import KDFzREm.NNiz;
import KDFzREm.NNnC;
import KDFzREm.NNnS;
import KDFzREm.NNnf;
import KDFzREm.NNty;
import KDFzREm.NNuU;
import KDFzREm.NNyx;
import KDFzREm.NXi;
import KDFzREm.NbK;
import KDFzREm.Ned;
import KDFzREm.RV;
import KDFzREm.Re;
import KDFzREm.Rt;
import KDFzREm.Ry;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.id;
import KDFzREm.ig;
import KDFzREm.ih;
import KDFzREm.iw;
import KDFzREm.lQ;
import KDFzREm.lT;
import KDFzREm.lY;
import KDFzREm.ow;
import KDFzREm.uA;
import KDFzREm.uF;
import baritone.api.IBaritone;
import baritone.api.behavior.IPathingBehavior;
import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.goals.GoalBlock;
import baritone.api.process.ICustomGoalProcess;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import org.joml.Vector2f;
import org.joml.Vector3d;
import org.joml.Vector3dc;

@UZ(L="FreeCamera", y=UR.MOVEMENT, N=Uz.TOOLS)
public class PN
extends UM {
    private static short[] u;
    private static short[] i;
    private static short[] R;
    private static short[] M;
    private static boolean[] B;
    private static short[] Z;
    private static int[] z;
    private static float[] U;
    private static short[] W;
    private static float[] m;
    public Object[] L;
    private static short[] P;
    private static short[] s;
    private static float[] T;
    private static double[] b;
    private static short[] j;
    private static boolean[] v;
    private static short[] n;
    private static short[] t;
    private static String[] G;
    private static short[] l;
    private static short[] d;
    private static short[] w;
    private static byte[] k;
    private static boolean[] Y;
    private static float[] Q;
    private static float[] O;
    private static short[] g;
    private static short[] I;
    private static /* synthetic */ String OlOkIkrlr;
    private static /* synthetic */ int[] Iljrnni;

    private static /* synthetic */ int L(int n) {
        return Integer.rotateRight(Integer.rotateLeft((n ^ 0xB246A5E7) + 1, 22) ^ 0x56E9696, 7);
    }

    private static /* synthetic */ int M(int n) {
        return Integer.rotateRight(-Integer.rotateLeft(Integer.rotateLeft(-Integer.rotateLeft(-n, 19), 27), 9) ^ 0x6C53F8F, 4);
    }

    private static /* synthetic */ String M(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-25, 98, -3, 29, -59, -122, 87, 87, 94, -48, 43, -49, -94, -25, -61, 31};
        int n = 0;
        int n2 = 108;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 193;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void P() {
        k = new byte[]{3, 2, -1, 7};
    }

    private static void T() {
        z = new int[]{-16777216};
    }

    public PN() {
        PN.lOOpsOs("vpaau", 541571356, -522850743, -522850744, -522850741, 541571356, (PN)this);
        CallSite callSite = PN.lOOpsOs("rffg", 541571346, -522850612, -522850723, -522850609, 541571346, (lY)this, (String)((Object)PN.lOOpsOs("lbfs", 541571352, -522850743, -522850736, -522850784, 541571352)[0]), (float)PN.lOOpsOs("rffg", 541571352, -522850743, -522850611, -522850729, 541571352)[0], (float)PN.lOOpsOs("vzxroup", 541571352, -522850743, -522850611, -522850729, 541571352)[1], (float)PN.lOOpsOs("rffg", 541571352, -522850743, -522850611, -522850729, 541571352)[2], (float)PN.lOOpsOs("snjqas", 541571352, -522850743, -522850611, -522850729, 541571352)[3]);
        PN.lOOpsOs("lucevfb", 541571358, -522850743, -522850742, -522850739, 541571358, (PN)this)[PN.lOOpsOs("vpaau", 541571352, -522850743, -522850616, -522850737, 541571352)[0]] = callSite;
        CallSite callSite2 = PN.lOOpsOs("eshm", 541571346, -522850612, -522850723, -522850609, 541571346, (lY)this, (String)((Object)PN.lOOpsOs("snjqas", 541571352, -522850743, -522850736, -522850784, 541571352)[1]), (float)PN.lOOpsOs("lvzhy", 541571352, -522850743, -522850806, -522850729, 541571352)[0], (float)PN.lOOpsOs("izgvu", 541571352, -522850743, -522850806, -522850729, 541571352)[1], (float)PN.lOOpsOs("izgvu", 541571352, -522850743, -522850806, -522850729, 541571352)[2], (float)PN.lOOpsOs("lbfs", 541571352, -522850743, -522850806, -522850729, 541571352)[3]);
        PN.lOOpsOs("lvzhy", 541571358, -522850743, -522850742, -522850739, 541571358, (PN)this)[PN.lOOpsOs("vpaau", 541571352, -522850743, -522850616, -522850737, 541571352)[1]] = callSite2;
        CallSite callSite3 = PN.lOOpsOs("iwwrg", 541571346, -522850612, -522850723, -522850610, 541571346, (lY)this, (String)((Object)PN.lOOpsOs("vzxroup", 541571352, -522850743, -522850736, -522850784, 541571352)[2]), (boolean)PN.lOOpsOs("lbfs", 541571352, -522850743, -522850613, -522850700, 541571352)[0]);
        PN.lOOpsOs("lbfs", 541571358, -522850743, -522850742, -522850739, 541571358, (PN)this)[PN.lOOpsOs("iwwrg", 541571352, -522850743, -522850616, -522850737, 541571352)[2]] = callSite3;
        CallSite callSite4 = PN.lOOpsOs("lbfs", 541571346, -522850612, -522850723, -522850610, 541571346, (lY)this, (String)((Object)PN.lOOpsOs("eshm", 541571352, -522850743, -522850736, -522850784, 541571352)[3]), (boolean)PN.lOOpsOs("lvzhy", 541571352, -522850743, -522850613, -522850700, 541571352)[1]);
        PN.lOOpsOs("vpaau", 541571358, -522850743, -522850742, -522850739, 541571358, (PN)this)[PN.lOOpsOs("snjqas", 541571352, -522850743, -522850616, -522850737, 541571352)[3]] = callSite4;
        Vector3d vector3d = new Vector3d((double)PN.lOOpsOs("izgvu", 541571352, -522850743, -522850802, -522850815, 541571352)[0], (double)PN.lOOpsOs("iwwrg", 541571352, -522850743, -522850802, -522850815, 541571352)[1], (double)PN.lOOpsOs("vpaau", 541571352, -522850743, -522850802, -522850815, 541571352)[2]);
        PN.lOOpsOs("eshm", 541571358, -522850743, -522850742, -522850739, 541571358, (PN)this)[PN.lOOpsOs("rffg", 541571352, -522850743, -522850616, -522850737, 541571352)[4]] = vector3d;
        Vector3d vector3d2 = new Vector3d((double)PN.lOOpsOs("vpaau", 541571352, -522850743, -522850802, -522850815, 541571352)[3], (double)PN.lOOpsOs("iwwrg", 541571352, -522850743, -522850802, -522850815, 541571352)[4], (double)PN.lOOpsOs("iwwrg", 541571352, -522850743, -522850802, -522850815, 541571352)[5]);
        PN.lOOpsOs("iwwrg", 541571358, -522850743, -522850742, -522850739, 541571358, (PN)this)[PN.lOOpsOs("iwwrg", 541571352, -522850743, -522850616, -522850737, 541571352)[5]] = vector3d2;
        Vector2f vector2f = new Vector2f((float)PN.lOOpsOs("izgvu", 541571352, -522850743, -522850806, -522850729, 541571352)[4], (float)PN.lOOpsOs("lbfs", 541571352, -522850743, -522850806, -522850729, 541571352)[5]);
        PN.lOOpsOs("vpaau", 541571358, -522850743, -522850742, -522850739, 541571358, (PN)this)[PN.lOOpsOs("lvzhy", 541571352, -522850743, -522850616, -522850737, 541571352)[6]] = vector2f;
    }

    static {
        PN.ntfClinit();
    }

    @Override
    public boolean Z() {
        block3: {
            block2: {
                PN.lOOpsOs("snjqas", 541571356, -522850743, -522850744, -522850741, -2010408486, (PN)this);
                if ((NNNwS)PN.lOOpsOs("lbfs", 541571358, -522850745, -522850806, -522850739, 1205055064, (NNuU)((NNuU)PN.lOOpsOs("iwwrg", 541571358, -522850743, -522850750, -522850739, 1741648042, (PN)this)[PN.lOOpsOs("iwwrg", 541571352, -522850743, -522850616, -522850737, 1774667084)[7]]))[PN.lOOpsOs("vpaau", 541571352, -522850743, -522850734, -522850737, -1599293236)[0]] == null) break block2;
                if ((NNNZg)PN.lOOpsOs("izgvu", 541571358, -522850745, -522850806, -522850739, -158929809, (NNuU)((NNuU)PN.lOOpsOs("rffg", 541571358, -522850743, -522850750, -522850739, 349559145, (PN)this)[PN.lOOpsOs("lbfs", 541571352, -522850743, -522850734, -522850737, 1122053845)[1]]))[PN.lOOpsOs("iwwrg", 541571352, -522850743, -522850734, -522850737, 37259618)[2]] != null) break block3;
            }
            PN.lOOpsOs("lucevfb", 541571356, -522850743, -522850723, -522850783, -2010408486, (PN)this, (boolean)PN.lOOpsOs("vpaau", 541571352, -522850743, -522850613, -522850700, 1442959040)[2]);
            return (boolean)PN.lOOpsOs("lvzhy", 541571352, -522850743, -522850699, -522850700, 475203581)[0];
        }
        CallSite callSite = PN.lOOpsOs("snjqas", 541571356, -522850698, -522850733, -522850807, -2010408486, (NNNYO)((NNNYO)PN.lOOpsOs("eshm", 541571358, -522850745, -522850746, -522850739, -771654117, (NNuU)((NNuU)PN.lOOpsOs("eshm", 541571358, -522850743, -522850750, -522850739, 1762827361, (PN)this)[PN.lOOpsOs("iwwrg", 541571352, -522850743, -522850734, -522850737, -1314349973)[3]]))[PN.lOOpsOs("pgjpq", 541571352, -522850743, -522850734, -522850737, -1270378814)[4]]));
        CallSite callSite2 = PN.lOOpsOs("vpaau", 541571356, -522850808, -522850750, -522850805, -2010408486, (NNde)callSite);
        PN.lOOpsOs("izgvu", 541571356, -522850738, -522850751, -522850752, -2010408486, (Vector3d)((Vector3d)PN.lOOpsOs("iwwrg", 541571358, -522850743, -522850742, -522850739, 1506218888, (PN)this)[PN.lOOpsOs("izgvu", 541571352, -522850743, -522850712, -522850737, 610842073)[0]]), (Vector3dc)new Vector3d((double)PN.lOOpsOs("eshm", 541571358, -522850816, -522850789, -522850709, -992342610, (NXi)callSite2), (double)PN.lOOpsOs("rffg", 541571358, -522850816, -522850613, -522850709, 2052738917, (NXi)callSite2), (double)PN.lOOpsOs("snjqas", 541571358, -522850816, -522850748, -522850709, 97557853, (NXi)callSite2)));
        PN.lOOpsOs("lbfs", 541571356, -522850738, -522850751, -522850752, -2010408486, (Vector3d)((Vector3d)PN.lOOpsOs("eshm", 541571358, -522850743, -522850742, -522850739, -136965286, (PN)this)[PN.lOOpsOs("lucevfb", 541571352, -522850743, -522850712, -522850737, -1140789121)[1]]), (Vector3dc)((Vector3d)PN.lOOpsOs("rffg", 541571358, -522850743, -522850742, -522850739, -1146925126, (PN)this)[PN.lOOpsOs("lucevfb", 541571352, -522850743, -522850694, -522850737, 733836625)[0]]));
        Vector2f vector2f = new Vector2f((float)PN.lOOpsOs("pgjpq", 541571356, -522850808, -522850693, -522850706, -2010408486, (NNde)callSite), (float)PN.lOOpsOs("iwwrg", 541571356, -522850808, -522850746, -522850706, -2010408486, (NNde)callSite));
        PN.lOOpsOs("vzxroup", 541571358, -522850743, -522850742, -522850739, -1756295161, (PN)this)[PN.lOOpsOs("izgvu", 541571352, -522850743, -522850694, -522850737, -428682095)[1]] = vector2f;
        return (boolean)PN.lOOpsOs("vzxroup", 541571357, -522850614, -522850748, -522850747, -2010408486, (UM)this);
    }

    @Override
    public boolean i() {
        if ((NNNwS)PN.lOOpsOs("snjqas", 541571358, -522850745, -522850806, -522850739, 1456050634, (NNuU)((NNuU)PN.lOOpsOs("lucevfb", 541571358, -522850743, -522850750, -522850739, 1675175668, (PN)this)[PN.lOOpsOs("vpaau", 541571352, -522850743, -522850694, -522850737, -1980428489)[2]]))[PN.lOOpsOs("snjqas", 541571352, -522850743, -522850694, -522850737, 1071518142)[3]] != null && PN.lOOpsOs("snjqas", 541571346, -522850697, -522850746, -522850747, -2010408486) != false) {
            CallSite callSite = PN.lOOpsOs("iwwrg", 541571347, -522850796, -522850597, -522850598, -2010408486, (IBaritone)PN.lOOpsOs("vzxroup", 541571346, -522850697, -522850723, -522850795, -2010408486));
            PN.lOOpsOs("vzxroup", 541571347, -522850595, -522850596, -522850747, -2010408486, (IPathingBehavior)callSite);
            PN.lOOpsOs("rffg", 541571347, -522850595, -522850593, -522850741, -2010408486, (IPathingBehavior)callSite);
        }
        return (boolean)PN.lOOpsOs("lbfs", 541571357, -522850614, -522850746, -522850747, -2010408486, (UM)this);
    }

    private static /* synthetic */ int i(int n) {
        return -Integer.rotateRight(Integer.rotateLeft(n ^ 0xA66B9E2C, 9), 22) ^ 0xBC9A8C38;
    }

    private static /* synthetic */ String i(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{17, 86, -120, -125, -85, 40, -114, 117, -42, 98, 14, -96, -60, 105, 77, -104};
        int n = 0;
        int n2 = 95;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            ++n2;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void b() {
        G = new String[]{"speed-xz", "speed-y", "walk-by-click", "show-camera-position", "x: %s y: %s z: %s"};
    }

    private static void s() {
        b = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 256.0};
    }

    private static void n() {
        Q = new float[]{1.0f, 0.1f, 4.0f, 0.1f};
        T = new float[]{0.6f, 0.1f, 2.0f, 0.1f, 0.0f, 0.0f};
        O = new float[]{2.0f, 2.0f};
        m = new float[]{16.0f, 2.0f, 60.0f, 0.15f, 0.15f, -90.0f, 90.0f, 0.0f};
        U = new float[]{1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, 0.0f};
    }

    private static void m() {
        B = new boolean[]{false, true, false};
        Y = new boolean[]{false, true, true};
        v = new boolean[]{false, true, false, true, true, false, true};
    }

    private void v() {
        if (PN.lOOpsOs("vpaau", 541571358, -522850743, -522850742, -522850739, 541571358, (PN)this) == null) {
            PN.lOOpsOs("vpaau", 541571359, -522850743, -522850742, -522850739, 541571359, (PN)this, (Object[])new Object[PN.lOOpsOs("rffg", 541571352, -522850743, -522850781, -522850782, 541571352)[3]]);
            CallSite callSite = PN.lOOpsOs("lvzhy", 541571358, -522850743, -522850742, -522850739, 541571358, (PN)this);
        }
    }

    private static void j() {
        W = new short[]{0, 1, 2, 3, 4, 5, 6, 0};
        t = new short[]{4, 0, 3, 0, 5};
        w = new short[]{5, 4};
        j = new short[]{5, 6, 0, 4, 2};
        g = new short[]{0, 0};
        i = new short[]{5, 0, 4, 6, 6, 0, 3, 0};
        M = new short[]{4, 3, 5, 5, 5, 0, 3};
        I = new short[]{6, 6, 6, 6, 4, 5};
        Z = new short[]{0, 7};
        n = new short[]{0, 7};
        s = new short[]{0, 7, 0, 7, 0, 7, 0};
        d = new short[]{7, 5, 1, 5, 1};
        l = new short[]{6, 5, 0, 5};
        R = new short[]{0, 6, 6, 0};
        u = new short[]{4, 4, 5, 0, 4, 4, 5, 0};
        P = new short[]{4, 4, 5};
    }

    private static /* synthetic */ int u(int n) {
        return Integer.rotateRight(Integer.rotateRight((n ^ 0x98B26848) + 1, 7), 3);
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{89, -34, 123, 9, 100, -21, 8, -89, 126, -53, 12, -39, -24, -116, 100, 4};
        int n = 0;
        int n2 = 186;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            ++n2;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int y(int n) {
        return Integer.rotateLeft(Integer.rotateLeft(-Integer.rotateLeft(Integer.rotateLeft(Integer.rotateLeft(n ^ 0xA1E1FB58, 21), 13), 23) ^ 0xB0290CC3, 6), 19);
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{42, 23, 57, 57, -102, 98, -92, -90, -33, 80, -52, 39, 69, 119, -62, 110};
        int n = 0;
        int n2 = 46;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 115;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ long N(long l) {
        return Long.rotateRight(Long.rotateRight(Long.rotateLeft(-Long.rotateRight(-l, 44), 2), 55), 29);
    }

    @uF
    public void N(MB mB) {
        PN.lOOpsOs("rffg", 541571356, -522850600, -522850723, -522850783, -2010408486, (MB)mB, (boolean)PN.lOOpsOs("lvzhy", 541571352, -522850743, -522850744, -522850700, -1935235806)[3]);
    }

    @uF(y=uA.AFTER)
    public void N(MM mM) {
        PN.lOOpsOs("lvzhy", 541571356, -522850743, -522850744, -522850741, -2010408486, (PN)this);
        PN.lOOpsOs("snjqas", 541571356, -522850623, -522850723, -522850624, -2010408486, (MM)mM, (float)PN.lOOpsOs("eshm", 541571358, -522850719, -522850720, -522850717, -1782499462, (Vector2f)((Vector2f)PN.lOOpsOs("lbfs", 541571358, -522850743, -522850742, -522850739, -1367741452, (PN)this)[PN.lOOpsOs("eshm", 541571352, -522850743, -522850693, -522850737, 1213540672)[1]])));
        PN.lOOpsOs("eshm", 541571356, -522850623, -522850750, -522850624, -2010408486, (MM)mM, (float)PN.lOOpsOs("vzxroup", 541571358, -522850719, -522850750, -522850717, -1136191265, (Vector2f)((Vector2f)PN.lOOpsOs("lucevfb", 541571358, -522850743, -522850742, -522850739, -1437131890, (PN)this)[PN.lOOpsOs("rffg", 541571352, -522850743, -522850693, -522850737, 870635971)[2]])));
        PN.lOOpsOs("lucevfb", 541571356, -522850623, -522850742, -522850620, -2010408486, (MM)mM, (double)PN.lOOpsOs("vzxroup", 541571346, -522850713, -522850797, -522850619, -2010408486, (double)((double)PN.lOOpsOs("iwwrg", 541571346, -522850621, -522850723, -522850622, -2010408486, (NbK)((NNNwS)PN.lOOpsOs("izgvu", 541571358, -522850745, -522850806, -522850739, -917553242, (NNuU)((NNuU)PN.lOOpsOs("vzxroup", 541571358, -522850743, -522850750, -522850739, 379793139, (PN)this)[PN.lOOpsOs("snjqas", 541571352, -522850743, -522850693, -522850737, -932955500)[3]]))[PN.lOOpsOs("lucevfb", 541571352, -522850743, -522850797, -522850737, 1438004190)[0]]))), (double)PN.lOOpsOs("vpaau", 541571358, -522850738, -522850720, -522850709, 1154278357, (Vector3d)((Vector3d)PN.lOOpsOs("lucevfb", 541571358, -522850743, -522850742, -522850739, -972883625, (PN)this)[PN.lOOpsOs("izgvu", 541571352, -522850743, -522850797, -522850737, -545603363)[1]])), (double)PN.lOOpsOs("pgjpq", 541571358, -522850738, -522850720, -522850709, -1705433965, (Vector3d)((Vector3d)PN.lOOpsOs("lbfs", 541571358, -522850743, -522850742, -522850739, -1533845138, (PN)this)[PN.lOOpsOs("rffg", 541571352, -522850743, -522850797, -522850737, 683576345)[2]]))));
        PN.lOOpsOs("pgjpq", 541571356, -522850623, -522850750, -522850620, -2010408486, (MM)mM, (double)PN.lOOpsOs("lbfs", 541571346, -522850713, -522850797, -522850619, -2010408486, (double)((double)PN.lOOpsOs("vzxroup", 541571346, -522850621, -522850723, -522850622, -2010408486, (NbK)((NNNwS)PN.lOOpsOs("iwwrg", 541571358, -522850745, -522850806, -522850739, 1940238292, (NNuU)((NNuU)PN.lOOpsOs("snjqas", 541571358, -522850743, -522850750, -522850739, -247700899, (PN)this)[PN.lOOpsOs("izgvu", 541571352, -522850743, -522850797, -522850737, -345503603)[3]]))[PN.lOOpsOs("vpaau", 541571352, -522850743, -522850797, -522850737, 59710342)[4]]))), (double)PN.lOOpsOs("rffg", 541571358, -522850738, -522850750, -522850709, -883179689, (Vector3d)((Vector3d)PN.lOOpsOs("iwwrg", 541571358, -522850743, -522850742, -522850739, -1830567369, (PN)this)[PN.lOOpsOs("vzxroup", 541571352, -522850743, -522850797, -522850737, -2079744936)[5]])), (double)PN.lOOpsOs("eshm", 541571358, -522850738, -522850750, -522850709, 284899312, (Vector3d)((Vector3d)PN.lOOpsOs("lbfs", 541571358, -522850743, -522850742, -522850739, 1776655977, (PN)this)[PN.lOOpsOs("vpaau", 541571352, -522850743, -522850797, -522850737, 1228944637)[6]]))));
        PN.lOOpsOs("lvzhy", 541571356, -522850623, -522850723, -522850620, -2010408486, (MM)mM, (double)PN.lOOpsOs("pgjpq", 541571346, -522850713, -522850797, -522850619, -2010408486, (double)((double)PN.lOOpsOs("izgvu", 541571346, -522850621, -522850723, -522850622, -2010408486, (NbK)((NNNwS)PN.lOOpsOs("eshm", 541571358, -522850745, -522850806, -522850739, -757862489, (NNuU)((NNuU)PN.lOOpsOs("izgvu", 541571358, -522850743, -522850750, -522850739, -1256793208, (PN)this)[PN.lOOpsOs("rffg", 541571352, -522850743, -522850797, -522850737, -559806503)[7]]))[PN.lOOpsOs("snjqas", 541571352, -522850743, -522850696, -522850737, 2012290525)[0]]))), (double)PN.lOOpsOs("iwwrg", 541571358, -522850738, -522850695, -522850709, 1590286180, (Vector3d)((Vector3d)PN.lOOpsOs("eshm", 541571358, -522850743, -522850742, -522850739, 1740618770, (PN)this)[PN.lOOpsOs("lbfs", 541571352, -522850743, -522850696, -522850737, -435047260)[1]])), (double)PN.lOOpsOs("eshm", 541571358, -522850738, -522850695, -522850709, 1724490405, (Vector3d)((Vector3d)PN.lOOpsOs("lucevfb", 541571358, -522850743, -522850742, -522850739, 75005110, (PN)this)[PN.lOOpsOs("pgjpq", 541571352, -522850743, -522850696, -522850737, -1198311001)[2]]))));
        PN.lOOpsOs("vzxroup", 541571356, -522850623, -522850723, -522850741, -2010408486, (MM)mM);
    }

    @uF(y=uA.AFTER_ALL)
    public void N(RV rV) {
        PN.lOOpsOs("lvzhy", 541571356, -522850743, -522850744, -522850741, -2010408486, (PN)this);
        if (PN.lOOpsOs("vpaau", 541571356, -522850692, -522850689, -522850747, -2010408486, (Boolean)((Boolean)((Object)PN.lOOpsOs("vzxroup", 541571356, -522850691, -522850746, -522850707, -2010408486, (lT)((lT)((Object)PN.lOOpsOs("izgvu", 541571358, -522850743, -522850742, -522850739, -423182270, (PN)this)[PN.lOOpsOs("lucevfb", 541571352, -522850743, -522850789, -522850737, 623127210)[1]])))))) == false) {
            return;
        }
        Object[] objectArray = new Object[PN.lOOpsOs("iwwrg", 541571352, -522850743, -522850781, -522850782, -1489699969)[0]];
        objectArray[PN.lOOpsOs("lucevfb", 541571352, -522850743, -522850744, -522850700, -1490321391)[0]] = PN.lOOpsOs("vzxroup", 541571346, -522850780, -522850777, -522850778, -2010408486, (int)PN.lOOpsOs("lvzhy", 541571356, -522850738, -522850720, -522850779, -2010408486, (Vector3d)((Vector3d)PN.lOOpsOs("vzxroup", 541571358, -522850743, -522850742, -522850739, -626943352, (PN)this)[PN.lOOpsOs("izgvu", 541571352, -522850743, -522850789, -522850737, -1414800187)[2]])));
        objectArray[PN.lOOpsOs("lucevfb", 541571352, -522850743, -522850744, -522850700, 1269159418)[1]] = PN.lOOpsOs("pgjpq", 541571346, -522850780, -522850777, -522850778, -2010408486, (int)PN.lOOpsOs("pgjpq", 541571356, -522850738, -522850750, -522850779, -2010408486, (Vector3d)((Vector3d)PN.lOOpsOs("snjqas", 541571358, -522850743, -522850742, -522850739, 1923438492, (PN)this)[PN.lOOpsOs("pgjpq", 541571352, -522850743, -522850789, -522850737, -1192812112)[3]])));
        objectArray[PN.lOOpsOs("pgjpq", 541571352, -522850743, -522850781, -522850782, -964748525)[1]] = PN.lOOpsOs("lvzhy", 541571346, -522850780, -522850777, -522850778, -2010408486, (int)PN.lOOpsOs("vzxroup", 541571356, -522850738, -522850695, -522850779, -2010408486, (Vector3d)((Vector3d)PN.lOOpsOs("pgjpq", 541571358, -522850743, -522850742, -522850739, 1465772389, (PN)this)[PN.lOOpsOs("iwwrg", 541571352, -522850743, -522850789, -522850737, 1946459701)[4]])));
        CallSite callSite = PN.lOOpsOs("eshm", 541571346, -522850759, -522850760, -522850757, -2010408486, (String)((Object)PN.lOOpsOs("vpaau", 541571352, -522850743, -522850736, -522850784, -1475713380)[4]), (Object[])objectArray);
        CallSite callSite2 = PN.lOOpsOs("iwwrg", 541571356, -522850745, -522850758, -522850755, -2010408486, (NNuU)((NNuU)PN.lOOpsOs("iwwrg", 541571358, -522850743, -522850750, -522850739, -1173879273, (PN)this)[PN.lOOpsOs("vpaau", 541571352, -522850743, -522850789, -522850737, 185157593)[5]]));
        CallSite callSite3 = PN.lOOpsOs("lvzhy", 541571346, -522850756, -522850797, -522850753, -2010408486);
        float f = (float)PN.lOOpsOs("lucevfb", 541571356, -522850754, -522850730, -522850722, -2010408486, (ow)callSite2) / PN.lOOpsOs("lvzhy", 541571352, -522850743, -522850767, -522850729, 993671371)[0];
        float f2 = (float)PN.lOOpsOs("vzxroup", 541571356, -522850754, -522850768, -522850722, -2010408486, (ow)callSite2) / PN.lOOpsOs("lvzhy", 541571352, -522850743, -522850767, -522850729, -146919884)[1];
        CallSite callSite4 = PN.lOOpsOs("iwwrg", 541571352, -522850743, -522850732, -522850729, -6465302)[0];
        PN.lOOpsOs("lucevfb", 541571346, -522850762, -522850723, -522850615, -2010408486, (Bm)((Object)callSite3), (String)((Object)callSite), (float)(f - PN.lOOpsOs("lucevfb", 541571356, -522850763, -522850750, -522850764, -2010408486, (Bm)((Object)callSite3), (String)((Object)callSite), (float)callSite4, (BY)((BY)((Object)PN.lOOpsOs("lucevfb", 541571352, -522850765, -522850766, -522850739, 2049434660)[PN.lOOpsOs("rffg", 541571352, -522850743, -522850789, -522850737, -1766678207)[6]])), (boolean)PN.lOOpsOs("lbfs", 541571352, -522850743, -522850744, -522850700, 1979782987)[2]) / PN.lOOpsOs("iwwrg", 541571352, -522850743, -522850732, -522850729, -512449080)[1]), (float)(f2 - PN.lOOpsOs("pgjpq", 541571352, -522850743, -522850732, -522850729, 1667923627)[2]), (float)callSite4, (int)PN.lOOpsOs("lbfs", 541571352, -522850743, -522850781, -522850782, -1663080466)[2], (int)PN.lOOpsOs("vpaau", 541571352, -522850743, -522850695, -522850761, 1286668453)[0]);
    }

    @uF
    public void N(Rt rt) {
        PN.lOOpsOs("snjqas", 541571356, -522850770, -522850723, -522850783, -2010408486, (Rt)rt, (boolean)PN.lOOpsOs("vpaau", 541571352, -522850743, -522850744, -522850700, 1526328288)[6]);
    }

    @uF(u=true)
    public void N(iw iw2) {
        block6: {
            block5: {
                PN.lOOpsOs("iwwrg", 541571356, -522850743, -522850744, -522850741, -2010408486, (PN)this);
                if (PN.lOOpsOs("vzxroup", 541571356, -522850692, -522850689, -522850747, -2010408486, (Boolean)((Boolean)((Object)PN.lOOpsOs("eshm", 541571356, -522850691, -522850746, -522850707, -2010408486, (lT)((lT)((Object)PN.lOOpsOs("lucevfb", 541571358, -522850743, -522850742, -522850739, 115922392, (PN)this)[PN.lOOpsOs("eshm", 541571352, -522850743, -522850694, -522850737, -1491656289)[4]])))))) == false) break block5;
                if (PN.lOOpsOs("snjqas", 541571356, -522850690, -522850748, -522850703, -2010408486, (iw)iw2) != (id)((Object)PN.lOOpsOs("pgjpq", 541571352, -522850704, -522850701, -522850739, -1170062007)[PN.lOOpsOs("lbfs", 541571352, -522850743, -522850702, -522850737, 279221473)[0]])) break block5;
                if (PN.lOOpsOs("eshm", 541571356, -522850690, -522850695, -522850722, -2010408486, (iw)iw2) == PN.lOOpsOs("lucevfb", 541571352, -522850743, -522850699, -522850700, 583191855)[1]) break block6;
            }
            return;
        }
        if (PN.lOOpsOs("iwwrg", 541571346, -522850697, -522850746, -522850747, -2010408486) != false) {
            return;
        }
        CallSite callSite = PN.lOOpsOs("lvzhy", 541571356, -522850808, -522850750, -522850805, -2010408486, (NNde)PN.lOOpsOs("iwwrg", 541571356, -522850698, -522850733, -522850807, -2010408486, (NNNYO)((NNNYO)PN.lOOpsOs("izgvu", 541571358, -522850745, -522850746, -522850739, -426154936, (NNuU)((NNuU)PN.lOOpsOs("lbfs", 541571358, -522850743, -522850750, -522850739, 1909463717, (PN)this)[PN.lOOpsOs("vpaau", 541571352, -522850743, -522850702, -522850737, -52388334)[1]]))[PN.lOOpsOs("lbfs", 541571352, -522850743, -522850746, -522850737, 147886103)[0]])));
        CallSite callSite2 = PN.lOOpsOs("rffg", 541571356, -522850816, -522850742, -522850813, -2010408486, (NXi)PN.lOOpsOs("lucevfb", 541571356, -522850803, -522850804, -522850801, -2010408486, (NNNwS)((NNNwS)PN.lOOpsOs("lbfs", 541571358, -522850745, -522850806, -522850739, 487275295, (NNuU)((NNuU)PN.lOOpsOs("vpaau", 541571358, -522850743, -522850750, -522850739, 712140660, (PN)this)[PN.lOOpsOs("lucevfb", 541571352, -522850743, -522850746, -522850737, 635530955)[1]]))[PN.lOOpsOs("lvzhy", 541571352, -522850743, -522850746, -522850737, 712330404)[2]]), (float)PN.lOOpsOs("lbfs", 541571358, -522850719, -522850750, -522850717, -196216319, (Vector2f)((Vector2f)PN.lOOpsOs("vzxroup", 541571358, -522850743, -522850742, -522850739, -1660452949, (PN)this)[PN.lOOpsOs("lvzhy", 541571352, -522850743, -522850746, -522850737, -399637888)[3]])), (float)PN.lOOpsOs("pgjpq", 541571358, -522850719, -522850720, -522850717, -753473984, (Vector2f)((Vector2f)PN.lOOpsOs("vpaau", 541571358, -522850743, -522850742, -522850739, -204021647, (PN)this)[PN.lOOpsOs("eshm", 541571352, -522850743, -522850746, -522850737, 1992468816)[4]]))), (double)PN.lOOpsOs("lvzhy", 541571352, -522850743, -522850802, -522850815, 1046076500)[6]);
        CallSite callSite3 = PN.lOOpsOs("vpaau", 541571356, -522850816, -522850746, -522850814, -2010408486, (NXi)callSite, (NXi)callSite2);
        CallSite callSite4 = PN.lOOpsOs("iwwrg", 541571356, -522850790, -522850723, -522850787, -2010408486, (NNNZg)((NNNZg)PN.lOOpsOs("iwwrg", 541571358, -522850745, -522850806, -522850739, -1013189013, (NNuU)((NNuU)PN.lOOpsOs("vzxroup", 541571358, -522850743, -522850750, -522850739, 1804732634, (PN)this)[PN.lOOpsOs("lbfs", 541571352, -522850743, -522850746, -522850737, 991149832)[5]]))[PN.lOOpsOs("pgjpq", 541571352, -522850743, -522850746, -522850737, 169462521)[6]]), (NNnf)new NNnf((NXi)callSite, (NXi)callSite3, (NNnS)PN.lOOpsOs("rffg", 541571352, -522850811, -522850812, -522850809, 1582937215), (NNnC)PN.lOOpsOs("eshm", 541571352, -522850810, -522850791, -522850792, 1424410583), (NbK)((NNNwS)PN.lOOpsOs("lucevfb", 541571358, -522850745, -522850806, -522850739, 570191006, (NNuU)((NNuU)PN.lOOpsOs("lbfs", 541571358, -522850743, -522850750, -522850739, -302606187, (PN)this)[PN.lOOpsOs("snjqas", 541571352, -522850743, -522850746, -522850737, 1045779202)[7]]))[PN.lOOpsOs("vpaau", 541571352, -522850743, -522850789, -522850737, -1277027952)[0]])));
        if (callSite4 == null || PN.lOOpsOs("snjqas", 541571356, -522850788, -522850723, -522850785, -2010408486, (NNty)callSite4) != PN.lOOpsOs("rffg", 541571352, -522850786, -522850799, -522850800, 1426928535)) {
            return;
        }
        CallSite callSite5 = PN.lOOpsOs("pgjpq", 541571356, -522850788, -522850797, -522850798, -2010408486, (NNty)callSite4);
        PN.lOOpsOs("lucevfb", 541571347, -522850771, -522850772, -522850769, -2010408486, (ICustomGoalProcess)PN.lOOpsOs("lucevfb", 541571347, -522850796, -522850793, -522850794, -2010408486, (IBaritone)PN.lOOpsOs("lvzhy", 541571346, -522850697, -522850723, -522850795, -2010408486)), (Goal)new GoalBlock((int)PN.lOOpsOs("pgjpq", 541571356, -522850775, -522850776, -522850722, -2010408486, (Ned)callSite5), (int)(PN.lOOpsOs("rffg", 541571356, -522850775, -522850773, -522850722, -2010408486, (Ned)callSite5) + PN.lOOpsOs("vzxroup", 541571352, -522850743, -522850699, -522850700, -1517359514)[2]), (int)PN.lOOpsOs("lvzhy", 541571356, -522850775, -522850774, -522850722, -2010408486, (Ned)callSite5)));
    }

    private static /* synthetic */ int N(int n) {
        return -Integer.rotateRight(Integer.rotateRight((Integer.rotateRight(n, 21) ^ 0xB96CDB32) + 1, 17), 12);
    }

    @uF(y=uA.AFTER_ALL)
    public void N(Ry ry) {
        block7: {
            CallSite callSite;
            CallSite callSite2;
            block6: {
                PN.lOOpsOs("vpaau", 541571356, -522850743, -522850744, -522850741, -2010408486, (PN)this);
                PN.lOOpsOs("vzxroup", 541571356, -522850738, -522850751, -522850752, -2010408486, (Vector3d)((Vector3d)PN.lOOpsOs("lvzhy", 541571358, -522850743, -522850742, -522850739, 1792103594, (PN)this)[PN.lOOpsOs("rffg", 541571352, -522850743, -522850740, -522850737, 1102934262)[4]]), (Vector3dc)((Vector3d)PN.lOOpsOs("vpaau", 541571358, -522850743, -522850742, -522850739, 748707773, (PN)this)[PN.lOOpsOs("snjqas", 541571352, -522850743, -522850740, -522850737, -1992449232)[5]]));
                if (PN.lOOpsOs("lvzhy", 541571346, -522850749, -522850750, -522850747, -2010408486) != false) {
                    return;
                }
                CallSite callSite3 = PN.lOOpsOs("lucevfb", 541571346, -522850749, -522850723, -522850735, -2010408486, (int)PN.lOOpsOs("lbfs", 541571356, -522850721, -522850750, -522850722, -2010408486, (NNPg)PN.lOOpsOs("lbfs", 541571358, -522850726, -522850723, -522850724, -469050488, (NNyx)PN.lOOpsOs("iwwrg", 541571358, -522850727, -522850728, -522850725, 1694080942, (NNiz)((NNiz)PN.lOOpsOs("izgvu", 541571358, -522850745, -522850746, -522850739, 429962660, (NNuU)((NNuU)PN.lOOpsOs("izgvu", 541571358, -522850743, -522850750, -522850739, 1020676631, (PN)this)[PN.lOOpsOs("rffg", 541571352, -522850743, -522850748, -522850737, 1699108997)[0]]))[PN.lOOpsOs("vpaau", 541571352, -522850743, -522850748, -522850737, -944646598)[1]])))));
                CallSite callSite4 = PN.lOOpsOs("izgvu", 541571346, -522850749, -522850723, -522850735, -2010408486, (int)PN.lOOpsOs("iwwrg", 541571356, -522850721, -522850750, -522850722, -2010408486, (NNPg)PN.lOOpsOs("lucevfb", 541571358, -522850726, -522850723, -522850724, -1012065898, (NNyx)PN.lOOpsOs("snjqas", 541571358, -522850727, -522850736, -522850725, -73491120, (NNiz)((NNiz)PN.lOOpsOs("lbfs", 541571358, -522850745, -522850746, -522850739, -1783142465, (NNuU)((NNuU)PN.lOOpsOs("pgjpq", 541571358, -522850743, -522850750, -522850739, -1704758363, (PN)this)[PN.lOOpsOs("iwwrg", 541571352, -522850743, -522850728, -522850737, -372512908)[0]]))[PN.lOOpsOs("rffg", 541571352, -522850743, -522850728, -522850737, -428589359)[1]])))));
                CallSite callSite5 = PN.lOOpsOs("lbfs", 541571346, -522850749, -522850723, -522850735, -2010408486, (int)PN.lOOpsOs("lbfs", 541571356, -522850721, -522850750, -522850722, -2010408486, (NNPg)PN.lOOpsOs("vpaau", 541571358, -522850726, -522850723, -522850724, 854141403, (NNyx)PN.lOOpsOs("lucevfb", 541571358, -522850727, -522850734, -522850725, 2011620935, (NNiz)((NNiz)PN.lOOpsOs("rffg", 541571358, -522850745, -522850746, -522850739, 670239540, (NNuU)((NNuU)PN.lOOpsOs("vzxroup", 541571358, -522850743, -522850750, -522850739, -1541467004, (PN)this)[PN.lOOpsOs("iwwrg", 541571352, -522850743, -522850733, -522850737, -692423932)[0]]))[PN.lOOpsOs("rffg", 541571352, -522850743, -522850733, -522850737, -638851565)[1]])))));
                CallSite callSite6 = PN.lOOpsOs("eshm", 541571346, -522850749, -522850723, -522850735, -2010408486, (int)PN.lOOpsOs("vzxroup", 541571356, -522850721, -522850750, -522850722, -2010408486, (NNPg)PN.lOOpsOs("eshm", 541571358, -522850726, -522850723, -522850724, 814440492, (NNyx)PN.lOOpsOs("lvzhy", 541571358, -522850727, -522850731, -522850725, -1186603041, (NNiz)((NNiz)PN.lOOpsOs("rffg", 541571358, -522850745, -522850746, -522850739, 33415878, (NNuU)((NNuU)PN.lOOpsOs("pgjpq", 541571358, -522850743, -522850750, -522850739, 2011287559, (PN)this)[PN.lOOpsOs("vpaau", 541571352, -522850743, -522850733, -522850737, -1769537191)[2]]))[PN.lOOpsOs("iwwrg", 541571352, -522850743, -522850733, -522850737, -1770020567)[3]])))));
                CallSite callSite7 = callSite3 == callSite4 ? PN.lOOpsOs("snjqas", 541571352, -522850743, -522850732, -522850729, 1163120391)[7] : (callSite3 != false ? PN.lOOpsOs("lbfs", 541571352, -522850743, -522850730, -522850729, -1850796682)[0] : (callSite2 = PN.lOOpsOs("vpaau", 541571352, -522850743, -522850730, -522850729, -595747610)[1]));
                callSite = callSite5 == callSite6 ? PN.lOOpsOs("lbfs", 541571352, -522850743, -522850730, -522850729, -1135234889)[2] : (callSite5 != false ? PN.lOOpsOs("izgvu", 541571352, -522850743, -522850730, -522850729, -973327253)[3] : PN.lOOpsOs("lucevfb", 541571352, -522850743, -522850730, -522850729, -773377345)[4]);
                CallSite callSite8 = PN.lOOpsOs("lucevfb", 541571346, -522850749, -522850723, -522850735, -2010408486, (int)PN.lOOpsOs("izgvu", 541571356, -522850721, -522850750, -522850722, -2010408486, (NNPg)PN.lOOpsOs("izgvu", 541571358, -522850726, -522850723, -522850724, -1599809563, (NNyx)PN.lOOpsOs("izgvu", 541571358, -522850727, -522850711, -522850725, -1239378384, (NNiz)((NNiz)PN.lOOpsOs("vpaau", 541571358, -522850745, -522850746, -522850739, 1635890362, (NNuU)((NNuU)PN.lOOpsOs("eshm", 541571358, -522850743, -522850750, -522850739, -1110592541, (PN)this)[PN.lOOpsOs("izgvu", 541571352, -522850743, -522850733, -522850737, 5279041)[4]]))[PN.lOOpsOs("izgvu", 541571352, -522850743, -522850733, -522850737, -844010944)[5]])))));
                CallSite callSite9 = PN.lOOpsOs("vpaau", 541571346, -522850749, -522850723, -522850735, -2010408486, (int)PN.lOOpsOs("lvzhy", 541571356, -522850721, -522850750, -522850722, -2010408486, (NNPg)PN.lOOpsOs("pgjpq", 541571358, -522850726, -522850723, -522850724, -728012930, (NNyx)PN.lOOpsOs("vzxroup", 541571358, -522850727, -522850712, -522850725, 2976739, (NNiz)((NNiz)PN.lOOpsOs("snjqas", 541571358, -522850745, -522850746, -522850739, 116837942, (NNuU)((NNuU)PN.lOOpsOs("eshm", 541571358, -522850743, -522850750, -522850739, -649568878, (PN)this)[PN.lOOpsOs("pgjpq", 541571352, -522850743, -522850733, -522850737, 971934738)[6]]))[PN.lOOpsOs("iwwrg", 541571352, -522850743, -522850711, -522850737, 1890114032)[0]])))));
                if (callSite8 != false) {
                    Vector3d vector3d = (Vector3d)PN.lOOpsOs("pgjpq", 541571358, -522850743, -522850742, -522850739, 1849326437, (PN)this)[PN.lOOpsOs("vpaau", 541571352, -522850743, -522850711, -522850737, 807620723)[1]];
                    PN.lOOpsOs("lvzhy", 541571359, -522850738, -522850750, -522850709, -768563630, (Vector3d)vector3d, (double)(PN.lOOpsOs("izgvu", 541571358, -522850738, -522850750, -522850709, 57837214, (Vector3d)vector3d) + (double)PN.lOOpsOs("vpaau", 541571356, -522850708, -522850705, -522850706, -2010408486, (Float)((Float)((Object)PN.lOOpsOs("snjqas", 541571356, -522850710, -522850746, -522850707, -2010408486, (lQ)((lQ)((Object)PN.lOOpsOs("pgjpq", 541571358, -522850743, -522850742, -522850739, 1762216147, (PN)this)[PN.lOOpsOs("lucevfb", 541571352, -522850743, -522850711, -522850737, -2037664289)[2]]))))))));
                }
                if (callSite9 != false) {
                    Vector3d vector3d = (Vector3d)PN.lOOpsOs("rffg", 541571358, -522850743, -522850742, -522850739, -1901903765, (PN)this)[PN.lOOpsOs("izgvu", 541571352, -522850743, -522850711, -522850737, 1574908296)[3]];
                    PN.lOOpsOs("rffg", 541571359, -522850738, -522850750, -522850709, 202209764, (Vector3d)vector3d, (double)(PN.lOOpsOs("lucevfb", 541571358, -522850738, -522850750, -522850709, -2035139391, (Vector3d)vector3d) - (double)PN.lOOpsOs("izgvu", 541571356, -522850708, -522850705, -522850706, -2010408486, (Float)((Float)((Object)PN.lOOpsOs("vzxroup", 541571356, -522850710, -522850746, -522850707, -2010408486, (lQ)((lQ)((Object)PN.lOOpsOs("iwwrg", 541571358, -522850743, -522850742, -522850739, -1895463764, (PN)this)[PN.lOOpsOs("lvzhy", 541571352, -522850743, -522850711, -522850737, 699582278)[4]]))))))));
                }
                if (callSite != PN.lOOpsOs("izgvu", 541571352, -522850743, -522850730, -522850729, -13151373)[5]) break block6;
                if (callSite2 == PN.lOOpsOs("lvzhy", 541571352, -522850743, -522850730, -522850729, 888146460)[6]) break block7;
            }
            CallSite callSite10 = PN.lOOpsOs("snjqas", 541571346, -522850715, -522850723, -522850716, -2010408486, (float)PN.lOOpsOs("eshm", 541571346, -522850749, -522850723, -522850718, -2010408486, (float)PN.lOOpsOs("izgvu", 541571358, -522850719, -522850720, -522850717, -1194198367, (Vector2f)((Vector2f)PN.lOOpsOs("iwwrg", 541571358, -522850743, -522850742, -522850739, -2029352502, (PN)this)[PN.lOOpsOs("lbfs", 541571352, -522850743, -522850731, -522850737, 1312974103)[0]])), (float)callSite2, (float)callSite));
            Vector3d vector3d = (Vector3d)PN.lOOpsOs("pgjpq", 541571358, -522850743, -522850742, -522850739, 1658573561, (PN)this)[PN.lOOpsOs("izgvu", 541571352, -522850743, -522850731, -522850737, 1645330302)[1]];
            PN.lOOpsOs("vzxroup", 541571359, -522850738, -522850720, -522850709, -562827317, (Vector3d)vector3d, (double)(PN.lOOpsOs("izgvu", 541571358, -522850738, -522850720, -522850709, -1458820379, (Vector3d)vector3d) + (double)(-PN.lOOpsOs("rffg", 541571346, -522850713, -522850732, -522850714, -2010408486, (double)((double)callSite10)) * PN.lOOpsOs("rffg", 541571356, -522850708, -522850705, -522850706, -2010408486, (Float)((Float)((Object)PN.lOOpsOs("eshm", 541571356, -522850710, -522850746, -522850707, -2010408486, (lQ)((lQ)((Object)PN.lOOpsOs("izgvu", 541571358, -522850743, -522850742, -522850739, -419157532, (PN)this)[PN.lOOpsOs("lvzhy", 541571352, -522850743, -522850731, -522850737, -17801621)[2]])))))))));
            Vector3d vector3d2 = (Vector3d)PN.lOOpsOs("lvzhy", 541571358, -522850743, -522850742, -522850739, -1078841094, (PN)this)[PN.lOOpsOs("iwwrg", 541571352, -522850743, -522850731, -522850737, -79691731)[3]];
            PN.lOOpsOs("lvzhy", 541571359, -522850738, -522850695, -522850709, 695328788, (Vector3d)vector3d2, (double)(PN.lOOpsOs("izgvu", 541571358, -522850738, -522850695, -522850709, 1114068413, (Vector3d)vector3d2) + (double)(PN.lOOpsOs("lucevfb", 541571346, -522850713, -522850696, -522850714, -2010408486, (double)((double)callSite10)) * PN.lOOpsOs("rffg", 541571356, -522850708, -522850705, -522850706, -2010408486, (Float)((Float)((Object)PN.lOOpsOs("izgvu", 541571356, -522850710, -522850746, -522850707, -2010408486, (lQ)((lQ)((Object)PN.lOOpsOs("snjqas", 541571358, -522850743, -522850742, -522850739, 1100556446, (PN)this)[PN.lOOpsOs("pgjpq", 541571352, -522850743, -522850693, -522850737, -2098791102)[0]])))))))));
        }
    }

    @uF(y=uA.BEFORE)
    public void N(ih ih2) {
        PN.lOOpsOs("lvzhy", 541571346, -522850749, -522850723, -522850599, -2010408486, (ih)ih2);
    }

    @uF(y=uA.BEFORE)
    public void N(ig ig2) {
        PN.lOOpsOs("lucevfb", 541571356, -522850743, -522850744, -522850741, -2010408486, (PN)this);
        Vector2f vector2f = (Vector2f)PN.lOOpsOs("vpaau", 541571358, -522850743, -522850742, -522850739, 133091496, (PN)this)[PN.lOOpsOs("lvzhy", 541571352, -522850743, -522850740, -522850737, -1656581816)[0]];
        PN.lOOpsOs("lvzhy", 541571359, -522850719, -522850720, -522850717, 1939788013, (Vector2f)vector2f, (float)(PN.lOOpsOs("snjqas", 541571358, -522850719, -522850720, -522850717, 1667516092, (Vector2f)vector2f) + (float)PN.lOOpsOs("lbfs", 541571356, -522850618, -522850797, -522850779, -2010408486, (ig)ig2) * PN.lOOpsOs("izgvu", 541571352, -522850743, -522850732, -522850729, 1106143921)[3]));
        Vector2f vector2f2 = (Vector2f)PN.lOOpsOs("eshm", 541571358, -522850743, -522850742, -522850739, -470446033, (PN)this)[PN.lOOpsOs("lvzhy", 541571352, -522850743, -522850740, -522850737, 907648406)[1]];
        PN.lOOpsOs("snjqas", 541571359, -522850719, -522850750, -522850717, -858918272, (Vector2f)vector2f2, (float)(PN.lOOpsOs("iwwrg", 541571358, -522850719, -522850750, -522850717, -1709283230, (Vector2f)vector2f2) + (float)PN.lOOpsOs("lbfs", 541571356, -522850618, -522850742, -522850779, -2010408486, (ig)ig2) * PN.lOOpsOs("eshm", 541571352, -522850743, -522850732, -522850729, -271378670)[4]));
        PN.lOOpsOs("lucevfb", 541571359, -522850719, -522850750, -522850717, 1039458637, (Vector2f)((Vector2f)PN.lOOpsOs("vzxroup", 541571358, -522850743, -522850742, -522850739, 1579602802, (PN)this)[PN.lOOpsOs("eshm", 541571352, -522850743, -522850740, -522850737, 474106443)[2]]), (float)PN.lOOpsOs("lucevfb", 541571346, -522850713, -522850723, -522850718, -2010408486, (float)PN.lOOpsOs("iwwrg", 541571358, -522850719, -522850750, -522850717, 264695914, (Vector2f)((Vector2f)PN.lOOpsOs("lvzhy", 541571358, -522850743, -522850742, -522850739, -746138336, (PN)this)[PN.lOOpsOs("lvzhy", 541571352, -522850743, -522850740, -522850737, -130811975)[3]])), (float)PN.lOOpsOs("pgjpq", 541571352, -522850743, -522850732, -522850729, -2114613444)[5], (float)PN.lOOpsOs("eshm", 541571352, -522850743, -522850732, -522850729, -218892538)[6]));
        PN.lOOpsOs("pgjpq", 541571356, -522850618, -522850723, -522850741, -2010408486, (ig)ig2);
    }

    @uF(y=uA.AFTER)
    public void N(Re re) {
        PN.lOOpsOs("izgvu", 541571356, -522850617, -522850723, -522850783, -2010408486, (Re)re, (boolean)PN.lOOpsOs("lbfs", 541571352, -522850743, -522850744, -522850700, -1107395750)[4]);
        PN.lOOpsOs("iwwrg", 541571356, -522850617, -522850750, -522850783, -2010408486, (Re)re, (boolean)PN.lOOpsOs("iwwrg", 541571352, -522850743, -522850744, -522850700, -597583657)[5]);
    }

    private static /* synthetic */ int R(int n) {
        return Integer.rotateLeft(Integer.rotateRight(((Integer.rotateLeft(n, 23) ^ 0x29B306F6) + 1 ^ 0x66713392) + 1, 31), 14);
    }

    private static /* synthetic */ String R(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-42, 73, -73, -54, -86, -40, -74, 74, 5, -35, -21, -75, -74, 43, 23, -3};
        int n = 0;
        int n2 = 80;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 173;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        OlOkIkrlr = "(\u0080}\u008ez\u0080\u0012\u00b2\u00c7\u009dFw\u00e9\u00fe}\u008f\u0010\u008e\u00ef\u008an5\u00b1\u00e9\u001a\u00d0y\u00fd\u00fa\u00a1 \u008f\u00fa\u00b9G\u0019\u00f0\u00c3\u0004\u00df^\u00aef\u0082}\u0084\u00de\u009cm\"\u00cc\u00e29\u0091g\u008b\u00a8\u00b8wK\u0080\u0012\u00b2\u00c7\u009dFw\u00c4\u00ed\u00f5\u00a1 \u00a0\u00fa\u00bcti\u00ae\u0095b\u008a\u00a2\u0082\u0012\u00e1\u00d9\u0093o\u001e\u00e4\u00f5\u0011\u00d3\u0005\u0088\u00cb\u00bf\u00b1\u00b2\u00ed\u0018\u0083\u00d1\u009eQ\n\u00db\u00ca{\u00f0d\u00a2\u00f6*\u00d1\u0080\u0012\u00b2\u00c7\u009dFw\u00ce\u00e9]\u0080\u0012\u00b2\u00c7\u009dFw\u00e9\u00d64j\u0082\u00e0\u00e4\u00a1 \u00a0\u00fa\u00bctm\u00a8\u0094eG\u00a58\u00bd\u00f0\u0097M\t\u0080\u0012\u00b2\u00c7\u009dFw\u00d0\u00e90\u00db&\u00a3\u00a1 2\u0082}\u008e\u00c2\u0080\u0012\u00b2\u00c7\u009dFw\u00dc\u00fd\u00ac\u009b\u0080\u0012\u00b2\u00c7\u009dFw\u00d3\u00ea\u00dd\u0080\u0010\u008c\u00bc\u009cK\u0080\u0012\u00b2\u00c7\u009dFw\u00f7\u00c0\u00f7\u0088\u001f\u008c\u00d3\u00a2y\u001d\u00f3\u0088\u001a\u00dca\u00fd\u00ba\u009c\u00c0\u00ac\u0088\u001f\u008c\u00d3\u00a2y\u001d\u00f3\u00888\u00e7\u0011\u008a\u00f9\u00b7\u00f2\u00a5{\u00a4\u00f4\u00b6Lw\u00cd\u00d3&\u00d7D\u00a1\u00a8\u008c\u00ad\u0088\u001f\u008c\u00d3\u00a2y\u001d\u00f3\u00888\u00ea\u0011\u000e\u008f\u0010\u008e\u00ef\u008an5\u00b1\u00e9\u001a\u00d0i\u00fdV\u00a1 \u008b\u00e0\u00ab_7\u00f3\u00e0;\u00dfF\u0096\u00e1\u00b9R\u00a1'\u00bb|\u00ad1\u00a4\u00f1\u0087\u001ao\u00ab\u0092l(\u008d}\u0084\u00ff\u00b9]9\u00b1\u00cb5\u00d0M\u00e9\u00da\u00b8t\u00a13\u00ad\u00e7\u00e3\u00b2\u0088\u001f\u008c\u00d3\u00a2y\u001d\u00f3\u0088=\u00d6\u0011\u00ef\u00c5\u009f\u00e3\u00a5\"\u00a9\u00ba\u00b4J6\u00f9\u0088\u0016\u00d1E\u00aa\u00f6\u00e3\u00e7\u00c4\u0080\u0012\u00b2\u00c7\u009dFw\u00d0\u00e9\u001a\u00e4M\u00dc\u00f7\u0088\u001f\u008c\u00d3\u00a2y\u001d\u00f3\u0088\u001a\u00e6C\u00fd\u00ba\u0096\u0094\u0080\u0012\u00b2\u00c7\u009dFw\u00d0\u00ff=\u0085\u00d1\u00979]\u0080\u0012\u00b2\u00c7\u009dFw\u00dc\u00fe\u000b\u00f8\u00ed\u0018\u0083\u00d1\u009eQ\n\u00db\u00ca{\u00d7N\u00fd\u00ac\u00ed\u0012\u00f0\u00a5\"\u00a9\u00ba\u00b4J6\u00f9\u0088\u0007\u00caX\u00af\u00fdvc\u00b0\u00ed\u0002\u0015\tf\u0088;\u00ba\u00f2\u00f7A7\u00f3\u00cb{\u00e8O\u00a5\u00e7~<\u00f70\u00ab\u00ae\u00f1g7\u00ec\u00c0{\u00d4E\u00ab\u00ff>\u0018\u00a17\u00bc\u00fa\u00aa\u0018<\u00a5\u00a2\u00ed\u0018\u0083\u00d1\u009eQ\n\u00db\u00ca{\u00fcG\u00fdx\u00a5&\u00a1\u00e1\u00b7E=\u00b1\u00c6$\u00d7\u0005\u008f\u00d1\u00e3h\u00ad \u00a7\u00fb\u00bd\u00bf\u00b63\u00e7\u00ff\u00b7F4\u00b1\u00f11\u00dd^\u00a9\u00e1#\u00b6\u00cf\u0080\u0012\u00b2\u00c7\u009dFw\u00f1\u00d0\u00e8\u00ab;\u00a4\u00f0\u00b9E\u000e\u00ff\u00cb!\u00db\u00fc\u00ad1\u00a4\u00f1\u0087\u001ak\u00aa\u009fz\u0080\u0012\u00b2\u00c7\u009dFw\u00cc\u00c2,2\u0080}\u0084\u00de\u009cm\"\u00cc\u00e29\u0091g\u008b\u00a8\u00e3\u00a5\"\u00a9\u00ba\u00b4J6\u00f9\u0088\u0012\u00d2E\u00a7\u00e7\u00c2\u0080\u0012\u00b2\u00c7\u009dFw\u00f2\u00cc\u00ff\u00a1 \u0098\u00f4\u00acC1\u00f0\u00c0\u0016\u00dbB\u00a7\u00e5\u00b3\u00f7\u00b6(\u00ed\u0018\u00aa\u00f4\u00aaB,\u00f1\u00c91\u0091K\u00b6\u00fa\u00f9p\u00b6;\u00ab\u00f0\u00abXw\u00d7\u00e4!\u00cd^\u00a9\u00fe\u0091o\u00a58\u0098\u00e7\u00b7H=\u00ed\u00d4oz\u0080\u0012\u00b2\u00c7\u009dFw\u00d0\u00e9\u0003\u00fb\u00cf\u0080\u0012\u00b2\u00c7\u009dFw\u00d0\u00c4\u000e\u00da\u0002\u008f\u0010\u008e\u00ef\u008an5\u00b1\u00e97\u00e4\u0011\u00c2\u0080\u0012\u00b2\u00c7\u009dFw\u00d0\u00e9 \u00c7\u00e6K\u0080\u0012\u00b2\u00c7\u009dFw\u00d0\u00e9\u001a\u00e7e\u00d1\u0080\u0012\u00b2\u00c7\u009dFw\u00d0\u00c20A\u009e,\u0088>\u00a9\u00e3\u00b9\u00044\u00ff\u00c93\u0091e\u00a4\u00f9\u00e7\u0014\u00b0o\u0012]\u0080\u0012\u00b2\u00c7\u009dFw\u00e9\u00f3\u00c3}@\u00fe\u0015\u0088>\u00a9\u00e3\u00b9\u00044\u00ff\u00c93\u0091y\u00b2\u00e1x \u00a3o\u00cf\u0080\u0012\u00b2\u00c7\u009dFw\u00f7\u00d0\u00dd\u00ed\u000e\u00c1\u0080\u0012\u00b2\u00c7\u009dFw\u00d0\u00e9\u0004\u00d9\u00be\u0080\u0012\u00b2\u00c7\u009dFw\u00dc\u00ca\u0015\u00a5&\u00a1\u00e1\u00b7E=\u00b1\u00c6$\u00d7\u0005\u00b6\u00e1\u00ed\u0014\u00a1'\u00bb\u00ba\u0091h-\u00ed\u00d3;\u00d3m\u00a9\u00f2\u00ee'\u00b6;\u00ab\u00f0\u00abX\u00be\u0080\u0012\u00b2\u00c7\u009dFw\u00d0\u00e9:\u00ed\u00c1\u00b0\u00a2\u00886\u00a9\u00e7\u00b1_7\u00f0\u00c2{\u00dfZ\u00af\u00bc\u00a6\u00eb\u00b0<\u00a1\u00fb\u00bf\u0004?\u00f1\u00c68\u00cd\u0005\u0081\u00fc\u00b7\u00e6\u00ff}\u009e/\u00a1 \u00a0\u00fa\u00bcti\u00ae\u0095b\u008d\u00ec\u00a8;\u00a9\u00e1\u008eJ4\u00eb\u00c2_\u0088\u001f\u008c\u00d3\u00a2y\u001d\u00f3\u0088\u001a\u00f0D\u00a0\u00a8\u00ab;\u008f\u0010\u008e\u00ef\u008an5\u00b1\u00e9\u001a\u00caS\u00fd_\u00ed\u0018\u0083\u00d1\u009eQ\n\u00db\u00ca{\u00d1]\u00fd\u00cf\u0080\u0012\u00b2\u00c7\u009dFw\u00cc\u00d3\u0099P\u00c4\u0080\u0012\u00b2\u00c7\u009dFw\u00cb\u00ea\u00a2\u0088\u001f\u008c\u00d3\u00a2y\u001d\u00f3\u00888\u00e7\u0011\u008a\u00f9\u00b7\u00fc\u00a5{\u00a4\u00f4\u00b6Lw\u00cd\u00d3&\u00d7D\u00a1\u00a8\u0090\u00cc\u0082\u0012\u00e1\u00d9\u0093o\u001e\u00e4\u00f5\u0011\u00d3\u0005\u00aa\u00c2\u00ed\u00b0\u0088>\u00a9\u00e3\u00b9\u00044\u00ff\u00c93\u0091y\u00b2\u00e1\u00b3\u00f6\u00a3o\u0093\u00d9\u00b2J.\u00ff\u00888\u00dfD\u00a1\u00bc\u0095\u00fa\u00ae1\u00ab\u00e1\u00e3\u0002\u0014\u00f4\u00c6\"\u00df\u0005\u00aa\u00f2\u00b4\u00ff\u00eb\u0007\u00bc\u00e7\u00b1E?\u00a5\u00c5\u008f\u0010\u008e\u00ef\u008an5\u00b1\u00e9\u001a\u00eeM\u00fd\u00b2\u0088\u001f\u008c\u00d3\u00a2y\u001d\u00f3\u0088\u0016\u00d3\u0011\u008a\u00f9p\u00ec\u00a5{\u00a4\u00f4\u00b6Lw\u00cd\u00d3&\u00d7D\u00a1\u00a8W\u00dc\u0082\u001d\u0081\u00bc\u008e\u0005\u0080\u0012\u00b2\u00c7\u009dFw\u00f7\u00c3\u00be\u0080\u0012\u00b2\u00c7\u009dFw\u00e9\u00fd\u00b6\u00ad1\u00a4\u00f1\u0087\u001ak\u00ad\u0095z\u0080\u0012\u00b2\u00c7\u009dFw\u00d0\u00e9!\u00eb\u00c4\u0080\u0012\u00b2\u00c7\u009dFw\u00f2\u00f6>\u0080}\u0084\u00de\u009cm\"\u00cc\u00e29\u0091d\u009e\u00fa\u00e1\u00c4\u0080\u0012\u00b2\u00c7\u009dFw\u00d0\u00e9-\u00c6\u0015\u00a5&\u00a1\u00e1\u00b7E=\u00b1\u00c6$\u00d7\u0005\u00a4\u00f6\u00ea\u0016\u00b2=\u00a7\u00e7\u00f7b\b\u00ff\u00d3<\u00d7D\u00a1\u00d1\u00e7\u001f\u00a5\"\u00a1\u00fa\u00aa\u00d4\u008f\u0010\u008e\u00ef\u008an5\u00b1\u00e9\u001a\u00c7R\u00fd\u00f8\u009e}\u009e\u00d55\u00f8\u008d}\u0092U\u0084\u0086\u00b0\u00ed\u0018\u0083\u00d1\u009eQ\n\u00db\u00ca{\u00f0r\u00af\u00a8\u00eb\u00b63\u00e7\u00ff\u00b7F4\u00b1\u00f11\u00dd^\u00a9\u00e1\u00e5\u00e0\u00ea\u00a5:\u00ab\u00f0\u00b4n.\u00fb\u00d5-\u00caB\u00af\u00fd\u00e5\u00f7\u00ed\u0018\u0083\u00d1\u009eQ\n\u00db\u00ca{\u00f0O\u00a2\u00a82\u0088>\u00a9\u00e3\u00b9\u00044\u00ff\u00c93\u0091y\u00b2\u00e1\u00ebt\u00a3o\u008e\u00d9\u0093o\u001e\u00e4\u00f5\u0011\u00d3\u0005\u0084\u00ca\u00b9@\u00ed\u0012\u00a6i\u008b\u0080\u00f7\u0082\u0012\u008e\u00bc\u009e_\u00ed\u0018\u00a2\u00f4\u00aeJw\u00f2\u00c6:\u00d9\u0005\u0089\u00f1\u00e8\u0012\u00a7 \u00f3\u00dd\u00ed\u0018\u00aa\u00f4\u00aaB,\u00f1\u00c91\u0091K\u00b6\u00fa\u00ad\u00bc\u00865\u00ba\u00fc\u00acD6\u00fb\u009c\u00ec\u00ab&\u00ab\u00f0\u009bJ6\u00fd\u00c28$\u00ab&\u00a5\u00f4\u00ac\t\u0080\u0012\u00b2\u00c7\u009dFw\u00d3\u00e5\u00dd\u00ed\u0010<\u0080\u0012\u00b2\u00c7\u009dFw\u00f2\u00f3\u00e2\u00a1 \u00a0\u00fa\u00bcti\u00ae\u0095b\u008ej\u008d\u00ca\u00e5e\u00db\u00ac\u00b05\u00bc\u00fc\u00bbm1\u00fb\u00cb0\u00cdu\u00f6\u00a0\u00eb\u00e8\u00a6`\u00f0\u00a4\u00ef\u001a>\u00a6\u00c4g\u00dfL\u00a0\u00f1\u00b8\u00bb\u00f4`\u00ab\u00a4\u00e0Mi\u00a9\u00932\u008e\u001e\u00a0e\u00b05\u00bc\u00fc\u00bbm1\u00fb\u00cb0\u00cdu\u00f6\u00f6\u00e8 \u00a0c\u00f1\u00f6\u00eaOh\u00fa\u0095g\u0086N\u00f5\u00ab\u00e9%\u00f3c\u00ff\u00a4\u00baO<\u00fa\u0092d\u00d8I\u00f76\u00ab\u00d1\u0080\u0012\u00b2\u00c7\u009dFw\u00d0\u00e9=\u00c4\u00a2\u00ed\u0018\u0083\u00d1\u009eQ\n\u00db\u00ca{\u00f0I\u009c\u00a8\u0005\u0080\u0012\u00b2\u00c7\u009dFw\u00d0\u00ff=\u00ac\u00ed\u001dK\u0080\u0012\u00b2\u00c7\u009dFw\u00d0\u00e9:\u00fd\u00a7\u00ed\u0018\u00aa\u00f4\u00aaB,\u00f1\u00c91\u0091K\u00b6\u00fa\u00f5\u00ed\u00a1<\u00a9\u00e3\u00b1D*\u00b1\u00ee\u0004\u00df^\u00ae\u00fa\u00b4\u00e8\u00861\u00a0\u00f4\u00aeB7\u00ec\u009c<\u0080\u0012\u00b2\u00c7\u009dFw\u00d0\u00e9\u001a\u00c9yp\u00a5\"\u00a9\u00ba\u00b4J6\u00f9\u0088\u001d\u00d0^\u00a3\u00f4\u00e7h";
        Iljrnni = new int[]{7471114, 8781825, 30474243, 53346305, 0x3100013, 15007745, 27328514, 89522193, 11075587, 30801961, 52690954, 94961665, 55508995, 0x3300001, 81002508, 95027201, 108593164, 39714817, 86769678, 83492876, 27459585, 75628558, 55705612, 111083523, 0x5400004, 30736385, 102301697, 108527617, 67960833, 3801089, 8847362, 88342529, 0x3310001, 88014849, 25427969, 81788938, 95617044, 40763407, 63766538, 29163523, 35848209, 108462081, 68026369, 95223814, 79691786, 11272196, 46399500, 4, 8978433, 52625409, 102170625, 102236161, 100597770, 0x1660011, 37617676, 54853642, 28246030, 79036426, 105447470, 3735553, 12189697, 51249154, 262154, 49676301, 6422544, 0x9C000C, 88539151, 102367233, 114819085, 9043979, 0x510011, 49610753, 95092738, 110362635, 82444304, 25493532, 59703308, 20250635, 917518, 111280140, 38404106, 18022414, 87949313, 24576013, 64421918, 48824332, 109379599, 47185931, 80347146, 47972365, 0x1D00001, 91684879, 96927770, 34406422, 18939924, 43581483, 0x303000B, 62980108, 4521996, 101253132, 57147431, 1835022, 60620836, 67305482, 87687172, 53608467, 53411841, 88408066, 100401155, 115671057, 9764871, 20971542, 0x1C00010, 99352582, 71893049, 60489730, 66387982, 0xB0000A, 33488910, 36962314, 23396353, 28180481, 27525130, 102432814, 56492042, 92667939, 102039554, 3866634, 76546086, 30670849, 47906817, 68091914, 11010049, 41746442, 68747312, 15073325, 0xBB000A, 2752527, 8126474, 13959184, 12910598, 39780367, 39059466, 13303818, 22413327, 99745802, 42401810, 112066602, 84279334, 90636304, 98631691};
        PN.j();
        PN.P();
        PN.s();
        PN.T();
        PN.n();
        PN.m();
        PN.b();
    }

    private static /* synthetic */ String l1jsirmp(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-84, 89, -30, 38, 35, 54, -74, -70, 40, -37, -18, -99, 115, 124, 37, 52};
        byte[] byArray3 = new byte[]{63, 122, 96, -5, -126, 113, -57, -25, -98, 88, -3, -79, 115, -82, 116, -45};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite I1mqq(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = Iljrnni[n2 ^ 0xE0D5EE49];
        int n8 = n7 >>> 16;
        String string2 = PN.l1jsirmp(OlOkIkrlr.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0xE0D5EE49);
        n7 = Iljrnni[n3 ^ 0xE0D5EE49];
        int n9 = n7 >>> 16;
        String string3 = PN.l1jsirmp(OlOkIkrlr.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0xE0D5EE49);
        n7 = Iljrnni[n4 ^ 0xE0D5EE49];
        int n10 = n7 >>> 16;
        String string4 = PN.l1jsirmp(OlOkIkrlr.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0xE0D5EE49);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x2047B9AA) + -178;
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

    private static /* synthetic */ void OlinrjpOl(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[151];
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
        OlOkIkrlr = stringBuilder.toString();
        Iljrnni = nArray;
    }

    private static /* synthetic */ CallSite lOOpsOs(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = Iljrnni[n2 ^ 0xE0D5EE49];
        int n7 = n6 >>> 16;
        String string2 = PN.l1jsirmp(OlOkIkrlr.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0xE0D5EE49);
        n6 = Iljrnni[n3 ^ 0xE0D5EE49];
        int n8 = n6 >>> 16;
        String string3 = PN.l1jsirmp(OlOkIkrlr.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0xE0D5EE49);
        n6 = Iljrnni[n4 ^ 0xE0D5EE49];
        int n9 = n6 >>> 16;
        String string4 = PN.l1jsirmp(OlOkIkrlr.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0xE0D5EE49);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x2047B9AA) + -178;
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
