/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package KDFzREm;

import KDFzREm.jA;
import KDFzREm.vP;
import KDFzREm.vT;
import KDFzREm.vW;
import KDFzREm.vb;
import KDFzREm.vm;
import KDFzREm.vv;
import KDFzREm.yI;
import KDFzREm.yM;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class dw {
    private static String[] L;
    private static byte[] u;
    private static boolean[] i;
    private static short[] R;
    private static long[] M;
    public static Object[] N;
    public Object[] y;
    private static /* synthetic */ String OOrpk;
    private static /* synthetic */ int[] ooOlilt;

    private static /* synthetic */ String L(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{62, 77, 5, 80, -31, -25, 27, -91, 42, -91, 9, 18, 104, 14, -60, 119};
        int n = 0;
        int n2 = 121;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 177;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int L(int n) {
        return ((Integer.rotateLeft(Integer.rotateLeft(n, 25) ^ 0xD5F71E16, 4) ^ 0xBFCD7BAC) + 1 ^ 0xDFB48A07) + 1;
    }

    private static void L() {
        u = new byte[]{2, 2};
    }

    private static void M() {
        N = new Object[]{null, -1L};
    }

    public dw() {
        dw.lOinmIsti("psjc", -1156142428, 770247215, 770247214, 770247173, -1156142428, -1156142428, -1156142428, (dw)this);
        CallSite callSite = dw.lOinmIsti("xttisq", -1156142422, 770247206, 770247205, 770247204, -1156142422, -1156142422, -1156142422, (long)dw.lOinmIsti("psjc", -1156142432, 770247215, 770247208, 770247207, -1156142432, -1156142432, -1156142432)[0]);
        dw.lOinmIsti("xttisq", -1156142426, 770247215, 770247214, 770247213, -1156142426, -1156142426, -1156142426, (dw)this)[dw.lOinmIsti("wjufl", -1156142432, 770247215, 770247229, 770247225, -1156142432, -1156142432, -1156142432)[0]] = callSite;
    }

    static {
        dw.ntfClinit();
    }

    private static void B() {
        L = new String[]{"Client update revision {} is ahead of session baseline {}", "icon:hud/arrows", "update.restart-required"};
    }

    private static void i() {
        i = new boolean[]{false, false, true, false, true};
    }

    private static /* synthetic */ int i(int n) {
        return (Integer.rotateLeft(Integer.rotateRight(Integer.rotateRight(n ^ 0x90B25E7, 5), 14), 8) ^ 0x1EC6A89E) + 1;
    }

    private static /* synthetic */ int u(int n) {
        return Integer.rotateRight(Integer.rotateLeft(Integer.rotateLeft(-n ^ 0x3D5A980E, 31), 2) ^ 0x75701DC9, 28);
    }

    private static void u() {
        M = new long[]{-1L, -1L, 0L, -1L};
    }

    private void y() {
        if (dw.lOinmIsti("lsek", -1156142426, 770247215, 770247214, 770247213, -1156142426, -1156142426, -1156142426, (dw)this) == null) {
            dw.lOinmIsti("ulofcfug", -1156142425, 770247215, 770247214, 770247213, -1156142425, -1156142425, -1156142425, (dw)this, (Object[])new Object[dw.lOinmIsti("lsek", -1156142432, 770247215, 770247212, 770247211, -1156142432, -1156142432, -1156142432)[0]]);
            CallSite callSite = dw.lOinmIsti("lsek", -1156142426, 770247215, 770247214, 770247213, -1156142426, -1156142426, -1156142426, (dw)this);
            callSite[dw.lOinmIsti("wjufl", -1156142432, 770247215, 770247210, 770247209, -1156142432, -1156142432, -1156142432)[1]] = dw.lOinmIsti("psjc", -1156142422, 770247206, 770247205, 770247204, -1156142422, -1156142422, -1156142422, (long)dw.lOinmIsti("wjufl", -1156142432, 770247215, 770247208, 770247207, -1156142432, -1156142432, -1156142432)[2]);
            callSite[dw.lOinmIsti("lsek", -1156142432, 770247215, 770247210, 770247209, -1156142432, -1156142432, -1156142432)[2]] = dw.lOinmIsti("tutappno", -1156142422, 770247203, 770247205, 770247202, -1156142422, -1156142422, -1156142422, (int)dw.lOinmIsti("ulofcfug", -1156142432, 770247215, 770247210, 770247209, -1156142432, -1156142432, -1156142432)[3]);
        }
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-92, -69, -55, 30, -62, 111, 3, -128, -98, 22, -85, 70, -39, 111, 78, 101};
        int n = 0;
        int n2 = 45;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 7;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int y(int n) {
        return -Integer.rotateRight(Integer.rotateRight(Integer.rotateRight(-Integer.rotateRight(n ^ 0x17AA27AA, 5), 3), 14), 12);
    }

    private static /* synthetic */ long y(long l) {
        return -Long.rotateRight(-Long.rotateRight(Long.rotateLeft(l, 49), 53), 6);
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateLeft(n ^ 0x8548E910, 26) ^ 0xCB2AD838;
    }

    public synchronized void N() {
        CallSite callSite = dw.lOinmIsti("kdvxps", -1156142422, 770247201, 770247200, 770247231, -1156142422, -1156142422, -1156142422);
        if (dw.lOinmIsti("xttisq", -1156142428, 770247230, 770247229, 770247228, -1156142428, -1156142428, -1156142428, (jA)((Object)callSite)) != false) {
            dw.lOinmIsti("tutappno", -1156142428, 770247230, 770247227, 770247226, -1156142428, -1156142428, -1156142428, (jA)((Object)callSite), (yM)new yI());
        }
    }

    private static /* synthetic */ String N(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{69, -108, -59, -48, -53, -31, -126, -87, -19, -97, -11, -114, -9, -123, -66, 52};
        int n = 0;
        int n2 = 133;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 197;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    public synchronized void N(long l) {
        if (dw.lOinmIsti("wjufl", -1156142428, 770247206, 770247224, 770247223, -1156142428, -1156142428, -1156142428, (Long)((Long)((Object)dw.lOinmIsti("qjhg", -1156142426, 770247215, 770247214, 770247213, -1156142426, -1156142426, -1156142426, (dw)this)[dw.lOinmIsti("nqkywk", -1156142432, 770247215, 770247229, 770247225, -1156142432, -1156142432, -1156142432)[1]]))) == dw.lOinmIsti("xttisq", -1156142432, 770247215, 770247208, 770247207, -1156142432, -1156142432, -1156142432)[1]) {
            CallSite callSite = dw.lOinmIsti("xttisq", -1156142422, 770247206, 770247205, 770247204, -1156142422, -1156142422, -1156142422, (long)l);
            dw.lOinmIsti("qjhg", -1156142426, 770247215, 770247214, 770247213, -1156142426, -1156142426, -1156142426, (dw)this)[dw.lOinmIsti("kdvxps", -1156142432, 770247215, 770247229, 770247225, -1156142432, -1156142432, -1156142432)[2]] = callSite;
            return;
        }
        if (l <= dw.lOinmIsti("kdvxps", -1156142428, 770247206, 770247224, 770247223, 1091795492, -824185073, -1245864147, (Long)((Long)((Object)dw.lOinmIsti("nqkywk", -1156142426, 770247215, 770247214, 770247213, -528404029, 1471869993, 2060914560, (dw)this)[dw.lOinmIsti("tutappno", -1156142432, 770247215, 770247229, 770247225, 631606372, -1496298420, -464981558)[3]])))) {
            return;
        }
        if (dw.lOinmIsti("kdvxps", -1156142428, 770247218, 770247214, 770247217, 1091795492, -824185073, -1245864147, (vP)((Object)dw.lOinmIsti("tutappno", -1156142422, 770247201, 770247222, 770247221, 1091795492, -824185073, -1245864147)), (int)dw.lOinmIsti("ulofcfug", -1156142428, 770247203, 770247220, 770247219, 1091795492, -824185073, -1245864147, (Integer)((Object)dw.lOinmIsti("kdvxps", -1156142426, 770247215, 770247214, 770247213, -282206491, 694672028, -1657993721, (dw)this)[dw.lOinmIsti("ulofcfug", -1156142432, 770247215, 770247229, 770247225, 929651793, -981861629, 471428818)[4]]))) != false) {
            return;
        }
        dw.lOinmIsti("psjc", -1156142421, 770247182, 770247181, 770247180, 1091795492, -824185073, -1245864147, (Logger)((Logger)dw.lOinmIsti("kdvxps", -1156142432, 770247215, 770247227, 770247213, 678215776, -443977199, -264382311)[dw.lOinmIsti("kdvxps", -1156142432, 770247215, 770247229, 770247225, -254593987, 1826001631, -1444716005)[5]]), (String)((Object)dw.lOinmIsti("nqkywk", -1156142432, 770247215, 770247216, 770247183, -2069693726, -1063864397, 1890899782)[0]), (Object)dw.lOinmIsti("qjhg", -1156142422, 770247206, 770247205, 770247204, 1091795492, -824185073, -1245864147, (long)l), (Object)dw.lOinmIsti("qjhg", -1156142422, 770247206, 770247205, 770247204, 1091795492, -824185073, -1245864147, (long)dw.lOinmIsti("wjufl", -1156142428, 770247206, 770247224, 770247223, 1091795492, -824185073, -1245864147, (Long)((Long)((Object)dw.lOinmIsti("kdvxps", -1156142426, 770247215, 770247214, 770247213, -356289287, -1581476008, 867486166, (dw)this)[dw.lOinmIsti("lsek", -1156142432, 770247215, 770247229, 770247225, -1980984555, -429610076, 1941852095)[6]])))));
        CallSite callSite = dw.lOinmIsti("tutappno", -1156142422, 770247203, 770247205, 770247202, 1091795492, -824185073, -1245864147, (int)dw.lOinmIsti("kdvxps", -1156142428, 770247178, 770247227, 770247219, 1091795492, -824185073, -1245864147, (vW)((Object)dw.lOinmIsti("ulofcfug", -1156142428, 770247178, 770247227, 770247174, 1091795492, -824185073, -1245864147, (vW)((Object)dw.lOinmIsti("qjhg", -1156142428, 770247178, 770247227, 770247177, 1091795492, -824185073, -1245864147, (vW)((Object)dw.lOinmIsti("ulofcfug", -1156142428, 770247178, 770247229, 770247179, 1091795492, -824185073, -1245864147, (vW)((Object)dw.lOinmIsti("qjhg", -1156142428, 770247178, 770247216, 770247179, 1091795492, -824185073, -1245864147, (vW)((Object)dw.lOinmIsti("ulofcfug", -1156142428, 770247218, 770247210, 770247179, 1091795492, -824185073, -1245864147, (vP)((Object)dw.lOinmIsti("lsek", -1156142422, 770247201, 770247222, 770247221, 1091795492, -824185073, -1245864147)))))))), (vT)new vv((String)((Object)dw.lOinmIsti("qjhg", -1156142432, 770247215, 770247216, 770247183, -985328134, 492627775, 1705661075)[1])))), (vm)new vb((String)((Object)dw.lOinmIsti("qjhg", -1156142422, 770247176, 770247227, 770247175, 1091795492, -824185073, -1245864147, (String)((Object)dw.lOinmIsti("qjhg", -1156142432, 770247215, 770247216, 770247183, -558920162, 804143820, 29760587)[2]))))))));
        dw.lOinmIsti("tutappno", -1156142426, 770247215, 770247214, 770247213, -1655447803, -1506828833, -716119709, (dw)this)[dw.lOinmIsti("tutappno", -1156142432, 770247215, 770247229, 770247225, 1305219743, -1557833554, -1351440629)[7]] = callSite;
    }

    private static void R() {
        R = new short[]{0, 0, 0, 0, 1, 0, 0, 1};
    }

    private static /* synthetic */ int R(int n) {
        return Integer.rotateLeft(Integer.rotateRight(Integer.rotateLeft(Integer.rotateRight(n, 31) ^ 0x446149D6, 16), 25), 25);
    }

    private static /* synthetic */ void ntfClinit() {
        dw.lIqIs(new String[]{"\u0000\n\u0000\u0007\u0003\u00912\u00d1\u00b7\u00d0Y\u0000\u000f\u0000\u0001\u00e6\u0000\u0003\u0000\u0001W\u0000\u0006\u0000\u0002[\u00aa\u0000#\u00009\n\u00bc4\u00c5\u00a4\u00fe\u0010Y\u008e\u00ac\u00dcl\u00f4!7>L\u0097e\u00e8\u00b8\u00feIT\u00c0\u00ae\u00da-\u00c0z\n5H\u0095=\u00d0\u00e9\u00d3UT\u0099\u00a3\u0094/\u00c6;\"xm\u00924\u00c1\u00b1\u00eb\u0004\u001c\u00b9\u0000\u0000\u0000\n7\u00b4\u0018\u00de\u0080\u00daR\u001a\u008b\u00b5\u0000\u0015\u0000\u000f\u00ea\u00bc\u0015\u00e0\u0094\u00e5mp\u0082\u00ed\u00c2\u000e\u009c|\u0013\u0000\u0002\u0000\u0013\u00fc\u00bc4\u00c5\u00a4\u00fe\u0010Y\u008e\u00ac\u00dcl\u00e87/2\u00c4\u0084e\u0000$\u0000\u000e\u008d\u00d9\u0012\u00ef\u0096\u00d9Eg\u00aa\u00af\u00945\u00f0n\u0000\u0013\u0000\u0003\n\u00d9\u0004\u0000\u001d\u0000\n\u001c\u00b4\u0018\u00de\u0080\u00daR\u001a\u0099\u0092\u0000\u0017\u0000\t\u0017\u009f0\u00c3\u0084\u00feS@\u008a\u0000\u0019\u0000\u0001\u00ae\u0000\u000e\u0000\t\u00d1\u00b4\u0018\u00de\u0080\u00daR\u001a\u0096\u0000%\u0000\n\u0089\u00b4\u0018\u00de\u0080\u00daR\u001a\u0099\u0095\u0000\u001a\u0000\u000e]\u00d9\u0012\u00ef\u0096\u00d9Eg\u00aa\u00af\u00945\u00f7n\u0000\u001e\u0000\u0004\u00b2\u00b9w\u00fe\u0000\u0016\u0000\u0002[\u00a3\u0000\u0011\u0000\nq\u00b4\u0018\u00de\u0080\u00daR\u001a\u0085\u0083\u0000\r\u0000\u0016\u007f\u00b9w\u00e8\u00b8\u00feIT\u00c0\u00ae\u00da-\u00c0z\f\u00eb#\u00959\u00c1\u00a0\u00a4\u0000(\u0000&Q\u00bc4\u00c5\u00a4\u00fe\u0010Y\u008e\u00ac\u00dcl\u00f4!7\u00ec\u0017\u0097e\u008d\u009e\u00f5^C\u008e\u00ed\u00d7\"\u00c92j\u00d6\r\u00827\u00ca\u00b5\u00a4\u0000\u0005\u0000\u0001\u00ab\u0000\f\u0000\u0011\u00b5\u0091(\u00c5\u00fd\u00f3^[\u0088\u00ed\u00f2-\u00d30\"\u00e0\u00ad\u0000\b\u0000\u0002\"\u00ba\u0000\u0001\u0000\u0001C\u0000\t\u0000\u000e\u00a3\u0091(\u00c5\u00fd\u00f3^[\u0088\u00ed\u00f7,\u00c92\u0000!\u0000\u001fU\u00829\u008b\u00b3\u00ef^V\u0087\u00a7\u0094/\u00c82\"\u00ecT\u0097q\u00c8\u00bd\u00f8\u000b_\u00c0\u008e\u00d4$\u00c007\u0000*\u0000\u0003]\u00d9\b\u0000\u001c\u0000\u0003\u00f7\u00d9\u0017\u0000\"\u0000\u0004\u00ce\u009e8\u00cb\u0000\u001b\u0000\b\u000b\u009e*\u00f2\u00b3\u00f3JP\u0000)\u0000\u001a\u00e1\u00bc\u0015\u00e0\u0094\u00e5mp\u0082\u00ed\u00cd.\u009c|\t\u00ce\u008d\u00b6$\u00f6\u0097\u00f2\u0010C\u00b8\u00f9\u0000\u0007\u0000\u00016\u0000\u0018\u0000\u0003Q\u00d9\u0014\u0000\u001f\u0000\u0001\u00d0\u0000&\u0000\u001a(\u00bc\u0015\u00e0\u0094\u00e5mp\u0082\u00ed\u00cd\u0017\u009c|\t\u001cD\u00b6$\u00f6\u0097\u00f2\u0010C\u00b8\u00f9\u0000\u0014\u0000\u0001\u00eb\u0000\u0012\u0000\u0001\u00f5\u0000'\u0000\n0\u00b4\u0018\u00de\u0080\u00daR\u001a\u0095\u00a1\u0000\u0004\u0000\u0002\u00fe\u00b2\u0000 \u0000\u0013'\u00bc4\u00c5\u00a4\u00fe\u0010Y\u008e\u00ac\u00dcl\u00f4!7\u00ec\u0012\u0097e\u0000\u0010\u0000\u000eT\u00d9\u0012\u00ef\u0096\u00d9Eg\u00aa\u00af\u0094)\u00e6n\u0000\u000b\u0000\u0013J\u00baw\u00e8\u00b8\u00feIT\u00c0\u00ae\u00da-\u00c0z\t8\f\u0097e"});
        dw.R();
        dw.L();
        dw.i();
        dw.u();
        dw.B();
        dw.M();
        dw.N[0] = LogManager.getLogger(String.class);
    }

    private static /* synthetic */ CallSite lOliljp(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = ooOlilt[n2 ^ 0x2DE90A2F];
        int n9 = n8 >>> 16;
        String string2 = dw.lItkjs(OOrpk.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x2DE90A2F);
        n8 = ooOlilt[n3 ^ 0x2DE90A2F];
        int n10 = n8 >>> 16;
        String string3 = dw.lItkjs(OOrpk.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x2DE90A2F);
        n8 = ooOlilt[n4 ^ 0x2DE90A2F];
        int n11 = n8 >>> 16;
        String string4 = dw.lItkjs(OOrpk.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x2DE90A2F);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xBB16AA12) + -178;
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

    private static /* synthetic */ void lIqIs(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[43];
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
        OOrpk = stringBuilder.toString();
        ooOlilt = nArray;
    }

    private static /* synthetic */ CallSite lOinmIsti(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = ooOlilt[n2 ^ 0x2DE90A2F];
        int n9 = n8 >>> 16;
        String string2 = dw.lItkjs(OOrpk.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x2DE90A2F);
        n8 = ooOlilt[n3 ^ 0x2DE90A2F];
        int n10 = n8 >>> 16;
        String string3 = dw.lItkjs(OOrpk.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x2DE90A2F);
        n8 = ooOlilt[n4 ^ 0x2DE90A2F];
        int n11 = n8 >>> 16;
        String string4 = dw.lItkjs(OOrpk.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x2DE90A2F);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xBB16AA12) + -178;
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

    private static /* synthetic */ CallSite lInOnik(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) throws Exception {
        int n9 = ooOlilt[n2 ^ 0x2DE90A2F];
        int n10 = n9 >>> 16;
        String string2 = dw.lItkjs(OOrpk.substring(n10, n10 + (n9 & 0xFFFF)), n2 ^ 0x2DE90A2F);
        n9 = ooOlilt[n3 ^ 0x2DE90A2F];
        int n11 = n9 >>> 16;
        String string3 = dw.lItkjs(OOrpk.substring(n11, n11 + (n9 & 0xFFFF)), n3 ^ 0x2DE90A2F);
        n9 = ooOlilt[n4 ^ 0x2DE90A2F];
        int n12 = n9 >>> 16;
        String string4 = dw.lItkjs(OOrpk.substring(n12, n12 + (n9 & 0xFFFF)), n4 ^ 0x2DE90A2F);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xBB16AA12) + -178;
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

    private static /* synthetic */ String lItkjs(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-78, -27, -50, -55, -57, -120, 23, -48, 40, 112, -53, 46, 21, 123, 109, -112};
        byte[] byArray3 = new byte[]{6, -93, -53, -37, 120, 45, 114, 6, -108, -121, -79, -117, 36, 84, 58, 21};
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
