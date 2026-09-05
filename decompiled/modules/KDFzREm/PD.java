/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NAC
 *  KDFzREm.NDL
 *  KDFzREm.NDR
 *  KDFzREm.NDj
 *  KDFzREm.NHS
 *  KDFzREm.NNNAF
 *  KDFzREm.NNNNLQ
 *  KDFzREm.NNNZg
 *  KDFzREm.NNNpn
 *  KDFzREm.NNNwS
 *  KDFzREm.NNde
 *  KDFzREm.NNuU
 *  KDFzREm.NXi
 *  KDFzREm.NrK
 *  KDFzREm.Nrh
 *  KDFzREm.Nrr
 *  org.joml.Matrix4fStack
 */
package KDFzREm;

import KDFzREm.MR;
import KDFzREm.NAC;
import KDFzREm.NDL;
import KDFzREm.NDR;
import KDFzREm.NDj;
import KDFzREm.NHS;
import KDFzREm.NNNAF;
import KDFzREm.NNNNLQ;
import KDFzREm.NNNZg;
import KDFzREm.NNNpn;
import KDFzREm.NNNwS;
import KDFzREm.NNde;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import KDFzREm.NrK;
import KDFzREm.Nrh;
import KDFzREm.Nrr;
import KDFzREm.RT;
import KDFzREm.Ry;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.ZH;
import KDFzREm.Zu;
import KDFzREm.ie;
import KDFzREm.kW;
import KDFzREm.lQ;
import KDFzREm.lT;
import KDFzREm.lY;
import KDFzREm.lb;
import KDFzREm.uA;
import KDFzREm.uF;
import KDFzREm.wB;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.joml.Matrix4fStack;

