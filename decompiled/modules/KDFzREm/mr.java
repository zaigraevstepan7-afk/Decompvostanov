/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NNNwS
 *  KDFzREm.NNuU
 *  KDFzREm.gB
 */
package KDFzREm;

import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.gB;
import KDFzREm.ih;
import KDFzREm.uF;
import KDFzREm.wg;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;

@UZ(L="EdgeJump", y=UR.MOVEMENT, N=Uz.TOOLS)
public class mr
extends UM {
    private static short[] L;
    private static boolean[] u;
    private static /* synthetic */ String IIiImO;
    private static /* synthetic */ int[] OOp0ln0Im;

    private static void P() {
        L = new short[]{0, 4};
    }

    static {
        mr.ntfClinit();
    }

    private static void m() {
        u = new boolean[]{true, true};
    }

    private static /* synthetic */ int y(int n) {
        return Integer.rotateLeft((n ^ 0xFE5364C9) + 1 ^ 0xB8219967, 16) ^ 0xC1D5DA83;
    }

    @uF
    public void N(ih ih2) {
        if (mr.lIslr("atsvi", -1369943426, 2059319525, 2059319530, 2059319531, 140570927, 1234958634, -915966039, (NNNwS)((NNNwS)mr.lIslr("cazlyn", -1369943428, 2059319527, 2059319524, 2059319520, 74572847, -339360493, -378014042, (NNuU)((NNuU)mr.lIslr("btwdqx", -1369943428, 2059319522, 2059319523, 2059319520, -1452724617, 1627656932, 1975334760, (mr)this)[mr.lIslr("sbnx", -1369943430, 2059319522, 2059319521, 2059319526, 732495241, 1543853545, 332062911)[0]]))[mr.lIslr("zqaleqtx", -1369943430, 2059319522, 2059319521, 2059319526, 1630123661, 533958070, -76979021)[1]])) == false || mr.lIslr("btwdqx", -1369943426, 2059319528, 2059319521, 2059319531, 140570927, 1234958634, -915966039, (ih)ih2) != false) {
            return;
        }
        CallSite callSite = mr.lIslr("sbnx", -1369943440, 2059319533, 2059319538, 2059319539, 140570927, 1234958634, -915966039, (gB)mr.lIslr("gdvl", -1369943426, 2059319528, 2059319529, 2059319534, 140570927, 1234958634, -915966039, (ih)ih2), (int)mr.lIslr("cazlyn", -1369943430, 2059319522, 2059319535, 2059319532, -1610559112, -1612742408, 284673042)[0]);
        if (mr.lIslr("gdvl", -1369943426, 2059319536, 2059319537, 2059319531, 140570927, 1234958634, -915966039, (wg)((Object)callSite)) == false) {
            mr.lIslr("lsvhrr", -1369943426, 2059319528, 2059319542, 2059319543, 140570927, 1234958634, -915966039, (ih)ih2, (boolean)mr.lIslr("zmfb", -1369943430, 2059319522, 2059319535, 2059319532, -1624976358, 580445537, 969728054)[1]);
        }
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateLeft(Integer.rotateRight(-Integer.rotateRight(Integer.rotateLeft(n ^ 0x1E9485B8, 4), 13), 5), 14);
    }

    private static /* synthetic */ void ntfClinit() {
        IIiImO = "Z\u00a5v\u000e\u00fa\u00ae>tE\u001b\u00ea\u00d4\u00deq\u00b7\u00c0q\u0001\u00f8\u0092\u0016cmY\u00a2\u00f1\u00a7\u0003\u0019\u0091\u00d4\u00c8|?\u00ec\u00ad)\tw\u0011\u00fe\u0007\u00c0P$\u00c8\u0089kJa\u0018\u00a2\u009c\u00d3(Z~?\u00f8\u0001$\u00dfT\u001b^\u00c8|?\u00ec\u00ad)\tm\u0004\u00fd\u00d6\u0013\t\u00f5\u00ac\u0002\\R3\u00a8\u009c\u00f5\"\u000b\u0099\u00a5`V\u00e9N-\u00d1\u008c\u001b\u00144N\u00f7\u008b\u008b\u00c8|?\u00ec\u00ad)\ti\u001e[Z\u0017\u00c8|?\u00ec\u00ad)\tw\u001185\u00c8|?\u00ec\u00ad)\tw'\u0016\u00b5\u00c8|?\u00ec\u00ad)\tN8\u008b\u00c4\u00cf\u0015\u0016\u00d6\u009e\u00c8|?\u00ec\u00ad)\tN8\u00b0\u00e6\u00e6";
        OOp0ln0Im = new int[]{0x40000A, 10878977, 2686995, 9895937, 3932162, 10092556, 4063233, 9043981, 0x5C000C, 5832707, 6815754, 8257537, 14, 7536641, 9961474, 8323082, 7471105, 917531, 7602186, 4128769, 8978433, 4849679};
        mr.P();
        mr.m();
    }

    private static /* synthetic */ CallSite IlOtsj(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = OOp0ln0Im[n2 ^ 0x7ABEB8E2];
        int n7 = n6 >>> 16;
        String string2 = mr.lIIltIOnl(IIiImO.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0x7ABEB8E2);
        n6 = OOp0ln0Im[n3 ^ 0x7ABEB8E2];
        int n8 = n6 >>> 16;
        String string3 = mr.lIIltIOnl(IIiImO.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0x7ABEB8E2);
        n6 = OOp0ln0Im[n4 ^ 0x7ABEB8E2];
        int n9 = n6 >>> 16;
        String string4 = mr.lIIltIOnl(IIiImO.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0x7ABEB8E2);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xAE5852C8) + -178;
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

    private static /* synthetic */ void ooipkqst(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[22];
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
        IIiImO = stringBuilder.toString();
        OOp0ln0Im = nArray;
    }

    private static /* synthetic */ CallSite lIslr(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = OOp0ln0Im[n2 ^ 0x7ABEB8E2];
        int n9 = n8 >>> 16;
        String string2 = mr.lIIltIOnl(IIiImO.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x7ABEB8E2);
        n8 = OOp0ln0Im[n3 ^ 0x7ABEB8E2];
        int n10 = n8 >>> 16;
        String string3 = mr.lIIltIOnl(IIiImO.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x7ABEB8E2);
        n8 = OOp0ln0Im[n4 ^ 0x7ABEB8E2];
        int n11 = n8 >>> 16;
        String string4 = mr.lIIltIOnl(IIiImO.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x7ABEB8E2);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xAE5852C8) + -178;
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

    private static /* synthetic */ CallSite OOspqOrp(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) throws Exception {
        int n9 = OOp0ln0Im[n2 ^ 0x7ABEB8E2];
        int n10 = n9 >>> 16;
        String string2 = mr.lIIltIOnl(IIiImO.substring(n10, n10 + (n9 & 0xFFFF)), n2 ^ 0x7ABEB8E2);
        n9 = OOp0ln0Im[n3 ^ 0x7ABEB8E2];
        int n11 = n9 >>> 16;
        String string3 = mr.lIIltIOnl(IIiImO.substring(n11, n11 + (n9 & 0xFFFF)), n3 ^ 0x7ABEB8E2);
        n9 = OOp0ln0Im[n4 ^ 0x7ABEB8E2];
        int n12 = n9 >>> 16;
        String string4 = mr.lIIltIOnl(IIiImO.substring(n12, n12 + (n9 & 0xFFFF)), n4 ^ 0x7ABEB8E2);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xAE5852C8) + -178;
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

    private static /* synthetic */ String lIIltIOnl(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-46, 7, -57, -84, 18, 99, -83, -117, -97, -3, -23, 44, -114, 77, -96, -112};
        byte[] byArray3 = new byte[]{-42, -54, -123, -113, 61, 98, -32, -97, 112, 10, 77, 29, -24, 56, 45, -68};
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
