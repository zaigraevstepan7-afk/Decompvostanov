/*
 * Decompiled with CFR 0.152.
 */
package KDFzREm;

import KDFzREm.lw;
import KDFzREm.za;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class lY {
    private static String[] N;
    private static boolean[] y;
    public Object[] E;
    private static short[] L;
    private static /* synthetic */ String IInjnmpm;
    private static /* synthetic */ int[] OljtOpnmm;

    public LinkedHashMap<String, lw<?>> w() {
        return lY.lO0jsmjn("ioycc", -969786684, -344455129, -344455132, -344455131, -969786684, -969786684, (Map)((Map)((Object)lY.lO0jsmjn("jjzvqf", -969786680, -344455134, -344455133, -344455136, -969786680, -969786680, (lY)this)[lY.lO0jsmjn("aklmydqg", -969786674, -344455134, -344455135, -344455130, -969786674, -969786674)[4]])));
    }

    private static void L() {
        y = new boolean[]{true, false, true};
    }

    private static /* synthetic */ int L(int n) {
        return Integer.rotateLeft(-Integer.rotateLeft(-Integer.rotateRight(n, 2) ^ 0x26922820, 25), 4);
    }

    public <T extends lw<?>> T L(String string) {
        return (T)((lw)((Object)lY.lO0jsmjn("qcfpdfbi", -969786683, -344455126, -344455125, -344455128, -969786683, -969786683, (Map)((Map)((Object)lY.lO0jsmjn("orrytj", -969786680, -344455134, -344455133, -344455136, -969786680, -969786680, (lY)this)[lY.lO0jsmjn("bjwatgbj", -969786674, -344455134, -344455135, -344455130, -969786674, -969786674)[1]])), (Object)string)));
    }

    public lY() {
        lY.lO0jsmjn("ymzivd", -969786678, -344455134, -344455127, -344455122, -969786678, -969786678, (lY)this);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        lY.lO0jsmjn("jokikzi", -969786680, -344455134, -344455133, -344455136, -969786680, -969786680, (lY)this)[lY.lO0jsmjn("bjwatgbj", -969786674, -344455134, -344455135, -344455130, -969786674, -969786674)[0]] = linkedHashMap;
    }

    static {
        lY.ntfClinit();
    }

    private void u() {
        if (lY.lO0jsmjn("bjwatgbj", -969786680, -344455134, -344455133, -344455136, -969786680, -969786680, (lY)this) == null) {
            lY.lO0jsmjn("orrytj", -969786679, -344455134, -344455133, -344455136, -969786679, -969786679, (lY)this, (Object[])new Object[lY.lO0jsmjn("jokikzi", -969786674, -344455134, -344455121, -344455124, -969786674, -969786674)[2]]);
            CallSite callSite = lY.lO0jsmjn("hlgs", -969786680, -344455134, -344455133, -344455136, -969786680, -969786680, (lY)this);
        }
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{90, -38, -16, 65, -98, 31, -8, -108, -16, 4, -77, 109, 4, -15, -81, 100};
        int n = 0;
        int n2 = 31;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 195;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void y() {
        L = new short[]{0, 0, 0, 0, 0};
    }

    private static /* synthetic */ int y(int n) {
        return Integer.rotateRight(Integer.rotateLeft(Integer.rotateLeft(Integer.rotateRight(Integer.rotateRight(-n, 24), 14), 4), 25), 31);
    }

    public lw<?> N(lw<?> lw2) {
        if (lY.lO0jsmjn("jokikzi", -969786683, -344455126, -344455113, -344455116, -969786683, -969786683, (Map)((Map)((Object)lY.lO0jsmjn("jokikzi", -969786680, -344455134, -344455133, -344455136, -969786680, -969786680, (lY)this)[lY.lO0jsmjn("ymzivd", -969786674, -344455134, -344455135, -344455130, -969786674, -969786674)[2]])), (Object)lY.lO0jsmjn("jokikzi", -969786678, -344455120, -344455119, -344455114, -969786678, -969786678, (za)((Object)lY.lO0jsmjn("bjwatgbj", -969786678, -344455123, -344455118, -344455117, -969786678, -969786678, lw2)))) != false) {
            Object[] objectArray = new Object[lY.lO0jsmjn("jjzvqf", -969786674, -344455134, -344455121, -344455124, 345178493, 760977922)[0]];
            objectArray[lY.lO0jsmjn("gnkrfww", -969786674, -344455134, -344455121, -344455124, -1009026426, -1620413051)[1]] = lY.lO0jsmjn("wosmsr", -969786678, -344455123, -344455118, -344455117, 392620776, 2076629712, lw2);
            throw new IllegalArgumentException((String)((Object)lY.lO0jsmjn("ymryex", -969786684, -344455110, -344455109, -344455112, 392620776, 2076629712, (String)((Object)lY.lO0jsmjn("qcfpdfbi", -969786674, -344455134, -344455119, -344455115, -630096473, 815556717)[0]), (Object[])objectArray)));
        }
        lY.lO0jsmjn("knotbkq", -969786683, -344455126, -344455111, -344455106, -969786683, -969786683, (Map)((Map)((Object)lY.lO0jsmjn("ymzivd", -969786680, -344455134, -344455133, -344455136, -969786680, -969786680, (lY)this)[lY.lO0jsmjn("ioycc", -969786674, -344455134, -344455135, -344455130, -969786674, -969786674)[3]])), (Object)lY.lO0jsmjn("xxnzahbr", -969786678, -344455120, -344455119, -344455114, -969786678, -969786678, (za)((Object)lY.lO0jsmjn("hlgs", -969786678, -344455123, -344455118, -344455117, -969786678, -969786678, lw2))), lw2);
        return lw2;
    }

    private static void N() {
        N = new String[]{"Setting with key %s already registered"};
    }

    public abstract za N(String var1);

    private static /* synthetic */ int N(int n) {
        return (Integer.rotateRight(Integer.rotateRight(Integer.rotateLeft((n ^ 0x3C577643) + 1, 27), 13) ^ 0x58A9DAF0, 25) ^ 0x1C84397F) + 1;
    }

    private static /* synthetic */ void ntfClinit() {
        IInjnmpm = "d\u00c8}\u00ad(\u00daY\u0083Q]'d\u001e\u00e5j\u00c8i\u0088s\u00ed#\u00d9S\u0087I\u0017Ef\u0001\u00fb\u00e8\u0012\u008eFE\u000f\u00c2g\u00ce&\u00db]\u0081Ypit\u0019\u00c5f\u00bd\u00d8\u00bd\u00ebz\u00e39\u00d4\u0019\u0091IQd(<\u00e9w\u00f6\u00bc\u00ebz\u00e39\u00d4\u0019\u0091IQd(=\u00e1i\u00a6\u00f0\u00c3X\u00e3<\u00dd{\u0085M\u0003\u00ed\u00d2d=\u00fd\u0012\u00ebz\u00e39\u00d4\u0019\u0088\\Vo(>\u00eam\u00c2Y\u00d3+\u00ce%\u00d4@\u0085\u0012Tii\u0016\u00a7H\u00c5P\u00c2s\u00f6t\u009cz\u008e\\Ni(\u001d\u00e9i\u00c0\u0015\u00e8r\u00e8*\u00d6B\u00dff\u00e3V\u00f8\u001d\u00f0[\u00cbQOW\u00ebz\u00e39\u00d4\u0019\u0088\\Vo(>\u00eam\u00a8o\u00d3+G\u0084\u00eb\u00f4G\u00e3V\u00f8\u001d\u00f0[\u00cbGY\u00c3\u00e3V\u00f8\u001d\u00f0[\u00cbQa\u00cd\u00c8b\u00ef.\u00c1W\u00c6f\u00e3`\u00c0B\u008dQ\u0017Ef\u0001\u00cc\u00c2d\u00ce\u00ebz\u00e39\u00d4\u0019\u0088\\Vo(\"\u00fcu\u00a4\u00fb\u00c0+yW\u00c6f\u00e3`\u00d9W\u008aZ\u0017[s\u0003\u00e1i\u00c0d\u00c8~\u00f6.\u00dcX\u0097v]q\u00cc\u00ebz\u00e39\u00d4\u0019\u0088\\Vo(>\u00eam\u00a8\u0087\u00d3+\u00ab\u0003\u00dfW\u0092\\\u0017df\u001f\u00ef(\u0082\u0086\u00cdu\u00e1;\u008e\u00e9\u008e\\\u00c9\u000b\u00f3L\u00b6xU'}\u0010\u00b3I\u00ebz\u00e39\u00d4\u0019\u0088\\Vo(>\u00eam\u00a8\u0002\u00d3+\u00ab\u0015\u0098\u008e\\\u00e8.\u00c3W\u00cbQYf`^\u00dbs\u00d5\u00d9\u00c9w\u00b9\u00cc\u00ebz\u00e39\u00d4\u0019\u0088\\Vo(\"\u00fcu\u00a4\u008a\u00c0+\u00d9\u0003\u00dfW\u0092\\\u0017df\u001f\u00ef(\u0082\u0086\u00cdu\u00e1;\u008e\u001f\u00a8WY~f^\u00e4f\u00a3\u0083\u0088C\u00f6=\u00dcX\u0083\u0006";
        OljtOpnmm = new int[]{12976138, 12124161, 10813459, 12058625, 12189698, 30, 2293776, 3407914, 0xD6000D, 0xE30003, 18153510, 0x1E0001, 2031619, 16318465, 6356994, 10158090, 0x330001, 20643854, 12320778, 0x220001, 22937620, 17432587, 21561365, 15073299, 16384016, 0xD00006, 24248377, 6160387, 6488120};
        lY.y();
        lY.L();
        lY.N();
    }

    private static /* synthetic */ CallSite oo0mjmmsk(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = OljtOpnmm[n2 ^ 0xEB780822];
        int n9 = n8 >>> 16;
        String string2 = lY.lOIlqIIir(IInjnmpm.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0xEB780822);
        n8 = OljtOpnmm[n3 ^ 0xEB780822];
        int n10 = n8 >>> 16;
        String string3 = lY.lOIlqIIir(IInjnmpm.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0xEB780822);
        n8 = OljtOpnmm[n4 ^ 0xEB780822];
        int n11 = n8 >>> 16;
        String string4 = lY.lOIlqIIir(IInjnmpm.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0xEB780822);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xC6323A7C) + -178;
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

    private static /* synthetic */ CallSite lO0jsmjn(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = OljtOpnmm[n2 ^ 0xEB780822];
        int n8 = n7 >>> 16;
        String string2 = lY.lOIlqIIir(IInjnmpm.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0xEB780822);
        n7 = OljtOpnmm[n3 ^ 0xEB780822];
        int n9 = n7 >>> 16;
        String string3 = lY.lOIlqIIir(IInjnmpm.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0xEB780822);
        n7 = OljtOpnmm[n4 ^ 0xEB780822];
        int n10 = n7 >>> 16;
        String string4 = lY.lOIlqIIir(IInjnmpm.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0xEB780822);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xC6323A7C) + -178;
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

    private static /* synthetic */ CallSite ll00lqjiI(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = OljtOpnmm[n2 ^ 0xEB780822];
        int n9 = n8 >>> 16;
        String string2 = lY.lOIlqIIir(IInjnmpm.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0xEB780822);
        n8 = OljtOpnmm[n3 ^ 0xEB780822];
        int n10 = n8 >>> 16;
        String string3 = lY.lOIlqIIir(IInjnmpm.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0xEB780822);
        n8 = OljtOpnmm[n4 ^ 0xEB780822];
        int n11 = n8 >>> 16;
        String string4 = lY.lOIlqIIir(IInjnmpm.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0xEB780822);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xC6323A7C) + -178;
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

    private static /* synthetic */ CallSite ooOskqiit(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = OljtOpnmm[n2 ^ 0xEB780822];
        int n8 = n7 >>> 16;
        String string2 = lY.lOIlqIIir(IInjnmpm.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0xEB780822);
        n7 = OljtOpnmm[n3 ^ 0xEB780822];
        int n9 = n7 >>> 16;
        String string3 = lY.lOIlqIIir(IInjnmpm.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0xEB780822);
        n7 = OljtOpnmm[n4 ^ 0xEB780822];
        int n10 = n7 >>> 16;
        String string4 = lY.lOIlqIIir(IInjnmpm.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0xEB780822);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xC6323A7C) + -178;
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

    private static /* synthetic */ void ooppO(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[29];
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
        IInjnmpm = stringBuilder.toString();
        OljtOpnmm = nArray;
    }

    private static /* synthetic */ String lOIlqIIir(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{54, 12, 27, 80, -99, 11, -85, -46, 49, -122, -93, 87, -9, -66, 61, 58};
        byte[] byArray3 = new byte[]{29, -15, -37, 88, 37, 110, -50, -87, 13, 108, -40, -22, 55, -125, 85, 53};
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