@UZ(L="Blink", y=UR.PLAYER, N=Uz.BASE)
public class PD
extends UM {
    private static short[] u;
    private static int[] i;
    private static short[] R;
    private static short[] M;
    private static byte[] B;
    private static short[] Z;
    private static float[] z;
    private static boolean[] U;
    private static short[] W;
    public Object[] L;
    private static String[] m;
    private static short[] P;
    private static short[] s;
    private static /* synthetic */ String Iltts;
    private static /* synthetic */ int[] OOlpq0m;

    private static /* synthetic */ int L(int n) {
        return Integer.rotateRight(Integer.rotateLeft((-Integer.rotateRight(n, 31) ^ 0xEE726FA8) + 1 ^ 0xE1546F1B, 24), 19);
    }

    private static /* synthetic */ String M(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{34, -72, 72, -11, 36, 32, -20, 103, 124, -29, 73, 44, 21, -72, 34, -40};
        int n = 0;
        int n2 = 133;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 85;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private void P() {
        if (PD.lIlqq("cgziwtx", 2022895777, 100869160, 100869154, 100869155, 2022895777, 2022895777, 2022895777, (PD)this) == null) {
            PD.lIlqq("fpwzyp", 2022895776, 100869160, 100869154, 100869155, 2022895776, 2022895776, 2022895776, (PD)this, (Object[])new Object[PD.lIlqq("gatwibh", 2022895783, 100869160, 100869121, 100869122, 2022895783, 2022895783, 2022895783)[0]]);
            CallSite callSite = PD.lIlqq("gyqje", 2022895777, 100869160, 100869154, 100869155, 2022895777, 2022895777, 2022895777, (PD)this);
            callSite[PD.lIlqq("cgziwtx", 2022895783, 100869160, 100869121, 100869122, 2022895783, 2022895783, 2022895783)[1]] = PD.lIlqq("ypxsxkx", 2022895789, 100869133, 100869123, 100869124, 2022895789, 2022895789, 2022895789, (int)PD.lIlqq("gyqje", 2022895783, 100869160, 100869165, 100869166, 2022895783, 2022895783, 2022895783)[4]);
        }
    }

    private static void T() {
        s = new short[]{0, 1, 2, 3, 4, 5, 0};
        W = new short[]{3, 5, 7, 1, 6, 2, 3};
        Z = new short[]{6, 2, 0, 3};
        u = new short[]{7, 4, 5};
        M = new short[]{5, 5};
        P = new short[]{0, 4, 5, 5, 5, 7, 0};
        R = new short[]{4, 0, 4, 6, 3, 7, 1};
    }

    public PD() {
        PD.lIlqq("ypxsxkx", 2022895779, 100869160, 100869161, 100869162, 2022895779, 2022895779, 2022895779, (PD)this);
        CallSite callSite = PD.lIlqq("tdrm", 2022895789, 100869167, 100869152, 100869153, 2022895789, 2022895789, 2022895789, (lY)this, (String)((Object)PD.lIlqq("ypxsxkx", 2022895783, 100869160, 100869163, 100869164, 2022895783, 2022895783, 2022895783)[0]), (boolean)PD.lIlqq("gatwibh", 2022895783, 100869160, 100869165, 100869166, 2022895783, 2022895783, 2022895783)[0]);
        PD.lIlqq("ypxsxkx", 2022895777, 100869160, 100869154, 100869155, 2022895777, 2022895777, 2022895777, (PD)this)[PD.lIlqq("tdrm", 2022895783, 100869160, 100869156, 100869157, 2022895783, 2022895783, 2022895783)[0]] = callSite;
        CallSite callSite2 = PD.lIlqq("gatwibh", 2022895789, 100869167, 100869152, 100869153, 2022895789, 2022895789, 2022895789, (lY)this, (String)((Object)PD.lIlqq("fpwzyp", 2022895783, 100869160, 100869163, 100869164, 2022895783, 2022895783, 2022895783)[1]), (boolean)PD.lIlqq("votyc", 2022895783, 100869160, 100869165, 100869166, 2022895783, 2022895783, 2022895783)[1]);
        PD.lIlqq("gatwibh", 2022895777, 100869160, 100869154, 100869155, 2022895777, 2022895777, 2022895777, (PD)this)[PD.lIlqq("gatwibh", 2022895783, 100869160, 100869156, 100869157, 2022895783, 2022895783, 2022895783)[1]] = callSite2;
        lb lb2 = (lb)((Object)PD.lIlqq("tdrm", 2022895779, 100869177, 100869152, 100869178, 2022895779, 2022895779, 2022895779, (lb)((Object)PD.lIlqq("gatwibh", 2022895789, 100869167, 100869152, 100869176, 2022895789, 2022895789, 2022895789, (lY)this, (String)((Object)PD.lIlqq("upydo", 2022895783, 100869160, 100869163, 100869164, 2022895783, 2022895783, 2022895783)[2]), (int)PD.lIlqq("ypxsxkx", 2022895783, 100869160, 100869158, 100869159, 2022895783, 2022895783, 2022895783)[0])), lw2 -> {
            PD.lIlqq("ifipi", 2022895779, 100869160, 100869161, 100869162, -2146086153, 1806943564, 1092993988, (PD)this);
            return (boolean)PD.lIlqq("ifipi", 2022895779, 100869171, 100869172, 100869173, -2146086153, 1806943564, 1092993988, (Boolean)((Boolean)((Object)PD.lIlqq("tdrm", 2022895779, 100869179, 100869158, 100869170, -2146086153, 1806943564, 1092993988, (lT)((lT)((Object)PD.lIlqq("fpwzyp", 2022895777, 100869160, 100869154, 100869155, -1753416131, -1484847654, 127252556, (PD)this)[PD.lIlqq("gatwibh", 2022895783, 100869160, 100869127, 100869157, -331426140, -1066684026, 7978977)[6]]))))));
        }));
        PD.lIlqq("gatwibh", 2022895777, 100869160, 100869154, 100869155, 2022895777, 2022895777, 2022895777, (PD)this)[PD.lIlqq("ifipi", 2022895783, 100869160, 100869156, 100869157, 2022895783, 2022895783, 2022895783)[2]] = lb2;
        lT lT2 = (lT)((Object)PD.lIlqq("ifipi", 2022895779, 100869179, 100869152, 100869180, 2022895779, 2022895779, 2022895779, (lT)((Object)PD.lIlqq("upydo", 2022895789, 100869167, 100869152, 100869153, 2022895789, 2022895789, 2022895789, (lY)this, (String)((Object)PD.lIlqq("ypxsxkx", 2022895783, 100869160, 100869163, 100869164, 2022895783, 2022895783, 2022895783)[3]), (boolean)PD.lIlqq("ypxsxkx", 2022895783, 100869160, 100869165, 100869166, 2022895783, 2022895783, 2022895783)[2])), (lw2, bl) -> {
            PD.lIlqq("gyqje", 2022895779, 100869160, 100869161, 100869162, -2146086153, 1806943564, 1092993988, (PD)this);
            CallSite callSite = PD.lIlqq("tdrm", 2022895789, 100869133, 100869123, 100869124, -2146086153, 1806943564, 1092993988, (int)PD.lIlqq("tdrm", 2022895779, 100869129, 100869130, 100869131, -2146086153, 1806943564, 1092993988, (kW)((Object)PD.lIlqq("gatwibh", 2022895789, 100869174, 100869175, 100869128, -2146086153, 1806943564, 1092993988))));
            PD.lIlqq("fpwzyp", 2022895777, 100869160, 100869154, 100869155, 864042037, 168953677, -658824216, (PD)this)[PD.lIlqq("gyqje", 2022895783, 100869160, 100869127, 100869157, -126656127, 1153151391, -702400671)[5]] = callSite;
        }));
        PD.lIlqq("ypxsxkx", 2022895777, 100869160, 100869154, 100869155, 2022895777, 2022895777, 2022895777, (PD)this)[PD.lIlqq("upydo", 2022895783, 100869160, 100869156, 100869157, 2022895783, 2022895783, 2022895783)[3]] = lT2;
        lQ lQ2 = (lQ)((Object)PD.lIlqq("gatwibh", 2022895779, 100869168, 100869152, 100869178, 2022895779, 2022895779, 2022895779, (lQ)((Object)PD.lIlqq("upydo", 2022895789, 100869167, 100869152, 100869183, 2022895789, 2022895789, 2022895789, (lY)this, (String)((Object)PD.lIlqq("fpwzyp", 2022895783, 100869160, 100869163, 100869164, 2022895783, 2022895783, 2022895783)[4]), (float)PD.lIlqq("ypxsxkx", 2022895783, 100869160, 100869181, 100869182, 2022895783, 2022895783, 2022895783)[0], (float)PD.lIlqq("gatwibh", 2022895783, 100869160, 100869181, 100869182, 2022895783, 2022895783, 2022895783)[1], (float)PD.lIlqq("gatwibh", 2022895783, 100869160, 100869181, 100869182, 2022895783, 2022895783, 2022895783)[2], (float)PD.lIlqq("gyqje", 2022895783, 100869160, 100869181, 100869182, 2022895783, 2022895783, 2022895783)[3])), lw2 -> {
            PD.lIlqq("ypxsxkx", 2022895779, 100869160, 100869161, 100869162, -2146086153, 1806943564, 1092993988, (PD)this);
            return (boolean)PD.lIlqq("cgziwtx", 2022895779, 100869171, 100869172, 100869173, -2146086153, 1806943564, 1092993988, (Boolean)((Boolean)((Object)PD.lIlqq("upydo", 2022895779, 100869179, 100869158, 100869170, -2146086153, 1806943564, 1092993988, (lT)((lT)((Object)PD.lIlqq("upydo", 2022895777, 100869160, 100869154, 100869155, -461497103, 32832957, 500274767, (PD)this)[PD.lIlqq("cgziwtx", 2022895783, 100869160, 100869127, 100869157, 1731588557, -1445149495, -1099277833)[4]]))))));
        }));
        PD.lIlqq("cgziwtx", 2022895777, 100869160, 100869154, 100869155, 2022895777, 2022895777, 2022895777, (PD)this)[PD.lIlqq("votyc", 2022895783, 100869160, 100869156, 100869157, 2022895783, 2022895783, 2022895783)[4]] = lQ2;
        LinkedList linkedList = new LinkedList();
        PD.lIlqq("gyqje", 2022895777, 100869160, 100869154, 100869155, 2022895777, 2022895777, 2022895777, (PD)this)[PD.lIlqq("gatwibh", 2022895783, 100869160, 100869156, 100869157, 2022895783, 2022895783, 2022895783)[5]] = linkedList;
    }

    static {
        PD.ntfClinit();
    }

    @Override
    public boolean Z() {
        PD.lIlqq("ifipi", 2022895779, 100869160, 100869161, 100869162, -2146086153, 1806943564, 1092993988, (PD)this);
        if ((NNNZg)PD.lIlqq("fpwzyp", 2022895777, 100869137, 100869138, 100869155, -554620688, 1599056219, 620215343, (NNuU)((NNuU)PD.lIlqq("tdrm", 2022895777, 100869160, 100869130, 100869155, 1218526213, -823893308, 1081871485, (PD)this)[PD.lIlqq("ypxsxkx", 2022895783, 100869160, 100869156, 100869157, -448140998, 1192386879, 397524188)[6]]))[PD.lIlqq("tdrm", 2022895783, 100869160, 100869125, 100869157, 81417811, -1749822551, -1290160475)[0]] == null) {
            return (boolean)PD.lIlqq("tdrm", 2022895783, 100869160, 100869165, 100869166, -589270143, -1277530378, -519908469)[3];
        }
        PD.lIlqq("ifipi", 2022895788, 100869139, 100869140, 100869162, -2146086153, 1806943564, 1092993988, (List)((List)((Object)PD.lIlqq("tdrm", 2022895777, 100869160, 100869154, 100869155, 1645235573, 1158907135, 2063078941, (PD)this)[PD.lIlqq("votyc", 2022895783, 100869160, 100869125, 100869157, -1937715651, -1417623465, -752803771)[1]])));
        PD.lIlqq("ypxsxkx", 2022895779, 100869160, 100869175, 100869162, -2146086153, 1806943564, 1092993988, (PD)this);
        CallSite callSite = PD.lIlqq("upydo", 2022895789, 100869133, 100869123, 100869124, -2146086153, 1806943564, 1092993988, (int)PD.lIlqq("gatwibh", 2022895779, 100869129, 100869130, 100869131, -2146086153, 1806943564, 1092993988, (kW)((Object)PD.lIlqq("votyc", 2022895789, 100869174, 100869175, 100869128, -2146086153, 1806943564, 1092993988))));
        PD.lIlqq("cgziwtx", 2022895777, 100869160, 100869154, 100869155, 1001080528, -501810318, -1210211724, (PD)this)[PD.lIlqq("cgziwtx", 2022895783, 100869160, 100869125, 100869157, -745634006, 357081840, 736255076)[2]] = callSite;
        return (boolean)PD.lIlqq("gyqje", 2022895778, 100869141, 100869169, 100869173, -2146086153, 1806943564, 1092993988, (UM)this);
    }

    private static /* synthetic */ int i(int n) {
        return Integer.rotateLeft((Integer.rotateRight(-n ^ 0x17332632, 20) ^ 0x3CE90C0C) + 1, 1);
    }

    private static /* synthetic */ String i(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-49, -98, 14, -29, -41, -12, 66, 13, 77, -23, 48, 116, -41, 113, -63, -58};
        int n = 0;
        int n2 = 66;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 59;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    @Override
    public boolean i() {
        PD.lIlqq("cgziwtx", 2022895779, 100869160, 100869120, 100869162, -2146086153, 1806943564, 1092993988, (PD)this);
        return (boolean)PD.lIlqq("fpwzyp", 2022895778, 100869141, 100869158, 100869173, -2146086153, 1806943564, 1092993988, (UM)this);
    }

    private static void b() {
        m = new String[]{"release-packets-on-hit", "render-server-position", "render-color", "auto-release-packets", "release-packets-ticks"};
    }

    private static void s() {
        U = new boolean[]{true, true, true, false, false};
    }

    private static void n() {
        z = new float[]{20.0f, 5.0f, 100.0f, 5.0f};
    }

    private static void m() {
        i = new int[]{-11104513};
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void t() {
        PD.lIlqq("tdrm", 2022895779, 100869160, 100869161, 100869162, -2146086153, 1806943564, 1092993988, (PD)this);
        List list = (List)((Object)PD.lIlqq("votyc", 2022895777, 100869160, 100869154, 100869155, 939035801, -257435143, 134959874, (PD)this)[PD.lIlqq("ypxsxkx", 2022895783, 100869160, 100869224, 100869157, -1073143387, -1745364410, -1923721555)[1]]);
        synchronized (list) {
            if ((NNNwS)PD.lIlqq("gatwibh", 2022895777, 100869137, 100869138, 100869155, -1545245156, 1346906187, -210111683, (NNuU)((NNuU)PD.lIlqq("votyc", 2022895777, 100869160, 100869130, 100869155, 846492004, -371814622, 1589521583, (PD)this)[PD.lIlqq("fpwzyp", 2022895783, 100869160, 100869161, 100869157, 1438864498, 1142810250, -1772800793)[0]]))[PD.lIlqq("fpwzyp", 2022895783, 100869160, 100869161, 100869157, -1889182633, 716019945, -761380175)[1]] == null) {
                PD.lIlqq("fpwzyp", 2022895788, 100869139, 100869140, 100869162, -2146086153, 1806943564, 1092993988, (List)((List)((Object)PD.lIlqq("votyc", 2022895777, 100869160, 100869154, 100869155, 597390068, -666966334, -1595529807, (PD)this)[PD.lIlqq("votyc", 2022895783, 100869160, 100869161, 100869157, -730565104, -996752015, 1400031146)[2]])));
                return;
            }
            CallSite callSite = PD.lIlqq("upydo", 2022895788, 100869139, 100869216, 100869217, -2146086153, 1806943564, 1092993988, (List)((List)((Object)PD.lIlqq("ifipi", 2022895777, 100869160, 100869154, 100869155, -620799113, 979600352, -1455470999, (PD)this)[PD.lIlqq("ypxsxkx", 2022895783, 100869160, 100869161, 100869157, 1202611736, 501220738, 1289186888)[3]])));
            while (PD.lIlqq("gatwibh", 2022895788, 100869218, 100869219, 100869173, -2146086153, 1806943564, 1092993988, (Iterator)((Object)callSite)) != false) {
                NAC nAC = (NAC)PD.lIlqq("ifipi", 2022895788, 100869218, 100869220, 100869170, -2146086153, 1806943564, 1092993988, (Iterator)((Object)callSite));
                PD.lIlqq("gatwibh", 2022895789, 100869221, 100869152, 100869222, -2146086153, 1806943564, 1092993988, (NAC)nAC);
            }
            PD.lIlqq("fpwzyp", 2022895788, 100869139, 100869140, 100869162, -2146086153, 1806943564, 1092993988, (List)((List)((Object)PD.lIlqq("tdrm", 2022895777, 100869160, 100869154, 100869155, -1412435148, -445323648, -514817994, (PD)this)[PD.lIlqq("upydo", 2022895783, 100869160, 100869161, 100869157, -2075022179, -1613496840, -65588274)[4]])));
            CallSite callSite2 = PD.lIlqq("fpwzyp", 2022895789, 100869133, 100869123, 100869124, -2146086153, 1806943564, 1092993988, (int)PD.lIlqq("gyqje", 2022895779, 100869129, 100869130, 100869131, -2146086153, 1806943564, 1092993988, (kW)((Object)PD.lIlqq("cgziwtx", 2022895789, 100869174, 100869175, 100869128, -2146086153, 1806943564, 1092993988))));
            PD.lIlqq("gatwibh", 2022895777, 100869160, 100869154, 100869155, -181051994, 1501194291, -1566848033, (PD)this)[PD.lIlqq("upydo", 2022895783, 100869160, 100869161, 100869157, -1145360603, -1361523482, -1398555154)[5]] = callSite2;
            PD.lIlqq("cgziwtx", 2022895779, 100869160, 100869175, 100869162, -2146086153, 1806943564, 1092993988, (PD)this);
        }
    }

    private static void v() {
        B = new byte[]{8, 7};
    }

    private void j() {
        PD.lIlqq("gyqje", 2022895779, 100869160, 100869161, 100869162, -2146086153, 1806943564, 1092993988, (PD)this);
        if ((NNNwS)PD.lIlqq("ifipi", 2022895777, 100869137, 100869138, 100869155, 100364961, -587837798, 2105998507, (NNuU)((NNuU)PD.lIlqq("gatwibh", 2022895777, 100869160, 100869130, 100869155, -946480874, 631790242, 1180367139, (PD)this)[PD.lIlqq("ypxsxkx", 2022895783, 100869160, 100869161, 100869157, 78109713, -66832924, -232266691)[6]]))[PD.lIlqq("gyqje", 2022895783, 100869160, 100869127, 100869157, 939096155, -204901979, 247706370)[0]] == null) {
            return;
        }
        CallSite callSite = PD.lIlqq("ifipi", 2022895779, 100869227, 100869228, 100869229, -2146086153, 1806943564, 1092993988, (NNNwS)((NNNwS)PD.lIlqq("ifipi", 2022895777, 100869137, 100869138, 100869155, 941962661, -1946464864, 587697565, (NNuU)((NNuU)PD.lIlqq("fpwzyp", 2022895777, 100869160, 100869130, 100869155, 694845785, 1507983579, 1752775624, (PD)this)[PD.lIlqq("fpwzyp", 2022895783, 100869160, 100869127, 100869157, 957200409, -779795173, -2036434450)[1]]))[PD.lIlqq("cgziwtx", 2022895783, 100869160, 100869127, 100869157, 749549556, 1377759386, 1001065269)[2]]));
        CallSite callSite2 = PD.lIlqq("ifipi", 2022895789, 100869230, 100869152, 100869231, -2146086153, 1806943564, 1092993988, (NHS)callSite);
        PD.lIlqq("upydo", 2022895777, 100869160, 100869154, 100869155, -44753262, 1546741905, 2049783160, (PD)this)[PD.lIlqq("fpwzyp", 2022895783, 100869160, 100869127, 100869157, 2136153744, 2138571975, -1298004409)[3]] = callSite2;
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{43, -47, 70, 52, 126, -95, -79, 51, 32, 112, -44, 72, -4, -35, 108, 96};
        int n = 0;
        int n2 = 81;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 41;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int u(int n) {
        return (Integer.rotateRight((-n ^ 0x4A406003) + 1 ^ 0x33795B90, 10) ^ 0x39F2135D) + 1;
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{62, 106, 122, 106, 13, 121, -116, -111, -37, 8, -107, 83, -79, -55, -93, -114};
        int n = 0;
        int n2 = 190;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 177;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int y(int n) {
        return Integer.rotateLeft(Integer.rotateRight(Integer.rotateLeft(Integer.rotateLeft(-Integer.rotateLeft(Integer.rotateLeft(n, 15), 7), 12), 9), 1) ^ 0x53C90C7F, 14);
    }

    @uF
    public void N(MR mR) {
        block3: {
            block2: {
                PD.lIlqq("votyc", 2022895779, 100869160, 100869161, 100869162, -2146086153, 1806943564, 1092993988, (PD)this);
                if (PD.lIlqq("ypxsxkx", 2022895779, 100869171, 100869172, 100869173, -2146086153, 1806943564, 1092993988, (Boolean)((Boolean)((Object)PD.lIlqq("votyc", 2022895779, 100869179, 100869158, 100869170, -2146086153, 1806943564, 1092993988, (lT)((lT)((Object)PD.lIlqq("fpwzyp", 2022895777, 100869160, 100869154, 100869155, 315576358, -424495644, -335611202, (PD)this)[PD.lIlqq("ypxsxkx", 2022895783, 100869160, 100869125, 100869157, 144402436, 156286912, -1929697899)[3]])))))) == false) break block2;
                if ((wB)((Object)PD.lIlqq("ifipi", 2022895777, 100869160, 100869154, 100869155, 1787599225, 306281616, 908806536, (PD)this)[PD.lIlqq("ypxsxkx", 2022895783, 100869160, 100869125, 100869157, 1585724781, 1888134017, -482200940)[4]]) != null) break block3;
            }
            return;
        }
        PD.lIlqq("ifipi", 2022895789, 100869151, 100869152, 100869136, -2146086153, 1806943564, 1092993988, (Matrix4fStack)PD.lIlqq("gatwibh", 2022895779, 100869126, 100869127, 100869144, -2146086153, 1806943564, 1092993988, (MR)mR), (Zu)((Object)PD.lIlqq("ifipi", 2022895779, 100869146, 100869132, 100869147, -2146086153, 1806943564, 1092993988, (ZH)((ZH)((Object)PD.lIlqq("fpwzyp", 2022895783, 100869145, 100869152, 100869155, -1187454801, 704742170, -607218759)[PD.lIlqq("tdrm", 2022895783, 100869160, 100869125, 100869157, 2036306518, -1973365589, -1265424503)[5]])))), (Zu)((Object)PD.lIlqq("fpwzyp", 2022895779, 100869146, 100869132, 100869147, -2146086153, 1806943564, 1092993988, (ZH)((ZH)((Object)PD.lIlqq("tdrm", 2022895783, 100869145, 100869130, 100869155, -1830406465, 318507244, 933147671)[PD.lIlqq("cgziwtx", 2022895783, 100869160, 100869125, 100869157, -1298071851, -1951934921, -398998718)[6]])))), (NXi)PD.lIlqq("cgziwtx", 2022895779, 100869149, 100869130, 100869150, -2146086153, 1806943564, 1092993988, (NNde)PD.lIlqq("votyc", 2022895779, 100869126, 100869130, 100869148, -2146086153, 1806943564, 1092993988, (MR)mR)), (wB)((wB)((Object)PD.lIlqq("fpwzyp", 2022895777, 100869160, 100869154, 100869155, -145393126, 1138462171, 493477344, (PD)this)[PD.lIlqq("ifipi", 2022895783, 100869160, 100869169, 100869157, -2035561546, -654381372, 1568159660)[0]])), (int)PD.lIlqq("upydo", 2022895779, 100869133, 100869134, 100869131, -2146086153, 1806943564, 1092993988, (Integer)((Object)PD.lIlqq("tdrm", 2022895779, 100869177, 100869158, 100869170, -2146086153, 1806943564, 1092993988, (lb)((lb)((Object)PD.lIlqq("gatwibh", 2022895777, 100869160, 100869154, 100869155, -2034428805, 1161634220, 516868006, (PD)this)[PD.lIlqq("fpwzyp", 2022895783, 100869160, 100869169, 100869157, 346707149, 1950587681, 819337504)[1]]))))));
    }

    @uF
    public void N(Ry ry) {
        PD.lIlqq("ypxsxkx", 2022895779, 100869160, 100869161, 100869162, -2146086153, 1806943564, 1092993988, (PD)this);
        if (PD.lIlqq("cgziwtx", 2022895779, 100869171, 100869172, 100869173, -2146086153, 1806943564, 1092993988, (Boolean)((Boolean)((Object)PD.lIlqq("tdrm", 2022895779, 100869179, 100869158, 100869170, -2146086153, 1806943564, 1092993988, (lT)((lT)((Object)PD.lIlqq("tdrm", 2022895777, 100869160, 100869154, 100869155, 654389603, 1956579877, -2144150590, (PD)this)[PD.lIlqq("gatwibh", 2022895783, 100869160, 100869169, 100869157, 1095303716, 1059090113, -845180757)[3]])))))) == false) {
            return;
        }
        if (PD.lIlqq("tdrm", 2022895779, 100869129, 100869130, 100869131, -2146086153, 1806943564, 1092993988, (kW)((Object)PD.lIlqq("cgziwtx", 2022895789, 100869174, 100869175, 100869128, -2146086153, 1806943564, 1092993988))) - PD.lIlqq("cgziwtx", 2022895779, 100869133, 100869134, 100869131, -2146086153, 1806943564, 1092993988, (Integer)((Object)PD.lIlqq("gyqje", 2022895777, 100869160, 100869154, 100869155, 639750458, 12915214, 1934309997, (PD)this)[PD.lIlqq("tdrm", 2022895783, 100869160, 100869132, 100869157, -951535107, 1056973614, -1006985186)[0]])) > PD.lIlqq("cgziwtx", 2022895779, 100869135, 100869134, 100869131, -2146086153, 1806943564, 1092993988, (Float)((Float)((Object)PD.lIlqq("gyqje", 2022895779, 100869168, 100869158, 100869170, -2146086153, 1806943564, 1092993988, (lQ)((lQ)((Object)PD.lIlqq("fpwzyp", 2022895777, 100869160, 100869154, 100869155, -1173626750, 1126264593, 1891196881, (PD)this)[PD.lIlqq("upydo", 2022895783, 100869160, 100869132, 100869157, 1379514196, -1744260861, 586372957)[1]]))))))) {
            PD.lIlqq("votyc", 2022895779, 100869160, 100869120, 100869162, -2146086153, 1806943564, 1092993988, (PD)this);
        }
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateLeft(Integer.rotateRight(Integer.rotateLeft(Integer.rotateRight(-Integer.rotateLeft(n, 29), 6), 23), 11), 26);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @uF(y=uA.AFTER_ALL)
    public void N(RT rT) {
        PD.lIlqq("fpwzyp", 2022895779, 100869160, 100869161, 100869162, -2146086153, 1806943564, 1092993988, (PD)this);
        if (PD.lIlqq("gatwibh", 2022895779, 100869142, 100869130, 100869173, -2146086153, 1806943564, 1092993988, (RT)rT) != false) {
            return;
        }
        CallSite callSite = PD.lIlqq("ifipi", 2022895779, 100869142, 100869154, 100869143, -2146086153, 1806943564, 1092993988, (RT)rT);
        if (callSite instanceof NDL || callSite instanceof Nrr || callSite instanceof NrK || callSite instanceof NNNpn || callSite instanceof NDR || callSite instanceof NDj || callSite instanceof NNNNLQ || callSite instanceof NNNAF || callSite instanceof Nrh) {
            PD.lIlqq("upydo", 2022895779, 100869160, 100869120, 100869162, -2146086153, 1806943564, 1092993988, (PD)this);
            return;
        }
        PD.lIlqq("fpwzyp", 2022895779, 100869142, 100869152, 100869162, -2146086153, 1806943564, 1092993988, (RT)rT);
        List list = (List)((Object)PD.lIlqq("tdrm", 2022895777, 100869160, 100869154, 100869155, 2037391099, -393916443, -1954900441, (PD)this)[PD.lIlqq("fpwzyp", 2022895783, 100869160, 100869132, 100869157, -53344358, -380537878, 402447535)[2]]);
        synchronized (list) {
            PD.lIlqq("fpwzyp", 2022895788, 100869139, 100869225, 100869226, -2146086153, 1806943564, 1092993988, (List)((List)((Object)PD.lIlqq("cgziwtx", 2022895777, 100869160, 100869154, 100869155, -882784539, 1873454488, 1724907128, (PD)this)[PD.lIlqq("upydo", 2022895783, 100869160, 100869224, 100869157, -1070671151, -1092811607, 1983102712)[0]])), (Object)callSite);
        }
    }

    @uF
    public void N(ie ie2) {
        PD.lIlqq("tdrm", 2022895779, 100869160, 100869161, 100869162, -2146086153, 1806943564, 1092993988, (PD)this);
        if (PD.lIlqq("ifipi", 2022895779, 100869171, 100869172, 100869173, -2146086153, 1806943564, 1092993988, (Boolean)((Boolean)((Object)PD.lIlqq("gatwibh", 2022895779, 100869179, 100869158, 100869170, -2146086153, 1806943564, 1092993988, (lT)((lT)((Object)PD.lIlqq("fpwzyp", 2022895777, 100869160, 100869154, 100869155, 1896934890, -962588022, 1186702429, (PD)this)[PD.lIlqq("gatwibh", 2022895783, 100869160, 100869169, 100869157, -566747684, -1106200040, 1629332671)[2]])))))) == false) {
            return;
        }
        PD.lIlqq("fpwzyp", 2022895779, 100869160, 100869120, 100869162, -2146086153, 1806943564, 1092993988, (PD)this);
    }

    private static /* synthetic */ String R(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-107, -83, -11, 70, -80, -118, -27, 114, -38, 31, 85, 73, -116, 40, 109, -40};
        int n = 0;
        int n2 = 37;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 161;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int R(int n) {
        return Integer.rotateRight(Integer.rotateRight(Integer.rotateRight((Integer.rotateLeft(n, 11) ^ 0x257C3A7D) + 1, 3), 8), 19);
    }

    private static /* synthetic */ void ntfClinit() {
        Iltts = "\u001d\u0099|\u0007\u00e7\u00d2\u00feT\u00e8\u00c3\u008a\u001e\u0018fl\u00c4\u0019E\u00bcL\u001c\u009a\u00fb\u00f2\u0015\u00e3\u0087o\u00a2\u00ee\u00d1F\t\u00ba\u00d9\u00b0P\u00e0\u0081\u00a4^:k}C\u00af\u0080>\u0000\u009b\u00ca\u00feY\u00e4\u00d7t\u008co\u0014\u00a9\u00ca\u00f0H\u00bd\u00bcL\u001c\u009a\u00fb\u00f2\u0015\u00e4\u00bb\\\u0097e\n\u00ad\u00df\u00f1l\u00ee\u0080\u00bd\u0014\u008b\u00a6V\u00bcL\u001c\u009a\u00fb\u00f2\u0015\u00e3\u00bdK\u00bcL\u001c\u009a\u00fb\u00f2\u0015\u00c1\u00a2\u00ac\u0014\u0097\u009cnz\u00ee\u00b4A\"\u008e\u00c4\u00cd\u007f\u00e2\u00c3\u00a4(LFcP\u00b0\u0099%\n\u00a9\u00d0\u00f8\u0015\u00dc\u0098\u00ba\u0018\u0019m2x\u00ef\u00b4A\"\u008e\u00c4\u00cd\u007f\u00e2\u00c3\u00a4\u0013L\u001c\u00d1F-\u008c\u00f8\u00e5h\u00ca\u0081\u00e7?/c2E\u00bcL\u001c\u009a\u00fb\u00f2\u0015\u00d5\u0083!\u00d1C<\u00df\u00b4A\"\u008e\u00c4\u00cd\u007f\u00e2\u00c3\u0086041 V\u00c0\u00d1F-\u008c\u00f8\u00e5h\u00ca\u0081\u00e7?6I2\u00ba\u00bcL\u001c\u009a\u00fb\u00f2\u0015\u00da\u00a1\u001edB\u00bcL\u001c\u009a\u00fb\u00f2\u0015\u00e3\u00b8\u0082]\u0094o\u0007\u00ba\u007f\u00bcL\u001c\u009a\u00fb\u00f2\u0015\u00f8\u00ae\u00bd\u00bcL\u001c\u009a\u00fb\u00f2\u0015\u00d5\u00b4d\u0099|\u0007\u00e7\u00d2\u00feT\u00e8\u00c3\u008e\u001d\u0018k}j\u0099|\u0007\u00e7\u00d2\u00feT\u00e8\u00c3\u0081\u001f\u0003onpr\u001d\u0099|\u0007\u00e7\u00cb\u00ebS\u00e3\u00c3\u0084\u0018\u0004~\u00ca\u00b4A\"\u008e\u00c4\u00cd\u007f\u00e2\u00c3\u00a4\u0016L#E^\u00a6\u00bep4\u008d\u00d3\u00b0V\u00f8\u00d7\u008d\u00bcL\u001c\u009a\u00fb\u00f2\u0015\u00df\u00a8!\u00d1F-\u008c\u00f8\u00e5h\u00ca\u0081\u00e7+\u00021\u00cb\u00bcL\u001c\u009a\u00fb\u00f2\u0015\u00d5\u00a4&\u00b4A\"\u008e\u00c4\u00cd\u007f\u00e2\u00c3\u00a4(LFc\u00a2x\u0099%\n\u00a9\u00d0\u00f8\u0015\u00dc\u0098\u00ba\u0018\u0019m2\u0085H\u00beLO\u0084\u00f5\u00db|\u00f5\u00be\u008d\u001cXfX\u00f8\u00b9\u00b4`\u0007\u00be\u00df\u00b0V\u00ee\u0082\u00af^$~{|\u008c\u009f1\u00ca\u00d1F-\u008c\u00f8\u00e5h\u00ca\u0081\u00e7?9nl.\u00d9\u00d1Po\u00bez\u00d1F\f\u00a9\u00c8\u00fe\u0015\u00e3\u008d\u00a6\u0016XEk\u00cf7\u009b~]i5\u00b4e\u0014\u00af\u0091\u00f5U\u00e2\u0080\u00e7<\u0016~{\u0083e\u00ccl5\u00bc\u00df\u00fcQ\u00b4\u00a0\u008351p[\u00afp\u00d7P\u0013\u00f3\u00f2\u00d4~\u00c9\u0096\u009a4\u001a%S\u009f&\u00b4A\"\u008e\u00c4\u00cd\u007f\u00e2\u00c3\u0086)\u001e1E\u00a1Y\u00bep4\u008d\u00d3\u00b0M\u00cd\u00d7\u0081X!\u00a6\u009e\u00a8\u00b4`\u0007\u00be\u00df\u00b0V\u00ee\u0082\u00af^8hc\u0012\u00e3\u008c1O\u0092&\u00b4A\"\u008e\u00c4\u00cd\u007f\u00e2\u00c3\u00869$1 \u008fE\u00bcL\u001c\u009a\u00fb\u00f2\u0015\u00f8\u00ae\u00f3\u001f\u0099y(\u00ad\u00c6\u00eb\u00b3\u00b1\u00bc\u00bcL\u001c\u009a\u00fb\u00f2\u0015\u00c2\u00be(\u00d1F-\u008c\u00f8\u00e5h\u00ca\u0081\u00e7??Y2P\u009dr\u0012M\u0097\u00bc\u00bcL\u001c\u009a\u00fb\u00f2\u0015\u00f6U\u0001\u0099f\u0013\u00ad\u00f1\u00f9$\u008f\u009d~\u000e\u00a7\u00da\u00c0\u000f\u00b7\u00de\u00f1]\u0096~0\u00a9\u00d2\u00ea_B\u00bcL\u001c\u009a\u00fb\u00f2\u0015\u00c1\u00a2\u0086\u0006$\u00a8\u00d1\\\u00aa\u00ab\u00f9V\u00b4A\"\u008e\u00c4\u00cd\u007f\u00e2\u00c3\u00a4(LFc\u008b\b\u0099%\n\u00a9\u00d0\u00f8\u0015\u00dc\u0098\u00ba\u0018\u0019m2\u00b0W\u00b4A\"\u008e\u00c4\u00cd\u007f\u00e2\u00c3\u00a4%L\u00bd\u00bcL\u001c\u009a\u00fb\u00f2\u0015\u00e3\u008e8\u0099|\u0007\u00e7\u00cb\u00ebS\u00e3\u00c3\u0081\u0005\u0012xh\u00d1=\u008a\u00ba\u00bcL\u001c\u009a\u00fb\u00f2\u0015\u00f8\u008e\u0016\u00b1#*\u00a2\u00df\u00e9[\u00a0\u0080\u00a9\u001f\u0010%@\u00a7J\u009dm\u0003\u00ba\u0085\u00a8\u00b4`\u0007\u00be\u00df\u00b0O\u00fb\u0085\u00a4^\u0011\u007fg\u0014\u00f4\u0091e\b\u00e7\u00ee\u00ed_\u00eb\u0085\u00ab\u0010\u0003o2^\u00cc\u00b3N \u00b2\u00ec\u00daW\u00a0\u0080\u00bfJ\u00bc\u00bcL\u001c\u009a\u00fb\u00f2\u0015\u00dd\u00b8\u00baS\u00ee\u00d1F-\u008c\u00f8\u00e5h\u00ca\u0081\u00e7\u001a 1\t\u00ba\u0006V\u00d1F\f\u00a9\u00c8\u00fe\u0015\u00fa\u0098\u00a1\u001dXC}\u008f\f\u0099~\t\u00ba\u00855\u00bcL\u001c\u009a\u00fb\u00f2\u0015\u00c1\u00a2\u00bd$,\u00b4`\u0007\u00be\u00df\u00b0V\u00ee\u0082\u00af^8hc\u00c0\u0014\u008c1";
        OOlpq0m = new int[]{22151178, 5636097, 45744131, 15007745, 27525139, 43057153, 1769474, 0x11000A, 56623105, 46137389, 14942209, 60030995, 42336257, 45940738, 36634625, 40304642, 7405613, 49086474, 53018668, 15073290, 20447258, 0x700001, 30015490, 24379440, 5701642, 43581441, 30146580, 17, 4784140, 29818883, 42467337, 0xF00001, 56688654, 4128778, 46071809, 11993091, 42401793, 0x1190011, 44367880, 17432591, 0x1E00001, 12189697, 57606146, 43122695, 51576854, 36569089, 40435722, 56557569, 1900570, 0x100000A, 23724042, 22806542, 28770320, 6357004, 10354703, 0xAD000A, 31522893, 59244556, 57737217, 19529742, 15794181, 0xDA000A, 55902218, 13303823, 0x550001, 7143427, 36700181, 44892173, 43646987, 41091087, 16121866, 38076443, 3604488, 57802774, 49741842, 39845895, 42074116, 50921482, 0xBB0010};
        PD.T();
        PD.v();
        PD.m();
        PD.s();
        PD.n();
        PD.b();
    }

    private static /* synthetic */ CallSite lIlqq(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = OOlpq0m[n2 ^ 0x6032428];
        int n9 = n8 >>> 16;
        String string2 = PD.Oltrm0(Iltts.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x6032428);
        n8 = OOlpq0m[n3 ^ 0x6032428];
        int n10 = n8 >>> 16;
        String string3 = PD.Oltrm0(Iltts.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x6032428);
        n8 = OOlpq0m[n4 ^ 0x6032428];
        int n11 = n8 >>> 16;
        String string4 = PD.Oltrm0(Iltts.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x6032428);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x7892F015) + -178;
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

    private static /* synthetic */ void IIrtrmjm(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[79];
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
        Iltts = stringBuilder.toString();
        OOlpq0m = nArray;
    }

    private static /* synthetic */ String Oltrm0(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-65, 121, 87, -19, 73, -127, -56, -117, 78, -94, -79, 63, -63, 93, -74, 72};
        byte[] byArray3 = new byte[]{-43, 60, -103, -58, -17, 38, -48, -69, 92, -113, 75, 13, 82, -119, -94, -114};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite llrOppm0O(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = OOlpq0m[n2 ^ 0x6032428];
        int n9 = n8 >>> 16;
        String string2 = PD.Oltrm0(Iltts.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x6032428);
        n8 = OOlpq0m[n3 ^ 0x6032428];
        int n10 = n8 >>> 16;
        String string3 = PD.Oltrm0(Iltts.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x6032428);
        n8 = OOlpq0m[n4 ^ 0x6032428];
        int n11 = n8 >>> 16;
        String string4 = PD.Oltrm0(Iltts.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x6032428);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x7892F015) + -178;
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

    private static /* synthetic */ CallSite IlO0pnIqp(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = OOlpq0m[n2 ^ 0x6032428];
        int n8 = n7 >>> 16;
        String string2 = PD.Oltrm0(Iltts.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0x6032428);
        n7 = OOlpq0m[n3 ^ 0x6032428];
        int n9 = n7 >>> 16;
        String string3 = PD.Oltrm0(Iltts.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0x6032428);
        n7 = OOlpq0m[n4 ^ 0x6032428];
        int n10 = n7 >>> 16;
        String string4 = PD.Oltrm0(Iltts.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0x6032428);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x7892F015) + -178;
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

    private static /* synthetic */ CallSite lIi0pIt(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = OOlpq0m[n2 ^ 0x6032428];
        int n9 = n8 >>> 16;
        String string2 = PD.Oltrm0(Iltts.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x6032428);
        n8 = OOlpq0m[n3 ^ 0x6032428];
        int n10 = n8 >>> 16;
        String string3 = PD.Oltrm0(Iltts.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x6032428);
        n8 = OOlpq0m[n4 ^ 0x6032428];
        int n11 = n8 >>> 16;
        String string4 = PD.Oltrm0(Iltts.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x6032428);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x7892F015) + -178;
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
