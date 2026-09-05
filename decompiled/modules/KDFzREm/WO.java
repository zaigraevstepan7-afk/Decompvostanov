/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NNNNRR
 *  KDFzREm.NNNwS
 *  KDFzREm.NNNww
 *  KDFzREm.NNuU
 *  KDFzREm.NQo
 *  KDFzREm.NbL
 *  KDFzREm.Nbx
 *  KDFzREm.Nkq
 *  KDFzREm.Nwj
 *  KDFzREm.gB
 */
package KDFzREm;

import KDFzREm.NNNNRR;
import KDFzREm.NNNwS;
import KDFzREm.NNNww;
import KDFzREm.NNuU;
import KDFzREm.NQo;
import KDFzREm.NbL;
import KDFzREm.Nbx;
import KDFzREm.Nkq;
import KDFzREm.Nwj;
import KDFzREm.Ru;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.dS;
import KDFzREm.gB;
import KDFzREm.iO;
import KDFzREm.ih;
import KDFzREm.il;
import KDFzREm.iw;
import KDFzREm.kR;
import KDFzREm.kW;
import KDFzREm.lY;
import KDFzREm.ld;
import KDFzREm.ln;
import KDFzREm.lv;
import KDFzREm.uF;
import KDFzREm.wy;
import KDFzREm.zK;
import KDFzREm.zl;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Optional;

