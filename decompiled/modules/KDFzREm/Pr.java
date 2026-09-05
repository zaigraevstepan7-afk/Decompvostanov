/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NHe
 *  KDFzREm.NNNwS
 *  KDFzREm.NNuU
 *  KDFzREm.NYj
 *  KDFzREm.NkG
 *  KDFzREm.NkS
 *  KDFzREm.Nww
 */
package KDFzREm;

import KDFzREm.NHe;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NYj;
import KDFzREm.NkG;
import KDFzREm.NkS;
import KDFzREm.Nww;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.iG;
import KDFzREm.iQ;
import KDFzREm.lT;
import KDFzREm.lY;
import KDFzREm.lj;
import KDFzREm.lv;
import KDFzREm.uF;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.List;

@UZ(L="LockSlots", y=UR.PLAYER, N=Uz.BASE)
public class Pr
extends UM {
    private static short[] u;
    private static boolean[] i;
    private static byte[] R;
    private static short[] M;
    private static String[] B;
    private static boolean[] Z;
    private static byte[] z;
    public Object[] L;
    private static byte[] U;
    private static boolean[] W;
    private static String[] m;
    private static /* synthetic */ String IIknIsOjp;
    private static /* synthetic */ int[] ooimllik;

    private static /* synthetic */ int L(int n) {
        return -Integer.rotateRight(-Integer.rotateLeft(Integer.rotateRight(Integer.rotateRight(n, 24), 22) ^ 0x63C2C5, 18), 30);
    }

    private static /* synthetic */ String M(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-9, -49, 59, -29, -123, 47, -46, 89, 7, 95, -12, 72, 93, -66, -31, 126};
        int n = 0;
        int n2 = 70;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 95;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void P() {
        i = new boolean[]{false, true, true, true, true};
        Z = new boolean[]{true, true, true};
        W = new boolean[]{true, true, true, false, true, false};
    }

    private void T() {
        if (Pr.lIiqOjI("vsqu", 685356699, 936049497, 936049501, 936049503, 685356699, 685356699, 685356699, (Pr)this) == null) {
            Pr.lIiqOjI("zcbftw", 685356698, 936049497, 936049501, 936049503, 685356698, 685356698, 685356698, (Pr)this, (Object[])new Object[Pr.lIiqOjI("vsqu", 685356701, 936049497, 936049520, 936049475, 685356701, 685356701, 685356701)[3]]);
            CallSite callSite = Pr.lIiqOjI("hbscv", 685356699, 936049497, 936049501, 936049503, 685356699, 685356699, 685356699, (Pr)this);
        }
    }

    public Pr() {
        Pr.lIiqOjI("mlsinfch", 685356697, 936049497, 936049496, 936049499, 685356697, 685356697, 685356697, (Pr)this);
        lv[] lvArray = new lv[Pr.lIiqOjI("vsqu", 685356701, 936049497, 936049472, 936049475, 685356701, 685356701, 685356701)[0]];
        lvArray[Pr.lIiqOjI("orik", 685356701, 936049497, 936049474, 936049483, 685356701, 685356701, 685356701)[0]] = new lv((String)((Object)Pr.lIiqOjI("yehfqvb", 685356701, 936049497, 936049486, 936049473, 685356701, 685356701, 685356701)[1]), (boolean)Pr.lIiqOjI("enlwthuf", 685356701, 936049497, 936049474, 936049483, 685356701, 685356701, 685356701)[1]);
        lvArray[Pr.lIiqOjI("rggmu", 685356701, 936049497, 936049474, 936049483, 685356701, 685356701, 685356701)[2]] = new lv((String)((Object)Pr.lIiqOjI("vsqu", 685356701, 936049497, 936049486, 936049473, 685356701, 685356701, 685356701)[2]), (boolean)Pr.lIiqOjI("zcbftw", 685356701, 936049497, 936049474, 936049483, 685356701, 685356701, 685356701)[3]);
        lvArray[Pr.lIiqOjI("vsqu", 685356701, 936049497, 936049472, 936049475, 685356701, 685356701, 685356701)[1]] = new lv((String)((Object)Pr.lIiqOjI("vsqu", 685356701, 936049497, 936049486, 936049473, 685356701, 685356701, 685356701)[3]), (boolean)Pr.lIiqOjI("rggmu", 685356701, 936049497, 936049474, 936049483, 685356701, 685356701, 685356701)[4]);
        lvArray[Pr.lIiqOjI("feepb", 685356701, 936049497, 936049494, 936049475, 685356701, 685356701, 685356701)[0]] = new lv((String)((Object)Pr.lIiqOjI("yehfqvb", 685356701, 936049497, 936049486, 936049473, 685356701, 685356701, 685356701)[4]), (boolean)Pr.lIiqOjI("verstc", 685356701, 936049497, 936049477, 936049483, 685356701, 685356701, 685356701)[0]);
        lvArray[Pr.lIiqOjI("vsqu", 685356701, 936049497, 936049494, 936049475, 685356701, 685356701, 685356701)[1]] = new lv((String)((Object)Pr.lIiqOjI("rggmu", 685356701, 936049497, 936049486, 936049473, 685356701, 685356701, 685356701)[5]), (boolean)Pr.lIiqOjI("rggmu", 685356701, 936049497, 936049477, 936049483, 685356701, 685356701, 685356701)[1]);
        lvArray[Pr.lIiqOjI("yehfqvb", 685356701, 936049497, 936049494, 936049475, 685356701, 685356701, 685356701)[2]] = new lv((String)((Object)Pr.lIiqOjI("orik", 685356701, 936049497, 936049486, 936049473, 685356701, 685356701, 685356701)[6]), (boolean)Pr.lIiqOjI("vtuge", 685356701, 936049497, 936049477, 936049483, 685356701, 685356701, 685356701)[2]);
        lvArray[Pr.lIiqOjI("mlsinfch", 685356701, 936049497, 936049494, 936049475, 685356701, 685356701, 685356701)[3]] = new lv((String)((Object)Pr.lIiqOjI("vsqu", 685356701, 936049497, 936049486, 936049473, 685356701, 685356701, 685356701)[7]), (boolean)Pr.lIiqOjI("lyqitt", 685356701, 936049497, 936049480, 936049483, 685356701, 685356701, 685356701)[0]);
        lvArray[Pr.lIiqOjI("rsdgpz", 685356701, 936049497, 936049494, 936049475, 685356701, 685356701, 685356701)[4]] = new lv((String)((Object)Pr.lIiqOjI("rsdgpz", 685356701, 936049497, 936049476, 936049473, 685356701, 685356701, 685356701)[0]), (boolean)Pr.lIiqOjI("feepb", 685356701, 936049497, 936049480, 936049483, 685356701, 685356701, 685356701)[1]);
        lvArray[Pr.lIiqOjI("lyqitt", 685356701, 936049497, 936049494, 936049475, 685356701, 685356701, 685356701)[5]] = new lv((String)((Object)Pr.lIiqOjI("yehfqvb", 685356701, 936049497, 936049476, 936049473, 685356701, 685356701, 685356701)[1]), (boolean)Pr.lIiqOjI("orik", 685356701, 936049497, 936049480, 936049483, 685356701, 685356701, 685356701)[2]);
        CallSite callSite = Pr.lIiqOjI("mlsinfch", 685356695, 936049479, 936049484, 936049478, 685356695, 685356695, 685356695, (lY)this, (String)((Object)Pr.lIiqOjI("bsigoque", 685356701, 936049497, 936049486, 936049473, 685356701, 685356701, 685356701)[0]), (lv[])lvArray);
        Pr.lIiqOjI("rggmu", 685356699, 936049497, 936049501, 936049503, 685356699, 685356699, 685356699, (Pr)this)[Pr.lIiqOjI("zcbftw", 685356701, 936049497, 936049529, 936049489, 685356701, 685356701, 685356701)[0]] = callSite;
        CallSite callSite2 = Pr.lIiqOjI("hbscv", 685356695, 936049479, 936049487, 936049528, 685356695, 685356695, 685356695, (lY)this, (String)((Object)Pr.lIiqOjI("bsigoque", 685356701, 936049497, 936049476, 936049473, 685356701, 685356701, 685356701)[2]), (boolean)Pr.lIiqOjI("yehfqvb", 685356701, 936049497, 936049480, 936049483, 685356701, 685356701, 685356701)[3]);
        Pr.lIiqOjI("bsigoque", 685356699, 936049497, 936049501, 936049503, 685356699, 685356699, 685356699, (Pr)this)[Pr.lIiqOjI("zcbftw", 685356701, 936049497, 936049529, 936049489, 685356701, 685356701, 685356701)[1]] = callSite2;
    }

    static {
        Pr.ntfClinit();
    }

    private static /* synthetic */ String B(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-127, -54, 89, 74, -85, -93, 47, 31, -127, 111, 10, -120, -83, 124, -3, -97};
        int n = 0;
        int n2 = 137;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 139;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String Z(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{31, 12, -31, -90, 40, 47, -24, -56, -55, 63, 80, -127, 117, -48, 53, 51};
        int n = 0;
        int n2 = 40;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 231;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String i(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{0, 115, 10, 97, -40, 59, 59, -3, 45, -113, 57, 42, -12, -30, 120, 63};
        int n = 0;
        int n2 = 234;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 49;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int i(int n) {
        return Integer.rotateRight(Integer.rotateLeft(Integer.rotateLeft(Integer.rotateLeft(Integer.rotateLeft(n, 3), 31), 13), 1) ^ 0xCABB54DE, 14);
    }

    private static void b() {
        M = new short[]{0, 1, -999, 1, 0, 4, 0, 4};
        u = new short[]{0, 4, 2, 0};
    }

    private static void s() {
        B = new String[]{"slots", "_1", "_2", "_3", "_4", "_5", "_6", "_7"};
        m = new String[]{"_8", "_9", "from-inventory"};
    }

    private static void m() {
        z = new byte[]{9, 2};
        U = new byte[]{3, 4, 5, 6, 7, 8, -1};
        R = new byte[]{-1, -1, -1, 2};
    }

    private static /* synthetic */ String U(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-117, 30, -61, -102, 33, 100, -51, 50, 11, 127, 8, -29, 92, -26, 12, 91};
        int n = 0;
        int n2 = 127;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 5;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String z(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{4, -98, -57, 1, 78, -79, 27, -30, 103, 3, 84, -24, 90, -83, -100, 81};
        int n = 0;
        int n2 = 209;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 89;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{54, 121, -39, 10, -114, 79, -22, -38, 30, 115, -45, -59, -17, 40, 114, -12};
        int n = 0;
        int n2 = 136;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 127;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int u(int n) {
        return (Integer.rotateLeft(-Integer.rotateRight(-Integer.rotateLeft(n, 27), 28), 13) ^ 0x54EACAF0) + 1;
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-40, 51, 117, 73, 19, -126, 49, 9, 104, -43, -112, -22, -51, -59, 123, -34};
        int n = 0;
        int n2 = 73;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 73;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean y(int n) {
        CallSite callSite;
        Pr.lIiqOjI("feepb", 685356697, 936049497, 936049496, 936049499, -515473034, 1464444087, 374707536, (Pr)this);
        if (Pr.lIiqOjI("verstc", 685356695, 936049498, 936049501, 936049500, -515473034, 1464444087, 374707536, n) != false) {
            if (Pr.lIiqOjI("verstc", 685356697, 936049495, 936049494, 936049481, -515473034, 1464444087, 374707536, (lv)((lv)((Object)Pr.lIiqOjI("hbscv", 685356694, 936049490, 936049493, 936049492, -515473034, 1464444087, 374707536, (List)((Object)Pr.lIiqOjI("vsqu", 685356697, 936049488, 936049501, 936049491, -515473034, 1464444087, 374707536, (lj)((lj)((Object)Pr.lIiqOjI("orik", 685356699, 936049497, 936049501, 936049503, 7791481, 1290261360, -222663497, (Pr)this)[Pr.lIiqOjI("enlwthuf", 685356701, 936049497, 936049502, 936049489, -262972537, -1161731631, 640974742)[3]])))), n)))) != false) {
                callSite = Pr.lIiqOjI("mlsinfch", 685356701, 936049497, 936049480, 936049483, -1068624295, -128598970, -1750226439)[4];
                return (boolean)callSite;
            }
        }
        callSite = Pr.lIiqOjI("yehfqvb", 685356701, 936049497, 936049480, 936049483, 1967947262, -286543382, -2060057698)[5];
        return (boolean)callSite;
    }

    private static /* synthetic */ String E(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{45, -13, -117, -78, -17, -72, -54, -8, -11, 90, 61, 87, 6, -106, -23, 39};
        int n = 0;
        int n2 = 105;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 193;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateLeft(Integer.rotateRight(Integer.rotateRight(Integer.rotateRight(-n, 22), 25) ^ 0x24AD6473, 13), 16) ^ 0x72F0F727;
    }

    @uF
    public void N(iG iG2) {
        if (Pr.lIiqOjI("orik", 685356697, 936049497, 936049484, 936049500, -515473034, 1464444087, 374707536, (Pr)this, (int)Pr.lIiqOjI("rsdgpz", 685356697, 936049482, 936049501, 936049485, -515473034, 1464444087, 374707536, (iG)iG2)) != false) {
            Pr.lIiqOjI("enlwthuf", 685356697, 936049482, 936049487, 936049499, -515473034, 1464444087, 374707536, (iG)iG2);
        }
    }

    @uF
    public void N(iQ iQ2) {
        block6: {
            block7: {
                Pr.lIiqOjI("feepb", 685356697, 936049497, 936049496, 936049499, -515473034, 1464444087, 374707536, (Pr)this);
                if (Pr.lIiqOjI("hbscv", 685356697, 936049523, 936049529, 936049522, -515473034, 1464444087, 374707536, (iQ)iQ2) == Pr.lIiqOjI("yehfqvb", 685356701, 936049525, 936049524, 936049527, -22328643, -542098176, -931216308)) break block6;
                if (Pr.lIiqOjI("rggmu", 685356697, 936049523, 936049529, 936049522, -515473034, 1464444087, 374707536, (iQ)iQ2) != Pr.lIiqOjI("verstc", 685356701, 936049525, 936049526, 936049527, -447239805, -2000386287, 674038396)) break block7;
                if (Pr.lIiqOjI("rggmu", 685356697, 936049523, 936049486, 936049485, -515473034, 1464444087, 374707536, (iQ)iQ2) == Pr.lIiqOjI("hbscv", 685356701, 936049497, 936049529, 936049489, -1412921269, -1604222948, 102150504)[2]) break block6;
            }
            return;
        }
        if (Pr.lIiqOjI("vsqu", 685356697, 936049515, 936049514, 936049481, -515473034, 1464444087, 374707536, (Boolean)((Boolean)((Object)Pr.lIiqOjI("mlsinfch", 685356697, 936049513, 936049474, 936049512, -515473034, 1464444087, 374707536, (lT)((lT)((Object)Pr.lIiqOjI("bsigoque", 685356699, 936049497, 936049501, 936049503, 1984337555, 1392319410, -891761094, (Pr)this)[Pr.lIiqOjI("hbscv", 685356701, 936049497, 936049529, 936049489, -673003503, 1935793744, 1592350410)[3]])))))) != false) {
            Pr.lIiqOjI("orik", 685356697, 936049523, 936049487, 936049499, -515473034, 1464444087, 374707536, (iQ)iQ2);
            return;
        }
        if ((NNNwS)Pr.lIiqOjI("lyqitt", 685356699, 936049517, 936049496, 936049503, -1146540011, -1127566516, 944535792, (NNuU)((NNuU)Pr.lIiqOjI("mlsinfch", 685356699, 936049497, 936049484, 936049503, 821718972, -322283829, 1177316996, (Pr)this)[Pr.lIiqOjI("yehfqvb", 685356701, 936049497, 936049529, 936049489, 506634720, -1270410374, -455203314)[4]]))[Pr.lIiqOjI("rsdgpz", 685356701, 936049497, 936049529, 936049489, -1461460609, 1741425315, -974581437)[5]] != null) {
            if (Pr.lIiqOjI("vtuge", 685356697, 936049497, 936049484, 936049500, -515473034, 1464444087, 374707536, (Pr)this, (int)Pr.lIiqOjI("bsigoque", 685356695, 936049497, 936049487, 936049507, -515473034, 1464444087, 374707536, (NYj)Pr.lIiqOjI("zcbftw", 685356697, 936049523, 936049501, 936049516, -515473034, 1464444087, 374707536, (iQ)iQ2), (Nww)Pr.lIiqOjI("vsqu", 685356697, 936049519, 936049518, 936049505, -515473034, 1464444087, 374707536, (NNNwS)((NNNwS)Pr.lIiqOjI("rggmu", 685356699, 936049517, 936049496, 936049503, -1901027811, 375010416, 1082353142, (NNuU)((NNuU)Pr.lIiqOjI("vsqu", 685356699, 936049497, 936049484, 936049503, 497178761, -654640866, 2026033567, (Pr)this)[Pr.lIiqOjI("feepb", 685356701, 936049497, 936049529, 936049489, 1009000217, 114988329, -727247859)[6]]))[Pr.lIiqOjI("hbscv", 685356701, 936049497, 936049529, 936049489, 461624312, 1871137145, 1541959783)[7]])), (NkG)((NkS)Pr.lIiqOjI("vtuge", 685356699, 936049519, 936049504, 936049503, 577399517, 2130495972, 636706840, (NNNwS)((NNNwS)Pr.lIiqOjI("vsqu", 685356699, 936049517, 936049496, 936049503, -505931235, -138190793, 1829937230, (NNuU)((NNuU)Pr.lIiqOjI("rsdgpz", 685356699, 936049497, 936049484, 936049503, 1461559447, 1745387603, -1782364261, (Pr)this)[Pr.lIiqOjI("vsqu", 685356701, 936049497, 936049502, 936049489, 80160640, 1654552726, 335633775)[0]]))[Pr.lIiqOjI("mlsinfch", 685356701, 936049497, 936049502, 936049489, -924800863, -526905107, 1697928179)[1]]))[Pr.lIiqOjI("vsqu", 685356701, 936049497, 936049502, 936049489, -104254255, -1444369728, -1214166741)[2]]))) != false) {
                Pr.lIiqOjI("hbscv", 685356697, 936049523, 936049487, 936049499, -515473034, 1464444087, 374707536, (iQ)iQ2);
            }
        }
    }

    private static int N(NYj nYj, Nww nww, NkG nkG) {
        block11: {
            block10: {
                block9: {
                    block8: {
                        if (nYj == null) break block8;
                        if (Pr.lIiqOjI("yehfqvb", 685356699, 936049531, 936049501, 936049530, 1265699844, 751182252, -1251114347, (NYj)nYj) == nww) break block9;
                    }
                    return (int)Pr.lIiqOjI("hbscv", 685356701, 936049497, 936049494, 936049475, 1186043407, -1792955148, 727399986)[6];
                }
                CallSite callSite = Pr.lIiqOjI("orik", 685356697, 936049531, 936049486, 936049485, -515473034, 1464444087, 374707536, (NYj)nYj);
                if (Pr.lIiqOjI("yehfqvb", 685356695, 936049498, 936049501, 936049500, -515473034, 1464444087, 374707536, (int)callSite) != false) {
                    return (int)callSite;
                }
                if (nkG == null || Pr.lIiqOjI("rsdgpz", 685356699, 936049531, 936049502, 936049533, -554658987, 2071311674, -1586894360, (NYj)nYj) < 0) break block10;
                if (Pr.lIiqOjI("hbscv", 685356699, 936049531, 936049502, 936049533, -1491353227, -1122232817, 684789483, (NYj)nYj) < Pr.lIiqOjI("zcbftw", 685356697, 936049534, 936049521, 936049485, -515473034, 1464444087, 374707536, (NHe)Pr.lIiqOjI("yehfqvb", 685356699, 936049532, 936049496, 936049535, 306579141, 1330565881, 219346689, (NkG)nkG))) break block11;
            }
            return (int)Pr.lIiqOjI("hbscv", 685356701, 936049497, 936049520, 936049475, 590237044, 1955451995, -1695581519)[0];
        }
        NYj nYj2 = (NYj)Pr.lIiqOjI("zcbftw", 685356697, 936049534, 936049493, 936049492, -515473034, 1464444087, 374707536, (NHe)Pr.lIiqOjI("yehfqvb", 685356699, 936049532, 936049496, 936049535, 753033829, -751373189, -288991981, (NkG)nkG), (int)Pr.lIiqOjI("verstc", 685356699, 936049531, 936049502, 936049533, 1035284335, -1766179593, 367894284, (NYj)nYj));
        if (Pr.lIiqOjI("feepb", 685356699, 936049531, 936049501, 936049530, -779210627, -634977205, 1267452443, (NYj)nYj2) != nww) {
            return (int)Pr.lIiqOjI("zcbftw", 685356701, 936049497, 936049520, 936049475, -1110130666, -354152633, -730482510)[1];
        }
        CallSite callSite = Pr.lIiqOjI("mlsinfch", 685356697, 936049531, 936049486, 936049485, -515473034, 1464444087, 374707536, (NYj)nYj2);
        return (int)(Pr.lIiqOjI("orik", 685356695, 936049498, 936049501, 936049500, -515473034, 1464444087, 374707536, (int)callSite) != false ? callSite : Pr.lIiqOjI("verstc", 685356701, 936049497, 936049520, 936049475, 752522248, -453549447, -792625965)[2]);
    }

    private static /* synthetic */ String W(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-15, 122, -99, -34, 77, 116, -51, -55, -91, -114, 35, 110, -88, -61, 89, 38};
        int n = 0;
        int n2 = 1;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 155;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String R(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{47, -95, -112, -36, -126, 55, 21, -86, 30, 43, -104, 58, 9, 21, 81, -50};
        int n = 0;
        int n2 = 119;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 71;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        IIknIsOjp = "\u00d2\u00c7\u00c3L|\u00e2\u00ce#\\'\u00fdB/\u00c4\u00c2\u00d8\u0096\u0096\u00ce#\\'\u00fdB/\u00e6\u00de<\u00d9\u008d\u00ce#\\'\u00fdB/\u00c4\u00de\u00de\u00a4\u00ce#\\'\u00fdB/\u00c4\u00de\u00e8\u00e2\u00ce#\\'\u00fdB/\u00e3\u00f2\u00cb\u00e5\nJ\u0010\u00d9AV\u00eb\u00d9\u00da\u00bbM\u00c6.b3\u00c2}E\u00e7\u009a\u00e1\u0087\u00a7\u00efh]!\u00cc\u001ft0\u00d5\u0000N\u00fd\u00c2\u0094\u0092\u0086\u0090bl7\u00cf\b\t;\u00d3h;\u00a3\u00fc'\u00e3\u0000J\u0011\u00e7\u00187\u00b3\u0085<\u00c6\u000fG\u0003\u00d9\u0000l\u00eb\u00db\u00c8\u00f1\u009e\u00a0V\u00d6\t\u00ed^\u0011\u00ce#\\'\u00fdB/\u00c4\u00ec\u00c5\u00fc\u0014Y\u00ce#\\'\u00fdB/\u00c4\u00fb\u00e1\u00a9\u009eM\u00a3)L\u0014\u00ceN/\u00ff\u00c1\u00c6\u00b2\u00e2\u0098Me\u0011\u00b1\u0093\u00e3\u00ce#\\'\u00fdB/\u00e6\u00df\u00c7\u00a3)m1\u00feUR\u00cf\u00d8\u0080\u0090\u0094\u00be\u001f\u0014\u00e3\u001fC>\u00c8\u00a2\u00eb\u0013GZ\u00cd[i\u00e6\u009a\u00e3\u00b7\u00be\u00a0\u00f2\u00a3,O\u00a3)m1\u00feUR\u00cf\u00d8\u0080\u0090\u00ba\u00a3\u001f(\u00c3Lj\u001f\u00d9Ya\u00a5\u00d9\u00ce\u00b0\u00aa\u00fbk\u00aaj\u00ef\u0006RNI\u00c6\u000fG\u0003\u00d9\u0000l\u00eb\u00db\u00c8\u00f1\u0082\u00b6Neq\u00fe^\u00e4\u00a3?0\u00eb\u0013GZ\u00d4Nn\u00ed\u009a\u00ed\u00b1\u00a2\u00b8A\u00dc4\u0081\u0003\u00ef\u0011N\u001a\u00dcp3\u00bb\u0080\u009b\u00e6\u0080\u00a3)L\u0014\u00ceN/\u00e6\u00d4\u00c1\u00b9\u00e2\u009bF\u00ea\u00cd\u00e9\u0011\u001d\u00a1\u00ef\u0011.\u00ce#\\'\u00fdB/\u00e3\u00e4\u00ff\u00e0\u00a3)m1\u00feUR\u00cf\u00d8\u0080\u0090\u00a6\u00a5\u001f,\u0091\u00ce#\\'\u00fdB/\u00c4\u00fb\u00da\u008b\u0087\u00ce#\\'\u00fdB/\u00da\u00c7\\\u0087\u00ce#\\'\u00fdB/\u00e6\u00e1\u0001\u00d0\u0096\u00ce\u00e3\u0000J\u0011\u00cbp0\u00bd\u00d3\u00ce\u00ed\u00fe\u00e5\u0015\u00dd\u0098\u00ef\\BF\u00dd\u0016b\u00b2\u008d\u009c\u00ba\u00fd\u00ed\u0016\u008d\u009a\u00b3T\u001f\u0017\u00de\u001aa\u009cr\u00a33m\u00a1i\u00c6.b3\u00c2}E\u00e7\u009a\u00c3\u0087\u00f6\u0098N}7\u00ebJJ\u0014\u00d6H/\u00d9\u00c1\u00dd\u00b7\u00a3\u00b3\u001fG\r\u00c1!`\u000f\u00eajm\u00a5\u00d9\u00d9\u00e5\u00e4\u0098oX\u0007\u00f07c\u0018\u0097Cj\u00b1\u00e5\u00c1!`\u000f\u00eajm\u00a5\u00fb\u00fb\u008d\u00f6\u00fa^\u00c1!`\u000f\u00eajm\u00a5\u00fb\u00e7\u00bb\u00f6f\u00e3\u0000J\u0011\u00e7\u00187\u00b3\u0080\u0096\u00ce#\\'\u00fdB/\u00e6\u00c3\u0091\u00c1!`\u000f\u00eajm\u00a5\u00fb\u00c4\u00af\u00f6\u001b\u0080\u00c6.b3\u00c2}E\u00e7\u009a\u00c3\u0087\u00f6\u0098N\u00e1\u00de\u00ebJJ\u0014\u00d6H/\u00d9\u00c1\u00dd\u00b7\u00a3\u00b3\u001f\u00da\u0081\u00c6.b3\u00c2}E\u00e7\u009a\u00c3\u008a\u00f6%\u00ce#\\'\u00fdB/\u00c4\u00fd\u00ca";
        ooimllik = new int[]{25362442, 10158081, 29622275, 327691, 26869761, 65540, 0x1110013, 37617665, 1769474, 12386314, 11141138, 14417934, 22609923, 16515093, 36110346, 10223617, 19136515, 0x1660001, 26738690, 0x33000A, 15335427, 0x100001, 26017793, 24510465, 8192019, 1, 14286850, 29884417, 29556737, 29818881, 0x11000A, 29950009, 20447233, 37683245, 0x90000B, 0x202000D, 12320769, 2621451, 34603021, 40632331, 14024708, 34537473, 22806538, 23527439, 1900555, 35454986, 36765709, 7536650, 26083338, 21299220, 19333137, 3997708, 24576012, 13041679, 0x9D000D, 20512780, 15532047, 26935336, 4784170};
        Pr.b();
        Pr.m();
        Pr.P();
        Pr.s();
    }

    private static /* synthetic */ String Oljrl(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-85, -50, 2, -52, 3, 118, -59, 109, 68, -15, 99, 103, 3, -71, -22, 113};
        byte[] byArray3 = new byte[]{-67, 71, 79, 11, 25, -120, 68, 74, -57, -113, 41, -128, -41, -54, -111, -34};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite OOnkqlsk0(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = ooimllik[n2 ^ 0x37CAFB59];
        int n8 = n7 >>> 16;
        String string2 = Pr.Oljrl(IIknIsOjp.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0x37CAFB59);
        n7 = ooimllik[n3 ^ 0x37CAFB59];
        int n9 = n7 >>> 16;
        String string3 = Pr.Oljrl(IIknIsOjp.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0x37CAFB59);
        n7 = ooimllik[n4 ^ 0x37CAFB59];
        int n10 = n7 >>> 16;
        String string4 = Pr.Oljrl(IIknIsOjp.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0x37CAFB59);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x28D9B62F) + -178;
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

    private static /* synthetic */ void l1knqO(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[59];
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
        IIknIsOjp = stringBuilder.toString();
        ooimllik = nArray;
    }

    private static /* synthetic */ CallSite lIiqOjI(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = ooimllik[n2 ^ 0x37CAFB59];
        int n9 = n8 >>> 16;
        String string2 = Pr.Oljrl(IIknIsOjp.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x37CAFB59);
        n8 = ooimllik[n3 ^ 0x37CAFB59];
        int n10 = n8 >>> 16;
        String string3 = Pr.Oljrl(IIknIsOjp.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x37CAFB59);
        n8 = ooimllik[n4 ^ 0x37CAFB59];
        int n11 = n8 >>> 16;
        String string4 = Pr.Oljrl(IIknIsOjp.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x37CAFB59);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x28D9B62F) + -178;
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

    private static /* synthetic */ CallSite I1IiOIkrk(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = ooimllik[n2 ^ 0x37CAFB59];
        int n9 = n8 >>> 16;
        String string2 = Pr.Oljrl(IIknIsOjp.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x37CAFB59);
        n8 = ooimllik[n3 ^ 0x37CAFB59];
        int n10 = n8 >>> 16;
        String string3 = Pr.Oljrl(IIknIsOjp.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x37CAFB59);
        n8 = ooimllik[n4 ^ 0x37CAFB59];
        int n11 = n8 >>> 16;
        String string4 = Pr.Oljrl(IIknIsOjp.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x37CAFB59);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x28D9B62F) + -178;
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
