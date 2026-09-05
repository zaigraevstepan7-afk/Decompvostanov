/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NHS
 *  KDFzREm.NNGd
 *  KDFzREm.NNNNEg
 *  KDFzREm.NNNNRR
 *  KDFzREm.NNNNuO
 *  KDFzREm.NNNZg
 *  KDFzREm.NNNwS
 *  KDFzREm.NNde
 *  KDFzREm.NNtL
 *  KDFzREm.NNty
 *  KDFzREm.NNuU
 *  KDFzREm.NQl
 *  KDFzREm.NQo
 *  KDFzREm.NXi
 *  KDFzREm.NbK
 *  KDFzREm.NbL
 *  KDFzREm.Nef
 *  KDFzREm.NjL
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fStack
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
package KDFzREm;

import KDFzREm.MR;
import KDFzREm.NHS;
import KDFzREm.NNGd;
import KDFzREm.NNNNEg;
import KDFzREm.NNNNRR;
import KDFzREm.NNNNuO;
import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNde;
import KDFzREm.NNtL;
import KDFzREm.NNty;
import KDFzREm.NNuU;
import KDFzREm.NQl;
import KDFzREm.NQo;
import KDFzREm.NXi;
import KDFzREm.NbK;
import KDFzREm.NbL;
import KDFzREm.Nef;
import KDFzREm.NjL;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.ZH;
import KDFzREm.ZL;
import KDFzREm.ZR;
import KDFzREm.bA;
import KDFzREm.bC;
import KDFzREm.bF;
import KDFzREm.bS;
import KDFzREm.ba;
import KDFzREm.bf;
import KDFzREm.bp;
import KDFzREm.br;
import KDFzREm.iD;
import KDFzREm.lY;
import KDFzREm.lb;
import KDFzREm.lv;
import KDFzREm.uF;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;
import org.joml.Vector3fc;

