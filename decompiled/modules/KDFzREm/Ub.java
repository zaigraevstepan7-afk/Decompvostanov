/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NHS
 *  KDFzREm.NNNZg
 *  KDFzREm.NNNwS
 *  KDFzREm.NNnC
 *  KDFzREm.NNnS
 *  KDFzREm.NNuU
 *  KDFzREm.NXi
 *  KDFzREm.NbK
 *  KDFzREm.NjL
 */
package KDFzREm;

import KDFzREm.NHS;
import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNnC;
import KDFzREm.NNnS;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import KDFzREm.NbK;
import KDFzREm.NjL;
import KDFzREm.Ru;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.ie;
import KDFzREm.ig;
import KDFzREm.lL;
import KDFzREm.lQ;
import KDFzREm.lY;
import KDFzREm.uF;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.function.Predicate;

@UZ(L="AimAssist", y=UR.COMBAT, N=Uz.FIGHTING)
public class Ub
extends UM {
    private static boolean[] i;
    private static short[] R;
    private static double[] M;
    private static double[] B;
    private static double[] Z;
    private static double[] z;
    private static boolean[] U;
    private static short[] W;
    private static float[] m;
    private static short[] P;
    private static short[] s;
    private static short[] T;
    private static short[] b;
    private static String[] j;
    private static short[] v;
    private static short[] n;
    private static byte[] t;
    private static boolean[] G;
    private static short[] l;
    private static short[] d;
    private static float[] w;
    private static short[] k;
    public Object[] L;
    private static double[] Y;
    private static short[] Q;
    private static double[] O;
    private static short[] g;
    private static short[] I;
    private static short[] J;
    private static long[] o;
    private static float[] q;
    private static short[] K;
    private static short[] V;
    public static Object[] u;
    private static /* synthetic */ String llItOj0n;
    private static /* synthetic */ int[] ooqrn;

    private static /* synthetic */ int L(int n) {
        return (Integer.rotateRight(Integer.rotateLeft(Integer.rotateLeft(n, 19), 14) ^ 0x24C5A6A2, 11) ^ 0x42D80A7D) + 1;
    }

    private static /* synthetic */ int M(int n) {
        return Integer.rotateLeft(-Integer.rotateRight(Integer.rotateLeft(n, 26) ^ 0x35E70540, 8) ^ 0x5AC4D7FD, 26);
    }

    private static void P() {
        o = new long[]{0L, 0L, 0L, 0L};
    }

    private static void T() {
        u = new Object[]{0.008333333333333333, 0.05};
    }

    public Ub() {
        Ub.Ollk0("hmjzht", -1872673572, -582493586, -582493585, -582493588, -1872673572, (Ub)this);
        CallSite callSite = Ub.Ollk0("rthyu", -1872673582, -582493670, -582493574, -582493669, -1872673582, (lY)this, (String)((Object)Ub.Ollk0("ntppi", -1872673576, -582493586, -582493665, -582493668, -1872673576)[0]), (float)Ub.Ollk0("ybwsbn", -1872673576, -582493586, -582493667, -582493692, -1872673576)[0], (float)Ub.Ollk0("gztgjimo", -1872673576, -582493586, -582493667, -582493692, -1872673576)[1], (float)Ub.Ollk0("hmjzht", -1872673576, -582493586, -582493667, -582493692, -1872673576)[2], (float)Ub.Ollk0("tqqieqsd", -1872673576, -582493586, -582493667, -582493692, -1872673576)[3]);
        Ub.Ollk0("tuyjdjm", -1872673570, -582493586, -582493590, -582493598, -1872673570, (Ub)this)[Ub.Ollk0("tuyjdjm", -1872673576, -582493586, -582493627, -582493600, -1872673576)[0]] = callSite;
        CallSite callSite2 = Ub.Ollk0("hmjzht", -1872673582, -582493670, -582493574, -582493669, -1872673582, (lY)this, (String)((Object)Ub.Ollk0("evxhc", -1872673576, -582493586, -582493665, -582493668, -1872673576)[1]), (float)Ub.Ollk0("ybwsbn", -1872673576, -582493586, -582493672, -582493692, -1872673576)[0], (float)Ub.Ollk0("ntppi", -1872673576, -582493586, -582493672, -582493692, -1872673576)[1], (float)Ub.Ollk0("hmjzht", -1872673576, -582493586, -582493672, -582493692, -1872673576)[2], (float)Ub.Ollk0("ntppi", -1872673576, -582493586, -582493672, -582493692, -1872673576)[3]);
        Ub.Ollk0("ybwsbn", -1872673570, -582493586, -582493590, -582493598, -1872673570, (Ub)this)[Ub.Ollk0("ntppi", -1872673576, -582493586, -582493627, -582493600, -1872673576)[1]] = callSite2;
        CallSite callSite3 = Ub.Ollk0("gztgjimo", -1872673582, -582493670, -582493574, -582493669, -1872673582, (lY)this, (String)((Object)Ub.Ollk0("tqqieqsd", -1872673576, -582493586, -582493665, -582493668, -1872673576)[2]), (float)Ub.Ollk0("tuyjdjm", -1872673576, -582493586, -582493672, -582493692, -1872673576)[4], (float)Ub.Ollk0("tuyjdjm", -1872673576, -582493586, -582493672, -582493692, -1872673576)[5], (float)Ub.Ollk0("tqqieqsd", -1872673576, -582493586, -582493689, -582493692, -1872673576)[0], (float)Ub.Ollk0("gztgjimo", -1872673576, -582493586, -582493689, -582493692, -1872673576)[1]);
        Ub.Ollk0("ybwsbn", -1872673570, -582493586, -582493590, -582493598, -1872673570, (Ub)this)[Ub.Ollk0("rthyu", -1872673576, -582493586, -582493627, -582493600, -1872673576)[2]] = callSite3;
    }

    static {
        Ub.ntfClinit();
    }

    private static /* synthetic */ int B(int n) {
        return -Integer.rotateRight(Integer.rotateLeft(Integer.rotateLeft(-Integer.rotateLeft(-n, 31), 5), 12), 28);
    }

    private static /* synthetic */ String i(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{65, 77, 39, 61, 127, -8, -109, 62, -45, -55, 12, -92, 85, -70, -89, -71};
        int n = 0;
        int n2 = 244;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 211;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int i(int n) {
        return -Integer.rotateRight(Integer.rotateLeft(Integer.rotateRight(-n, 30) ^ 0x3E4FE56A, 14), 11) ^ 0x95F2CA8;
    }

    private static void b() {
        i = new boolean[]{false, true};
        U = new boolean[]{true, false, true, false, false};
        G = new boolean[]{false, true, false, false, false, true};
    }

    private static void s() {
        T = new short[]{0, 1, 2};
        l = new short[]{3, 4, 5, 6};
        I = new short[]{7, 3, 0};
        k = new short[]{3, 3};
        Q = new short[]{4, 5};
        R = new short[]{6, 7, 5, 5};
        d = new short[]{5, 4, 4};
        K = new short[]{6, 7};
        J = new short[]{6, 7, 2, 6};
        W = new short[]{6, 7, 7};
        s = new short[]{6, 7};
        v = new short[]{6, 6};
        V = new short[]{7, 7, 4};
        g = new short[]{4, 1, 0, 4, 0};
        n = new short[]{4, 4, 4};
        b = new short[]{4, 0, 0, 4, 0, 4};
        P = new short[]{0, 0, 4, 0, 4, 1};
    }

    private static void n() {
        j = new String[]{"fov", "aim-range", "speed"};
    }

    private static void m() {
        Z = new double[]{0.0, 0.0};
        Y = new double[]{0.0, 0.0, 0.008333333333333333, 1.0E9, 0.0, 0.05};
        M = new double[]{0.008333333333333333, 1.0, 0.0, 0.0, 0.0, 0.0};
        O = new double[]{5.0, 0.0, 0.0, 57.2957763671875};
        z = new double[]{90.0, 0.5, 10.0, 0.1f, 0.01745329238474369};
        B = new double[]{0.01745329238474369, 0.2, 0.21, 0.0, 0.0, 0.008333333333333333, 0.05};
    }

    private static void t() {
        q = new float[]{180.0f, 1.0f, 180.0f, 1.0f};
        m = new float[]{4.0f, 0.1f, 10.0f, 0.1f, 4.0f, 0.1f};
        w = new float[]{10.0f, 0.1f, 180.0f};
    }

    private void v() {
        if (Ub.Ollk0("ybwsbn", -1872673570, -582493586, -582493590, -582493598, -1872673570, (Ub)this) == null) {
            Ub.Ollk0("ybwsbn", -1872673569, -582493586, -582493590, -582493598, -1872673569, (Ub)this, (Object[])new Object[Ub.Ollk0("gztgjimo", -1872673576, -582493586, -582493576, -582493575, -1872673576)[1]]);
            CallSite callSite = Ub.Ollk0("ntppi", -1872673570, -582493586, -582493590, -582493598, -1872673570, (Ub)this);
            callSite[Ub.Ollk0("tqqieqsd", -1872673576, -582493586, -582493576, -582493575, -1872673576)[2]] = Ub.Ollk0("rthyu", -1872673582, -582493593, -582493596, -582493595, -1872673582, (int)Ub.Ollk0("evxhc", -1872673576, -582493586, -582493666, -582493625, -1872673576)[3]);
            callSite[Ub.Ollk0("hmjzht", -1872673576, -582493586, -582493576, -582493575, -1872673576)[3]] = Ub.Ollk0("evxhc", -1872673582, -582493650, -582493596, -582493649, -1872673582, (long)Ub.Ollk0("ybwsbn", -1872673576, -582493586, -582493616, -582493615, -1872673576)[3]);
            callSite[Ub.Ollk0("tqqieqsd", -1872673576, -582493586, -582493576, -582493575, -1872673576)[4]] = Ub.Ollk0("tqqieqsd", -1872673582, -582493651, -582493596, -582493654, -1872673582, (double)Ub.Ollk0("ybwsbn", -1872673576, -582493586, -582493619, -582493622, -1872673576)[3]);
            callSite[Ub.Ollk0("rthyu", -1872673576, -582493586, -582493576, -582493575, -1872673576)[5]] = Ub.Ollk0("tqqieqsd", -1872673582, -582493651, -582493596, -582493654, -1872673582, (double)Ub.Ollk0("hmjzht", -1872673576, -582493586, -582493619, -582493622, -1872673576)[4]);
        }
    }

    private static void j() {
        t = new byte[]{15, 8, 3, 5, 6, 7, 2};
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{98, -53, 74, -94, 71, -33, 92, 89, 50, 40, -113, -106, -36, 125, -51, 117};
        int n = 0;
        int n2 = 87;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 77;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int u(int n) {
        return -Integer.rotateRight(Integer.rotateLeft(Integer.rotateRight(Integer.rotateLeft(n, 29), 29) ^ 0xF9AEEC69, 20), 2);
    }

    @Override
    public void y() {
        Ub.Ollk0("tqqieqsd", -1872673572, -582493586, -582493585, -582493588, -1872673572, (Ub)this);
        CallSite callSite = Ub.Ollk0("rthyu", -1872673582, -582493593, -582493596, -582493595, -1872673582, (int)Ub.Ollk0("tqqieqsd", -1872673576, -582493586, -582493579, -582493625, -1872673576)[0]);
        Ub.Ollk0("evxhc", -1872673570, -582493586, -582493590, -582493598, -1872673570, (Ub)this)[Ub.Ollk0("gztgjimo", -1872673576, -582493586, -582493688, -582493600, -1872673576)[0]] = callSite;
        Object var6_2 = null;
        Ub.Ollk0("tuyjdjm", -1872673570, -582493586, -582493590, -582493598, -1872673570, (Ub)this)[Ub.Ollk0("tqqieqsd", -1872673576, -582493586, -582493688, -582493600, -1872673576)[1]] = var6_2;
        CallSite callSite2 = Ub.Ollk0("gztgjimo", -1872673582, -582493650, -582493596, -582493649, -1872673582, (long)Ub.Ollk0("evxhc", -1872673576, -582493586, -582493616, -582493615, -1872673576)[0]);
        Ub.Ollk0("tuyjdjm", -1872673570, -582493586, -582493590, -582493598, -1872673570, (Ub)this)[Ub.Ollk0("tqqieqsd", -1872673576, -582493586, -582493688, -582493600, -1872673576)[2]] = callSite2;
        CallSite callSite3 = Ub.Ollk0("tqqieqsd", -1872673582, -582493651, -582493596, -582493654, -1872673582, (double)Ub.Ollk0("ybwsbn", -1872673576, -582493586, -582493687, -582493622, -1872673576)[0]);
        Ub.Ollk0("tuyjdjm", -1872673570, -582493586, -582493590, -582493598, -1872673570, (Ub)this)[Ub.Ollk0("evxhc", -1872673576, -582493586, -582493688, -582493600, -1872673576)[3]] = callSite3;
        CallSite callSite4 = Ub.Ollk0("tuyjdjm", -1872673582, -582493651, -582493596, -582493654, -1872673582, (double)Ub.Ollk0("hmjzht", -1872673576, -582493586, -582493687, -582493622, -1872673576)[1]);
        Ub.Ollk0("gztgjimo", -1872673570, -582493586, -582493590, -582493598, -1872673570, (Ub)this)[Ub.Ollk0("tqqieqsd", -1872673576, -582493586, -582493597, -582493600, -1872673576)[0]] = callSite4;
        Ub.Ollk0("ntppi", -1872673571, -582493690, -582493570, -582493588, -1872673571, (UM)this);
    }

    private static /* synthetic */ int y(int n) {
        return ((Integer.rotateRight(Integer.rotateRight(n, 12) ^ 0x5A44791E, 5) ^ 0xABCD39FB) + 1 ^ 0x1C65EA1E) + 1;
    }

    private static /* synthetic */ long y(long l) {
        return Long.rotateRight(Long.rotateLeft(Long.rotateRight(Long.rotateRight(l, 27) ^ 0x404DF28084E3631EL, 3), 57), 59);
    }

    private boolean y(NjL njL) {
        Ub.Ollk0("hmjzht", -1872673572, -582493586, -582493585, -582493588, 2088925211, (Ub)this);
        if (Ub.Ollk0("gztgjimo", -1872673572, -582493618, -582493677, -582493680, 2088925211, (NjL)njL) == false) {
            return (boolean)Ub.Ollk0("ybwsbn", -1872673576, -582493586, -582493691, -582493625, 1715817698)[4];
        }
        if (Ub.Ollk0("gztgjimo", -1872673581, -582493457, -582493460, -582493459, 2088925211, (Predicate)((Object)Ub.Ollk0("ybwsbn", -1872673582, -582493679, -582493637, -582493458, 2088925211)), (Object)njL) != false) {
            return (boolean)Ub.Ollk0("evxhc", -1872673576, -582493586, -582493666, -582493625, -713185768)[0];
        }
        CallSite callSite = Ub.Ollk0("tuyjdjm", -1872673582, -582493631, -582493574, -582493462, 2088925211, (NbK)njL, (boolean)Ub.Ollk0("hmjzht", -1872673576, -582493586, -582493666, -582493625, 947044293)[1], (double)Ub.Ollk0("ntppi", -1872673572, -582493630, -582493629, -582493632, 2088925211, (NNNwS)((NNNwS)Ub.Ollk0("evxhc", -1872673570, -582493628, -582493627, -582493598, 1030513464, (NNuU)((NNuU)Ub.Ollk0("hmjzht", -1872673570, -582493586, -582493570, -582493598, -39411631, (Ub)this)[Ub.Ollk0("ybwsbn", -1872673576, -582493586, -582493695, -582493600, 2077090937)[1]]))[Ub.Ollk0("rthyu", -1872673576, -582493586, -582493695, -582493600, 1203688628)[2]])));
        if (Ub.Ollk0("hmjzht", -1872673572, -582493461, -582493653, -582493464, 2088925211, (NXi)callSite, (NXi)Ub.Ollk0("tqqieqsd", -1872673572, -582493630, -582493604, -582493603, 2088925211, (NNNwS)((NNNwS)Ub.Ollk0("evxhc", -1872673570, -582493628, -582493627, -582493598, 1183787841, (NNuU)((NNuU)Ub.Ollk0("ybwsbn", -1872673570, -582493586, -582493570, -582493598, 584434420, (Ub)this)[Ub.Ollk0("evxhc", -1872673576, -582493586, -582493695, -582493600, 2042806231)[3]]))[Ub.Ollk0("rthyu", -1872673576, -582493586, -582493695, -582493600, -1622204637)[4]]))) > (double)Ub.Ollk0("tuyjdjm", -1872673572, -582493581, -582493584, -582493583, 2088925211, (Float)((Float)((Object)Ub.Ollk0("ntppi", -1872673572, -582493580, -582493579, -582493582, 2088925211, (lQ)((lQ)((Object)Ub.Ollk0("ybwsbn", -1872673570, -582493586, -582493590, -582493598, 301233642, (Ub)this)[Ub.Ollk0("tuyjdjm", -1872673576, -582493586, -582493695, -582493600, 81434370)[5]]))))))) {
            return (boolean)Ub.Ollk0("gztgjimo", -1872673576, -582493586, -582493666, -582493625, 1333313127)[2];
        }
        return (boolean)Ub.Ollk0("tuyjdjm", -1872673572, -582493586, -582493574, -582493569, 2088925211, (Ub)this, (NjL)njL);
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-32, -55, 30, -37, -96, 113, -26, -123, 62, 93, -18, -120, -123, 59, 67, -49};
        int n = 0;
        int n2 = 81;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 229;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    @uF
    public void N(Ru ru) {
        Ub.Ollk0("hmjzht", -1872673572, -582493586, -582493585, -582493588, 2088925211, (Ub)this);
        Ub.Ollk0("rthyu", -1872673572, -582493586, -582493574, -582493678, 2088925211, (Ub)this, (NbK)Ub.Ollk0("ntppi", -1872673572, -582493673, -582493676, -582493675, 2088925211, (NNNZg)((NNNZg)Ub.Ollk0("hmjzht", -1872673570, -582493628, -582493627, -582493598, -974859036, (NNuU)((NNuU)Ub.Ollk0("tuyjdjm", -1872673570, -582493586, -582493570, -582493598, -181984464, (Ub)this)[Ub.Ollk0("gztgjimo", -1872673576, -582493586, -582493597, -582493600, 1731431272)[2]]))[Ub.Ollk0("evxhc", -1872673576, -582493586, -582493671, -582493600, -806804716)[0]]), (int)Ub.Ollk0("ntppi", -1872673572, -582493593, -582493674, -582493594, 2088925211, (Integer)((Object)Ub.Ollk0("gztgjimo", -1872673570, -582493586, -582493590, -582493598, 823610389, (Ub)this)[Ub.Ollk0("hmjzht", -1872673576, -582493586, -582493671, -582493600, 1821093510)[1]]))));
    }

    private void N(NbK nbK) {
        Ub.Ollk0("evxhc", -1872673572, -582493586, -582493585, -582493588, 2088925211, (Ub)this);
        if (!(nbK instanceof NjL)) {
            Object var9_3 = null;
            Ub.Ollk0("ntppi", -1872673570, -582493586, -582493590, -582493598, 2124136017, (Ub)this)[Ub.Ollk0("ntppi", -1872673576, -582493586, -582493599, -582493600, -122826709)[2]] = var9_3;
            return;
        }
        NjL njL = (NjL)nbK;
        if (Ub.Ollk0("hmjzht", -1872673572, -582493586, -582493570, -582493569, 2088925211, (Ub)this, (NjL)njL) == false) {
            Object var10_4 = null;
            Ub.Ollk0("tuyjdjm", -1872673570, -582493586, -582493590, -582493598, -1792058541, (Ub)this)[Ub.Ollk0("ntppi", -1872673576, -582493586, -582493572, -582493600, 315743738)[0]] = var10_4;
            return;
        }
        CallSite callSite = Ub.Ollk0("tqqieqsd", -1872673582, -582493571, -582493574, -582493573, 2088925211);
        Ub.Ollk0("rthyu", -1872673582, -582493578, -582493574, -582493577, 2088925211, (NjL)njL, (int)Ub.Ollk0("ybwsbn", -1872673576, -582493586, -582493576, -582493575, 814604128)[0]);
        if (Ub.Ollk0("evxhc", -1872673582, -582493623, -582493574, -582493626, 2088925211, (lL)((Object)callSite), (double)((double)Ub.Ollk0("tqqieqsd", -1872673572, -582493581, -582493584, -582493583, 2088925211, (Float)((Float)((Object)Ub.Ollk0("ntppi", -1872673572, -582493580, -582493579, -582493582, 2088925211, (lQ)((lQ)((Object)Ub.Ollk0("ntppi", -1872673570, -582493586, -582493590, -582493598, -1138050749, (Ub)this)[Ub.Ollk0("gztgjimo", -1872673576, -582493586, -582493572, -582493600, 731210056)[1]]))))))), (NHS)Ub.Ollk0("tuyjdjm", -1872673572, -582493621, -582493619, -582493624, 2088925211, (NHS)Ub.Ollk0("gztgjimo", -1872673572, -582493618, -582493617, -582493620, 2088925211, (NjL)njL), (double)Ub.Ollk0("ybwsbn", -1872673576, -582493586, -582493619, -582493622, -1911367488)[1])) != false) {
            CallSite callSite2 = Ub.Ollk0("ntppi", -1872673582, -582493631, -582493574, -582493602, 2088925211, (NbK)njL, (lL)((Object)callSite), (boolean)Ub.Ollk0("rthyu", -1872673576, -582493586, -582493579, -582493625, 1991571497)[1], (double)Ub.Ollk0("rthyu", -1872673572, -582493630, -582493629, -582493632, 2088925211, (NNNwS)((NNNwS)Ub.Ollk0("hmjzht", -1872673570, -582493628, -582493627, -582493598, -2070872867, (NNuU)((NNuU)Ub.Ollk0("gztgjimo", -1872673570, -582493586, -582493570, -582493598, 1081327671, (Ub)this)[Ub.Ollk0("tqqieqsd", -1872673576, -582493586, -582493572, -582493600, 1324296175)[2]]))[Ub.Ollk0("tqqieqsd", -1872673576, -582493586, -582493572, -582493600, 751943686)[3]])), nHS -> Ub.Ollk0("evxhc", -1872673572, -582493621, -582493619, -582493624, 2088925211, (NHS)nHS, (double)Ub.Ollk0("rthyu", -1872673576, -582493586, -582493619, -582493622, 163649738)[2]));
            if (Ub.Ollk0("ntppi", -1872673582, -582493623, -582493574, -582493612, 2088925211, (NXi)Ub.Ollk0("gztgjimo", -1872673572, -582493630, -582493604, -582493603, 2088925211, (NNNwS)((NNNwS)Ub.Ollk0("tqqieqsd", -1872673570, -582493628, -582493627, -582493598, -678141243, (NNuU)((NNuU)Ub.Ollk0("hmjzht", -1872673570, -582493586, -582493570, -582493598, 826575036, (Ub)this)[Ub.Ollk0("tqqieqsd", -1872673576, -582493586, -582493572, -582493600, -241205669)[4]]))[Ub.Ollk0("hmjzht", -1872673576, -582493586, -582493601, -582493600, 1044061601)[0]])), (NXi)callSite2, (NNnS)Ub.Ollk0("hmjzht", -1872673576, -582493606, -582493605, -582493608, -1116430690), (NNnC)Ub.Ollk0("ntppi", -1872673576, -582493607, -582493610, -582493609, 452997497)) == false) {
                Object var11_7 = null;
                Ub.Ollk0("gztgjimo", -1872673570, -582493586, -582493590, -582493598, 646060240, (Ub)this)[Ub.Ollk0("ntppi", -1872673576, -582493586, -582493601, -582493600, 1973824181)[1]] = var11_7;
                return;
            }
            CallSite callSite3 = Ub.Ollk0("ybwsbn", -1872673582, -582493571, -582493574, -582493611, 2088925211, (NXi)callSite2);
            Ub.Ollk0("rthyu", -1872673570, -582493586, -582493590, -582493598, -1168630461, (Ub)this)[Ub.Ollk0("ntppi", -1872673576, -582493586, -582493601, -582493600, 606122737)[2]] = callSite3;
            return;
        }
        Object var13_9 = null;
        Ub.Ollk0("tqqieqsd", -1872673570, -582493586, -582493590, -582493598, 2052742995, (Ub)this)[Ub.Ollk0("rthyu", -1872673576, -582493586, -582493614, -582493600, -2082919929)[0]] = var13_9;
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateRight(Integer.rotateRight(Integer.rotateLeft(Integer.rotateLeft(Integer.rotateRight(Integer.rotateRight(Integer.rotateLeft(n, 6), 28), 3), 18), 31), 26), 18) ^ 0x31B6F80E;
    }

    @uF
    public void N(ie ie2) {
        Ub.Ollk0("evxhc", -1872673572, -582493586, -582493585, -582493588, 2088925211, (Ub)this);
        CallSite callSite = Ub.Ollk0("rthyu", -1872673582, -582493593, -582493596, -582493595, 2088925211, (int)Ub.Ollk0("gztgjimo", -1872673572, -582493592, -582493591, -582493594, 2088925211, (NbK)Ub.Ollk0("ntppi", -1872673572, -582493587, -582493590, -582493589, 2088925211, (ie)ie2)));
        Ub.Ollk0("hmjzht", -1872673570, -582493586, -582493590, -582493598, 259512618, (Ub)this)[Ub.Ollk0("ntppi", -1872673576, -582493586, -582493597, -582493600, -1081870786)[1]] = callSite;
    }

    private static /* synthetic */ long N(long l) {
        return Long.rotateLeft(Long.rotateRight(Long.rotateLeft(-Long.rotateLeft(-l, 12), 17), 46) ^ 0x81A8D1076CDA8BA6L, 30);
    }

    @uF
    public void N(ig ig2) {
        Ub.Ollk0("evxhc", -1872673572, -582493586, -582493585, -582493588, 2088925211, (Ub)this);
        if ((lL)((Object)Ub.Ollk0("ntppi", -1872673570, -582493586, -582493590, -582493598, -1161053335, (Ub)this)[Ub.Ollk0("tuyjdjm", -1872673576, -582493586, -582493613, -582493600, 559530480)[0]]) == null) {
            CallSite callSite = Ub.Ollk0("ntppi", -1872673582, -582493650, -582493596, -582493649, 2088925211, (long)Ub.Ollk0("tqqieqsd", -1872673576, -582493586, -582493616, -582493615, -1928640777)[1]);
            Ub.Ollk0("tqqieqsd", -1872673570, -582493586, -582493590, -582493598, -1577491152, (Ub)this)[Ub.Ollk0("gztgjimo", -1872673576, -582493586, -582493613, -582493600, -621446924)[1]] = callSite;
            CallSite callSite2 = Ub.Ollk0("ybwsbn", -1872673582, -582493651, -582493596, -582493654, 2088925211, (double)Ub.Ollk0("ntppi", -1872673576, -582493586, -582493652, -582493622, -1055838264)[0]);
            Ub.Ollk0("tqqieqsd", -1872673570, -582493586, -582493590, -582493598, -1657010786, (Ub)this)[Ub.Ollk0("hmjzht", -1872673576, -582493586, -582493653, -582493600, -662913477)[0]] = callSite2;
            CallSite callSite3 = Ub.Ollk0("ybwsbn", -1872673582, -582493651, -582493596, -582493654, 2088925211, (double)Ub.Ollk0("ntppi", -1872673576, -582493586, -582493652, -582493622, -1211272360)[1]);
            Ub.Ollk0("ybwsbn", -1872673570, -582493586, -582493590, -582493598, 398611518, (Ub)this)[Ub.Ollk0("evxhc", -1872673576, -582493586, -582493653, -582493600, 128848163)[1]] = callSite3;
            return;
        }
        CallSite callSite = Ub.Ollk0("tqqieqsd", -1872673582, -582493656, -582493655, -582493658, 2088925211);
        CallSite callSite4 = Ub.Ollk0("hmjzht", -1872673572, -582493650, -582493657, -582493658, 2088925211, (Long)((Long)((Object)Ub.Ollk0("ybwsbn", -1872673570, -582493586, -582493590, -582493598, 989969411, (Ub)this)[Ub.Ollk0("hmjzht", -1872673576, -582493586, -582493653, -582493600, 1191666777)[2]]))) == Ub.Ollk0("tuyjdjm", -1872673576, -582493586, -582493616, -582493615, 1230338380)[2] ? Ub.Ollk0("ybwsbn", -1872673576, -582493586, -582493652, -582493622, -20926951)[2] : (CallSite)((double)(callSite - Ub.Ollk0("tqqieqsd", -1872673572, -582493650, -582493657, -582493658, 2088925211, (Long)((Long)((Object)Ub.Ollk0("rthyu", -1872673570, -582493586, -582493590, -582493598, -1722454446, (Ub)this)[Ub.Ollk0("ybwsbn", -1872673576, -582493586, -582493653, -582493600, 1393826172)[3]])))) / Ub.Ollk0("rthyu", -1872673576, -582493586, -582493652, -582493622, -1880308856)[3]);
        CallSite callSite5 = Ub.Ollk0("evxhc", -1872673582, -582493650, -582493596, -582493649, 2088925211, (long)callSite);
        Ub.Ollk0("evxhc", -1872673570, -582493586, -582493590, -582493598, -69701733, (Ub)this)[Ub.Ollk0("hmjzht", -1872673576, -582493586, -582493660, -582493600, -820160809)[0]] = callSite5;
        reference var6_8 = Ub.Ollk0("hmjzht", -1872673582, -582493659, -582493574, -582493662, 2088925211, (double)callSite4, (double)Ub.Ollk0("tuyjdjm", -1872673576, -582493586, -582493652, -582493622, -1790684639)[4], (double)Ub.Ollk0("rthyu", -1872673576, -582493586, -582493652, -582493622, -301680581)[5]) / Ub.Ollk0("evxhc", -1872673576, -582493586, -582493661, -582493622, -1956785350)[0];
        CallSite callSite6 = Ub.Ollk0("tuyjdjm", -1872673582, -582493571, -582493574, -582493573, 2088925211);
        reference var9_10 = Ub.Ollk0("evxhc", -1872673572, -582493664, -582493653, -582493583, 2088925211, (lL)((Object)callSite6)) - Ub.Ollk0("evxhc", -1872673572, -582493664, -582493653, -582493583, 2088925211, (lL)((lL)((Object)Ub.Ollk0("ntppi", -1872673570, -582493586, -582493590, -582493598, 1846360895, (Ub)this)[Ub.Ollk0("tqqieqsd", -1872673576, -582493586, -582493660, -582493600, 2011034527)[1]])));
        CallSite callSite7 = Ub.Ollk0("tqqieqsd", -1872673582, -582493659, -582493653, -582493663, 2088925211, (float)(Ub.Ollk0("gztgjimo", -1872673572, -582493664, -582493570, -582493583, 2088925211, (lL)((Object)callSite6)) - Ub.Ollk0("ntppi", -1872673572, -582493664, -582493570, -582493583, 2088925211, (lL)((lL)((Object)Ub.Ollk0("hmjzht", -1872673570, -582493586, -582493590, -582493598, 827284790, (Ub)this)[Ub.Ollk0("tqqieqsd", -1872673576, -582493586, -582493660, -582493600, 1386477269)[2]])))));
        CallSite callSite8 = Ub.Ollk0("ybwsbn", -1872673582, -582493634, -582493633, -582493636, 2088925211, (double)((double)var9_10), (double)((double)callSite7));
        if (callSite8 < Ub.Ollk0("evxhc", -1872673576, -582493586, -582493661, -582493622, 1939249719)[1]) {
            CallSite callSite9 = Ub.Ollk0("rthyu", -1872673582, -582493651, -582493596, -582493654, 2088925211, (double)Ub.Ollk0("ntppi", -1872673576, -582493586, -582493661, -582493622, -650753585)[2]);
            Ub.Ollk0("ybwsbn", -1872673570, -582493586, -582493590, -582493598, 70016452, (Ub)this)[Ub.Ollk0("tqqieqsd", -1872673576, -582493586, -582493635, -582493600, -1877835855)[0]] = callSite9;
            CallSite callSite10 = Ub.Ollk0("evxhc", -1872673582, -582493651, -582493596, -582493654, 2088925211, (double)Ub.Ollk0("rthyu", -1872673576, -582493586, -582493661, -582493622, 2097223547)[3]);
            Ub.Ollk0("tuyjdjm", -1872673570, -582493586, -582493590, -582493598, 947845150, (Ub)this)[Ub.Ollk0("hmjzht", -1872673576, -582493586, -582493635, -582493600, -187294324)[1]] = callSite10;
            return;
        }
        if (Ub.Ollk0("rthyu", -1872673572, -582493638, -582493637, -582493632, 2088925211, (ig)ig2) == Ub.Ollk0("rthyu", -1872673576, -582493586, -582493661, -582493622, 1521326950)[4]) {
            if (Ub.Ollk0("rthyu", -1872673572, -582493638, -582493590, -582493632, 2088925211, (ig)ig2) == Ub.Ollk0("evxhc", -1872673576, -582493586, -582493661, -582493622, -1202932563)[5]) {
                if (callSite8 > Ub.Ollk0("tuyjdjm", -1872673576, -582493586, -582493640, -582493622, -628641432)[0]) {
                    CallSite callSite11 = Ub.Ollk0("evxhc", -1872673582, -582493651, -582493596, -582493654, 2088925211, (double)Ub.Ollk0("ntppi", -1872673576, -582493586, -582493640, -582493622, -1936748601)[1]);
                    Ub.Ollk0("evxhc", -1872673570, -582493586, -582493590, -582493598, -495528784, (Ub)this)[Ub.Ollk0("ybwsbn", -1872673576, -582493586, -582493639, -582493600, -864273604)[0]] = callSite11;
                    CallSite callSite12 = Ub.Ollk0("evxhc", -1872673582, -582493651, -582493596, -582493654, 2088925211, (double)Ub.Ollk0("hmjzht", -1872673576, -582493586, -582493640, -582493622, 1443786471)[2]);
                    Ub.Ollk0("ybwsbn", -1872673570, -582493586, -582493590, -582493598, -399493381, (Ub)this)[Ub.Ollk0("evxhc", -1872673576, -582493586, -582493639, -582493600, -2116478673)[1]] = callSite12;
                    return;
                }
            }
        }
        reference var13_17 = Ub.Ollk0("ybwsbn", -1872673582, -582493659, -582493637, -582493636, 2088925211, (double)((double)var9_10), (double)((double)callSite7)) * Ub.Ollk0("ybwsbn", -1872673576, -582493586, -582493640, -582493622, -191956402)[3] - Ub.Ollk0("tqqieqsd", -1872673576, -582493586, -582493642, -582493622, -542842500)[0];
        double d = (double)Ub.Ollk0("ybwsbn", -1872673572, -582493581, -582493584, -582493583, 2088925211, (Float)((Float)((Object)Ub.Ollk0("tuyjdjm", -1872673572, -582493580, -582493579, -582493582, 2088925211, (lQ)((lQ)((Object)Ub.Ollk0("tuyjdjm", -1872673570, -582493586, -582493590, -582493598, -1578251005, (Ub)this)[Ub.Ollk0("evxhc", -1872673576, -582493586, -582493639, -582493600, 930457657)[2]])))))) * Ub.Ollk0("hmjzht", -1872673582, -582493634, -582493644, -582493636, 2088925211, (double)Ub.Ollk0("evxhc", -1872673576, -582493586, -582493642, -582493622, 979143579)[1], (double)(Ub.Ollk0("rthyu", -1872673582, -582493634, -582493641, -582493636, 2088925211, (double)callSite8, (double)Ub.Ollk0("evxhc", -1872673576, -582493586, -582493642, -582493622, -319020647)[2]) * Ub.Ollk0("hmjzht", -1872673576, -582493586, -582493642, -582493622, -542239457)[3])) * var6_8;
        CallSite callSite13 = Ub.Ollk0("ntppi", -1872673582, -582493634, -582493641, -582493636, 2088925211, (double)d, (double)((double)Ub.Ollk0("gztgjimo", -1872673582, -582493634, -582493643, -582493663, 2088925211, (float)callSite7)));
        CallSite callSite14 = Ub.Ollk0("rthyu", -1872673582, -582493634, -582493641, -582493636, 2088925211, (double)d, (double)((double)Ub.Ollk0("evxhc", -1872673582, -582493634, -582493643, -582493663, 2088925211, (float)var9_10)));
        Ub ub = this;
        CallSite callSite15 = Ub.Ollk0("rthyu", -1872673582, -582493651, -582493596, -582493654, 2088925211, (double)(Ub.Ollk0("ybwsbn", -1872673572, -582493651, -582493646, -582493632, 2088925211, (Double)((Double)((Object)Ub.Ollk0("evxhc", -1872673570, -582493586, -582493590, -582493598, -1833189599, (Ub)ub)[Ub.Ollk0("ntppi", -1872673576, -582493586, -582493639, -582493600, -1356205060)[3]]))) + Ub.Ollk0("gztgjimo", -1872673582, -582493634, -582493645, -582493648, 2088925211, (double)(var13_17 * Ub.Ollk0("ybwsbn", -1872673576, -582493586, -582493642, -582493622, 287612953)[4])) * callSite13));
        Ub.Ollk0("tqqieqsd", -1872673570, -582493586, -582493590, -582493598, 1598343703, (Ub)ub)[Ub.Ollk0("hmjzht", -1872673576, -582493586, -582493647, -582493600, 994391338)[0]] = callSite15;
        Ub ub2 = this;
        CallSite callSite16 = Ub.Ollk0("ybwsbn", -1872673582, -582493651, -582493596, -582493654, 2088925211, (double)(Ub.Ollk0("ybwsbn", -1872673572, -582493651, -582493646, -582493632, 2088925211, (Double)((Double)((Object)Ub.Ollk0("evxhc", -1872673570, -582493586, -582493590, -582493598, -284671292, (Ub)ub2)[Ub.Ollk0("hmjzht", -1872673576, -582493586, -582493647, -582493600, -1703876510)[1]]))) + -Ub.Ollk0("tuyjdjm", -1872673582, -582493634, -582493682, -582493648, 2088925211, (double)(var13_17 * Ub.Ollk0("rthyu", -1872673576, -582493586, -582493619, -582493622, 869342366)[0])) * callSite14));
        Ub.Ollk0("gztgjimo", -1872673570, -582493586, -582493590, -582493598, 1896800507, (Ub)ub2)[Ub.Ollk0("tuyjdjm", -1872673576, -582493586, -582493647, -582493600, -1442179286)[2]] = callSite16;
        double d2 = (double)Ub.Ollk0("gztgjimo", -1872673582, -582493634, -582493684, -582493683, 2088925211, (double)Ub.Ollk0("gztgjimo", -1872673572, -582493651, -582493646, -582493632, 2088925211, (Double)((Double)((Object)Ub.Ollk0("tuyjdjm", -1872673570, -582493586, -582493590, -582493598, 1966619602, (Ub)this)[Ub.Ollk0("gztgjimo", -1872673576, -582493586, -582493681, -582493600, 639708039)[0]]))));
        double d3 = (double)Ub.Ollk0("ybwsbn", -1872673582, -582493634, -582493684, -582493683, 2088925211, (double)Ub.Ollk0("rthyu", -1872673572, -582493651, -582493646, -582493632, 2088925211, (Double)((Double)((Object)Ub.Ollk0("ntppi", -1872673570, -582493586, -582493590, -582493598, 1070879747, (Ub)this)[Ub.Ollk0("tuyjdjm", -1872673576, -582493586, -582493681, -582493600, 124083019)[1]]))));
        Ub ub3 = this;
        CallSite callSite17 = Ub.Ollk0("rthyu", -1872673582, -582493651, -582493596, -582493654, 2088925211, (double)(Ub.Ollk0("rthyu", -1872673572, -582493651, -582493646, -582493632, 2088925211, (Double)((Double)((Object)Ub.Ollk0("ybwsbn", -1872673570, -582493586, -582493590, -582493598, -1318670745, (Ub)ub3)[Ub.Ollk0("tqqieqsd", -1872673576, -582493586, -582493585, -582493600, 1187519294)[0]]))) - d2));
        Ub.Ollk0("ybwsbn", -1872673570, -582493586, -582493590, -582493598, 1206605038, (Ub)ub3)[Ub.Ollk0("ybwsbn", -1872673576, -582493586, -582493585, -582493600, 494996727)[1]] = callSite17;
        Ub ub4 = this;
        CallSite callSite18 = Ub.Ollk0("hmjzht", -1872673582, -582493651, -582493596, -582493654, 2088925211, (double)(Ub.Ollk0("tqqieqsd", -1872673572, -582493651, -582493646, -582493632, 2088925211, (Double)((Double)((Object)Ub.Ollk0("tuyjdjm", -1872673570, -582493586, -582493590, -582493598, 1373545160, (Ub)ub4)[Ub.Ollk0("tuyjdjm", -1872673576, -582493586, -582493599, -582493600, 1008163345)[0]]))) - d3));
        Ub.Ollk0("ybwsbn", -1872673570, -582493586, -582493590, -582493598, -1140405152, (Ub)ub4)[Ub.Ollk0("hmjzht", -1872673576, -582493586, -582493599, -582493600, 479474630)[1]] = callSite18;
        CallSite callSite19 = Ub.Ollk0("hmjzht", -1872673582, -582493686, -582493574, -582493648, 2088925211, (double)Ub.Ollk0("ybwsbn", -1872673572, -582493638, -582493637, -582493632, 2088925211, (ig)ig2));
        CallSite callSite20 = Ub.Ollk0("tuyjdjm", -1872673582, -582493686, -582493574, -582493648, 2088925211, (double)Ub.Ollk0("ntppi", -1872673572, -582493638, -582493590, -582493632, 2088925211, (ig)ig2));
        Ub.Ollk0("hmjzht", -1872673572, -582493638, -582493574, -582493685, 2088925211, (ig)ig2, (double)Ub.Ollk0("tqqieqsd", -1872673582, -582493686, -582493570, -582493648, 2088925211, (double)(callSite19 + d2)));
        Ub.Ollk0("tuyjdjm", -1872673572, -582493638, -582493570, -582493685, 2088925211, (ig)ig2, (double)Ub.Ollk0("evxhc", -1872673582, -582493686, -582493570, -582493648, 2088925211, (double)(callSite20 + d3)));
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean N(NjL njL) {
        CallSite callSite;
        Ub.Ollk0("gztgjimo", -1872673572, -582493586, -582493585, -582493588, 2088925211, (Ub)this);
        if (Ub.Ollk0("evxhc", -1872673572, -582493581, -582493584, -582493583, 2088925211, (Float)((Float)((Object)Ub.Ollk0("ybwsbn", -1872673572, -582493580, -582493579, -582493582, 2088925211, (lQ)((lQ)((Object)Ub.Ollk0("ybwsbn", -1872673570, -582493586, -582493590, -582493598, 950610246, (Ub)this)[Ub.Ollk0("ntppi", -1872673576, -582493586, -582493614, -582493600, -60689202)[1]])))))) == Ub.Ollk0("tqqieqsd", -1872673576, -582493586, -582493689, -582493692, -1058532047)[2]) {
            return (boolean)Ub.Ollk0("rthyu", -1872673576, -582493586, -582493691, -582493625, -756058561)[0];
        }
        CallSite callSite2 = Ub.Ollk0("ntppi", -1872673582, -582493571, -582493590, -582493573, 2088925211);
        if (Ub.Ollk0("ntppi", -1872673582, -582493623, -582493574, -582493694, 2088925211, (lL)((Object)callSite2), (double)Ub.Ollk0("tqqieqsd", -1872673572, -582493630, -582493629, -582493632, 2088925211, (NNNwS)((NNNwS)Ub.Ollk0("evxhc", -1872673570, -582493628, -582493627, -582493598, 886586481, (NNuU)((NNuU)Ub.Ollk0("tqqieqsd", -1872673570, -582493586, -582493570, -582493598, 898054549, (Ub)this)[Ub.Ollk0("tuyjdjm", -1872673576, -582493586, -582493614, -582493600, -1850393252)[2]]))[Ub.Ollk0("tuyjdjm", -1872673576, -582493586, -582493614, -582493600, 550249444)[3]])), (NbK)njL) != false) {
            if (!(Ub.Ollk0("evxhc", -1872673572, -582493664, -582493574, -582493696, 2088925211, (lL)((Object)callSite2), (NXi)Ub.Ollk0("tuyjdjm", -1872673582, -582493631, -582493574, -582493693, 2088925211, (NbK)njL, (lL)((Object)callSite2), (boolean)Ub.Ollk0("tuyjdjm", -1872673576, -582493586, -582493691, -582493625, 1615096146)[1], (double)Ub.Ollk0("hmjzht", -1872673572, -582493630, -582493629, -582493632, 2088925211, (NNNwS)((NNNwS)Ub.Ollk0("tuyjdjm", -1872673570, -582493628, -582493627, -582493598, 424553577, (NNuU)((NNuU)Ub.Ollk0("ybwsbn", -1872673570, -582493586, -582493570, -582493598, -610227314, (Ub)this)[Ub.Ollk0("ybwsbn", -1872673576, -582493586, -582493614, -582493600, 1436311935)[4]]))[Ub.Ollk0("tqqieqsd", -1872673576, -582493586, -582493614, -582493600, -389205333)[5]])))) < Ub.Ollk0("gztgjimo", -1872673572, -582493581, -582493584, -582493583, 2088925211, (Float)((Float)((Object)Ub.Ollk0("ybwsbn", -1872673572, -582493580, -582493579, -582493582, 2088925211, (lQ)((lQ)((Object)Ub.Ollk0("tqqieqsd", -1872673570, -582493586, -582493590, -582493598, 869632889, (Ub)this)[Ub.Ollk0("tuyjdjm", -1872673576, -582493586, -582493695, -582493600, 71098500)[0]])))))))) {
                callSite = Ub.Ollk0("tqqieqsd", -1872673576, -582493586, -582493691, -582493625, 1654066448)[3];
                return (boolean)callSite;
            }
        }
        callSite = Ub.Ollk0("evxhc", -1872673576, -582493586, -582493691, -582493625, 623385781)[2];
        return (boolean)callSite;
    }

    private static /* synthetic */ int R(int n) {
        return Integer.rotateRight(Integer.rotateLeft(Integer.rotateLeft(Integer.rotateLeft(n, 31) ^ 0xBF122306, 15), 15), 31);
    }

    private static /* synthetic */ void ntfClinit() {
        llItOj0n = "\u0086\u00a8\u00e9='\u00c5\\/iH\b\u008bf\u00d5\u00da9\u0005\u00b1\u00e1%L\u00cc\r<\u00b8u#(ai\u00b8_\u00dd\u00c2b\n\u0080Q8f\u0000K\u00acd\u00dd\u0094\u0001\u00ba\u009b\u00efp\u0015\u00a1\u0007\r\u00aev4UjJ\u00e2D\u00e2\u00d2vB\u00e9='\u00c5\\/iH\b\u009es\u00c9\u00cf(\u00f8\\\u009d\u00f1;)\u009e\u00cf\u00cc\r<\u00b8u#(zE\u00db\u00e9%)\u00beY#b\u00c2\u00a1\u000f\u0015\u00c4!'\u009cQakNI\u00aa%\u00f5\u00d9'\u00ba^\u00fcpo\u00b0\u00af\u00ed?.\u0085T\u00112\u0017\u0017\u00f8\u0012\u00c4!'\u009cQakNI\u00aa%\u00f5\u00d9'U*\u00fcp\n\u00e9='\u00c5\\/iH\b\u0084d\u00ce\u00de*\u00c8\u0012\u00e7\u00e78\u0000\u00ccb\n\u00a1t\b}}b\u00a0%\u00f4\u00f3\u001e\u00aeH\u00c4\u0000\u0002\u00acJ\u001cBB\b\u0083`\u00f6\u0080\u0004\u00846\u00da\u00c4\u0000\u0002\u00acJ\u001cBB\b\u0083h\u00f1\u0080\u0017\u0019\u00db\u00c4\u0000\u0002\u00acJ\u001cBB\b\u0083R\u00d3\u0080,\u00c3\u000f\u0000\u0090b\u000bj\u0000i\u0083d\u00f9\u0080\u00b1\u00dba\u00cc\u000f\u0002\u00c3t\u00cd\u00cc\r<\u00b8u#(E~\u0097\u00ccb\n\u00a1t\b}}b\u00a0%\u00d3\u00dcv\u00ae\u00a1\u0002v\f\u00e7%!\u00bcQ\"rJ1\u00ea8x\u00c1b\n\u00a1t\b}}b\u00a0%\u00f4\u00d9\u0006\u0099v\u00cc\r<\u00b8u#(FB\u0000\u00c4\u0000\u0002\u00acJ\u001cBB\b\u0083R\u00d3\u0080d\u00d1\u00b9\u00cc\r<\u00b8u#(CL(\u00a1\u0007\r\u00aev4UjJ\u00e2D\u00f2\u00e8v\u00c2\u00ccb\u0002\u0096\u00c2\u00dd\u00c4\u0000\u0002\u00acJ\u001cBB\b\u0083`\u00f6\u0080d\u008f\u008c\u00e4$'\u009ef/kZB\u0097\u00a1\u0007\r\u00aev4UjJ\u00e2f\u00f6\u0080\u0015\u00ccb\f\u00e0\u00e1.*\u008eo\u007f4\u001b\u001f\u00fe\u00cc\r<\u00b8u#(ai\u00a3IY\u00edc(\u00a1\u001d\u007fj\u00ed?.\u0085T\u0011?\u001b\u0011\u00f4\u00be\u00ef\u00ee\u00ca\u00ee\u00e9='\u00c5\\/iH\b\u0080k\u00ce\u00d3\u00cd\u00cc\r<\u00b8u#(zj\u009d\u0093x\u00c4\u0000\u0002\u00acJ\u001cBB\b\u0083R\u00d3\u0080d\u00ee\u001b\u00cc\r<\u00b8u#(Ck\u00f6a\u00a1\u0007,\u008bF/(CF\u00a3m\u0095\u00f4/Z,\u00eb?}g\u00e5\u00a1\r\u00fc\u0085\u0097\u00c4\u0000\u0002\u00acJ\u001cBB\b\u00a1S\u0081\u00f7'<\u00c9\u00e9d*\u008b^)(|S\u00bfc\u00d4\u00dcv\u001b\u00f9\u00ce\ro\u00a6{\nAUu\u0088g\u0095\u00d7\u001cf\u0002\u00cc\r<\u00b8u#(ai\u0083}\u00e9\u00d9\u00e1.*\u008eo\u007f0\u001a\u0012\u00f4\u00ac\u00a1\u0007,\u008bF/(ZS\u00a4f\u0095\u00dd8\u00bb\u00e7\u00fc\")\u0084\u001f\u001euJC\u00a4i\u00db\u00cf(\u00ee\u0097\u00a1\u0007\r\u00aev4UjJ\u00e2D\u00d8\u00f0v+\u00cc\r<\u00b8u#(ai\u0083P\u00ddt\u00ed82\u00da\u00ccb\n\u0080Q8f\u0000K\u00acd\u00dd\u0094\t2\u0087\u00ea'#\u00d1+\u0086\u00cc\r<\u00b8u#(Zhg\u00c2\u00c4\u0000\u0002\u00acJ\u001cBB\b\u0083R\u00d3\u0080dF\u0098\u00ed?.\u0085T\u00112\u0017\u0015\u00f4\u009b\\\u00ce\u001b\u00cc\r<\u00b8u#(ai\u009aO/\u00c4\u0000\u0002\u00acJ\u001cBB\b\u0083R\u00d3\u0080\u0001\u00e9C\u00ce1\u0014\u00af]aIwN\u00f6F\u00f1\u00ff\u000b\u00d8U\u00cd&i\u00a4~ T\u0014k\u0086N\u00fc\u00c1\u001f\u00e7j\u00a7\u0005\b\u0084su.u\u008f\u009f\u00e9='\u00c5E:nC\b\u00ab\u007f\u00d4\u00d89\u00bc\u009a\u00e6d\u0016\u0098U*nLF\u00b9oa\u00c4\u0000\u0002\u00acJ\u001cBB\b\u0083h\u00f1\u0080df\u00ac\u00c4\u0000\u0002\u00acJ\u001cBB\b\u0083h\u00f1\u0080\u0001\u009e\u00c0\u00ce1\u0014\u00af]akc\u001c\u0097N\u00f6\u00d1,\u00a3\u00e5\u00a7>2\u0083\\aaZI\u00ae~\u00d3\u00d4#\u00fa\u00c2\u00fd%%\u009eY!i\u0014\u000e\u0081A\u00fe\u00fd7\u0087\u00c1\u00e5d\b\u00b2Yu\u00cf\u00cc\r<\u00b8u#(aM\u0081\u009bEx\u00c1b\n\u0080Q8f\u0000K\u00acd\u00dd\u0094\u0004\u00cc$\u00ed,#\u0098\u000b\u00ea\u00c4\u0000\u0002\u00acJ\u001cBB\b\u0083h\u00f1\u0080\u0001{\u0086\u00ce1\u0014\u00af]akc\u001c\u0097N\u0093\u00f7\u0006t\u0084\u00f2\u0019\u0003\u0087\u001f\u0000_F\u001c\u00b9\u00cc\r<\u00b8u#(K\u007f\u0086\u00cc\r<\u00b8u#(Xj\u00b9\u00cc\r<\u00b8u#(ai\u00a3Y\u00ef\u00e6?\u0010\u008b\\;b\u00ae\u00a1\u0001\u00a9\u00cc[\u00c4!'\u009cQakNI\u00aa%\u00e9\u00cf?\u00b6n\u00efpj\u00e93\u00bcDc\u00cc\r<\u00b8u#(aE\u0086\u00ee\u00e9='\u00c5\\/iH\b\u0081e\u00d4\u00dc\u00f4\u00cc\r<\u00b8u#(a\u007f\u00a4\u00c2\u00a1\u0011\u00d8\u00ed?.\u0085T\u00112\u0019\u0015\u00f5\u00c3Ld\u00c3\u000f\u0000\u0090b\u000bj\u0000i\u0083d\u00e9\u0080\u008b\u00ffr\u00e7>(\u008em\u00ed?.\u0085T\u00114\u001c\u0012\u00fa;\u00ae\u00c4\u0000\u0002\u00acJ\u001cBB\b\u00a1F\u0081\u00ff\u0001\u00e6\u00c2\u00ce1\u0014\u00af]aIgt\u00f6#\u00e0q\u00e9'3\u008f\u007f(\u00af\u00ed?.\u0085T\u00112\u001a\u0010\u00f8?9\u00b9\u00cc\r<\u00b8u#(F@\u009fW\u00e9='\u00c5\\/iH\b\u0089e\u00cf\u00d9!\u00ba\r\u00e1%\u0083(\u00cc\u000fo\u00ae-\u00e7>$\u0086U\u0018fCR\u00a8\u00fe\u00cc\r<\u00b8u#(Xm\u00ca\u00f4\u00cc\r<\u00b8u#(ao\u009ea\u00c4\u0000\u0002\u00acJ\u001cBB\b\u00a1F\u0081\u00ff\u0001{\r\u00ce1\u0014\u00af]aIMl\u00f6#\u00e0\u00e5\u00ceb\u0000\u0017;\u00d2\u009av\u00cc\r<\u00b8u#(Cu\u0004\u00de\u00a1\u00cc\r<\u00b8u#(CkL\u00cc\r<\u00b8u#(Cv\u00fd";
        ooqrn = new int[]{5767178, 81264641, 29360131, 21102602, 30343169, 42598415, 70516747, 73072651, 19005443, 0xA00011, 77987847, 61800470, 9240595, 74842113, 0x1010002, 48627713, 88342529, 24838160, 35389441, 86245386, 70385665, 26542094, 5373953, 30474242, 17367050, 12845073, 87687178, 79233025, 34078740, 65551, 25886730, 35454979, 60948491, 47906827, 23461903, 29556737, 68812802, 83099659, 11796496, 82378762, 76087325, 86048770, 1310732, 86900737, 38928397, 78446604, 6946819, 66650122, 56295495, 61669377, 75300876, 0x33000F, 67305484, 39780363, 73924622, 28377100, 27721738, 15925262, 49610809, 32309275, 46071809, 32243713, 0x2210001, 24707074, 71237646, 2097171, 29163521, 80019472, 44695573, 29229057, 4325392, 6422536, 68616195, 19267593, 29294593, 48824332, 16973830, 53346305, 87031818, 85721092, 30605326, 0x530005, 81330181, 19202049, 79298570, 83034113, 46792705, 74907649, 0x2200001, 81068035, 70189059, 19857411, 81657867, 0x110003, 24444932, 86179841, 11599875, 1, 74973189, 27459588, 65994762, 18022415, 70451201, 0x1D00001, 31522826, 85983233, 48693250, 0x100001, 83820573, 63242282, 46858256, 32178177, 73793537, 79953921, 68943891, 73859073, 22806538, 0x2220030, 61734913, 86966273, 68091912, 43581453, 29622283, 20054032, 55246864, 8519691, 72876035, 46137354, 40501280, 53411868, 44433412, 7143445, 13959198, 72155147, 21757968};
        Ub.s();
        Ub.j();
        Ub.m();
        Ub.t();
        Ub.b();
        Ub.P();
        Ub.n();
        Ub.T();
    }

    private static /* synthetic */ CallSite Ollk0(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = ooqrn[n2 ^ 0xDD47DA6E];
        int n7 = n6 >>> 16;
        String string2 = Ub.I1mjitt0k(llItOj0n.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0xDD47DA6E);
        n6 = ooqrn[n3 ^ 0xDD47DA6E];
        int n8 = n6 >>> 16;
        String string3 = Ub.I1mjitt0k(llItOj0n.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0xDD47DA6E);
        n6 = ooqrn[n4 ^ 0xDD47DA6E];
        int n9 = n6 >>> 16;
        String string4 = Ub.I1mjitt0k(llItOj0n.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0xDD47DA6E);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x9061446A) + -178;
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

    private static /* synthetic */ void lll0jq(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[135];
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
        llItOj0n = stringBuilder.toString();
        ooqrn = nArray;
    }

    private static /* synthetic */ CallSite lIkm0k(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = ooqrn[n2 ^ 0xDD47DA6E];
        int n7 = n6 >>> 16;
        String string2 = Ub.I1mjitt0k(llItOj0n.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0xDD47DA6E);
        n6 = ooqrn[n3 ^ 0xDD47DA6E];
        int n8 = n6 >>> 16;
        String string3 = Ub.I1mjitt0k(llItOj0n.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0xDD47DA6E);
        n6 = ooqrn[n4 ^ 0xDD47DA6E];
        int n9 = n6 >>> 16;
        String string4 = Ub.I1mjitt0k(llItOj0n.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0xDD47DA6E);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x9061446A) + -178;
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

    private static /* synthetic */ String I1mjitt0k(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{124, -55, -6, -66, 84, 44, 53, -119, 123, -79, -8, -61, -106, 65, -114, 28};
        byte[] byArray3 = new byte[]{-126, 76, -95, 67, -1, -96, 82, 79, 84, -45, -88, 2, -27, 21, -39, 124};
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
