/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NAC
 *  KDFzREm.NFU
 *  KDFzREm.NSg
 *  KDFzREm.Nho
 *  KDFzREm.Nhq
 */
package KDFzREm;

import KDFzREm.NAC;
import KDFzREm.NFU;
import KDFzREm.NSg;
import KDFzREm.Nho;
import KDFzREm.Nhq;
import KDFzREm.Rs;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.uF;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

@UZ(L="SRPSpoofer", y=UR.MISC, N=Uz.BASE)
public class Wq
extends UM {
    private static /* synthetic */ String lIqinrtst;
    private static /* synthetic */ int[] IlsOqti;

    static {
        Wq.ntfClinit();
    }

    @uF
    public void N(Rs rs) {
        CallSite callSite = Wq.I1pmOsqrk("uzpzbp", -1779335524, 1745131375, 1745131374, 1745131373, 381890206, 87310503, (Rs)rs);
        if (!(callSite instanceof NSg)) {
            return;
        }
        NSg nSg = (NSg)callSite;
        Wq.I1pmOsqrk("qiqch", -1779335524, 1745131375, 1745131372, 1745131371, 381890206, 87310503, (Rs)rs);
        callSite = Wq.I1pmOsqrk("ahqu", -1779335524, 1745131370, 1745131372, 1745131369, 381890206, 87310503, (NSg)nSg);
        CallSite callSite2 = Wq.I1pmOsqrk("nicxb", -1779335524, 1745131375, 1745131368, 1745131367, 381890206, 87310503, (Rs)rs);
        Wq.I1pmOsqrk("agdhkuy", -1779335524, 1745131363, 1745131362, 1745131361, 381890206, 87310503, (NFU)callSite2, (NAC)new Nho((UUID)((Object)callSite), (Nhq)Wq.I1pmOsqrk("agdhkuy", -1779335528, 1745131366, 1745131365, 1745131364, 1365895155, -143640055)));
        Wq.I1pmOsqrk("uaaj", -1779335524, 1745131363, 1745131362, 1745131361, 381890206, 87310503, (NFU)callSite2, (NAC)new Nho((UUID)((Object)callSite), (Nhq)Wq.I1pmOsqrk("uzpzbp", -1779335528, 1745131366, 1745131360, 1745131364, -1765985627, 1975086154)));
    }

    private static /* synthetic */ void ntfClinit() {
        lIqinrtst = ":.Uh\u00042A\u00a3\u00c9\u00fb`GK\u000fgz9\u0013s\u00bd\u00b7\u009f3\u009abmj\n \u007f\u00bd\u008c\u00b8=\u0018\u00d4 U1\u00f6p?bmK/\u0010d\u00c0\u00bc\u00a1{:\u00bd ;\u00f2bmK/\u0010d\u00c0\u00bc\u00a1{:\u00ba6;\u0012\"Dl\u000f\t/\u00a1\u00c9\u00fdb\u0085\u00ac\u00ae\u000fgz9\u0013s\u00bd\u00ab\u00bf\u00fe\u0007jD-,L\u00d7\u0094\u00e3\u001a5\u00b8N).\u00e0\u0000eF\u0011\u0004[\u00ff\u00d6\u0082<\u0005\u00c0\u00b0\u000fgz9\u0013s\u00bd\u00b7\u00a4%\u00c8\"Dl\u000f\t/\u00a1\u00c9\u00fdc\u00f3bwl\u00c4\u000fgz9\u0013s\u00bd\u00b7\u008a\u0001";
        IlsOqti = new int[]{5505034, 5439489, 3670031, 5373953, 9502723, 786443, 1507346, 9699329, 2686991, 0x7B000B, 4653067, 7208973, 9764875, 12, 6160400, 8781835};
    }

    private static /* synthetic */ String Oltnl(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{108, -119, -62, 24, -75, -29, -64, -34, 59, 123, 76, -74, -105, -73, -89, -70};
        byte[] byArray3 = new byte[]{-91, -67, -73, 60, 125, -105, -125, -97, 70, 22, -93, -49, 84, 13, 36, -57};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void II0Ij(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[16];
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
        lIqinrtst = stringBuilder.toString();
        IlsOqti = nArray;
    }

    private static /* synthetic */ CallSite l1pjn0r0q(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) throws Exception {
        int n9 = IlsOqti[n2 ^ 0x6804976F];
        int n10 = n9 >>> 16;
        String string2 = Wq.Oltnl(lIqinrtst.substring(n10, n10 + (n9 & 0xFFFF)), n2 ^ 0x6804976F);
        n9 = IlsOqti[n3 ^ 0x6804976F];
        int n11 = n9 >>> 16;
        String string3 = Wq.Oltnl(lIqinrtst.substring(n11, n11 + (n9 & 0xFFFF)), n3 ^ 0x6804976F);
        n9 = IlsOqti[n4 ^ 0x6804976F];
        int n12 = n9 >>> 16;
        String string4 = Wq.Oltnl(lIqinrtst.substring(n12, n12 + (n9 & 0xFFFF)), n4 ^ 0x6804976F);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x95F17E2A) + -178;
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

    private static /* synthetic */ CallSite l1jnkIjtO(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) throws Exception {
        int n9 = IlsOqti[n2 ^ 0x6804976F];
        int n10 = n9 >>> 16;
        String string2 = Wq.Oltnl(lIqinrtst.substring(n10, n10 + (n9 & 0xFFFF)), n2 ^ 0x6804976F);
        n9 = IlsOqti[n3 ^ 0x6804976F];
        int n11 = n9 >>> 16;
        String string3 = Wq.Oltnl(lIqinrtst.substring(n11, n11 + (n9 & 0xFFFF)), n3 ^ 0x6804976F);
        n9 = IlsOqti[n4 ^ 0x6804976F];
        int n12 = n9 >>> 16;
        String string4 = Wq.Oltnl(lIqinrtst.substring(n12, n12 + (n9 & 0xFFFF)), n4 ^ 0x6804976F);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x95F17E2A) + -178;
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

    private static /* synthetic */ CallSite I1pmOsqrk(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = IlsOqti[n2 ^ 0x6804976F];
        int n8 = n7 >>> 16;
        String string2 = Wq.Oltnl(lIqinrtst.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0x6804976F);
        n7 = IlsOqti[n3 ^ 0x6804976F];
        int n9 = n7 >>> 16;
        String string3 = Wq.Oltnl(lIqinrtst.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0x6804976F);
        n7 = IlsOqti[n4 ^ 0x6804976F];
        int n10 = n7 >>> 16;
        String string4 = Wq.Oltnl(lIqinrtst.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0x6804976F);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x95F17E2A) + -178;
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