@UZ(L="Trajectory", y=UR.VISUAL, N=Uz.WORLD)
public class bh
extends UM {
    private static String[] M;
    private static boolean[] B;
    public Object[] L;
    private static short[] Z;
    private static boolean[] z;
    private static float[] U;
    private static short[] W;
    private static int[] m;
    private static double[] P;
    private static float[] s;
    private static double[] T;
    private static boolean[] b;
    public Object[] u;
    private static short[] j;
    private static float[] v;
    private static short[] n;
    private static float[] t;
    private static float[] G;
    private static short[] l;
    private static short[] d;
    private static short[] w;
    private static short[] k;
    private static float[] Y;
    private static float[] Q;
    private static double[] O;
    private static double[] g;
    private static byte[] I;
    private static float[] J;
    private static boolean[] o;
    private static float[] q;
    private static short[] K;
    private static short[] V;
    private static boolean[] e;
    private static double[] H;
    private static short[] c;
    private static short[] X;
    private static short[] a;
    private static short[] p;
    private static float[] F;
    private static short[] A;
    private static short[] f;
    private static float[] C;
    public Object[] i;
    private static float[] S;
    private static short[] x;
    private static short[] D;
    public static Object[] R;
    private static short[] h;
    private static short[] r;
    private static float[] NN;
    private static float[] Ny;
    private static short[] NL;
    private static short[] Nu;
    private static boolean[] Ni;
    private static short[] NR;
    private static byte[] NM;
    private static String[] NB;
    private static double[] NZ;
    private static boolean[] Nz;
    private static boolean[] NU;
    private static /* synthetic */ String OOmIOI0;
    private static /* synthetic */ int[] lInjpjrln;

    private static /* synthetic */ int L(int n) {
        return Integer.rotateRight((Integer.rotateLeft(Integer.rotateRight(Integer.rotateLeft(n, 24), 16), 8) ^ 0x9CD508C1) + 1 ^ 0x9E2BE53C, 11) ^ 0x2CEE927C;
    }

    private static /* synthetic */ String M(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{122, -75, 37, 5, 121, 97, 97, 82, -48, 87, -22, -19, 63, 17, -75, 64};
        int n = 0;
        int n2 = 224;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 205;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int M(int n) {
        return Integer.rotateRight(Integer.rotateRight(-Integer.rotateRight(Integer.rotateRight(n, 25) ^ 0x9FA28486, 13), 31), 3);
    }

    private static void P() {
        T = new double[]{0.0, 0.0, 1.0, 0.0, 1.0E-6, 1.0E-6};
        NZ = new double[]{0.5, 1.0E-6, 0.5};
        P = new double[]{1.0E-6, 0.5, 0.0, 0.0};
        O = new double[]{0.0, 0.0, 0.0, 0.0};
        g = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
        H = new double[]{0.0, 0.0, 0.0};
    }

    private static void T() {
        R = new Object[]{Float.valueOf(4.0f)};
    }

    public bh() {
        bh.ookitln0("reuiiaii", 350371115, 1228530870, 1228530858, 1228530859, 350371115, 350371115, (bh)this);
        bf bf2 = new bf((String)((Object)bh.ookitln0("fkbite", 350371119, 1228530870, 1228530891, 1228530888, 350371119, 350371119)[0]), (boolean)bh.ookitln0("nykrxhgo", 350371119, 1228530870, 1228530889, 1228530875, 350371119, 350371119)[0], new bF((bC)((Object)bh.ookitln0("ljlembfv", 350371119, 1228530742, 1228530843, 1228530868, 350371119, 350371119)[bh.ookitln0("nykrxhgo", 350371119, 1228530870, 1228530743, 1228530866, 350371119, 350371119)[0]]), (bp)((Object)bh.ookitln0("ljlembfv", 350371119, 1228530740, 1228530852, 1228530741, 350371119, 350371119))));
        bh.ookitln0("txpofwnd", 350371113, 1228530870, 1228530834, 1228530868, 350371113, 350371113, (bh)this)[bh.ookitln0("nrqacrvo", 350371119, 1228530870, 1228530743, 1228530866, 350371119, 350371119)[1]] = bf2;
        bf bf3 = new bf((String)((Object)bh.ookitln0("gcfok", 350371119, 1228530870, 1228530891, 1228530888, 350371119, 350371119)[1]), (boolean)bh.ookitln0("zcdyiby", 350371119, 1228530870, 1228530889, 1228530875, 350371119, 350371119)[1], new ba((bC)((Object)bh.ookitln0("amakpkke", 350371119, 1228530742, 1228530843, 1228530868, 350371119, 350371119)[bh.ookitln0("txpofwnd", 350371119, 1228530870, 1228530743, 1228530866, 350371119, 350371119)[2]]), (bp)((Object)bh.ookitln0("ywfxk", 350371119, 1228530740, 1228530852, 1228530741, 350371119, 350371119))));
        bh.ookitln0("oqkhwwwu", 350371113, 1228530870, 1228530834, 1228530868, 350371113, 350371113, (bh)this)[bh.ookitln0("zcdyiby", 350371119, 1228530870, 1228530743, 1228530866, 350371119, 350371119)[3]] = bf3;
        bf bf4 = new bf((String)((Object)bh.ookitln0("fkbite", 350371119, 1228530870, 1228530891, 1228530888, 350371119, 350371119)[2]), (boolean)bh.ookitln0("qlxuqz", 350371119, 1228530870, 1228530889, 1228530875, 350371119, 350371119)[2], new ba((bC)((Object)bh.ookitln0("reuiiaii", 350371119, 1228530742, 1228530843, 1228530868, 350371119, 350371119)[bh.ookitln0("amakpkke", 350371119, 1228530870, 1228530922, 1228530866, 350371119, 350371119)[0]]), (bp)((Object)bh.ookitln0("nykrxhgo", 350371119, 1228530740, 1228530852, 1228530741, 350371119, 350371119))));
        bh.ookitln0("qlxuqz", 350371113, 1228530870, 1228530834, 1228530868, 350371113, 350371113, (bh)this)[bh.ookitln0("sagyczdy", 350371119, 1228530870, 1228530922, 1228530866, 350371119, 350371119)[1]] = bf4;
        bf bf5 = new bf((String)((Object)bh.ookitln0("cfxfafdc", 350371119, 1228530870, 1228530891, 1228530888, 350371119, 350371119)[3]), (boolean)bh.ookitln0("nykrxhgo", 350371119, 1228530870, 1228530889, 1228530875, 350371119, 350371119)[3], new bF((bC)((Object)bh.ookitln0("bkien", 350371119, 1228530742, 1228530843, 1228530868, 350371119, 350371119)[bh.ookitln0("reuiiaii", 350371119, 1228530870, 1228530858, 1228530866, 350371119, 350371119)[0]]), (bp)((Object)bh.ookitln0("gcfok", 350371119, 1228530740, 1228530852, 1228530741, 350371119, 350371119))));
        bh.ookitln0("qlxuqz", 350371113, 1228530870, 1228530834, 1228530868, 350371113, 350371113, (bh)this)[bh.ookitln0("ywfxk", 350371119, 1228530870, 1228530858, 1228530866, 350371119, 350371119)[1]] = bf5;
        bf bf6 = new bf((String)((Object)bh.ookitln0("bkien", 350371119, 1228530870, 1228530912, 1228530888, 350371119, 350371119)[0]), (boolean)bh.ookitln0("zcdyiby", 350371119, 1228530870, 1228530889, 1228530875, 350371119, 350371119)[4], new ba((bC)((Object)bh.ookitln0("oqkhwwwu", 350371119, 1228530742, 1228530843, 1228530868, 350371119, 350371119)[bh.ookitln0("amakpkke", 350371119, 1228530870, 1228530858, 1228530866, 350371119, 350371119)[2]]), (bp)((Object)bh.ookitln0("fkbite", 350371119, 1228530740, 1228530852, 1228530741, 350371119, 350371119))));
        bh.ookitln0("nykrxhgo", 350371113, 1228530870, 1228530834, 1228530868, 350371113, 350371113, (bh)this)[bh.ookitln0("cfxfafdc", 350371119, 1228530870, 1228530858, 1228530866, 350371119, 350371119)[3]] = bf6;
        bf bf7 = new bf((String)((Object)bh.ookitln0("fkbite", 350371119, 1228530870, 1228530912, 1228530888, 350371119, 350371119)[1]), (boolean)bh.ookitln0("nrqacrvo", 350371119, 1228530870, 1228530889, 1228530875, 350371119, 350371119)[5], new bF((bC)((Object)bh.ookitln0("bkien", 350371119, 1228530742, 1228530843, 1228530868, 350371119, 350371119)[bh.ookitln0("zcdyiby", 350371119, 1228530870, 1228530913, 1228530866, 350371119, 350371119)[0]]), (bp)((Object)bh.ookitln0("nrqacrvo", 350371119, 1228530740, 1228530852, 1228530741, 350371119, 350371119))));
        bh.ookitln0("nykrxhgo", 350371113, 1228530870, 1228530832, 1228530868, 350371113, 350371113, (bh)this)[bh.ookitln0("nrqacrvo", 350371119, 1228530870, 1228530913, 1228530866, 350371119, 350371119)[1]] = bf7;
        bf bf8 = new bf((String)((Object)bh.ookitln0("qlxuqz", 350371119, 1228530870, 1228530912, 1228530888, 350371119, 350371119)[2]), (boolean)bh.ookitln0("nykrxhgo", 350371119, 1228530870, 1228530889, 1228530875, 350371119, 350371119)[6], new bF((bC)((Object)bh.ookitln0("nykrxhgo", 350371119, 1228530742, 1228530843, 1228530868, 350371119, 350371119)[bh.ookitln0("nrqacrvo", 350371119, 1228530870, 1228530913, 1228530866, 350371119, 350371119)[2]]), (bp)((Object)bh.ookitln0("nrqacrvo", 350371119, 1228530740, 1228530852, 1228530741, 350371119, 350371119))));
        bh.ookitln0("ywfxk", 350371113, 1228530870, 1228530832, 1228530868, 350371113, 350371113, (bh)this)[bh.ookitln0("nrqacrvo", 350371119, 1228530870, 1228530913, 1228530866, 350371119, 350371119)[3]] = bf8;
        lv[] lvArray = new bf[bh.ookitln0("ywfxk", 350371119, 1228530870, 1228530937, 1228530918, 350371119, 350371119)[0]];
        lvArray[bh.ookitln0("txpofwnd", 350371119, 1228530870, 1228530889, 1228530875, 350371119, 350371119)[7]] = (bf)((Object)bh.ookitln0("txpofwnd", 350371113, 1228530870, 1228530834, 1228530868, 350371113, 350371113, (bh)this)[bh.ookitln0("ljlembfv", 350371119, 1228530870, 1228530913, 1228530866, 350371119, 350371119)[4]]);
        lvArray[bh.ookitln0("qlxuqz", 350371119, 1228530870, 1228530738, 1228530875, 350371119, 350371119)[0]] = (bf)((Object)bh.ookitln0("ywfxk", 350371113, 1228530870, 1228530834, 1228530868, 350371113, 350371113, (bh)this)[bh.ookitln0("ljlembfv", 350371119, 1228530870, 1228530913, 1228530866, 350371119, 350371119)[5]]);
        lvArray[bh.ookitln0("zcdyiby", 350371119, 1228530870, 1228530937, 1228530918, 350371119, 350371119)[1]] = (bf)((Object)bh.ookitln0("gcfok", 350371113, 1228530870, 1228530834, 1228530868, 350371113, 350371113, (bh)this)[bh.ookitln0("sagyczdy", 350371119, 1228530870, 1228530913, 1228530866, 350371119, 350371119)[6]]);
        lvArray[bh.ookitln0("nykrxhgo", 350371119, 1228530870, 1228530937, 1228530918, 350371119, 350371119)[2]] = (bf)((Object)bh.ookitln0("fkbite", 350371113, 1228530870, 1228530834, 1228530868, 350371113, 350371113, (bh)this)[bh.ookitln0("zcdyiby", 350371119, 1228530870, 1228530739, 1228530866, 350371119, 350371119)[0]]);
        lvArray[bh.ookitln0("nykrxhgo", 350371119, 1228530870, 1228530937, 1228530918, 350371119, 350371119)[3]] = (bf)((Object)bh.ookitln0("txpofwnd", 350371113, 1228530870, 1228530834, 1228530868, 350371113, 350371113, (bh)this)[bh.ookitln0("amakpkke", 350371119, 1228530870, 1228530739, 1228530866, 350371119, 350371119)[1]]);
        lvArray[bh.ookitln0("ljlembfv", 350371119, 1228530870, 1228530937, 1228530918, 350371119, 350371119)[4]] = (bf)((Object)bh.ookitln0("ljlembfv", 350371113, 1228530870, 1228530832, 1228530868, 350371113, 350371113, (bh)this)[bh.ookitln0("oqkhwwwu", 350371119, 1228530870, 1228530739, 1228530866, 350371119, 350371119)[2]]);
        lvArray[bh.ookitln0("cfxfafdc", 350371119, 1228530870, 1228530937, 1228530918, 350371119, 350371119)[5]] = (bf)((Object)bh.ookitln0("nrqacrvo", 350371113, 1228530870, 1228530832, 1228530868, 350371113, 350371113, (bh)this)[bh.ookitln0("ywfxk", 350371119, 1228530870, 1228530739, 1228530866, 350371119, 350371119)[3]]);
        CallSite callSite = bh.ookitln0("ljlembfv", 350371109, 1228530736, 1228530871, 1228530737, 350371109, 350371109, (lY)this, (String)((Object)bh.ookitln0("nykrxhgo", 350371119, 1228530870, 1228530912, 1228530888, 350371119, 350371119)[3]), (lv[])lvArray);
        bh.ookitln0("bkien", 350371113, 1228530870, 1228530832, 1228530868, 350371113, 350371113, (bh)this)[bh.ookitln0("nrqacrvo", 350371119, 1228530870, 1228530739, 1228530866, 350371119, 350371119)[4]] = callSite;
        CallSite callSite2 = bh.ookitln0("amakpkke", 350371109, 1228530736, 1228530852, 1228530748, 350371109, 350371109, (lY)this, (String)((Object)bh.ookitln0("nrqacrvo", 350371119, 1228530870, 1228530912, 1228530888, 350371119, 350371119)[4]), (int)bh.ookitln0("fkbite", 350371119, 1228530870, 1228530750, 1228530751, 350371119, 350371119)[0]);
        bh.ookitln0("ywfxk", 350371113, 1228530870, 1228530832, 1228530868, 350371113, 350371113, (bh)this)[bh.ookitln0("oqkhwwwu", 350371119, 1228530870, 1228530739, 1228530866, 350371119, 350371119)[5]] = callSite2;
        CallSite callSite3 = bh.ookitln0("sagyczdy", 350371109, 1228530736, 1228530852, 1228530748, 350371109, 350371109, (lY)this, (String)((Object)bh.ookitln0("bkien", 350371119, 1228530870, 1228530912, 1228530888, 350371119, 350371119)[5]), (int)bh.ookitln0("cfxfafdc", 350371119, 1228530870, 1228530750, 1228530751, 350371119, 350371119)[1]);
        bh.ookitln0("ljlembfv", 350371113, 1228530870, 1228530832, 1228530868, 350371113, 350371113, (bh)this)[bh.ookitln0("ywfxk", 350371119, 1228530870, 1228530739, 1228530866, 350371119, 350371119)[6]] = callSite3;
        CallSite callSite4 = bh.ookitln0("cfxfafdc", 350371119, 1228530915, 1228530843, 1228530749, 350371119, 350371119);
        bh.ookitln0("reuiiaii", 350371113, 1228530870, 1228530832, 1228530868, 350371113, 350371113, (bh)this)[bh.ookitln0("reuiiaii", 350371119, 1228530870, 1228530746, 1228530866, 350371119, 350371119)[0]] = callSite4;
        CallSite callSite5 = bh.ookitln0("sagyczdy", 350371119, 1228530915, 1228530843, 1228530749, 350371119, 350371119);
        bh.ookitln0("sagyczdy", 350371113, 1228530870, 1228530832, 1228530868, 350371113, 350371113, (bh)this)[bh.ookitln0("bkien", 350371119, 1228530870, 1228530746, 1228530866, 350371119, 350371119)[1]] = callSite5;
        CallSite callSite6 = bh.ookitln0("cfxfafdc", 350371109, 1228530895, 1228530747, 1228530744, 350371109, 350371109, (int)bh.ookitln0("ywfxk", 350371119, 1228530870, 1228530738, 1228530875, 350371119, 350371119)[1]);
        bh.ookitln0("reuiiaii", 350371113, 1228530870, 1228530843, 1228530868, 350371113, 350371113, (bh)this)[bh.ookitln0("ljlembfv", 350371119, 1228530870, 1228530746, 1228530866, 350371119, 350371119)[2]] = callSite6;
        CallSite callSite7 = bh.ookitln0("reuiiaii", 350371109, 1228530895, 1228530747, 1228530744, 350371109, 350371109, (int)bh.ookitln0("bkien", 350371119, 1228530870, 1228530738, 1228530875, 350371119, 350371119)[2]);
        bh.ookitln0("nykrxhgo", 350371113, 1228530870, 1228530843, 1228530868, 350371113, 350371113, (bh)this)[bh.ookitln0("ywfxk", 350371119, 1228530870, 1228530746, 1228530866, 350371119, 350371119)[3]] = callSite7;
    }

    static {
        bh.ntfClinit();
    }

    private static /* synthetic */ String B(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-122, 49, -46, 14, -99, -53, 41, -71, -7, -37, 94, -67, -40, -64, -9, -84};
        int n = 0;
        int n2 = 21;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 239;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int B(int n) {
        return Integer.rotateLeft(Integer.rotateLeft(Integer.rotateLeft(n ^ 0xDEB1595D, 15) ^ 0xD09ECDA8, 29), 7);
    }

    private static /* synthetic */ String Z(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-107, -69, -76, 46, 40, -122, -35, 63, 124, -51, 94, -75, 62, 114, 95, -74};
        int n = 0;
        int n2 = 77;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 231;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String i(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-75, -60, 9, -72, 92, -22, -72, -71, 49, -82, -123, 87, -107, -34, -32, -9};
        int n = 0;
        int n2 = 53;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 39;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int i(int n) {
        return Integer.rotateRight(Integer.rotateLeft((Integer.rotateRight(Integer.rotateLeft(n, 4) ^ 0x231479AC, 25) ^ 0x13263074) + 1, 8) ^ 0x9692521E, 6);
    }

    private static void b() {
        F = new float[]{1.0f, (float)Math.PI / 180, 0.15f};
        q = new float[]{(float)Math.PI / 180, 0.15f, 1.0f};
        t = new float[]{5.0f, 255.0f};
        Ny = new float[]{1.0f, 5.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        Q = new float[]{0.0f, 0.6f, (float)Math.PI * 2, 0.7f, 1.0f};
        S = new float[]{0.6f, 0.196f, 2.0f};
        NN = new float[]{0.0f, 2.0f, 2.0f, 2.0f};
        v = new float[]{0.0f, 2.5f, 0.0f};
        Y = new float[]{1.5f, 1.0f, (float)Math.PI / 180, 1.0f};
        U = new float[]{3.15f, 0.0f, 1.0f, 3.0f, 0.0f, -20.0f};
        C = new float[]{0.5f, 4.0f, 0.0f};
        J = new float[]{1.5f, 0.0f, 1.5f, (float)Math.PI / 180};
        s = new float[]{(float)Math.PI / 180, (float)Math.PI / 180, (float)Math.PI / 180, (float)Math.PI / 180, 20.0f};
        G = new float[]{2.0f, 3.0f, 1.0f, 4.0f};
    }

    /*
     * WARNING - void declaration
     */
    private int s() {
        void var3_4;
        if ((NNNwS)bh.ookitln0("zcdyiby", 350371113, 1228530867, 1228530864, 1228530868, 423232880, 119325134, (NNuU)((NNuU)bh.ookitln0("sagyczdy", 350371113, 1228530870, 1228530871, 1228530868, -917405739, 1397762729, (bh)this)[bh.ookitln0("gcfok", 350371119, 1228530870, 1228530904, 1228530866, -1266662016, 146776897)[4]]))[bh.ookitln0("nykrxhgo", 350371119, 1228530870, 1228530772, 1228530866, -186102454, -468735555)[0]] == null) {
            return (int)bh.ookitln0("amakpkke", 350371119, 1228530870, 1228530874, 1228530875, -1244124892, 1863966730)[4];
        }
        NbL[] nbLArray = NbL.values();
        int n = nbLArray.length;
        CallSite callSite = bh.ookitln0("sagyczdy", 350371119, 1228530870, 1228530874, 1228530875, -470556480, -1464461761)[5];
        while (var3_4 < n) {
            NbL nbL = nbLArray[var3_4];
            CallSite callSite2 = bh.ookitln0("txpofwnd", 350371115, 1228530856, 1228530841, 1228530822, 1284833579, 1855824420, (NNNwS)((NNNwS)bh.ookitln0("nrqacrvo", 350371113, 1228530867, 1228530864, 1228530868, -1566788935, -1612681714, (NNuU)((NNuU)bh.ookitln0("nykrxhgo", 350371113, 1228530870, 1228530871, 1228530868, -29408742, 320877618, (bh)this)[bh.ookitln0("cfxfafdc", 350371119, 1228530870, 1228530772, 1228530866, 1130174496, 838074599)[1]]))[bh.ookitln0("qlxuqz", 350371119, 1228530870, 1228530869, 1228530866, 1406103739, 1459798573)[0]]), (NbL)nbL);
            if (bh.ookitln0("qlxuqz", 350371115, 1228530818, 1228530852, 1228530819, 1284833579, 1855824420, (NQo)callSite2, (NQl)bh.ookitln0("gcfok", 350371119, 1228530823, 1228530896, 1228530821, -1724786208, 1556948993)) != false) {
                return (int)(bh.ookitln0("oqkhwwwu", 350371115, 1228530818, 1228530852, 1228530773, 1284833579, 1855824420, (NQo)callSite2, (NjL)((NNNwS)bh.ookitln0("qlxuqz", 350371113, 1228530867, 1228530864, 1228530868, -1098278017, -1152685395, (NNuU)((NNuU)bh.ookitln0("ljlembfv", 350371113, 1228530870, 1228530871, 1228530868, 815671358, -364725192, (bh)this)[bh.ookitln0("cfxfafdc", 350371119, 1228530870, 1228530869, 1228530866, -1994032485, -1442958224)[1]]))[bh.ookitln0("txpofwnd", 350371119, 1228530870, 1228530869, 1228530866, -1148463055, -1684255591)[2]])) - bh.ookitln0("nrqacrvo", 350371115, 1228530856, 1228530770, 1228530939, 1284833579, 1855824420, (NNNwS)((NNNwS)bh.ookitln0("cfxfafdc", 350371113, 1228530867, 1228530864, 1228530868, 7948836, 1579585287, (NNuU)((NNuU)bh.ookitln0("fkbite", 350371113, 1228530870, 1228530871, 1228530868, -398095940, -293920783, (bh)this)[bh.ookitln0("oqkhwwwu", 350371119, 1228530870, 1228530869, 1228530866, -122963079, 1130716356)[3]]))[bh.ookitln0("nrqacrvo", 350371119, 1228530870, 1228530869, 1228530866, 213477577, 640584232)[4]])));
            }
            ++var3_4;
        }
        return (int)bh.ookitln0("sagyczdy", 350371119, 1228530870, 1228530874, 1228530875, 23441444, 1869646634)[6];
    }

    private static void n() {
        NB = new String[]{"pearl", "trident", "bow", "potions"};
        M = new String[]{"crossbow", "snowball", "windcharge", "predict-entity", "line-color", "hit-line-color"};
    }

    private static void m() {
        m = new int[]{-11104513, -43691};
    }

    private static void t() {
        Nu = new short[]{2, 0, 1, 1};
        W = new short[]{0, 2};
        j = new short[]{3, 3, 0, 4};
        D = new short[]{4, 0, 5, 1, 1, 0, 2};
        K = new short[]{4, 3, 0, 1, 2, 3, 4};
        a = new short[]{5, 6, 0, 1};
        X = new short[]{6, 5, 6, 1, 0, 1, 5, 6};
        p = new short[]{0, 1};
        NL = new short[]{0, 0, 4};
        l = new short[]{2, 3, 4, 4};
        d = new short[]{3, 0};
        Z = new short[]{3, 0, 4, 0, 4, 0};
        c = new short[]{4, 0, 4, 0, 4};
        f = new short[]{0, 4};
        A = new short[]{0, 4, 0};
        NR = new short[]{4, 1, 0, 4, 1, 0, 0};
        x = new short[]{4, 0, 4};
        k = new short[]{0, 4, 0, 4};
        w = new short[]{4, 2, 0, 4, 2, 3};
        V = new short[]{0, 4, 3, 0, 0, 4, 0};
        n = new short[]{1, 0, 4, 1, 0};
        r = new short[]{4, 0};
        h = new short[]{4, 0, 4, 0, 4, 0, 4};
    }

    private static void v() {
        Nz = new boolean[]{true, true, true, true, true, true, true, false};
        e = new boolean[]{true, false, false};
        Ni = new boolean[]{true, false};
        o = new boolean[]{true, true, false, true};
        z = new boolean[]{false, false};
        b = new boolean[]{true, true, false, false};
        NU = new boolean[]{false, true, false, false, false, false, false, true};
        B = new boolean[]{false, false, false, true, false, true, false};
    }

    private void j() {
        CallSite callSite;
        if (bh.ookitln0("fkbite", 350371113, 1228530870, 1228530834, 1228530868, 350371113, 350371113, (bh)this) == null) {
            bh.ookitln0("gcfok", 350371112, 1228530870, 1228530834, 1228530868, 350371112, 350371112, (bh)this, (Object[])new Object[bh.ookitln0("txpofwnd", 350371119, 1228530870, 1228530919, 1228530918, 350371119, 350371119)[3]]);
            callSite = bh.ookitln0("nrqacrvo", 350371113, 1228530870, 1228530834, 1228530868, 350371113, 350371113, (bh)this);
        }
        if (bh.ookitln0("nykrxhgo", 350371113, 1228530870, 1228530832, 1228530868, 350371113, 350371113, (bh)this) == null) {
            bh.ookitln0("zcdyiby", 350371112, 1228530870, 1228530832, 1228530868, 350371112, 350371112, (bh)this, (Object[])new Object[bh.ookitln0("sagyczdy", 350371119, 1228530870, 1228530919, 1228530918, 350371119, 350371119)[4]]);
            callSite = bh.ookitln0("bkien", 350371113, 1228530870, 1228530832, 1228530868, 350371113, 350371113, (bh)this);
        }
        if (bh.ookitln0("nrqacrvo", 350371113, 1228530870, 1228530843, 1228530868, 350371113, 350371113, (bh)this) == null) {
            bh.ookitln0("zcdyiby", 350371112, 1228530870, 1228530843, 1228530868, 350371112, 350371112, (bh)this, (Object[])new Object[bh.ookitln0("fkbite", 350371119, 1228530870, 1228530919, 1228530918, 350371119, 350371119)[5]]);
            callSite = bh.ookitln0("amakpkke", 350371113, 1228530870, 1228530843, 1228530868, 350371113, 350371113, (bh)this);
            callSite[bh.ookitln0("nrqacrvo", 350371119, 1228530870, 1228530872, 1228530875, 350371119, 350371119)[1]] = bh.ookitln0("gcfok", 350371109, 1228530895, 1228530747, 1228530744, 350371109, 350371109, (int)bh.ookitln0("fkbite", 350371119, 1228530870, 1228530872, 1228530875, 350371119, 350371119)[2]);
            callSite[bh.ookitln0("reuiiaii", 350371119, 1228530870, 1228530872, 1228530875, 350371119, 350371119)[3]] = bh.ookitln0("cfxfafdc", 350371109, 1228530895, 1228530747, 1228530744, 350371109, 350371109, (int)bh.ookitln0("nrqacrvo", 350371119, 1228530870, 1228530872, 1228530875, 350371119, 350371119)[4]);
        }
    }

    private static /* synthetic */ String U(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{33, 123, -85, 125, 6, -66, -105, 63, -117, -107, 23, 31, -1, 30, -55, 124};
        int n = 0;
        int n2 = 143;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 55;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String z(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-62, -42, -127, -90, 32, -36, 10, -14, -66, 99, -16, -123, -51, 56, 107, 108};
        int n = 0;
        int n2 = 24;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 41;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int u(int n) {
        return Integer.rotateLeft(Integer.rotateRight(n ^ 0x5CC29DA9, 28) ^ 0x68B9F871, 9);
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{115, -43, 31, -106, -9, -108, 4, 82, -15, 68, -109, 110, 120, 53, -43, 6};
        int n = 0;
        int n2 = 67;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 239;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private void y(ZH zH, Matrix4fStack matrix4fStack, int n) {
        CallSite callSite = bh.ookitln0("amakpkke", 350371119, 1228530870, 1228530771, 1228530854, 270563920, 94881245)[0];
        CallSite callSite2 = bh.ookitln0("fkbite", 350371115, 1228530768, 1228530691, 1228530769, 1284833579, 1855824420, (ZH)zH);
        CallSite callSite3 = bh.ookitln0("sagyczdy", 350371115, 1228530782, 1228530834, 1228530939, 1284833579, 1855824420, (ZR)((Object)callSite2));
        NXi nXi = new NXi((double)callSite, (double)bh.ookitln0("zcdyiby", 350371119, 1228530870, 1228530728, 1228530721, -602245344, 1263755100)[1], (double)bh.ookitln0("oqkhwwwu", 350371119, 1228530870, 1228530728, 1228530721, 828497103, 1999933017)[2]);
        NXi nXi2 = new NXi((double)bh.ookitln0("txpofwnd", 350371119, 1228530870, 1228530728, 1228530721, -769040158, 1654250667)[3], (double)bh.ookitln0("txpofwnd", 350371119, 1228530870, 1228530728, 1228530721, -1304697826, -1016235495)[4], (double)callSite);
        NXi nXi3 = new NXi((double)(-callSite), (double)bh.ookitln0("fkbite", 350371119, 1228530870, 1228530728, 1228530721, 1995126588, -319075696)[5], (double)bh.ookitln0("qlxuqz", 350371119, 1228530870, 1228530728, 1228530721, -1204932178, 1995411811)[6]);
        NXi nXi4 = new NXi((double)bh.ookitln0("nykrxhgo", 350371119, 1228530870, 1228530720, 1228530721, 1714438587, -2072088741)[0], (double)bh.ookitln0("sagyczdy", 350371119, 1228530870, 1228530720, 1228530721, -427745995, 1582122249)[1], (double)(-callSite));
        CallSite callSite4 = bh.ookitln0("amakpkke", 350371109, 1228530729, 1228530852, 1228530813, 1284833579, 1855824420, n, (int)((float)bh.ookitln0("reuiiaii", 350371109, 1228530729, 1228530871, 1228530783, 1284833579, 1855824420, n) * bh.ookitln0("ywfxk", 350371119, 1228530870, 1228530771, 1228530854, -266048770, 1662180485)[1] * bh.ookitln0("oqkhwwwu", 350371119, 1228530870, 1228530771, 1228530854, 98716254, 583887873)[2]));
        bh.ookitln0("nykrxhgo", 350371115, 1228530782, 1228530871, 1228530939, 1284833579, 1855824420, (ZR)((Object)bh.ookitln0("oqkhwwwu", 350371115, 1228530782, 1228530871, 1228530781, 1284833579, 1855824420, (ZR)((Object)bh.ookitln0("fkbite", 350371115, 1228530782, 1228530852, 1228530780, 1284833579, 1855824420, (ZR)((Object)callSite2), (Matrix4f)matrix4fStack, (float)((float)bh.ookitln0("sagyczdy", 350371113, 1228530915, 1228530912, 1228530913, 1489678188, -44895367, (NXi)nXi)), (float)((float)bh.ookitln0("cfxfafdc", 350371113, 1228530915, 1228530872, 1228530913, 2047356875, 1473666623, (NXi)nXi)), (float)((float)bh.ookitln0("nykrxhgo", 350371113, 1228530915, 1228530851, 1228530913, -1023410720, -2047166438, (NXi)nXi)))), (int)callSite4)));
        bh.ookitln0("zcdyiby", 350371115, 1228530782, 1228530871, 1228530939, 1284833579, 1855824420, (ZR)((Object)bh.ookitln0("nrqacrvo", 350371115, 1228530782, 1228530871, 1228530781, 1284833579, 1855824420, (ZR)((Object)bh.ookitln0("ywfxk", 350371115, 1228530782, 1228530852, 1228530780, 1284833579, 1855824420, (ZR)((Object)callSite2), (Matrix4f)matrix4fStack, (float)((float)bh.ookitln0("reuiiaii", 350371113, 1228530915, 1228530912, 1228530913, -1846541618, -527370017, (NXi)nXi2)), (float)((float)bh.ookitln0("cfxfafdc", 350371113, 1228530915, 1228530872, 1228530913, 502231439, 1020027033, (NXi)nXi2)), (float)((float)bh.ookitln0("fkbite", 350371113, 1228530915, 1228530851, 1228530913, -1246495997, -1872122145, (NXi)nXi2)))), (int)callSite4)));
        bh.ookitln0("sagyczdy", 350371115, 1228530782, 1228530871, 1228530939, 1284833579, 1855824420, (ZR)((Object)bh.ookitln0("zcdyiby", 350371115, 1228530782, 1228530871, 1228530781, 1284833579, 1855824420, (ZR)((Object)bh.ookitln0("txpofwnd", 350371115, 1228530782, 1228530852, 1228530780, 1284833579, 1855824420, (ZR)((Object)callSite2), (Matrix4f)matrix4fStack, (float)((float)bh.ookitln0("cfxfafdc", 350371113, 1228530915, 1228530912, 1228530913, -1109545935, -614523740, (NXi)nXi3)), (float)((float)bh.ookitln0("amakpkke", 350371113, 1228530915, 1228530872, 1228530913, 100581745, 354640217, (NXi)nXi3)), (float)((float)bh.ookitln0("oqkhwwwu", 350371113, 1228530915, 1228530851, 1228530913, -101711111, 1793577278, (NXi)nXi3)))), (int)callSite4)));
        bh.ookitln0("gcfok", 350371115, 1228530782, 1228530871, 1228530939, 1284833579, 1855824420, (ZR)((Object)bh.ookitln0("zcdyiby", 350371115, 1228530782, 1228530871, 1228530781, 1284833579, 1855824420, (ZR)((Object)bh.ookitln0("ywfxk", 350371115, 1228530782, 1228530852, 1228530780, 1284833579, 1855824420, (ZR)((Object)callSite2), (Matrix4f)matrix4fStack, (float)((float)bh.ookitln0("qlxuqz", 350371113, 1228530915, 1228530912, 1228530913, -525822055, 2037587361, (NXi)nXi4)), (float)((float)bh.ookitln0("zcdyiby", 350371113, 1228530915, 1228530872, 1228530913, 569266181, 1839101311, (NXi)nXi4)), (float)((float)bh.ookitln0("ywfxk", 350371113, 1228530915, 1228530851, 1228530913, -688116711, -262401485, (NXi)nXi4)))), (int)callSite4)));
        bh.ookitln0("nykrxhgo", 350371115, 1228530779, 1228530871, 1228530776, 1284833579, 1855824420, (ZL)((Object)bh.ookitln0("ljlembfv", 350371115, 1228530768, 1228530843, 1228530778, 1284833579, 1855824420, (ZH)zH)), (int)callSite3);
    }

    private static /* synthetic */ int y(int n) {
        return Integer.rotateLeft(Integer.rotateLeft(Integer.rotateLeft(-Integer.rotateRight(Integer.rotateRight(n, 4), 24), 24), 20), 24);
    }

    /*
     * WARNING - void declaration
     */
    private List<br> y(NXi nXi, float f) {
        void var8_9;
        bh.ookitln0("cfxfafdc", 350371115, 1228530870, 1228530858, 1228530859, 1284833579, 1855824420, (bh)this);
        CallSite callSite = bh.ookitln0("fkbite", 350371115, 1228530856, 1228530857, 1228530838, 1284833579, 1855824420, (NNNwS)((NNNwS)bh.ookitln0("gcfok", 350371113, 1228530867, 1228530864, 1228530868, 757452451, -1581320063, (NNuU)((NNuU)bh.ookitln0("nrqacrvo", 350371113, 1228530870, 1228530871, 1228530868, -926098584, -339131091, (bh)this)[bh.ookitln0("cfxfafdc", 350371119, 1228530870, 1228530851, 1228530866, 1721953802, -2124961346)[1]]))[bh.ookitln0("gcfok", 350371119, 1228530870, 1228530851, 1228530866, 663504306, 859178993)[2]]));
        CallSite callSite2 = bh.ookitln0("ljlembfv", 350371115, 1228530856, 1228530839, 1228530838, 1284833579, 1855824420, (NNNwS)((NNNwS)bh.ookitln0("zcdyiby", 350371113, 1228530867, 1228530864, 1228530868, -40251385, 589199337, (NNuU)((NNuU)bh.ookitln0("amakpkke", 350371113, 1228530870, 1228530871, 1228530868, 1871102216, 432829277, (bh)this)[bh.ookitln0("amakpkke", 350371119, 1228530870, 1228530851, 1228530866, 1526975360, -1883920871)[3]]))[bh.ookitln0("sagyczdy", 350371119, 1228530870, 1228530851, 1228530866, 99309934, 1364779217)[4]]));
        NXi nXi2 = new NXi((double)bh.ookitln0("nrqacrvo", 350371109, 1228530837, 1228530834, 1228530835, 1284833579, 1855824420, (NbK)((NNNwS)bh.ookitln0("nykrxhgo", 350371113, 1228530867, 1228530864, 1228530868, 1533461610, 1166314298, (NNuU)((NNuU)bh.ookitln0("ljlembfv", 350371113, 1228530870, 1228530871, 1228530868, -1731480359, 322422399, (bh)this)[bh.ookitln0("cfxfafdc", 350371119, 1228530870, 1228530851, 1228530866, -487566441, -1900976969)[5]]))[bh.ookitln0("reuiiaii", 350371119, 1228530870, 1228530836, 1228530866, -570783493, -836309087)[0]])), (double)(bh.ookitln0("nykrxhgo", 350371109, 1228530837, 1228530832, 1228530835, 1284833579, 1855824420, (NbK)((NNNwS)bh.ookitln0("sagyczdy", 350371113, 1228530867, 1228530864, 1228530868, -1101691713, 434012681, (NNuU)((NNuU)bh.ookitln0("txpofwnd", 350371113, 1228530870, 1228530871, 1228530868, 1211915462, -1436422853, (bh)this)[bh.ookitln0("bkien", 350371119, 1228530870, 1228530836, 1228530866, -2054423923, 954552342)[1]]))[bh.ookitln0("oqkhwwwu", 350371119, 1228530870, 1228530836, 1228530866, 698674790, -1562345921)[2]])) + (double)bh.ookitln0("nrqacrvo", 350371115, 1228530856, 1228530844, 1228530845, 1284833579, 1855824420, (NNNwS)((NNNwS)bh.ookitln0("fkbite", 350371113, 1228530867, 1228530864, 1228530868, 2127327701, 27173194, (NNuU)((NNuU)bh.ookitln0("sagyczdy", 350371113, 1228530870, 1228530871, 1228530868, -13706186, 1885246937, (bh)this)[bh.ookitln0("bkien", 350371119, 1228530870, 1228530836, 1228530866, -965857114, -1672610323)[3]]))[bh.ookitln0("gcfok", 350371119, 1228530870, 1228530836, 1228530866, 755973790, 188843946)[4]]), (NNGd)bh.ookitln0("gcfok", 350371115, 1228530856, 1228530846, 1228530847, 1284833579, 1855824420, (NNNwS)((NNNwS)bh.ookitln0("oqkhwwwu", 350371113, 1228530867, 1228530864, 1228530868, 918243911, -437208075, (NNuU)((NNuU)bh.ookitln0("nykrxhgo", 350371113, 1228530870, 1228530871, 1228530868, 217842679, 1066257940, (bh)this)[bh.ookitln0("sagyczdy", 350371119, 1228530870, 1228530833, 1228530866, -1777545510, 1588690745)[0]]))[bh.ookitln0("nykrxhgo", 350371119, 1228530870, 1228530833, 1228530866, 354872470, -1517389895)[1]])))), (double)bh.ookitln0("txpofwnd", 350371109, 1228530837, 1228530843, 1228530835, 1284833579, 1855824420, (NbK)((NNNwS)bh.ookitln0("cfxfafdc", 350371113, 1228530867, 1228530864, 1228530868, -1070489476, -44620378, (NNuU)((NNuU)bh.ookitln0("zcdyiby", 350371113, 1228530870, 1228530871, 1228530868, 1107556917, 2147152483, (bh)this)[bh.ookitln0("bkien", 350371119, 1228530870, 1228530842, 1228530866, -798597403, 1655442003)[0]]))[bh.ookitln0("ywfxk", 350371119, 1228530870, 1228530842, 1228530866, 1851869560, 1064401208)[1]])));
        NbL[] nbLArray = NbL.values();
        int n = nbLArray.length;
        CallSite callSite3 = bh.ookitln0("sagyczdy", 350371119, 1228530870, 1228530861, 1228530875, 363185440, 51103371)[1];
        while (var8_9 < n) {
            NbL nbL = nbLArray[var8_9];
            CallSite callSite4 = bh.ookitln0("nykrxhgo", 350371115, 1228530856, 1228530841, 1228530822, 1284833579, 1855824420, (NNNwS)((NNNwS)bh.ookitln0("cfxfafdc", 350371113, 1228530867, 1228530864, 1228530868, -936927730, 217039265, (NNuU)((NNuU)bh.ookitln0("txpofwnd", 350371113, 1228530870, 1228530871, 1228530868, 806205058, -462702993, (bh)this)[bh.ookitln0("txpofwnd", 350371119, 1228530870, 1228530842, 1228530866, 954825249, 1702893120)[2]]))[bh.ookitln0("ywfxk", 350371119, 1228530870, 1228530840, 1228530866, 176774965, -1405270573)[0]]), (NbL)nbL);
            if (bh.ookitln0("nrqacrvo", 350371115, 1228530818, 1228530852, 1228530819, 1284833579, 1855824420, (NQo)callSite4, (NQl)bh.ookitln0("amakpkke", 350371119, 1228530823, 1228530820, 1228530821, -369464532, -653408032)) != false) {
                if (bh.ookitln0("amakpkke", 350371115, 1228530816, 1228530817, 1228530879, 1284833579, 1855824420, (bf)((bf)((Object)bh.ookitln0("fkbite", 350371113, 1228530870, 1228530834, 1228530868, -797278994, 143979753, (bh)this)[bh.ookitln0("amakpkke", 350371119, 1228530870, 1228530840, 1228530866, -661115655, 1848465515)[1]]))) != false) {
                    return bh.ookitln0("cfxfafdc", 350371109, 1228530862, 1228530829, 1228530826, 1284833579, 1855824420, (Object)new br(nXi2, (NXi)bh.ookitln0("ljlembfv", 350371109, 1228530870, 1228530852, 1228530831, 1284833579, 1855824420, (NbK)((NNNwS)bh.ookitln0("gcfok", 350371113, 1228530867, 1228530864, 1228530868, 443287894, 178078530, (NNuU)((NNuU)bh.ookitln0("gcfok", 350371113, 1228530870, 1228530871, 1228530868, 2037429851, 1155796593, (bh)this)[bh.ookitln0("ljlembfv", 350371119, 1228530870, 1228530840, 1228530866, -1288137892, 1552995120)[2]]))[bh.ookitln0("qlxuqz", 350371119, 1228530870, 1228530840, 1228530866, -407414073, -1383227693)[3]]), (NXi)nXi, (float)callSite, (float)callSite2, (float)bh.ookitln0("txpofwnd", 350371119, 1228530870, 1228530830, 1228530854, -1832621978, -1293686275)[0], (float)bh.ookitln0("gcfok", 350371119, 1228530870, 1228530830, 1228530854, -142114767, 2092122055)[1]), (bF)((Object)bh.ookitln0("sagyczdy", 350371115, 1228530816, 1228530852, 1228530828, 1284833579, 1855824420, (bf)((bf)((Object)bh.ookitln0("qlxuqz", 350371113, 1228530870, 1228530834, 1228530868, 2005458226, -1186678046, (bh)this)[bh.ookitln0("amakpkke", 350371119, 1228530870, 1228530840, 1228530866, 1668326304, 2113551399)[4]]))))));
                }
            }
            if (bh.ookitln0("ljlembfv", 350371115, 1228530818, 1228530852, 1228530819, 1284833579, 1855824420, (NQo)callSite4, (NQl)bh.ookitln0("sagyczdy", 350371119, 1228530823, 1228530827, 1228530821, -1676155052, -593285455)) != false) {
                if (bh.ookitln0("amakpkke", 350371115, 1228530816, 1228530817, 1228530879, 1284833579, 1855824420, (bf)((bf)((Object)bh.ookitln0("fkbite", 350371113, 1228530870, 1228530834, 1228530868, -261556352, 1321723365, (bh)this)[bh.ookitln0("amakpkke", 350371119, 1228530870, 1228530840, 1228530866, -1124152637, 285553352)[5]]))) != false) {
                    return bh.ookitln0("sagyczdy", 350371109, 1228530862, 1228530829, 1228530826, 1284833579, 1855824420, (Object)new br(nXi2, (NXi)bh.ookitln0("oqkhwwwu", 350371109, 1228530870, 1228530852, 1228530831, 1284833579, 1855824420, (NbK)((NNNwS)bh.ookitln0("ywfxk", 350371113, 1228530867, 1228530864, 1228530868, 231522882, 1945970833, (NNuU)((NNuU)bh.ookitln0("cfxfafdc", 350371113, 1228530870, 1228530871, 1228530868, -480771668, 1616479408, (bh)this)[bh.ookitln0("amakpkke", 350371119, 1228530870, 1228530840, 1228530866, 1300369495, 766664755)[6]]))[bh.ookitln0("nykrxhgo", 350371119, 1228530870, 1228530824, 1228530866, 713864890, 2054949037)[0]]), (NXi)nXi, (float)callSite, (float)callSite2, (float)bh.ookitln0("cfxfafdc", 350371119, 1228530870, 1228530830, 1228530854, 1672485985, 1964446506)[2], (float)bh.ookitln0("amakpkke", 350371119, 1228530870, 1228530825, 1228530854, -1267032483, 1921051566)[0]), (bF)((Object)bh.ookitln0("cfxfafdc", 350371115, 1228530816, 1228530852, 1228530828, 1284833579, 1855824420, (bf)((bf)((Object)bh.ookitln0("nrqacrvo", 350371113, 1228530870, 1228530834, 1228530868, -562011624, -1918932501, (bh)this)[bh.ookitln0("bkien", 350371119, 1228530870, 1228530824, 1228530866, 201511362, -1227250114)[1]]))))));
                }
            }
            if (bh.ookitln0("nrqacrvo", 350371115, 1228530818, 1228530852, 1228530819, 1284833579, 1855824420, (NQo)callSite4, (NQl)bh.ookitln0("zcdyiby", 350371119, 1228530823, 1228530934, 1228530821, -530207373, 1225252115)) != false) {
                if (bh.ookitln0("ljlembfv", 350371115, 1228530816, 1228530817, 1228530879, 1284833579, 1855824420, (bf)((bf)((Object)bh.ookitln0("amakpkke", 350371113, 1228530870, 1228530834, 1228530868, 1169027956, -725575659, (bh)this)[bh.ookitln0("txpofwnd", 350371119, 1228530870, 1228530824, 1228530866, -943281095, 494427975)[2]]))) != false) {
                    void var15_20;
                    void var11_14;
                    if (bh.ookitln0("ljlembfv", 350371109, 1228530935, 1228530832, 1228530932, 1284833579, 1855824420, (NQo)callSite4) == false) {
                        return bh.ookitln0("ljlembfv", 350371109, 1228530933, 1228530930, 1228530931, 1284833579, 1855824420);
                    }
                    if (bh.ookitln0("gcfok", 350371108, 1228530862, 1228530938, 1228530939, 1284833579, 1855824420, (List)((Object)bh.ookitln0("qlxuqz", 350371115, 1228530942, 1228530852, 1228530931, 1284833579, 1855824420, (NNNNuO)((NNNNuO)bh.ookitln0("bkien", 350371115, 1228530818, 1228530940, 1228530941, 1284833579, 1855824420, (NQo)callSite4, (NNNNRR)bh.ookitln0("txpofwnd", 350371119, 1228530928, 1228530824, 1228530929, -585438905, 352971813), (Object)bh.ookitln0("zcdyiby", 350371119, 1228530942, 1228530852, 1228530943, 918898930, -976664455)))))) == bh.ookitln0("fkbite", 350371119, 1228530870, 1228530936, 1228530875, 21552905, 996583826)[0]) {
                        int[] nArray = new int[bh.ookitln0("bkien", 350371119, 1228530870, 1228530936, 1228530875, -1610441233, 676389539)[1]];
                        nArray[bh.ookitln0("amakpkke", 350371119, 1228530870, 1228530936, 1228530875, -1119668635, -1253399577)[2]] = (int)bh.ookitln0("amakpkke", 350371119, 1228530870, 1228530936, 1228530875, -1768058750, -653536819)[3];
                        int[] nArray2 = nArray;
                    } else {
                        int[] nArray = new int[bh.ookitln0("gcfok", 350371119, 1228530870, 1228530937, 1228530918, -1157119394, -233104149)[7]];
                        nArray[bh.ookitln0("cfxfafdc", 350371119, 1228530870, 1228530874, 1228530875, 1176344856, -399999160)[0]] = (int)bh.ookitln0("bkien", 350371119, 1228530870, 1228530919, 1228530918, 1295385534, -1838721027)[0];
                        nArray[bh.ookitln0("zcdyiby", 350371119, 1228530870, 1228530874, 1228530875, -834346436, 840987913)[1]] = (int)bh.ookitln0("reuiiaii", 350371119, 1228530870, 1228530874, 1228530875, 1923038041, -1211589968)[2];
                        nArray[bh.ookitln0("nrqacrvo", 350371119, 1228530870, 1228530919, 1228530918, 496496934, -602456716)[1]] = (int)bh.ookitln0("sagyczdy", 350371119, 1228530870, 1228530919, 1228530918, -911042838, 1226969558)[2];
                        int[] nArray3 = nArray;
                    }
                    ArrayList<br> arrayList = new ArrayList<br>();
                    void var13_17 = var11_14;
                    int n2 = ((void)var13_17).length;
                    CallSite callSite5 = bh.ookitln0("nykrxhgo", 350371119, 1228530870, 1228530874, 1228530875, 2113484796, 728121106)[3];
                    while (var15_20 < n2) {
                        void var16_21 = var13_17[var15_20];
                        CallSite callSite6 = bh.ookitln0("oqkhwwwu", 350371115, 1228530856, 1228530917, 1228530914, 1284833579, 1855824420, (NNNwS)((NNNwS)bh.ookitln0("reuiiaii", 350371113, 1228530867, 1228530864, 1228530868, 996423405, -860964625, (NNuU)((NNuU)bh.ookitln0("nrqacrvo", 350371113, 1228530870, 1228530871, 1228530868, 745770467, -572860140, (bh)this)[bh.ookitln0("nrqacrvo", 350371119, 1228530870, 1228530916, 1228530866, 127260927, -2072526465)[0]]))[bh.ookitln0("amakpkke", 350371119, 1228530870, 1228530916, 1228530866, 287570774, 1822398953)[1]]), (float)bh.ookitln0("zcdyiby", 350371119, 1228530870, 1228530825, 1228530854, 65329219, 815812479)[1]);
                        CallSite callSite7 = bh.ookitln0("qlxuqz", 350371115, 1228530926, 1228530927, 1228530924, 1284833579, 1855824420, (Quaternionf)new Quaternionf(), (double)((float)var16_21 * bh.ookitln0("nykrxhgo", 350371119, 1228530870, 1228530825, 1228530854, -13776209, 709606634)[2]), (double)bh.ookitln0("bkien", 350371113, 1228530915, 1228530912, 1228530913, -1803651494, 1239175998, (NXi)callSite6), (double)bh.ookitln0("cfxfafdc", 350371113, 1228530915, 1228530872, 1228530913, -1945582341, 766271600, (NXi)callSite6), (double)bh.ookitln0("bkien", 350371113, 1228530915, 1228530851, 1228530913, -264838059, -635838761, (NXi)callSite6));
                        CallSite callSite8 = bh.ookitln0("nykrxhgo", 350371115, 1228530856, 1228530925, 1228530914, 1284833579, 1855824420, (NNNwS)((NNNwS)bh.ookitln0("zcdyiby", 350371113, 1228530867, 1228530864, 1228530868, -90990785, 652286356, (NNuU)((NNuU)bh.ookitln0("nykrxhgo", 350371113, 1228530870, 1228530871, 1228530868, -304558441, 1376092768, (bh)this)[bh.ookitln0("ywfxk", 350371119, 1228530870, 1228530916, 1228530866, 1024275476, -1139239451)[2]]))[bh.ookitln0("cfxfafdc", 350371119, 1228530870, 1228530916, 1228530866, -1159707654, -720005493)[3]]), (float)bh.ookitln0("nykrxhgo", 350371119, 1228530870, 1228530825, 1228530854, -1194407898, -1684058424)[3]);
                        CallSite callSite9 = bh.ookitln0("nykrxhgo", 350371115, 1228530920, 1228530921, 1228530902, 1284833579, 1855824420, (Vector3f)bh.ookitln0("ywfxk", 350371115, 1228530915, 1228530922, 1228530923, 1284833579, 1855824420, (NXi)callSite8), (Quaternionfc)callSite7);
                        CallSite callSite10 = bh.ookitln0("fkbite", 350371109, 1228530870, 1228530852, 1228530900, 1284833579, 1855824420, (double)((double)bh.ookitln0("gcfok", 350371113, 1228530920, 1228530824, 1228530903, -1873348938, -1097649537, (Vector3f)callSite9)), (double)((double)bh.ookitln0("gcfok", 350371113, 1228530920, 1228530871, 1228530903, -1726435084, -292977470, (Vector3f)callSite9)), (double)((double)bh.ookitln0("fkbite", 350371113, 1228530920, 1228530861, 1228530903, -877185489, -84057873, (Vector3f)callSite9)), (float)bh.ookitln0("reuiiaii", 350371119, 1228530870, 1228530817, 1228530854, 755350936, 1187630930)[0]);
                        bh.ookitln0("oqkhwwwu", 350371108, 1228530862, 1228530898, 1228530899, 1284833579, 1855824420, arrayList, (Object)new br(nXi2, (NXi)callSite10, (bF)((Object)bh.ookitln0("qlxuqz", 350371115, 1228530816, 1228530852, 1228530828, 1284833579, 1855824420, (bf)((bf)((Object)bh.ookitln0("nrqacrvo", 350371113, 1228530870, 1228530834, 1228530868, -1872853397, -499569877, (bh)this)[bh.ookitln0("qlxuqz", 350371119, 1228530870, 1228530901, 1228530866, 1174077545, -1328536675)[0]]))))));
                        ++var15_20;
                    }
                    return arrayList;
                }
            }
            if (bh.ookitln0("txpofwnd", 350371115, 1228530818, 1228530852, 1228530819, 1284833579, 1855824420, (NQo)callSite4, (NQl)bh.ookitln0("bkien", 350371119, 1228530823, 1228530896, 1228530821, -912402890, -1724116227)) != false) {
                if (bh.ookitln0("ywfxk", 350371115, 1228530816, 1228530817, 1228530879, 1284833579, 1855824420, (bf)((bf)((Object)bh.ookitln0("fkbite", 350371113, 1228530870, 1228530834, 1228530868, -978940236, -403351902, (bh)this)[bh.ookitln0("amakpkke", 350371119, 1228530870, 1228530901, 1228530866, -1511099120, 1747150623)[1]]))) != false) {
                    reference var11_15 = f <= bh.ookitln0("nykrxhgo", 350371119, 1228530870, 1228530817, 1228530854, -326873153, -133485989)[1] ? bh.ookitln0("nykrxhgo", 350371119, 1228530870, 1228530817, 1228530854, 1268075993, 92862750)[2] : bh.ookitln0("sagyczdy", 350371109, 1228530870, 1228530852, 1228530897, 1284833579, 1855824420, (float)f) * bh.ookitln0("ywfxk", 350371119, 1228530870, 1228530817, 1228530854, 715845900, -1254756610)[3];
                    return bh.ookitln0("sagyczdy", 350371109, 1228530862, 1228530829, 1228530826, 1284833579, 1855824420, (Object)new br(nXi2, (NXi)bh.ookitln0("amakpkke", 350371109, 1228530870, 1228530852, 1228530831, 1284833579, 1855824420, (NbK)((NNNwS)bh.ookitln0("qlxuqz", 350371113, 1228530867, 1228530864, 1228530868, 1402135931, -872546586, (NNuU)((NNuU)bh.ookitln0("bkien", 350371113, 1228530870, 1228530871, 1228530868, 1665367839, 312877125, (bh)this)[bh.ookitln0("txpofwnd", 350371119, 1228530870, 1228530901, 1228530866, -444539977, -651653248)[2]]))[bh.ookitln0("gcfok", 350371119, 1228530870, 1228530901, 1228530866, 1657526249, 1576096091)[3]]), (NXi)nXi, (float)callSite, (float)callSite2, (float)bh.ookitln0("sagyczdy", 350371119, 1228530870, 1228530817, 1228530854, 2095148482, -160926081)[4], (float)var11_15), (bF)((Object)bh.ookitln0("cfxfafdc", 350371115, 1228530816, 1228530852, 1228530828, 1284833579, 1855824420, (bf)((bf)((Object)bh.ookitln0("ljlembfv", 350371113, 1228530870, 1228530834, 1228530868, 2021965330, 2104408087, (bh)this)[bh.ookitln0("nykrxhgo", 350371119, 1228530870, 1228530901, 1228530866, -1166035760, -124139719)[4]]))))));
                }
            }
            if (bh.ookitln0("fkbite", 350371115, 1228530818, 1228530852, 1228530819, 1284833579, 1855824420, (NQo)callSite4, (NQl)bh.ookitln0("bkien", 350371119, 1228530823, 1228530910, 1228530821, -1678440680, 1624613267)) != false) {
                if (bh.ookitln0("txpofwnd", 350371115, 1228530816, 1228530817, 1228530879, 1284833579, 1855824420, (bf)((bf)((Object)bh.ookitln0("nykrxhgo", 350371113, 1228530870, 1228530834, 1228530868, 1246974314, -747348357, (bh)this)[bh.ookitln0("fkbite", 350371119, 1228530870, 1228530901, 1228530866, -1190777131, 27618564)[5]]))) != false) {
                    return bh.ookitln0("ljlembfv", 350371109, 1228530862, 1228530829, 1228530826, 1284833579, 1855824420, (Object)new br(nXi2, (NXi)bh.ookitln0("nrqacrvo", 350371109, 1228530870, 1228530852, 1228530831, 1284833579, 1855824420, (NbK)((NNNwS)bh.ookitln0("gcfok", 350371113, 1228530867, 1228530864, 1228530868, -1369352756, -174548923, (NNuU)((NNuU)bh.ookitln0("nykrxhgo", 350371113, 1228530870, 1228530871, 1228530868, -1809701817, 723632478, (bh)this)[bh.ookitln0("bkien", 350371119, 1228530870, 1228530911, 1228530866, -1931644315, 2124528727)[0]]))[bh.ookitln0("ywfxk", 350371119, 1228530870, 1228530911, 1228530866, -1993230302, -873140666)[1]]), (NXi)nXi, (float)callSite, (float)callSite2, (float)bh.ookitln0("zcdyiby", 350371119, 1228530870, 1228530817, 1228530854, -143224327, 510613950)[5], (float)bh.ookitln0("ljlembfv", 350371119, 1228530870, 1228530908, 1228530854, 687877069, -595686087)[0]), (bF)((Object)bh.ookitln0("nykrxhgo", 350371115, 1228530816, 1228530852, 1228530828, 1284833579, 1855824420, (bf)((bf)((Object)bh.ookitln0("reuiiaii", 350371113, 1228530870, 1228530834, 1228530868, -380754347, -701149225, (bh)this)[bh.ookitln0("txpofwnd", 350371119, 1228530870, 1228530911, 1228530866, -1809692983, -1816392235)[2]])))), (float)bh.ookitln0("qlxuqz", 350371119, 1228530870, 1228530908, 1228530854, 57689700, -1409477534)[1]));
                }
            }
            if (bh.ookitln0("ywfxk", 350371115, 1228530818, 1228530852, 1228530819, 1284833579, 1855824420, (NQo)callSite4, (NQl)bh.ookitln0("oqkhwwwu", 350371119, 1228530823, 1228530909, 1228530821, 718835758, -1484667575)) != false) {
                if (bh.ookitln0("gcfok", 350371115, 1228530816, 1228530817, 1228530879, 1284833579, 1855824420, (bf)((bf)((Object)bh.ookitln0("ljlembfv", 350371113, 1228530870, 1228530832, 1228530868, 366912351, -1703167442, (bh)this)[bh.ookitln0("cfxfafdc", 350371119, 1228530870, 1228530911, 1228530866, -39160646, 239648256)[3]]))) != false) {
                    return bh.ookitln0("oqkhwwwu", 350371109, 1228530862, 1228530829, 1228530826, 1284833579, 1855824420, (Object)new br(nXi2, (NXi)bh.ookitln0("ljlembfv", 350371109, 1228530870, 1228530852, 1228530831, 1284833579, 1855824420, (NbK)((NNNwS)bh.ookitln0("gcfok", 350371113, 1228530867, 1228530864, 1228530868, -1326885992, 1125166656, (NNuU)((NNuU)bh.ookitln0("reuiiaii", 350371113, 1228530870, 1228530871, 1228530868, -74797852, 662287002, (bh)this)[bh.ookitln0("ywfxk", 350371119, 1228530870, 1228530911, 1228530866, 490202200, -945895186)[4]]))[bh.ookitln0("ljlembfv", 350371119, 1228530870, 1228530911, 1228530866, 1646699376, -597341711)[5]]), (NXi)nXi, (float)callSite, (float)callSite2, (float)bh.ookitln0("amakpkke", 350371119, 1228530870, 1228530908, 1228530854, 1252159611, -1364308955)[2], (float)bh.ookitln0("fkbite", 350371119, 1228530870, 1228530906, 1228530854, -1403654444, -1364680031)[0]), (bF)((Object)bh.ookitln0("sagyczdy", 350371115, 1228530816, 1228530852, 1228530828, 1284833579, 1855824420, (bf)((bf)((Object)bh.ookitln0("fkbite", 350371113, 1228530870, 1228530832, 1228530868, -714511253, 32586806, (bh)this)[bh.ookitln0("gcfok", 350371119, 1228530870, 1228530911, 1228530866, 1610875627, 878801616)[6]]))))));
                }
            }
            if (bh.ookitln0("ywfxk", 350371115, 1228530818, 1228530852, 1228530819, 1284833579, 1855824420, (NQo)callSite4, (NQl)bh.ookitln0("bkien", 350371119, 1228530823, 1228530907, 1228530821, 1036082003, -1024568132)) != false) {
                if (bh.ookitln0("zcdyiby", 350371115, 1228530816, 1228530817, 1228530879, 1284833579, 1855824420, (bf)((bf)((Object)bh.ookitln0("txpofwnd", 350371113, 1228530870, 1228530832, 1228530868, -1038814108, -840496430, (bh)this)[bh.ookitln0("nykrxhgo", 350371119, 1228530870, 1228530904, 1228530866, 1739423912, 677784168)[0]]))) != false) {
                    return bh.ookitln0("zcdyiby", 350371109, 1228530862, 1228530829, 1228530826, 1284833579, 1855824420, (Object)new br(nXi2, (NXi)bh.ookitln0("gcfok", 350371109, 1228530870, 1228530852, 1228530831, 1284833579, 1855824420, (NbK)((NNNwS)bh.ookitln0("zcdyiby", 350371113, 1228530867, 1228530864, 1228530868, 379654245, 836842573, (NNuU)((NNuU)bh.ookitln0("reuiiaii", 350371113, 1228530870, 1228530871, 1228530868, -2089390667, -1977357873, (bh)this)[bh.ookitln0("nykrxhgo", 350371119, 1228530870, 1228530904, 1228530866, -1118747906, -764614535)[1]]))[bh.ookitln0("ljlembfv", 350371119, 1228530870, 1228530904, 1228530866, -1476430871, 1882995183)[2]]), (NXi)nXi, (float)callSite, (float)callSite2, (float)bh.ookitln0("ljlembfv", 350371119, 1228530870, 1228530906, 1228530854, 1028862173, -1933673508)[1], (float)bh.ookitln0("zcdyiby", 350371119, 1228530870, 1228530906, 1228530854, 325794770, 930393252)[2]), (bF)((Object)bh.ookitln0("sagyczdy", 350371115, 1228530816, 1228530852, 1228530828, 1284833579, 1855824420, (bf)((bf)((Object)bh.ookitln0("amakpkke", 350371113, 1228530870, 1228530832, 1228530868, -639331962, 557873792, (bh)this)[bh.ookitln0("oqkhwwwu", 350371119, 1228530870, 1228530904, 1228530866, -1040507232, 1243014138)[3]]))))));
                }
            }
            ++var8_9;
        }
        return bh.ookitln0("reuiiaii", 350371109, 1228530933, 1228530930, 1228530931, 1284833579, 1855824420);
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{26, 63, -5, -110, -69, -24, 74, 111, -70, 39, -38, 127, -58, 91, 20, 44};
        int n = 0;
        int n2 = 36;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 29;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String E(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{46, -66, 98, 94, -109, 11, 12, 17, 92, 106, 124, 38, -58, 90, -71, -25};
        int n = 0;
        int n2 = 220;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 79;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static float N(float f) {
        float f2 = f / bh.ookitln0("nrqacrvo", 350371119, 1228530870, 1228530724, 1228530854, 2040405066, -345054072)[4];
        f2 = (f2 * f2 + f2 * bh.ookitln0("nykrxhgo", 350371119, 1228530870, 1228530777, 1228530854, 150880113, 1385349761)[0]) / bh.ookitln0("sagyczdy", 350371119, 1228530870, 1228530777, 1228530854, -552726527, -336038786)[1];
        return (float)bh.ookitln0("nykrxhgo", 350371109, 1228530732, 1228530815, 1228530812, 1284833579, 1855824420, (float)f2, (float)bh.ookitln0("bkien", 350371119, 1228530870, 1228530777, 1228530854, -1613158532, -329492072)[2]);
    }

    private void N(ZH zH, Matrix4fStack matrix4fStack, NXi nXi, NXi nXi2, NXi nXi3, int n, int n2, float f) {
        CallSite callSite = bh.ookitln0("txpofwnd", 350371115, 1228530915, 1228530832, 1228530718, 1284833579, 1855824420, (NXi)nXi2, (NXi)nXi);
        CallSite callSite2 = bh.ookitln0("amakpkke", 350371115, 1228530915, 1228530832, 1228530718, 1284833579, 1855824420, (NXi)nXi3, (NXi)nXi);
        bh.ookitln0("fkbite", 350371115, 1228530782, 1228530871, 1228530939, 1284833579, 1855824420, (ZR)((Object)bh.ookitln0("cfxfafdc", 350371115, 1228530782, 1228530852, 1228530758, 1284833579, 1855824420, (ZR)((Object)bh.ookitln0("oqkhwwwu", 350371115, 1228530782, 1228530871, 1228530781, 1284833579, 1855824420, (ZR)((Object)bh.ookitln0("qlxuqz", 350371115, 1228530782, 1228530871, 1228530781, 1284833579, 1855824420, (ZR)((Object)bh.ookitln0("nrqacrvo", 350371115, 1228530782, 1228530852, 1228530780, 1284833579, 1855824420, (ZR)((Object)bh.ookitln0("oqkhwwwu", 350371115, 1228530782, 1228530852, 1228530780, 1284833579, 1855824420, (ZR)((Object)bh.ookitln0("amakpkke", 350371115, 1228530768, 1228530691, 1228530769, 1284833579, 1855824420, (ZH)zH)), (Matrix4f)matrix4fStack, (float)((float)bh.ookitln0("amakpkke", 350371113, 1228530915, 1228530912, 1228530913, 1554381242, 1662465482, (NXi)callSite)), (float)((float)bh.ookitln0("cfxfafdc", 350371113, 1228530915, 1228530872, 1228530913, 1805221142, -1222009402, (NXi)callSite)), (float)((float)bh.ookitln0("cfxfafdc", 350371113, 1228530915, 1228530851, 1228530913, 1979481588, 2134014695, (NXi)callSite)))), (Matrix4f)matrix4fStack, (float)((float)bh.ookitln0("cfxfafdc", 350371113, 1228530915, 1228530912, 1228530913, -1353464258, -2012346724, (NXi)callSite2)), (float)((float)bh.ookitln0("amakpkke", 350371113, 1228530915, 1228530872, 1228530913, 770188594, -192191132, (NXi)callSite2)), (float)((float)bh.ookitln0("fkbite", 350371113, 1228530915, 1228530851, 1228530913, 1312564338, 177184948, (NXi)callSite2)))), n)), n2)), (float)f)));
    }

    @uF
    public void N(iD iD2) {
        bh.ookitln0("fkbite", 350371115, 1228530870, 1228530858, 1228530859, 1284833579, 1855824420, (bh)this);
        NXi nXi = (NXi)bh.ookitln0("gcfok", 350371113, 1228530870, 1228530832, 1228530868, -1537084965, -568005233, (bh)this)[bh.ookitln0("gcfok", 350371119, 1228530870, 1228530705, 1228530866, 807693092, -462080424)[0]];
        bh.ookitln0("reuiiaii", 350371113, 1228530870, 1228530832, 1228530868, 870512556, 1119325854, (bh)this)[bh.ookitln0("bkien", 350371119, 1228530870, 1228530705, 1228530866, -792858538, 1049327620)[1]] = nXi;
        CallSite callSite = bh.ookitln0("cfxfafdc", 350371109, 1228530759, 1228530871, 1228530893, 1284833579, 1855824420);
        bh.ookitln0("oqkhwwwu", 350371113, 1228530870, 1228530832, 1228530868, -1438519529, 784479911, (bh)this)[bh.ookitln0("qlxuqz", 350371119, 1228530870, 1228530705, 1228530866, 711971171, 596467616)[2]] = callSite;
        CallSite callSite2 = bh.ookitln0("bkien", 350371109, 1228530895, 1228530747, 1228530744, 1284833579, 1855824420, (int)bh.ookitln0("oqkhwwwu", 350371115, 1228530895, 1228530892, 1228530939, 1284833579, 1855824420, (Integer)((Object)bh.ookitln0("nykrxhgo", 350371113, 1228530870, 1228530843, 1228530868, -818529748, -1131024679, (bh)this)[bh.ookitln0("fkbite", 350371119, 1228530870, 1228530705, 1228530866, -222552134, -1904996435)[3]])));
        bh.ookitln0("bkien", 350371113, 1228530870, 1228530843, 1228530868, -440848376, 1414816592, (bh)this)[bh.ookitln0("nykrxhgo", 350371119, 1228530870, 1228530705, 1228530866, 392190464, 817809915)[4]] = callSite2;
        CallSite callSite3 = bh.ookitln0("txpofwnd", 350371109, 1228530895, 1228530747, 1228530744, 1284833579, 1855824420, (int)bh.ookitln0("sagyczdy", 350371115, 1228530870, 1228530724, 1228530939, 1284833579, 1855824420, (bh)this));
        bh.ookitln0("ljlembfv", 350371113, 1228530870, 1228530843, 1228530868, -1440122181, 2028579276, (bh)this)[bh.ookitln0("reuiiaii", 350371119, 1228530870, 1228530705, 1228530866, -1079817802, -774491061)[5]] = callSite3;
    }

    private int N(bS bS2, float f) {
        bh.ookitln0("cfxfafdc", 350371115, 1228530870, 1228530858, 1228530859, 1284833579, 1855824420, (bh)this);
        if (bh.ookitln0("amakpkke", 350371115, 1228530887, 1228530884, 1228530879, 1284833579, 1855824420, (Optional)((Object)bh.ookitln0("ljlembfv", 350371115, 1228530905, 1228530852, 1228530886, 1284833579, 1855824420, (bS)bS2))) != false) {
            bA bA2 = (bA)((Object)bh.ookitln0("reuiiaii", 350371115, 1228530887, 1228530885, 1228530882, 1284833579, 1855824420, (Optional)((Object)bh.ookitln0("zcdyiby", 350371115, 1228530905, 1228530852, 1228530886, 1284833579, 1855824420, (bS)bS2))));
            if (bh.ookitln0("sagyczdy", 350371115, 1228530883, 1228530871, 1228530880, 1284833579, 1855824420, (bA)bA2) instanceof NNtL) {
                return (int)bh.ookitln0("sagyczdy", 350371115, 1228530895, 1228530892, 1228530939, 1284833579, 1855824420, (Integer)((Object)bh.ookitln0("nykrxhgo", 350371115, 1228530894, 1228530834, 1228530882, 1284833579, 1855824420, (lb)((lb)((Object)bh.ookitln0("fkbite", 350371113, 1228530870, 1228530832, 1228530868, 727006414, -596350636, (bh)this)[bh.ookitln0("ywfxk", 350371119, 1228530870, 1228530881, 1228530866, 602382487, 15079126)[2]])))));
            }
            if (f > bh.ookitln0("cfxfafdc", 350371119, 1228530870, 1228530873, 1228530854, -184344555, -1574007671)[0] && bh.ookitln0("reuiiaii", 350371115, 1228530870, 1228530852, 1228530890, 1284833579, 1855824420, (bh)this, (NXi)bh.ookitln0("zcdyiby", 350371115, 1228530883, 1228530852, 1228530893, 1284833579, 1855824420, (bA)bA2), (float)f) != false) {
                return (int)bh.ookitln0("gcfok", 350371115, 1228530895, 1228530892, 1228530939, 1284833579, 1855824420, (Integer)((Object)bh.ookitln0("zcdyiby", 350371115, 1228530894, 1228530834, 1228530882, 1284833579, 1855824420, (lb)((lb)((Object)bh.ookitln0("ljlembfv", 350371113, 1228530870, 1228530832, 1228530868, 965965742, -2080448260, (bh)this)[bh.ookitln0("ywfxk", 350371119, 1228530870, 1228530881, 1228530866, 600182737, -186893809)[3]])))));
            }
        }
        return (int)bh.ookitln0("bkien", 350371115, 1228530895, 1228530892, 1228530939, 1284833579, 1855824420, (Integer)((Object)bh.ookitln0("nykrxhgo", 350371115, 1228530894, 1228530834, 1228530882, 1284833579, 1855824420, (lb)((lb)((Object)bh.ookitln0("qlxuqz", 350371113, 1228530870, 1228530832, 1228530868, -1629745392, -446358508, (bh)this)[bh.ookitln0("fkbite", 350371119, 1228530870, 1228530850, 1228530866, -1550708401, -318734724)[0]])))));
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateLeft((Integer.rotateLeft(Integer.rotateLeft(Integer.rotateLeft(n, 21) ^ 0xC86B8D58, 6), 16) ^ 0x6655A3EF) + 1, 1);
    }

    public static NXi N(NbK nbK, NXi nXi, float f, float f2, float f3, float f4) {
        reference var6_6 = -bh.ookitln0("bkien", 350371109, 1228530726, 1228530750, 1228530727, 1284833579, 1855824420, (double)(f2 * bh.ookitln0("nrqacrvo", 350371119, 1228530870, 1228530906, 1228530854, 2055341319, -646116428)[3])) * bh.ookitln0("sagyczdy", 350371109, 1228530726, 1228530725, 1228530727, 1284833579, 1855824420, (double)(f * bh.ookitln0("amakpkke", 350371119, 1228530870, 1228530724, 1228530854, 1720457796, 1379985384)[0]));
        CallSite callSite = -bh.ookitln0("ljlembfv", 350371109, 1228530726, 1228530750, 1228530727, 1284833579, 1855824420, (double)((f + f3) * bh.ookitln0("fkbite", 350371119, 1228530870, 1228530724, 1228530854, -1993020521, -729197154)[1]));
        reference var8_8 = bh.ookitln0("zcdyiby", 350371109, 1228530726, 1228530725, 1228530727, 1284833579, 1855824420, (double)(f2 * bh.ookitln0("nykrxhgo", 350371119, 1228530870, 1228530724, 1228530854, -1832052926, 544433385)[2])) * bh.ookitln0("cfxfafdc", 350371109, 1228530726, 1228530725, 1228530727, 1284833579, 1855824420, (double)(f * bh.ookitln0("ywfxk", 350371119, 1228530870, 1228530724, 1228530854, 354000447, 1839439418)[3]));
        CallSite callSite2 = bh.ookitln0("reuiiaii", 350371109, 1228530870, 1228530852, 1228530900, 1284833579, 1855824420, (double)((double)var6_6), (double)((double)callSite), (double)((double)var8_8), (float)f4);
        return bh.ookitln0("txpofwnd", 350371115, 1228530915, 1228530871, 1228530734, 1284833579, 1855824420, (NXi)callSite2, (double)bh.ookitln0("oqkhwwwu", 350371113, 1228530915, 1228530912, 1228530913, 1471430698, -2071447052, (NXi)nXi), (double)(bh.ookitln0("reuiiaii", 350371115, 1228530722, 1228530723, 1228530879, 1284833579, 1855824420, (NbK)nbK) != false ? bh.ookitln0("qlxuqz", 350371119, 1228530870, 1228530720, 1228530721, 874714486, -258172567)[2] : bh.ookitln0("txpofwnd", 350371113, 1228530915, 1228530872, 1228530913, -1764102303, -1372051639, (NXi)nXi)), (double)bh.ookitln0("bkien", 350371113, 1228530915, 1228530851, 1228530913, -1588113000, 59958173, (NXi)nXi));
    }

    private boolean N(NXi nXi, float f) {
        CallSite callSite = bh.ookitln0("qlxuqz", 350371109, 1228530855, 1228530852, 1228530853, 1284833579, 1855824420, (NXi)nXi, (double)(f * bh.ookitln0("gcfok", 350371119, 1228530870, 1228530873, 1228530854, -2121014396, 51712293)[1]), (double)(f * bh.ookitln0("bkien", 350371119, 1228530870, 1228530873, 1228530854, -1945449465, -1027069697)[2]), (double)(f * bh.ookitln0("oqkhwwwu", 350371119, 1228530870, 1228530873, 1228530854, 709163518, 102421081)[3]));
        double d = f * f;
        return (boolean)(bh.ookitln0("sagyczdy", 350371108, 1228530862, 1228530863, 1228530879, 1284833579, 1855824420, (List)((Object)bh.ookitln0("ywfxk", 350371115, 1228530848, 1228530852, 1228530849, 1284833579, 1855824420, (NNNZg)((NNNZg)bh.ookitln0("txpofwnd", 350371113, 1228530867, 1228530864, 1228530868, 348574731, -1583169026, (NNuU)((NNuU)bh.ookitln0("fkbite", 350371113, 1228530870, 1228530871, 1228530868, 658366426, 1018870867, (bh)this)[bh.ookitln0("bkien", 350371119, 1228530870, 1228530850, 1228530866, 1788587115, 8967432)[1]]))[bh.ookitln0("amakpkke", 350371119, 1228530870, 1228530851, 1228530866, -1909710835, -1460895753)[0]]), NjL.class, (NHS)callSite, njL -> (boolean)(njL != (NNNwS)bh.ookitln0("zcdyiby", 350371113, 1228530867, 1228530864, 1228530868, -1199928572, 689562905, (NNuU)((NNuU)bh.ookitln0("qlxuqz", 350371113, 1228530870, 1228530871, 1228530868, -450540979, -1553690774, (bh)this)[bh.ookitln0("oqkhwwwu", 350371119, 1228530870, 1228530869, 1228530866, -651890878, -541828691)[5]]))[bh.ookitln0("zcdyiby", 350371119, 1228530870, 1228530869, 1228530866, 1191897878, -350252159)[6]] && bh.ookitln0("nrqacrvo", 350371115, 1228530865, 1228530878, 1228530879, 1284833579, 1855824420, (NjL)njL) != false && bh.ookitln0("fkbite", 350371115, 1228530865, 1228530876, 1228530877, 1284833579, 1855824420, (NjL)njL, (NXi)nXi) <= d ? bh.ookitln0("oqkhwwwu", 350371119, 1228530870, 1228530874, 1228530875, 292485480, -1439771608)[7] : bh.ookitln0("qlxuqz", 350371119, 1228530870, 1228530872, 1228530875, -1715456159, -1791145444)[0])))) == false ? bh.ookitln0("ywfxk", 350371119, 1228530870, 1228530860, 1228530875, -128970235, 606834506)[3] : bh.ookitln0("fkbite", 350371119, 1228530870, 1228530861, 1228530875, -364542439, -401353673)[0]);
    }

    public static NXi N(double d, double d2, double d3, float f) {
        return bh.ookitln0("ljlembfv", 350371115, 1228530915, 1228530843, 1228530745, 1284833579, 1855824420, (NXi)bh.ookitln0("oqkhwwwu", 350371115, 1228530915, 1228530832, 1228530893, 1284833579, 1855824420, (NXi)new NXi(d, d2, d3)), (double)f);
    }

    /*
     * WARNING - void declaration
     */
    @uF
    public void N(MR mR) {
        void var13_15;
        br br2;
        bh.ookitln0("ljlembfv", 350371115, 1228530870, 1228530858, 1228530859, 1284833579, 1855824420, (bh)this);
        CallSite callSite = bh.ookitln0("qlxuqz", 350371108, 1228530707, 1228530852, 1228530704, 1284833579, 1855824420, (NNNNEg)bh.ookitln0("ljlembfv", 350371115, 1228530708, 1228530832, 1228530709, 1284833579, 1855824420, (MR)mR), (boolean)bh.ookitln0("txpofwnd", 350371119, 1228530870, 1228530706, 1228530875, 1042197106, 11703071)[0]);
        CallSite callSite2 = bh.ookitln0("nykrxhgo", 350371115, 1228530915, 1228530834, 1228530718, 1284833579, 1855824420, (NXi)bh.ookitln0("amakpkke", 350371115, 1228530915, 1228530843, 1228530745, 1284833579, 1855824420, (NXi)((NXi)bh.ookitln0("bkien", 350371113, 1228530870, 1228530832, 1228530868, -2095940779, 191071675, (bh)this)[bh.ookitln0("oqkhwwwu", 350371119, 1228530870, 1228530705, 1228530866, -941442518, 1254887355)[6]]), (double)((double)(bh.ookitln0("nrqacrvo", 350371119, 1228530870, 1228530903, 1228530854, -801909382, -669718967)[0] - callSite))), (NXi)bh.ookitln0("zcdyiby", 350371115, 1228530915, 1228530843, 1228530745, 1284833579, 1855824420, (NXi)((NXi)bh.ookitln0("bkien", 350371113, 1228530870, 1228530832, 1228530868, 1695788745, -417305467, (bh)this)[bh.ookitln0("txpofwnd", 350371119, 1228530870, 1228530705, 1228530866, 2105733460, -699243256)[7]]), (double)((double)callSite)));
        float f = (float)bh.ookitln0("oqkhwwwu", 350371115, 1228530895, 1228530892, 1228530939, 1284833579, 1855824420, (Integer)((Object)bh.ookitln0("cfxfafdc", 350371113, 1228530870, 1228530843, 1228530868, -79751496, 26857761, (bh)this)[bh.ookitln0("zcdyiby", 350371119, 1228530870, 1228530719, 1228530866, 2075600971, 592600479)[0]])) + (float)(bh.ookitln0("nrqacrvo", 350371115, 1228530895, 1228530892, 1228530939, 1284833579, 1855824420, (Integer)((Object)bh.ookitln0("fkbite", 350371113, 1228530870, 1228530843, 1228530868, 1048363085, -1197041497, (bh)this)[bh.ookitln0("ywfxk", 350371119, 1228530870, 1228530719, 1228530866, -1433623663, 1064419282)[1]])) - bh.ookitln0("zcdyiby", 350371115, 1228530895, 1228530892, 1228530939, 1284833579, 1855824420, (Integer)((Object)bh.ookitln0("qlxuqz", 350371113, 1228530870, 1228530843, 1228530868, 243221548, -1914622977, (bh)this)[bh.ookitln0("qlxuqz", 350371119, 1228530870, 1228530716, 1228530866, -295351750, 1756808677)[0]]))) * callSite;
        CallSite callSite3 = bh.ookitln0("gcfok", 350371115, 1228530870, 1228530871, 1228530717, 1284833579, 1855824420, (bh)this, (NXi)callSite2, (float)f);
        if (bh.ookitln0("txpofwnd", 350371108, 1228530862, 1228530863, 1228530879, 1284833579, 1855824420, (List)((Object)callSite3)) != false) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        CallSite callSite4 = bh.ookitln0("nrqacrvo", 350371108, 1228530862, 1228530714, 1228530715, 1284833579, 1855824420, (List)((Object)callSite3));
        while (bh.ookitln0("fkbite", 350371108, 1228530712, 1228530713, 1228530879, 1284833579, 1855824420, (Iterator)((Object)callSite4)) != false) {
            br2 = (br)((Object)bh.ookitln0("gcfok", 350371108, 1228530712, 1228530694, 1228530882, 1284833579, 1855824420, (Iterator)((Object)callSite4)));
            bh.ookitln0("nrqacrvo", 350371108, 1228530862, 1228530898, 1228530899, 1284833579, 1855824420, arrayList, (Object)bh.ookitln0("cfxfafdc", 350371115, 1228530695, 1228530871, 1228530692, 1284833579, 1855824420, (br)br2));
        }
        CallSite callSite5 = bh.ookitln0("fkbite", 350371115, 1228530856, 1228530839, 1228530838, 1284833579, 1855824420, (NNNwS)((NNNwS)bh.ookitln0("bkien", 350371113, 1228530867, 1228530864, 1228530868, 811625263, -1874607427, (NNuU)((NNuU)bh.ookitln0("fkbite", 350371113, 1228530870, 1228530871, 1228530868, 1731802891, -586092897, (bh)this)[bh.ookitln0("gcfok", 350371119, 1228530870, 1228530716, 1228530866, 2039341996, -585903692)[1]]))[bh.ookitln0("zcdyiby", 350371119, 1228530870, 1228530716, 1228530866, -1455317709, -1145872487)[2]]));
        br2 = new NXi((double)(-bh.ookitln0("nrqacrvo", 350371109, 1228530726, 1228530725, 1228530727, 1284833579, 1855824420, (double)((double)(callSite5 * bh.ookitln0("reuiiaii", 350371119, 1228530870, 1228530903, 1228530854, -762743074, 1971341029)[1]))) * bh.ookitln0("ywfxk", 350371119, 1228530870, 1228530903, 1228530854, 1483456801, 377801593)[2]), (double)bh.ookitln0("nykrxhgo", 350371119, 1228530870, 1228530864, 1228530721, -1033066480, 958760962)[0], (double)(-bh.ookitln0("gcfok", 350371109, 1228530726, 1228530750, 1228530727, 1284833579, 1855824420, (double)((double)(callSite5 * bh.ookitln0("fkbite", 350371119, 1228530870, 1228530693, 1228530854, -113876976, 542189331)[0]))) * bh.ookitln0("qlxuqz", 350371119, 1228530870, 1228530693, 1228530854, -1194986498, -1469705646)[1]));
        ZH zH = (ZH)((Object)bh.ookitln0("amakpkke", 350371119, 1228530690, 1228530852, 1228530868, -1954394071, 708757173)[bh.ookitln0("txpofwnd", 350371119, 1228530870, 1228530881, 1228530866, 1775581790, 1445532731)[0]]);
        ZH zH2 = (ZH)((Object)bh.ookitln0("bkien", 350371119, 1228530690, 1228530871, 1228530868, 2027643905, -1193607571)[bh.ookitln0("amakpkke", 350371119, 1228530870, 1228530881, 1228530866, 1842472805, 233739520)[1]]);
        CallSite callSite6 = bh.ookitln0("amakpkke", 350371115, 1228530708, 1228530691, 1228530688, 1284833579, 1855824420, (MR)mR);
        CallSite callSite7 = bh.ookitln0("ywfxk", 350371115, 1228530702, 1228530871, 1228530893, 1284833579, 1855824420, (NNde)bh.ookitln0("qlxuqz", 350371115, 1228530708, 1228530871, 1228530689, 1284833579, 1855824420, (MR)mR));
        CallSite callSite8 = bh.ookitln0("zcdyiby", 350371119, 1228530870, 1228530706, 1228530875, -1000497630, 618308661)[1];
        while (var13_15 < bh.ookitln0("nykrxhgo", 350371108, 1228530862, 1228530938, 1228530939, 1284833579, 1855824420, arrayList)) {
            bS bS2 = (bS)((Object)bh.ookitln0("sagyczdy", 350371108, 1228530862, 1228530885, 1228530703, 1284833579, 1855824420, arrayList, (int)var13_15));
            CallSite callSite9 = bh.ookitln0("gcfok", 350371115, 1228530870, 1228530852, 1228530700, 1284833579, 1855824420, (bh)this, (bS)bS2, (float)bh.ookitln0("txpofwnd", 350371115, 1228530695, 1228530832, 1228530838, 1284833579, 1855824420, (br)((br)((Object)bh.ookitln0("sagyczdy", 350371108, 1228530862, 1228530885, 1228530703, 1284833579, 1855824420, (List)((Object)callSite3), (int)var13_15)))));
            CallSite callSite10 = bh.ookitln0("ljlembfv", 350371115, 1228530905, 1228530871, 1228530931, 1284833579, 1855824420, (bS)bS2);
            if (bh.ookitln0("amakpkke", 350371108, 1228530862, 1228530863, 1228530879, 1284833579, 1855824420, (List)((Object)callSite10)) == false) {
                void var21_24;
                NXi nXi = (NXi)bh.ookitln0("oqkhwwwu", 350371108, 1228530862, 1228530701, 1228530882, 1284833579, 1855824420, (List)((Object)callSite10));
                NXi nXi2 = (NXi)bh.ookitln0("nrqacrvo", 350371115, 1228530887, 1228530697, 1228530806, 1284833579, 1855824420, (Optional)((Object)bh.ookitln0("oqkhwwwu", 350371115, 1228530887, 1228530698, 1228530699, 1284833579, 1855824420, (Optional)((Object)bh.ookitln0("fkbite", 350371115, 1228530905, 1228530852, 1228530886, 1284833579, 1855824420, (bS)bS2)), bA::N)), (Object)((NXi)bh.ookitln0("reuiiaii", 350371108, 1228530862, 1228530696, 1228530882, 1284833579, 1855824420, (List)((Object)callSite10))));
                CallSite callSite11 = bh.ookitln0("amakpkke", 350371115, 1228530926, 1228530807, 1228530804, 1284833579, 1855824420, (Quaternionf)new Quaternionf(), (Vector3fc)new Vector3f((float)(bh.ookitln0("txpofwnd", 350371113, 1228530915, 1228530912, 1228530913, 1879266740, 1560400439, (NXi)nXi) - bh.ookitln0("bkien", 350371113, 1228530915, 1228530912, 1228530913, -1404276897, 690289998, (NXi)nXi2)), (float)(bh.ookitln0("qlxuqz", 350371113, 1228530915, 1228530872, 1228530913, 688231040, 1307870656, (NXi)nXi) - bh.ookitln0("cfxfafdc", 350371113, 1228530915, 1228530872, 1228530913, 303479806, -530712224, (NXi)nXi2)), (float)(bh.ookitln0("zcdyiby", 350371113, 1228530915, 1228530851, 1228530913, -1760850074, -328032328, (NXi)nXi) - bh.ookitln0("qlxuqz", 350371113, 1228530915, 1228530851, 1228530913, -964820973, 925522881, (NXi)nXi2))), (Vector3fc)new Vector3f((float)(bh.ookitln0("ljlembfv", 350371113, 1228530915, 1228530912, 1228530913, 812142411, 2060679260, (NXi)nXi) + bh.ookitln0("txpofwnd", 350371113, 1228530915, 1228530912, 1228530913, 1123736058, 531557014, (NXi)br2) - bh.ookitln0("bkien", 350371113, 1228530915, 1228530912, 1228530913, -1270291396, -54117280, (NXi)nXi2)), (float)(bh.ookitln0("reuiiaii", 350371113, 1228530915, 1228530872, 1228530913, -46122780, -221971997, (NXi)nXi) + bh.ookitln0("reuiiaii", 350371113, 1228530915, 1228530872, 1228530913, 824222662, 1659303506, (NXi)br2) - bh.ookitln0("nykrxhgo", 350371113, 1228530915, 1228530872, 1228530913, 2122192985, 390849606, (NXi)nXi2)), (float)(bh.ookitln0("sagyczdy", 350371113, 1228530915, 1228530851, 1228530913, 576670623, -825564187, (NXi)nXi) + bh.ookitln0("qlxuqz", 350371113, 1228530915, 1228530851, 1228530913, -1503048029, 1407221932, (NXi)br2) - bh.ookitln0("ywfxk", 350371113, 1228530915, 1228530851, 1228530913, 423427053, 1290076149, (NXi)nXi2))));
                bh.ookitln0("amakpkke", 350371115, 1228530805, 1228530802, 1228530688, 1284833579, 1855824420, (Matrix4fStack)callSite6);
                bh.ookitln0("txpofwnd", 350371115, 1228530805, 1228530803, 1228530800, 1284833579, 1855824420, (Matrix4fStack)callSite6, (float)((float)(bh.ookitln0("ywfxk", 350371113, 1228530915, 1228530912, 1228530913, 1984294555, -110263676, (NXi)nXi2) - bh.ookitln0("fkbite", 350371113, 1228530915, 1228530912, 1228530913, -1846321170, -679380513, (NXi)callSite7))), (float)((float)(bh.ookitln0("zcdyiby", 350371113, 1228530915, 1228530872, 1228530913, 1638371757, 37705462, (NXi)nXi2) - bh.ookitln0("cfxfafdc", 350371113, 1228530915, 1228530872, 1228530913, 1580809989, 54672580, (NXi)callSite7))), (float)((float)(bh.ookitln0("oqkhwwwu", 350371113, 1228530915, 1228530851, 1228530913, -2067305183, -892311213, (NXi)nXi2) - bh.ookitln0("oqkhwwwu", 350371113, 1228530915, 1228530851, 1228530913, -37583460, -1576726846, (NXi)callSite7))));
                bh.ookitln0("reuiiaii", 350371115, 1228530805, 1228530921, 1228530801, 1284833579, 1855824420, (Matrix4fStack)callSite6, (Quaternionfc)callSite11);
                bh.ookitln0("zcdyiby", 350371115, 1228530805, 1228530803, 1228530800, 1284833579, 1855824420, (Matrix4fStack)callSite6, (float)((float)(bh.ookitln0("txpofwnd", 350371113, 1228530915, 1228530912, 1228530913, -1817113745, -1476372112, (NXi)callSite7) - bh.ookitln0("nykrxhgo", 350371113, 1228530915, 1228530912, 1228530913, 1808418641, 376227575, (NXi)nXi2))), (float)((float)(bh.ookitln0("zcdyiby", 350371113, 1228530915, 1228530872, 1228530913, 1260068226, -599226243, (NXi)callSite7) - bh.ookitln0("ywfxk", 350371113, 1228530915, 1228530872, 1228530913, -13289015, -949704121, (NXi)nXi2))), (float)((float)(bh.ookitln0("reuiiaii", 350371113, 1228530915, 1228530851, 1228530913, -1159226403, -1571129935, (NXi)callSite7) - bh.ookitln0("sagyczdy", 350371113, 1228530915, 1228530851, 1228530913, -967478810, 1933064442, (NXi)nXi2))));
                NXi nXi3 = (NXi)bh.ookitln0("qlxuqz", 350371108, 1228530862, 1228530701, 1228530882, 1284833579, 1855824420, (List)((Object)callSite10));
                CallSite bA2 = bh.ookitln0("fkbite", 350371119, 1228530870, 1228530860, 1228530875, -440259560, 1960440571)[0];
                while (var21_24 < bh.ookitln0("reuiiaii", 350371108, 1228530862, 1228530938, 1228530939, 1284833579, 1855824420, (List)((Object)callSite10))) {
                    NXi nXi4 = (NXi)bh.ookitln0("reuiiaii", 350371108, 1228530862, 1228530885, 1228530703, 1284833579, 1855824420, (List)((Object)callSite10), (int)var21_24);
                    bh.ookitln0("gcfok", 350371115, 1228530870, 1228530852, 1228530711, 1284833579, 1855824420, (bh)this, (ZH)zH, (Matrix4fStack)callSite6, (NXi)callSite7, (NXi)nXi3, (NXi)nXi4, (int)bh.ookitln0("zcdyiby", 350371109, 1228530729, 1228530852, 1228530813, 1284833579, 1855824420, (int)callSite9, (int)(bh.ookitln0("sagyczdy", 350371109, 1228530732, 1228530815, 1228530812, 1284833579, 1855824420, (float)bh.ookitln0("qlxuqz", 350371119, 1228530870, 1228530693, 1228530854, -2042491351, -186521995)[2], (float)((float)(var21_24 - bh.ookitln0("bkien", 350371119, 1228530870, 1228530860, 1228530875, 2056276545, 1167032498)[1]) / bh.ookitln0("nykrxhgo", 350371119, 1228530870, 1228530814, 1228530854, 1094879272, -1402173659)[0])) * bh.ookitln0("oqkhwwwu", 350371119, 1228530870, 1228530814, 1228530854, 222568045, -627308700)[1])), (int)bh.ookitln0("qlxuqz", 350371109, 1228530729, 1228530852, 1228530813, 1284833579, 1855824420, (int)callSite9, (int)(bh.ookitln0("gcfok", 350371109, 1228530732, 1228530815, 1228530812, 1284833579, 1855824420, (float)bh.ookitln0("txpofwnd", 350371119, 1228530870, 1228530810, 1228530854, 1241755096, -1252795587)[0], (float)((float)var21_24 / bh.ookitln0("oqkhwwwu", 350371119, 1228530870, 1228530810, 1228530854, -1345710699, -2135477469)[1])) * bh.ookitln0("ljlembfv", 350371119, 1228530870, 1228530810, 1228530854, 284022683, -1081498373)[2])), (float)bh.ookitln0("fkbite", 350371119, 1228530870, 1228530810, 1228530854, -80302680, 884325055)[3]);
                    nXi3 = nXi4;
                    ++var21_24;
                }
                bh.ookitln0("sagyczdy", 350371115, 1228530805, 1228530811, 1228530688, 1284833579, 1855824420, (Matrix4fStack)callSite6);
                if (bh.ookitln0("ljlembfv", 350371115, 1228530887, 1228530863, 1228530879, 1284833579, 1855824420, (Optional)((Object)bh.ookitln0("nrqacrvo", 350371115, 1228530905, 1228530852, 1228530886, 1284833579, 1855824420, (bS)bS2))) == false) {
                    bA bA3 = (bA)((Object)bh.ookitln0("oqkhwwwu", 350371115, 1228530887, 1228530885, 1228530882, 1284833579, 1855824420, (Optional)((Object)bh.ookitln0("nykrxhgo", 350371115, 1228530905, 1228530852, 1228530886, 1284833579, 1855824420, (bS)bS2))));
                    CallSite callSite12 = bh.ookitln0("cfxfafdc", 350371115, 1228530695, 1228530832, 1228530838, 1284833579, 1855824420, (br)((br)((Object)bh.ookitln0("zcdyiby", 350371108, 1228530862, 1228530885, 1228530703, 1284833579, 1855824420, (List)((Object)callSite3), (int)var13_15))));
                    if (callSite12 > bh.ookitln0("ywfxk", 350371119, 1228530870, 1228530810, 1228530854, -477876289, -295596510)[4]) {
                        bh.ookitln0("nykrxhgo", 350371109, 1228530808, 1228530852, 1228530809, 1284833579, 1855824420, (NXi)callSite7, (NXi)bh.ookitln0("gcfok", 350371115, 1228530883, 1228530852, 1228530893, 1284833579, 1855824420, (bA)bA3), (float)callSite12, (int)callSite9);
                    } else {
                        Object object;
                        Object object2 = new NXi((double)bh.ookitln0("sagyczdy", 350371119, 1228530870, 1228530864, 1228530721, 2056313694, 1773184267)[1], (double)bh.ookitln0("ywfxk", 350371119, 1228530870, 1228530864, 1228530721, -1603943216, -1466942406)[2], (double)bh.ookitln0("nrqacrvo", 350371119, 1228530870, 1228530864, 1228530721, 265344586, 809889745)[3]);
                        CallSite callSite13 = bh.ookitln0("nrqacrvo", 350371115, 1228530883, 1228530871, 1228530880, 1284833579, 1855824420, (bA)bA3);
                        if (callSite13 instanceof NNty) {
                            object = (NNty)callSite13;
                            callSite13 = bh.ookitln0("amakpkke", 350371115, 1228530790, 1228530834, 1228530791, 1284833579, 1855824420, (NNty)object);
                            object2 = new NXi((double)bh.ookitln0("bkien", 350371115, 1228530788, 1228530725, 1228530939, 1284833579, 1855824420, (Nef)callSite13), (double)bh.ookitln0("nrqacrvo", 350371115, 1228530788, 1228530724, 1228530939, 1284833579, 1855824420, (Nef)callSite13), (double)bh.ookitln0("amakpkke", 350371115, 1228530788, 1228530864, 1228530939, 1284833579, 1855824420, (Nef)callSite13));
                        } else {
                            callSite13 = bh.ookitln0("ljlembfv", 350371115, 1228530883, 1228530871, 1228530880, 1284833579, 1855824420, (bA)bA3);
                            if (callSite13 instanceof NNtL) {
                                NNtL nNtL = (NNtL)callSite13;
                                callSite13 = bh.ookitln0("txpofwnd", 350371115, 1228530789, 1228530843, 1228530786, 1284833579, 1855824420, (NNtL)nNtL);
                                CallSite callSite14 = bh.ookitln0("bkien", 350371115, 1228530789, 1228530871, 1228530893, 1284833579, 1855824420, (NNtL)nNtL);
                                CallSite callSite15 = bh.ookitln0("cfxfafdc", 350371115, 1228530855, 1228530912, 1228530785, 1284833579, 1855824420, (NHS)bh.ookitln0("reuiiaii", 350371115, 1228530722, 1228530787, 1228530784, 1284833579, 1855824420, (NbK)callSite13), (double)bh.ookitln0("ywfxk", 350371119, 1228530870, 1228530864, 1228530721, -875254114, 1299796107)[4]);
                                CallSite callSite16 = bh.ookitln0("zcdyiby", 350371109, 1228530732, 1228530796, 1228530797, 1284833579, 1855824420, (double)bh.ookitln0("zcdyiby", 350371119, 1228530870, 1228530864, 1228530721, -581971196, 164979749)[5], (double)(bh.ookitln0("ljlembfv", 350371119, 1228530870, 1228530798, 1228530721, -379454993, 2057575691)[0] * bh.ookitln0("ywfxk", 350371115, 1228530855, 1228530871, 1228530799, 1284833579, 1855824420, (NHS)callSite15)));
                                CallSite callSite17 = bh.ookitln0("cfxfafdc", 350371109, 1228530732, 1228530796, 1228530797, 1284833579, 1855824420, (double)bh.ookitln0("cfxfafdc", 350371119, 1228530870, 1228530798, 1228530721, -1057311565, -560793040)[1], (double)(bh.ookitln0("amakpkke", 350371119, 1228530870, 1228530798, 1228530721, 1814467955, -1413249239)[2] * bh.ookitln0("fkbite", 350371115, 1228530855, 1228530843, 1228530799, 1284833579, 1855824420, (NHS)callSite15)));
                                CallSite callSite18 = bh.ookitln0("ljlembfv", 350371109, 1228530732, 1228530796, 1228530797, 1284833579, 1855824420, (double)bh.ookitln0("bkien", 350371119, 1228530870, 1228530725, 1228530721, -684907908, 974135240)[0], (double)(bh.ookitln0("ljlembfv", 350371119, 1228530870, 1228530725, 1228530721, -1022758014, 1402083478)[1] * bh.ookitln0("ljlembfv", 350371115, 1228530855, 1228530832, 1228530799, 1284833579, 1855824420, (NHS)callSite15)));
                                CallSite callSite19 = bh.ookitln0("sagyczdy", 350371115, 1228530855, 1228530691, 1228530893, 1284833579, 1855824420, (NHS)callSite15);
                                reference var36_38 = bh.ookitln0("zcdyiby", 350371113, 1228530915, 1228530912, 1228530913, 1148080691, 1127282291, (NXi)callSite14) - bh.ookitln0("nykrxhgo", 350371113, 1228530915, 1228530912, 1228530913, 537154664, -1666520777, (NXi)callSite19);
                                reference var38_39 = bh.ookitln0("sagyczdy", 350371113, 1228530915, 1228530872, 1228530913, -1945419572, -1552973512, (NXi)callSite14) - bh.ookitln0("ljlembfv", 350371113, 1228530915, 1228530872, 1228530913, -414126747, 52159638, (NXi)callSite19);
                                reference var40_40 = bh.ookitln0("bkien", 350371113, 1228530915, 1228530851, 1228530913, 1508327452, -522323828, (NXi)callSite14) - bh.ookitln0("nrqacrvo", 350371113, 1228530915, 1228530851, 1228530913, 1193092828, 259437647, (NXi)callSite19);
                                reference var42_41 = var36_38 / callSite16;
                                reference var44_42 = var38_39 / callSite17;
                                reference var46_43 = var40_40 / callSite18;
                                CallSite callSite20 = bh.ookitln0("reuiiaii", 350371109, 1228530732, 1228530794, 1228530730, 1284833579, 1855824420, (double)var42_41);
                                CallSite callSite21 = bh.ookitln0("cfxfafdc", 350371109, 1228530732, 1228530794, 1228530730, 1284833579, 1855824420, (double)var44_42);
                                CallSite callSite22 = bh.ookitln0("nykrxhgo", 350371109, 1228530732, 1228530794, 1228530730, 1284833579, 1855824420, (double)var46_43);
                                object2 = callSite20 >= callSite21 && callSite20 >= callSite22 ? new NXi((double)bh.ookitln0("ljlembfv", 350371109, 1228530732, 1228530795, 1228530730, 1284833579, 1855824420, (double)var36_38), (double)bh.ookitln0("fkbite", 350371119, 1228530870, 1228530725, 1228530721, -1879670149, -1014376708)[2], (double)bh.ookitln0("bkien", 350371119, 1228530870, 1228530725, 1228530721, 760104063, -1476755596)[3]) : (callSite21 >= callSite20 && callSite21 >= callSite22 ? new NXi((double)bh.ookitln0("bkien", 350371119, 1228530870, 1228530792, 1228530721, -698317519, 758822378)[0], (double)bh.ookitln0("fkbite", 350371109, 1228530732, 1228530795, 1228530730, 1284833579, 1855824420, (double)var38_39), (double)bh.ookitln0("fkbite", 350371119, 1228530870, 1228530792, 1228530721, -1781913468, -1372626644)[1]) : new NXi((double)bh.ookitln0("amakpkke", 350371119, 1228530870, 1228530792, 1228530721, 1955375638, 1660336430)[2], (double)bh.ookitln0("txpofwnd", 350371119, 1228530870, 1228530792, 1228530721, -300726507, -524515634)[3], (double)bh.ookitln0("sagyczdy", 350371109, 1228530732, 1228530795, 1228530730, 1284833579, 1855824420, (double)var40_40)));
                            }
                        }
                        object = bh.ookitln0("oqkhwwwu", 350371115, 1228530883, 1228530852, 1228530893, 1284833579, 1855824420, (bA)bA3);
                        object2 = bh.ookitln0("zcdyiby", 350371115, 1228530915, 1228530832, 1228530893, 1284833579, 1855824420, (NXi)object2);
                        bh.ookitln0("nykrxhgo", 350371115, 1228530805, 1228530802, 1228530688, 1284833579, 1855824420, (Matrix4fStack)callSite6);
                        bh.ookitln0("nrqacrvo", 350371115, 1228530805, 1228530803, 1228530800, 1284833579, 1855824420, (Matrix4fStack)callSite6, (float)((float)(bh.ookitln0("bkien", 350371113, 1228530915, 1228530912, 1228530913, -2033720054, -38062023, (NXi)object) - bh.ookitln0("ywfxk", 350371113, 1228530915, 1228530912, 1228530913, -242435819, -446589438, (NXi)callSite7))), (float)((float)(bh.ookitln0("reuiiaii", 350371113, 1228530915, 1228530872, 1228530913, -1172724944, -131076743, (NXi)object) - bh.ookitln0("cfxfafdc", 350371113, 1228530915, 1228530872, 1228530913, 2041114322, 862633714, (NXi)callSite7))), (float)((float)(bh.ookitln0("fkbite", 350371113, 1228530915, 1228530851, 1228530913, 251429159, 1039384817, (NXi)object) - bh.ookitln0("nykrxhgo", 350371113, 1228530915, 1228530851, 1228530913, -979503508, 2111408649, (NXi)callSite7))));
                        bh.ookitln0("cfxfafdc", 350371115, 1228530805, 1228530921, 1228530801, 1284833579, 1855824420, (Matrix4fStack)callSite6, (Quaternionfc)bh.ookitln0("qlxuqz", 350371115, 1228530926, 1228530793, 1228530804, 1284833579, 1855824420, (Quaternionf)new Quaternionf(), (Vector3fc)new Vector3f((float)bh.ookitln0("fkbite", 350371119, 1228530870, 1228530810, 1228530854, 325943938, 754302801)[5], (float)bh.ookitln0("oqkhwwwu", 350371119, 1228530870, 1228530810, 1228530854, 645403218, 894153211)[6], (float)bh.ookitln0("ljlembfv", 350371119, 1228530870, 1228530735, 1228530854, 1617648172, -1436301074)[0]), (Vector3fc)new Vector3f((float)bh.ookitln0("amakpkke", 350371113, 1228530915, 1228530912, 1228530913, -1429312370, 1498923363, (NXi)object2), (float)bh.ookitln0("amakpkke", 350371113, 1228530915, 1228530872, 1228530913, -994431566, 485550659, (NXi)object2), (float)bh.ookitln0("cfxfafdc", 350371113, 1228530915, 1228530851, 1228530913, 496675002, -1064320117, (NXi)object2))));
                        bh.ookitln0("txpofwnd", 350371115, 1228530870, 1228530871, 1228530774, 1284833579, 1855824420, (bh)this, (ZH)zH2, (Matrix4fStack)callSite6, (int)callSite9);
                        bh.ookitln0("sagyczdy", 350371115, 1228530870, 1228530852, 1228530774, 1284833579, 1855824420, (bh)this, (ZH)zH, (Matrix4fStack)callSite6, (int)callSite9);
                        bh.ookitln0("bkien", 350371115, 1228530805, 1228530811, 1228530688, 1284833579, 1855824420, (Matrix4fStack)callSite6);
                    }
                }
            }
            ++var13_15;
        }
        bh.ookitln0("txpofwnd", 350371109, 1228530808, 1228530852, 1228530775, 1284833579, 1855824420, (MR)mR);
    }

    private static /* synthetic */ long N(long l) {
        return Long.rotateLeft(Long.rotateLeft(Long.rotateRight(Long.rotateLeft(Long.rotateLeft(Long.rotateLeft(l, 52), 23), 24), 51), 41), 53);
    }

    /*
     * WARNING - void declaration
     */
    private void N(ZH zH, Matrix4fStack matrix4fStack, int n) {
        void var9_9;
        CallSite callSite = bh.ookitln0("zcdyiby", 350371119, 1228530870, 1228530735, 1228530854, -1022781955, 1764936229)[1];
        CallSite callSite2 = bh.ookitln0("txpofwnd", 350371119, 1228530870, 1228530937, 1228530918, 1889106805, 676944468)[6];
        double d = (double)(bh.ookitln0("ywfxk", 350371119, 1228530870, 1228530735, 1228530854, -1078177135, -20944746)[2] / (float)callSite2);
        NXi nXi = null;
        CallSite callSite3 = bh.ookitln0("ywfxk", 350371119, 1228530870, 1228530860, 1228530875, 1540794158, 1650356215)[2];
        while (var9_9 <= callSite2) {
            double d2 = (double)var9_9 * d;
            float f = (float)(bh.ookitln0("fkbite", 350371109, 1228530732, 1228530733, 1228530730, 1284833579, 1855824420, (double)d2) * (double)callSite);
            float f2 = (float)(bh.ookitln0("qlxuqz", 350371109, 1228530732, 1228530731, 1228530730, 1284833579, 1855824420, (double)d2) * (double)callSite);
            NXi nXi2 = new NXi((double)f, (double)bh.ookitln0("reuiiaii", 350371119, 1228530870, 1228530728, 1228530721, -668782368, -2140703667)[0], (double)f2);
            if (nXi != null) {
                CallSite callSite4 = bh.ookitln0("bkien", 350371109, 1228530729, 1228530852, 1228530710, 1284833579, 1855824420, n, (float)bh.ookitln0("nrqacrvo", 350371119, 1228530870, 1228530735, 1228530854, 1871867170, 383998615)[3]);
                bh.ookitln0("fkbite", 350371115, 1228530870, 1228530852, 1228530711, 1284833579, 1855824420, (bh)this, (ZH)zH, (Matrix4fStack)matrix4fStack, (NXi)bh.ookitln0("cfxfafdc", 350371119, 1228530915, 1228530843, 1228530749, -1861413993, -1965574229), (NXi)nXi, (NXi)nXi2, (int)callSite4, (int)callSite4, (float)bh.ookitln0("nykrxhgo", 350371119, 1228530870, 1228530735, 1228530854, 1987435669, -132802697)[4]);
            }
            nXi = nXi2;
            ++var9_9;
        }
    }

    private static /* synthetic */ int R(int n) {
        return (Integer.rotateLeft((n ^ 0xA0E34A03) + 1, 28) ^ 0x5A9F04BB) + 1;
    }

    private static /* synthetic */ String R(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-49, 39, -4, -13, 125, -101, 37, -111, 84, 86, -40, 39, 100, -33, -62, -76};
        int n = 0;
        int n2 = 215;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 23;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void G() {
        I = new byte[]{7, 2, 3, 4, 5, 6, 4, 3};
        NM = new byte[]{-10, 2, 10, 5, 7, 2};
    }

    private static /* synthetic */ void ntfClinit() {
        OOmIOI0 = "\u00aei\u0097(l\u00a2p_\u00aa|\u0091\u00e4\u00b4\u00b23\u00e4i&\u00aa\b\u00aa|\u0091\u00e4\u00b4\u00b23\u00d2S\u00d3\u00aa|\u0091\u00e4\u00b4\u00b23\u00f0\u007f\u0096\u0089\u00b10\u00e6O\u008bN\u0083\u00d9\u0095\u0080)\u0089\u0001\u00ef^\u00d3\u00aa|\u0091\u00e4\u00b4\u00b23\u00f0i\u00b1)\u008fL\u008a\u0099\u0084\u00abu\u00d2\u001e\u0094\u00ae\u0087#\u00b0\u00c7v\u0081\u00d7\u0087\u00be3\u00cbE\u00b1\u00ab\u00db\u001b:$\u00ec\u00d5\u00c3\u008fL\u008a\u0099\u0084\u00abu\u00d2\u001e\u0091\u00b3\u0091%2\u009e\u00c6\u009c_\u00aa|\u0091\u00e4\u00b4\u00b23\u00f0S\u0093\u00d1\u0098\u00aa|\u0091\u00e4\u00b4\u00b23\u00dcY\u0087\u00aa|\u0091\u00e4\u00b4\u00b23\u00c9h\u00e4\u00a2q\u00af\u00f0\u008b\u008dY\u00d3\u001e\u0082\u008f\u00cf\u001b<\u00e2\u00ab\u00c1P\u0084\u00db\u009d\u00f0Q\u00dfE\u00aa\u00ae\u008cc5\u00c3\u00b8\u008fY\u0080\u008d\u00bd\u0094X\u00f8K\u008a\u0082\u0099x\u001d\u00c8\u00a5\u00d5v\u00a0\u00f2\u00b7\u00a5N\u00fb\\\u00f7\u0089\u00ac>h\u00dc\u0087\u00aa|\u0091\u00e4\u00b4\u00b23\u00f0i\u00b1\u00fc\u00bd\u001e\u0015\u00b9\u009aZ\u00a2q\u00af\u00f0\u008b\u008dY\u00d3\u001e\u0096\u009f\u009dlz%F\u0015\u008bN\u00ad\u00df\u0083\u00ach\u0087\u00aa|\u0091\u00e4\u00b4\u00b23\u00f0y\u008b\b\u00aa|\u0091\u00e4\u00b4\u00b23\u00f0\u007f\u0096\u0089\u0081\u0018\u00d3\u008c\u0094\n\u00c7v\u00a0\u00f2\u00b7\u00a5N\u00fb\\\u00f7\u00a5\u00b2l\u000f\u00a2P\u008a\u00c0\u0090\u00f0p\u00df_\u00bf\u00e8\u00bb59\u0001D\u009a\u0001\u00c2\u00fa\u009b\u00bej\u00df\u001e\u00ad\u00b3\u009d;|(N\u009dN\u00d0\u00bd\u0098\u00aa|\u0091\u00e4\u00b4\u00b23\u00f0\u007f\u00ac\u00be\u0085\u00acq\u0083J\u009f\u00cf\u00bd\u00b6o\u00cab\u00a5~\u00ad\u00cc\u00a3\u009aq\u0091\u007f\u0096\u0089\u00ba\"\u001c;\n\u00a2q\u00af\u00f0\u008b\u008dY\u00d3\u001e\u00ba\u0094\u00cf\u0011z(\u00fb\u00a2q\u00af\u00f0\u008b\u008dY\u00d3\u001e\u0082\u008f\u00cf\u001b<\u00e2\u00b4\u00c1P\u0084\u00db\u009d\u00f0Q\u00dfE\u00aa\u00ae\u008cc5\u00c3\u00a7\u008fY\u0080\u008d\u00b8\u00f6J\u00e3\u00a2P\u008a\u00c0\u0090\u00f0i\u00caX\u00b4\u00e8\u0092\"=\u0007\u00bf\u0087U\u0085\u0099\u00b7\u00aar\u00ddE\u00b1\u00a8\u009alz(\u00a1\u008fL\u008a\u0099\u0084\u00abu\u00d2\u001e\u0097\u00b7\u0080><\n\u00aa\u0082\u0001D\u008fL\u008a\u0099\u009d\u00ber\u00d9\u001e\u0091\u00a9\u008024e\\\u0011\u0081Ig\u008bNaN\u009a_\u0099\u00d7\u0085\u00b0n\u00b1\u00aa|\u0091\u00e4\u00b4\u00b23\u00dcWu\u00a7\u009d\u00e4\u00c7v\u00a0\u00f2\u00b7\u00a5N\u00fb\\\u00f7\u0089\u00911h\u00b2\u008fI\u00a5\u00d3\u0089\u00ab\u00fb\u00c7|Z\u0087\u00ca\u0091\u00aa|\u0091\u00e4\u00b4\u00b23\u00dcb\u00b1\u00aa|\u0091\u00e4\u00b4\u00b23\u00f0\u007f\u0096\u0089\u00a6\r\u0080\u00aa|\u0091\u00e4\u00b4\u00b23\u00e4}>\u00a5~\u00ad\u00cc\u00a3\u009aq\u0091\u007f\u0080\u00ae\u00cf\u00d2\u00c7v\u00a0\u00f2\u00b7\u00a5N\u00fb\\\u00f7\u0089\u0097\u0015h\u00ac\u000f\u00aa\u0013\u00afU\u00aa\u0013\u00a7\u00fd\u00b5\u0099f\u00ect\u00b5\u00e8\u00ba\u001f\u0000\u0082\n\u00a2q\u00af\u00f0\u008b\u008dY\u00d3\u001e\u00b4\u009e\u00cf\u001b9\u0000T\u008f\u0015\u0087\u00d7\u009f\u00b83\u00edE\u00aa\u00ae\u009a0h(\u000b\u00a2q\u00af\u00f0\u008b\u008dY\u00d3\u001e\u00b4\u00a5\u00cfK\u0080N\u00bd\u00d7\u009d\u00aay\u0006\u00c7v\u00a0\u00f2\u00b7\u00a5N\u00fb\\\u00f7\u0089\u00ba\u00107;\u0083Z\u00a7s\u00c2\u00ff%\u00d2\u00c7v\u0084\u00c4\u0096\u00f0v\u00d1\\\u00b4\u00e8\u00b96'\u00cb\u0093\u0096\u000e\u008d\u00e5\u0085\u00be\u007f\u00d5\n\u00fb\u00a8\u0013\u00a7\u00fd\u00b5\u0099f\u00ect\u00b5\u00e8\u00ae\u0005h.\u0089\u0096\u00d3\u00aa|\u0091\u00e4\u00b4\u00b23\u00dcp\u0090\u00b4\u00a6\u009dj\u0099\u00d3\u0082\u00bar\u00ca\u000f\u00c7v\u00a0\u00f2\u00b7\u00a5N\u00fb\\\u00f7\u009d\u00b8l7\u00bd\u008fV\u009e\u00d3\u00be\u00b9\u00a1\u008bN\u0083\u00d9\u0095\u0080/\u0088\u0005\u00ed\u00f3\u0006\u00a7\u0013\u00a7\u00dc\u0090\u00a9}\u0091]\u00b9\u00a9\u0093x\u001cbD\u008bY\u009f\u008d\u0006\u00c7`]\u008bN\u00aa\u00d8\u0096\u00b3y\u00ffI\u00b1\u00b4M\u001bi\u00bb\u00be\u0081N\u008a\u00c2\u0098\u00b0r\u00ea^\r\u00b4\u00cbq\u00e7\u00a2U\u0099\u00d1\u00de\u00b5s\u00d3]\u00f7\u0091\u00914'\u00e3\u00bd\u00dd\\\u0088\u008d\u00bd\u00b0n\u00d9\u001e\u00b2\u00a8\u0099;|\u00da\u00aa\u008dN\u0084\u00c4\u00c2\u00b9\u007f\u0085\u0018\u0094\u00a8\u00860|\u00e6\u00a0\u0083V\u00c4\u00e7\u0084\u00beh\u00dbC\u00b6\u00ae\u009b95\u00b7\u001d\u0088\u00e2\u00aa|\u0091\u00e4\u00b4\u00b23\u00f0\u007f\u0096\u00b0\u00a7\u0094\u00a2P\u008a\u00c0\u0090\u00f0p\u00df_\u00bf\u00e8\u00bb59\u00e9\u00ac\u009a\u0001\n\u00a8|\u00c2\u00f09_\u00aa|\u0091\u00e4\u00b4\u00b23\u00f0`\u00b7\u00fb\u00a2P\u008a\u00c0\u0090\u00f0p\u00df_\u00bf\u00e8\u00bb59\u00f5\u00b0\u009a\u0001\u00c2\u00fa\u009b\u00bej\u00df\u001e\u00b4\u00a6\u009a0|\u00df\u00b1\u0084_\u0088\u00c2\u00ca\u00b1\u00aa|\u0091\u00e4\u00b4\u00b23\u00f0\u007f\u0096\u009d\u0093wZ\u00a2q\u00af\u00f0\u008b\u008dY\u00d3\u001e\u0096\u0089\u00ba\u0019\u00013I\u00a2P\u008a\u00c0\u0090\u00f0p\u00df_\u00bf\u00e8\u00bb59\u0004\u0011\u009a\u0001\u00c2\u00fa\u009b\u00bej\u00df\u001e\u00b4\u00a6\u009a0|.\u0010\u0084_\u0088\u00c2\u00caU\u00c7v\u00a0\u00f2\u00b7\u00a5N\u00fb\\\u00f7\u009d\u00a6l\u0091\u00aa|\u0091\u00e4\u00b4\u00b23\u00dagU\u00a2U\u0099\u00d1\u00de\u00b5s\u00d3]\u00f7\u0096\u00816'\u00dc\u000f\u0080S\u0084\u00d8\u0097\u00bc'\u0097}\u00b7\u00b5\u0093x9\u00d6\u0010\u0082\u0015\u00a6\u00d7\u0085\u00adu\u00c6\u0005\u00be\u00fc\u00a4U\u00a2P\u008a\u00c0\u0090\u00f0p\u00df_\u00bf\u00e8\u00b7;2\u00ca\u000e\u00d5v\u00a0\u00f2\u00b7\u00a5N\u00fb\\\u00f7\u0089\u00bc\u0004h\u00f5\u0017\u008fL\u008a\u0099\u0084\u00abu\u00d2\u001e\u00be\u00b2\u009a4'\u00d0\u0012\u0080\u0015\u00bb\u00c4\u0094\u00bbu\u00ddP\u00ac\u00a2\u00cf~\u001f\u00d3\u001c\u0098[\u00c4\u00c3\u0085\u00b6p\u0091}\u00b1\u00b4\u0080l\u0094\u00a0(\u00c7v\u00a0\u00f2\u00b7\u00a5N\u00fb\\\u00f7\u0089\u00ba\u0019\u001d\u00c9g\u00d5\u00ce\u00f2\u00aa\u0013\u00a7\u00fd\u00b5\u0099f\u00ect\u00b5\u00e8\u00ba\u000f:\u00d1T\u0087@\u008e\u00d2\u00c7v\u00a0\u00f2\u00b7\u00a5N\u00fb\\\u00f7\u0089\u00bc\u0004h\u00c7\u00d3\u00aa|\u0091\u00e4\u00b4\u00b23\u00f0\u007f\u00ad\u0092y\u008bN\u0083\u00d9\u0095\u0080*\u008e\u0000\u00ech\u0098\u00aa|\u0091\u00e4\u00b4\u00b23\u00dcr\u0081\u00a7\u0013\u00a7\u00fd\u00b5\u0099f\u00ect\u00b5\u00e8\u00ae\u001bh5\u00e4\u00a2q\u00af\u00f0\u008b\u008dY\u00d3\u001e\u0095\u0095\u00cf~\u00051\u00a5~\u00ad\u00cc\u00a3\u009aq\u0091\u007f\u0096\u0089\u00ba\u0005\u0001\u0082\u00cb\u00e7\u00a2q\u00af\u00f0\u008b\u008dY\u00d3\u001e\u0096\u0096\u009blz\u00d6\u0006\u00a7\u0013\u00a2\n\u00a2U\u0099\u00d1\u00de\u00b5s\u00d3]\u00f7\u008a\u0095#!\bZ\u00da\\\u00d0\u00f0\u00b7\u00995\u00f2z\u009c\u0081\u008e\u0005\u0016\f\r\u00b4h\u00d0K\u00aa|\u0091\u00e4\u00b4\u00b23\u00f0\u007f\u00ac\u008b\u00e7\u00aa~\u00af\u00f0\u00d8\u0093W\u00faw\u00a2\u0095\u00b1:|\u00c2\u0097\u0087\u0001C\u00b1Z\u00a2q\u00af\u00f0\u008b\u008dY\u00d3\u001e\u0096\u0089\u00b33hH4\u00b0\u00a2q\u00af\u00f0\u008b\u008dY\u00d3\u001e\u0096\u00a5\u00bflz\u0013o\u009c]\u00c4\u00dc\u009e\u00b2p\u0091|\u00b9\u00b3\u0086>+\u00b8f\u00bdN\u008a\u00d5\u009a\u00b5\u00b0\u00a2q\u00af\u00f0\u008b\u008dY\u00d3\u001e\u0096\u0096\u0098lz\rL\u00a5~\u00ad\u00cc\u00a3\u009aq\u0091\u007f\u0089\u00ab\u00cfF\u008cI\u001f\u008bN\u0083\u00d9\u0095\u0080)\u0086\u0003\u00e0O\u008fB\u00d2\u00b4\u0013\u00adq\u00e7\u00c7v\u00a0\u00f2\u00b7\u00a5N\u00fb\\\u00f7\u00a5\u00a7l\u00bd\u008bB\u009f\b\u00aa|\u0091\u00e4\u00b4\u00b23\u00e4c\u00eb\u00b7\u0099L\u00a5~\u00ad\u00cc\u00a3\u009aq\u0091S\u00a8\u00fc\u00b7\u008bN\u0083\u00d9\u0095\u0080/\u0088\u0005\u00ed\u00f2\u0084\u00aa|\u0091\u00e4\u00b4\u00b23\u00f3c\u00e7\u00bc<\u00c7v\u00a0\u00f2\u00b7\u00a5N\u00fb\\\u00f7\u0089\u0096\u001ch\n\u00aa~\u00af\u00f2\u00d8\u0093s\u00ccV\u00f7\u00ad\u009b:?Ns\u009b[\u009f\u00d3\u0083\u00b1u\u00d1_\u00be\u00fc\u0082\u009b\u00e3\u00c7l\u0094\u0094\bK\u00aa|\u0091\u00e4\u00b4\u00b23\u00c9@U\u00c7v\u00a0\u00f2\u00b7\u00a5N\u00fb\\\u00f7\u0089\u00ba36\u0082k\u00aa~\u00af\u009f\u00bd\u0094X\u00f8K\u008a\u0082\u0099x\u001dX*\u00d5\u0082\u00a3<\u00c7v\u0081\u00d7\u0087\u00be3\u00d2P\u00b6\u00a0\u00db\u00181=q\u008dN\u00d0Z\u00a2q\u00af\u00f0\u008b\u008dY\u00d3\u001e\u0096\u009f\u009dl\u0015H>\u0084[\u009d\u00d7\u00de\u00aah\u00d7]\u00f7\u008b\u009d$'Z\u00d2\u00a8|\u00ad\u009f\u00bd\u00b0n\u00d9\u001e\u00b2\u00a8\u0099;|\u00f4\u009b\u009aH\u0082\u00ce\u00c5\u00b9'\u00e2\u00aa|\u0091\u00e4\u00b4\u00b23\u00dcu\u008a<\u00a8\u0013\u00a7\u00fd\u00b5\u0099f\u00ect\u00b5\u00e8\u00ba\u000f:l\u00e3\u00c7v\u0084\u00c4\u0096\u00f0v\u00d1\\\u00b4\u00e8\u00a220\u0010\u00a4\u009c\t\u008d\u008d\u00bc,\u009c]\u00c4\u00dc\u009e\u00b2p\u0091`\u00ad\u00a6\u00802!n*\u0081T\u008dk\u00a2q\u00af\u00f0\u008b\u008dY\u00d3\u001e\u0096\u009f\u009dlzL\b\u00aa|\u0091\u00e4\u00b4\u00b23\u00f0i\u00b1\u00fc\u0081m\u008bN\u0083\u00d9\u0095\u0080-\u0086\t\u00ee\u00f3(\u00a2q\u00af\u00f0\u008b\u008dY\u00d3\u001e\u0096\u009f\u009dl\u0017\u00c8D\u00c7v\u00a0\u00f2\u00b7\u00a5N\u00fb\\\u00f7\u0089\u00bc\u0004h\u00fb\u00a2q\u00af\u00f0\u008b\u008dY\u00d3\u001e\u0096\u00a5\u00b8lz\u00dc\u0098\u00aa|\u0091\u00e4\u00b4\u00b23\u00f0`\u00b7\u00fc\u007f6\u00aa|\u0091\u00e4\u00b4\u00b23\u00f0[\u0094\u00b8\u0087]\u0085\u00c3\u009c\u00e3\u00c7sZ\u00a7\u0013\u00a7\u00fd\u00b5\u0099f\u00ect\u00b5\u00e8\u00ae\u0005h\u0084\u00aa|\u0091\u00e4\u00b4\u00b23\u00dcA\u00b5\u009c\u007f\u0087\u00c5\u0094.\u008bN\u0083\u00d9\u0095\u0080-\u0086\u0002\u00ef\u00f1m\u00b1\u00aa|\u0091\u00e4\u00b4\u00b23\u00d2Z\u0018\u00be\u00bb\u0081J\u00a6\u00d7\u0085\u00adu\u00c6\u00b2\u0084\u00aa|\u0091\u00e4\u00b4\u00b23\u00f0T\u00be\u00a6\u008fL\u008a\u0099\u0084\u00abu\u00d2\u001e\u0097\u00b7\u0080><\u00fe\u00ad\u0082\u00e4\u00aa\u0013\u00adG\u009d\u007f\u0086\u00c6\u0085\u00a6\u00b7\u008bN\u0083\u00d9\u0095\u0080)\u0087\b\u00e0\u00b0\u00a2P\u008a\u00c0\u0090\u00f0p\u00df_\u00bf\u00e8\u00bb592\u00fb\u009a\u0001\u00c2\u00ecU\u00a8\u0013\u00ad\u00ec\u009c[\u0085\u00c5\u009d\u00beh\u00db\u0087\u00aa|\u0091\u00e4\u00b4\u00b23\u00dcC\u0087\u00aa|\u0091\u00e4\u00b4\u00b23\u00f0`\u00b9O\u008bN\u0083\u00d9\u0095\u0080-\u0086\u0002\u00e0\u00f6\u0088\u00a8\u00a8\u0081N\u008a\u00c2\u0094j\u008fL\u008a\u0099\u0084\u00abu\u00d2\u001e\u009b\u00a8\u0098;6\u00eft\u0087U\u0085\u00c5.\u008bN\u0083\u00d9\u0095\u0080)\u0086\u0001\u00ed\u0093\u00f2\u00a2P\u008a\u00c0\u0090\u00f0p\u00df_\u00bf\u00e8\u00a7#!\u0083\u00c7\u0089\u0001\u00fb\u00c7v\u0081\u00d7\u0087\u00be3\u00cbE\u00b1\u00ab\u00db\u0018#\u00e4\u00ba\u0081T\u008a\u00da\u00ca\u00b1\u00aa|\u0091\u00e4\u00b4\u00b23\u00e4y\u00c2\u0098\u00aa|\u0091\u00e4\u00b4\u00b23\u00f0\u007f\u008f\u0082C\u0087TU\u00a2q\u00af\u00f0\u008b\u008dY\u00d3\u001e\u00b4\u009e\u00cf\u001b9\u00d8\u000b\u008f\u0015\u0087\u00d7\u009f\u00b83\u00edE\u00aa\u00ae\u009a0h\u00e21\u00a5~\u00ad\u00cc\u00a3\u009aq\u0091]\u00ae\u00fc\u00dd\u001b\u0018\u00fd;\u0094h\u00ae\u00db\u00de\u00b3v\u0085f\u00c6\u009c]\u00c4\u00dc\u009e\u00b2p\u0091g\u00bd\u00a4\u00808!\u00d9\u00cf\u00f5\u008bN\u0083\u00d9\u0095\u0080.\u008a\t\u00ea\u00ff\u00f5\u008bN\u0083\u00d9\u0095\u0080)\u0086\u0003\u00e1\u0087xu\u008a^d\u009bI\u0083\u00fb\u0090\u00abn\u00d7I\u00b7\u00a5\u0094p\u00ce\u008bN\u00a7\u00d7\u0082\u00ab\u00fb\u00a2U\u0099\u00d1\u00de\u00b5s\u00d3]\u00f7\u0096\u00816'\u00f5\u00a1\u0080S\u0084\u00d8\u0097\u00bc'\u0097}\u00b7\u00b5\u0093x9\u00ff\u00be\u0082\u0015\u00bd\u00d3\u0092\u00abs\u00cc\u0002\u00be\u00fcZ\u00aa~\u00c2\u00f2\u0088\u00ac\u00a8\u0081N\u008a\u00c2\u0094\u008bs\u00f2\u00a2q\u00af\u00f0\u008b\u008dY\u00d3\u001e\u0096\u009f\u009dl\u001f\u00a1\u009e\u00a8@\u00b9\u00f3\u009c\u00f0R\u00e6X\u00e3\u0081\u00bd~\u0005Z\u00c7v\u00a0\u00f2\u00b7\u00a5N\u00fb\\\u00f7\u0089\u00ac>hJ\u008fJ\u0087\u00aa|\u0091\u00e4\u00b4\u00b23\u00f0`\u00a1\u0006\u00c7~\u0011\u000f\u00a2q\u00af\u00f0\u008b\u008dY\u00d3\u001e\u0096\u009f\u009dl\u0015M}H\u008fL\u008a\u0099\u009d\u00ber\u00d9\u001e\u0095\u00a6\u0080?\u00ab\u008c\u00fb\u00a7|\u00c2\u00ff\u00b8\u0087T\u0081\u00a7\u0013\u00a7\u00dc\u0090\u00a9}\u0091]\u00b9\u00a9\u0093x\u001a\u0084\u00dd\u008b]\u008e\u00c4\u00ca(\u00a2q\u00af\u00f0\u008b\u008dY\u00d3\u001e\u0096\u00ad\u00b8lz\u00c5}/\u00a1\u008fO\u00bdPM\b\u00aa|\u0091\u00e4\u00b4\u00b23\u00f0\u007f\u00bc\u00a2\u0006\u00a2q\u00af\u00f0\u008b\u008dY\u00d3\u001e\u0096\u00a5\u00bfl\u001fKj\u00a8@\u00b9\u00f3\u009c\u00f0R\u00e6X\u00e3\u0081\u00b2\u0011\u0015)b\u00a5~\u00ad\u00cc\u00a3\u009aq\u0091\u007f\u0080\u00ae\u00cf\u00e3\u00c7v\u0081\u00d7\u0087\u00be3\u00cbE\u00b1\u00ab\u00db\u001e'\u0001\u00b9\u008fN\u0084\u00c4\u00ca";
        lInjpjrln = new int[]{8454154, 99352577, 61866003, 86048769, 171704322, 84541452, 1, 129630219, 144900107, 0x3400003, 2883595, 15073296, 55640066, 50200578, 104595457, 80805890, 142999554, 0xFF000B, 0x7710001, 125698079, 157679617, 149028865, 66715661, 75694158, 4390926, 137428999, 55508993, 110428161, 171900929, 110100483, 61014029, 105578508, 0x2230003, 52363276, 40304641, 110493706, 171442177, 96862224, 171638785, 55574529, 132972556, 45154320, 142213132, 95748113, 153812993, 156499969, 107020290, 137887755, 127729692, 141492235, 168296450, 100466701, 63504395, 99418128, 0x200000A, 196609, 87752705, 172752941, 18546702, 60882946, 19464228, 157548546, 0x800001, 46202881, 104660994, 165281803, 89915408, 143523861, 22806537, 5308434, 36896782, 88801296, 17432590, 23396368, 95617026, 67633206, 83230724, 130744323, 56557569, 145620993, 161415170, 113377282, 75628545, 124911628, 119210000, 3670027, 157483009, 63438849, 121700372, 54722572, 108134428, 101515275, 393217, 120258581, 153878545, 0x8880006, 158203948, 119144449, 94371859, 67567617, 156631043, 138608661, 0x2F20002, 139984900, 171507714, 156565505, 32964609, 134479874, 133758977, 18415618, 84475905, 36241418, 146931734, 135987218, 0x3000009, 32768003, 113508372, 49545226, 39321615, 166199297, 1245194, 0x1E00011, 44630024, 164102159, 166264849, 22675458, 145686547, 110297090, 86114314, 109969410, 131923978, 104792076, 102694913, 0x1180001, 133824522, 150077497, 49348609, 0x20A0002, 41680941, 38469645, 16121857, 51904519, 168951830, 82182160, 149094412, 137166852, 121634817, 171835393, 7667723, 154992652, 135200769, 0x110002, 112197650, 129564673, 167378958, 32571395, 40370180, 168755203, 82116609, 72089610, 0xA0A0005, 9764945, 106364938, 80936978, 0x2260002, 1900558, 102432772, 46596097, 123011100, 3604481, 262146, 114819104, 33030152, 175702038, 6488082, 35389447, 103677956, 140836874, 102760462, 56623105, 458762, 36175873, 46661658, 111149072, 171966476, 53149717, 24444944, 16187400, 165085187, 28114995, 157745159, 132579334, 64225318, 55771146, 56688704, 97910806, 156827658, 140247049, 116916248, 72745004, 51838977, 149880835, 63111173, 46268421, 65538, 134610953, 118489098, 162070559, 21889036, 34406415, 135266315, 93585420, 107151375, 155779083, 83492879, 40632336, 56426498, 166002691, 102236163, 161087493, 101318659, 130351110, 2818049, 161546248, 25493544, 87818255, 21823489, 170393616, 85327883, 89849857, 148373514, 71172110, 103940106, 90963972, 91226148, 130940943, 50921486, 37814282, 86769679, 34340865, 48365583, 9109514};
        bh.t();
        bh.G();
        bh.m();
        bh.P();
        bh.v();
        bh.b();
        bh.n();
        bh.T();
    }

    private static /* synthetic */ CallSite ookitln0(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = lInjpjrln[n2 ^ 0x4939E4B6];
        int n8 = n7 >>> 16;
        String string2 = bh.lIkIIj(OOmIOI0.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0x4939E4B6);
        n7 = lInjpjrln[n3 ^ 0x4939E4B6];
        int n9 = n7 >>> 16;
        String string3 = bh.lIkIIj(OOmIOI0.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0x4939E4B6);
        n7 = lInjpjrln[n4 ^ 0x4939E4B6];
        int n10 = n7 >>> 16;
        String string4 = bh.lIkIIj(OOmIOI0.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0x4939E4B6);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x14E23D9D) + -178;
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

    private static /* synthetic */ CallSite OOInk(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = lInjpjrln[n2 ^ 0x4939E4B6];
        int n9 = n8 >>> 16;
        String string2 = bh.lIkIIj(OOmIOI0.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x4939E4B6);
        n8 = lInjpjrln[n3 ^ 0x4939E4B6];
        int n10 = n8 >>> 16;
        String string3 = bh.lIkIIj(OOmIOI0.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x4939E4B6);
        n8 = lInjpjrln[n4 ^ 0x4939E4B6];
        int n11 = n8 >>> 16;
        String string4 = bh.lIkIIj(OOmIOI0.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x4939E4B6);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x14E23D9D) + -178;
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

    private static /* synthetic */ String lIkIIj(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{61, -57, 19, 26, 64, 31, -10, -18, 79, -108, -15, 41, -25, -14, -91, 126};
        byte[] byArray3 = new byte[]{-77, 12, 103, 51, 22, -66, -51, 56, -46, -31, 83, 6, 102, -103, 92, -2};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void llqrIsrr(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[242];
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
        OOmIOI0 = stringBuilder.toString();
        lInjpjrln = nArray;
    }
}
