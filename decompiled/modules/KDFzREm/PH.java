/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NNNZZ
 *  KDFzREm.NNNZg
 *  KDFzREm.NNNgN
 *  KDFzREm.NNNwS
 *  KDFzREm.NNuU
 *  KDFzREm.NQo
 *  KDFzREm.NbL
 *  KDFzREm.Nkt
 */
package KDFzREm;

import KDFzREm.NNNZZ;
import KDFzREm.NNNZg;
import KDFzREm.NNNgN;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NQo;
import KDFzREm.NbL;
import KDFzREm.Nkt;
import KDFzREm.RE;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.ic;
import KDFzREm.lQ;
import KDFzREm.lY;
import KDFzREm.uF;
import KDFzREm.zl;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;

@UZ(L="AutoEat", y=UR.PLAYER, N=Uz.AUTO)
public class PH
extends UM {
    private static byte[] u;
    private static short[] i;
    private static short[] R;
    private static String[] M;
    private static boolean[] B;
    private static short[] Z;
    private static short[] z;
    public Object[] L;
    private static short[] U;
    private static float[] W;
    private static boolean[] m;
    private static /* synthetic */ String l1tmjstns;
    private static /* synthetic */ int[] l1nri00mt;

    private static /* synthetic */ int L(int n) {
        return Integer.rotateRight(Integer.rotateRight(Integer.rotateLeft(Integer.rotateRight(-n, 25), 16), 27), 20);
    }

    private static void P() {
        M = new String[]{"value"};
    }

    private boolean T() {
        PH.I1lsssrm("lbczjgs", -613319346, -145065249, -145065275, -145065276, 1870026788, -571471555, (PH)this);
        return (boolean)((float)PH.I1lsssrm("dohvlty", -613319346, -145065224, -145065221, -145065266, 1870026788, -571471555, (Nkt)PH.I1lsssrm("dohvlty", -613319346, -145065272, -145065274, -145065223, 1870026788, -571471555, (NNNwS)((NNNwS)PH.I1lsssrm("prwmu", -613319348, -145065260, -145065257, -145065261, -1504548586, -547005630, (NNuU)((NNuU)PH.I1lsssrm("xdfcp", -613319348, -145065249, -145065264, -145065261, -1777143714, 1533923050, (PH)this)[PH.I1lsssrm("dohvlty", -613319350, -145065249, -145065273, -145065259, 1829571956, 83425417)[0]]))[PH.I1lsssrm("cogeq", -613319350, -145065249, -145065273, -145065259, 2142548303, 1942268014)[1]]))) < PH.I1lsssrm("zfnak", -613319346, -145065217, -145065218, -145065231, 1870026788, -571471555, (Float)((Float)((Object)PH.I1lsssrm("pnveprpc", -613319346, -145065219, -145065273, -145065220, 1870026788, -571471555, (lQ)((lQ)((Object)PH.I1lsssrm("zfnak", -613319348, -145065249, -145065222, -145065261, 25049358, -1494987860, (PH)this)[PH.I1lsssrm("tfxdfpnz", -613319350, -145065249, -145065273, -145065259, 2099746489, 1216282898)[2]])))))) ? PH.I1lsssrm("prwmu", -613319350, -145065249, -145065250, -145065263, 1262497352, -63140941)[7] : PH.I1lsssrm("pnveprpc", -613319350, -145065249, -145065256, -145065263, 366811072, -1952475846)[0]);
    }

    public PH() {
        PH.I1lsssrm("pnveprpc", -613319346, -145065249, -145065275, -145065276, -613319346, -613319346, (PH)this);
        CallSite callSite = PH.I1lsssrm("lvwuyljn", -613319360, -145065242, -145065221, -145065319, -613319360, -613319360, (lY)this, (String)((Object)PH.I1lsssrm("cogeq", -613319350, -145065249, -145065267, -145065243, -613319350, -613319350)[0]), (float)PH.I1lsssrm("pnveprpc", -613319350, -145065249, -145065244, -145065241, -613319350, -613319350)[0], (float)PH.I1lsssrm("xdfcp", -613319350, -145065249, -145065244, -145065241, -613319350, -613319350)[1], (float)PH.I1lsssrm("tfxdfpnz", -613319350, -145065249, -145065244, -145065241, -613319350, -613319350)[2], (float)PH.I1lsssrm("tfxdfpnz", -613319350, -145065249, -145065244, -145065241, -613319350, -613319350)[3]);
        PH.I1lsssrm("prwmu", -613319348, -145065249, -145065222, -145065261, -613319348, -613319348, (PH)this)[PH.I1lsssrm("zfnak", -613319350, -145065249, -145065234, -145065259, -613319350, -613319350)[0]] = callSite;
    }

    static {
        PH.ntfClinit();
    }

    private static /* synthetic */ int i(int n) {
        return -Integer.rotateLeft(Integer.rotateRight(Integer.rotateRight(-Integer.rotateLeft(Integer.rotateLeft(n, 28), 15), 14), 28), 7);
    }

    private static void b() {
        B = new boolean[]{true, false, false, true, false, false, false, true};
        m = new boolean[]{false, false, true, false};
    }

    private static void s() {
        u = new byte[]{4, 2};
    }

    private static void n() {
        W = new float[]{18.0f, 0.0f, 20.0f, 1.0f};
    }

    private boolean m() {
        block10: {
            block9: {
                block8: {
                    block7: {
                        if (PH.I1lsssrm("lbczjgs", -613319346, -145065254, -145065251, -145065252, 1870026788, -571471555, (zl)((Object)PH.I1lsssrm("lbczjgs", -613319360, -145065255, -145065256, -145065253, 1870026788, -571471555))) != false) {
                            return (boolean)PH.I1lsssrm("lvwuyljn", -613319350, -145065249, -145065250, -145065263, -323363711, 535961348)[4];
                        }
                        if (PH.I1lsssrm("zfnak", -613319346, -145065258, -145065271, -145065252, 1870026788, -571471555, (NNNZZ)((NNNZZ)PH.I1lsssrm("prwmu", -613319348, -145065260, -145065257, -145065261, 869806008, -1476998406, (NNuU)((NNuU)PH.I1lsssrm("yplri", -613319348, -145065249, -145065264, -145065261, 1024359100, 1657244681, (PH)this)[PH.I1lsssrm("lbczjgs", -613319350, -145065249, -145065262, -145065259, -244376374, 724884018)[0]]))[PH.I1lsssrm("tfxdfpnz", -613319350, -145065249, -145065262, -145065259, 2076821801, -2033149650)[1]])) != false) break block7;
                        if (PH.I1lsssrm("lbczjgs", -613319346, -145065272, -145065269, -145065252, 1870026788, -571471555, (NNNwS)((NNNwS)PH.I1lsssrm("tfxdfpnz", -613319348, -145065260, -145065257, -145065261, 900934934, 1257150820, (NNuU)((NNuU)PH.I1lsssrm("ejvt", -613319348, -145065249, -145065264, -145065261, 1852283511, -2046057765, (PH)this)[PH.I1lsssrm("xdfcp", -613319350, -145065249, -145065262, -145065259, -781279951, -354677786)[2]]))[PH.I1lsssrm("yplri", -613319350, -145065249, -145065262, -145065259, -413346745, 1444715424)[3]])) == false) break block8;
                    }
                    return (boolean)PH.I1lsssrm("dohvlty", -613319350, -145065249, -145065250, -145065263, 353713239, 1254699011)[5];
                }
                if (PH.I1lsssrm("tfxdfpnz", -613319346, -145065272, -145065270, -145065252, 1870026788, -571471555, (NNNwS)((NNNwS)PH.I1lsssrm("cogeq", -613319348, -145065260, -145065257, -145065261, 278030358, -685042979, (NNuU)((NNuU)PH.I1lsssrm("pnveprpc", -613319348, -145065249, -145065264, -145065261, -1311761339, 1523786668, (PH)this)[PH.I1lsssrm("prwmu", -613319350, -145065249, -145065262, -145065259, 622119990, -1431172548)[4]]))[PH.I1lsssrm("prwmu", -613319350, -145065249, -145065262, -145065259, -1047389426, -1624426869)[5]])) != false) break block9;
                if (PH.I1lsssrm("lbczjgs", -613319346, -145065268, -145065265, -145065266, 1870026788, -571471555, (Integer)((Object)PH.I1lsssrm("yplri", -613319348, -145065260, -145065267, -145065261, 835115229, -1430754561, (NNuU)((NNuU)PH.I1lsssrm("lvwuyljn", -613319348, -145065249, -145065264, -145065261, -2023537737, -1559228372, (PH)this)[PH.I1lsssrm("cogeq", -613319350, -145065249, -145065262, -145065259, 1186552012, 1724704069)[6]]))[PH.I1lsssrm("cogeq", -613319350, -145065249, -145065262, -145065259, 986690981, -2126515199)[7]])) == false) break block10;
            }
            return (boolean)PH.I1lsssrm("zfnak", -613319350, -145065249, -145065250, -145065263, -730888155, 1496645857)[6];
        }
        return (boolean)PH.I1lsssrm("xdfcp", -613319346, -145065249, -145065257, -145065252, 1870026788, -571471555, (PH)this);
    }

    private static void v() {
        Z = new short[]{0, 0};
        R = new short[]{4, 1, 0, 4, 1, 1, 0, 4};
        z = new short[]{0, 4, 0, 3, 0, 4, 1};
        U = new short[]{0, 2, 0, 4, 0, 4, 0, 4};
        i = new short[]{0, 4, 0};
    }

    private void j() {
        if (PH.I1lsssrm("dohvlty", -613319348, -145065249, -145065222, -145065261, -613319348, -613319348, (PH)this) == null) {
            PH.I1lsssrm("pnveprpc", -613319347, -145065249, -145065222, -145065261, -613319347, -613319347, (PH)this, (Object[])new Object[PH.I1lsssrm("tfxdfpnz", -613319350, -145065249, -145065251, -145065232, -613319350, -613319350)[1]]);
            CallSite callSite = PH.I1lsssrm("cogeq", -613319348, -145065249, -145065222, -145065261, -613319348, -613319348, (PH)this);
            callSite[PH.I1lsssrm("cogeq", -613319350, -145065249, -145065256, -145065263, -613319350, -613319350)[2]] = PH.I1lsssrm("pnveprpc", -613319360, -145065229, -145065230, -145065227, -613319360, -613319360, (boolean)PH.I1lsssrm("cogeq", -613319350, -145065249, -145065256, -145065263, -613319350, -613319350)[3]);
        }
    }

    private static /* synthetic */ int u(int n) {
        return Integer.rotateLeft(Integer.rotateRight(Integer.rotateRight(n ^ 0x26B3F8A6, 23) ^ 0x3302101C, 16), 10);
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-5, 15, -63, -104, 60, -29, -30, 28, 6, -70, 106, 45, -79, -27, -98, 19};
        int n = 0;
        int n2 = 61;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 121;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int y(int n) {
        return Integer.rotateLeft(Integer.rotateLeft(Integer.rotateRight(-n, 29) ^ 0x40B569AC, 4) ^ 0x48B4B913, 12);
    }

    private boolean N(NQo nQo) {
        block3: {
            block2: {
                if (nQo == null) break block2;
                if (PH.I1lsssrm("dohvlty", -613319346, -145065279, -145065280, -145065252, 1870026788, -571471555, (NQo)nQo) == false) break block3;
            }
            return (boolean)PH.I1lsssrm("pnveprpc", -613319350, -145065249, -145065256, -145065263, -1081469162, 2018033966)[1];
        }
        return (boolean)PH.I1lsssrm("ejvt", -613319360, -145065277, -145065262, -145065278, 1870026788, -571471555, (NQo)nQo);
    }

    /*
     * Unable to fully structure code
     */
    @uF
    public void N(RE var1_1) {
        PH.I1lsssrm("lbczjgs", -613319346, -145065249, -145065275, -145065276, 1870026788, -571471555, (PH)this);
        if ((NNNwS)PH.I1lsssrm("xdfcp", -613319348, -145065260, -145065257, -145065261, -1097047450, -95182892, (NNuU)((NNuU)PH.I1lsssrm("lbczjgs", -613319348, -145065249, -145065264, -145065261, 1158287867, 977111414, (PH)this)[PH.I1lsssrm("cogeq", -613319350, -145065249, -145065234, -145065259, 1250262537, -894677782)[1]]))[PH.I1lsssrm("lvwuyljn", -613319350, -145065249, -145065280, -145065259, -677103196, -514460342)[0]] == null) {
            return;
        }
        if (PH.I1lsssrm("dohvlty", -613319346, -145065229, -145065247, -145065252, 1870026788, -571471555, (Boolean)((Boolean)PH.I1lsssrm("zfnak", -613319348, -145065249, -145065222, -145065261, -186413725, -1007841914, (PH)this)[PH.I1lsssrm("dohvlty", -613319350, -145065249, -145065280, -145065259, 2093641843, 1678122524)[1]])) == false || PH.I1lsssrm("xdfcp", -613319346, -145065249, -145065257, -145065252, 1870026788, -571471555, (PH)this) == false) ** GOTO lbl-1000
        if (PH.I1lsssrm("tfxdfpnz", -613319346, -145065249, -145065221, -145065278, 1870026788, -571471555, (PH)this, (NQo)PH.I1lsssrm("xdfcp", -613319346, -145065272, -145065248, -145065245, 1870026788, -571471555, (NNNwS)((NNNwS)PH.I1lsssrm("zfnak", -613319348, -145065260, -145065257, -145065261, 834196230, -1379161173, (NNuU)((NNuU)PH.I1lsssrm("pnveprpc", -613319348, -145065249, -145065264, -145065261, 850255366, 1236522504, (PH)this)[PH.I1lsssrm("lbczjgs", -613319350, -145065249, -145065280, -145065259, -451638428, 622749587)[2]]))[PH.I1lsssrm("yplri", -613319350, -145065249, -145065280, -145065259, -1252000805, 1435625634)[3]]))) != false) {
            v0 = PH.I1lsssrm("lbczjgs", -613319350, -145065249, -145065250, -145065263, 168789117, 2142096411)[0];
        } else lbl-1000:
        // 2 sources

        {
            v0 = PH.I1lsssrm("pnveprpc", -613319350, -145065249, -145065250, -145065263, 54892686, 1930944740)[1];
        }
        var6_2 = PH.I1lsssrm("pnveprpc", -613319360, -145065229, -145065230, -145065227, 1870026788, -571471555, (boolean)v0);
        PH.I1lsssrm("pnveprpc", -613319348, -145065249, -145065222, -145065261, -143005885, 1196349988, (PH)this)[PH.I1lsssrm("cogeq", -613319350, -145065249, -145065280, -145065259, -815899235, 212716550)[4]] = var6_2;
        if (PH.I1lsssrm("lvwuyljn", -613319346, -145065229, -145065247, -145065252, 1870026788, -571471555, (Boolean)((Boolean)PH.I1lsssrm("pnveprpc", -613319348, -145065249, -145065222, -145065261, -1458214802, -983650399, (PH)this)[PH.I1lsssrm("yplri", -613319350, -145065249, -145065280, -145065259, -1649097415, 961477940)[5]])) != false) {
            PH.I1lsssrm("prwmu", -613319346, -145065246, -145065221, -145065276, 1870026788, -571471555, (RE)var1_1);
        }
    }

    private static /* synthetic */ int N(int n) {
        return -Integer.rotateRight(Integer.rotateRight(Integer.rotateLeft(-n, 18), 19) ^ 0x955A8AE1, 21);
    }

    /*
     * WARNING - void declaration
     */
    @uF
    public void N(ic ic2) {
        void var4_5;
        PH.I1lsssrm("dohvlty", -613319346, -145065249, -145065275, -145065276, -613319346, -613319346, (PH)this);
        if ((NNNwS)PH.I1lsssrm("yplri", -613319348, -145065260, -145065257, -145065261, -613319348, -613319348, (NNuU)((NNuU)PH.I1lsssrm("pnveprpc", -613319348, -145065249, -145065264, -145065261, -613319348, -613319348, (PH)this)[PH.I1lsssrm("ejvt", -613319350, -145065249, -145065280, -145065259, -613319350, -613319350)[6]]))[PH.I1lsssrm("yplri", -613319350, -145065249, -145065280, -145065259, -613319350, -613319350)[7]] == null) {
            return;
        }
        if (PH.I1lsssrm("yplri", -613319346, -145065249, -145065256, -145065252, 1870026788, -571471555, (PH)this) == false) {
            return;
        }
        NbL[] nbLArray = NbL.values();
        int n = nbLArray.length;
        CallSite callSite = PH.I1lsssrm("lbczjgs", -613319350, -145065249, -145065250, -145065263, -629613191, 1549243250)[2];
        while (var4_5 < n) {
            NbL nbL = nbLArray[var4_5];
            CallSite callSite2 = PH.I1lsssrm("cogeq", -613319346, -145065272, -145065225, -145065226, 1870026788, -571471555, (NNNwS)((NNNwS)PH.I1lsssrm("prwmu", -613319348, -145065260, -145065257, -145065261, -302432197, -1189502407, (NNuU)((NNuU)PH.I1lsssrm("prwmu", -613319348, -145065249, -145065264, -145065261, -2019589492, 385060593, (PH)this)[PH.I1lsssrm("xdfcp", -613319350, -145065249, -145065228, -145065259, 98321670, 837401143)[0]]))[PH.I1lsssrm("cogeq", -613319350, -145065249, -145065228, -145065259, 872738117, 1969549236)[1]]), (NbL)nbL);
            if (PH.I1lsssrm("ejvt", -613319346, -145065279, -145065221, -145065238, 1870026788, -571471555, (NQo)callSite2, (NNNgN)PH.I1lsssrm("xdfcp", -613319346, -145065239, -145065240, -145065237, 1870026788, -571471555, (NNNZg)((NNNZg)PH.I1lsssrm("zfnak", -613319348, -145065260, -145065257, -145065261, -1521327244, 1842769508, (NNuU)((NNuU)PH.I1lsssrm("pnveprpc", -613319348, -145065249, -145065264, -145065261, 1862236560, 1649385068, (PH)this)[PH.I1lsssrm("lvwuyljn", -613319350, -145065249, -145065228, -145065259, 302899865, 1494859133)[2]]))[PH.I1lsssrm("lvwuyljn", -613319350, -145065249, -145065228, -145065259, -492024695, 1049759741)[3]]))) == false) {
                return;
            }
            if (PH.I1lsssrm("pnveprpc", -613319346, -145065249, -145065221, -145065278, 1870026788, -571471555, (PH)this, (NQo)callSite2) != false) {
                PH.I1lsssrm("tfxdfpnz", -613319360, -145065235, -145065221, -145065236, 1870026788, -571471555, (NbL)nbL);
                CallSite callSite3 = PH.I1lsssrm("cogeq", -613319360, -145065268, -145065230, -145065233, 1870026788, -571471555, (int)PH.I1lsssrm("dohvlty", -613319350, -145065249, -145065251, -145065232, -601488816, -1595241831)[0]);
                PH.I1lsssrm("lbczjgs", -613319348, -145065260, -145065267, -145065261, -1355103590, 2007324527, (NNuU)((NNuU)PH.I1lsssrm("prwmu", -613319348, -145065249, -145065264, -145065261, 1626547210, -841233832, (PH)this)[PH.I1lsssrm("yplri", -613319350, -145065249, -145065228, -145065259, 1622716329, 1871832449)[4]]))[PH.I1lsssrm("ejvt", -613319350, -145065249, -145065228, -145065259, -1169059768, 1553320647)[5]] = callSite3;
                CallSite callSite4 = PH.I1lsssrm("lbczjgs", -613319360, -145065229, -145065230, -145065227, 1870026788, -571471555, (boolean)PH.I1lsssrm("tfxdfpnz", -613319350, -145065249, -145065250, -145065263, -1981855053, -2097412739)[3]);
                PH.I1lsssrm("zfnak", -613319348, -145065249, -145065222, -145065261, -1265015655, -1082905003, (PH)this)[PH.I1lsssrm("tfxdfpnz", -613319350, -145065249, -145065228, -145065259, 626488025, -1489488167)[6]] = callSite4;
                break;
            }
            ++var4_5;
        }
    }

    private static /* synthetic */ void ntfClinit() {
        l1tmjstns = "V\u0081\u0007yQ\u0085\u0087\u00b8M*Xy\u001f1Z\u00ef\u001b\u00cb?(,\u00f2+\u00c2\u00e4!rF\u0092\u00c9\u00fb@%Q1\u007f\u001cR\u00d8\u00fa\u00dcp\u0085\u0081\u001dT\u00cd?{_\u0097\u00b9\u00a1\u0010z\u0003K\u00ec\rib\u00b6\u008b\u00b8V\u0012o\u0081\u0007Xt\u00b5\u009c\u00c5d&\u0019d\\Ex\u00c6?EQ\u009f\u0093\u00f2_\u0081\r\u00d7$\u00eev\u00f2b_Z\u0092\u0090\u00f6\u000e'WpWQz\u00ea1\u00c4.r^\u00c8r\u00153\u00ec\rib\u00b6\u008b\u00b8o B\tu\u0081\u0081\u0007Xt\u00b5\u009c\u00c5d&\u0019P[\n\u0003\u00fa\u000f\u00e4\u0000Wv\u0089\u00b4\u00d2LdxO_E\u0011\u00e7\u00f3\u00c9=r\u001f\u009f\u0087\u00f9Fdtq_\u0012]\u00dc\u00f7K\u00ec\rib\u00b6\u008b\u00b8M\u001a\u0011\u00e4\u0000Wv\u0089\u00b4\u00d2LdxP~\u0019v\u0086\u0010\u00f2\u0081\u00e4\u0000Wv\u0089\u00b4\u00d2LdZG\u000b2R\u008a\u00df\u00c9d\u007fQ\u009d\u0081\u00b8r?Dw^\u0019\u0003\u00ad\u00ef\u00ee\r:|\u00b8\u00a2\u00d1[\u0019ss\u001f\u0012i\u00d0o\u0081\u0007Xt\u00b5\u009c\u00c5d&\u0019P~0_\u00f3|\u0005\u00e4!rF\u0092\u00c9\u00fb@%Q1c\nJ\u00ec0\u00cfp\u00ec\u00b1\u00ec\rib\u00b6\u008b\u00b8M \u0092\u00b1\u00ec\rib\u00b6\u008b\u00b8o\u0005xDj\u008ar\u00ec\rib\u00b6\u008b\u00b8['\u00b6\u00c4$rD\u00a5\u0087\u00fbT.\u00d2\u00e4\u0000Wv\u0089\u00b4\u00d2Ldx||E\u0011/\u00b1\u00ec\rib\u00b6\u008b\u00b8o\u001aY%9\u00e1b_Z\u0092\u0090\u00f6\u000e'WpWQq\re\u00cd,vB\u00c8\u00e6\u00ec\rib\u00b6\u008b\u00b8o\u0005CKY\u00cd?{_\u0097\u00b9\u00a1\u0011x\u0006M\u0005\u00fb\u0014\u00c9=r\u001f\u009f\u0087\u00f9Fd\u007fpD\u001b_\u00e0\f\u0012\u00cd?{_\u0097\u00b9\u00a2\u0018r\u000e<\u00ec\rib\u00b6\u008b\u00b8o\u001aYf\u0016uM\u00e2\u00ec\rib\u00b6\u008b\u00b8o\u0005xDWV\u0081\u0011\u00d2\u00ec\rib\u00b6\u008b\u00b8V>3\u00ec\rib\u00b6\u008b\u00b8o\u0005xic4\u0015\u00c7$\u007fU\u0092\u0088\u00c1@'C{V\u00e4\u0000Wv\u0089\u00b4\u00d2Ldx||E\u0011\u00d3o\u00ea\u00e2\u00ec\rib\u00b6\u008b\u00b8XZ\u00ec\rib\u00b6\u008b\u00b8q\u0003\u00b1\u0081\u0007Xt\u00b5\u009c\u00c5d&\u0019Pa\u0011\u0003l\u00ec\rib\u00b6\u008b\u00b8s\u000eQ\u00c9'fU\u00bc\u0080\u00f8\u0081\u0002)\u0015\u00cd?{_\u0097\u00b9\u00a3\u0014z\u0000,{\u00c9=r\u001f\u009f\u0087\u00f9Fdpr_\u001fL\u0097\u00cd?{_\u0097\u00b9\u00a0\u0012\u007f\u0002";
        l1nri00mt = new int[]{34537481, 7667713, 4325390, 20840458, 29818881, 30801923, 35127306, 19857409, 1310722, 26935297, 1507347, 7602177, 27000834, 25427980, 0x160001, 19922957, 19136513, 31653901, 38076417, 2949131, 29884417, 27131921, 0x500008, 37879811, 28966923, 29687809, 30998538, 9633808, 0x1F00001, 2752515, 29753345, 39911435, 8585231, 7733259, 0x810001, 8519681, 11796490, 20, 38928399, 21495818, 5767171, 0x20D0002, 10682385, 37421063, 6160406, 5963777, 28246027, 22151196, 29949965, 38141964, 0x1000011, 12451858, 3670026, 33357840, 23986198, 20774913, 32571404, 26214411, 0x222000F, 36765706, 0x1110013, 9568257, 6029314, 19202058, 0xD00030};
        PH.v();
        PH.s();
        PH.n();
        PH.b();
        PH.P();
    }

    private static /* synthetic */ void ootrqj(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[65];
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
        l1tmjstns = stringBuilder.toString();
        l1nri00mt = nArray;
    }

    private static /* synthetic */ String lO0lmpmk(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{66, 58, 61, 101, -21, -17, -37, -110, 28, 118, 83, 123, 53, 60, 5, -72};
        byte[] byArray3 = new byte[]{-28, 124, 19, 100, 62, 99, 32, -13, 114, -107, -9, -30, 30, 83, -56, -77};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite I1lsssrm(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = l1nri00mt[n2 ^ 0xF75A7AD9];
        int n8 = n7 >>> 16;
        String string2 = PH.lO0lmpmk(l1tmjstns.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0xF75A7AD9);
        n7 = l1nri00mt[n3 ^ 0xF75A7AD9];
        int n9 = n7 >>> 16;
        String string3 = PH.lO0lmpmk(l1tmjstns.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0xF75A7AD9);
        n7 = l1nri00mt[n4 ^ 0xF75A7AD9];
        int n10 = n7 >>> 16;
        String string4 = PH.lO0lmpmk(l1tmjstns.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0xF75A7AD9);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xDB717DF8) + -178;
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

    private static /* synthetic */ CallSite lIIiI(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) throws Exception {
        int n9 = l1nri00mt[n2 ^ 0xF75A7AD9];
        int n10 = n9 >>> 16;
        String string2 = PH.lO0lmpmk(l1tmjstns.substring(n10, n10 + (n9 & 0xFFFF)), n2 ^ 0xF75A7AD9);
        n9 = l1nri00mt[n3 ^ 0xF75A7AD9];
        int n11 = n9 >>> 16;
        String string3 = PH.lO0lmpmk(l1tmjstns.substring(n11, n11 + (n9 & 0xFFFF)), n3 ^ 0xF75A7AD9);
        n9 = l1nri00mt[n4 ^ 0xF75A7AD9];
        int n12 = n9 >>> 16;
        String string4 = PH.lO0lmpmk(l1tmjstns.substring(n12, n12 + (n9 & 0xFFFF)), n4 ^ 0xF75A7AD9);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xDB717DF8) + -178;
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
