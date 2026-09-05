/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NNIo
 *  KDFzREm.NNNQL
 *  KDFzREm.NNNwS
 *  KDFzREm.NNfU
 *  KDFzREm.NNiz
 *  KDFzREm.NNuU
 *  KDFzREm.NbL
 *  org.joml.Matrix4f
 */
package KDFzREm;

import KDFzREm.MR;
import KDFzREm.NNIo;
import KDFzREm.NNNQL;
import KDFzREm.NNNwS;
import KDFzREm.NNfU;
import KDFzREm.NNiz;
import KDFzREm.NNuU;
import KDFzREm.NbL;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.bY;
import KDFzREm.lQ;
import KDFzREm.lY;
import KDFzREm.lb;
import KDFzREm.uF;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import org.joml.Matrix4f;

@UZ(L="Hands", y=UR.VISUAL, N=Uz.WORLD)
public class bk
extends UM {
    private static boolean[] u;
    private static short[] i;
    private static short[] R;
    public Object[] L;
    private static String[] M;
    private static float[] B;
    private static int[] Z;
    private static short[] z;
    private static byte[] U;
    private static /* synthetic */ String lOOpsqj;
    private static /* synthetic */ int[] oosslrnII;

    private static /* synthetic */ int L(int n) {
        return Integer.rotateLeft(Integer.rotateRight((Integer.rotateLeft(Integer.rotateLeft(-n, 31) ^ 0xCE9B09D2, 9) ^ 0x97985971) + 1, 12), 10);
    }

    private static void P() {
        i = new short[]{0, 1, 2, 3, 4};
        R = new short[]{0, 7, 0, 7, 4, 4};
        z = new short[]{2, 4, 4, 4, 0, 1, 3, 4};
    }

    private static void T() {
        M = new String[]{"color-right", "color-left", "blur", "texture-mix"};
    }

    public bk() {
        bk.l1p0snljj("fpqxpo", -1757134014, 1720926839, 1720926838, 1720926837, -1757134014, -1757134014, -1757134014, (bk)this);
        CallSite callSite = bk.l1p0snljj("wwoo", -1757134004, 1720926841, 1720926847, 1720926840, -1757134004, -1757134004, -1757134004, (lY)this, (String)((Object)bk.l1p0snljj("dmksqgod", -1757134010, 1720926839, 1720926845, 1720926844, -1757134010, -1757134010, -1757134010)[0]), (int)bk.l1p0snljj("wwoo", -1757134010, 1720926839, 1720926843, 1720926842, -1757134010, -1757134010, -1757134010)[0]);
        bk.l1p0snljj("oiobh", -1757134016, 1720926839, 1720926836, 1720926835, -1757134016, -1757134016, -1757134016, (bk)this)[bk.l1p0snljj("iqoxjrmv", -1757134010, 1720926839, 1720926823, 1720926833, -1757134010, -1757134010, -1757134010)[0]] = callSite;
        CallSite callSite2 = bk.l1p0snljj("wwoo", -1757134004, 1720926841, 1720926847, 1720926840, -1757134004, -1757134004, -1757134004, (lY)this, (String)((Object)bk.l1p0snljj("dmksqgod", -1757134010, 1720926839, 1720926845, 1720926844, -1757134010, -1757134010, -1757134010)[1]), (int)bk.l1p0snljj("iqoxjrmv", -1757134010, 1720926839, 1720926843, 1720926842, -1757134010, -1757134010, -1757134010)[1]);
        bk.l1p0snljj("fpqxpo", -1757134016, 1720926839, 1720926836, 1720926835, -1757134016, -1757134016, -1757134016, (bk)this)[bk.l1p0snljj("hdvse", -1757134010, 1720926839, 1720926823, 1720926833, -1757134010, -1757134010, -1757134010)[1]] = callSite2;
        CallSite callSite3 = bk.l1p0snljj("hdvse", -1757134004, 1720926841, 1720926847, 1720926820, -1757134004, -1757134004, -1757134004, (lY)this, (String)((Object)bk.l1p0snljj("oiobh", -1757134010, 1720926839, 1720926845, 1720926844, -1757134010, -1757134010, -1757134010)[2]), (float)bk.l1p0snljj("bqlhyk", -1757134010, 1720926839, 1720926822, 1720926821, -1757134010, -1757134010, -1757134010)[0], (float)bk.l1p0snljj("oiobh", -1757134010, 1720926839, 1720926822, 1720926821, -1757134010, -1757134010, -1757134010)[1], (float)bk.l1p0snljj("iqoxjrmv", -1757134010, 1720926839, 1720926822, 1720926821, -1757134010, -1757134010, -1757134010)[2], (float)bk.l1p0snljj("fpqxpo", -1757134010, 1720926839, 1720926822, 1720926821, -1757134010, -1757134010, -1757134010)[3]);
        bk.l1p0snljj("jzkqzur", -1757134016, 1720926839, 1720926836, 1720926835, -1757134016, -1757134016, -1757134016, (bk)this)[bk.l1p0snljj("jzkqzur", -1757134010, 1720926839, 1720926823, 1720926833, -1757134010, -1757134010, -1757134010)[2]] = callSite3;
        CallSite callSite4 = bk.l1p0snljj("iqoxjrmv", -1757134004, 1720926841, 1720926847, 1720926820, -1757134004, -1757134004, -1757134004, (lY)this, (String)((Object)bk.l1p0snljj("fpqxpo", -1757134010, 1720926839, 1720926845, 1720926844, -1757134010, -1757134010, -1757134010)[3]), (float)bk.l1p0snljj("jzkqzur", -1757134010, 1720926839, 1720926822, 1720926821, -1757134010, -1757134010, -1757134010)[4], (float)bk.l1p0snljj("wwoo", -1757134010, 1720926839, 1720926822, 1720926821, -1757134010, -1757134010, -1757134010)[5], (float)bk.l1p0snljj("hdvse", -1757134010, 1720926839, 1720926822, 1720926821, -1757134010, -1757134010, -1757134010)[6], (float)bk.l1p0snljj("bqlhyk", -1757134010, 1720926839, 1720926822, 1720926821, -1757134010, -1757134010, -1757134010)[7]);
        bk.l1p0snljj("oiobh", -1757134016, 1720926839, 1720926836, 1720926835, -1757134016, -1757134016, -1757134016, (bk)this)[bk.l1p0snljj("bqlhyk", -1757134010, 1720926839, 1720926823, 1720926833, -1757134010, -1757134010, -1757134010)[3]] = callSite4;
        bY bY2 = new bY();
        bk.l1p0snljj("hdvse", -1757134016, 1720926839, 1720926836, 1720926835, -1757134016, -1757134016, -1757134016, (bk)this)[bk.l1p0snljj("hdvse", -1757134010, 1720926839, 1720926823, 1720926833, -1757134010, -1757134010, -1757134010)[4]] = bY2;
    }

    static {
        bk.ntfClinit();
    }

    private static /* synthetic */ String i(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-63, 41, -127, -81, 3, -15, 14, 4, 93, -14, 11, 26, 13, 31, -1, 24};
        int n = 0;
        int n2 = 211;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 205;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int i(int n) {
        return -Integer.rotateLeft(Integer.rotateRight(-Integer.rotateRight(Integer.rotateLeft(Integer.rotateLeft(n, 3) ^ 0x32E79246, 24), 17), 20), 31);
    }

    private static void b() {
        u = new boolean[]{true, false};
    }

    private static void s() {
        U = new byte[]{5};
    }

    private void n() {
        if (bk.l1p0snljj("wwoo", -1757134016, 1720926839, 1720926836, 1720926835, -1757134016, -1757134016, -1757134016, (bk)this) == null) {
            bk.l1p0snljj("bqlhyk", -1757134015, 1720926839, 1720926836, 1720926835, -1757134015, -1757134015, -1757134015, (bk)this, (Object[])new Object[bk.l1p0snljj("hdvse", -1757134010, 1720926839, 1720926804, 1720926812, -1757134010, -1757134010, -1757134010)[0]]);
            CallSite callSite = bk.l1p0snljj("wwoo", -1757134016, 1720926839, 1720926836, 1720926835, -1757134016, -1757134016, -1757134016, (bk)this);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean m() {
        CallSite callSite;
        bk.l1p0snljj("oiobh", -1757134014, 1720926839, 1720926838, 1720926837, 1750499250, -1765045081, 1640974442, (bk)this);
        if (bk.l1p0snljj("fpqxpo", -1757134014, 1720926839, 1720926804, 1720926828, 1750499250, -1765045081, 1640974442, (bk)this) != false) {
            if (bk.l1p0snljj("fpqxpo", -1757134014, 1720926832, 1720926819, 1720926828, 1750499250, -1765045081, 1640974442, (bY)((bY)((Object)bk.l1p0snljj("bqlhyk", -1757134016, 1720926839, 1720926836, 1720926835, 979681825, 1567245807, -142844760, (bk)this)[bk.l1p0snljj("lhkze", -1757134010, 1720926839, 1720926834, 1720926833, 14794919, 1302055637, -402546610)[1]]))) != false) {
                callSite = bk.l1p0snljj("jzkqzur", -1757134010, 1720926839, 1720926803, 1720926802, -208070454, 898454564, 1634123060)[0];
                return (boolean)callSite;
            }
        }
        callSite = bk.l1p0snljj("lhkze", -1757134010, 1720926839, 1720926803, 1720926802, 1190077453, -1113966641, 1771173459)[1];
        return (boolean)callSite;
    }

    private static void v() {
        B = new float[]{10.0f, 0.0f, 30.0f, 1.0f, 0.5f, 0.0f, 0.5f, 0.1f};
    }

    private static void j() {
        Z = new int[]{-7694081, -7694081};
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{33, 86, 22, 110, -69, -84, -48, -3, -114, 89, 50, -34, -25, 13, 57, -113};
        int n = 0;
        int n2 = 134;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 181;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int u(int n) {
        return -Integer.rotateLeft(-Integer.rotateRight(-n, 20), 30);
    }

    private static /* synthetic */ int y(int n) {
        return -Integer.rotateLeft(Integer.rotateRight(Integer.rotateLeft(-Integer.rotateRight(Integer.rotateLeft(n, 7), 30), 2), 27) ^ 0x8B151E69, 22);
    }

    @Override
    public void y() {
        bk.l1p0snljj("jzkqzur", -1757134014, 1720926839, 1720926838, 1720926837, -1757134014, -1757134014, -1757134014, (bk)this);
        bk.l1p0snljj("jzkqzur", -1757134014, 1720926832, 1720926847, 1720926837, -1757134014, -1757134014, -1757134014, (bY)((bY)((Object)bk.l1p0snljj("dmksqgod", -1757134016, 1720926839, 1720926836, 1720926835, -1757134016, -1757134016, -1757134016, (bk)this)[bk.l1p0snljj("hdvse", -1757134010, 1720926839, 1720926834, 1720926833, -1757134010, -1757134010, -1757134010)[7]])));
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-70, 70, 16, -31, -62, 52, -105, -8, 4, 110, -78, -44, 98, 106, 82, 119};
        int n = 0;
        int n2 = 99;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 3;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    public void N(NNNQL nNNQL, float f, NNIo nNIo, NNNwS nNNwS, int n, Matrix4f matrix4f) {
        bk.l1p0snljj("fpqxpo", -1757134014, 1720926839, 1720926838, 1720926837, 1750499250, -1765045081, 1640974442, (bk)this);
        bk.l1p0snljj("jzkqzur", -1757134014, 1720926832, 1720926847, 1720926813, 1750499250, -1765045081, 1640974442, (bY)((bY)((Object)bk.l1p0snljj("wwoo", -1757134016, 1720926839, 1720926836, 1720926835, 1269138800, 1438948028, -1507170605, (bk)this)[bk.l1p0snljj("bqlhyk", -1757134010, 1720926839, 1720926834, 1720926833, 1500172894, 69349284, 207803489)[3]])), (NNNQL)nNNQL, (float)f, (NNIo)nNIo, (NNNwS)nNNwS, (int)n, (Matrix4f)matrix4f, (int)bk.l1p0snljj("bqlhyk", -1757134014, 1720926800, 1720926807, 1720926806, 1750499250, -1765045081, 1640974442, (Integer)((Object)bk.l1p0snljj("iqoxjrmv", -1757134014, 1720926801, 1720926823, 1720926825, 1750499250, -1765045081, 1640974442, (lb)((lb)((Object)bk.l1p0snljj("jzkqzur", -1757134016, 1720926839, 1720926836, 1720926835, 1446037270, -1008097928, -1143756231, (bk)this)[bk.l1p0snljj("fpqxpo", -1757134010, 1720926839, 1720926834, 1720926833, -451616145, -116904707, -668081904)[4]]))))), (int)bk.l1p0snljj("jzkqzur", -1757134014, 1720926800, 1720926807, 1720926806, 1750499250, -1765045081, 1640974442, (Integer)((Object)bk.l1p0snljj("bqlhyk", -1757134014, 1720926801, 1720926823, 1720926825, 1750499250, -1765045081, 1640974442, (lb)((lb)((Object)bk.l1p0snljj("lhkze", -1757134016, 1720926839, 1720926836, 1720926835, -1850493154, -1735058415, -1066501593, (bk)this)[bk.l1p0snljj("lhkze", -1757134010, 1720926839, 1720926834, 1720926833, -1643184402, -1517579517, -1922732461)[5]]))))), (float)bk.l1p0snljj("jzkqzur", -1757134014, 1720926824, 1720926815, 1720926814, 1750499250, -1765045081, 1640974442, (Float)((Float)((Object)bk.l1p0snljj("bqlhyk", -1757134014, 1720926826, 1720926823, 1720926825, 1750499250, -1765045081, 1640974442, (lQ)((lQ)((Object)bk.l1p0snljj("hdvse", -1757134016, 1720926839, 1720926836, 1720926835, -666169886, 857912496, 499675494, (bk)this)[bk.l1p0snljj("wwoo", -1757134010, 1720926839, 1720926834, 1720926833, -1389250240, 1948915703, -231045692)[6]])))))));
    }

    @uF
    public void N(MR mR) {
        block3: {
            block2: {
                bk.l1p0snljj("bqlhyk", -1757134014, 1720926839, 1720926838, 1720926837, 1750499250, -1765045081, 1640974442, (bk)this);
                if (bk.l1p0snljj("lhkze", -1757134014, 1720926829, 1720926847, 1720926828, 1750499250, -1765045081, 1640974442, (NNfU)bk.l1p0snljj("fpqxpo", -1757134014, 1720926816, 1720926831, 1720926830, 1750499250, -1765045081, 1640974442, (NNiz)((NNiz)bk.l1p0snljj("hdvse", -1757134016, 1720926817, 1720926823, 1720926835, -544925764, -552886796, -919174198, (NNuU)((NNuU)bk.l1p0snljj("dmksqgod", -1757134016, 1720926839, 1720926819, 1720926835, -695788740, -716027083, 1111792825, (bk)this)[bk.l1p0snljj("hdvse", -1757134010, 1720926839, 1720926818, 1720926833, -781020774, -1385380609, -921491791)[0]]))[bk.l1p0snljj("fpqxpo", -1757134010, 1720926839, 1720926818, 1720926833, -1430913541, 1257047860, -1331319027)[1]]))) == false) break block2;
                if (bk.l1p0snljj("hdvse", -1757134016, 1720926816, 1720926827, 1720926843, -195200202, 73187551, 478793468, (NNiz)((NNiz)bk.l1p0snljj("wwoo", -1757134016, 1720926817, 1720926823, 1720926835, 168723389, 358765100, 1837826663, (NNuU)((NNuU)bk.l1p0snljj("bqlhyk", -1757134016, 1720926839, 1720926819, 1720926835, 490568737, -524124609, -581824868, (bk)this)[bk.l1p0snljj("oiobh", -1757134010, 1720926839, 1720926818, 1720926833, 385415204, 826648860, -2070467986)[2]]))[bk.l1p0snljj("wwoo", -1757134010, 1720926839, 1720926818, 1720926833, -151258511, -1732426688, -1827714282)[3]])) == false) break block3;
            }
            bk.l1p0snljj("lhkze", -1757134014, 1720926832, 1720926847, 1720926837, 1750499250, -1765045081, 1640974442, (bY)((bY)((Object)bk.l1p0snljj("iqoxjrmv", -1757134016, 1720926839, 1720926836, 1720926835, -938498491, -1388754035, -1025895805, (bk)this)[bk.l1p0snljj("oiobh", -1757134010, 1720926839, 1720926818, 1720926833, -203987916, -218536624, 1181795118)[4]])));
            return;
        }
        bk.l1p0snljj("wwoo", -1757134014, 1720926832, 1720926847, 1720926805, 1750499250, -1765045081, 1640974442, (bY)((bY)((Object)bk.l1p0snljj("hdvse", -1757134016, 1720926839, 1720926836, 1720926835, 1806629999, 1108502032, -1056560392, (bk)this)[bk.l1p0snljj("wwoo", -1757134010, 1720926839, 1720926818, 1720926833, 1771410557, 1349646722, 1691065897)[5]])), (int)bk.l1p0snljj("dmksqgod", -1757134014, 1720926824, 1720926807, 1720926806, 1750499250, -1765045081, 1640974442, (Float)((Float)((Object)bk.l1p0snljj("lhkze", -1757134014, 1720926826, 1720926823, 1720926825, 1750499250, -1765045081, 1640974442, (lQ)((lQ)((Object)bk.l1p0snljj("jzkqzur", -1757134016, 1720926839, 1720926836, 1720926835, 708602517, 1684504079, -941716733, (bk)this)[bk.l1p0snljj("iqoxjrmv", -1757134010, 1720926839, 1720926834, 1720926833, 1937250790, -682517837, 241426009)[0]])))))));
    }

    public boolean N(NbL nbL) {
        bk.l1p0snljj("hdvse", -1757134014, 1720926839, 1720926838, 1720926837, 1750499250, -1765045081, 1640974442, (bk)this);
        return (boolean)bk.l1p0snljj("fpqxpo", -1757134014, 1720926832, 1720926847, 1720926846, 1750499250, -1765045081, 1640974442, (bY)((bY)((Object)bk.l1p0snljj("oiobh", -1757134016, 1720926839, 1720926836, 1720926835, 1273315895, -1423714476, -530752840, (bk)this)[bk.l1p0snljj("dmksqgod", -1757134010, 1720926839, 1720926834, 1720926833, 520134094, 1143302881, -419644175)[2]])), (NbL)nbL);
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateRight(Integer.rotateLeft(Integer.rotateRight(n ^ 0x599C5422, 15), 30) ^ 0x929BDA94, 12);
    }

    private static /* synthetic */ String R(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-100, -52, -1, 33, 56, 115, -17, -44, -4, 8, -62, -59, -61, -124, -2, 47};
        int n = 0;
        int n2 = 72;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 87;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int R(int n) {
        return (Integer.rotateRight(Integer.rotateLeft((n ^ 0xC67632D7) + 1, 27), 28) ^ 0x320BB331) + 1;
    }

    private static /* synthetic */ void ntfClinit() {
        lOOpsqj = "\u00b6Ke\u00d9\u0007\u0082\u00a5\u0010!Pw\u008c\u00e17Un\u00ae\u00f8y\u00ecy\u00a7Fm\u00dafX\u00fcn\u0094\u0096;+PR\u00bb\u00ae\u001eXj\u0084K<\u00d4I\u0080\u00a3Q\u0015\u000bL\u008b\u00fb5\tM\u00b4lU\u0091d\u00a5\u00808<-{\u008f\u00ba>c0\u00b2\u0003_\u00d2I\u0098\u00a5Q*\u001eP\u0085\u00ba\u001dPa\u00ffIg\u0083\u00f4\u001bfy\u00d9^\u008f\u00eb\u0012'\u0011Y\u00cd\u00da0Xn#^(\u00a8\u0003I\u00c4F|\u00d9\\\u00b8\u00a5\u00123\u001a5\u00d1nU\u00c2z\u00ab\u00a9Q*\u0014O\u0003_\u00f3l\u00a8\u00be,\u0003\u0012\u0011\u00ac\u00db4g0\u0097nU\u00c2z\u00ab\u00a9Q\b1W\u0098\u00a3\u0088c:\u00eeb\u00e8nU\u00c2z\u00ab\u00a9Q*\u001d\u00a5nU\u00c2z\u00ab\u00a9Q\b1X\u00b7\u00ebc\u00ecjKe\u00d9\u0007\u0082\u00a5\u0010!Px\u008e\u00fa3F\u00ea\u00c6OfX\u00fcn\u0094\u0096;+Pp\u0080\u00d9i\u001bQ\u00dc\u00be(fX\u00fcn\u0094\u0096;+PR\u00bb\u00ae\u001eXjvK<\u00d4I\u0080\u00a3Q\u0015\u000bL\u008b\u00fb5\tB)fX\u00fcn\u0094\u0096;+PR\u0080\u00ae\u00d5p\u0088\u0003E\u00fbnU\u00c2z\u00ab\u00a9Q*.\u00c6fX\u00fcn\u0094\u0096;+Pp\u00ac\u00db\u0003~0\u00a8fX\u00fcn\u0094\u0096;+Pp\u00ac\u00dc=\tG\u00a5nU\u00c2z\u00ab\u00a9Q\b1p\u0095\u00c6i{G\u0081Xt\u0097B\u0081\u00a9\u0012i2_\u0096\u00e7;J?\u0088\u0011Z\u00f1n\u00c7\u0092\u0080\u0003ZRbDg\u00eeI\u0082\u00b1\u001bO\u0003U\u00e8nU\u00c2z\u00ab\u00a9Q\b1K\u00b7\u00fbl@nU\u00c2z\u00ab\u00a9Q$\u0014\u0097nU\u00c2z\u00ab\u00a9Q$&\u00dbh\u00dbfy\u00d9^\u008f\u00eb\u0012'\u0011Y\u00cd\u00c6&@b\u00eeM(9";
        oosslrnII = new int[]{25559050, 13828097, 18153475, 15007745, 6094867, 6029313, 0x110002, 26214410, 12713985, 13893648, 10747905, 27000851, 23855105, 0xC00002, 8257546, 15073325, 11075585, 13762561, 25427970, 1572912, 28246017, 14942209, 24641548, 9961484, 1245186, 0x880010, 11796492, 0x700003, 1441794, 18350090, 4718612, 12779535, 23920648, 23658499, 10813444, 0x150001, 8192001, 18022402, 0xAA000A, 17, 7536650, 24444931, 19005511, 26869762};
        bk.P();
        bk.s();
        bk.j();
        bk.v();
        bk.b();
        bk.T();
    }

    private static /* synthetic */ void Olttsn(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[44];
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
        lOOpsqj = stringBuilder.toString();
        oosslrnII = nArray;
    }

    private static /* synthetic */ String lOmsIirm(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{7, -99, -73, 15, -121, -23, 96, -91, -37, -92, -119, 71, -11, -89, -81, 12};
        byte[] byArray3 = new byte[]{127, -79, 25, -21, 102, 43, 67, -47, -41, 15, 52, -98, 94, -9, -61, -31};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite IIIjt(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) throws Exception {
        int n9 = oosslrnII[n2 ^ 0x66934277];
        int n10 = n9 >>> 16;
        String string2 = bk.lOmsIirm(lOOpsqj.substring(n10, n10 + (n9 & 0xFFFF)), n2 ^ 0x66934277);
        n9 = oosslrnII[n3 ^ 0x66934277];
        int n11 = n9 >>> 16;
        String string3 = bk.lOmsIirm(lOOpsqj.substring(n11, n11 + (n9 & 0xFFFF)), n3 ^ 0x66934277);
        n9 = oosslrnII[n4 ^ 0x66934277];
        int n12 = n9 >>> 16;
        String string4 = bk.lOmsIirm(lOOpsqj.substring(n12, n12 + (n9 & 0xFFFF)), n4 ^ 0x66934277);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x974443F4) + -178;
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

    private static /* synthetic */ CallSite l1p0snljj(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = oosslrnII[n2 ^ 0x66934277];
        int n9 = n8 >>> 16;
        String string2 = bk.lOmsIirm(lOOpsqj.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x66934277);
        n8 = oosslrnII[n3 ^ 0x66934277];
        int n10 = n8 >>> 16;
        String string3 = bk.lOmsIirm(lOOpsqj.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x66934277);
        n8 = oosslrnII[n4 ^ 0x66934277];
        int n11 = n8 >>> 16;
        String string4 = bk.lOmsIirm(lOOpsqj.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x66934277);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x974443F4) + -178;
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
