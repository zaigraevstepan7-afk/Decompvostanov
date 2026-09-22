/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NAB
 *  KDFzREm.NAN
 *  KDFzREm.NAR
 *  KDFzREm.NAd
 *  KDFzREm.NCq
 *  KDFzREm.NHS
 *  KDFzREm.NHp
 *  KDFzREm.NNAw
 *  KDFzREm.NNNNRR
 *  KDFzREm.NNNSJ
 *  KDFzREm.NNNZg
 *  KDFzREm.NNNbw
 *  KDFzREm.NNNwS
 *  KDFzREm.NNag
 *  KDFzREm.NNpQ
 *  KDFzREm.NNtL
 *  KDFzREm.NNuU
 *  KDFzREm.NOl
 *  KDFzREm.NPh
 *  KDFzREm.NQo
 *  KDFzREm.NSY
 *  KDFzREm.NXi
 *  KDFzREm.NbK
 *  KDFzREm.NbQ
 *  KDFzREm.Nbw
 *  KDFzREm.NcB
 *  KDFzREm.Ned
 *  KDFzREm.NkL
 *  KDFzREm.Nwn
 *  it.unimi.dsi.fastutil.ints.IntList
 */
package KDFzREm;

import KDFzREm.NAB;
import KDFzREm.NAN;
import KDFzREm.NAR;
import KDFzREm.NAd;
import KDFzREm.NCq;
import KDFzREm.NHS;
import KDFzREm.NHp;
import KDFzREm.NNAw;
import KDFzREm.NNNNRR;
import KDFzREm.NNNSJ;
import KDFzREm.NNNZg;
import KDFzREm.NNNbw;
import KDFzREm.NNNwS;
import KDFzREm.NNag;
import KDFzREm.NNpQ;
import KDFzREm.NNtL;
import KDFzREm.NNuU;
import KDFzREm.NOl;
import KDFzREm.NPh;
import KDFzREm.NQo;
import KDFzREm.NSY;
import KDFzREm.NXi;
import KDFzREm.NbK;
import KDFzREm.NbQ;
import KDFzREm.Nbw;
import KDFzREm.NcB;
import KDFzREm.Ned;
import KDFzREm.NkL;
import KDFzREm.Nwn;
import KDFzREm.Rs;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.Wo;
import KDFzREm.Y;
import KDFzREm.iP;
import KDFzREm.kR;
import KDFzREm.lT;
import KDFzREm.lY;
import KDFzREm.q;
import KDFzREm.uc;
import it.unimi.dsi.fastutil.ints.IntList;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.runtime.SwitchBootstraps;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@UZ(L="PotionTracker", y=UR.MISC, N=Uz.TRACKERS)
public class WJ
extends UM {
    private static short[] u;
    private static double[] i;
    private static boolean[] R;
    private static boolean[] M;
    private static boolean[] B;
    private static String[] Z;
    private static byte[] z;
    private static short[] U;
    public Object[] L;
    private static float[] W;
    private static boolean[] m;
    private static short[] P;
    private static short[] s;
    private static double[] T;
    private static short[] b;
    private static /* synthetic */ String OljtOpOj;
    private static /* synthetic */ int[] Ol0Oip;

    private static /* synthetic */ int L(int n) {
        return Integer.rotateRight(Integer.rotateLeft(Integer.rotateRight((Integer.rotateLeft(n, 19) ^ 0x4CB068AE) + 1, 8), 28), 16);
    }

    private void L(iP iP2) {
        WJ.I1pmO("ppss", 1959484849, -29312719, -29312633, -29312723, 1863650170, 206175490, 17700075, (kR)((Object)WJ.I1pmO("dwciij", 1959484863, -29312705, -29312712, -29312720, 1863650170, 206175490, 17700075)), () -> {
            WJ.I1pmO("jjhs", 1959484849, -29312632, -29312631, -29312630, 1863650170, 206175490, 17700075, (WJ)this);
            WJ.I1pmO("hbcsm", 1959484849, -29312632, -29312629, -29312628, 1863650170, 206175490, 17700075, (WJ)this, (iP)iP2);
            WJ.I1pmO("mynokr", 1959484862, -29312639, -29312638, -29312630, 1863650170, 206175490, 17700075, (List)((List)((Object)WJ.I1pmO("jjhs", 1959484851, -29312632, -29312627, -29312626, -373344130, -2002712589, -1943689232, (WJ)this)[WJ.I1pmO("jjhs", 1959484853, -29312632, -29312625, -29312640, 598176869, -1606302682, -403087854)[1]])));
        });
    }

    private static /* synthetic */ String M(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{17, -117, 126, 0, -125, -128, -91, 125, -19, 118, -94, -18, -21, 2, -86, 72};
        int n = 0;
        int n2 = 252;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 81;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int M(int n) {
        return Integer.rotateRight(-Integer.rotateLeft(Integer.rotateRight(Integer.rotateLeft(Integer.rotateRight(n, 20), 12) ^ 0xC2ADC28F, 18), 9), 19);
    }

    private static void P() {
        i = new double[]{4.0, 2.0, 4.0, 100.0, 16.0, 0.0, 1.0};
        T = new double[]{1.0, 4.0, 0.5};
    }

    private static void T() {
        W = new float[]{100.0f, 0.33333334f, 1.0f, 1.0f};
    }

    public WJ() {
        WJ.I1pmO("iwgpwl", 1959484849, -29312632, -29312631, -29312630, 1959484849, 1959484849, 1959484849, (WJ)this);
        CallSite callSite = WJ.I1pmO("dwciij", 1959484863, -29312716, -29312633, -29312715, 1959484863, 1959484863, 1959484863, (lY)this, (String)((Object)WJ.I1pmO("jjhs", 1959484853, -29312632, -29312712, -29312711, 1959484853, 1959484853, 1959484853)[0]), (boolean)WJ.I1pmO("hbcsm", 1959484853, -29312632, -29312586, -29312596, 1959484853, 1959484853, 1959484853)[0]);
        WJ.I1pmO("zjbb", 1959484851, -29312632, -29312627, -29312626, 1959484851, 1959484851, 1959484851, (WJ)this)[WJ.I1pmO("mynokr", 1959484853, -29312632, -29312613, -29312640, 1959484853, 1959484853, 1959484853)[0]] = callSite;
        CallSite callSite2 = WJ.I1pmO("jjhs", 1959484863, -29312716, -29312633, -29312715, 1959484863, 1959484863, 1959484863, (lY)this, (String)((Object)WJ.I1pmO("ppss", 1959484853, -29312632, -29312712, -29312711, 1959484853, 1959484853, 1959484853)[1]), (boolean)WJ.I1pmO("hbcsm", 1959484853, -29312632, -29312586, -29312596, 1959484853, 1959484853, 1959484853)[1]);
        WJ.I1pmO("zjbb", 1959484851, -29312632, -29312627, -29312626, 1959484851, 1959484851, 1959484851, (WJ)this)[WJ.I1pmO("nmyrwr", 1959484853, -29312632, -29312613, -29312640, 1959484853, 1959484853, 1959484853)[1]] = callSite2;
        CallSite callSite3 = WJ.I1pmO("hbcsm", 1959484863, -29312716, -29312633, -29312715, 1959484863, 1959484863, 1959484863, (lY)this, (String)((Object)WJ.I1pmO("zjbb", 1959484853, -29312632, -29312712, -29312711, 1959484853, 1959484853, 1959484853)[2]), (boolean)WJ.I1pmO("ppss", 1959484853, -29312632, -29312586, -29312596, 1959484853, 1959484853, 1959484853)[2]);
        WJ.I1pmO("iwgpwl", 1959484851, -29312632, -29312627, -29312626, 1959484851, 1959484851, 1959484851, (WJ)this)[WJ.I1pmO("zjbb", 1959484853, -29312632, -29312613, -29312640, 1959484853, 1959484853, 1959484853)[2]] = callSite3;
        ArrayList arrayList = new ArrayList();
        WJ.I1pmO("nmyrwr", 1959484851, -29312632, -29312627, -29312626, 1959484851, 1959484851, 1959484851, (WJ)this)[WJ.I1pmO("nmyrwr", 1959484853, -29312632, -29312613, -29312640, 1959484853, 1959484853, 1959484853)[3]] = arrayList;
        ArrayList arrayList2 = new ArrayList();
        WJ.I1pmO("mynokr", 1959484851, -29312632, -29312627, -29312626, 1959484851, 1959484851, 1959484851, (WJ)this)[WJ.I1pmO("dwciij", 1959484853, -29312632, -29312613, -29312640, 1959484853, 1959484853, 1959484853)[4]] = arrayList2;
        CallSite callSite4 = WJ.I1pmO("nmyrwr", 1959484863, -29312705, -29312627, -29312714, 1959484863, 1959484863, 1959484863);
        WJ.I1pmO("zjbb", 1959484849, -29312713, -29312633, -29312696, 1959484849, 1959484849, 1959484849, (uc)((Object)callSite4), iP.class, this::L);
        WJ.I1pmO("mynokr", 1959484849, -29312713, -29312633, -29312696, 1959484849, 1959484849, 1959484849, (uc)((Object)callSite4), Rs.class, this::N);
        WJ.I1pmO("hehd", 1959484849, -29312719, -29312633, -29312695, 1959484849, 1959484849, 1959484849, (kR)((Object)WJ.I1pmO("jjhs", 1959484863, -29312705, -29312712, -29312720, 1959484863, 1959484863, 1959484863)), nNuU -> {
            CallSite callSite;
            if ((NNNZg)WJ.I1pmO("jjhs", 1959484851, -29312636, -29312635, -29312626, 1959484851, 1959484851, 1959484851, (NNuU)nNuU)[WJ.I1pmO("iwgpwl", 1959484853, -29312632, -29312625, -29312640, 1959484853, 1959484853, 1959484853)[6]] != null) {
                if (WJ.I1pmO("dwciij", 1959484849, -29312606, -29312605, -29312598, 1863650170, 206175490, 17700075, (Boolean)((Boolean)((Object)WJ.I1pmO("zjbb", 1959484849, -29312767, -29312727, -29312619, 1863650170, 206175490, 17700075, (Optional)((Object)WJ.I1pmO("ppss", 1959484849, -29312767, -29312623, -29312728, 1863650170, 206175490, 17700075, (Optional)((Object)WJ.I1pmO("jjhs", 1959484862, -29312747, -29312746, -29312745, 1863650170, 206175490, 17700075, (NNAw)WJ.I1pmO("iwgpwl", 1959484849, -29312634, -29312752, -29312751, 1863650170, 206175490, 17700075, (NNNZg)((NNNZg)WJ.I1pmO("mynokr", 1959484851, -29312636, -29312635, -29312626, -63954169, 176922117, -1498464475, (NNuU)nNuU)[WJ.I1pmO("jjhs", 1959484853, -29312632, -29312625, -29312640, -1774902528, 927196238, 1424563571)[7]])), (NNpQ)WJ.I1pmO("ppss", 1959484853, -29312750, -29312749, -29312748, 25079499, -1044380205, 794440930))), nHp -> WJ.I1pmO("zjbb", 1959484863, -29312606, -29312738, -29312737, 1863650170, 206175490, 17700075, (boolean)WJ.I1pmO("hbcsm", 1959484849, -29312740, -29312739, -29312573, 1863650170, 206175490, 17700075, (Object)WJ.I1pmO("zjbb", 1959484862, -29312744, -29312530, -29312743, 1863650170, 206175490, 17700075, (NHp)nHp), (Object)WJ.I1pmO("hbcsm", 1959484863, -29312742, -29312741, -29312743, 1863650170, 206175490, 17700075))))), (Object)WJ.I1pmO("zjbb", 1959484863, -29312606, -29312738, -29312737, 1863650170, 206175490, 17700075, (boolean)WJ.I1pmO("ppss", 1959484853, -29312632, -29312597, -29312596, -1708222587, 275143661, 2054240748)[6]))))) != false) {
                    callSite = WJ.I1pmO("zjbb", 1959484853, -29312632, -29312597, -29312596, 569327530, 1165689987, -1029591656)[7];
                    return (boolean)callSite;
                }
            }
            callSite = WJ.I1pmO("nmyrwr", 1959484853, -29312632, -29312530, -29312596, 1959484853, 1959484853, 1959484853)[0];
            return (boolean)callSite;
        }, this::m);
    }

    static {
        WJ.ntfClinit();
    }

    private static /* synthetic */ int i(int n) {
        return -Integer.rotateLeft(-Integer.rotateLeft(Integer.rotateRight(-n, 14) ^ 0x9059E822, 1), 6);
    }

    private static /* synthetic */ String i(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-57, -76, -86, -53, 57, 15, -42, 48, 86, -33, -66, -25, 16, 55, 2, -7};
        int n = 0;
        int n2 = 131;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 241;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void b() {
        Z = new String[]{"ignore-self", "ignore-common-splash-potions", "ft-bypass", " ", "\n\u25cf "};
    }

    private static void s() {
        M = new boolean[]{true, true, true, false, true};
        m = new boolean[]{false, true, false, true};
        B = new boolean[]{true, false, false, false, true, false, false, true};
        R = new boolean[]{false};
    }

    private static void n() {
        P = new short[]{0, 1, 2, 3, 4, 3, 3, 0};
        U = new short[]{2, 0, 2, 4};
        u = new short[]{3, 255, 1, 0, 3, 0, 3, 0};
        b = new short[]{4, 0, 0};
        s = new short[]{4, 4, 2002, 4, 0, 3, 3, 3};
    }

    private void m() {
        WJ.I1pmO("dwciij", 1959484849, -29312632, -29312631, -29312630, 1863650170, 206175490, 17700075, (WJ)this);
        CallSite callSite = WJ.I1pmO("dwciij", 1959484862, -29312624, -29312623, -29312622, 1863650170, 206175490, 17700075, (Stream)((Object)WJ.I1pmO("ppss", 1959484862, -29312639, -29312610, -29312609, 1863650170, 206175490, 17700075, (List)((Object)WJ.I1pmO("ppss", 1959484863, -29312612, -29312633, -29312611, 1863650170, 206175490, 17700075, (Y)((Y)((Object)WJ.I1pmO("hehd", 1959484853, -29312615, -29312614, -29312626, 1120983653, -793003100, 2112242490)[WJ.I1pmO("jjhs", 1959484853, -29312632, -29312613, -29312640, -1325215847, 522868856, 153017779)[5]])))))), q::N);
        List list = (List)((Object)WJ.I1pmO("zjbb", 1959484851, -29312632, -29312627, -29312626, -1835577364, 770938253, 1737898774, (WJ)this)[WJ.I1pmO("zjbb", 1959484853, -29312632, -29312613, -29312640, 1614260947, 1019717568, -445095510)[6]]);
        WJ.I1pmO("zjbb", 1959484863, -29312621, -29312620, -29312619, 1863650170, 206175490, 17700075, (Object)list);
        WJ.I1pmO("hehd", 1959484862, -29312624, -29312618, -29312617, 1863650170, 206175490, 17700075, (Stream)((Object)callSite), list::add);
    }

    private void v() {
        if (WJ.I1pmO("dwciij", 1959484851, -29312632, -29312627, -29312626, 1959484851, 1959484851, 1959484851, (WJ)this) == null) {
            WJ.I1pmO("hbcsm", 1959484850, -29312632, -29312627, -29312626, 1959484850, 1959484850, 1959484850, (WJ)this, (Object[])new Object[WJ.I1pmO("iwgpwl", 1959484853, -29312632, -29312561, -29312576, 1959484853, 1959484853, 1959484853)[4]]);
            CallSite callSite = WJ.I1pmO("mynokr", 1959484851, -29312632, -29312627, -29312626, 1959484851, 1959484851, 1959484851, (WJ)this);
        }
    }

    private static void j() {
        z = new byte[]{10, 20, 100, 9, 5};
    }

    private static /* synthetic */ int u(int n) {
        return Integer.rotateLeft(Integer.rotateRight((-Integer.rotateLeft(n, 12) ^ 0xE18F786C) + 1, 23), 18) ^ 0x582D459E;
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{20, 50, 52, -102, 112, 67, -116, -124, -32, 83, -11, -13, -71, 26, -64, 66};
        int n = 0;
        int n2 = 158;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 13;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private void y(iP iP2) {
        WJ.I1pmO("iwgpwl", 1959484849, -29312632, -29312631, -29312630, 1863650170, 206175490, 17700075, (WJ)this);
        CallSite callSite = WJ.I1pmO("jjhs", 1959484849, -29312517, -29312633, -29312516, 1863650170, 206175490, 17700075, (iP)iP2);
        CallSite callSite2 = WJ.I1pmO("mynokr", 1959484849, -29312515, -29312633, -29312514, 1863650170, 206175490, 17700075, (NcB)callSite) == WJ.I1pmO("jjhs", 1959484853, -29312513, -29312528, -29312527, -460228132, -1377064085, -2085405861) ? WJ.I1pmO("hehd", 1959484849, -29312526, -29312627, -29312525, 1863650170, 206175490, 17700075, (NNtL)((NNtL)callSite)) : null;
        CallSite callSite3 = WJ.I1pmO("dwciij", 1959484849, -29312517, -29312629, -29312524, 1863650170, 206175490, 17700075, (iP)iP2);
        CallSite callSite4 = WJ.I1pmO("iwgpwl", 1959484849, -29312632, -29312633, -29312759, 1863650170, 206175490, 17700075, (WJ)this, (NHS)WJ.I1pmO("ppss", 1959484849, -29312521, -29312627, -29312760, 1863650170, 206175490, 17700075, (NHS)WJ.I1pmO("mynokr", 1959484849, -29312545, -29312523, -29312522, 1863650170, 206175490, 17700075, (NkL)callSite3), (double)WJ.I1pmO("mynokr", 1959484853, -29312632, -29312608, -29312571, -1896169616, 1185775576, -1632310639)[0], (double)WJ.I1pmO("ppss", 1959484853, -29312632, -29312608, -29312571, -800621701, -288940984, -1031537565)[1], (double)WJ.I1pmO("iwgpwl", 1959484853, -29312632, -29312608, -29312571, -923721618, -1446475591, 1366178544)[2]));
        if (WJ.I1pmO("nmyrwr", 1959484862, -29312639, -29312572, -29312598, 1863650170, 206175490, 17700075, (List)((Object)callSite4)) != false) {
            return;
        }
        if (WJ.I1pmO("iwgpwl", 1959484849, -29312606, -29312605, -29312598, 1863650170, 206175490, 17700075, (Boolean)((Boolean)((Object)WJ.I1pmO("dwciij", 1959484849, -29312593, -29312608, -29312607, 1863650170, 206175490, 17700075, (lT)((lT)((Object)WJ.I1pmO("hehd", 1959484851, -29312632, -29312627, -29312626, -1094172875, 1159424200, 1244960937, (WJ)this)[WJ.I1pmO("dwciij", 1959484853, -29312632, -29312595, -29312640, -1501703434, -925308473, -1494664731)[2]])))))) != false && WJ.I1pmO("nmyrwr", 1959484863, -29312758, -29312608, -29312598, 1863650170, 206175490, 17700075) != false) {
            CallSite callSite5 = WJ.I1pmO("hehd", 1959484862, -29312639, -29312579, -29312578, 1863650170, 206175490, 17700075, (List)((List)((Object)WJ.I1pmO("iwgpwl", 1959484851, -29312632, -29312627, -29312626, -1784943380, 1789053977, 1254938947, (WJ)this)[WJ.I1pmO("ppss", 1959484853, -29312632, -29312595, -29312640, -240566636, 1895018468, -1914596227)[3]])));
            block0: while (WJ.I1pmO("ppss", 1959484862, -29312577, -29312592, -29312598, 1863650170, 206175490, 17700075, (Iterator)((Object)callSite5)) != false) {
                Wo wo = (Wo)((Object)WJ.I1pmO("iwgpwl", 1959484862, -29312577, -29312591, -29312607, 1863650170, 206175490, 17700075, (Iterator)((Object)callSite5)));
                CallSite callSite6 = WJ.I1pmO("dwciij", 1959484862, -29312639, -29312579, -29312578, 1863650170, 206175490, 17700075, (List)((List)((Object)WJ.I1pmO("ppss", 1959484851, -29312632, -29312627, -29312626, -878457112, 643732468, -101660015, (WJ)this)[WJ.I1pmO("nmyrwr", 1959484853, -29312632, -29312637, -29312640, -428494289, -1895916176, 92498000)[0]])));
                while (WJ.I1pmO("mynokr", 1959484862, -29312577, -29312592, -29312598, 1863650170, 206175490, 17700075, (Iterator)((Object)callSite6)) != false) {
                    NQo nQo = (NQo)WJ.I1pmO("nmyrwr", 1959484862, -29312577, -29312591, -29312607, 1863650170, 206175490, 17700075, (Iterator)((Object)callSite6));
                    NOl nOl = (NOl)WJ.I1pmO("ppss", 1959484849, -29312583, -29312582, -29312581, 1863650170, 206175490, 17700075, (NQo)nQo, (NNNNRR)WJ.I1pmO("iwgpwl", 1959484853, -29312604, -29312603, -29312602, -1177786854, 718536318, -1250153744), (Object)WJ.I1pmO("dwciij", 1959484853, -29312601, -29312633, -29312584, -598561626, 1378489079, -1488963566));
                    CallSite callSite7 = WJ.I1pmO("nmyrwr", 1959484863, -29312755, -29312629, -29312753, 1863650170, 206175490, 17700075, (int)WJ.I1pmO("mynokr", 1959484863, -29312755, -29312637, -29312754, 1863650170, 206175490, 17700075, (int)WJ.I1pmO("hbcsm", 1959484851, -29312757, -29312633, -29312756, -846672014, -1610395954, 109487956, (Wo)wo)), (int)WJ.I1pmO("dwciij", 1959484863, -29312755, -29312633, -29312754, 1863650170, 206175490, 17700075, (int)WJ.I1pmO("iwgpwl", 1959484851, -29312757, -29312633, -29312756, -83496208, -1896927518, -1317079706, (Wo)wo)), (int)WJ.I1pmO("ppss", 1959484863, -29312755, -29312608, -29312754, 1863650170, 206175490, 17700075, (int)WJ.I1pmO("mynokr", 1959484851, -29312757, -29312633, -29312756, 1786971617, -962830420, -105877258, (Wo)wo)), (int)WJ.I1pmO("ppss", 1959484853, -29312632, -29312637, -29312640, 1166236119, 1645477954, 219167125)[1]);
                    if (WJ.I1pmO("ppss", 1959484849, -29312767, -29312572, -29312598, 1863650170, 206175490, 17700075, (Optional)((Object)WJ.I1pmO("nmyrwr", 1959484849, -29312601, -29312530, -29312768, 1863650170, 206175490, 17700075, (NOl)nOl))) != false) continue;
                    if (WJ.I1pmO("mynokr", 1959484863, -29312755, -29312633, -29312763, 1863650170, 206175490, 17700075, (int)WJ.I1pmO("zjbb", 1959484849, -29312765, -29312764, -29312554, 1863650170, 206175490, 17700075, (Integer)((Object)WJ.I1pmO("ppss", 1959484849, -29312767, -29312766, -29312607, 1863650170, 206175490, 17700075, (Optional)((Object)WJ.I1pmO("mynokr", 1959484849, -29312601, -29312530, -29312768, 1863650170, 206175490, 17700075, (NOl)nOl))))), (int)callSite7, (int)WJ.I1pmO("mynokr", 1959484853, -29312632, -29312561, -29312576, -1280088076, 1641030110, -392929161)[0]) == false) continue;
                    WJ.I1pmO("hbcsm", 1959484849, -29312632, -29312633, -29312762, 1863650170, 206175490, 17700075, (WJ)this, (List)((Object)callSite4), (NXi)WJ.I1pmO("jjhs", 1959484849, -29312515, -29312629, -29312588, 1863650170, 206175490, 17700075, (NcB)callSite), (NbK)callSite2, (boolean)WJ.I1pmO("mynokr", 1959484853, -29312632, -29312586, -29312596, 992093425, -917843950, 37674136)[4], (NQo)nQo);
                    continue block0;
                }
            }
            return;
        }
        WJ.I1pmO("nmyrwr", 1959484849, -29312632, -29312633, -29312762, 1863650170, 206175490, 17700075, (WJ)this, (List)((Object)callSite4), (NXi)WJ.I1pmO("zjbb", 1959484849, -29312545, -29312589, -29312588, 1863650170, 206175490, 17700075, (NkL)callSite3), (NbK)callSite2, (boolean)WJ.I1pmO("ppss", 1959484853, -29312632, -29312551, -29312596, 1823317806, 1583063115, 392221044)[0], (NQo)WJ.I1pmO("ppss", 1959484849, -29312545, -29312627, -29312761, 1863650170, 206175490, 17700075, (NkL)callSite3));
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-109, 70, 11, 11, 97, -47, 87, -110, 92, -5, 2, -74, -88, -30, 114, -71};
        int n = 0;
        int n2 = 76;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 37;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private void N(List<Nwn> list, NXi nXi, NbK nbK, boolean bl, NQo nQo) {
        WJ.I1pmO("ppss", 1959484849, -29312632, -29312631, -29312630, 1863650170, 206175490, 17700075, (WJ)this);
        NOl nOl = (NOl)WJ.I1pmO("mynokr", 1959484849, -29312583, -29312582, -29312581, 1863650170, 206175490, 17700075, (NQo)nQo, (NNNNRR)WJ.I1pmO("hehd", 1959484853, -29312604, -29312603, -29312602, 1043533867, -415190551, 1038068027), (Object)WJ.I1pmO("hbcsm", 1959484853, -29312601, -29312633, -29312584, -1196859759, 850191060, -2107878706));
        CallSite callSite = WJ.I1pmO("nmyrwr", 1959484849, -29312601, -29312633, -29312580, 1863650170, 206175490, 17700075, (NOl)nOl);
        CallSite callSite2 = WJ.I1pmO("dwciij", 1959484862, -29312639, -29312579, -29312578, 1863650170, 206175490, 17700075, list);
        while (WJ.I1pmO("hbcsm", 1959484862, -29312577, -29312592, -29312598, 1863650170, 206175490, 17700075, (Iterator)((Object)callSite2)) != false) {
            Nwn nwn = (Nwn)WJ.I1pmO("nmyrwr", 1959484862, -29312577, -29312591, -29312607, 1863650170, 206175490, 17700075, (Iterator)((Object)callSite2));
            if (WJ.I1pmO("jjhs", 1959484849, -29312632, -29312633, -29312590, 1863650170, 206175490, 17700075, (WJ)this, (Nwn)nwn) == false) continue;
            CallSite callSite3 = WJ.I1pmO("jjhs", 1959484849, -29312632, -29312633, -29312568, 1863650170, 206175490, 17700075, (WJ)this, (double)WJ.I1pmO("jjhs", 1959484849, -29312587, -29312586, -29312585, 1863650170, 206175490, 17700075, (NXi)nXi, (NXi)WJ.I1pmO("jjhs", 1959484849, -29312600, -29312589, -29312588, 1863650170, 206175490, 17700075, (Nwn)nwn)), (Nwn)nwn, (NbK)nbK);
            ArrayList arrayList = new ArrayList();
            CallSite callSite4 = WJ.I1pmO("dwciij", 1959484862, -29312567, -29312579, -29312578, 1863650170, 206175490, 17700075, (Iterable)((Object)callSite));
            while (WJ.I1pmO("nmyrwr", 1959484862, -29312577, -29312592, -29312598, 1863650170, 206175490, 17700075, (Iterator)((Object)callSite4)) != false) {
                NbQ nbQ = (NbQ)WJ.I1pmO("mynokr", 1959484862, -29312577, -29312591, -29312607, 1863650170, 206175490, 17700075, (Iterator)((Object)callSite4));
                if (WJ.I1pmO("mynokr", 1959484849, -29312563, -29312633, -29312598, 1863650170, 206175490, 17700075, (Nbw)((Nbw)WJ.I1pmO("mynokr", 1959484862, -29312564, -29312633, -29312607, 1863650170, 206175490, 17700075, (NNNbw)WJ.I1pmO("jjhs", 1959484849, -29312566, -29312627, -29312565, 1863650170, 206175490, 17700075, (NbQ)nbQ)))) != false) continue;
                CallSite callSite5 = WJ.I1pmO("jjhs", 1959484849, -29312566, -29312633, -29312562, 1863650170, 206175490, 17700075, (NbQ)nbQ, arg_0 -> WJ.N((double)callSite3, arg_0));
                if (callSite5 <= WJ.I1pmO("jjhs", 1959484853, -29312632, -29312561, -29312576, 1893745380, 1772517017, 1356627429)[1]) continue;
                WJ.I1pmO("jjhs", 1959484862, -29312639, -29312574, -29312573, 1863650170, 206175490, 17700075, arrayList, (Object)WJ.I1pmO("dwciij", 1959484849, -29312632, -29312633, -29312575, 1863650170, 206175490, 17700075, (WJ)this, (NbQ)nbQ, (int)callSite5));
            }
            if (WJ.I1pmO("ppss", 1959484862, -29312639, -29312572, -29312598, 1863650170, 206175490, 17700075, arrayList) != false || WJ.I1pmO("mynokr", 1959484849, -29312632, -29312595, -29312598, 1863650170, 206175490, 17700075, (WJ)this) == false) continue;
            if (WJ.I1pmO("hbcsm", 1959484849, -29312606, -29312605, -29312598, 1863650170, 206175490, 17700075, (Boolean)((Boolean)((Object)WJ.I1pmO("zjbb", 1959484849, -29312593, -29312608, -29312607, 1863650170, 206175490, 17700075, (lT)((lT)((Object)WJ.I1pmO("jjhs", 1959484851, -29312632, -29312627, -29312626, 1331656166, -1543423503, -1097434060, (WJ)this)[WJ.I1pmO("hehd", 1959484853, -29312632, -29312637, -29312640, -1903277095, 1271296023, -180421097)[2]])))))) != false) {
                if (!bl) continue;
            }
            CallSite callSite6 = WJ.I1pmO("dwciij", 1959484863, -29312570, -29312550, -29312549, 1863650170, 206175490, 17700075, (long)WJ.I1pmO("nmyrwr", 1959484863, -29312570, -29312569, -29312552, 1863650170, 206175490, 17700075, (double)(callSite3 * WJ.I1pmO("zjbb", 1959484853, -29312632, -29312608, -29312571, 1996977061, 565495778, 659148476)[3])), (int)WJ.I1pmO("nmyrwr", 1959484853, -29312632, -29312551, -29312596, -435552264, 1222352509, 61904373)[1], (int)WJ.I1pmO("mynokr", 1959484853, -29312632, -29312561, -29312576, -1584121289, 1026288130, 1729215120)[2]);
            WJ.I1pmO("iwgpwl", 1959484849, -29312632, -29312633, -29312548, 1863650170, 206175490, 17700075, (WJ)this, (Nwn)nwn, (NQo)nQo, arrayList, (int)callSite6);
        }
    }

    private void N(Nwn nwn, NQo nQo, List<NAN> list, int n) {
        CallSite callSite = WJ.I1pmO("zjbb", 1959484863, -29312736, -29312586, -29312735, 1863650170, 206175490, 17700075, (float)((float)n / WJ.I1pmO("hehd", 1959484853, -29312632, -29312722, -29312721, 75437159, -100349387, -949144579)[0] * WJ.I1pmO("dwciij", 1959484853, -29312632, -29312722, -29312721, -1484695819, -231086830, 1878247604)[1]), (float)WJ.I1pmO("nmyrwr", 1959484853, -29312632, -29312722, -29312721, -66212569, -1391797062, -1301701819)[2], (float)WJ.I1pmO("iwgpwl", 1959484853, -29312632, -29312722, -29312721, -160933232, -910530687, -28997358)[3]);
        CallSite callSite2 = WJ.I1pmO("iwgpwl", 1959484849, -29312537, -29312627, -29312731, 1863650170, 206175490, 17700075, (NNag)WJ.I1pmO("nmyrwr", 1959484863, -29312542, -29312629, -29312541, 1863650170, 206175490, 17700075, (String)(" " + n + "%")), (NAd)WJ.I1pmO("iwgpwl", 1959484849, -29312734, -29312633, -29312732, 1863650170, 206175490, 17700075, (NAd)WJ.I1pmO("mynokr", 1959484853, -29312734, -29312633, -29312733, -118488251, 998079050, 24425136), (int)callSite));
        CallSite callSite3 = WJ.I1pmO("jjhs", 1959484849, -29312537, -29312627, -29312731, 1863650170, 206175490, 17700075, (NNag)WJ.I1pmO("nmyrwr", 1959484849, -29312537, -29312629, -29312518, 1863650170, 206175490, 17700075, (NNag)WJ.I1pmO("iwgpwl", 1959484849, -29312537, -29312629, -29312518, 1863650170, 206175490, 17700075, (NNag)WJ.I1pmO("mynokr", 1959484849, -29312537, -29312608, -29312541, 1863650170, 206175490, 17700075, (NNag)WJ.I1pmO("iwgpwl", 1959484862, -29312542, -29312627, -29312519, 1863650170, 206175490, 17700075, (NAN)WJ.I1pmO("jjhs", 1959484849, -29312600, -29312730, -29312729, 1863650170, 206175490, 17700075, (Nwn)nwn)), (String)((Object)WJ.I1pmO("hbcsm", 1959484853, -29312632, -29312712, -29312711, -1560499791, -778646407, -1038039278)[3])), (NAN)WJ.I1pmO("hbcsm", 1959484849, -29312583, -29312710, -29312729, 1863650170, 206175490, 17700075, (NQo)nQo)), (NAN)callSite2), (NAd)WJ.I1pmO("ppss", 1959484849, -29312734, -29312633, -29312709, 1863650170, 206175490, 17700075, (NAd)WJ.I1pmO("jjhs", 1959484853, -29312734, -29312633, -29312733, 470249812, -1203590973, -879723350), (NAR)new NAB(nQo)));
        CallSite callSite4 = WJ.I1pmO("jjhs", 1959484862, -29312639, -29312579, -29312578, 1863650170, 206175490, 17700075, list);
        while (WJ.I1pmO("mynokr", 1959484862, -29312577, -29312592, -29312598, 1863650170, 206175490, 17700075, (Iterator)((Object)callSite4)) != false) {
            NAN nAN = (NAN)WJ.I1pmO("hehd", 1959484862, -29312577, -29312591, -29312607, 1863650170, 206175490, 17700075, (Iterator)((Object)callSite4));
            WJ.I1pmO("jjhs", 1959484849, -29312537, -29312629, -29312518, 1863650170, 206175490, 17700075, (NNag)WJ.I1pmO("ppss", 1959484849, -29312537, -29312608, -29312541, 1863650170, 206175490, 17700075, (NNag)callSite3, (String)((Object)WJ.I1pmO("nmyrwr", 1959484853, -29312632, -29312712, -29312711, -826297658, 688400413, 1453661077)[4])), (NAN)nAN);
        }
        WJ.I1pmO("hbcsm", 1959484863, -29312707, -29312629, -29312706, 1863650170, 206175490, 17700075, (Object)WJ.I1pmO("iwgpwl", 1959484849, -29312537, -29312633, -29312520, 1863650170, 206175490, 17700075, (NNag)callSite3, (NPh)WJ.I1pmO("nmyrwr", 1959484853, -29312540, -29312708, -29312538, -2123910170, 1227149256, 5585058)));
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateLeft(-Integer.rotateLeft(n, 1) ^ 0xF3F0C3C4, 15) ^ 0xA791EF84;
    }

    private double N(double d, Nwn nwn, NbK nbK) {
        if (d >= WJ.I1pmO("hbcsm", 1959484853, -29312632, -29312608, -29312571, -1722605629, -208023106, -819170599)[4]) {
            return (double)WJ.I1pmO("hbcsm", 1959484853, -29312632, -29312608, -29312571, -769617997, -1809240377, 1918739372)[5];
        }
        return (double)(nwn == nbK ? WJ.I1pmO("ppss", 1959484853, -29312632, -29312608, -29312571, 1562131197, 887855762, -35123913)[6] : WJ.I1pmO("nmyrwr", 1959484853, -29312632, -29312635, -29312571, -764117974, 1587152860, -1927959260)[0] - WJ.I1pmO("zjbb", 1959484863, -29312570, -29312718, -29312717, 1863650170, 206175490, 17700075, (double)d) / WJ.I1pmO("iwgpwl", 1959484853, -29312632, -29312635, -29312571, 653977681, -438088367, -665654047)[1]);
    }

    private List<Nwn> N(NHS nHS) {
        return WJ.I1pmO("ppss", 1959484849, -29312634, -29312633, -29312616, 1863650170, 206175490, 17700075, (NNNZg)((NNNZg)WJ.I1pmO("hehd", 1959484851, -29312636, -29312635, -29312626, 684676534, 548548809, -1704778792, (NNuU)((NNuU)WJ.I1pmO("mynokr", 1959484851, -29312632, -29312629, -29312626, -1382048730, -1222267594, 1843415629, (WJ)this)[WJ.I1pmO("nmyrwr", 1959484853, -29312632, -29312637, -29312640, 1035265719, -6016813, 554549150)[3]]))[WJ.I1pmO("mynokr", 1959484853, -29312632, -29312637, -29312640, 1834109001, 1834506625, -778205674)[4]]), Nwn.class, (NHS)nHS);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean N(Nwn nwn) {
        CallSite callSite;
        WJ.I1pmO("mynokr", 1959484849, -29312632, -29312631, -29312630, 1863650170, 206175490, 17700075, (WJ)this);
        if (WJ.I1pmO("dwciij", 1959484849, -29312600, -29312599, -29312598, 1863650170, 206175490, 17700075, (Nwn)nwn) == false) {
            return (boolean)WJ.I1pmO("nmyrwr", 1959484853, -29312632, -29312597, -29312596, -1910335599, 1622307997, -1652580596)[2];
        }
        CallSite callSite2 = WJ.I1pmO("nmyrwr", 1959484849, -29312632, -29312595, -29312598, 1863650170, 206175490, 17700075, (WJ)this);
        if (callSite2 == false) {
            if (nwn == (NNNwS)WJ.I1pmO("hehd", 1959484851, -29312636, -29312635, -29312626, -1118230697, -723055639, -681239566, (NNuU)((NNuU)WJ.I1pmO("iwgpwl", 1959484851, -29312632, -29312629, -29312626, -886856970, 1023110905, -493780857, (WJ)this)[WJ.I1pmO("mynokr", 1959484853, -29312632, -29312637, -29312640, -212035686, 952208734, -1827403077)[7]]))[WJ.I1pmO("hehd", 1959484853, -29312632, -29312594, -29312640, 646637169, -537824663, 1933361585)[0]]) {
                return (boolean)WJ.I1pmO("nmyrwr", 1959484853, -29312632, -29312597, -29312596, -1797644546, 553588881, 605396783)[3];
            }
        }
        if (callSite2 != false) {
            if (WJ.I1pmO("iwgpwl", 1959484849, -29312606, -29312605, -29312598, 1863650170, 206175490, 17700075, (Boolean)((Boolean)((Object)WJ.I1pmO("iwgpwl", 1959484849, -29312593, -29312608, -29312607, 1863650170, 206175490, 17700075, (lT)((lT)((Object)WJ.I1pmO("hbcsm", 1959484851, -29312632, -29312627, -29312626, -745580432, 729077754, 1673613571, (WJ)this)[WJ.I1pmO("mynokr", 1959484853, -29312632, -29312594, -29312640, -1584053133, 1464228462, 875747357)[1]])))))) != false) {
                if (nwn == (NNNwS)WJ.I1pmO("hbcsm", 1959484851, -29312636, -29312635, -29312626, 479819926, -707689978, 1980775434, (NNuU)((NNuU)WJ.I1pmO("dwciij", 1959484851, -29312632, -29312629, -29312626, -1819262982, 659212900, -1457193070, (WJ)this)[WJ.I1pmO("nmyrwr", 1959484853, -29312632, -29312594, -29312640, 2063332371, 1777166509, 2051813888)[2]]))[WJ.I1pmO("mynokr", 1959484853, -29312632, -29312625, -29312640, 760773208, -1909198767, 988467856)[0]]) {
                    callSite = WJ.I1pmO("hbcsm", 1959484853, -29312632, -29312597, -29312596, -1828317528, 827592182, -104540858)[5];
                    return (boolean)callSite;
                }
            }
        }
        callSite = WJ.I1pmO("dwciij", 1959484853, -29312632, -29312597, -29312596, 1347185161, 757198156, 350195679)[4];
        return (boolean)callSite;
    }

    private NAN N(NbQ nbQ, int n) {
        CallSite callSite = WJ.I1pmO("dwciij", 1959484863, -29312535, -29312633, -29312534, 1863650170, 206175490, 17700075, (String)((Object)WJ.I1pmO("hehd", 1959484849, -29312566, -29312561, -29312536, 1863650170, 206175490, 17700075, (NbQ)nbQ)), (Object[])new Object[WJ.I1pmO("jjhs", 1959484853, -29312632, -29312551, -29312596, -938070016, 1061538936, 1557433176)[2]]);
        if (WJ.I1pmO("nmyrwr", 1959484849, -29312566, -29312608, -29312554, 1863650170, 206175490, 17700075, (NbQ)nbQ) >= WJ.I1pmO("dwciij", 1959484853, -29312632, -29312551, -29312596, 758146162, -999388577, -46958406)[3]) {
            if (WJ.I1pmO("ppss", 1959484849, -29312566, -29312608, -29312554, 1863650170, 206175490, 17700075, (NbQ)nbQ) <= WJ.I1pmO("mynokr", 1959484853, -29312632, -29312561, -29312576, -821457123, 621243652, -294379331)[3]) {
                callSite = (String)((Object)callSite) + " " + (String)((Object)WJ.I1pmO("hehd", 1959484863, -29312535, -29312633, -29312534, 1863650170, 206175490, 17700075, (String)("enchantment.level." + (int)(WJ.I1pmO("mynokr", 1959484849, -29312566, -29312608, -29312554, 1863650170, 206175490, 17700075, (NbQ)nbQ) + WJ.I1pmO("mynokr", 1959484853, -29312632, -29312597, -29312596, 1466847906, -1232843829, 1308104856)[0])), (Object[])new Object[WJ.I1pmO("dwciij", 1959484853, -29312632, -29312597, -29312596, -2073105774, -1526856786, -16378468)[1]]));
            }
        }
        CallSite callSite2 = WJ.I1pmO("iwgpwl", 1959484863, -29312544, -29312633, -29312543, 1863650170, 206175490, 17700075, n, (float)WJ.I1pmO("mynokr", 1959484849, -29312531, -29312530, -29312529, 1863650170, 206175490, 17700075, (NNNSJ)WJ.I1pmO("ppss", 1959484849, -29312634, -29312533, -29312532, 1863650170, 206175490, 17700075, (NNNZg)((NNNZg)WJ.I1pmO("jjhs", 1959484851, -29312636, -29312635, -29312626, 756052320, -1551212665, 899402487, (NNuU)((NNuU)WJ.I1pmO("hbcsm", 1959484851, -29312632, -29312629, -29312626, -1301000279, 1937730024, 179850759, (WJ)this)[WJ.I1pmO("nmyrwr", 1959484853, -29312632, -29312637, -29312640, -685251902, 1250586675, -1025313382)[5]]))[WJ.I1pmO("nmyrwr", 1959484853, -29312632, -29312637, -29312640, -1653392081, -149441701, 1979776750)[6]]))));
        CallSite callSite3 = WJ.I1pmO("mynokr", 1959484849, -29312537, -29312633, -29312520, 1863650170, 206175490, 17700075, (NNag)WJ.I1pmO("mynokr", 1959484863, -29312542, -29312629, -29312541, 1863650170, 206175490, 17700075, (String)((Object)callSite)), (NPh)WJ.I1pmO("jjhs", 1959484853, -29312540, -29312539, -29312538, 1358657676, -962835045, 784600158));
        return WJ.I1pmO("dwciij", 1959484849, -29312537, -29312608, -29312541, 1863650170, 206175490, 17700075, (NNag)WJ.I1pmO("iwgpwl", 1959484849, -29312537, -29312629, -29312518, 1863650170, 206175490, 17700075, (NNag)WJ.I1pmO("dwciij", 1959484863, -29312542, -29312608, -29312519, 1863650170, 206175490, 17700075), (NAN)callSite3), (String)(" " + (String)((Object)callSite2)));
    }

    private static /* synthetic */ int N(double d, int n) {
        return (int)(d * (double)n + WJ.I1pmO("iwgpwl", 1959484853, -29312632, -29312635, -29312571, -1656829611, -953574260, 654867985)[2]);
    }

    private void N(Rs rs) {
        WJ.I1pmO("ppss", 1959484849, -29312632, -29312631, -29312630, 1863650170, 206175490, 17700075, (WJ)this);
        CallSite callSite = WJ.I1pmO("jjhs", 1959484849, -29312726, -29312637, -29312725, 1863650170, 206175490, 17700075, (Rs)rs);
        CallSite callSite2 = WJ.I1pmO("ppss", 1959484853, -29312632, -29312586, -29312596, 1461569841, -2086837497, 662944526)[3];
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{NSY.class, NCq.class}, (Object)callSite, (int)callSite2)) {
            case 0: {
                NSY nSY = (NSY)callSite;
                WJ.I1pmO("jjhs", 1959484849, -29312636, -29312724, -29312723, 1863650170, 206175490, 17700075, (NNuU)((NNuU)WJ.I1pmO("dwciij", 1959484851, -29312632, -29312629, -29312626, 165058059, 1193397475, -1641274889, (WJ)this)[WJ.I1pmO("hbcsm", 1959484853, -29312632, -29312613, -29312640, 971792546, -1517946811, 172924422)[7]]), () -> WJ.I1pmO("mynokr", 1959484862, -29312557, -29312618, -29312556, 1863650170, 206175490, 17700075, (IntList)WJ.I1pmO("hehd", 1959484849, -29312559, -29312633, -29312558, 1863650170, 206175490, 17700075, (NSY)nSY), n -> {
                    CallSite callSite = WJ.I1pmO("nmyrwr", 1959484849, -29312634, -29312547, -29312546, 1863650170, 206175490, 17700075, (NNNZg)((NNNZg)WJ.I1pmO("hbcsm", 1959484851, -29312636, -29312635, -29312626, -183786508, -1209324895, 650681334, (NNuU)((NNuU)WJ.I1pmO("jjhs", 1959484851, -29312632, -29312629, -29312626, -1182747245, -109056434, -1270199090, (WJ)this)[WJ.I1pmO("ppss", 1959484853, -29312632, -29312625, -29312640, -195429630, -1466686306, 1066664336)[4]]))[WJ.I1pmO("nmyrwr", 1959484853, -29312632, -29312625, -29312640, 1255776937, 1517293060, -290159750)[5]]), n);
                    if (callSite instanceof NkL) {
                        NkL nkL = (NkL)callSite;
                        WJ.I1pmO("dwciij", 1959484849, -29312545, -29312560, -29312630, 1863650170, 206175490, 17700075, (NkL)nkL);
                    }
                }));
                break;
            }
            case 1: {
                NCq nCq = (NCq)callSite;
                if (WJ.I1pmO("zjbb", 1959484849, -29312606, -29312605, -29312598, 1863650170, 206175490, 17700075, (Boolean)((Boolean)((Object)WJ.I1pmO("zjbb", 1959484849, -29312593, -29312608, -29312607, 1863650170, 206175490, 17700075, (lT)((lT)((Object)WJ.I1pmO("iwgpwl", 1959484851, -29312632, -29312627, -29312626, -873239726, -1259994257, 787708922, (WJ)this)[WJ.I1pmO("hehd", 1959484853, -29312632, -29312595, -29312640, 1799838569, 441017449, 1565688609)[0]])))))) == false || WJ.I1pmO("jjhs", 1959484863, -29312758, -29312608, -29312598, 1863650170, 206175490, 17700075) == false) {
                    return;
                }
                WJ.I1pmO("hbcsm", 1959484849, -29312636, -29312724, -29312723, 1863650170, 206175490, 17700075, (NNuU)((NNuU)WJ.I1pmO("ppss", 1959484851, -29312632, -29312629, -29312626, -1948561778, -191021897, -1665187025, (WJ)this)[WJ.I1pmO("jjhs", 1959484853, -29312632, -29312595, -29312640, 585814907, 1074371282, -688129520)[1]]), () -> {
                    WJ.I1pmO("dwciij", 1959484849, -29312632, -29312631, -29312630, 1863650170, 206175490, 17700075, (WJ)this);
                    if (WJ.I1pmO("mynokr", 1959484849, -29312555, -29312629, -29312554, 1863650170, 206175490, 17700075, (NCq)nCq) == WJ.I1pmO("iwgpwl", 1959484853, -29312632, -29312625, -29312640, -1492273200, -669152634, 1608641019)[2]) {
                        WJ.I1pmO("mynokr", 1959484862, -29312639, -29312574, -29312573, 1863650170, 206175490, 17700075, (List)((List)((Object)WJ.I1pmO("ppss", 1959484851, -29312632, -29312627, -29312626, -620835071, 1082693140, 1944117824, (WJ)this)[WJ.I1pmO("iwgpwl", 1959484853, -29312632, -29312625, -29312640, -901411019, 219493131, 1672053558)[3]])), (Object)new Wo((Ned)WJ.I1pmO("dwciij", 1959484849, -29312555, -29312637, -29312553, 1863650170, 206175490, 17700075, (NCq)nCq), (int)WJ.I1pmO("hbcsm", 1959484849, -29312555, -29312627, -29312554, 1863650170, 206175490, 17700075, (NCq)nCq)));
                    }
                });
                break;
            }
        }
    }

    private static /* synthetic */ long N(long l) {
        return Long.rotateRight(Long.rotateRight(Long.rotateRight(l, 46) ^ 0x649049586FBF46DDL, 35), 16) ^ 0x257CA9A195D23652L;
    }

    private static /* synthetic */ int R(int n) {
        return Integer.rotateLeft((Integer.rotateRight(Integer.rotateRight(Integer.rotateRight(n, 8), 28), 28) ^ 0xC74C6472) + 1, 17);
    }

    private static /* synthetic */ String R(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-124, 67, 126, 51, 109, 56, 46, 24, -32, 110, 31, 91, -6, -49, 46, 100};
        int n = 0;
        int n2 = 219;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 223;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        OljtOpOj = "C\u00a0Y\u00dfQ0]\u00a6\u00cc2\u0001>\u00bfx\u00edC\r|\u0094\u00d5L[\u007f=\u0015\u00e7P+\u0016\u008c\u0094kTaPS\u00d9.\u00b6s]\u00d8M*M\u0090\u0096-Pf\u000bD\u0085\u000e\u00f7ap\u00c2J+\u0002\u000eU\u00ceU;f\u00c8\u00ca:\t\u00a7]\u00ddXpU\u0098\u0094e\u0016A\u000bR\u00d8&\u00b8\u00a1Y\u001f\u0015\u00e7r\u001b\u007f\u0083\u00a8GT'1T\u00f0|Kx\u00edC\r|\u0094\u00d5L[Y@p\u00e0}\u0019C\u00ab\u00bfo\u0016F\bY\u0091\u000bK,z\u00d1k\u001aT\u00d6\u00b4SV33]\u00cb1aGI\u00dfP3\u0016\u00b5\u0093qM36\u001e\u00fc^x\u00edC\r|\u0094\u00d5Lw|3+x\u00edC\r|\u0094\u00d5LNf\u00dcp\u00c1X)X\u00d6\u0096cWoPe\u00df)n\u0095^\u00c7\\d\u0010\u00af3f@\u0015\u00e7r\u001b\u007f\u0083\u00a8GT'1T\u00e8|sH\u00caM6Z\u00bf\u0093gUl\fh\u009b&\u00d06\u000e\u0099\u000fk\f\u00ca\u00cdf];N\u0006\u009f&\u00834\u0004\u00c9Xj\u0000\u00cd\u00cc7\u000bnN\u0007\u00cc\u00a9]\u00ddXpU\u0098\u0094e\u0016E\u001eC\u00c2cP\u00caT/\\x\u00edC\r|\u0094\u00d5Lzydx\u00edC\r|\u0094\u00d5LRD(p\u00c1X)X\u00d6\u0096cWoPd\u00de5\u008bn[\u0090b\u0013S\u0098\u008cc\u0016d\u001eY\u00cdh\u00adbV\u00ceZ+\u0002\u00d0\u00b6hX~\u001e\u0018\u00c6&\u008cg\u0013\u00f8M-P\u0097\u009d9@\u0015\u00e7r\u001b\u007f\u0083\u00a8GT'1y\u00e4\u0014JS\u00fdp\u00e0}\u0019C\u00ab\u00bfo\u0016F\u001df\u0091\u000e\u0010\u0099w\u00ef\u007f%k\u00bc\u0097-wI1\f(p\u00e0}\u0019C\u00ab\u00bfo\u0016F>y\u0091n\u00aeKx\u00edC\r|\u0094\u00d5Lwi\u0018\f\r]\u00ddXpU\u0098\u0094e\u0016A\u0011C\u00cf \u00fc\u0015\u00f7O\u00eeT/M\u0080\u00a1Op\u00c1X)X\u00d6\u0096cWoPd\u00de5\u00f0\t[\u0090\u0010\u0013r\u00bd\u00bcxkM\u0012\u0018\u00e4\t\u00f8\u0000\u0007>p\u00e0}\u0019C\u00ab\u00bfo\u0016F1y\u00e4\u0015\u00b0-p\u00c1X)X\u00d6\u0096cWoPx\u00c8-\u0087uH\u0090\u0010\u0013S\u0098\u008cc\u0016d\u001eY\u00cdh\u00adtV\u00ceZ+\u0002`\u00fd\u0015\u00e7S>O\u0098\u00d5nXf\u0018\u0018\u00e5%S\u00b0_\u00df\u0002\u00baf{Y\u00dfQ0]\u00a6\u00cf6\u000e9F\u001fp\u00c1X)X\u00d6\u0096cWoPx\u00c8-\u00cfTH\u0090\u0010\t:\u00aeY\u00dfQ0]\u00a6\u00ce4\u000e=F(\u0015\u00fd\u00fdu\u00ed\u0010\u0013S\u0098\u008cc\u0016d\u001eY\u00cdhj\u00a1N\u00c2W8\u0002\u008fw\u00ef\u007f%k\u00bc\u0097-wF1y\u00f8\u0015\u00e0\u007f]\u00ddXpU\u0098\u0094e\u0016J\u0010X\u00c6\"\u00f8{Y\u00f7R\u00dfo>U\u008c\u009f!\u00e5p\u00c1X)X\u00d6\u008fvPdPQ\u00df)\u00b9\u00b9U\u00c4Wpi\u008b\u009ffPk\u001eC\u00cf|\u0096\u00a7]\u00ddXpU\u0098\u0094e\u0016Z\nY\u00c4&\u00b8\u00a1Y\u0090\u0010\t\u0086x\u00edC\r|\u0094\u00d5Z{#x\u00edC\r|\u0094\u00d5T3~@\u0015\u00e7S>O\u0098\u00d5wMa\u0013\u0018\u00e57M\u0001S\u00c5X3\u0002\u0007f\u0082u5X\u008f\u009b-Ui\u0011P\u0085\u0005\u00c5@P\u00ceX1\u0002\u0005S\u00c4U:X\u0097\u00accU}\u001a\\x\u00edC\r|\u0094\u00d5LaaHx\u0082s\u00e5\u0015\u00e7r\u001b\u007f\u0083\u00a8GT'1y\u00cb \u00e1^x\u00edC\r|\u0094\u00d5LwF\u000e^\u00b6\u0015\u00e7r\u001b\u007f\u0083\u00a8GT'1\\\u00e6|\u00b6\u0015\u00e7r\u001b\u007f\u0083\u00a8GT'1o\u00c3|\u00b6p\u00c2MpL\u0097\u0093oP'\u001bD\u00c3h~\u00ffO\u00dfL+P\u0095\u00d5kW|\f\u0018\u00e3)l\u00ddS\u00c5J*T\u009c\u00889\u0010^+w\u00ef\u007f%k\u00bc\u0097-wI\u001b\f\u00fdz\u00ed\u007fvp\u00d5x\u00edC\r|\u0094\u00d5Li`\u001a\u00bbY\u00d3MfM\u00d9MF\u007f?p\u00c1X)X\u00d6\u0096cWoPx\u00c8-}tH\u0090\u0010\u0013S\u0098\u008cc\u0016d\u001eY\u00cdhWuV\u00ceZ+\u0002\u0007\u0015\u00ed\u0001\\x\u00edC\r|\u0094\u00d5LwI\b\r]\u00ddXpL\u008d\u0093n\u0016G\u001d]\u00cf$\u00ed\u0014\u00bf]\u00ddXpL\u008d\u0093n\u0016D\u0016D\u00de\u00bb>v\u00e2pvp\u00d2w\u00ef\u007f%k\u00bc\u0097-wF\u000ff\u0091\u0096p\u00c1X)X\u00d6\u0096cWoPd\u00de5\u00b3\u00a3[\u0090|\u0015\u00e7r\u001b\u007f\u0083\u00a8GT'1f\u00c5|\u00bfx\u00edC\r|\u0094\u00d5LwF,}qU\u00ceU;f\u00c8\u00ca4\b\u001f\u0015\u00e7S>O\u0098\u00d5wMa\u0013\u0018\u00e33\u00cfE]\u00dfV-\u0002dx\u00edC\r|\u0094\u00d5LZR=p\u00e0}\u0019C\u00ab\u00bfo\u0016F\bY\u0091n\u00c3\u00fd\u0015\u00e7r\u001b\u007f\u0083\u00a8GT'1y\u00eb0\u0002dx\u00edC\r|\u0094\u00d5{\u00a5S\u00d9|>Z\u0091DH\u00d9\\>T\u00ebp\u00c1X)X\u00d6\u008fvPdP{\u00c34\u00af\u00f8p\u00e0}\u0019C\u00ab\u00bfo\u0016F'^\u0091\u000b\u0090\u0087z\u00d1k\u001aT\u00d6\u00b4`r3%{\u00e1\u0003\u009d\u00b9n\u00eeTpw\u00a8\u00959\u0010^U\u0086x\u00edC\r|\u0094\u00d5[\u0099w\u00ef\u007f%k\u00bc\u0097-wk%\f(\u0015\u00f1\u009dH\u00ceK>M\u0096\u0088@\u0015\u00e7r\u001b\u007f\u0083\u00a8GT'\u0014e\u0091\\\u00bf]\u00ddXpL\u008d\u0093n\u0016G\u000fC\u00c3(W\u00b4P\u001en\u0099Y\u00dfQ0]\u00a6\u00c26\u000f1\u0007\u0015\u00e7S>O\u0098\u00d5wMa\u0013\u0018\u00d93\u00d8J]\u00c6\u0016\fM\u008b\u009fcT3@\u0015\u00e7S>O\u0098\u00d5nXf\u0018\u0018\u00e33e\u001a]\u00c9U:\u0002\u00bfx\u00edC\r|\u0094\u00d5f`T|p\u00e0}\u0019C\u00ab\u00bfo\u0016F'^\u0091n\u009f\u001fu\u0082u\u0014}\u00bf\u0080P|ePy\u00c8\f\u0091\u00bfx\u00edC\r|\u0094\u00d5fo\u00ecY\u00daL6K\u009c\u00b4mWF\n[\u00c6@p\u00e0}\u0019C\u00ab\u00bfo\u0016a/\f\u0083\u0011ac^x\u00edC\r|\u0094\u00d5LxFOp\u00c1X)X\u00d6\u0096cWoPx\u00c8-\u00fc\u0004H\u0090\u0010\u0005>\u0015\u00e7r\u001b\u007f\u0083\u00a8GT'1y\u00e4%\u0095-Lx\u0002]\u00ddXpU\u0098\u0094e\u0016G\u001d]\u00cf$t>p\u00e0}\u0019C\u00ab\u00bfo\u0016F>e\u0091n\u00ae]x\u00edC\r|\u0094\u00d5LxlD#x\u00edC\r|\u0094\u00d5LwF\u001d@\u00b8|p\u00c1X)X\u00d6\u008fvPdPQ\u00df)\u00b8 U\u00c4Wpz\u0096\u0094qLe\u001aE\u0091n\u008dHx\u00ef}vu\u00b2\u00beDCZ:Z\u0085\t\u00923\u0007\u001fx\u00edC\r|\u0094\u00d5Lvd\u00e5\u0015\u00e7Z0T\u00d6\u0097mSi\u0011P\u00854\u00bf\u00bfU\u00caU6C\u0098\u008ekVfP{\u00c3!\u00bf\u00aeE\u00c8U:\u0002tX\u00cf>\u0015\u00e7r\u001b\u007f\u0083\u00a8GT'1v\u00e9|\u00dcp\u00e0}\u0019C\u00ab\u00bfo\u0016QD\u001e\u00e6-a\u0082]\u0084L+P\u0095\u00d5NP{\u000b\fe\u00d5x\u00edC\r|\u0094\u00d5LwF1e\u00f0,w\u00ef\u007f%k\u00bc\u0097-wG\u0013\f|p\u00e0}\u0019C\u00ab\u00bfo\u0016F1G\u00fb|\u00f2\u0018V\u00caO>\u0016\u008c\u008ekU'0G\u00de.\u00b4:]\u00c7\u0002dx\u00edC\r|\u0094\u00d5nm\u00eb\u0015\u00e7r\u001b\u007f\u0083\u00a8GT'\nT\u0091\u001fx\u00edC\r|\u0094\u00d5wZHp\u00c1X)X\u00d6\u008fvPdPQ\u00df)\u00b9\u0014U\u00c4Wp\u007f\u008c\u0094aMa\u0010Y\u0091n\u0096\n]\u00ddXpL\u008d\u0093n\u0016G\u000fC\u00c3(\u00b4\u0001P\u0090\u0091M\u00deX3J\u00a0\u009ex\u00edC\r|\u0094\u00d5ik\u001fx\u00edC\r|\u0094\u00d5Lq[?p\u00e0}\u0019C\u00ab\u00bfo\u0016d&\f\u00e6-ya]\u0084U>W\u009e\u00d5QMz\u0016Y\u00cd|B>p\u00e0}\u0019C\u00ab\u00bfo\u0016d+\f\u0005Y\u00dfQ0]\u00a6\u00cf5\u000e;Hp\u00e0}\u0019C\u00ab\u00bfo\u0016F/_\u0091n\u0096+x\u00edC\r|\u0094\u00d5Lwi\u0018\f\rD\u00ceZ*M\u009c#x\u00edC\r|\u0094\u00d5Lw_:\u00b8]\u00dbtzOx\u0082}\u00bfx\u00edC\r|\u0094\u00d5LZJUKx\u00edC\r|\u0094\u00d5u[cS\u00c6\u00162V\u0093\u009bl^'\fR\u00d8.\u0083lU\u00d1X+P\u0096\u0094-ua\u0019R\u00c9>\u0081lY]x\u00edC\r|\u0094\u00d5UVHx\u00e7r\u001b\u007f\u0083\u00a8GT'1@\u00c4|\u0096+x\u00edC\r|\u0094\u00d5L[CD\u001e\u00eesD\u00db\\-P\u0094\u009flMi\u0013\u00d5x\u00edC\r|\u0094\u00d5nR+x\u00edC\r|\u0094\u00d5LqxO\u0015\u00e7r\u001b\u007f\u0083\u00a8GT'1U\u00e1|\nY\u00dfQ0]\u00a6\u00cd1\b0FH\u0015\u00e7S>O\u0098\u00d5nXf\u0018\u0018\u00f93\u00a8\tR\u00cc\u0002^x\u00edC\r|\u0094\u00d5LxlzY\u00dfQ0]\u00a6\u00cf:\u000b1lp\u00c1X)X\u00d6\u0096cWoPx\u00c8-\u00cfTH\u0090Hp\u00c1X)X\u00d6\u0096cWoPt\u00c6&\u00a9\u0013\u0007\u00e7r\u001b\u007f\u0083\u00a8GT'\nO\u0091n\u008c\u0002]\u00ddXpL\u008d\u0093n\u0016{\u000bE\u00cf&TGo\u00dfK:X\u0094\u00b6u\u0082u\u0014}\u00bf\u0080P|ePy\u00eb##oKx\u00edC\r|\u0094\u00d5PJ\u0007u\u00e2p\u0016\u0010\u00b0A]\u00c7L:v\u009f\u00eb\u0015\u00e7r\u001b\u007f\u0083\u00a8GT'1\u007f\u00f9|\u001fp\u00c2MpL\u0097\u0093oP'\u001bD\u00c3h\u00ccVO\u00dfL+P\u0095\u00d5kW|\f\u0018\u00e3)\u00de\u0005u\u00c5M\u0019L\u0097\u0099vPg\u0011\f\u0083\u000eE]\u00ddXpL\u008d\u0093n\u0016A\u000bR\u00d8&\u00de@N\u009ex\u00edC\r|\u0094\u00d5LjQ\u000eH\u0084L1P\u0094\u0093-]{\u0016\u0018\u00cc&\u00ea\u0013I\u00dfP3\u0016\u0090\u0094vJ'6Y\u00de\u000b\u00f0\u0014H\u0000]\u00d8w:A\u008d\u000eU\u00ceU;f\u00c8\u00c91\b#x\u00edC\r|\u0094\u00d5Lw_\u001b=p\u00c1X)X\u00d6\u008fvPdPQ\u00df)\u00faaU\u00c4Wp\u007f\u008c\u0094aMa\u0010Y\u0091n\u00d5\u007f]\u00ddXpL\u008d\u0093n\u0016{\u000bE\u00cf&\u00f4:o\u00dfK:X\u0094\u00c1\u0086x\u00edC\r|\u0094\u00d5Lhg\u00eb\u0015\u00e2\u00e5p\u00e0}\u0019C\u00ab\u00bfo\u0016F7d\u0091n\u0096\u00a7]\u00ddXpL\u008d\u0093n\u0016D\u0016D\u00de|\u00a2N\u00eeU,\\\u0012+x\u00edC\r|\u0094\u00d5Us\u008fw\u00ef\u007f%k\u00bc\u0097-wX\u0017\f]x\u00edC\r|\u0094\u00d5ki\u008e?u\u00e2pvc\u001fu\u0082p|\u0015\u00e7r\u001b\u007f\u0083\u00a8GT'1R\u00ce|&S\u00deW;\u00d5x\u00edC\r|\u0094\u00d5Lw}*rY\u00df3o\u0088x\u00edC\r|\u0094\u00d5LwF%P?p\u00e0}\u0019C\u00ab\u00bfo\u0016F>S\u0091nT\\x\u00edC\r|\u0094\u00d5Lwi\u0018\fvP\u00ceX-\u001fx\u00edC\r|\u0094\u00d5Lwi\u0018|\u0015\u00e7r\u001b\u007f\u0083\u00a8GT'1v\u00e4|\u0005Y\u00dfQ0]\u00a6\u00c92\n<FHp\u00c1X)X\u00d6\u0096cWoPt\u00c6&\u00a9\u0013\u0007\u00e7r\u001b\u007f\u0083\u00a8GT'1\u007f\u00f9|\u00f3,V\u00caO>\u0016\u008c\u008ekU'3^\u00d93\u00e1";
        Ol0Oip = new int[]{171900938, 69861377, 40960003, 153092097, 97386511, 105578497, 147193875, 87687169, 177078274, 68943886, 179961861, 171835393, 176095244, 1, 177209357, 63569921, 182845488, 84606985, 0xE0002E, 64159745, 49545225, 113311773, 80281606, 89784347, 150536215, 133627907, 164823096, 67829777, 96469006, 64290854, 79822855, 105644064, 11337739, 65547, 86048771, 93650945, 13565954, 30605313, 84541441, 119406602, 66977793, 36503572, 43646993, 53149708, 115277838, 64225281, 42598416, 108920843, 116195341, 0xA0B000B, 98369538, 32899126, 91553814, 86245384, 74973206, 158793746, 162922503, 63635460, 77135888, 143654924, 57802767, 53936139, 174063617, 93716496, 138543134, 4653074, 6815755, 100597777, 104726541, 786443, 155713583, 134938625, 50135042, 25231389, 112132099, 99221525, 30146567, 101711874, 0x10E000E, 175767557, 54657028, 125370369, 18612229, 69926918, 7536686, 89063435, 94765072, 19660811, 129761291, 159973387, 1507366, 160694306, 58785835, 18939915, 169213955, 174784527, 144441364, 48889866, 20381753, 37945356, 0x1700011, 73465869, 115212289, 66781187, 164036620, 41156630, 98500619, 30670882, 62849035, 74317834, 172556301, 180289548, 130482205, 54919184, 27131933, 173408266, 13697039, 0x800000B, 5832719, 76414987, 163381258, 85196813, 10551308, 142671887, 56819727, 0x8BB000B, 154730511, 126091275, 107741202, 169410591, 135004170, 137887754, 45350913, 95813642, 174522372, 153812999, 50266134, 87752722, 176881667, 0x1BB0011, 44826632, 174129158, 80674875, 72482831, 141950987, 109641766, 135659554, 140509196, 101842960, 124977158, 154271751, 51707926, 182059020, 78184464, 55967757, 88932354, 70320142, 67043340, 40173580, 117047332, 121634867, 171442182, 153157642, 112328719, 132382727, 12058647, 36438017, 133824514, 132841484, 62455814, 0x8B0000B, 61603853, 0x9100010, 178061341, 37814274, 181075983, 40108033, 71237651, 44761089, 102891548, 3997706, 92995594, 38731797, 79233033, 86769678, 0x77A000A, 63897604, 133955588, 141295626, 126812205, 120061966, 120979466, 148439072, 45416501};
        WJ.n();
        WJ.j();
        WJ.P();
        WJ.s();
        WJ.T();
        WJ.b();
    }

    private static /* synthetic */ CallSite I1pmO(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = Ol0Oip[n2 ^ 0xFE40B988];
        int n9 = n8 >>> 16;
        String string2 = WJ.I1mlnIim(OljtOpOj.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0xFE40B988);
        n8 = Ol0Oip[n3 ^ 0xFE40B988];
        int n10 = n8 >>> 16;
        String string3 = WJ.I1mlnIim(OljtOpOj.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0xFE40B988);
        n8 = Ol0Oip[n4 ^ 0xFE40B988];
        int n11 = n8 >>> 16;
        String string4 = WJ.I1mlnIim(OljtOpOj.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0xFE40B988);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x74CB5D07) + -178;
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

    private static /* synthetic */ void lOpslnpOm(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[194];
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
        OljtOpOj = stringBuilder.toString();
        Ol0Oip = nArray;
    }

    private static /* synthetic */ String I1mlnIim(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-119, -35, -31, 125, -66, -97, 23, 92, -100, -90, -23, -98, 74, -18, -31, 68};
        byte[] byArray3 = new byte[]{-78, -91, -78, -98, -2, -2, 19, 20, 75, 104, -60, 71, -15, -50, -35, -22};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite oomplnsp(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = Ol0Oip[n2 ^ 0xFE40B988];
        int n9 = n8 >>> 16;
        String string2 = WJ.I1mlnIim(OljtOpOj.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0xFE40B988);
        n8 = Ol0Oip[n3 ^ 0xFE40B988];
        int n10 = n8 >>> 16;
        String string3 = WJ.I1mlnIim(OljtOpOj.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0xFE40B988);
        n8 = Ol0Oip[n4 ^ 0xFE40B988];
        int n11 = n8 >>> 16;
        String string4 = WJ.I1mlnIim(OljtOpOj.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0xFE40B988);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x74CB5D07) + -178;
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
