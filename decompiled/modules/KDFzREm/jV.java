/*
 * Decompiled with CFR 0.152.
 */
package KDFzREm;

import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.lY;
import KDFzREm.ld;
import KDFzREm.lj;
import KDFzREm.lv;
import KDFzREm.td;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;

@UZ(L="Logo", y=UR.VISUAL, N=Uz.INTERFACE)
public class jV
extends UM {
    private static short[] i;
    private static short[] R;
    private static byte[] M;
    public Object[] L;
    private static boolean[] B;
    private static byte[] Z;
    private static String[] z;
    public Object[] u;
    private static boolean[] U;
    private static boolean[] W;
    private static short[] m;
    private static short[] P;
    private static short[] s;
    private static String[] T;
    private static /* synthetic */ String lIipOj;
    private static /* synthetic */ int[] l1nlst;

    private static /* synthetic */ int L(int n) {
        return Integer.rotateRight(Integer.rotateLeft(-Integer.rotateLeft(-Integer.rotateRight(Integer.rotateLeft(n ^ 0x9CB7312, 9), 5), 20), 15), 24);
    }

    private static /* synthetic */ String M(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{49, -63, 59, -54, -72, 94, 35, -80, 80, -95, 122, 118, -13, -28, -40, 46};
        int n = 0;
        int n2 = 233;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 11;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    public lv P() {
        jV.OlOIqkllk("cpbxrr", 1299054672, -33556232, -33556231, -33556229, 1534284043, 1364313228, -330082372, (jV)this);
        return (lv)((Object)jV.OlOIqkllk("vnxvtay", 1299054674, -33556232, -33556238, -33556233, -498053555, -604477917, -439933222, (jV)this)[jV.OlOIqkllk("wrfijibz", 1299054676, -33556232, -33556236, -33556235, -669462303, 1477925532, -682320302)[1]]);
    }

    public ld<lv> T() {
        jV.OlOIqkllk("lbndw", 1299054672, -33556232, -33556231, -33556229, 1534284043, 1364313228, -330082372, (jV)this);
        return (ld)((Object)jV.OlOIqkllk("ijhxp", 1299054674, -33556232, -33556234, -33556233, -1397604927, 524567621, -2031426525, (jV)this)[jV.OlOIqkllk("uegdoww", 1299054676, -33556232, -33556236, -33556235, 820719494, -55930721, 1576710255)[5]]);
    }

    private static void Q() {
        W = new boolean[]{true, true, true};
        B = new boolean[]{true, true, true};
        U = new boolean[]{true, false, true, true, false, false, true};
    }

    public jV() {
        jV.OlOIqkllk("bubv", 1299054672, -33556232, -33556231, -33556229, 1299054672, 1299054672, 1299054672, (jV)this);
        lv lv3 = new lv((String)((Object)jV.OlOIqkllk("lbndw", 1299054676, -33556232, -33556244, -33556243, 1299054676, 1299054676, 1299054676)[0]), (boolean)jV.OlOIqkllk("bubv", 1299054676, -33556232, -33556246, -33556245, 1299054676, 1299054676, 1299054676)[0]);
        jV.OlOIqkllk("ldyv", 1299054674, -33556232, -33556238, -33556233, 1299054674, 1299054674, 1299054674, (jV)this)[jV.OlOIqkllk("vnxvtay", 1299054676, -33556232, -33556248, -33556235, 1299054676, 1299054676, 1299054676)[0]] = lv3;
        lv lv4 = new lv((String)((Object)jV.OlOIqkllk("evym", 1299054676, -33556232, -33556244, -33556243, 1299054676, 1299054676, 1299054676)[1]), (boolean)jV.OlOIqkllk("evym", 1299054676, -33556232, -33556246, -33556245, 1299054676, 1299054676, 1299054676)[1]);
        jV.OlOIqkllk("aekcr", 1299054674, -33556232, -33556238, -33556233, 1299054674, 1299054674, 1299054674, (jV)this)[jV.OlOIqkllk("cwubk", 1299054676, -33556232, -33556248, -33556235, 1299054676, 1299054676, 1299054676)[1]] = lv4;
        lv lv5 = new lv((String)((Object)jV.OlOIqkllk("cwubk", 1299054676, -33556232, -33556244, -33556243, 1299054676, 1299054676, 1299054676)[2]), (boolean)jV.OlOIqkllk("gbrdyqo", 1299054676, -33556232, -33556246, -33556245, 1299054676, 1299054676, 1299054676)[2]);
        jV.OlOIqkllk("cwubk", 1299054674, -33556232, -33556238, -33556233, 1299054674, 1299054674, 1299054674, (jV)this)[jV.OlOIqkllk("vnxvtay", 1299054676, -33556232, -33556248, -33556235, 1299054676, 1299054676, 1299054676)[2]] = lv5;
        lv lv6 = new lv((String)((Object)jV.OlOIqkllk("uegdoww", 1299054676, -33556232, -33556247, -33556243, 1299054676, 1299054676, 1299054676)[0]), (boolean)jV.OlOIqkllk("tpnid", 1299054676, -33556232, -33556250, -33556245, 1299054676, 1299054676, 1299054676)[0]);
        jV.OlOIqkllk("vnxvtay", 1299054674, -33556232, -33556238, -33556233, 1299054674, 1299054674, 1299054674, (jV)this)[jV.OlOIqkllk("vnxvtay", 1299054676, -33556232, -33556248, -33556235, 1299054676, 1299054676, 1299054676)[3]] = lv6;
        lv lv7 = new lv((String)((Object)jV.OlOIqkllk("cpbxrr", 1299054676, -33556232, -33556247, -33556243, 1299054676, 1299054676, 1299054676)[1]), (boolean)jV.OlOIqkllk("xihf", 1299054676, -33556232, -33556250, -33556245, 1299054676, 1299054676, 1299054676)[1]);
        jV.OlOIqkllk("lbndw", 1299054674, -33556232, -33556238, -33556233, 1299054674, 1299054674, 1299054674, (jV)this)[jV.OlOIqkllk("xihf", 1299054676, -33556232, -33556248, -33556235, 1299054676, 1299054676, 1299054676)[4]] = lv7;
        lv lv8 = new lv((String)((Object)jV.OlOIqkllk("tpnid", 1299054676, -33556232, -33556247, -33556243, 1299054676, 1299054676, 1299054676)[2]), (boolean)jV.OlOIqkllk("gbrdyqo", 1299054676, -33556232, -33556250, -33556245, 1299054676, 1299054676, 1299054676)[2]);
        jV.OlOIqkllk("cwubk", 1299054674, -33556232, -33556238, -33556233, 1299054674, 1299054674, 1299054674, (jV)this)[jV.OlOIqkllk("ijhxp", 1299054676, -33556232, -33556249, -33556235, 1299054676, 1299054676, 1299054676)[0]] = lv8;
        lv lv9 = new lv((String)((Object)jV.OlOIqkllk("ijhxp", 1299054676, -33556232, -33556247, -33556243, 1299054676, 1299054676, 1299054676)[3]), (boolean)jV.OlOIqkllk("vnxvtay", 1299054676, -33556232, -33556252, -33556245, 1299054676, 1299054676, 1299054676)[0]);
        jV.OlOIqkllk("tpnid", 1299054674, -33556232, -33556238, -33556233, 1299054674, 1299054674, 1299054674, (jV)this)[jV.OlOIqkllk("aekcr", 1299054676, -33556232, -33556249, -33556235, 1299054676, 1299054676, 1299054676)[1]] = lv9;
        lv[] lvArray = new lv[jV.OlOIqkllk("ldyv", 1299054676, -33556232, -33556251, -33556241, 1299054676, 1299054676, 1299054676)[0]];
        lvArray[jV.OlOIqkllk("evym", 1299054676, -33556232, -33556252, -33556245, 1299054676, 1299054676, 1299054676)[1]] = (lv)((Object)jV.OlOIqkllk("uegdoww", 1299054674, -33556232, -33556238, -33556233, 1299054674, 1299054674, 1299054674, (jV)this)[jV.OlOIqkllk("hozz", 1299054676, -33556232, -33556249, -33556235, 1299054676, 1299054676, 1299054676)[2]]);
        lvArray[jV.OlOIqkllk("aekcr", 1299054676, -33556232, -33556252, -33556245, 1299054676, 1299054676, 1299054676)[2]] = (lv)((Object)jV.OlOIqkllk("bubv", 1299054674, -33556232, -33556238, -33556233, 1299054674, 1299054674, 1299054674, (jV)this)[jV.OlOIqkllk("uegdoww", 1299054676, -33556232, -33556249, -33556235, 1299054676, 1299054676, 1299054676)[3]]);
        lvArray[jV.OlOIqkllk("evym", 1299054676, -33556232, -33556251, -33556241, 1299054676, 1299054676, 1299054676)[1]] = (lv)((Object)jV.OlOIqkllk("ijhxp", 1299054674, -33556232, -33556238, -33556233, 1299054674, 1299054674, 1299054674, (jV)this)[jV.OlOIqkllk("ijhxp", 1299054676, -33556232, -33556249, -33556235, 1299054676, 1299054676, 1299054676)[4]]);
        lvArray[jV.OlOIqkllk("wrfijibz", 1299054676, -33556232, -33556251, -33556241, 1299054676, 1299054676, 1299054676)[2]] = (lv)((Object)jV.OlOIqkllk("ldyv", 1299054674, -33556232, -33556238, -33556233, 1299054674, 1299054674, 1299054674, (jV)this)[jV.OlOIqkllk("xihf", 1299054676, -33556232, -33556249, -33556235, 1299054676, 1299054676, 1299054676)[5]]);
        lvArray[jV.OlOIqkllk("aekcr", 1299054676, -33556232, -33556251, -33556241, 1299054676, 1299054676, 1299054676)[3]] = (lv)((Object)jV.OlOIqkllk("tpnid", 1299054674, -33556232, -33556238, -33556233, 1299054674, 1299054674, 1299054674, (jV)this)[jV.OlOIqkllk("lbndw", 1299054676, -33556232, -33556225, -33556235, 1299054676, 1299054676, 1299054676)[0]]);
        lvArray[jV.OlOIqkllk("xihf", 1299054676, -33556232, -33556251, -33556241, 1299054676, 1299054676, 1299054676)[4]] = (lv)((Object)jV.OlOIqkllk("cwubk", 1299054674, -33556232, -33556238, -33556233, 1299054674, 1299054674, 1299054674, (jV)this)[jV.OlOIqkllk("uegdoww", 1299054676, -33556232, -33556225, -33556235, 1299054676, 1299054676, 1299054676)[1]]);
        lvArray[jV.OlOIqkllk("evym", 1299054676, -33556232, -33556239, -33556241, 1299054676, 1299054676, 1299054676)[0]] = (lv)((Object)jV.OlOIqkllk("ldyv", 1299054674, -33556232, -33556238, -33556233, 1299054674, 1299054674, 1299054674, (jV)this)[jV.OlOIqkllk("cwubk", 1299054676, -33556232, -33556225, -33556235, 1299054676, 1299054676, 1299054676)[2]]);
        lj lj2 = (lj)((Object)jV.OlOIqkllk("hozz", 1299054672, -33556255, -33556230, -33556258, 1299054672, 1299054672, 1299054672, (lj)((Object)jV.OlOIqkllk("ijhxp", 1299054686, -33556254, -33556253, -33556256, 1299054686, 1299054686, 1299054686, (lY)this, (String)((Object)jV.OlOIqkllk("bubv", 1299054676, -33556232, -33556247, -33556243, 1299054676, 1299054676, 1299054676)[4]), (lv[])lvArray)), (lw2, list) -> jV.OlOIqkllk("aekcr", 1299054672, -33556227, -33556230, -33556229, 1534284043, 1364313228, -330082372, (td)((Object)jV.OlOIqkllk("ijhxp", 1299054686, -33556226, -33556225, -33556228, 1534284043, 1364313228, -330082372)))));
        jV.OlOIqkllk("xihf", 1299054674, -33556232, -33556238, -33556233, 1299054674, 1299054674, 1299054674, (jV)this)[jV.OlOIqkllk("aekcr", 1299054676, -33556232, -33556225, -33556235, 1299054676, 1299054676, 1299054676)[3]] = lj2;
        lv lv10 = new lv((String)((Object)jV.OlOIqkllk("tpnid", 1299054676, -33556232, -33556247, -33556243, 1299054676, 1299054676, 1299054676)[5]), (boolean)jV.OlOIqkllk("bubv", 1299054676, -33556232, -33556252, -33556245, 1299054676, 1299054676, 1299054676)[3]);
        jV.OlOIqkllk("aekcr", 1299054674, -33556232, -33556234, -33556233, 1299054674, 1299054674, 1299054674, (jV)this)[jV.OlOIqkllk("cwubk", 1299054676, -33556232, -33556225, -33556235, 1299054676, 1299054676, 1299054676)[4]] = lv10;
        lv lv11 = new lv((String)((Object)jV.OlOIqkllk("evym", 1299054676, -33556232, -33556247, -33556243, 1299054676, 1299054676, 1299054676)[6]), (boolean)jV.OlOIqkllk("wrfijibz", 1299054676, -33556232, -33556252, -33556245, 1299054676, 1299054676, 1299054676)[4]);
        jV.OlOIqkllk("ijhxp", 1299054674, -33556232, -33556234, -33556233, 1299054674, 1299054674, 1299054674, (jV)this)[jV.OlOIqkllk("wrfijibz", 1299054676, -33556232, -33556225, -33556235, 1299054676, 1299054676, 1299054676)[5]] = lv11;
        lv[] lvArray2 = new lv[jV.OlOIqkllk("ijhxp", 1299054676, -33556232, -33556239, -33556241, 1299054676, 1299054676, 1299054676)[1]];
        lvArray2[jV.OlOIqkllk("uegdoww", 1299054676, -33556232, -33556252, -33556245, 1299054676, 1299054676, 1299054676)[5]] = (lv)((Object)jV.OlOIqkllk("cpbxrr", 1299054674, -33556232, -33556234, -33556233, 1299054674, 1299054674, 1299054674, (jV)this)[jV.OlOIqkllk("tpnid", 1299054676, -33556232, -33556225, -33556235, 1299054676, 1299054676, 1299054676)[6]]);
        lvArray2[jV.OlOIqkllk("czttx", 1299054676, -33556232, -33556252, -33556245, 1299054676, 1299054676, 1299054676)[6]] = (lv)((Object)jV.OlOIqkllk("aekcr", 1299054674, -33556232, -33556234, -33556233, 1299054674, 1299054674, 1299054674, (jV)this)[jV.OlOIqkllk("czttx", 1299054676, -33556232, -33556225, -33556235, 1299054676, 1299054676, 1299054676)[7]]);
        ld ld2 = (ld)((Object)jV.OlOIqkllk("bubv", 1299054672, -33556260, -33556230, -33556258, 1299054672, 1299054672, 1299054672, (ld)((Object)jV.OlOIqkllk("ijhxp", 1299054686, -33556254, -33556230, -33556257, 1299054686, 1299054686, 1299054686, (lY)this, (String)((Object)jV.OlOIqkllk("aekcr", 1299054676, -33556232, -33556247, -33556243, 1299054676, 1299054676, 1299054676)[7]), (lv[])lvArray2)), (lw2, lv2) -> jV.OlOIqkllk("cwubk", 1299054672, -33556227, -33556230, -33556229, 1534284043, 1364313228, -330082372, (td)((Object)jV.OlOIqkllk("evym", 1299054686, -33556226, -33556225, -33556228, 1534284043, 1364313228, -330082372)))));
        jV.OlOIqkllk("vnxvtay", 1299054674, -33556232, -33556234, -33556233, 1299054674, 1299054674, 1299054674, (jV)this)[jV.OlOIqkllk("ijhxp", 1299054676, -33556232, -33556237, -33556235, 1299054676, 1299054676, 1299054676)[0]] = ld2;
    }

    static {
        jV.ntfClinit();
    }

    private static /* synthetic */ String B(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-63, 29, -69, 4, 120, 85, -64, 7, 72, 85, -100, -126, 51, -123, 92, 30};
        int n = 0;
        int n2 = 250;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 59;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String Z(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-94, -28, -102, -34, -105, -3, 50, -127, 32, 97, -63, 31, 125, 57, -79, 10};
        int n = 0;
        int n2 = 209;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 187;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    @Override
    public boolean Z() {
        jV.OlOIqkllk("xihf", 1299054672, -33556227, -33556230, -33556229, 1299054672, 1299054672, 1299054672, (td)((Object)jV.OlOIqkllk("cwubk", 1299054686, -33556226, -33556225, -33556228, 1299054686, 1299054686, 1299054686)));
        return (boolean)jV.OlOIqkllk("aekcr", 1299054673, -33556240, -33556239, -33556242, 1299054673, 1299054673, 1299054673, (UM)this);
    }

    @Override
    public boolean i() {
        jV.OlOIqkllk("uegdoww", 1299054672, -33556227, -33556230, -33556229, 1534284043, 1364313228, -330082372, (td)((Object)jV.OlOIqkllk("evym", 1299054686, -33556226, -33556225, -33556228, 1534284043, 1364313228, -330082372)));
        return (boolean)jV.OlOIqkllk("czttx", 1299054673, -33556240, -33556225, -33556242, 1534284043, 1364313228, -330082372, (UM)this);
    }

    private static /* synthetic */ String i(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{118, -45, 3, -10, -97, -108, -55, -105, 82, -29, 73, -55, 22, -57, 38, 73};
        int n = 0;
        int n2 = 221;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 177;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    public lv b() {
        jV.OlOIqkllk("xihf", 1299054672, -33556232, -33556231, -33556229, 1534284043, 1364313228, -330082372, (jV)this);
        return (lv)((Object)jV.OlOIqkllk("tpnid", 1299054674, -33556232, -33556238, -33556233, 150090848, 2145765409, -1982503610, (jV)this)[jV.OlOIqkllk("gbrdyqo", 1299054676, -33556232, -33556237, -33556235, 188106406, -1930566205, -2022953828)[3]]);
    }

    public lv s() {
        jV.OlOIqkllk("tpnid", 1299054672, -33556232, -33556231, -33556229, 1534284043, 1364313228, -330082372, (jV)this);
        return (lv)((Object)jV.OlOIqkllk("hozz", 1299054674, -33556232, -33556238, -33556233, 1420686058, -719366325, 1637619220, (jV)this)[jV.OlOIqkllk("tpnid", 1299054676, -33556232, -33556237, -33556235, 1087663018, 875899862, -1695873821)[2]]);
    }

    public lv n() {
        jV.OlOIqkllk("tpnid", 1299054672, -33556232, -33556231, -33556229, 1534284043, 1364313228, -330082372, (jV)this);
        return (lv)((Object)jV.OlOIqkllk("ijhxp", 1299054674, -33556232, -33556238, -33556233, 1788372414, -290328998, 1215493330, (jV)this)[jV.OlOIqkllk("bubv", 1299054676, -33556232, -33556236, -33556235, -1211811569, 1158080670, -340056879)[0]]);
    }

    private static void l() {
        s = new short[]{0, 1, 2, 3, 4};
        R = new short[]{5, 6, 0, 1, 2, 3};
        i = new short[]{4, 5, 6, 7, 0, 1, 0, 1};
        P = new short[]{2, 0, 1, 2, 3};
        m = new short[]{4, 5, 6, 0, 1, 2};
    }

    private static void d() {
        M = new byte[]{7, 2, 3, 4, 5};
        Z = new byte[]{6, 2, 8, 3};
    }

    public lv m() {
        jV.OlOIqkllk("gbrdyqo", 1299054672, -33556232, -33556231, -33556229, 1534284043, 1364313228, -330082372, (jV)this);
        return (lv)((Object)jV.OlOIqkllk("vnxvtay", 1299054674, -33556232, -33556234, -33556233, 1086139329, 601094143, -436810495, (jV)this)[jV.OlOIqkllk("cpbxrr", 1299054676, -33556232, -33556236, -33556235, -1279963850, 1267165579, -1590508746)[4]]);
    }

    private static void k() {
        z = new String[]{"login", "fps", "ping"};
        T = new String[]{"time", "tps", "bps", "coordinates", "details", "left", "right", "position"};
    }

    public lv t() {
        jV.OlOIqkllk("xihf", 1299054672, -33556232, -33556231, -33556229, 1534284043, 1364313228, -330082372, (jV)this);
        return (lv)((Object)jV.OlOIqkllk("uegdoww", 1299054674, -33556232, -33556238, -33556233, -878015325, 1733923823, -978954096, (jV)this)[jV.OlOIqkllk("evym", 1299054676, -33556232, -33556237, -33556235, 1148264729, -1626179104, -1807685997)[1]]);
    }

    public lv v() {
        jV.OlOIqkllk("ijhxp", 1299054672, -33556232, -33556231, -33556229, 1534284043, 1364313228, -330082372, (jV)this);
        return (lv)((Object)jV.OlOIqkllk("czttx", 1299054674, -33556232, -33556238, -33556233, -687416422, 1959345897, 1279409225, (jV)this)[jV.OlOIqkllk("czttx", 1299054676, -33556232, -33556237, -33556235, 392275788, -215332364, -132045532)[4]]);
    }

    public lv j() {
        jV.OlOIqkllk("tpnid", 1299054672, -33556232, -33556231, -33556229, 1534284043, 1364313228, -330082372, (jV)this);
        return (lv)((Object)jV.OlOIqkllk("cwubk", 1299054674, -33556232, -33556238, -33556233, -1524990445, -1647553721, 1059776118, (jV)this)[jV.OlOIqkllk("cpbxrr", 1299054676, -33556232, -33556236, -33556235, -1407564978, -1728015864, 133096788)[2]]);
    }

    private static /* synthetic */ String U(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{10, -122, -106, -57, -69, -93, -110, -118, -86, -7, 104, 107, -89, 102, 19, -56};
        int n = 0;
        int n2 = 84;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 209;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String z(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-124, -106, 69, 35, -43, 31, 55, -109, 67, 21, 94, 71, -33, 122, 47, 47};
        int n = 0;
        int n2 = 126;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 13;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int u(int n) {
        return Integer.rotateRight(Integer.rotateLeft(Integer.rotateLeft(Integer.rotateRight(n, 20), 18) ^ 0xCC44798E, 1), 7);
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{88, 91, -19, 29, 54, -31, -113, 53, -31, -23, 29, 2, 95, -79, 43, -85};
        int n = 0;
        int n2 = 31;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 31;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int y(int n) {
        return Integer.rotateRight(Integer.rotateRight(Integer.rotateRight(Integer.rotateLeft(Integer.rotateLeft(Integer.rotateRight(n, 8), 12), 6), 8) ^ 0xEED8D0F8, 9), 3);
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-53, -10, -82, 115, -44, -106, 21, -83, -92, 116, -99, -21, -111, -17, 13, -59};
        int n = 0;
        int n2 = 24;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 119;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String E(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{53, -60, 29, 70, -66, 38, 35, -26, 9, 88, 15, -72, 82, -31, 45, 114};
        int n = 0;
        int n2 = 238;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 197;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int N(int n) {
        return -Integer.rotateRight((-n ^ 0xB7173616) + 1 ^ 0x6B5C7155, 5) ^ 0xB9DC9B33;
    }

    private static /* synthetic */ String W(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-120, 70, -67, 46, 124, -82, -77, -122, -117, 21, 96, 119, -4, 93, 67, -23};
        int n = 0;
        int n2 = 109;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 135;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String R(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{47, -125, -100, 106, -29, -122, -106, 38, -75, 24, -78, 44, -80, 7, -26, 99};
        int n = 0;
        int n2 = 136;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 187;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    public lv G() {
        jV.OlOIqkllk("ldyv", 1299054672, -33556232, -33556231, -33556229, 1534284043, 1364313228, -330082372, (jV)this);
        return (lv)((Object)jV.OlOIqkllk("cpbxrr", 1299054674, -33556232, -33556234, -33556233, -270976683, -1190484477, 687103215, (jV)this)[jV.OlOIqkllk("xihf", 1299054676, -33556232, -33556236, -33556235, -1166480035, 1154038235, 2059245501)[3]]);
    }

    private void Y() {
        CallSite callSite;
        if (jV.OlOIqkllk("evym", 1299054674, -33556232, -33556238, -33556233, 1299054674, 1299054674, 1299054674, (jV)this) == null) {
            jV.OlOIqkllk("hozz", 1299054675, -33556232, -33556238, -33556233, 1299054675, 1299054675, 1299054675, (jV)this, (Object[])new Object[jV.OlOIqkllk("czttx", 1299054676, -33556232, -33556239, -33556241, 1299054676, 1299054676, 1299054676)[2]]);
            callSite = jV.OlOIqkllk("hozz", 1299054674, -33556232, -33556238, -33556233, 1299054674, 1299054674, 1299054674, (jV)this);
        }
        if (jV.OlOIqkllk("gbrdyqo", 1299054674, -33556232, -33556234, -33556233, 1299054674, 1299054674, 1299054674, (jV)this) == null) {
            jV.OlOIqkllk("czttx", 1299054675, -33556232, -33556234, -33556233, 1299054675, 1299054675, 1299054675, (jV)this, (Object[])new Object[jV.OlOIqkllk("uegdoww", 1299054676, -33556232, -33556239, -33556241, 1299054676, 1299054676, 1299054676)[3]]);
            callSite = jV.OlOIqkllk("czttx", 1299054674, -33556232, -33556234, -33556233, 1299054674, 1299054674, 1299054674, (jV)this);
        }
    }

    private static /* synthetic */ void ntfClinit() {
        lIipOj = "\u001bL\u00ce1\u00f0\u0016R)\u00d0\u00a1\u00f8\u00fb\u0097\u00cc\u00b3\u00ceEa\u00aa\u0019\u00d7\u0002gC\u00ee\u00fa\u00e6\u00cb\u00c2\u00e7\u00e2\u00f4\u007fK\u00c13\u00cc>E\u0001\u0092\u00e2\u00e2\u0099\u0085\u00cc\u0092\u00ebuz\u00d70\u00dbCl\u0006\u0086\u000e\u0003xD\u00c3\u000f\u00e4)mC\u00e8\u00c3u\u00bdD\u00c3\u000f\u00e4)mC\u00c9\u00ea\u00a0\u00b3\u00f8\u0098BL\u00ce1\u00f0\u0016R)\u00d0\u00a1\u00f8\u00c5\u0097\u00a9\u0095K.F\u00ff'\u00f3\u0001/\u0000\u00ca\u00b5!D\u00c3\u000f\u00e4)mC\u00c4\u009adD\u00c3\u000f\u00e4)mC\u00d1\u00eaB\u0011D\u00c3\u000f\u00e4)mC\u00d1\u00e5\u00d6B>D\u00c3\u000f\u00e4)mC\u00d1\u00e4\u00a5L\u00ce1\u00f0\u0016R)\u00d0\u00a1\u00f8\u00fb\u0097\u00cc\u00b3a\u00fba\u00aa\u0019\u00d7\u0002gC\u00ee\u00fa\u00e6\u00cb\u00c2\u00e7\u00e2[\u00c1K\u00c13\u00cc>E\u0001\u0092\u00e2\u00e2\u0099\u0085\u00cc\u0092D\u00cbz\u00d70\u00dbCl\b\u0086B)\u00df\u00e71)\u00d3\u00dfD\u00c3\u000f\u00e4)mC\u00d7\u00d8\u00baL\u00ef\u0014\u00c0\r/\u0000\u00dc\u00e0\u00f3\u008d\u00e3\u00e2\u00b3%\u0082t\u00be\u008cS/\u00e1\u0016 \u0007)\u00c9>\u00f2*z>\u00f8\u00e3\u00bb\u00d6\u00c8\u00bbU\u00e4\tBZ\u00adL\u00ef\u0014\u00c0\r/\u0000\u00dc\u00e0\u00f3\u008d\u00ff\u00f4\u00abg\u0098g\u00be";
        l1nlst = new int[]{7208969, 0x10B0001, 16515086, 4587530, 5373953, 14024707, 14221322, 3735553, 4521985, 14876691, 0x500001, 16121858, 16384001, 0x10C0001, 3866634, 16252929, 13762563, 9240578, 0x10A0001, 17760275, 16318465, 17629186, 13959169, 3801089, 8519681, 0x510001, 5439489, 0x770001, 8585226, 16449537, 57, 9371658, 5505050, 0x990039, 7864330};
        jV.l();
        jV.d();
        jV.Q();
        jV.k();
    }

    private static /* synthetic */ CallSite OlOIqkllk(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = l1nlst[n2 ^ 0xFDFFF8FE];
        int n9 = n8 >>> 16;
        String string2 = jV.lltOIIlj(lIipOj.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0xFDFFF8FE);
        n8 = l1nlst[n3 ^ 0xFDFFF8FE];
        int n10 = n8 >>> 16;
        String string3 = jV.lltOIIlj(lIipOj.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0xFDFFF8FE);
        n8 = l1nlst[n4 ^ 0xFDFFF8FE];
        int n11 = n8 >>> 16;
        String string4 = jV.lltOIIlj(lIipOj.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0xFDFFF8FE);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x4D6E00E6) + -178;
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

    private static /* synthetic */ void l1sIOrm(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[35];
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
        lIipOj = stringBuilder.toString();
        l1nlst = nArray;
    }

    private static /* synthetic */ String lltOIIlj(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-22, 28, -39, 11, 92, -97, 39, -13, -128, 61, 126, 103, -80, -67, -59, -77};
        byte[] byArray3 = new byte[]{-120, 18, -118, 79, 108, 102, 84, 14, -79, -128, -106, -65, -125, -82, 43, 88};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite oomrp(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) throws Exception {
        int n9 = l1nlst[n2 ^ 0xFDFFF8FE];
        int n10 = n9 >>> 16;
        String string2 = jV.lltOIIlj(lIipOj.substring(n10, n10 + (n9 & 0xFFFF)), n2 ^ 0xFDFFF8FE);
        n9 = l1nlst[n3 ^ 0xFDFFF8FE];
        int n11 = n9 >>> 16;
        String string3 = jV.lltOIIlj(lIipOj.substring(n11, n11 + (n9 & 0xFFFF)), n3 ^ 0xFDFFF8FE);
        n9 = l1nlst[n4 ^ 0xFDFFF8FE];
        int n12 = n9 >>> 16;
        String string4 = jV.lltOIIlj(lIipOj.substring(n12, n12 + (n9 & 0xFFFF)), n4 ^ 0xFDFFF8FE);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x4D6E00E6) + -178;
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

    private static /* synthetic */ CallSite lOtn0nl0O(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = l1nlst[n2 ^ 0xFDFFF8FE];
        int n8 = n7 >>> 16;
        String string2 = jV.lltOIIlj(lIipOj.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0xFDFFF8FE);
        n7 = l1nlst[n3 ^ 0xFDFFF8FE];
        int n9 = n7 >>> 16;
        String string3 = jV.lltOIIlj(lIipOj.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0xFDFFF8FE);
        n7 = l1nlst[n4 ^ 0xFDFFF8FE];
        int n10 = n7 >>> 16;
        String string4 = jV.lltOIIlj(lIipOj.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0xFDFFF8FE);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x4D6E00E6) + -178;
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
