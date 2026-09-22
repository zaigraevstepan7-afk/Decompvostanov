/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.FJ
 *  KDFzREm.Fo
 *  KDFzREm.NDP
 *  KDFzREm.NNNBF
 *  KDFzREm.NNNwS
 *  KDFzREm.NNuU
 *  KDFzREm.NQo
 *  KDFzREm.NYj
 *  KDFzREm.NkG
 *  KDFzREm.Nkq
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 */
package KDFzREm;

import KDFzREm.FJ;
import KDFzREm.Fo;
import KDFzREm.NDP;
import KDFzREm.NNNBF;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NQo;
import KDFzREm.NYj;
import KDFzREm.NkG;
import KDFzREm.Nkq;
import KDFzREm.zJ;
import KDFzREm.zO;
import KDFzREm.zk;
import KDFzREm.zw;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class zl {
    private static short[] L;
    private static short[] u;
    private static short[] i;
    public Object[] N;
    private static boolean[] R;
    private static byte[] M;
    public static Object[] y;
    private static /* synthetic */ String lOiIkI0;
    private static /* synthetic */ int[] OlnkO0s;

    private static /* synthetic */ int L(int n) {
        return -Integer.rotateLeft(Integer.rotateLeft(Integer.rotateLeft((n ^ 0x259B4A1C) + 1, 24), 5) ^ 0x454FAD64, 1);
    }

    public void L() {
        zl.Iljntl("ohamv", 409283564, 1223490016, 1223490026, 1223490030, -501688771, 1033982384, -861235680, (zJ)((zJ)((Object)zl.Iljntl("csrbwe", 409283566, 1223490022, 1223490023, 1223490021, 752846806, -1191848882, -246424405, (zl)this)[zl.Iljntl("ohamv", 409283560, 1223490022, 1223490031, 1223490019, 881278324, 679205621, 1861166156)[5]])), (zl)this);
    }

    private static void M() {
        M = new byte[]{-1, 5, 3, 4};
    }

    public zl() {
        zl.Iljntl("dtbgm", 409283564, 1223490022, 1223490017, 1223490029, 409283564, 409283564, 409283564, (zl)this);
        ArrayList arrayList = new ArrayList();
        zl.Iljntl("ohamv", 409283566, 1223490022, 1223490023, 1223490021, 409283566, 409283566, 409283566, (zl)this)[zl.Iljntl("frhjmrnb", 409283560, 1223490022, 1223490026, 1223490019, 409283560, 409283560, 409283560)[0]] = arrayList;
        ArrayList arrayList2 = new ArrayList();
        zl.Iljntl("dlopnseq", 409283566, 1223490022, 1223490023, 1223490021, 409283566, 409283566, 409283566, (zl)this)[zl.Iljntl("wjprs", 409283560, 1223490022, 1223490026, 1223490019, 409283560, 409283560, 409283560)[1]] = arrayList2;
        zJ zJ2 = (zJ)((Object)zl.Iljntl("dlopnseq", 409283560, 1223490022, 1223490027, 1223490021, 409283560, 409283560, 409283560)[zl.Iljntl("dtbgm", 409283560, 1223490022, 1223490026, 1223490019, 409283560, 409283560, 409283560)[2]]);
        zl.Iljntl("cukhk", 409283566, 1223490022, 1223490023, 1223490021, 409283566, 409283566, 409283566, (zl)this)[zl.Iljntl("csrbwe", 409283560, 1223490022, 1223490018, 1223490019, 409283560, 409283560, 409283560)[0]] = zJ2;
        CallSite callSite = zl.Iljntl("ohamv", 409283554, 1223490038, 1223490039, 1223490036, 409283554, 409283554, 409283554, (int)zl.Iljntl("csrbwe", 409283560, 1223490022, 1223490024, 1223490025, 409283560, 409283560, 409283560)[0]);
        zl.Iljntl("weagfm", 409283566, 1223490022, 1223490023, 1223490021, 409283566, 409283566, 409283566, (zl)this)[zl.Iljntl("wodvuue", 409283560, 1223490022, 1223490018, 1223490019, 409283560, 409283560, 409283560)[1]] = callSite;
    }

    static {
        zl.ntfClinit();
    }

    private void B() {
        if (zl.Iljntl("dlopnseq", 409283566, 1223490022, 1223490023, 1223490021, 409283566, 409283566, 409283566, (zl)this) == null) {
            zl.Iljntl("wjprs", 409283567, 1223490022, 1223490023, 1223490021, 409283567, 409283567, 409283567, (zl)this, (Object[])new Object[zl.Iljntl("csrbwe", 409283560, 1223490022, 1223490024, 1223490025, 409283560, 409283560, 409283560)[1]]);
            CallSite callSite = zl.Iljntl("frhjmrnb", 409283566, 1223490022, 1223490023, 1223490021, 409283566, 409283566, 409283566, (zl)this);
            callSite[zl.Iljntl("ohamv", 409283560, 1223490022, 1223490024, 1223490025, 409283560, 409283560, 409283560)[2]] = zl.Iljntl("csrbwe", 409283554, 1223490038, 1223490039, 1223490036, 409283554, 409283554, 409283554, (int)zl.Iljntl("frhjmrnb", 409283560, 1223490022, 1223489994, 1223489995, 409283560, 409283560, 409283560)[1]);
            callSite[zl.Iljntl("dlopnseq", 409283560, 1223490022, 1223490024, 1223490025, 409283560, 409283560, 409283560)[3]] = zl.Iljntl("dtbgm", 409283554, 1223489992, 1223490039, 1223489993, 409283554, 409283554, 409283554, (boolean)zl.Iljntl("frhjmrnb", 409283560, 1223490022, 1223489994, 1223489995, 409283560, 409283560, 409283560)[2]);
        }
    }

    private static void Z() {
        R = new boolean[]{false, false, false, true};
    }

    public zl i() {
        zl.Iljntl("gfor", 409283564, 1223490016, 1223490027, 1223490030, -501688771, 1033982384, -861235680, (zJ)((zJ)((Object)zl.Iljntl("gfor", 409283566, 1223490022, 1223490023, 1223490021, 427008501, 391238746, 1833814593, (zl)this)[zl.Iljntl("dtbgm", 409283560, 1223490022, 1223490018, 1223490019, 621223596, -341846032, 924206617)[5]])), (zl)this);
        return this;
    }

    private static void z() {
        y = new Object[]{null};
    }

    public boolean u() {
        return (boolean)zl.Iljntl("weagfm", 409283564, 1223490016, 1223490024, 1223490006, -501688771, 1033982384, -861235680, (zJ)((zJ)((Object)zl.Iljntl("cukhk", 409283566, 1223490022, 1223490023, 1223490021, -509139228, -1950445462, -2002551606, (zl)this)[zl.Iljntl("frhjmrnb", 409283560, 1223490022, 1223490018, 1223490019, -863328393, 728444208, 1069978299)[2]])), (zl)this);
    }

    private static /* synthetic */ int u(int n) {
        return Integer.rotateRight(Integer.rotateRight(Integer.rotateRight(Integer.rotateLeft(Integer.rotateLeft(n, 4), 16), 2) ^ 0x6B32E7CF, 29) ^ 0xF7FAD334, 6) ^ 0xB8F2F20E;
    }

    public zl y(NDP nDP) {
        return zl.Iljntl("csrbwe", 409283564, 1223490022, 1223490023, 1223489997, -501688771, 1033982384, -861235680, (zl)this, (zO)new zO((int)zl.Iljntl("frhjmrnb", 409283564, 1223490007, 1223490023, 1223490043, -501688771, 1033982384, -861235680, (NDP)nDP), (int)zl.Iljntl("gtfm", 409283564, 1223490007, 1223490027, 1223490043, -501688771, 1033982384, -861235680, (NDP)nDP), (short)zl.Iljntl("csrbwe", 409283564, 1223490007, 1223490031, 1223490004, -501688771, 1033982384, -861235680, (NDP)nDP), (byte)zl.Iljntl("gtfm", 409283564, 1223490007, 1223490026, 1223490005, -501688771, 1033982384, -861235680, (NDP)nDP), (Nkq)zl.Iljntl("cukhk", 409283564, 1223490007, 1223490024, 1223490002, -501688771, 1033982384, -861235680, (NDP)nDP), (Fo)zl.Iljntl("dtbgm", 409283564, 1223490007, 1223490003, 1223490000, -501688771, 1033982384, -861235680, (NDP)nDP), (Int2ObjectMap<Fo>)zl.Iljntl("dlopnseq", 409283564, 1223490007, 1223490017, 1223490001, -501688771, 1033982384, -861235680, (NDP)nDP)));
    }

    private static /* synthetic */ int y(int n) {
        return Integer.rotateLeft(Integer.rotateRight(Integer.rotateRight(Integer.rotateLeft(Integer.rotateRight(-n, 3), 28), 2), 21) ^ 0x2611882E, 4);
    }

    public void y() {
        zl.Iljntl("csrbwe", 409283564, 1223490016, 1223490023, 1223490030, -501688771, 1033982384, -861235680, (zJ)((zJ)((Object)zl.Iljntl("ohamv", 409283566, 1223490022, 1223490023, 1223490021, 856360594, -1480706060, -1245659404, (zl)this)[zl.Iljntl("gfor", 409283560, 1223490022, 1223490031, 1223490019, -1026127582, -1441751131, -209697084)[4]])), (zl)this);
    }

    public zl y(zw zw2) {
        zl.Iljntl("gtfm", 409283564, 1223490016, 1223490027, 1223490028, -501688771, 1033982384, -861235680, (zJ)((zJ)((Object)zl.Iljntl("ohamv", 409283566, 1223490022, 1223490023, 1223490021, 2125051916, 1907431528, 331442430, (zl)this)[zl.Iljntl("dlopnseq", 409283560, 1223490022, 1223490031, 1223490019, 127701984, -369127360, 564148608)[0]])), (zw)zw2, (zl)this);
        return this;
    }

    public zl N(zJ zJ2) {
        zJ zJ3 = zJ2;
        zl.Iljntl("wodvuue", 409283566, 1223490022, 1223490023, 1223490021, 409283566, 409283566, 409283566, (zl)this)[zl.Iljntl("wodvuue", 409283560, 1223490022, 1223490031, 1223490019, 409283560, 409283560, 409283560)[6]] = zJ3;
        return this;
    }

    public zl N(NDP nDP) {
        return zl.Iljntl("dlopnseq", 409283564, 1223490022, 1223490023, 1223490020, -501688771, 1033982384, -861235680, (zl)this, (zk)new zk((int)zl.Iljntl("cukhk", 409283564, 1223490007, 1223490023, 1223490043, -501688771, 1033982384, -861235680, (NDP)nDP), (int)zl.Iljntl("wodvuue", 409283564, 1223490007, 1223490031, 1223490004, -501688771, 1033982384, -861235680, (NDP)nDP), (int)zl.Iljntl("ohamv", 409283564, 1223490007, 1223490026, 1223490005, -501688771, 1033982384, -861235680, (NDP)nDP), (Nkq)zl.Iljntl("wjprs", 409283564, 1223490007, 1223490024, 1223490002, -501688771, 1033982384, -861235680, (NDP)nDP)));
    }

    public zl N(zO zO2) {
        zl.Iljntl("wjprs", 409283564, 1223490016, 1223490023, 1223490037, -501688771, 1033982384, -861235680, (zJ)((zJ)((Object)zl.Iljntl("dlopnseq", 409283566, 1223490022, 1223490023, 1223490021, -1544441932, 1861167848, -281628891, (zl)this)[zl.Iljntl("dtbgm", 409283560, 1223490022, 1223490018, 1223490019, 367742214, -689155859, 470645163)[6]])), (zO)zO2, (zl)this);
        return this;
    }

    public zl N(zw zw2) {
        zl.Iljntl("dlopnseq", 409283564, 1223490016, 1223490023, 1223490028, -501688771, 1033982384, -861235680, (zJ)((zJ)((Object)zl.Iljntl("frhjmrnb", 409283566, 1223490022, 1223490023, 1223490021, 1820659225, -252745977, 1137199799, (zl)this)[zl.Iljntl("weagfm", 409283560, 1223490022, 1223490031, 1223490019, -1798577513, 1270020876, 672806164)[3]])), (zw)zw2, (zl)this);
        return this;
    }

    public zl N() {
        zl.Iljntl("wjprs", 409283564, 1223490016, 1223490017, 1223490030, -501688771, 1033982384, -861235680, (zJ)((zJ)((Object)zl.Iljntl("gfor", 409283566, 1223490022, 1223490023, 1223490021, -1960607595, -2134135907, 1730923610, (zl)this)[zl.Iljntl("frhjmrnb", 409283560, 1223490022, 1223490018, 1223490019, 625735590, -1089133252, 1064053599)[4]])), (zl)this);
        return this;
    }

    public zl N(int n, int n2, int n3, Nkq nkq) {
        return zl.Iljntl("dlopnseq", 409283564, 1223490022, 1223490023, 1223490020, -501688771, 1033982384, -861235680, (zl)this, (zk)new zk(n, n2, n3, nkq));
    }

    public zl N(int n, short s, byte by, Nkq nkq) {
        NkG nkG = (NkG)zl.Iljntl("csrbwe", 409283566, 1223490047, 1223490044, 1223490021, -1335669088, 687636433, 461399031, (NNNwS)((NNNwS)zl.Iljntl("dtbgm", 409283566, 1223490035, 1223490046, 1223490021, 1461751120, 1677066658, -49782639, (NNuU)zl.Iljntl("gtfm", 409283554, 1223490035, 1223490032, 1223490033, -501688771, 1033982384, -861235680))[zl.Iljntl("cukhk", 409283560, 1223490022, 1223490031, 1223490019, -1990713819, 898897734, -626222096)[1]]))[zl.Iljntl("cukhk", 409283560, 1223490022, 1223490031, 1223490019, -953018383, 536422476, -1065464448)[2]];
        CallSite callSite = zl.Iljntl("dlopnseq", 409283564, 1223490045, 1223490042, 1223490043, -501688771, 1033982384, -861235680, (NkG)nkG);
        Int2ObjectOpenHashMap int2ObjectOpenHashMap = new Int2ObjectOpenHashMap();
        CallSite callSite2 = zl.Iljntl("gtfm", 409283554, 1223489984, 1223490027, 1223489985, -501688771, 1033982384, -861235680, (NQo)zl.Iljntl("dlopnseq", 409283564, 1223490041, 1223490018, 1223489990, -501688771, 1033982384, -861235680, (NYj)zl.Iljntl("weagfm", 409283564, 1223490045, 1223490031, 1223490040, -501688771, 1033982384, -861235680, (NkG)nkG, s)), (FJ)zl.Iljntl("wodvuue", 409283564, 1223489989, 1223489986, 1223489987, -501688771, 1033982384, -861235680, (NNNBF)zl.Iljntl("frhjmrnb", 409283564, 1223490035, 1223489991, 1223489988, -501688771, 1033982384, -861235680, (NNuU)zl.Iljntl("weagfm", 409283554, 1223490035, 1223490032, 1223490033, -501688771, 1033982384, -861235680))));
        zl.Iljntl("wodvuue", 409283555, 1223489998, 1223489999, 1223489996, -501688771, 1033982384, -861235680, (Int2ObjectMap)int2ObjectOpenHashMap, s, (Object)callSite2);
        return zl.Iljntl("ohamv", 409283564, 1223490022, 1223490023, 1223489997, -501688771, 1033982384, -861235680, (zl)this, (zO)new zO(n, (int)callSite, s, by, nkq, (Fo)callSite2, (Int2ObjectMap<Fo>)int2ObjectOpenHashMap));
    }

    public zl N(zk zk2) {
        zl.Iljntl("gtfm", 409283564, 1223490016, 1223490023, 1223490034, -501688771, 1033982384, -861235680, (zJ)((zJ)((Object)zl.Iljntl("wodvuue", 409283566, 1223490022, 1223490023, 1223490021, 886296284, -854165546, 1123747053, (zl)this)[zl.Iljntl("frhjmrnb", 409283560, 1223490022, 1223490018, 1223490019, -233680741, -1088157544, 6341673)[3]])), (zk)zk2, (zl)this);
        return this;
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateRight(Integer.rotateLeft(-Integer.rotateRight(n ^ 0x40D519BC, 17), 10), 27);
    }

    private static void R() {
        u = new short[]{0, 1, 0};
        i = new short[]{2, 3, 2, 2, 2, 2, 2};
        L = new short[]{2, 4, 3, 2, 2, 2, 2};
    }

    private static /* synthetic */ void ntfClinit() {
        zl.IIspnt(new String[]{"\u0000\b\u0000\u000f\u00f6H\u0017F\u00b8\b\u008b\u0096m_\u0081v\u00ce\u00b7\u007f\u00004\u0000\u000ft-\u0010I\u00ba4\u00a3\u0081E\u001d\u00d4T\u009e\u00ef\u0012\u0000\u001d\u0000\u0003\u008f-\u0015\u0000\u0000\u0000\n\u00d9@\u001ax\u00ac7\u00b4\u00fcz\u001c\u0000!\u0000\u0002CA\u0000\u001f\u0000\u000b\u00bc@\u001ax\u00ac7\u00b4\u00fcN)\u0091\u0000,\u0000\u0001\u0014\u0000\u001b\u0000\u000b\u009e@\u001ax\u00ac7\u00b4\u00fcN\u001b\u00bc\u0000\f\u0000\u00013\u0000\"\u0000\u0011(-\u0010I\u00ba4\u00a3\u0081E\u001d\u00d4T\u00bb\u00d0kf;\u0000\u0013\u0000\u001b\u0095H\u0017F\u00b8\b\u008b\u0096m_\u0081U\u00ce\u00d2bd\u00fb~\u000eG\u0093]\u00a3\u00bf;Y\u00ad\u0000*\u0000'\u00eeM\u0010h\u009f\u0004\u00b8\u00fcl\u0011\u0095}\u00da\u00d1K\u0090\u00a3g(9\u00d7>\u00b3\u00b2v\u0011\u00d4v\u0094\u00f0N\u00d5\u0089f6g\u009d\u0006\u00e2\u0000\n\u0000\u001b\u00eeH\u0017F\u00b8\b\u008b\u0096m_\u0081m\u00ce\u00d2b\u00be\u0080~\u000eG\u0093]\u00a3\u00bf;Y\u00ad\u0000\t\u0000\u0001\u009b\u0000\u0006\u0000\n\u00be@\u001ax\u00ac7\u00b4\u00fcz:\u0000\u0017\u0000\u0010\u00f6-\u0010I\u00ba4\u00a3\u0081E\u001d\u00d4T\u00bb\u00eb|\u0087\u00006\u0000\u000e\u00dd-\u0010I\u00ba4\u00a3\u0081E\u001d\u00d4\\\u009a\u00a5\u0000\u0007\u0000\u0001\u009c\u0000(\u0000(\u00b7psw\u0090\u001b\u00b4\u00ba/\u0014\u0088s\u00da\u00f8HQ\u00aaq(k\u0092]\u00b0\u00bdt\u0003\u00d4S\u009b\u00ea\u001bm\u00bcn9a\u008a?\u00b8\u00a3\u00005\u0000\u0001\u0011\u0000'\u0000'\u00f6H\u0017F\u00b8\b\u008b\u0096m_\u00b5K\u009a\u00a5e\u00f7\u009aB&P\u00bb\u001f\u00f6\u0095JK\u00d2V\u00be\u00dao\u00c6\u008cA1-\u00b8\u001d\u00e2\u0000\u0018\u0000\u0001\u008a\u0000%\u0000\u000ec-\u0010I\u00ba4\u00a3\u0081E\u001d\u00d4\\\u00bf\u00a5\u0000\u0010\u0000\u0011\u00f8e*c\u00d1\u001e\u00b8\u00bdg_\u00b2t\u0081\u00fbN/\u00e0\u0000\u000e\u0000\u0001D\u0000\u0003\u0000\u0013\u00e6H6c\u0088\u0013\u00f6\u00bfa\u001e\u009c5\u00ba\u00fcCE\u00depg\u0000\u001c\u0000\u0001<\u0000\r\u0000\u0001\u00de\u0000\u0015\u0000\f\u0000@\u001ax\u00ac7\u00b4\u00fcN>\u008eO\u0000 \u0000\u000f\u00ba-\u0010I\u00ba4\u00a3\u0081E\u001d\u00d4T\u00a4\u00f1\u0012\u0000\u0001\u0000\u0001C\u0000\u0002\u0000\u001a(H\u0017F\u00b8\b\u008b\u0096m_\u0081q\u00ce\u00b7ekDB&P\u00bb\u001f\u00f6\u00a9lK\u00000\u0000\u000f\u00baH\u0017F\u00b8\b\u008b\u0096m_\u0081v\u00ce\u00b7s\u0000\u0019\u0000\r\u009c@\u001ax\u00ac7\u00b4\u00fcN>\u00b5m\u00a6\u0000\u0014\u0000\u001btH\u0017F\u00b8\b\u008b\u0096m_\u0081q\u00ce\u00d2bD\u001a~\u000eG\u0093]\u00a3\u00bf;Y\u00ad\u0000\u0016\u0000\u0002\u00bbu\u0000&\u0000\n\u00be@\u001ax\u00ac7\u00b4\u00fcF\u001f\u0000\u0012\u0000\u0016(MuN\u0094\u0013\u00af\u00b2/\u001c\u009at\u0092\u00b1`Nta;g\u008cI\u0000)\u0000\u0003\u00a7q(\u0000-\u0000\u0002\u00fc^\u0000\u001a\u0000(\u00a0m9n\u009a\u0001\u0086\u00e37\u0016\u009a)\u00c6\u00af\u0018\u0098\u00f6aef\u00cd\u0017\u00e0\u00b18H\u00c8~\u00c5\u00a7\u001b\u00c8\u00f4=m;\u009c\u0014\u00ec\u00b2\u0000\u0011\u0000\u0007{e0w\u009b=\u00bf\u0000\u0004\u0000\u00015\u0000.\u0000\u0011ce*c\u00d1\u001e\u00b8\u00bdg_\u00b9u\u009a\u00f2L1g\u0000#\u0000\r\u00f6@\u001ax\u00ac7\u00b4\u00fcN>\u00b5X\u00b3\u0000/\u0000\u0016\u00df^uN\u0094\u0013\u00af\u00b2/\u001c\u009at\u0092\u00b1k?\u0098h9c\u0090I\u00002\u0000\u0003(-\u000f\u0000+\u0000\u001a\u00fdH\u0017F\u00b8\b\u008b\u0096m_\u0081U\u00ce\u00b7e\u00b1\u0091B&P\u00bb\u001f\u00f6\u00a9lK\u00007\u0000,\u00f6-\u0010k\u008a]\u00ac\u00bdi\u001d\u00925\u0091\u00ed@\u0093\u00b8e/v\u008b\u0006\u00b0\u00bf/\u0019\u0095n\u0086\u00b1`\u00d2\u00aa6\u0013`\u0094\u0017\u00ba\u00a7M\u0011\u008b!\u0000\u001e\u0000\u0010!MuN\u00b56\u009f\u00a9R5\u00965\u00bb\u00c7Ck\u0000\u0005\u0000\u0002\u0010W\u0000\u000b\u0000\u0003\u00fd-\n\u0000\u000f\u0000\u0002\u00acF\u0000$\u0000\u0001\r\u00003\u0000\u0003\u0095-\u001e\u00001\u0000\u000bF@\u001ax\u00ac7\u00b4\u00fcN4\u00ab"});
        zl.R();
        zl.M();
        zl.Z();
        zl.z();
        zl.y[0] = new zJ();
    }

    private static /* synthetic */ String lOpmII(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{0, 13, 92, -43, 9, -89, -110, -34, -58, -41, 70, -67, -11, 75, -34, -9};
        byte[] byArray3 = new byte[]{34, -5, -50, -118, -99, 30, -127, 58, -128, 126, -109, 102, -76, -96, -81, -102};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite Iljntl(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = OlnkO0s[n2 ^ 0x48ECF9E6];
        int n9 = n8 >>> 16;
        String string2 = zl.lOpmII(lOiIkI0.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x48ECF9E6);
        n8 = OlnkO0s[n3 ^ 0x48ECF9E6];
        int n10 = n8 >>> 16;
        String string3 = zl.lOpmII(lOiIkI0.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x48ECF9E6);
        n8 = OlnkO0s[n4 ^ 0x48ECF9E6];
        int n11 = n8 >>> 16;
        String string4 = zl.lOpmII(lOiIkI0.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x48ECF9E6);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x18652B5A) + -178;
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

    private static /* synthetic */ void IIspnt(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[56];
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
        lOiIkI0 = stringBuilder.toString();
        OlnkO0s = nArray;
    }

    private static /* synthetic */ CallSite lIlsjj00l(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = OlnkO0s[n2 ^ 0x48ECF9E6];
        int n7 = n6 >>> 16;
        String string2 = zl.lOpmII(lOiIkI0.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0x48ECF9E6);
        n6 = OlnkO0s[n3 ^ 0x48ECF9E6];
        int n8 = n6 >>> 16;
        String string3 = zl.lOpmII(lOiIkI0.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0x48ECF9E6);
        n6 = OlnkO0s[n4 ^ 0x48ECF9E6];
        int n9 = n6 >>> 16;
        String string4 = zl.lOpmII(lOiIkI0.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0x48ECF9E6);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x18652B5A) + -178;
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
