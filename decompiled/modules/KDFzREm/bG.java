/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NNNYO
 *  KDFzREm.NNde
 *  KDFzREm.NNuU
 *  org.joml.Vector2f
 */
package KDFzREm;

import KDFzREm.MM;
import KDFzREm.NNNYO;
import KDFzREm.NNde;
import KDFzREm.NNuU;
import KDFzREm.Re;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.bd;
import KDFzREm.bl;
import KDFzREm.bt;
import KDFzREm.ig;
import KDFzREm.lY;
import KDFzREm.ld;
import KDFzREm.lv;
import KDFzREm.uA;
import KDFzREm.uF;
import KDFzREm.uK;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import org.joml.Vector2f;

@UZ(L="FreeLook", y=UR.VISUAL, N=Uz.WORLD)
public class bG
extends UM {
    private static String[] u;
    private static short[] i;
    private static boolean[] R;
    private static float[] M;
    private static byte[] B;
    private static short[] Z;
    public Object[] L;
    private static /* synthetic */ String OlOtir0;
    private static /* synthetic */ int[] lOp00itli;

    private static /* synthetic */ int L(int n) {
        return Integer.rotateRight(Integer.rotateRight(Integer.rotateRight(Integer.rotateRight((n ^ 0xAD280AA5) + 1, 19), 13) ^ 0x5CBD1A54, 18), 1) ^ 0xAD3CE4DE;
    }

    private static void P() {
        u = new String[]{"pov", "back", "front", "nothing"};
    }

    private static void T() {
        R = new boolean[]{false, true, true, false, false};
    }

    public bG() {
        bG.I1Opnkpsl("kzdiqb", -143934870, 458404107, 458404106, 458404105, -143934870, (bG)this);
        lv[] lvArray = new uK[bG.I1Opnkpsl("wmfrf", -143934866, 458404107, 458404138, 458404137, -143934866)[0]];
        lvArray[bG.I1Opnkpsl("msvta", -143934866, 458404107, 458404118, 458404143, -143934866)[0]] = new bt((String)((Object)bG.I1Opnkpsl("msvta", -143934866, 458404107, 458404120, 458404136, -143934866)[1]), (boolean)bG.I1Opnkpsl("xjcbham", -143934866, 458404107, 458404118, 458404143, -143934866)[1]);
        lvArray[bG.I1Opnkpsl("xjcbham", -143934866, 458404107, 458404118, 458404143, -143934866)[2]] = new bl((String)((Object)bG.I1Opnkpsl("wmfrf", -143934866, 458404107, 458404120, 458404136, -143934866)[2]), (boolean)bG.I1Opnkpsl("xqfrgdhv", -143934866, 458404107, 458404118, 458404143, -143934866)[3]);
        lvArray[bG.I1Opnkpsl("xqfrgdhv", -143934866, 458404107, 458404138, 458404137, -143934866)[1]] = new bd((String)((Object)bG.I1Opnkpsl("xqfrgdhv", -143934866, 458404107, 458404120, 458404136, -143934866)[3]), (boolean)bG.I1Opnkpsl("vufcaug", -143934866, 458404107, 458404118, 458404143, -143934866)[4]);
        CallSite callSite = bG.I1Opnkpsl("vufcaug", -143934876, 458404142, 458404096, 458404141, -143934876, (lY)this, (String)((Object)bG.I1Opnkpsl("lall", -143934866, 458404107, 458404120, 458404136, -143934866)[0]), (lv[])lvArray);
        bG.I1Opnkpsl("wmfrf", -143934872, 458404107, 458404104, 458404111, -143934872, (bG)this)[bG.I1Opnkpsl("wmfrf", -143934866, 458404107, 458404124, 458404109, -143934866)[0]] = callSite;
        Vector2f vector2f = new Vector2f((float)bG.I1Opnkpsl("xmkvq", -143934866, 458404107, 458404126, 458404125, -143934866)[0], (float)bG.I1Opnkpsl("gbwzyyt", -143934866, 458404107, 458404126, 458404125, -143934866)[1]);
        bG.I1Opnkpsl("szyuoq", -143934872, 458404107, 458404104, 458404111, -143934872, (bG)this)[bG.I1Opnkpsl("xjcbham", -143934866, 458404107, 458404124, 458404109, -143934866)[1]] = vector2f;
    }

    static {
        bG.ntfClinit();
    }

    @Override
    public boolean Z() {
        bG.I1Opnkpsl("gbwzyyt", -143934870, 458404107, 458404106, 458404105, -143934870, (bG)this);
        CallSite callSite = bG.I1Opnkpsl("wmfrf", -143934870, 458404114, 458404113, 458404112, -143934870, (NNNYO)((NNNYO)bG.I1Opnkpsl("xmkvq", -143934872, 458404115, 458404110, 458404111, -143934872, (NNuU)((NNuU)bG.I1Opnkpsl("ipmpfo", -143934872, 458404107, 458404102, 458404111, -143934872, (bG)this)[bG.I1Opnkpsl("vufcaug", -143934866, 458404107, 458404124, 458404109, -143934866)[2]]))[bG.I1Opnkpsl("gbwzyyt", -143934866, 458404107, 458404110, 458404109, -143934866)[0]]));
        Vector2f vector2f = new Vector2f((float)bG.I1Opnkpsl("vufcaug", -143934870, 458404119, 458404118, 458404117, -143934870, (NNde)callSite), (float)bG.I1Opnkpsl("vufcaug", -143934870, 458404119, 458404110, 458404117, -143934870, (NNde)callSite));
        bG.I1Opnkpsl("xjcbham", -143934872, 458404107, 458404104, 458404111, -143934872, (bG)this)[bG.I1Opnkpsl("kzdiqb", -143934866, 458404107, 458404110, 458404109, -143934866)[1]] = vector2f;
        return (boolean)bG.I1Opnkpsl("kzdiqb", -143934869, 458404116, 458404124, 458404139, -143934869, (UM)this);
    }

    private static /* synthetic */ String i(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{1, 41, -26, 74, -48, -29, -91, -9, -111, 46, -69, 14, -63, -44, -14, 35};
        int n = 0;
        int n2 = 216;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 95;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int i(int n) {
        return (Integer.rotateLeft(Integer.rotateLeft(Integer.rotateLeft(n, 14) ^ 0xAC6235BD, 18), 6) ^ 0x5208797E) + 1;
    }

    private void b() {
        if (bG.I1Opnkpsl("vufcaug", -143934872, 458404107, 458404104, 458404111, -143934872, (bG)this) == null) {
            bG.I1Opnkpsl("kzdiqb", -143934871, 458404107, 458404104, 458404111, -143934871, (bG)this, (Object[])new Object[bG.I1Opnkpsl("msvta", -143934866, 458404107, 458404138, 458404137, -143934866)[2]]);
            CallSite callSite = bG.I1Opnkpsl("szyuoq", -143934872, 458404107, 458404104, 458404111, -143934872, (bG)this);
        }
    }

    private static void s() {
        M = new float[]{0.0f, 0.0f, 0.15f, 0.15f};
    }

    private static void m() {
        B = new byte[]{3, 2, 2};
    }

    private static void j() {
        Z = new short[]{0, 1, 0};
        i = new short[]{5, 1, 1, 1, 1, 1, 0};
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{120, -6, 71, 50, -27, 67, -20, 51, -54, 55, 47, 23, -90, -83, 18, -127};
        int n = 0;
        int n2 = 1;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 113;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int u(int n) {
        return Integer.rotateRight(Integer.rotateLeft(Integer.rotateRight(Integer.rotateRight(-Integer.rotateLeft(n ^ 0xD1216775, 25), 12), 27) ^ 0xB389EEDF, 21), 31);
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{29, -61, -79, -13, -10, -46, -12, 17, 0, -9, 23, 39, -95, -45, -45, 115};
        int n = 0;
        int n2 = 5;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 105;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int y(int n) {
        return -Integer.rotateRight(Integer.rotateLeft(Integer.rotateRight(n ^ 0xD1026385, 23) ^ 0xC662F3F6, 12) ^ 0x3D243770, 7);
    }

    @uF
    public void N(Re re) {
        bG.I1Opnkpsl("msvta", -143934870, 458404107, 458404106, 458404105, 494960000, (bG)this);
        bG.I1Opnkpsl("lall", -143934870, 458404123, 458404102, 458404122, 494960000, (uK)((uK)((Object)bG.I1Opnkpsl("ipmpfo", -143934870, 458404101, 458404110, 458404100, 494960000, (ld)((ld)((Object)bG.I1Opnkpsl("ipmpfo", -143934872, 458404107, 458404104, 458404111, -1813342079, (bG)this)[bG.I1Opnkpsl("msvta", -143934866, 458404107, 458404110, 458404109, -1679699692)[6]]))))), (Object)re);
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateLeft(Integer.rotateLeft(-Integer.rotateLeft(n ^ 0x64676BE3, 17), 14), 20);
    }

    @uF(y=uA.BEFORE)
    public void N(ig ig2) {
        bG.I1Opnkpsl("kzdiqb", -143934870, 458404107, 458404106, 458404105, 494960000, (bG)this);
        Vector2f vector2f = (Vector2f)bG.I1Opnkpsl("lall", -143934872, 458404107, 458404104, 458404111, 809518210, (bG)this)[bG.I1Opnkpsl("gbwzyyt", -143934866, 458404107, 458404110, 458404109, 32499611)[2]];
        bG.I1Opnkpsl("ipmpfo", -143934871, 458404108, 458404099, 458404098, -1733568362, (Vector2f)vector2f, (float)(bG.I1Opnkpsl("szyuoq", -143934872, 458404108, 458404099, 458404098, -992734296, (Vector2f)vector2f) + (float)bG.I1Opnkpsl("vufcaug", -143934870, 458404121, 458404120, 458404127, 494960000, (ig)ig2) * bG.I1Opnkpsl("qbvnfx", -143934866, 458404107, 458404126, 458404125, -1723705887)[2]));
        Vector2f vector2f2 = (Vector2f)bG.I1Opnkpsl("ipmpfo", -143934872, 458404107, 458404104, 458404111, 1280791987, (bG)this)[bG.I1Opnkpsl("qbvnfx", -143934866, 458404107, 458404110, 458404109, 1525290227)[3]];
        bG.I1Opnkpsl("msvta", -143934871, 458404108, 458404102, 458404098, -830051825, (Vector2f)vector2f2, (float)(bG.I1Opnkpsl("gbwzyyt", -143934872, 458404108, 458404102, 458404098, 875760166, (Vector2f)vector2f2) + (float)bG.I1Opnkpsl("kzdiqb", -143934870, 458404121, 458404104, 458404127, 494960000, (ig)ig2) * bG.I1Opnkpsl("xmkvq", -143934866, 458404107, 458404126, 458404125, 105812133)[3]));
        bG.I1Opnkpsl("xjcbham", -143934870, 458404121, 458404096, 458404105, 494960000, (ig)ig2);
    }

    @uF(y=uA.AFTER)
    public void N(MM mM) {
        bG.I1Opnkpsl("xqfrgdhv", -143934870, 458404107, 458404106, 458404105, 494960000, (bG)this);
        bG.I1Opnkpsl("kzdiqb", -143934870, 458404097, 458404096, 458404103, 494960000, (MM)mM, (float)bG.I1Opnkpsl("xqfrgdhv", -143934872, 458404108, 458404099, 458404098, 232479325, (Vector2f)((Vector2f)bG.I1Opnkpsl("xmkvq", -143934872, 458404107, 458404104, 458404111, 2128463626, (bG)this)[bG.I1Opnkpsl("lall", -143934866, 458404107, 458404110, 458404109, -738262989)[4]])));
        bG.I1Opnkpsl("wmfrf", -143934870, 458404097, 458404102, 458404103, 494960000, (MM)mM, (float)bG.I1Opnkpsl("szyuoq", -143934872, 458404108, 458404102, 458404098, 1107082498, (Vector2f)((Vector2f)bG.I1Opnkpsl("xqfrgdhv", -143934872, 458404107, 458404104, 458404111, -117808983, (bG)this)[bG.I1Opnkpsl("vufcaug", -143934866, 458404107, 458404110, 458404109, 710055279)[5]])));
    }

    private static /* synthetic */ String R(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{10, 111, 103, -4, 28, 88, 82, -104, -122, 96, 64, 66, 23, 0, -3, -108};
        int n = 0;
        int n2 = 251;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 43;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        OlOtir0 = "\u00f5\u00f6\u00c4\u009e\u009b\u00c6\u00e4\u001a\u00ca\u009e\u00df%Y\u00a0\u00a7Nz\u00ad\u00e7\u00b1\"\u00e0\u009e\u009cDA\u00b0\u0091\u00cd\u00af8\u000es\u00c4\u009b\u00c6\u00e4\u001a\u00ca\u009e\u00df\tP\u00f0\u009b\u00c6\u00e4\u001a\u00ca\u009e\u00df%Y\u009b\u00ab\u00f6Mv\u009d=\u0099\u00a9\u00d2\u0003\u00cb\u00b5\u008a9R\u00b8\u00dd\u00f4\u008dq\u0086\u0093\u00ea\u00ff>\u00ee\u00dc\u009c\ny\u00b2\u00dd\u00f6\u00a2 N\u00be\u00ab\u00bb\u0014\u0086\u0085\u00bf\u00d9\u00f6\u00cc\u00d5\f\u00c9\u0089\u00a2.z\u00fa\u00bc\u00f7\u00a4/\u00f4K\u009b\u00c6\u00e4\u001a\u00ca\u009e\u00df\u0007|\u00f7\u00fd\u0005\u00f6\u00d6\u00ff\u009b\u00c6\u00e4\u001a\u00ca\u009e\u00df\u0007s\u0018\u0099Mk\u0093\u00cb\u00da\u000e\u00f5\u00a1\u00b5\u00068\u00b9\u00ab\u0082\u008c ]5\u00be\u00af\u00f2)\u00e1\u0094\u00df8c\u00a7\u009b\u00d7\u00a7qg\u000f\u0094\u00c4\u00d82\u00dd\u00b6\u009dD{\u00a3\u00c9\u0090\u008c\u0001x\u0005\u00a5\u00d2\u00db%\u00a0\u009f\u0094POf\u009b\u00c6\u00e4\u001a\u00ca\u009e\u00df\u0002p?Y\u0093\u00ea\u00ff>\u00ee\u00dc\u009c\ny\u00b2\u00dd\u00ea\u00b48\u00a6l\u00b8\u00bbF\u00f6\u00cc\u00f4)\u00f9\u0092\u00df\u0007v\u00bb\u0095\u0096\u008f(V\u000b\u00bc\u00f4\u00a5\u009c\u00f6\u00c6^\u009b\u00c6\u00e4\u001a\u00ca\u009e\u00df%Y\u00b1\u0097w\u00adu\u009b\u00c6\u00e4\u001a\u00ca\u009e\u00df&Z\u00d7%\u009b\u00c6\u00e4\u001a\u00ca\u009e\u00df>Z\u0018\u008c\u00a7\u00f6\u00dai\u00bd\u0093\u00ea\u00ff>\u00ee\u00dc\u009c\ny\u00b2\u00dd\u00f6\u00a2 5\u00f6\u00ab\u00bb\u00b7\u001e\u00c4\u009b\u00c6\u00e4\u001a\u00ca\u009e\u00df\u001e\\";
        lOp00itli = new int[]{2162698, 8060929, 8192003, 983041, 4849683, 19136513, 18808834, 0x100011, 0x1090001, 8126465, 0x10A000A, 0x600001, 3866639, 0xD10001, 0x80000A, 15007764, 20578314, 19202069, 13041674, 0x1080001, 3, 9175041, 9043970, 12976129, 196620, 2818061, 3670017, 0x610010, 0xFC000C, 6094849, 16318467, 18153482, 18939907, 0x1140001, 3735554, 13762579, 6160386, 7405578, 9240633};
        bG.j();
        bG.m();
        bG.T();
        bG.s();
        bG.P();
    }

    private static /* synthetic */ CallSite Ilk0sn(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = lOp00itli[n2 ^ 0x1B52B10B];
        int n9 = n8 >>> 16;
        String string2 = bG.lIillOIl0(OlOtir0.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x1B52B10B);
        n8 = lOp00itli[n3 ^ 0x1B52B10B];
        int n10 = n8 >>> 16;
        String string3 = bG.lIillOIl0(OlOtir0.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x1B52B10B);
        n8 = lOp00itli[n4 ^ 0x1B52B10B];
        int n11 = n8 >>> 16;
        String string4 = bG.lIillOIl0(OlOtir0.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x1B52B10B);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xF76BBADC) + -178;
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

    private static /* synthetic */ String lIillOIl0(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-111, 76, -124, -46, 4, 30, -109, -68, -41, -124, -1, 37, 42, 68, 96, -81};
        byte[] byArray3 = new byte[]{-43, -47, 82, 44, -65, 11, -88, 112, -41, 57, -110, -99, 86, -62, -74, -93};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite I1Opnkpsl(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = lOp00itli[n2 ^ 0x1B52B10B];
        int n7 = n6 >>> 16;
        String string2 = bG.lIillOIl0(OlOtir0.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0x1B52B10B);
        n6 = lOp00itli[n3 ^ 0x1B52B10B];
        int n8 = n6 >>> 16;
        String string3 = bG.lIillOIl0(OlOtir0.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0x1B52B10B);
        n6 = lOp00itli[n4 ^ 0x1B52B10B];
        int n9 = n6 >>> 16;
        String string4 = bG.lIillOIl0(OlOtir0.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0x1B52B10B);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xF76BBADC) + -178;
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

    private static /* synthetic */ CallSite lOtImimkp(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) throws Exception {
        int n9 = lOp00itli[n2 ^ 0x1B52B10B];
        int n10 = n9 >>> 16;
        String string2 = bG.lIillOIl0(OlOtir0.substring(n10, n10 + (n9 & 0xFFFF)), n2 ^ 0x1B52B10B);
        n9 = lOp00itli[n3 ^ 0x1B52B10B];
        int n11 = n9 >>> 16;
        String string3 = bG.lIillOIl0(OlOtir0.substring(n11, n11 + (n9 & 0xFFFF)), n3 ^ 0x1B52B10B);
        n9 = lOp00itli[n4 ^ 0x1B52B10B];
        int n12 = n9 >>> 16;
        String string4 = bG.lIillOIl0(OlOtir0.substring(n12, n12 + (n9 & 0xFFFF)), n4 ^ 0x1B52B10B);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xF76BBADC) + -178;
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

    private static /* synthetic */ void OlOtri(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[39];
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
        OlOtir0 = stringBuilder.toString();
        lOp00itli = nArray;
    }

    private static /* synthetic */ CallSite llsslIOk0(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) throws Exception {
        int n9 = lOp00itli[n2 ^ 0x1B52B10B];
        int n10 = n9 >>> 16;
        String string2 = bG.lIillOIl0(OlOtir0.substring(n10, n10 + (n9 & 0xFFFF)), n2 ^ 0x1B52B10B);
        n9 = lOp00itli[n3 ^ 0x1B52B10B];
        int n11 = n9 >>> 16;
        String string3 = bG.lIillOIl0(OlOtir0.substring(n11, n11 + (n9 & 0xFFFF)), n3 ^ 0x1B52B10B);
        n9 = lOp00itli[n4 ^ 0x1B52B10B];
        int n12 = n9 >>> 16;
        String string4 = bG.lIillOIl0(OlOtir0.substring(n12, n12 + (n9 & 0xFFFF)), n4 ^ 0x1B52B10B);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xF76BBADC) + -178;
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
