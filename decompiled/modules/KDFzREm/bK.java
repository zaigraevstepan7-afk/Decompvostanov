/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NNuU
 */
package KDFzREm;

import KDFzREm.MR;
import KDFzREm.NNuU;
import KDFzREm.Rs;
import KDFzREm.Ry;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.ZB;
import KDFzREm.ZM;
import KDFzREm.bH;
import KDFzREm.bV;
import KDFzREm.bX;
import KDFzREm.bc;
import KDFzREm.be;
import KDFzREm.lG;
import KDFzREm.lQ;
import KDFzREm.lY;
import KDFzREm.lb;
import KDFzREm.lj;
import KDFzREm.ll;
import KDFzREm.lv;
import KDFzREm.uF;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.List;

@UZ(L="Particles", y=UR.VISUAL, N=Uz.WORLD)
public class bK
extends UM {
    private static float[] R;
    private static short[] M;
    private static short[] B;
    private static float[] Z;
    public static Object[] L;
    private static short[] z;
    private static byte[] U;
    public Object[] u;
    private static String[] W;
    private static short[] m;
    private static boolean[] P;
    private static byte[] s;
    private static short[] T;
    private static short[] b;
    private static short[] j;
    private static short[] v;
    private static short[] n;
    private static int[] t;
    private static float[] G;
    public Object[] i;
    private static float[] l;
    private static boolean[] d;
    private static String[] w;
    private static /* synthetic */ String lOOjmps;
    private static /* synthetic */ int[] lOsk0q;

    private static /* synthetic */ int L(int n) {
        return Integer.rotateLeft(Integer.rotateLeft(Integer.rotateLeft(Integer.rotateRight(Integer.rotateLeft(n, 28), 26) ^ 0xAD2B398F, 19), 23), 3);
    }

    private static /* synthetic */ int M(int n) {
        return Integer.rotateLeft(-Integer.rotateRight((Integer.rotateRight(n, 31) ^ 0xD45DC40A) + 1, 10), 19);
    }

    private static /* synthetic */ String M(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-92, 22, -115, -109, 16, 65, 110, -114, 112, 111, 79, 72, -40, -7, -90, 28};
        int n = 0;
        int n2 = 114;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 211;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void P() {
        Z = new float[]{10.0f, 0.0f, 100.0f, 1.0f, 100.0f, 0.0f, 100.0f};
        l = new float[]{1.0f, 0.0f, 1.0f, 0.5f, 0.85f};
        G = new float[]{0.01f, 1.0f, 1.0f, 0.1f};
        R = new float[]{0.44f, 0.6f, 2.5f, 0.6f, 2.5f, 0.1f, 0.44f};
    }

    private static void T() {
        m = new short[]{0, 1, 2, 3};
        v = new short[]{0, 1};
        j = new short[]{2, 3, 4};
        T = new short[]{5, 0, 1, 2, 1, 2, 3};
        b = new short[]{4, 5};
        M = new short[]{6, 6, 4, 6};
        z = new short[]{1, 4, 4};
        n = new short[]{5, 6, 6, 0, 0, 5, 5, 4};
        B = new short[]{2, 1};
    }

    public bK() {
        bK.Olpqq("wfunclk", 644778472, 1520272445, 1520272442, 1520272443, 644778472, 644778472, (bK)this);
        bX bX2 = new bX(this, (String)((Object)bK.Olpqq("minqbdgs", 644778476, 1520272445, 1520272393, 1520272390, 644778476, 644778476)[0]), (boolean)bK.Olpqq("kgszgob", 644778476, 1520272445, 1520272391, 1520272388, 644778476, 644778476)[0]);
        bK.Olpqq("nqnfsbf", 644778474, 1520272445, 1520272413, 1520272441, 644778474, 644778474, (bK)this)[bK.Olpqq("mjlvqm", 644778476, 1520272445, 1520272389, 1520272439, 644778476, 644778476)[0]] = bX2;
        bV bV2 = new bV(this, (String)((Object)bK.Olpqq("wfunclk", 644778476, 1520272445, 1520272393, 1520272390, 644778476, 644778476)[1]), (boolean)bK.Olpqq("uykg", 644778476, 1520272445, 1520272391, 1520272388, 644778476, 644778476)[1]);
        bK.Olpqq("exdexrdh", 644778474, 1520272445, 1520272413, 1520272441, 644778474, 644778474, (bK)this)[bK.Olpqq("yngt", 644778476, 1520272445, 1520272389, 1520272439, 644778476, 644778476)[1]] = bV2;
        bc bc2 = new bc(this, (String)((Object)bK.Olpqq("pbpi", 644778476, 1520272445, 1520272393, 1520272390, 644778476, 644778476)[2]), (boolean)bK.Olpqq("nqnfsbf", 644778476, 1520272445, 1520272391, 1520272388, 644778476, 644778476)[2]);
        bK.Olpqq("zppjzv", 644778474, 1520272445, 1520272413, 1520272441, 644778474, 644778474, (bK)this)[bK.Olpqq("mjlvqm", 644778476, 1520272445, 1520272389, 1520272439, 644778476, 644778476)[2]] = bc2;
        be be2 = new be(this, (String)((Object)bK.Olpqq("mjlvqm", 644778476, 1520272445, 1520272393, 1520272390, 644778476, 644778476)[3]), (boolean)bK.Olpqq("oawfacya", 644778476, 1520272445, 1520272391, 1520272388, 644778476, 644778476)[3]);
        bK.Olpqq("yngt", 644778474, 1520272445, 1520272413, 1520272441, 644778474, 644778474, (bK)this)[bK.Olpqq("zppjzv", 644778476, 1520272445, 1520272389, 1520272439, 644778476, 644778476)[3]] = be2;
        lv[] lvArray = new bH[bK.Olpqq("jhbxdf", 644778476, 1520272445, 1520272400, 1520272392, 644778476, 644778476)[0]];
        lvArray[bK.Olpqq("wfunclk", 644778476, 1520272445, 1520272391, 1520272388, 644778476, 644778476)[4]] = (bH)((Object)bK.Olpqq("cemykhu", 644778474, 1520272445, 1520272413, 1520272441, 644778474, 644778474, (bK)this)[bK.Olpqq("minqbdgs", 644778476, 1520272445, 1520272386, 1520272439, 644778476, 644778476)[0]]);
        lvArray[bK.Olpqq("cemykhu", 644778476, 1520272445, 1520272391, 1520272388, 644778476, 644778476)[5]] = (bH)((Object)bK.Olpqq("exdexrdh", 644778474, 1520272445, 1520272413, 1520272441, 644778474, 644778474, (bK)this)[bK.Olpqq("uqmhq", 644778476, 1520272445, 1520272386, 1520272439, 644778476, 644778476)[1]]);
        lvArray[bK.Olpqq("yngt", 644778476, 1520272445, 1520272400, 1520272392, 644778476, 644778476)[1]] = (bH)((Object)bK.Olpqq("nqnfsbf", 644778474, 1520272445, 1520272413, 1520272441, 644778474, 644778474, (bK)this)[bK.Olpqq("mjlvqm", 644778476, 1520272445, 1520272442, 1520272439, 644778476, 644778476)[0]]);
        lvArray[bK.Olpqq("minqbdgs", 644778476, 1520272445, 1520272400, 1520272392, 644778476, 644778476)[2]] = (bH)((Object)bK.Olpqq("pbpi", 644778474, 1520272445, 1520272413, 1520272441, 644778474, 644778474, (bK)this)[bK.Olpqq("uykg", 644778476, 1520272445, 1520272442, 1520272439, 644778476, 644778476)[1]]);
        CallSite callSite = bK.Olpqq("nqnfsbf", 644778470, 1520272387, 1520272447, 1520272384, 644778470, 644778470, (lY)this, (String)((Object)bK.Olpqq("uqmhq", 644778476, 1520272445, 1520272393, 1520272390, 644778476, 644778476)[4]), (lv[])lvArray);
        bK.Olpqq("mjlvqm", 644778474, 1520272445, 1520272413, 1520272441, 644778474, 644778474, (bK)this)[bK.Olpqq("kgszgob", 644778476, 1520272445, 1520272442, 1520272439, 644778476, 644778476)[2]] = callSite;
        lQ lQ2 = (lQ)((Object)bK.Olpqq("jhbxdf", 644778472, 1520272401, 1520272430, 1520272511, 644778472, 644778472, (lQ)((Object)bK.Olpqq("yngt", 644778470, 1520272387, 1520272430, 1520272510, 644778470, 644778470, (lY)this, (String)((Object)bK.Olpqq("cemykhu", 644778476, 1520272445, 1520272393, 1520272390, 644778476, 644778476)[5]), (float)bK.Olpqq("exdexrdh", 644778476, 1520272445, 1520272385, 1520272424, 644778476, 644778476)[0], (float)bK.Olpqq("zppjzv", 644778476, 1520272445, 1520272385, 1520272424, 644778476, 644778476)[1], (float)bK.Olpqq("cemykhu", 644778476, 1520272445, 1520272385, 1520272424, 644778476, 644778476)[2], (float)bK.Olpqq("uykg", 644778476, 1520272445, 1520272385, 1520272424, 644778476, 644778476)[3])), (lw2, f) -> bK.Olpqq("wfunclk", 644778472, 1520272445, 1520272400, 1520272443, 1829682828, 98401915, (bK)this)));
        bK.Olpqq("mjlvqm", 644778474, 1520272445, 1520272413, 1520272441, 644778474, 644778474, (bK)this)[bK.Olpqq("uqmhq", 644778476, 1520272445, 1520272508, 1520272439, 644778476, 644778476)[0]] = lQ2;
        lQ lQ3 = (lQ)((Object)bK.Olpqq("exdexrdh", 644778472, 1520272401, 1520272430, 1520272511, 644778472, 644778472, (lQ)((Object)bK.Olpqq("jhbxdf", 644778470, 1520272387, 1520272430, 1520272510, 644778470, 644778470, (lY)this, (String)((Object)bK.Olpqq("wfunclk", 644778476, 1520272445, 1520272393, 1520272390, 644778476, 644778476)[6]), (float)bK.Olpqq("exdexrdh", 644778476, 1520272445, 1520272385, 1520272424, 644778476, 644778476)[4], (float)bK.Olpqq("zppjzv", 644778476, 1520272445, 1520272385, 1520272424, 644778476, 644778476)[5], (float)bK.Olpqq("yngt", 644778476, 1520272445, 1520272385, 1520272424, 644778476, 644778476)[6], (float)bK.Olpqq("wfunclk", 644778476, 1520272445, 1520272509, 1520272424, 644778476, 644778476)[0])), (lw2, f) -> bK.Olpqq("pbpi", 644778472, 1520272445, 1520272400, 1520272443, 1829682828, 98401915, (bK)this)));
        bK.Olpqq("zppjzv", 644778474, 1520272445, 1520272440, 1520272441, 644778474, 644778474, (bK)this)[bK.Olpqq("zppjzv", 644778476, 1520272445, 1520272508, 1520272439, 644778476, 644778476)[1]] = lQ3;
        lv lv2 = new lv((String)((Object)bK.Olpqq("mjlvqm", 644778476, 1520272445, 1520272393, 1520272390, 644778476, 644778476)[7]), (boolean)bK.Olpqq("jhbxdf", 644778476, 1520272445, 1520272506, 1520272388, 644778476, 644778476)[0]);
        bK.Olpqq("zppjzv", 644778474, 1520272445, 1520272440, 1520272441, 644778474, 644778474, (bK)this)[bK.Olpqq("kgszgob", 644778476, 1520272445, 1520272508, 1520272439, 644778476, 644778476)[2]] = lv2;
        lv lv3 = new lv((String)((Object)bK.Olpqq("mjlvqm", 644778476, 1520272445, 1520272507, 1520272390, 644778476, 644778476)[0]), (boolean)bK.Olpqq("mjlvqm", 644778476, 1520272445, 1520272506, 1520272388, 644778476, 644778476)[1]);
        bK.Olpqq("kgszgob", 644778474, 1520272445, 1520272440, 1520272441, 644778474, 644778474, (bK)this)[bK.Olpqq("jhbxdf", 644778476, 1520272445, 1520272508, 1520272439, 644778476, 644778476)[3]] = lv3;
        lv[] lvArray2 = new lv[bK.Olpqq("jhbxdf", 644778476, 1520272445, 1520272400, 1520272392, 644778476, 644778476)[3]];
        lvArray2[bK.Olpqq("uykg", 644778476, 1520272445, 1520272506, 1520272388, 644778476, 644778476)[2]] = (lv)((Object)bK.Olpqq("wfunclk", 644778474, 1520272445, 1520272440, 1520272441, 644778474, 644778474, (bK)this)[bK.Olpqq("mjlvqm", 644778476, 1520272445, 1520272508, 1520272439, 644778476, 644778476)[4]]);
        lvArray2[bK.Olpqq("jhbxdf", 644778476, 1520272445, 1520272506, 1520272388, 644778476, 644778476)[3]] = (lv)((Object)bK.Olpqq("oawfacya", 644778474, 1520272445, 1520272440, 1520272441, 644778474, 644778474, (bK)this)[bK.Olpqq("yngt", 644778476, 1520272445, 1520272508, 1520272439, 644778476, 644778476)[5]]);
        CallSite callSite2 = bK.Olpqq("exdexrdh", 644778470, 1520272387, 1520272430, 1520272504, 644778470, 644778470, (lY)this, (String)((Object)bK.Olpqq("yngt", 644778476, 1520272445, 1520272507, 1520272390, 644778476, 644778476)[1]), (lv[])lvArray2);
        bK.Olpqq("exdexrdh", 644778474, 1520272445, 1520272440, 1520272441, 644778474, 644778474, (bK)this)[bK.Olpqq("jhbxdf", 644778476, 1520272445, 1520272508, 1520272439, 644778476, 644778476)[6]] = callSite2;
        ll ll2 = (ll)((Object)bK.Olpqq("wfunclk", 644778472, 1520272435, 1520272430, 1520272502, 644778472, 644778472, (ll)((Object)bK.Olpqq("minqbdgs", 644778470, 1520272387, 1520272430, 1520272505, 644778470, 644778470, (lY)this, (String)((Object)bK.Olpqq("pbpi", 644778476, 1520272445, 1520272507, 1520272390, 644778476, 644778476)[2]), (lG)new lG((float)bK.Olpqq("oawfacya", 644778476, 1520272445, 1520272509, 1520272424, 644778476, 644778476)[1], (float)bK.Olpqq("kgszgob", 644778476, 1520272445, 1520272509, 1520272424, 644778476, 644778476)[2]), (lG)new lG((float)bK.Olpqq("minqbdgs", 644778476, 1520272445, 1520272509, 1520272424, 644778476, 644778476)[3], (float)bK.Olpqq("minqbdgs", 644778476, 1520272445, 1520272509, 1520272424, 644778476, 644778476)[4]), (float)bK.Olpqq("mjlvqm", 644778476, 1520272445, 1520272427, 1520272424, 644778476, 644778476)[0])), lw2 -> {
            bK.Olpqq("uqmhq", 644778472, 1520272445, 1520272442, 1520272443, 1829682828, 98401915, (bK)this);
            return (boolean)bK.Olpqq("nqnfsbf", 644778472, 1520272436, 1520272437, 1520272434, 1829682828, 98401915, (lv)((lv)((Object)bK.Olpqq("mjlvqm", 644778474, 1520272445, 1520272440, 1520272441, -492056823, -1183217844, (bK)this)[bK.Olpqq("mjlvqm", 644778476, 1520272445, 1520272397, 1520272439, 1853963917, 720790138)[1]])));
        }));
        bK.Olpqq("uqmhq", 644778474, 1520272445, 1520272440, 1520272441, 644778474, 644778474, (bK)this)[bK.Olpqq("uqmhq", 644778476, 1520272445, 1520272417, 1520272439, 644778476, 644778476)[0]] = ll2;
        lb lb2 = (lb)((Object)bK.Olpqq("kgszgob", 644778472, 1520272421, 1520272430, 1520272502, 644778472, 644778472, (lb)((Object)bK.Olpqq("kgszgob", 644778470, 1520272387, 1520272430, 1520272500, 644778470, 644778470, (lY)this, (String)((Object)bK.Olpqq("yngt", 644778476, 1520272445, 1520272507, 1520272390, 644778476, 644778476)[3]), (int)bK.Olpqq("kgszgob", 644778476, 1520272445, 1520272414, 1520272503, 644778476, 644778476)[0])), lw2 -> {
            bK.Olpqq("minqbdgs", 644778472, 1520272445, 1520272442, 1520272443, 1829682828, 98401915, (bK)this);
            return (boolean)bK.Olpqq("uykg", 644778472, 1520272436, 1520272437, 1520272434, 1829682828, 98401915, (lv)((lv)((Object)bK.Olpqq("kgszgob", 644778474, 1520272445, 1520272440, 1520272441, 188492665, -1854517333, (bK)this)[bK.Olpqq("oawfacya", 644778476, 1520272445, 1520272397, 1520272439, 2004841226, -2146587742)[0]])));
        }));
        bK.Olpqq("wfunclk", 644778474, 1520272445, 1520272440, 1520272441, 644778474, 644778474, (bK)this)[bK.Olpqq("exdexrdh", 644778476, 1520272445, 1520272417, 1520272439, 644778476, 644778476)[1]] = lb2;
        ZB zB = new ZB((int)bK.Olpqq("zppjzv", 644778476, 1520272445, 1520272414, 1520272503, 644778476, 644778476)[1], (float)bK.Olpqq("pbpi", 644778472, 1520272445, 1520272417, 1520272431, 644778472, 644778472, (bK)this), (float)bK.Olpqq("nqnfsbf", 644778472, 1520272445, 1520272414, 1520272431, 644778472, 644778472, (bK)this));
        bK.Olpqq("jhbxdf", 644778474, 1520272445, 1520272440, 1520272441, 644778474, 644778474, (bK)this)[bK.Olpqq("wfunclk", 644778476, 1520272445, 1520272422, 1520272439, 644778476, 644778476)[0]] = zB;
    }

    static {
        bK.ntfClinit();
    }

    private static /* synthetic */ String B(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-1, -63, -2, 66, 17, -69, -47, -106, -53, -22, -46, 111, -73, 19, 64, 125};
        int n = 0;
        int n2 = 71;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 221;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String Z(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-77, 33, 124, -104, 12, 5, -70, -35, -37, 88, 16, -58, 122, 104, -92, -5};
        int n = 0;
        int n2 = 219;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 163;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int i(int n) {
        return Integer.rotateLeft(Integer.rotateRight(Integer.rotateLeft(Integer.rotateRight(Integer.rotateLeft(Integer.rotateLeft(n ^ 0x3EDD358E, 7), 7), 4), 14), 3), 26);
    }

    private static /* synthetic */ String i(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-15, 33, -69, -51, -66, 12, 80, 18, -93, 65, -125, -73, 123, -113, 0, 79};
        int n = 0;
        int n2 = 3;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 121;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private float b() {
        bK.Olpqq("pbpi", 644778472, 1520272445, 1520272442, 1520272443, 644778472, 644778472, (bK)this);
        return (float)bK.Olpqq("zppjzv", 644778470, 1520272425, 1520272397, 1520272394, 644778470, 644778470, (float)(bK.Olpqq("pbpi", 644778472, 1520272398, 1520272399, 1520272431, 644778472, 644778472, (Float)((Float)((Object)bK.Olpqq("nqnfsbf", 644778472, 1520272401, 1520272440, 1520272432, 644778472, 644778472, (lQ)((lQ)((Object)bK.Olpqq("mjlvqm", 644778474, 1520272445, 1520272440, 1520272441, 644778474, 644778474, (bK)this)[bK.Olpqq("exdexrdh", 644778476, 1520272445, 1520272420, 1520272439, 644778476, 644778476)[3]])))))) / bK.Olpqq("jhbxdf", 644778472, 1520272401, 1520272396, 1520272431, 644778472, 644778472, (lQ)((lQ)((Object)bK.Olpqq("jhbxdf", 644778474, 1520272445, 1520272440, 1520272441, 644778474, 644778474, (bK)this)[bK.Olpqq("jhbxdf", 644778476, 1520272445, 1520272420, 1520272439, 644778476, 644778476)[4]])))), (float)bK.Olpqq("uykg", 644778476, 1520272445, 1520272427, 1520272424, 644778476, 644778476)[3], (float)bK.Olpqq("mjlvqm", 644778476, 1520272445, 1520272396, 1520272424, 644778476, 644778476)[0]);
    }

    private void s() {
        bK.Olpqq("zppjzv", 644778472, 1520272445, 1520272442, 1520272443, 1829682828, 98401915, (bK)this);
        bK.Olpqq("uqmhq", 644778472, 1520272415, 1520272430, 1520272412, 1829682828, 98401915, (ZB)((ZB)((Object)bK.Olpqq("exdexrdh", 644778474, 1520272445, 1520272440, 1520272441, -1164718486, 52099205, (bK)this)[bK.Olpqq("exdexrdh", 644778476, 1520272445, 1520272420, 1520272439, -904469816, 977311636)[2]])), (float)bK.Olpqq("uqmhq", 644778472, 1520272445, 1520272417, 1520272431, 1829682828, 98401915, (bK)this), (float)bK.Olpqq("zppjzv", 644778472, 1520272445, 1520272414, 1520272431, 1829682828, 98401915, (bK)this));
    }

    private static void n() {
        L = new Object[]{Float.valueOf(0.6f), Float.valueOf(2.5f), Float.valueOf(0.1f), Float.valueOf(0.44f)};
    }

    private static void l() {
        t = new int[]{-11104513, 65536};
    }

    private static void d() {
        w = new String[]{"totem-popping", "ambience", "thrown-item", "critical-hit", "emitters", "pinch", "size", "hsv"};
        W = new String[]{"custom", "color-selectable", "color-range", "color"};
    }

    public int m() {
        bK.Olpqq("zppjzv", 644778472, 1520272445, 1520272442, 1520272443, 1829682828, 98401915, (bK)this);
        if (bK.Olpqq("zppjzv", 644778472, 1520272436, 1520272437, 1520272434, 1829682828, 98401915, (lv)((lv)((Object)bK.Olpqq("jhbxdf", 644778474, 1520272445, 1520272440, 1520272441, -1428038958, 1312380595, (bK)this)[bK.Olpqq("zppjzv", 644778476, 1520272445, 1520272438, 1520272439, -1625903879, 1539494889)[0]]))) != false) {
            CallSite callSite = bK.Olpqq("uqmhq", 644778470, 1520272429, 1520272447, 1520272426, 1829682828, 98401915, (float)bK.Olpqq("minqbdgs", 644778472, 1520272433, 1520272430, 1520272431, 1829682828, 98401915, (lG)((lG)((Object)bK.Olpqq("mjlvqm", 644778472, 1520272435, 1520272440, 1520272432, 1829682828, 98401915, (ll)((ll)((Object)bK.Olpqq("zppjzv", 644778474, 1520272445, 1520272440, 1520272441, -2126449904, -1949352404, (bK)this)[bK.Olpqq("zppjzv", 644778476, 1520272445, 1520272438, 1520272439, 1681095240, 336979973)[1]])))))), (float)bK.Olpqq("cemykhu", 644778472, 1520272433, 1520272428, 1520272431, 1829682828, 98401915, (lG)((lG)((Object)bK.Olpqq("uykg", 644778472, 1520272435, 1520272440, 1520272432, 1829682828, 98401915, (ll)((ll)((Object)bK.Olpqq("exdexrdh", 644778474, 1520272445, 1520272440, 1520272441, 611114345, 382897250, (bK)this)[bK.Olpqq("pbpi", 644778476, 1520272445, 1520272438, 1520272439, -1701736461, 1945636909)[2]])))))));
            return (int)bK.Olpqq("uykg", 644778470, 1520272425, 1520272422, 1520272423, 1829682828, 98401915, (float)callSite, (float)bK.Olpqq("cemykhu", 644778476, 1520272445, 1520272427, 1520272424, 678510863, -506173267)[1], (float)bK.Olpqq("kgszgob", 644778476, 1520272445, 1520272427, 1520272424, 2036648425, -1458055421)[2]);
        }
        return (int)bK.Olpqq("jhbxdf", 644778472, 1520272418, 1520272419, 1520272416, 1829682828, 98401915, (Integer)((Object)bK.Olpqq("jhbxdf", 644778472, 1520272421, 1520272440, 1520272432, 1829682828, 98401915, (lb)((lb)((Object)bK.Olpqq("yngt", 644778474, 1520272445, 1520272440, 1520272441, 612413491, -1395940111, (bK)this)[bK.Olpqq("mjlvqm", 644778476, 1520272445, 1520272420, 1520272439, 70523978, 65950760)[0]])))));
    }

    private static /* synthetic */ String m(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-24, 29, -72, 2, 119, 97, -9, -12, 22, 7, -120, -4, -113, 60, -84, 53};
        int n = 0;
        int n2 = 193;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 223;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private float t() {
        bK.Olpqq("minqbdgs", 644778472, 1520272445, 1520272442, 1520272443, 644778472, 644778472, (bK)this);
        return (float)bK.Olpqq("wfunclk", 644778470, 1520272425, 1520272397, 1520272394, 644778470, 644778470, (float)(bK.Olpqq("wfunclk", 644778472, 1520272398, 1520272399, 1520272431, 644778472, 644778472, (Float)((Float)((Object)bK.Olpqq("wfunclk", 644778472, 1520272401, 1520272440, 1520272432, 644778472, 644778472, (lQ)((lQ)((Object)bK.Olpqq("exdexrdh", 644778474, 1520272445, 1520272413, 1520272441, 644778474, 644778474, (bK)this)[bK.Olpqq("kgszgob", 644778476, 1520272445, 1520272420, 1520272439, 644778476, 644778476)[5]])))))) / bK.Olpqq("zppjzv", 644778472, 1520272401, 1520272396, 1520272431, 644778472, 644778472, (lQ)((lQ)((Object)bK.Olpqq("zppjzv", 644778474, 1520272445, 1520272413, 1520272441, 644778474, 644778474, (bK)this)[bK.Olpqq("cemykhu", 644778476, 1520272445, 1520272420, 1520272439, 644778476, 644778476)[6]])))), (float)bK.Olpqq("exdexrdh", 644778476, 1520272445, 1520272396, 1520272424, 644778476, 644778476)[1], (float)bK.Olpqq("zppjzv", 644778476, 1520272445, 1520272396, 1520272424, 644778476, 644778476)[2]);
    }

    private static void v() {
        P = new boolean[]{true, true, false, true, false, true};
        d = new boolean[]{true, false, false, true, false, true};
    }

    private void j() {
        CallSite callSite;
        if (bK.Olpqq("wfunclk", 644778474, 1520272445, 1520272413, 1520272441, 644778474, 644778474, (bK)this) == null) {
            bK.Olpqq("uqmhq", 644778475, 1520272445, 1520272413, 1520272441, 644778475, 644778475, (bK)this, (Object[])new Object[bK.Olpqq("minqbdgs", 644778476, 1520272445, 1520272400, 1520272392, 644778476, 644778476)[4]]);
            callSite = bK.Olpqq("exdexrdh", 644778474, 1520272445, 1520272413, 1520272441, 644778474, 644778474, (bK)this);
        }
        if (bK.Olpqq("wfunclk", 644778474, 1520272445, 1520272440, 1520272441, 644778474, 644778474, (bK)this) == null) {
            bK.Olpqq("uqmhq", 644778475, 1520272445, 1520272440, 1520272441, 644778475, 644778475, (bK)this, (Object[])new Object[bK.Olpqq("uykg", 644778476, 1520272445, 1520272400, 1520272392, 644778476, 644778476)[5]]);
            callSite = bK.Olpqq("cemykhu", 644778474, 1520272445, 1520272440, 1520272441, 644778474, 644778474, (bK)this);
        }
    }

    private static /* synthetic */ String U(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{77, -34, 71, 71, 5, 59, 104, -5, -13, -124, 67, -6, -116, -9, -118, 108};
        int n = 0;
        int n2 = 157;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 41;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String z(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{70, 39, 82, -123, -77, -53, -118, 63, -102, 29, 105, -46, -109, 76, 88, 98};
        int n = 0;
        int n2 = 57;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 209;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int u(int n) {
        return Integer.rotateRight(Integer.rotateRight(Integer.rotateLeft(Integer.rotateRight((Integer.rotateRight(Integer.rotateRight(n, 5), 23) ^ 0x76DD2F32) + 1, 10), 25), 28), 26);
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-71, -44, 88, -4, 15, 6, 114, 46, -85, -106, 115, 6, -31, -38, 47, 86};
        int n = 0;
        int n2 = 227;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 87;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int y(int n) {
        return -Integer.rotateRight(Integer.rotateRight(Integer.rotateRight(Integer.rotateLeft(-n ^ 0xBE2D2B7E, 13), 22), 19), 30);
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{119, 71, -45, -70, 96, 90, 55, 80, 67, -54, -113, 70, -55, 125, -78, -39};
        int n = 0;
        int n2 = 168;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 147;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String E(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{108, -77, 55, -111, -3, 62, 29, -128, 101, -46, -100, -12, -26, -72, 62, 27};
        int n = 0;
        int n2 = 33;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 121;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    @uF
    public void N(MR mR) {
        bK.Olpqq("jhbxdf", 644778472, 1520272445, 1520272442, 1520272443, 1829682828, 98401915, (bK)this);
        bK.Olpqq("nqnfsbf", 644778472, 1520272415, 1520272430, 1520272403, 1829682828, 98401915, (ZB)((ZB)((Object)bK.Olpqq("minqbdgs", 644778474, 1520272445, 1520272440, 1520272441, -572322087, -64936433, (bK)this)[bK.Olpqq("kgszgob", 644778476, 1520272445, 1520272422, 1520272439, 214278991, 950522865)[1]])), (MR)mR);
    }

    @uF
    public void N(Rs rs) {
        bK.Olpqq("uykg", 644778472, 1520272406, 1520272405, 1520272402, 1829682828, 98401915, (NNuU)bK.Olpqq("yngt", 644778470, 1520272406, 1520272407, 1520272404, 1829682828, 98401915), () -> {
            bK.Olpqq("mjlvqm", 644778472, 1520272445, 1520272442, 1520272443, 1829682828, 98401915, (bK)this);
            bK.Olpqq("yngt", 644778471, 1520272411, 1520272408, 1520272409, 1829682828, 98401915, (List)((List)((Object)bK.Olpqq("kgszgob", 644778472, 1520272410, 1520272440, 1520272432, 1829682828, 98401915, (lj)((lj)((Object)bK.Olpqq("uykg", 644778474, 1520272445, 1520272413, 1520272441, 333443068, 867617055, (bK)this)[bK.Olpqq("uqmhq", 644778476, 1520272445, 1520272420, 1520272439, 1370000156, -976906987)[7]]))))), bH2 -> bK.Olpqq("jhbxdf", 644778472, 1520272446, 1520272447, 1520272444, 1829682828, 98401915, (bH)bH2, (Object)rs));
        });
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateLeft(Integer.rotateLeft(Integer.rotateLeft(Integer.rotateLeft(n, 19), 24), 5) ^ 0xC5A7DE3B, 29) ^ 0xA259AD26;
    }

    @uF
    public void N(Ry ry) {
        bK.Olpqq("uykg", 644778472, 1520272445, 1520272442, 1520272443, 1829682828, 98401915, (bK)this);
        bK.Olpqq("wfunclk", 644778471, 1520272411, 1520272408, 1520272409, 1829682828, 98401915, (List)((List)((Object)bK.Olpqq("zppjzv", 644778472, 1520272410, 1520272440, 1520272432, 1829682828, 98401915, (lj)((lj)((Object)bK.Olpqq("uqmhq", 644778474, 1520272445, 1520272413, 1520272441, -108794533, 934503067, (bK)this)[bK.Olpqq("yngt", 644778476, 1520272445, 1520272422, 1520272439, 1382574512, -1069334279)[2]]))))), bH2 -> bK.Olpqq("kgszgob", 644778472, 1520272446, 1520272447, 1520272444, 1829682828, 98401915, (bH)bH2, (Object)ry));
        bK.Olpqq("mjlvqm", 644778472, 1520272415, 1520272430, 1520272443, 1829682828, 98401915, (ZB)((ZB)((Object)bK.Olpqq("uykg", 644778474, 1520272445, 1520272440, 1520272441, 59765338, -1952045395, (bK)this)[bK.Olpqq("pbpi", 644778476, 1520272445, 1520272422, 1520272439, 499195136, 1425099356)[3]])));
    }

    public void N(ZM zM) {
        bK.Olpqq("uqmhq", 644778472, 1520272445, 1520272442, 1520272443, 1829682828, 98401915, (bK)this);
        bK.Olpqq("oawfacya", 644778472, 1520272415, 1520272430, 1520272395, 1829682828, 98401915, (ZB)((ZB)((Object)bK.Olpqq("yngt", 644778474, 1520272445, 1520272440, 1520272441, 366988641, -1237154047, (bK)this)[bK.Olpqq("uykg", 644778476, 1520272445, 1520272420, 1520272439, -1218461683, -1279970877)[1]])), (ZM)zM);
    }

    private static /* synthetic */ String W(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-36, 113, -58, 16, -104, 98, -50, -85, 36, -8, 78, -128, 126, -114, -12, -124};
        int n = 0;
        int n2 = 36;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 163;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String R(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-65, 44, -57, -56, -105, -124, -71, 10, -122, 48, 92, -127, 97, -126, -3, -41};
        int n = 0;
        int n2 = 147;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 247;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int R(int n) {
        return (Integer.rotateRight(Integer.rotateRight(Integer.rotateLeft((n ^ 0x14BD52E7) + 1, 2), 11), 15) ^ 0xB4436D33) + 1;
    }

    private static void G() {
        s = new byte[]{4, 2, 3, 2, 6, 7, 4};
        U = new byte[]{2, 3};
    }

    private static /* synthetic */ void ntfClinit() {
        lOOjmps = "r\u00a2\u00b9\u00be\u00ea\u00d6\u008eKy\u009a9\u00e5qAt\u00b1\u00c7\u00a2\u00b3\t\u00cd\u00b3\u00dc\u00e8\u0085\u00cd\u00b3\u00b3\u0087\u00d9\u0017\u0011\u00cf\u00b3\u008f\u00fc\u00d5\u00996P\u0081\u00dc\u00c7\u00be\u00b1\u00e8\u00ea\u00a6\\Q\u00d8L\u00e6\u0004\u001dw\u0089\u00e7\u009a\u0094\u00da\u00c6\u0095uI\u0092j\u00cf\u00b3\u008f\u00fc\u00d5\u00996P\u009d\u001a\u00d4\u00cf\u00b3\u008f\u00fc\u00d5\u00996P\u00b0\u00f6\u00d8{\u00c7\u009f\u0094\u00d8\u00f1\u00dbu]\u0099q\u0084l@SiN\u00ec\u00ce\u0088\u00cd\u00b3\u00dc\u00f8W\u00c7\u009f\u0094\u00d8\u00f1\u00dbu]\u0099q\u0084pVK\u0015o\u00ff\u00ceL\u00a2\u00bc\u00a3^\u00cf\u00b3\u008f\u00fc\u00d5\u00996P\u009b{m^\u00cf\u00b3\u008f\u00fc\u00d5\u00996P\u009cL\u00a2\u00b9\u009f\u00cf\u00e6\u00956P\u0096x\u00cc\u0010{CX\u0001\u00e8\u0081\u00cef\u00e4\u0087\u00b0\u00cf\u00f3\u009c\u008d\u00ec\u00fd$\u00c7\u00be\u00b1\u00e8\u00ea\u00a6\\Q\u00d8z\u00f2\u0004xK\u0011z\u00ea\u00da\u0099\u00cf\u00fe\u00936o\u0083d\u00c2QS\u001a<G\u00cf\u00b3\u008f\u00fc\u00d5\u00996P\u00b0-\u00e7tpg\n^\u00ce\u0098\u00da\u00c2\u00d7\u00cf_\u0015\u00bb]\u00efyNs5a\u00a4\u0099\u0099\u0095[\u00cd|\u00e5\u0081\u00a3\u00cf\u00fc\u0081|\u00b2\u00cf\u00b3\u008f\u00fc\u00d5\u00996^\u00bf\n\u00b72\u00d4\u00cf\u00b3\u008f\u00fc\u00d5\u00996P\u00a6E\u0093\u00ea\u0083\u0094\u0081\u00fc\u0095w[\u00d8P\u00c7PUU\u0096\u00f2i\u00f4\u00fd\u00a2\u00af$\u00c7\u009f\u0094\u00d8\u00f1\u00dblH\u009ez\u0084YAO\u0013x\u00e2\u009a\u009b\u0081\u00d3\u009bwO\u0082{\u00ceM\u000f\b&\u0001\u00d1L\u00c7\u00be\u00b1\u00e8\u00ea\u00a6\\Q\u00d8z\u00f2\u0004xKS\u0012\u00ea\u00da\u0099\u00cf\u00fe\u00936o\u0083d\u00c2QS\u001ai(\u00c0\u00b1\u00b3\u00d4\u00c2\u00b1t\u0013\u009b`\u0090\u0016xjv\"\u00f1\u00a7\u00b0\u00c3\u00bf\u0098s\u0007\u00b3\u00fd\u00c7\u009f\u0094\u00d8\u00f1\u00dbu]\u0099q\u0084mAO\u00ae\u00b4\u00e9\u0099\u0090\u0095\u00b9\u00a2\u00a4\u00cf\u00b3\u008f\u00fc\u00d5\u00996f\u00b5\u00bf\u00ea\u0083\u0094\u0081\u00fc\u0095w[\u00d8_\u00c5KQF\u00a5\u00a7Kr\u00c7\u00be\u00b1\u00e8\u00ea\u00a6\\Q\u00d8z\u00f2\u0004xK\u00eb,\u00ea\u00da\u0099\u00cf\u00fe\u00936o\u0083d\u00c2QS\u001a\u00c3s\u00c7\u00be\u00b1\u00e8\u00ea\u00a6\\Q\u00d8z\u00c9\u00044\u009e\u00ea\u0083\u0094\u0081\u00e5\u0080pP\u00d8Z\u00c2L@\u0014\u00cf\u00b3\u008f\u00fc\u00d5\u00996P\u0095\u0088\u00c7\u009f\u0094\u00d8\u00f1\u00dbu]\u0099q\u0084pVK\u000e\u00c3\u00ff\u00ce\u00dc\u00f8G\u00cf\u00b3\u008f\u00fc\u00d5\u00996r\u00b9A\u00ee=\u00c7\u00be\u00b1\u00e8\u00ea\u00a6\\Q\u00d8[\u00f9\u0004\u001dw\u00a3[\u00c9\u00e3\u00fak\u00cf\u00b3\u008f\u00fc\u00d5\u00996r\u00b9c\u00feZ\u00c5\u00d1\u00c7\u00be\u00b1\u00e8\u00ea\u00a6\\Q\u00d8z\u00f2\u0004xK\u00f2\u008f\u00ea\u00da\u0099\u00cf\u00fe\u00936o\u0083d\u00c2QS\u001a\u00d5\u00bf\u00cd\u00b3\u00dc\u00e2\u00db\u00b0_F\u00a5S\u00c6\u0010Xp\u00a8\u00f6\u00c2-\u0013\u00cf\u00b3\u008f\u00fc\u00d5\u00996K\u00ad\u00dc\u00a2\u00a3(\u00c7\u00be\u00b1\u00e8\u00ea\u00a6\\Q\u00d8z\u00f2\u0004xK\u0011v\u00ea\u00da\u0099\u00cf\u00fe\u00936o\u0083d\u00c2QS\u001a+L\u00c0\u00b1\u00b3\u00d4\u00c2\u00b1t\u0013\u009b`\u0090\u0016xj4F\u00f1\u00a7\u00b0\u00c3\u00bf\u0098}\u0007\b\u00c7\u009f\u0094\u00d8\u00f1\u00dblH\u009ez\u0084YAOcT\u00e2\u009a\u009b\u0081\u00c0\u0086|X\u009eu\u00caKQ\u001a)l\u00c0\u00b1\u00b3\u00d4\u00c2\u00b1t\u0013\u009ba\u0090\u0013\u00cf\u00b3\u008f\u00fc\u00d5\u00996^\u00bc:\u00f3\u0090\u0096\u00db\u00e4\u0091\u00fd4\u00c7\u00c7\u00be\u00b1\u00e8\u00ea\u00a6\\Q\u00d8z\u00cc\u0004\u001dm\u00d8\u00ab\u00cd\u008f\u00a7\u00eb\u00fd\u00dbuK\u00cc\t\u00cd\u00b3\u00b3\u0087\u00d6";
        lOsk0q = new int[]{17498122, 20054017, 34471957, 49676298, 29818881, 42860547, 20185089, 7405587, 38731777, 5701634, 2031626, 0x1150001, 20316163, 0x88000A, 10354708, 5046282, 0x1160001, 0x100003, 12189697, 42205194, 1245189, 26476545, 0x1010002, 35848204, 9633793, 1572870, 32833537, 33816586, 28704785, 16973832, 8650755, 0xBB0001, 12124161, 28049418, 7077893, 42139649, 4325386, 32899086, 11665415, 20512800, 37945356, 37814274, 16, 0x3000007, 26542103, 0x22F000F, 0x1E0001, 18350090, 19070991, 3670026, 0x1330001, 4980737, 52625414, 2686991, 37683202, 9568257, 5832723, 50790401, 22609922, 0x1170001, 8847361, 9699338, 22741049, 38797313, 38862896, 50921498, 20250625, 50855937, 0x1220001, 37617665, 43057209, 12320837, 46792748, 42008578, 29884461};
        bK.T();
        bK.G();
        bK.l();
        bK.v();
        bK.P();
        bK.d();
        bK.n();
    }

    private static /* synthetic */ CallSite Olpqq(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = lOsk0q[n2 ^ 0x5A9D843E];
        int n8 = n7 >>> 16;
        String string2 = bK.ooms0q(lOOjmps.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0x5A9D843E);
        n7 = lOsk0q[n3 ^ 0x5A9D843E];
        int n9 = n7 >>> 16;
        String string3 = bK.ooms0q(lOOjmps.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0x5A9D843E);
        n7 = lOsk0q[n4 ^ 0x5A9D843E];
        int n10 = n7 >>> 16;
        String string4 = bK.ooms0q(lOOjmps.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0x5A9D843E);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x266E895E) + -178;
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

    private static /* synthetic */ void lOjnnktqr(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[75];
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
        lOOjmps = stringBuilder.toString();
        lOsk0q = nArray;
    }

    private static /* synthetic */ CallSite l1Oikikik(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) throws Exception {
        int n9 = lOsk0q[n2 ^ 0x5A9D843E];
        int n10 = n9 >>> 16;
        String string2 = bK.ooms0q(lOOjmps.substring(n10, n10 + (n9 & 0xFFFF)), n2 ^ 0x5A9D843E);
        n9 = lOsk0q[n3 ^ 0x5A9D843E];
        int n11 = n9 >>> 16;
        String string3 = bK.ooms0q(lOOjmps.substring(n11, n11 + (n9 & 0xFFFF)), n3 ^ 0x5A9D843E);
        n9 = lOsk0q[n4 ^ 0x5A9D843E];
        int n12 = n9 >>> 16;
        String string4 = bK.ooms0q(lOOjmps.substring(n12, n12 + (n9 & 0xFFFF)), n4 ^ 0x5A9D843E);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x266E895E) + -178;
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

    private static /* synthetic */ String ooms0q(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-96, 79, -128, -8, -6, 84, 117, -84, -60, 13, 89, -1, 0, -75, -127, 63};
        byte[] byArray3 = new byte[]{-74, 103, -76, 16, 35, -45, -36, -114, -23, 3, -105, 112, 111, -35, 66, 114};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }
}
