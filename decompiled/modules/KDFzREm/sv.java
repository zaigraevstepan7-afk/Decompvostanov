/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NNNwS
 *  KDFzREm.NNuU
 */
package KDFzREm;

import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.RL;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.lY;
import KDFzREm.ld;
import KDFzREm.lj;
import KDFzREm.lv;
import KDFzREm.sG;
import KDFzREm.sd;
import KDFzREm.sk;
import KDFzREm.sl;
import KDFzREm.sn;
import KDFzREm.st;
import KDFzREm.sw;
import KDFzREm.uF;
import KDFzREm.uT;
import KDFzREm.uY;
import KDFzREm.ue;
import KDFzREm.um;
import KDFzREm.us;
import KDFzREm.ut;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;

@UZ(L="AutoLeave", y=UR.PLAYER, N=Uz.AUTO)
public class sv
extends UM {
    private static String[] u;
    private static String[] i;
    private static boolean[] R;
    private static short[] M;
    private static boolean[] B;
    private static boolean[] Z;
    public Object[] L;
    private static byte[] z;
    private static /* synthetic */ String IlsIimt;
    private static /* synthetic */ int[] l1rksnn;

    private static /* synthetic */ int L(int n) {
        return Integer.rotateRight(Integer.rotateRight(-Integer.rotateRight(n, 29), 23) ^ 0xBBC5BC4E, 10);
    }

    private static /* synthetic */ String M(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{84, -64, -107, 125, 74, 15, 15, 116, -19, -84, -35, 67, -66, 98, -121, -22};
        int n = 0;
        int n2 = 76;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 223;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void P() {
        z = new byte[]{4, 2, 3, 3, 2, 2};
    }

    private static void T() {
        R = new boolean[]{false, true, true};
        B = new boolean[]{false, false, false, false, true, true, false, false};
        Z = new boolean[]{false};
    }

    public sv() {
        uY uY2;
        lv lv2;
        sv.lOlss("yepnzzci", -1026219152, 1898786225, 1898786224, 1898786227, -1026219152, -1026219152, (sv)this);
        lv[] lvArray = new lv[sv.lOlss("xefqdc", -1026219148, 1898786225, 1898786228, 1898786231, -1026219148, -1026219148)[0]];
        lvArray[sv.lOlss("vyygsj", -1026219148, 1898786225, 1898786230, 1898786233, -1026219148, -1026219148)[0]] = new sn(this, (String)((Object)sv.lOlss("kdvutmag", -1026219148, 1898786225, 1898786226, 1898786229, -1026219148, -1026219148)[1]), (String)((Object)sv.lOlss("cwrvmne", -1026219148, 1898786225, 1898786226, 1898786229, -1026219148, -1026219148)[2]), (boolean)sv.lOlss("cwrvmne", -1026219148, 1898786225, 1898786230, 1898786233, -1026219148, -1026219148)[1]);
        lvArray[sv.lOlss("cwrvmne", -1026219148, 1898786225, 1898786230, 1898786233, -1026219148, -1026219148)[2]] = new sn(this, (String)((Object)sv.lOlss("zclvxabb", -1026219148, 1898786225, 1898786226, 1898786229, -1026219148, -1026219148)[3]), (String)((Object)sv.lOlss("zclvxabb", -1026219148, 1898786225, 1898786226, 1898786229, -1026219148, -1026219148)[4]), (boolean)sv.lOlss("pswiunhq", -1026219148, 1898786225, 1898786232, 1898786233, -1026219148, -1026219148)[0]);
        lvArray[sv.lOlss("vyygsj", -1026219148, 1898786225, 1898786228, 1898786231, -1026219148, -1026219148)[1]] = new st(this, (String)((Object)sv.lOlss("kjvhn", -1026219148, 1898786225, 1898786226, 1898786229, -1026219148, -1026219148)[5]), (boolean)sv.lOlss("ohcxslgh", -1026219148, 1898786225, 1898786232, 1898786233, -1026219148, -1026219148)[1]);
        lvArray[sv.lOlss("pswiunhq", -1026219148, 1898786225, 1898786228, 1898786231, -1026219148, -1026219148)[2]] = new sG((String)((Object)sv.lOlss("zclvxabb", -1026219148, 1898786225, 1898786226, 1898786229, -1026219148, -1026219148)[6]), (boolean)sv.lOlss("tpsae", -1026219148, 1898786225, 1898786232, 1898786233, -1026219148, -1026219148)[2]);
        CallSite callSite = sv.lOlss("cwrvmne", -1026219138, 1898786235, 1898786234, 1898786237, -1026219138, -1026219138, (lY)this, (String)((Object)sv.lOlss("vigwolpw", -1026219148, 1898786225, 1898786226, 1898786229, -1026219148, -1026219148)[0]), (lv[])lvArray);
        sv.lOlss("kdvutmag", -1026219150, 1898786225, 1898786236, 1898786239, -1026219150, -1026219150, (sv)this)[sv.lOlss("kjvhn", -1026219148, 1898786225, 1898786238, 1898786209, -1026219148, -1026219148)[0]] = callSite;
        CallSite callSite2 = sv.lOlss("uclhx", -1026219137, 1898786210, 1898786213, 1898786212, -1026219137, -1026219137, (List)((Object)sv.lOlss("mzqosmd", -1026219152, 1898786208, 1898786236, 1898786211, -1026219152, -1026219152, (ld)((ld)((Object)sv.lOlss("mzqosmd", -1026219150, 1898786225, 1898786236, 1898786239, -1026219150, -1026219150, (sv)this)[sv.lOlss("mzqosmd", -1026219148, 1898786225, 1898786238, 1898786209, -1026219148, -1026219148)[1]])))));
        while (sv.lOlss("uclhx", -1026219137, 1898786215, 1898786214, 1898786217, -1026219137, -1026219137, (Iterator)((Object)callSite2)) != false) {
            lv2 = (lv)((Object)sv.lOlss("vedv", -1026219137, 1898786215, 1898786216, 1898786219, -1026219137, -1026219137, (Iterator)((Object)callSite2)));
            if (!(lv2 instanceof uY)) continue;
            uY2 = (uY)((Object)lv2);
            sv.lOlss("xefqdc", -1026219137, 1898786218, 1898786234, 1898786221, -1026219137, -1026219137, (uY)uY2, (Object)this);
        }
        lv[] lvArray2 = new ue[sv.lOlss("yepnzzci", -1026219148, 1898786225, 1898786228, 1898786231, -1026219148, -1026219148)[3]];
        lvArray2[sv.lOlss("zclvxabb", -1026219148, 1898786225, 1898786232, 1898786233, -1026219148, -1026219148)[3]] = new sw(this, (String)((Object)sv.lOlss("uclhx", -1026219148, 1898786225, 1898786220, 1898786229, -1026219148, -1026219148)[1]), (boolean)sv.lOlss("zclvxabb", -1026219148, 1898786225, 1898786232, 1898786233, -1026219148, -1026219148)[4]);
        lvArray2[sv.lOlss("ohcxslgh", -1026219148, 1898786225, 1898786232, 1898786233, -1026219148, -1026219148)[5]] = new sd(this, (String)((Object)sv.lOlss("vedv", -1026219148, 1898786225, 1898786220, 1898786229, -1026219148, -1026219148)[2]), (boolean)sv.lOlss("pswiunhq", -1026219148, 1898786225, 1898786232, 1898786233, -1026219148, -1026219148)[6]);
        lvArray2[sv.lOlss("tpsae", -1026219148, 1898786225, 1898786228, 1898786231, -1026219148, -1026219148)[4]] = new sk(this, (String)((Object)sv.lOlss("teoul", -1026219148, 1898786225, 1898786220, 1898786229, -1026219148, -1026219148)[3]), (boolean)sv.lOlss("teoul", -1026219148, 1898786225, 1898786232, 1898786233, -1026219148, -1026219148)[7]);
        CallSite callSite3 = sv.lOlss("yepnzzci", -1026219138, 1898786235, 1898786223, 1898786222, -1026219138, -1026219138, (lY)this, (String)((Object)sv.lOlss("vyygsj", -1026219148, 1898786225, 1898786220, 1898786229, -1026219148, -1026219148)[0]), (lv[])lvArray2);
        sv.lOlss("uclhx", -1026219150, 1898786225, 1898786236, 1898786239, -1026219150, -1026219150, (sv)this)[sv.lOlss("teoul", -1026219148, 1898786225, 1898786238, 1898786209, -1026219148, -1026219148)[2]] = callSite3;
        callSite2 = sv.lOlss("kdvutmag", -1026219137, 1898786210, 1898786213, 1898786212, -1026219137, -1026219137, (List)((Object)sv.lOlss("tpsae", -1026219152, 1898786193, 1898786236, 1898786211, -1026219152, -1026219152, (lj)((lj)((Object)sv.lOlss("kdvutmag", -1026219150, 1898786225, 1898786236, 1898786239, -1026219150, -1026219150, (sv)this)[sv.lOlss("zclvxabb", -1026219148, 1898786225, 1898786238, 1898786209, -1026219148, -1026219148)[3]])))));
        while (sv.lOlss("yepnzzci", -1026219137, 1898786215, 1898786214, 1898786217, -1026219137, -1026219137, (Iterator)((Object)callSite2)) != false) {
            lv2 = (ue)((Object)sv.lOlss("teoul", -1026219137, 1898786215, 1898786216, 1898786219, -1026219137, -1026219137, (Iterator)((Object)callSite2)));
            if (!(lv2 instanceof uY)) continue;
            uY2 = (uY)((Object)lv2);
            sv.lOlss("uclhx", -1026219137, 1898786218, 1898786234, 1898786221, -1026219137, -1026219137, (uY)uY2, (Object)this);
        }
    }

    static {
        sv.ntfClinit();
    }

    private static /* synthetic */ String B(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{106, 43, 107, -11, 127, 72, 110, -64, -32, -24, 33, 18, -23, 96, -8, 116};
        int n = 0;
        int n2 = 76;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 151;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String Z(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{120, -119, 92, -22, -4, -53, 70, 60, -60, -35, -114, 49, 114, 34, -59, 93};
        int n = 0;
        int n2 = 77;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 99;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String i(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{95, -48, -113, 48, 14, -94, 108, -38, -63, -38, 125, 61, 127, -67, -73, -116};
        int n = 0;
        int n2 = 6;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 159;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void b() {
        M = new short[]{0, 0, 1, 1, 1, 0, 4, 0};
    }

    private static void s() {
        u = new String[]{"action", "hub", "hub", "spawn", "spawn", "custom-command", "disconnect"};
        i = new String[]{"triggers", "player-nearby", "health", "was-in-pvp"};
    }

    public void m() {
        sv.lOlss("mzqosmd", -1026219152, 1898786225, 1898786224, 1898786227, -2083971381, -1296275375, (sv)this);
        if (sv.lOlss("vyygsj", -1026219152, 1898786203, 1898786234, 1898786217, -2083971381, -1296275375, (um)((um)((Object)sv.lOlss("ohcxslgh", -1026219152, 1898786200, 1898786234, 1898786219, -2083971381, -1296275375, (us)((Object)sv.lOlss("tpsae", -1026219152, 1898786198, 1898786223, 1898786201, -2083971381, -1296275375, (uT)((uT)((Object)sv.lOlss("vigwolpw", -1026219137, 1898786197, 1898786196, 1898786199, -2083971381, -1296275375, (ut)((ut)((NNNwS)sv.lOlss("yepnzzci", -1026219150, 1898786195, 1898786194, 1898786239, -44936601, 1820228347, (NNuU)((NNuU)sv.lOlss("mzqosmd", -1026219150, 1898786225, 1898786223, 1898786239, 696856010, -1379081247, (sv)this)[sv.lOlss("pswiunhq", -1026219148, 1898786225, 1898786238, 1898786209, 85020165, 401899955)[5]]))[sv.lOlss("teoul", -1026219148, 1898786225, 1898786238, 1898786209, -1754026726, 2074298648)[6]]))))))))))) != false) {
            return;
        }
        sv.lOlss("tpsae", -1026219137, 1898786202, 1898786234, 1898786227, -2083971381, -1296275375, (sl)((sl)((Object)((lv)((Object)sv.lOlss("vigwolpw", -1026219152, 1898786208, 1898786220, 1898786219, -2083971381, -1296275375, (ld)((ld)((Object)sv.lOlss("teoul", -1026219150, 1898786225, 1898786236, 1898786239, 62234428, 2049316117, (sv)this)[sv.lOlss("mzqosmd", -1026219148, 1898786225, 1898786238, 1898786209, -240648300, 556258272)[7]]))))))));
        sv.lOlss("tpsae", -1026219152, 1898786225, 1898786234, 1898786204, -2083971381, -1296275375, (sv)this, (boolean)sv.lOlss("cwrvmne", -1026219148, 1898786225, 1898786205, 1898786233, -1142302550, 91399560)[0]);
    }

    private void j() {
        if (sv.lOlss("kjvhn", -1026219150, 1898786225, 1898786236, 1898786239, -1026219150, -1026219150, (sv)this) == null) {
            sv.lOlss("teoul", -1026219149, 1898786225, 1898786236, 1898786239, -1026219149, -1026219149, (sv)this, (Object[])new Object[sv.lOlss("kdvutmag", -1026219148, 1898786225, 1898786228, 1898786231, -1026219148, -1026219148)[5]]);
            CallSite callSite = sv.lOlss("yepnzzci", -1026219150, 1898786225, 1898786236, 1898786239, -1026219150, -1026219150, (sv)this);
        }
    }

    private static /* synthetic */ String U(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-99, 17, -114, -32, -51, 66, 62, -41, 126, -37, -81, -68, -20, 39, -42, -101};
        int n = 0;
        int n2 = 184;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 121;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String z(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-36, -50, 69, -122, 92, 62, -94, 26, -24, -120, 10, -66, -11, 62, -48, -68};
        int n = 0;
        int n2 = 23;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 177;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int u(int n) {
        return Integer.rotateRight(Integer.rotateLeft(-Integer.rotateLeft(-Integer.rotateRight(n, 11), 22), 16), 11);
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-83, 74, -8, -24, 99, -23, -10, -5, -62, -87, -22, -32, -127, -19, -111, -113};
        int n = 0;
        int n2 = 163;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 175;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int y(int n) {
        return -Integer.rotateLeft(Integer.rotateLeft(Integer.rotateLeft(Integer.rotateLeft(Integer.rotateLeft(Integer.rotateRight(n ^ 0x54F75DE9, 8), 3), 21), 14), 6), 26);
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{109, 48, -48, -85, 105, -8, -70, -121, 114, -12, 41, -113, -68, 19, 121, 105};
        int n = 0;
        int n2 = 70;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 227;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String E(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{6, 116, 27, -67, 98, 44, -48, 110, -113, 82, 55, 87, -42, -86, -50, 8};
        int n = 0;
        int n2 = 133;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 75;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateLeft(Integer.rotateRight(Integer.rotateLeft(Integer.rotateLeft(n, 27), 7), 20), 16) ^ 0xCACAE780;
    }

    @uF
    public void N(RL rL) {
        sv.lOlss("yepnzzci", -1026219152, 1898786225, 1898786224, 1898786227, -2083971381, -1296275375, (sv)this);
        CallSite callSite = sv.lOlss("tpsae", -1026219137, 1898786210, 1898786213, 1898786212, -2083971381, -1296275375, (List)((List)((Object)sv.lOlss("tpsae", -1026219152, 1898786193, 1898786220, 1898786219, -2083971381, -1296275375, (lj)((lj)((Object)sv.lOlss("kjvhn", -1026219150, 1898786225, 1898786236, 1898786239, 1460954966, 1516010475, (sv)this)[sv.lOlss("pswiunhq", -1026219148, 1898786225, 1898786238, 1898786209, 1319023007, -2118297509)[4]]))))));
        while (sv.lOlss("tpsae", -1026219137, 1898786215, 1898786214, 1898786217, -2083971381, -1296275375, (Iterator)((Object)callSite)) != false) {
            ue ue2 = (ue)((Object)sv.lOlss("teoul", -1026219137, 1898786215, 1898786216, 1898786219, -2083971381, -1296275375, (Iterator)((Object)callSite)));
            sv.lOlss("tpsae", -1026219152, 1898786192, 1898786223, 1898786221, -2083971381, -1296275375, (ue)ue2, (Object)rL);
        }
    }

    private static /* synthetic */ String W(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-128, 78, 44, -106, -28, -100, -28, 87, 82, -100, -31, -8, 76, 64, -125, -93};
        int n = 0;
        int n2 = 190;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 145;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String R(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-105, 116, -115, -8, 16, -121, 96, -16, 31, -50, -39, 8, 88, -128, -114, 76};
        int n = 0;
        int n2 = 233;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 155;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        IlsIimt = "m\u0007r\u00e1\u00c4am\u00c0\u00ees[\u000f^\u00fa\u00e0E/\u0083\u00fan7!$[*\u00edn$\u000f\u008ajx\u00d0\u00d2bz\u00bd\u00dem\u007f{\u0015\u0014b\"B\u00fa\u00b9Qt\u0086\u00f7/\u001cg\u0004[\u00f9\u0001\f\u000f^\u00fa\u00e0E/\u0083\u00fan7!8M2\u00e1G7\u000f\u00b2\u00c0\u00a1\u000f^\u00fa\u00e0E/\u0083\u00fan7!8M2S\u00997\u000f\f\u000f\u007f\u00df\u00d0^R\u00aa\u00f6/<WLc2\u00e5R\"\u001b\u00f7\u00f7Jg\u00c0\u00c8t\"g\u0019Hc\u00dfh\bp\u00dd\u00ecvE\u0082\u00b4l&5^c\u0013\u00c0b9f\u00de\u00fb\u000bl\u008b\u00a0\u0000\u0007r\u00e1\u00c4am\u00c0\u00eeTxjx\u00f1\u00f7Ra\u00c0\u00f7a>iX`:\u001c5 @\u00a0[\u0007r\u00e1\u00c4am\u00c0\u00d5N%[\u00dcjx\u00f1\u00f7Ra\u00c0\u00eet9bXf,\u00e1\u0086\"@\u00f4\u00e4\u001fK\u0007r\u00e1\u00c4am\u00c0\u00eet}\u00b9\u0019H&L\u00ef\u0083\u00f4\u0007r\u00e1\u00c4am\u00c0\u00f7di7Q\u00e9\u00f7Po\u009d\u0093\u00d5\u001b\u0007r\u00e1\u00c4am\u00c0\u00eem\u00d5\u00f4\u0007r\u00e1\u00c4am\u00c0\u00eee\u009cd\u00f8\u0019\u001d\u00cd#\"G\u00d5\u00f3\\t\u00b6jn\u008e\u0090\"@\u00fa\u00dbEn\u008e\u00fce\"8jx\u00f1\u00f7Ra\u00c0\u00eet9bXc1\u0005dx\u00c8\"B\u00fa\u00b9Qt\u0086\u00f7/\u0019z\u0012]9B\u00cd1\u001b\u0007r\u00e1\u00c4am\u00c0\u00f7k|\u0010l\u0007r\u00e1\u00c4am\u00c0\u00f7j\u00b6jx\u00d0\u00d2bz\u00bd\u00dem\u007f{\u0004\u00148jb\u00f6\u000f\u007f\u00df\u00d0^R\u00aa\u00f6/<WLc2W\u00a8\"\u001b\u00f7\u00f7Jg\u00c0\u00c8t\"g\u0019Hcm\u0092\bp\u00dd\u00ecvE\u0082\u00b4l&5^c\u0013r\u00989f\u00de\u00fb\u000bl\u0085\u00a0~\u00c5\u0019l\u0007r\u00e1\u00c4am\u00c0\u00e8v\u00d0\u0007r\u00e1\u00c4am\u00c0\u00e8l\u00d0\u0007r\u00e1\u00c4am\u00c0\u00eeY\\";
        l1rksnn = new int[]{28966922, 0x10C0001, 24838147, 15073281, 655379, 19333121, 3735554, 15204353, 28835842, 0x1180001, 22478858, 0x1010001, 6488121, 0x1170001, 5242899, 0x1000001, 23134210, 0xEE000A, 20119570, 2818062, 0xF80008, 12976150, 21299218, 18677767, 19136515, 15269892, 10878996, 30277642, 3866645, 15138817, 15532033, 25034809, 23265290, 17629194, 12189708, 30932993, 14417930, 19398667, 1900558, 10223626, 23920654, 10, 16908298, 29622282, 28770305, 18415620};
        sv.b();
        sv.P();
        sv.T();
        sv.s();
    }

    private static /* synthetic */ CallSite lOlss(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = l1rksnn[n2 ^ 0x712D2DB1];
        int n8 = n7 >>> 16;
        String string2 = sv.llmk0nrk(IlsIimt.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0x712D2DB1);
        n7 = l1rksnn[n3 ^ 0x712D2DB1];
        int n9 = n7 >>> 16;
        String string3 = sv.llmk0nrk(IlsIimt.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0x712D2DB1);
        n7 = l1rksnn[n4 ^ 0x712D2DB1];
        int n10 = n7 >>> 16;
        String string4 = sv.llmk0nrk(IlsIimt.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0x712D2DB1);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xC2D523C6) + -178;
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

    private static /* synthetic */ String llmk0nrk(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-44, -97, -60, 4, 74, 79, 118, 107, -16, 10, -124, 32, -13, -36, 46, -14};
        byte[] byArray3 = new byte[]{116, -86, 22, -36, -81, -34, -52, 51, 25, -10, 54, 95, 106, -81, 92, 87};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite lI0jOm(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = l1rksnn[n2 ^ 0x712D2DB1];
        int n8 = n7 >>> 16;
        String string2 = sv.llmk0nrk(IlsIimt.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0x712D2DB1);
        n7 = l1rksnn[n3 ^ 0x712D2DB1];
        int n9 = n7 >>> 16;
        String string3 = sv.llmk0nrk(IlsIimt.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0x712D2DB1);
        n7 = l1rksnn[n4 ^ 0x712D2DB1];
        int n10 = n7 >>> 16;
        String string4 = sv.llmk0nrk(IlsIimt.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0x712D2DB1);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xC2D523C6) + -178;
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

    private static /* synthetic */ CallSite l1pqOk00(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = l1rksnn[n2 ^ 0x712D2DB1];
        int n9 = n8 >>> 16;
        String string2 = sv.llmk0nrk(IlsIimt.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x712D2DB1);
        n8 = l1rksnn[n3 ^ 0x712D2DB1];
        int n10 = n8 >>> 16;
        String string3 = sv.llmk0nrk(IlsIimt.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x712D2DB1);
        n8 = l1rksnn[n4 ^ 0x712D2DB1];
        int n11 = n8 >>> 16;
        String string4 = sv.llmk0nrk(IlsIimt.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x712D2DB1);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xC2D523C6) + -178;
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

    private static /* synthetic */ CallSite I1pkqsr(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) throws Exception {
        int n9 = l1rksnn[n2 ^ 0x712D2DB1];
        int n10 = n9 >>> 16;
        String string2 = sv.llmk0nrk(IlsIimt.substring(n10, n10 + (n9 & 0xFFFF)), n2 ^ 0x712D2DB1);
        n9 = l1rksnn[n3 ^ 0x712D2DB1];
        int n11 = n9 >>> 16;
        String string3 = sv.llmk0nrk(IlsIimt.substring(n11, n11 + (n9 & 0xFFFF)), n3 ^ 0x712D2DB1);
        n9 = l1rksnn[n4 ^ 0x712D2DB1];
        int n12 = n9 >>> 16;
        String string4 = sv.llmk0nrk(IlsIimt.substring(n12, n12 + (n9 & 0xFFFF)), n4 ^ 0x712D2DB1);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xC2D523C6) + -178;
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

    private static /* synthetic */ void OOtrpn0(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[46];
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
        IlsIimt = stringBuilder.toString();
        l1rksnn = nArray;
    }
}