@UZ(L="ElytraHelper", y=UR.MISC, N=Uz.HELPER)
public class WO
extends UM {
    private static short[] i;
    private static short[] R;
    private static short[] M;
    public Object[] L;
    private static byte[] B;
    private static boolean[] Z;
    private static boolean[] z;
    private static short[] U;
    private static boolean[] W;
    private static short[] m;
    private static short[] P;
    private static byte[] s;
    private static boolean[] T;
    public Object[] u;
    private static short[] b;
    private static String[] j;
    private static boolean[] v;
    private static short[] n;
    private static short[] t;
    private static short[] G;
    private static short[] l;
    private static /* synthetic */ String IIijOjO;
    private static /* synthetic */ int[] l1pin0iki;

    private static /* synthetic */ int L(int n) {
        return Integer.rotateRight(Integer.rotateLeft(Integer.rotateRight((n ^ 0x77317A13) + 1, 1), 11) ^ 0x6D248EDF, 11) ^ 0x6AEC7195;
    }

    private static /* synthetic */ String M(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-66, -65, 120, -118, 61, -65, -74, -42, -78, -56, -21, 119, -16, 72, 85, 49};
        int n = 0;
        int n2 = 10;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 57;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private void P() {
        CallSite callSite;
        if (WO.I1ql00("wdtninui", -1200268691, 233139052, 233139055, 233139048, -1200268691, (WO)this) == null) {
            WO.I1ql00("iycxakza", -1200268692, 233139052, 233139055, 233139048, -1200268692, (WO)this, (Object[])new Object[WO.I1ql00("iycxakza", -1200268693, 233139052, 233139034, 233139035, -1200268693)[2]]);
            callSite = WO.I1ql00("grbui", -1200268691, 233139052, 233139055, 233139048, -1200268691, (WO)this);
        }
        if (WO.I1ql00("fbhdgrig", -1200268691, 233139052, 233139043, 233139048, -1200268691, (WO)this) == null) {
            WO.I1ql00("psowmcf", -1200268692, 233139052, 233139043, 233139048, -1200268692, (WO)this, (Object[])new Object[WO.I1ql00("bpabzxuk", -1200268693, 233139052, 233139034, 233139035, -1200268693)[3]]);
            callSite = WO.I1ql00("psowmcf", -1200268691, 233139052, 233139043, 233139048, -1200268691, (WO)this);
            callSite[WO.I1ql00("nakb", -1200268693, 233139052, 233139013, 233139047, -1200268693)[2]] = WO.I1ql00("rrzqt", -1200268703, 233139028, 233139041, 233139029, -1200268703, (int)WO.I1ql00("rrzqt", -1200268693, 233139052, 233139013, 233139047, -1200268693)[3]);
            callSite[WO.I1ql00("wssuos", -1200268693, 233139052, 233139034, 233139035, -1200268693)[4]] = WO.I1ql00("bpabzxuk", -1200268703, 233139040, 233139041, 233139042, -1200268703, (boolean)WO.I1ql00("fxrkbkk", -1200268693, 233139052, 233139013, 233139047, -1200268693)[4]);
            callSite[WO.I1ql00("grbui", -1200268693, 233139052, 233139034, 233139035, -1200268693)[5]] = WO.I1ql00("iycxakza", -1200268703, 233139040, 233139041, 233139042, -1200268703, (boolean)WO.I1ql00("wdtninui", -1200268693, 233139052, 233139013, 233139047, -1200268693)[5]);
            callSite[WO.I1ql00("mshwkftg", -1200268693, 233139052, 233139034, 233139035, -1200268693)[6]] = WO.I1ql00("nakb", -1200268703, 233139040, 233139041, 233139042, -1200268703, (boolean)WO.I1ql00("bpabzxuk", -1200268693, 233139052, 233139013, 233139047, -1200268693)[6]);
            callSite[WO.I1ql00("rrzqt", -1200268693, 233139052, 233139034, 233139035, -1200268693)[7]] = WO.I1ql00("grbui", -1200268703, 233139040, 233139041, 233139042, -1200268703, (boolean)WO.I1ql00("rrzqt", -1200268693, 233139052, 233139013, 233139047, -1200268693)[7]);
        }
    }

    private static void T() {
        j = new String[]{"swap-key", "firework-key", "disabled", "only-space", "always", "auto-launch"};
    }

    public WO() {
        WO.I1ql00("fbhdgrig", -1200268689, 233139052, 233139053, 233139054, -1200268689, (WO)this);
        CallSite callSite = WO.I1ql00("bpabzxuk", -1200268703, 233138990, 233139044, 233138991, -1200268703, (lY)this, (String)((Object)WO.I1ql00("lbzmtb", -1200268693, 233139052, 233139025, 233139026, -1200268693)[0]), (zK)((zK)((Object)WO.I1ql00("zxibtf", -1200268693, 233139027, 233138988, 233139048, -1200268693)[WO.I1ql00("rrzqt", -1200268693, 233139052, 233138989, 233139050, -1200268693)[0]])));
        WO.I1ql00("nakb", -1200268691, 233139052, 233139055, 233139048, -1200268691, (WO)this)[WO.I1ql00("nakb", -1200268693, 233139052, 233138989, 233139050, -1200268693)[1]] = callSite;
        CallSite callSite2 = WO.I1ql00("fxrkbkk", -1200268703, 233138990, 233139044, 233138991, -1200268703, (lY)this, (String)((Object)WO.I1ql00("zxibtf", -1200268693, 233139052, 233139025, 233139026, -1200268693)[1]), (zK)((zK)((Object)WO.I1ql00("nakb", -1200268693, 233139027, 233138988, 233139048, -1200268693)[WO.I1ql00("wdtninui", -1200268693, 233139052, 233138989, 233139050, -1200268693)[2]])));
        WO.I1ql00("wdtninui", -1200268691, 233139052, 233139055, 233139048, -1200268691, (WO)this)[WO.I1ql00("fbhdgrig", -1200268693, 233139052, 233138989, 233139050, -1200268693)[3]] = callSite2;
        lv lv2 = new lv((String)((Object)WO.I1ql00("wssuos", -1200268693, 233139052, 233139025, 233139026, -1200268693)[2]), (boolean)WO.I1ql00("bpabzxuk", -1200268693, 233139052, 233138984, 233139047, -1200268693)[0]);
        WO.I1ql00("fxrkbkk", -1200268691, 233139052, 233139055, 233139048, -1200268691, (WO)this)[WO.I1ql00("bpabzxuk", -1200268693, 233139052, 233138989, 233139050, -1200268693)[4]] = lv2;
        lv lv3 = new lv((String)((Object)WO.I1ql00("lbzmtb", -1200268693, 233139052, 233139025, 233139026, -1200268693)[3]), (boolean)WO.I1ql00("fbhdgrig", -1200268693, 233139052, 233138984, 233139047, -1200268693)[1]);
        WO.I1ql00("lbzmtb", -1200268691, 233139052, 233139055, 233139048, -1200268691, (WO)this)[WO.I1ql00("iycxakza", -1200268693, 233139052, 233138989, 233139050, -1200268693)[5]] = lv3;
        lv lv4 = new lv((String)((Object)WO.I1ql00("psowmcf", -1200268693, 233139052, 233139025, 233139026, -1200268693)[4]), (boolean)WO.I1ql00("mshwkftg", -1200268693, 233139052, 233138984, 233139047, -1200268693)[2]);
        WO.I1ql00("xeingatu", -1200268691, 233139052, 233139055, 233139048, -1200268691, (WO)this)[WO.I1ql00("mshwkftg", -1200268693, 233139052, 233139062, 233139050, -1200268693)[0]] = lv4;
        lv[] lvArray = new lv[WO.I1ql00("psowmcf", -1200268693, 233139052, 233138985, 233139035, -1200268693)[0]];
        lvArray[WO.I1ql00("xeingatu", -1200268693, 233139052, 233138984, 233139047, -1200268693)[3]] = (lv)((Object)WO.I1ql00("wssuos", -1200268691, 233139052, 233139055, 233139048, -1200268691, (WO)this)[WO.I1ql00("bpabzxuk", -1200268693, 233139052, 233139062, 233139050, -1200268693)[1]]);
        lvArray[WO.I1ql00("rrzqt", -1200268693, 233139052, 233138984, 233139047, -1200268693)[4]] = (lv)((Object)WO.I1ql00("wssuos", -1200268691, 233139052, 233139055, 233139048, -1200268691, (WO)this)[WO.I1ql00("iycxakza", -1200268693, 233139052, 233139062, 233139050, -1200268693)[2]]);
        lvArray[WO.I1ql00("nakb", -1200268693, 233139052, 233138985, 233139035, -1200268693)[1]] = (lv)((Object)WO.I1ql00("mshwkftg", -1200268691, 233139052, 233139055, 233139048, -1200268691, (WO)this)[WO.I1ql00("wssuos", -1200268693, 233139052, 233139062, 233139050, -1200268693)[3]]);
        CallSite callSite3 = WO.I1ql00("fxrkbkk", -1200268703, 233138990, 233139044, 233138986, -1200268703, (lY)this, (String)((Object)WO.I1ql00("iycxakza", -1200268693, 233139052, 233139025, 233139026, -1200268693)[5]), (lv[])lvArray);
        WO.I1ql00("iycxakza", -1200268691, 233139052, 233139043, 233139048, -1200268691, (WO)this)[WO.I1ql00("bpabzxuk", -1200268693, 233139052, 233139062, 233139050, -1200268693)[4]] = callSite3;
    }

    static {
        WO.ntfClinit();
    }

    private static /* synthetic */ String B(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-33, -111, -117, -48, -52, 98, 95, -26, -48, 102, -35, 2, 96, -62, -13, -25};
        int n = 0;
        int n2 = 170;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 105;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String i(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{127, -30, -39, -101, 2, -100, -16, 64, 38, -116, 78, 45, 31, 71, -40, -86};
        int n = 0;
        int n2 = 36;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 55;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int i(int n) {
        return (Integer.rotateRight(Integer.rotateRight(Integer.rotateRight(n, 28), 5) ^ 0xEAF23814, 2) ^ 0x5B4605DE) + 1;
    }

    private static void b() {
        M = new short[]{0, 0, 0, 1, 2, 3};
        i = new short[]{4, 2, 3, 4, 0};
        l = new short[]{1, 1, 5, 3, 2, 0, 3, 1};
        t = new short[]{2, 0};
        n = new short[]{4, 1, 4, 2, 2};
        m = new short[]{3, 3, 0, 2, 0, 4};
        G = new short[]{0, 4};
        P = new short[]{0, 4, 1};
        R = new short[]{3, 0, 4, 3, 4, 0, 4, 3};
        b = new short[]{5, 5, 5, 0, 4, 2, 0, 2};
        U = new short[]{2, 0};
    }

    private static void s() {
        s = new byte[]{3, 2};
        B = new byte[]{4, 10, 5, 6, 2, 3, 4, 5};
    }

    public boolean m() {
        WO.I1ql00("bpabzxuk", -1200268689, 233139052, 233139053, 233139054, 796855720, (WO)this);
        return (boolean)(WO.I1ql00("xeingatu", -1200268689, 233138977, 233139014, 233139058, 796855720, (kW)((Object)WO.I1ql00("nakb", -1200268703, 233139020, 233139025, 233138976, 796855720))) < WO.I1ql00("rrzqt", -1200268689, 233139028, 233138978, 233139058, 796855720, (Integer)((Object)WO.I1ql00("psowmcf", -1200268691, 233139052, 233139043, 233139048, 302019963, (WO)this)[WO.I1ql00("fxrkbkk", -1200268693, 233139052, 233139049, 233139050, 1633350508)[1]])) ? WO.I1ql00("zxibtf", -1200268693, 233139052, 233138984, 233139047, -301038533)[5] : WO.I1ql00("nakb", -1200268693, 233139052, 233139046, 233139047, -1440261693)[0]);
    }

    private void v() {
        CallSite callSite;
        CallSite callSite2;
        CallSite callSite3 = WO.I1ql00("nakb", -1200268689, 233139009, 233138994, 233138995, 796855720, (NNNwS)((NNNwS)WO.I1ql00("fbhdgrig", -1200268691, 233139015, 233139023, 233139048, 825584248, (NNuU)((NNuU)WO.I1ql00("mshwkftg", -1200268691, 233139052, 233139014, 233139048, -1389278204, (WO)this)[WO.I1ql00("rrzqt", -1200268693, 233139052, 233138998, 233139050, 459430793)[3]]))[WO.I1ql00("fbhdgrig", -1200268693, 233139052, 233138998, 233139050, 190537261)[4]]), (Nbx)WO.I1ql00("iycxakza", -1200268693, 233138999, 233138992, 233138993, -1424289180));
        CallSite callSite4 = WO.I1ql00("zxibtf", -1200268689, 233138982, 233139034, 233138956, 796855720, (NQo)callSite3) == WO.I1ql00("iycxakza", -1200268693, 233138957, 233138958, 233138959, -1646739965) ? WO.I1ql00("iycxakza", -1200268693, 233139052, 233139033, 233139047, -783013103)[5] : (callSite2 = WO.I1ql00("psowmcf", -1200268693, 233139052, 233139023, 233139047, 266517212)[0]);
        CallSite callSite5 = WO.I1ql00("nakb", -1200268689, 233138982, 233139003, 233139038, 796855720, (NQo)callSite3) == false ? WO.I1ql00("mshwkftg", -1200268693, 233139052, 233139023, 233139047, -1437385634)[1] : (callSite = WO.I1ql00("wdtninui", -1200268693, 233139052, 233139023, 233139047, -1948978719)[2]);
        if (callSite2 != false) {
            WO.I1ql00("lbzmtb", -1200268689, 233138954, 233138955, 233138948, 796855720, (Optional)((Object)WO.I1ql00("xeingatu", -1200268703, 233138952, 233139044, 233138953, 796855720, (wy)((wy)((Object)WO.I1ql00("grbui", -1200268693, 233139063, 233139056, 233139048, -1721823674)[WO.I1ql00("nakb", -1200268693, 233139052, 233138998, 233139050, -138720281)[5]])))), dS2 -> WO.I1ql00("nakb", -1200268689, 233139052, 233139014, 233139064, 796855720, (WO)this, (int)WO.I1ql00("wdtninui", -1200268689, 233139031, 233139014, 233139058, 796855720, (dS)dS2)));
            return;
        }
        if (callSite != false) {
            WO.I1ql00("nakb", -1200268689, 233138954, 233138955, 233138948, 796855720, (Optional)((Object)WO.I1ql00("rrzqt", -1200268703, 233138952, 233139044, 233138953, 796855720, (wy)((wy)((Object)WO.I1ql00("grbui", -1200268693, 233139063, 233139056, 233139048, -1952496995)[WO.I1ql00("rrzqt", -1200268693, 233139052, 233138998, 233139050, -739018546)[6]])))), dS2 -> WO.I1ql00("rrzqt", -1200268689, 233139052, 233139014, 233139064, 796855720, (WO)this, (int)WO.I1ql00("fxrkbkk", -1200268689, 233139031, 233139014, 233139058, 796855720, (dS)dS2)));
            return;
        }
        WO.I1ql00("fxrkbkk", -1200268689, 233138954, 233138949, 233138950, 796855720, (Optional)((Object)WO.I1ql00("iycxakza", -1200268703, 233138952, 233139044, 233138953, 796855720, (wy)((wy)((Object)WO.I1ql00("mshwkftg", -1200268693, 233139063, 233139056, 233139048, -1091697045)[WO.I1ql00("wdtninui", -1200268693, 233139052, 233138998, 233139050, -1488542078)[7]])))), dS2 -> WO.I1ql00("wssuos", -1200268689, 233139052, 233139014, 233139064, 796855720, (WO)this, (int)WO.I1ql00("fxrkbkk", -1200268689, 233139031, 233139014, 233139058, 796855720, (dS)dS2)), () -> WO.I1ql00("bpabzxuk", -1200268689, 233138954, 233138955, 233138948, 796855720, (Optional)((Object)WO.I1ql00("fbhdgrig", -1200268703, 233138952, 233139044, 233138953, 796855720, (wy)((wy)((Object)((Object)WO.I1ql00("grbui", -1200268693, 233139063, 233139056, 233139048, 1593088101)[WO.I1ql00("fxrkbkk", -1200268693, 233139052, 233139057, 233139050, 431978179)[1]]))))), dS2 -> WO.I1ql00("grbui", -1200268689, 233139052, 233139014, 233139064, 796855720, (WO)this, (int)WO.I1ql00("nakb", -1200268689, 233139031, 233139014, 233139058, 796855720, (dS)dS2))));
    }

    private static void j() {
        Z = new boolean[]{true, false, false, false, true, true};
        z = new boolean[]{false, false, true, true, false};
        W = new boolean[]{false, false, true, true, false, true};
        T = new boolean[]{false, true, false, false, false, false, false, false};
        v = new boolean[]{false, false, true, false, false, false, false, false};
    }

    private static /* synthetic */ int u(int n) {
        return Integer.rotateLeft(Integer.rotateLeft(Integer.rotateRight(Integer.rotateRight((Integer.rotateLeft(n, 22) ^ 0x99A3E6BC) + 1, 5), 21) ^ 0xCF670DBC, 27), 27);
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{83, -80, -91, 99, -97, 47, -38, -49, 91, 31, 94, -26, 70, -73, -126, 4};
        int n = 0;
        int n2 = 26;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 29;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private void y(int n, int n2) {
        WO.I1ql00("nakb", -1200268689, 233138944, 233139014, 233138945, 796855720, (kR)((Object)WO.I1ql00("nakb", -1200268703, 233139020, 233138984, 233138951, 796855720)), (int)WO.I1ql00("fxrkbkk", -1200268693, 233139052, 233139034, 233139035, 1215217532)[0], () -> WO.I1ql00("lbzmtb", -1200268689, 233139019, 233139014, 233139054, 796855720, (zl)((Object)WO.I1ql00("zxibtf", -1200268689, 233139019, 233139044, 233139012, 796855720, (zl)((Object)WO.I1ql00("mshwkftg", -1200268703, 233139020, 233139021, 233139022, 796855720)), (int)WO.I1ql00("rrzqt", -1200268693, 233139052, 233139013, 233139047, -1015701213)[1], (int)n, (int)n2, (Nkq)WO.I1ql00("mshwkftg", -1200268693, 233139016, 233139017, 233139018, -704397807)))));
    }

    @Override
    public void y() {
        WO.I1ql00("wssuos", -1200268689, 233139052, 233139053, 233139054, -1200268689, (WO)this);
        CallSite callSite = WO.I1ql00("fxrkbkk", -1200268693, 233139052, 233139046, 233139047, -1200268693)[1];
        CallSite callSite2 = WO.I1ql00("lbzmtb", -1200268703, 233139040, 233139041, 233139042, -1200268703, (boolean)callSite);
        WO.I1ql00("rrzqt", -1200268691, 233139052, 233139043, 233139048, -1200268691, (WO)this)[WO.I1ql00("xeingatu", -1200268693, 233139052, 233139049, 233139050, -1200268693)[2]] = callSite2;
        CallSite callSite3 = WO.I1ql00("rrzqt", -1200268703, 233139040, 233139041, 233139042, -1200268703, (boolean)callSite);
        WO.I1ql00("iycxakza", -1200268691, 233139052, 233139043, 233139048, -1200268691, (WO)this)[WO.I1ql00("xeingatu", -1200268693, 233139052, 233139049, 233139050, -1200268693)[3]] = callSite3;
        CallSite callSite4 = WO.I1ql00("zxibtf", -1200268703, 233139040, 233139041, 233139042, -1200268703, (boolean)callSite);
        WO.I1ql00("nakb", -1200268691, 233139052, 233139043, 233139048, -1200268691, (WO)this)[WO.I1ql00("iycxakza", -1200268693, 233139052, 233139049, 233139050, -1200268693)[4]] = callSite4;
        WO.I1ql00("psowmcf", -1200268690, 233139030, 233139014, 233139054, -1200268690, (UM)this);
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{23, -70, 15, -41, -5, -26, -7, 29, -59, -124, 22, 10, -95, 27, -59, -115};
        int n = 0;
        int n2 = 198;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 9;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private void y(int n) {
        if (WO.I1ql00("lbzmtb", -1200268703, 233139069, 233139043, 233139070, 796855720, n) != false) {
            WO.I1ql00("mshwkftg", -1200268703, 233139071, 233139044, 233139064, 796855720, n);
            WO.I1ql00("wdtninui", -1200268703, 233139060, 233139044, 233139061, 796855720, (NbL)WO.I1ql00("fbhdgrig", -1200268693, 233139065, 233139066, 233139067, 2052335266));
            WO.I1ql00("rrzqt", -1200268703, 233139071, 233139062, 233139054, 796855720);
            return;
        }
        CallSite callSite = WO.I1ql00("xeingatu", -1200268689, 233139063, 233139044, 233139058, 796855720, (wy)((wy)((Object)WO.I1ql00("wssuos", -1200268693, 233139063, 233139056, 233139048, -940844740)[WO.I1ql00("fbhdgrig", -1200268693, 233139052, 233139057, 233139050, 358995989)[0]])));
        CallSite callSite2 = WO.I1ql00("bpabzxuk", -1200268703, 233139069, 233139055, 233139059, 796855720, n);
        WO.I1ql00("xeingatu", -1200268689, 233139019, 233139014, 233139054, 796855720, (zl)((Object)WO.I1ql00("iycxakza", -1200268689, 233139019, 233139044, 233139012, 796855720, (zl)((Object)WO.I1ql00("psowmcf", -1200268689, 233139019, 233139044, 233139012, 796855720, (zl)((Object)WO.I1ql00("nakb", -1200268689, 233139019, 233139044, 233139012, 796855720, (zl)((Object)WO.I1ql00("wdtninui", -1200268703, 233139020, 233139021, 233139022, 796855720)), (int)WO.I1ql00("fbhdgrig", -1200268693, 233139052, 233139023, 233139047, -1626926405)[3], (int)callSite2, (int)WO.I1ql00("fbhdgrig", -1200268693, 233139052, 233139023, 233139047, -987543328)[4], (Nkq)WO.I1ql00("lbzmtb", -1200268693, 233139016, 233139017, 233139018, -19229389))), (int)WO.I1ql00("xeingatu", -1200268693, 233139052, 233139023, 233139047, 720099815)[5], (int)callSite, (int)WO.I1ql00("zxibtf", -1200268693, 233139052, 233139023, 233139047, -1362107590)[6], (Nkq)WO.I1ql00("psowmcf", -1200268693, 233139016, 233139017, 233139018, 396516947))), (int)WO.I1ql00("rrzqt", -1200268693, 233139052, 233139023, 233139047, -382700790)[7], (int)callSite2, (int)WO.I1ql00("zxibtf", -1200268693, 233139052, 233139013, 233139047, -1976301650)[0], (Nkq)WO.I1ql00("zxibtf", -1200268693, 233139016, 233139017, 233139018, -457067625))));
    }

    @uF
    public void N(ih ih2) {
        block9: {
            block11: {
                block10: {
                    lv lv2;
                    block8: {
                        block7: {
                            WO.I1ql00("mshwkftg", -1200268689, 233139052, 233139053, 233139054, 796855720, (WO)this);
                            lv2 = (lv)((Object)WO.I1ql00("bpabzxuk", -1200268689, 233138979, 233139062, 233139004, 796855720, (ld)((ld)((Object)WO.I1ql00("rrzqt", -1200268691, 233139052, 233139043, 233139048, 2107608191, (WO)this)[WO.I1ql00("grbui", -1200268693, 233139052, 233139021, 233139050, -1526276758)[2]]))));
                            if (lv2 == (lv)((Object)WO.I1ql00("lbzmtb", -1200268691, 233139052, 233139055, 233139048, -367997982, (WO)this)[WO.I1ql00("fbhdgrig", -1200268693, 233139052, 233139021, 233139050, 322388705)[3]])) break block7;
                            if (WO.I1ql00("wssuos", -1200268689, 233139009, 233139005, 233139038, 796855720, (NNNwS)((NNNwS)WO.I1ql00("iycxakza", -1200268691, 233139015, 233139023, 233139048, 373412103, (NNuU)((NNuU)WO.I1ql00("wdtninui", -1200268691, 233139052, 233139014, 233139048, 2130962619, (WO)this)[WO.I1ql00("wssuos", -1200268693, 233139052, 233139021, 233139050, 475337911)[4]]))[WO.I1ql00("lbzmtb", -1200268693, 233139052, 233139021, 233139050, 1628252696)[5]])) != false) break block7;
                            if (WO.I1ql00("grbui", -1200268691, 233139000, 233139014, 233138984, 1410212567, (Nwj)WO.I1ql00("psowmcf", -1200268689, 233139009, 233139006, 233139007, 796855720, (NNNwS)((NNNwS)WO.I1ql00("wssuos", -1200268691, 233139015, 233139023, 233139048, -1724350522, (NNuU)((NNuU)WO.I1ql00("iycxakza", -1200268691, 233139052, 233139014, 233139048, 1362790474, (WO)this)[WO.I1ql00("grbui", -1200268693, 233139052, 233139032, 233139050, -29294861)[0]]))[WO.I1ql00("grbui", -1200268693, 233139052, 233139032, 233139050, -481840760)[1]]))) != false || WO.I1ql00("grbui", -1200268703, 233139069, 233139043, 233139001, 796855720, nQo -> (boolean)WO.I1ql00("lbzmtb", -1200268689, 233138982, 233139055, 233138983, 796855720, (NQo)nQo, (NNNNRR)WO.I1ql00("xeingatu", -1200268693, 233138987, 233138980, 233138981, 19147687))) == false) break block7;
                            if (WO.I1ql00("rrzqt", -1200268689, 233139028, 233138978, 233139058, 796855720, (Integer)((Object)WO.I1ql00("bpabzxuk", -1200268691, 233139009, 233139002, 233139048, -838904943, (NNNwS)((NNNwS)WO.I1ql00("nakb", -1200268691, 233139015, 233139023, 233139048, -1947769919, (NNuU)((NNuU)WO.I1ql00("iycxakza", -1200268691, 233139052, 233139014, 233139048, -649381841, (WO)this)[WO.I1ql00("grbui", -1200268693, 233139052, 233139053, 233139050, -669151980)[0]]))[WO.I1ql00("xeingatu", -1200268693, 233139052, 233139053, 233139050, 1248386953)[1]]))[WO.I1ql00("grbui", -1200268693, 233139052, 233139053, 233139050, 1557041458)[2]])) == false) break block8;
                        }
                        return;
                    }
                    if (lv2 != (lv)((Object)WO.I1ql00("lbzmtb", -1200268691, 233139052, 233139055, 233139048, -1107809215, (WO)this)[WO.I1ql00("wssuos", -1200268693, 233139052, 233139003, 233139050, -1195440559)[0]])) break block9;
                    if (WO.I1ql00("fxrkbkk", -1200268689, 233139040, 233139039, 233139038, 796855720, (Boolean)((Boolean)((Object)WO.I1ql00("nakb", -1200268691, 233139009, 233139003, 233139048, 1780622442, (NNNwS)((NNNwS)WO.I1ql00("psowmcf", -1200268691, 233139015, 233139023, 233139048, -1083019263, (NNuU)((NNuU)WO.I1ql00("zxibtf", -1200268691, 233139052, 233139014, 233139048, -1002703708, (WO)this)[WO.I1ql00("bpabzxuk", -1200268693, 233139052, 233139003, 233139050, -1435148351)[1]]))[WO.I1ql00("mshwkftg", -1200268693, 233139052, 233139003, 233139050, -1689744745)[2]]))[WO.I1ql00("mshwkftg", -1200268693, 233139052, 233139003, 233139050, -62677415)[3]]))) != false) break block10;
                    if (WO.I1ql00("xeingatu", -1200268689, 233139040, 233139039, 233139038, 796855720, (Boolean)((Boolean)((Object)WO.I1ql00("nakb", -1200268691, 233139052, 233139043, 233139048, -762286503, (WO)this)[WO.I1ql00("fbhdgrig", -1200268693, 233139052, 233139003, 233139050, -200515341)[4]]))) != false) break block11;
                }
                return;
            }
            WO.I1ql00("rrzqt", -1200268689, 233138996, 233139062, 233138997, 796855720, (ih)ih2, (boolean)WO.I1ql00("xeingatu", -1200268693, 233139052, 233139033, 233139047, -1969953091)[1]);
            return;
        }
        if (WO.I1ql00("bpabzxuk", -1200268689, 233139040, 233139039, 233139038, 796855720, (Boolean)((Boolean)((Object)WO.I1ql00("grbui", -1200268691, 233139009, 233139003, 233139048, -460602466, (NNNwS)((NNNwS)WO.I1ql00("bpabzxuk", -1200268691, 233139015, 233139023, 233139048, -737138123, (NNuU)((NNuU)WO.I1ql00("rrzqt", -1200268691, 233139052, 233139014, 233139048, 403349342, (WO)this)[WO.I1ql00("fxrkbkk", -1200268693, 233139052, 233139003, 233139050, -442788858)[5]]))[WO.I1ql00("psowmcf", -1200268693, 233139052, 233139003, 233139050, -346198787)[6]]))[WO.I1ql00("fbhdgrig", -1200268693, 233139052, 233139003, 233139050, 249670940)[7]]))) != false) {
            WO.I1ql00("zxibtf", -1200268689, 233138996, 233139062, 233138997, 796855720, (ih)ih2, (boolean)WO.I1ql00("wdtninui", -1200268693, 233139052, 233139033, 233139047, -721137461)[2]);
            return;
        }
        CallSite callSite = WO.I1ql00("iycxakza", -1200268703, 233139040, 233139041, 233139042, 796855720, (boolean)(WO.I1ql00("lbzmtb", -1200268689, 233139040, 233139039, 233139038, 796855720, (Boolean)((Boolean)((Object)WO.I1ql00("nakb", -1200268691, 233139052, 233139043, 233139048, 865435016, (WO)this)[WO.I1ql00("grbui", -1200268693, 233139052, 233138998, 233139050, -1021398359)[0]]))) == false ? WO.I1ql00("xeingatu", -1200268693, 233139052, 233139033, 233139047, 2022847484)[3] : WO.I1ql00("grbui", -1200268693, 233139052, 233139033, 233139047, 1945861280)[4]));
        WO.I1ql00("wssuos", -1200268691, 233139052, 233139043, 233139048, 39857073, (WO)this)[WO.I1ql00("mshwkftg", -1200268693, 233139052, 233138998, 233139050, -743132910)[1]] = callSite;
        WO.I1ql00("lbzmtb", -1200268689, 233138996, 233139062, 233138997, 796855720, (ih)ih2, (boolean)WO.I1ql00("grbui", -1200268689, 233139040, 233139039, 233139038, 796855720, (Boolean)((Boolean)((Object)WO.I1ql00("mshwkftg", -1200268691, 233139052, 233139043, 233139048, -2123362213, (WO)this)[WO.I1ql00("nakb", -1200268693, 233139052, 233138998, 233139050, 1732074978)[2]]))));
    }

    @uF
    public void N(iO iO2) {
        if (WO.I1ql00("bpabzxuk", -1200268689, 233139019, 233139043, 233139038, 796855720, (zl)((Object)WO.I1ql00("wdtninui", -1200268703, 233139020, 233139021, 233139022, 796855720))) != false) {
            WO.I1ql00("psowmcf", -1200268689, 233139024, 233139044, 233139054, 796855720, (iO)iO2);
        }
    }

    @uF
    public void N(Ru ru) {
        WO.I1ql00("xeingatu", -1200268689, 233139052, 233139053, 233139054, 796855720, (WO)this);
        CallSite callSite = WO.I1ql00("wdtninui", -1200268703, 233139040, 233139041, 233139042, 796855720, (boolean)WO.I1ql00("iycxakza", -1200268689, 233139037, 233139062, 233139038, 796855720, (gB)WO.I1ql00("lbzmtb", -1200268691, 233139010, 233139011, 233139036, -1613967685, (NNNww)((NNNww)WO.I1ql00("psowmcf", -1200268691, 233139009, 233139055, 233139048, -1393335068, (NNNwS)((NNNwS)WO.I1ql00("rrzqt", -1200268691, 233139015, 233139023, 233139048, -1422611879, (NNuU)((NNuU)WO.I1ql00("bpabzxuk", -1200268691, 233139052, 233139014, 233139048, 1455047775, (WO)this)[WO.I1ql00("rrzqt", -1200268693, 233139052, 233139068, 233139050, 484608418)[1]]))[WO.I1ql00("mshwkftg", -1200268693, 233139052, 233139008, 233139050, -898768205)[0]]))[WO.I1ql00("zxibtf", -1200268693, 233139052, 233139008, 233139050, -1608905981)[1]]))));
        WO.I1ql00("fxrkbkk", -1200268691, 233139052, 233139043, 233139048, 1491526267, (WO)this)[WO.I1ql00("psowmcf", -1200268693, 233139052, 233139008, 233139050, -1907603016)[2]] = callSite;
        if (WO.I1ql00("psowmcf", -1200268689, 233139040, 233139039, 233139038, 796855720, (Boolean)((Boolean)((Object)WO.I1ql00("mshwkftg", -1200268691, 233139052, 233139043, 233139048, -813904011, (WO)this)[WO.I1ql00("nakb", -1200268693, 233139052, 233139008, 233139050, -1596529929)[3]]))) != false && WO.I1ql00("iycxakza", -1200268689, 233139019, 233139043, 233139038, 796855720, (zl)((Object)WO.I1ql00("iycxakza", -1200268703, 233139020, 233139021, 233139022, 796855720))) == false) {
            WO.I1ql00("iycxakza", -1200268689, 233139052, 233139032, 233139054, 796855720, (WO)this);
            CallSite callSite2 = WO.I1ql00("lbzmtb", -1200268703, 233139040, 233139041, 233139042, 796855720, (boolean)WO.I1ql00("lbzmtb", -1200268693, 233139052, 233139046, 233139047, 1525586851)[4]);
            WO.I1ql00("zxibtf", -1200268691, 233139052, 233139043, 233139048, -298753521, (WO)this)[WO.I1ql00("mshwkftg", -1200268693, 233139052, 233139008, 233139050, 330065258)[4]] = callSite2;
        }
        if (WO.I1ql00("wssuos", -1200268689, 233139040, 233139039, 233139038, 796855720, (Boolean)((Boolean)((Object)WO.I1ql00("psowmcf", -1200268691, 233139052, 233139043, 233139048, 751582327, (WO)this)[WO.I1ql00("iycxakza", -1200268693, 233139052, 233139021, 233139050, 532009635)[0]]))) != false && WO.I1ql00("mshwkftg", -1200268689, 233139019, 233139043, 233139038, 796855720, (zl)((Object)WO.I1ql00("rrzqt", -1200268703, 233139020, 233139021, 233139022, 796855720))) == false) {
            WO.I1ql00("xeingatu", -1200268689, 233139052, 233139013, 233139054, 796855720, (WO)this);
            CallSite callSite3 = WO.I1ql00("grbui", -1200268703, 233139040, 233139041, 233139042, 796855720, (boolean)WO.I1ql00("fxrkbkk", -1200268693, 233139052, 233139033, 233139047, 90263082)[0]);
            WO.I1ql00("lbzmtb", -1200268691, 233139052, 233139043, 233139048, 717497258, (WO)this)[WO.I1ql00("mshwkftg", -1200268693, 233139052, 233139021, 233139050, -524572204)[1]] = callSite3;
        }
    }

    @uF(u=true)
    public void N(iw iw2) {
        WO.I1ql00("grbui", -1200268689, 233139052, 233139053, 233139054, -1200268689, (WO)this);
        if (WO.I1ql00("fbhdgrig", -1200268689, 233139051, 233139044, 233139045, -1200268689, (ln)((ln)((Object)WO.I1ql00("bpabzxuk", -1200268691, 233139052, 233139055, 233139048, -1200268691, (WO)this)[WO.I1ql00("zxibtf", -1200268693, 233139052, 233139049, 233139050, -1200268693)[5]])), (il)iw2) != false) {
            CallSite callSite = WO.I1ql00("wdtninui", -1200268703, 233139040, 233139041, 233139042, 796855720, (boolean)WO.I1ql00("psowmcf", -1200268693, 233139052, 233139046, 233139047, 805902355)[2]);
            WO.I1ql00("psowmcf", -1200268691, 233139052, 233139043, 233139048, -1490777821, (WO)this)[WO.I1ql00("mshwkftg", -1200268693, 233139052, 233139049, 233139050, 2013385092)[6]] = callSite;
        }
        if (WO.I1ql00("xeingatu", -1200268689, 233139051, 233139044, 233139045, -1200268689, (ln)((ln)((Object)WO.I1ql00("bpabzxuk", -1200268691, 233139052, 233139055, 233139048, -1200268691, (WO)this)[WO.I1ql00("mshwkftg", -1200268693, 233139052, 233139049, 233139050, -1200268693)[7]])), (il)iw2) != false) {
            CallSite callSite = WO.I1ql00("fxrkbkk", -1200268703, 233139040, 233139041, 233139042, 796855720, (boolean)WO.I1ql00("psowmcf", -1200268693, 233139052, 233139046, 233139047, 1138371317)[3]);
            WO.I1ql00("fbhdgrig", -1200268691, 233139052, 233139043, 233139048, -1204688082, (WO)this)[WO.I1ql00("bpabzxuk", -1200268693, 233139052, 233139068, 233139050, -1180150270)[0]] = callSite;
        }
    }

    public void N(int n) {
        WO.I1ql00("fxrkbkk", -1200268689, 233139052, 233139053, 233139054, 796855720, (WO)this);
        CallSite callSite = WO.I1ql00("fxrkbkk", -1200268703, 233139028, 233139041, 233139029, 796855720, (int)(WO.I1ql00("iycxakza", -1200268689, 233138977, 233139014, 233139058, 796855720, (kW)((Object)WO.I1ql00("zxibtf", -1200268703, 233139020, 233139025, 233138976, 796855720))) + n));
        WO.I1ql00("bpabzxuk", -1200268691, 233139052, 233139043, 233139048, -1206293784, (WO)this)[WO.I1ql00("wdtninui", -1200268693, 233139052, 233139049, 233139050, 346536618)[0]] = callSite;
    }

    private static /* synthetic */ String R(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-126, 22, 51, 121, 43, -106, -3, 52, -35, -96, 105, 99, -16, 82, -27, -83};
        int n = 0;
        int n2 = 47;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 5;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int R(int n) {
        return Integer.rotateRight(-Integer.rotateRight(Integer.rotateLeft(Integer.rotateRight(n ^ 0xE17A61F0, 4), 20), 30), 15);
    }

    private void G() {
        if (WO.I1ql00("xeingatu", -1200268689, 233139052, 233139021, 233139038, 796855720, (WO)this) != false) {
            return;
        }
        WO.I1ql00("iycxakza", -1200268703, 233138946, 233139044, 233138947, 796855720, () -> WO.I1ql00("fxrkbkk", -1200268689, 233139052, 233139044, 233139064, 796855720, (WO)this, (int)WO.I1ql00("wssuos", -1200268693, 233139052, 233139034, 233139035, 2076922466)[1]), this::y);
    }

    private static /* synthetic */ void ntfClinit() {
        IIijOjO = "|\u00da\u001c\\\u00a6\u0097L\u00a4F\u000eI\u0015\u00d20G\u0082\u00b3\u000e\u00e7i\u0002b\u00d8\u008b{\u009b\u000e-\u00eaa:\u00f3\\\u00f7?J\u0090\u00a1~\u00ba?\nd\u00c4\u00f7(\u00c0\t\n\u00fbcB\u00c7\u00b7\u0018\u00e90T6\u0093\u00f4 \u00c3Y\b\u00a7k\u001f\u0096\u00b4\u0014\u00ea5\u00da\u001c\\\u00a6\u0097L\u00a4c>Q\u00f7?J\u0090\u008d\u0016\u00bc1]\u00e8N\u0000\u00fb.N\u009b\u00b6~\u00b89Y1\u00ce\u001a\u0004X\u00b7\u0016L\u0095\u00a4@\u00a4d\rk\u0090\u00ebV\u0093\u0001\u0015\u00fd.\u001dp\u00d2\u0011b\u00b2\u00a8s\u00ceeCK\u0095\u0088\"\u00d8=E\u00d7s|j\u00ff,G\u00db\u00be@\u00e5oCL\u0099\u00b0|\u0096\u000erp\u00c4sj\u00bf\u0096g\u00f1Z)h\u00d8\u00adq\u00ca\u00e3\u0089\u00c4\u00fb.N\u009b\u00b6~\u00bd9]=\u00cb\u00d7\u0016L\u0095\u00a4@\u00a4d\rk\u0090\u00ebK\u0084\u0005\u008d\u00ff8J\u0091\u00e9\b\u00dd\u00101\u00f8\nT\u0091\u00a1D\u00e5|#w\u00b2\u00a8j\u00945\u00da\u001c\\\u00a6\u0097L\u00a4a#@\u00f15J\u0091\u00b3O\u00ddi\u0000p\u0092v@\u00c4\u00a7\u00d20G\u0082\u00b3\u000e\u00e7i\u0002b\u00d8\u0096l\u009f\u0005\u00ee\u00fc6C\u00cf\u009eK\u00ea~\r*\u0082\u00b0p\u009dD\u00e9\u00eb4E\u0080\u00bbN\u00e5'.l\u00b4\u00abw\u0082\u001e\u00e2\u00fb(\u001d\u00dd\u0084.\u0005\u00da\u001c\\\u00a6\u0097L\u00a4F\u0007t\u0005\u00da\u001c\\\u00a6\u0097L\u00a4F\u001bo\u0003\u00ea;R\u009d\u00b1g\u00e2m\u0000a\u0084\u009b)\u00c0\bG\u00a9>\u0012\u0091\u00b7G\u00bd>Z6\u0092\u00f3!\u0093ZC\u00fakG\u0096\u00e6B\u00bf<Xa\u0096\u00a0(\u0081\u00c4sj\u009e\u00b3W\u00ea'\u0000d\u0099\u00a36\u00b3\u0004\u00c6\u00f2?G\u009a\u00e9i\u00da\u001c\\\u00a6\u0097L\u00a4l\u001e\u00a8\u00da\u001c\\\u00a6\u0097L\u00a4c;\u0011\u00f8\nT\u0091\u00a1D\u00e5|`4\u00d5\u001e`\u008e\u0080d\u00e6'\"g\u00bb\u00ff;\u00da\u001c\\\u00a6\u0097L\u00a4_#\u0005\u00da\u001c\\\u00a6\u0097L\u00a4\u007f\"(\u00d7\u0013o\u00b8\u0099e\u00cdr>@\u009a\u00ebW\u009a\u001a;\u00b7\u0016m\u00b0\u0094[\u00d9M\u0001*\u008d\u00a8\"3\u00da\u001c\\\u00a6\u0097L\u00a4r\u0000\u00c4\u00da\u001c\\\u00a6\u0097L\u00a4d\b#\u00dc\n\u00d2\u0011b\u00b2\u00a8s\u00ceeCi\u00ae\u00ffU\u009b\nT\u00ffuJ\u0095\u00bcF\u00a4[\u0018w\u009e\u00aa~\u00ca'i\u00da\u001c\\\u00a6\u0097L\u00a4r'>\u00de\u0088R\u00b5-X\u00cc\u001fK\u00db\u00beO\u00b0D&\u00da\u001c\\\u00a6\u0097L\u00a4d\u0007\u00a7\u00d2\u0011b\u00b2\u00a8s\u00ceeCK\u0095\u00bc\"\u00d8'\u00c4\u00da\u001c\\\u00a6\u0097L\u00a4F=j\u00cc\u00b6\u0018\u00f7?J\u0090\u008d\u0017\u00ba?X<\u00d5\u001e`\u008e\u0080d\u00e6'\u000bG\u00cc\u0014\u00d5\u001e`\u008e\u0080d\u00e6'\"K\u00b9\u008aK\u00a3PV\u00b7\u0016m\u00b0\u0094[\u00d9M\u0001*\u009c\u0093\"\u001c\u00da\u001c\\\u00a6\u0097L\u00a4l/\u0014\u00e2\u00da\u001c\\\u00a6\u0097L\u00a4\u007f\u0007E\u00b7\u0000\u00c0\u00f0.p\u0095\u00beT\u00ee\u00a7\u00d7so\u0007f\u00d7sp\\\u00f7?J\u0090\u008d\u0014\u00b38TX\u00b7\u0016m\u00b0\u0094[\u00d9M\u0001*\u00b9\u0095u\u00ca3\u00da\u001c\\\u00a6\u0097L\u00a4d\u0002\u001f\u00d2\u0011b\u00b2\u00a8s\u00ceeCr\u008e\u00ff0\u00bd\u0001V\u00e8;\t\u0081\u00a6H\u00e7'#u\u0083\u00adv\u009f\n[\u00a5\u00c1\u00da\u001c\\\u00a6\u0097L\u00a4]!\u00a8\u00da\u001c\\\u00a6\u0097L\u00a4F\"K\u0080\u0097*\u00faE\u00b7\u0016m\u00b0\u0094[\u00d9M\u0001*\u008d\u00a8\"p\u00d2\u0011b\u00b2\u00a8s\u00ceeCl\u009b\u00ff0\u00ab3\u00b7\u0016m\u00b0\u0094[\u00d9M\u0001*\u009c\u0096\"a\u00cd:\u00fb.N\u009b\u00b6~\u00bd9^=n\tn\u00d5\u001e`\u008e\u0080d\u00e6'\"T\u009b\u00ffK\u00da\u001c\\\u00a6\u0097L\u00a4\u007f53\u00da\u001c\\\u00a6\u0097L\u00a4F\"K\u00b9\u0096CP\u00ff,G\u00db\u00a7U\u00e2dCJ\u0087\u00b0p\u009e\u0005[\u00f2\u001c\u00da\u001c\\\u00a6\u0097L\u00a4F=d\u00e2\u00da\u001c\\\u00a6\u0097L\u00a4F\"K\u0080\u00b3\n\u00b7\u0016m\u00b0\u0094[\u00d9M\u0001*\u00b9\u00b3s\u00ca\r\u00ea;R\u009d\u00b1g\u00e2m\u0000a\u0084\u009b)\u0095X\u001f\u00ack\u0015\u00cc\u00e0@\u00bcjT6\u00cf\u00f0!\u0093\u000fJ\u00abj\u0016\u0091\u00e4@\u00efm\n6\u0094\u00a5|\u0095\u00ff6S\u0091\u009dG\u00e9\u00f7?J\u0090\u008d\u0014\u00bf9Y0\u0081\u00b7\u0013(\u00d20G\u0082\u00b3\u000e\u00fe|\u0005i\u00d8\u00a2l\u009f\bt\u00f75H\u00db\u0091N\u00e5{\u0019h\u0092\u00b6\"\u00d8=\u00af\u00d5\u001e`\u008e\u0080d\u00e6'\"g\u008f\u00ff\u00c1\u00da\u001c\\\u00a6\u0097L\u00a4F=jv\u00d5\u001e`\u008e\u0080d\u00e6'\"n\u0086\u00ffK3\u00d2\u0011b\u00b2\u00a8s\u00ceeCK\u00b9\u008aW\u00a39 \u00b7\u0000[\u00f2\u00d20G\u0082\u00b3\u000e\u00e7i\u0002b\u00d8\u0097m\u0083\u0002\u00c7\u00f9aE\u00b7\fP\u00da\u001c\\\u00a6\u0097L\u00a4F\u000e}P\u00da\u001c\\\u00a6\u0097L\u00a4l?;\u00da\u001c\\\u00a6\u0097L\u00a4q\u00a2\u00d20G\u0082\u00b3\u000e\u00fe|\u0005i\u00d8\u00a2l\u009f\b\u00fe\u00f75H\u00db\u0091N\u00e5{\u0019h\u0092\u00b6\"\u00bd\u0001\u00eb\u00e8;\t\u0098\u00b3O\u00ec'>p\u0099\u00aax\u0093\u0007\u00ef\u00a5sp\u00f0K\u00da\u001c\\\u00a6\u0097L\u00a4a\u0004\u001f\u00d2\u0011b\u00b2\u00a8s\u00ceeCa\u008f\u00ff0\u00ab\u001e\u00ca\u001c\u00da\u001c\\\u00a6\u0097L\u00a4o.p\u00d7sj\u009e\u00b3W\u00ea'\u0000d\u0099\u00a36\u00b8\u0005,\u00fb=C\u0086\u00e9\u00c4\u00da\u001c\\\u00a6\u0097L\u00a4r'P\u00da\u001c\\\u00a6\u0097L\u00a4F\"p\u00a2\u0012\u00d2\u0011b\u00b2\u00a8s\u00ceeCi\u00ae\u00ffU\u009b\nL\u00ffuJ\u0095\u00bcF\u00a4[\u0018w\u009e\u00aa~\u00ca0v\u00d5\u001e`\u008e\u0080d\u00e6'\u0000s\u00cc\u00edU\u00ba/|\u00e4\bc\u0099\u00fdM\u00ef3xP\u00da\u001c\\\u00a6\u0097L\u00a4\u007f\u0015\u0014\u00ff,G\u00db\u00be@\u00e5oCG\u0098\u00abu\u0094\n\u0010";
        l1pin0iki = new int[]{29229066, 46006273, 73990147, 56164353, 720915, 72679425, 55312386, 47972362, 6094849, 53411855, 79560705, 0x1000002, 89391121, 65470471, 24969238, 52428801, 7012353, 43646986, 0x900004, 26411018, 46071812, 11, 46333962, 28377101, 57147402, 0x800010, 11796481, 88735754, 62455854, 40173569, 66650115, 45744132, 75563017, 0x1E0001, 52494350, 0xFF0001, 20512779, 5373962, 70516749, 32505866, 30539806, 20447233, 0x1F0001, 84148236, 14221313, 51511309, 60620813, 65929227, 40894476, 81395722, 45023235, 15925260, 56229889, 0x1B00001, 88670209, 0x2040002, 9699345, 82051094, 50855946, 74907658, 15269898, 11862017, 72744979, 83492874, 21954606, 6946817, 37683210, 33947704, 44302337, 37617665, 84934713, 57802766, 0x4410001, 41680912, 69795851, 71434259, 42729486, 27066378, 45219848, 33161226, 7077908, 55443467, 6160396, 61472783, 21233675, 80281615, 0x200028, 52363265, 79626250, 10813455, 6029313, 74186763, 40239114, 68943885, 0xB6000B, 38338588, 46989327, 59899915, 81264642, 56295437, 29884426, 48627746, 58720274, 27721737, 66846752, 14286863, 76152884, 0x33E000E, 4718602, 12648472, 44367882, 16908342};
        WO.b();
        WO.s();
        WO.j();
        WO.T();
    }

    private static /* synthetic */ CallSite I1ql00(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = l1pin0iki[n2 ^ 0xDE56B6C];
        int n7 = n6 >>> 16;
        String string2 = WO.lInnq(IIijOjO.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0xDE56B6C);
        n6 = l1pin0iki[n3 ^ 0xDE56B6C];
        int n8 = n6 >>> 16;
        String string3 = WO.lInnq(IIijOjO.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0xDE56B6C);
        n6 = l1pin0iki[n4 ^ 0xDE56B6C];
        int n9 = n6 >>> 16;
        String string4 = WO.lInnq(IIijOjO.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0xDE56B6C);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xB8755AD9) + -178;
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

    private static /* synthetic */ CallSite IIr00iis(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) throws Exception {
        int n9 = l1pin0iki[n2 ^ 0xDE56B6C];
        int n10 = n9 >>> 16;
        String string2 = WO.lInnq(IIijOjO.substring(n10, n10 + (n9 & 0xFFFF)), n2 ^ 0xDE56B6C);
        n9 = l1pin0iki[n3 ^ 0xDE56B6C];
        int n11 = n9 >>> 16;
        String string3 = WO.lInnq(IIijOjO.substring(n11, n11 + (n9 & 0xFFFF)), n3 ^ 0xDE56B6C);
        n9 = l1pin0iki[n4 ^ 0xDE56B6C];
        int n12 = n9 >>> 16;
        String string4 = WO.lInnq(IIijOjO.substring(n12, n12 + (n9 & 0xFFFF)), n4 ^ 0xDE56B6C);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xB8755AD9) + -178;
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

    private static /* synthetic */ String lInnq(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{85, 98, 56, -38, 43, 13, 111, 119, 37, -74, -33, 45, 27, 2, -4, 78};
        byte[] byArray3 = new byte[]{-8, 5, 109, 127, 38, -79, -97, 83, -101, 40, -77, -114, -70, -73, -113, -87};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void lliqqtmIr(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[112];
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
        IIijOjO = stringBuilder.toString();
        l1pin0iki = nArray;
    }
}
