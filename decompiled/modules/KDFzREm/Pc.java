/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NGa
 *  KDFzREm.NNNwS
 *  KDFzREm.NNuU
 *  KDFzREm.NQl
 *  KDFzREm.NQo
 *  KDFzREm.NbL
 */
package KDFzREm;

import KDFzREm.NGa;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NQl;
import KDFzREm.NQo;
import KDFzREm.NbL;
import KDFzREm.Ry;
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

@UZ(L="AutoFish", y=UR.PLAYER, N=Uz.AUTO)
public class Pc
extends UM {
    public Object[] L;
    private static short[] u;
    private static byte[] i;
    private static boolean[] R;
    private static short[] M;
    private static /* synthetic */ String lIptqnpj;
    private static /* synthetic */ int[] IIlqlkn;

    private static /* synthetic */ int L(int n) {
        return -Integer.rotateLeft(Integer.rotateLeft(Integer.rotateRight(-Integer.rotateLeft(n, 27), 25) ^ 0x5452B8D, 17), 4);
    }

    private static void P() {
        R = new boolean[]{false, false, true, true, false, false};
    }

    private static void T() {
        i = new byte[]{30, 10};
    }

    public Pc() {
        Pc.l1tqsnq("akyvtj", 553335967, -1703938407, -1703938408, -1703938405, 553335967, 553335967, (Pc)this);
        CallSite callSite = Pc.l1tqsnq("tfjy", 553335953, -1703938418, -1703938429, -1703938430, 553335953, 553335953, (int)Pc.l1tqsnq("ewjgt", 553335963, -1703938407, -1703938406, -1703938403, 553335963, 553335963)[0]);
        Pc.l1tqsnq("hocy", 553335965, -1703938407, -1703938417, -1703938401, 553335965, 553335965, (Pc)this)[Pc.l1tqsnq("ewjgt", 553335963, -1703938407, -1703938402, -1703938415, 553335963, 553335963)[0]] = callSite;
    }

    static {
        Pc.ntfClinit();
    }

    private static void s() {
        M = new short[]{0, 0};
        u = new short[]{4, 0, 4, 2, 0, 0, 0, 0};
    }

    private void m() {
        if (Pc.l1tqsnq("hcur", 553335965, -1703938407, -1703938417, -1703938401, 553335965, 553335965, (Pc)this) == null) {
            Pc.l1tqsnq("zyhytt", 553335964, -1703938407, -1703938417, -1703938401, 553335964, 553335964, (Pc)this, (Object[])new Object[Pc.l1tqsnq("zyhytt", 553335963, -1703938407, -1703938406, -1703938403, 553335963, 553335963)[3]]);
            CallSite callSite = Pc.l1tqsnq("hocy", 553335965, -1703938407, -1703938417, -1703938401, 553335965, 553335965, (Pc)this);
            callSite[Pc.l1tqsnq("eecbr", 553335963, -1703938407, -1703938406, -1703938403, 553335963, 553335963)[4]] = Pc.l1tqsnq("mgdtdrud", 553335953, -1703938418, -1703938429, -1703938430, 553335953, 553335953, (int)Pc.l1tqsnq("hcur", 553335963, -1703938407, -1703938406, -1703938403, 553335963, 553335963)[5]);
        }
    }

    private static /* synthetic */ int y(int n) {
        return Integer.rotateRight(Integer.rotateLeft(Integer.rotateLeft((n ^ 0xB1A75274) + 1, 22), 20), 27);
    }

    private void N(NbL nbL, int n) {
        Pc.l1tqsnq("aotxaf", 553335967, -1703938407, -1703938408, -1703938405, -1490761255, 155186605, (Pc)this);
        if (Pc.l1tqsnq("tfjy", 553335967, -1703938418, -1703938431, -1703938432, -1490761255, 155186605, (Integer)((Object)Pc.l1tqsnq("iuudp", 553335965, -1703938407, -1703938417, -1703938401, 1439013206, -1501991427, (Pc)this)[Pc.l1tqsnq("arfdg", 553335963, -1703938407, -1703938414, -1703938415, -1955785176, -1088531176)[6]])) < 0) {
            Pc.l1tqsnq("eecbr", 553335953, -1703938376, -1703938422, -1703938373, -1490761255, 155186605, (NbL)nbL);
            CallSite callSite = Pc.l1tqsnq("aotxaf", 553335953, -1703938418, -1703938429, -1703938430, -1490761255, 155186605, n);
            Pc.l1tqsnq("iuudp", 553335965, -1703938407, -1703938417, -1703938401, -1030206300, -224065578, (Pc)this)[Pc.l1tqsnq("eecbr", 553335963, -1703938407, -1703938414, -1703938415, 1236624250, -916465163)[7]] = callSite;
        }
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateRight((Integer.rotateRight(Integer.rotateLeft(n ^ 0xAF4C7A36, 7) ^ 0x27C8CC77, 22) ^ 0x214FC1BA) + 1, 30);
    }

    /*
     * WARNING - void declaration
     */
    @uF
    public void N(Ry ry) {
        void var4_5;
        Pc.l1tqsnq("mgdtdrud", 553335967, -1703938407, -1703938408, -1703938405, -1490761255, 155186605, (Pc)this);
        NbL[] nbLArray = NbL.values();
        int n = nbLArray.length;
        CallSite callSite = Pc.l1tqsnq("hcur", 553335963, -1703938407, -1703938406, -1703938403, 927813104, -694569919)[1];
        while (var4_5 < n) {
            NbL nbL = nbLArray[var4_5];
            if (Pc.l1tqsnq("tfjy", 553335967, -1703938421, -1703938422, -1703938419, -1490761255, 155186605, (NQo)Pc.l1tqsnq("aotxaf", 553335967, -1703938411, -1703938412, -1703938409, -1490761255, 155186605, (NNNwS)((NNNwS)Pc.l1tqsnq("arfdg", 553335965, -1703938416, -1703938413, -1703938401, -1146791040, -456673886, (NNuU)((NNuU)Pc.l1tqsnq("arfdg", 553335965, -1703938407, -1703938404, -1703938401, -1131434547, 299048618, (Pc)this)[Pc.l1tqsnq("hocy", 553335963, -1703938407, -1703938402, -1703938415, 1870103860, 1532427692)[1]]))[Pc.l1tqsnq("hocy", 553335963, -1703938407, -1703938414, -1703938415, -430859359, -786516929)[0]]), (NbL)nbL), (NQl)Pc.l1tqsnq("hocy", 553335963, -1703938410, -1703938423, -1703938424, -510698739, -147497793)) != false) {
                NGa nGa = (NGa)Pc.l1tqsnq("aotxaf", 553335965, -1703938411, -1703938420, -1703938401, 1011791240, -1648491446, (NNNwS)((NNNwS)Pc.l1tqsnq("arfdg", 553335965, -1703938416, -1703938413, -1703938401, 748648052, -1963362669, (NNuU)((NNuU)Pc.l1tqsnq("iuudp", 553335965, -1703938407, -1703938404, -1703938401, -1670025819, 1946993209, (Pc)this)[Pc.l1tqsnq("hocy", 553335963, -1703938407, -1703938414, -1703938415, 1301304513, 760209579)[1]]))[Pc.l1tqsnq("tfjy", 553335963, -1703938407, -1703938414, -1703938415, 580920591, -1730091845)[2]]))[Pc.l1tqsnq("mgdtdrud", 553335963, -1703938407, -1703938414, -1703938415, -81981972, -2108632469)[3]];
                Pc pc = this;
                CallSite callSite2 = Pc.l1tqsnq("rrxqsmkw", 553335953, -1703938418, -1703938429, -1703938430, -1490761255, 155186605, (int)(Pc.l1tqsnq("rrxqsmkw", 553335967, -1703938418, -1703938431, -1703938432, -1490761255, 155186605, (Integer)((Object)Pc.l1tqsnq("akyvtj", 553335965, -1703938407, -1703938417, -1703938401, -1420937671, -1090888547, (Pc)pc)[Pc.l1tqsnq("eecbr", 553335963, -1703938407, -1703938414, -1703938415, 2013465722, 1791453016)[4]])) - Pc.l1tqsnq("arfdg", 553335963, -1703938407, -1703938406, -1703938403, -404743795, -533983663)[2]));
                Pc.l1tqsnq("zyhytt", 553335965, -1703938407, -1703938417, -1703938401, -592242826, -1989054385, (Pc)pc)[Pc.l1tqsnq("tfjy", 553335963, -1703938407, -1703938414, -1703938415, -1519311275, -337925097)[5]] = callSite2;
                if (nGa == null) {
                    Pc.l1tqsnq("hocy", 553335967, -1703938407, -1703938422, -1703938425, -1490761255, 155186605, (Pc)this, (NbL)nbL, (int)Pc.l1tqsnq("iuudp", 553335963, -1703938407, -1703938427, -1703938428, -958929619, -2091544523)[0]);
                    return;
                }
                if (Pc.l1tqsnq("tfjy", 553335965, -1703938426, -1703938422, -1703938375, 1831561852, -1043938506, (NGa)nGa) == false) {
                    return;
                }
                Pc.l1tqsnq("hcur", 553335967, -1703938407, -1703938422, -1703938425, -1490761255, 155186605, (Pc)this, (NbL)nbL, (int)Pc.l1tqsnq("ewjgt", 553335963, -1703938407, -1703938427, -1703938428, -1678597113, -1544723630)[1]);
                break;
            }
            ++var4_5;
        }
    }

    private static /* synthetic */ void ntfClinit() {
        lIptqnpj = "u\u0092j\u0084+\u00c8D\u00ca\u00c4;\u00ba\tO\u00a8\u00f9JM\u00aa;-\u009aF\u009f\u000f\u00ec\u0006\u0089\u00eb\u0004\u00bc\u00bb\u00f7I\u00d8\u009aF\u009f\u000f\u00ec\u0006\u0089\u00eb\u001b\u00a8s\u00cd\u0092K\u00a1\u001b\u00d39\u00e3\u00c8z\u0093DL\u00f1\u00da\u0006\u00b3\u0001\u00bfl\u00908\u00e6\rb\u00bfv\u0084r\u00c5\n\u00c8\u00c2z\u0094Ht\u00af\u00f4Jz\u00f2\u009aF\u009f\u000f\u00ec\u0006\u0089\u00d2\f\u00e7\u00f6\u009aF\u009f\u000f\u00ec\u0006\u0089\u00f56}\u0092K\u00a1\u001b\u00d39\u00e3\u00c8z\u0093wl\u00f1\u00ba7G\u009aF\u009f\u000f\u00ec\u0006\u0089\u00eb\u001b\u0093QS\u000e\u0084\u0094\u00f7V\u00f7\u009aF\u009f\u000f\u00ec\u0006\u0089\u00eb\u0004\u00b2b\u008a\u009c\u00bc\u00bbt\u008d2\u00cd4\u0093\u009cl\u00e5\u00cd\u0092K\u00a1\u001b\u00d39\u00e3\u00c8z\u0093DL\u00f1\u00bac\u00ae\u009aF\u009f\u000f\u00ec\u0006\u0089\u00eb\u0004\u00b2\u001dnq\u00b7e\u00899\u00da4\u0093\u00923\u00bc\u00153\u00fb\u00a2\u000f'\u00bb9\u0081n\u00ccR\u00c4\u009dm\u00eeB0\u00f3\u00a1_%\u00e71\u00dc?\u00cf^\u00c7\u0094\u0092K\u00a1\u001b\u00d39\u00e3\u00c8z\u0093DL\u00f1\u00baS\u009c\u00f5\u0095D\u00a3'\u00fb.\u00cb\u008a\u001b\u008cJ;u(\u0097)\u00a97\u00c8\u001d\u00c7\u008a9\u00bcHg\u00e5\u00dakt\u00bbg\u0080/\u0092\u00d4\u00d7\u00acEe#a\u008dS\u00b0t\u00b3<\u00c5\u001e\u00c3\u0080-\u009aF\u009f\u000f\u00ec\u0006\u0089\u00eb\u0012\u00bc";
        IIlqlkn = new int[]{6357002, 0x1200001, 9043971, 0x1300001, 0x880002, 12713985, 19, 19070977, 19267586, 2162700, 19202049, 0x1090001, 8060941, 0x9B000B, 10879004, 1245195, 0x1210002, 16515085, 9240587, 16449537, 7012368, 12779560, 9961473, 4522001, 19398664, 1966083, 4063239, 17432598, 19136513, 0x990002, 2949137, 19988491, 0x600001, 5636106, 15400976};
        Pc.s();
        Pc.T();
        Pc.P();
    }

    private static /* synthetic */ CallSite l1tqsnq(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = IIlqlkn[n2 ^ 0x9A6FF699];
        int n8 = n7 >>> 16;
        String string2 = Pc.llmttIrt(lIptqnpj.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0x9A6FF699);
        n7 = IIlqlkn[n3 ^ 0x9A6FF699];
        int n9 = n7 >>> 16;
        String string3 = Pc.llmttIrt(lIptqnpj.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0x9A6FF699);
        n7 = IIlqlkn[n4 ^ 0x9A6FF699];
        int n10 = n7 >>> 16;
        String string4 = Pc.llmttIrt(lIptqnpj.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0x9A6FF699);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x20FB3C29) + -178;
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

    private static /* synthetic */ CallSite lIqskkI0(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = IIlqlkn[n2 ^ 0x9A6FF699];
        int n9 = n8 >>> 16;
        String string2 = Pc.llmttIrt(lIptqnpj.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x9A6FF699);
        n8 = IIlqlkn[n3 ^ 0x9A6FF699];
        int n10 = n8 >>> 16;
        String string3 = Pc.llmttIrt(lIptqnpj.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x9A6FF699);
        n8 = IIlqlkn[n4 ^ 0x9A6FF699];
        int n11 = n8 >>> 16;
        String string4 = Pc.llmttIrt(lIptqnpj.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x9A6FF699);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x20FB3C29) + -178;
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

    private static /* synthetic */ void lIpjrnki(String[] stringArray) {
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
        lIptqnpj = stringBuilder.toString();
        IIlqlkn = nArray;
    }

    private static /* synthetic */ String llmttIrt(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-36, -48, -53, 57, -44, -26, 101, -85, 14, -119, 13, -14, -70, 97, 79, 96};
        byte[] byArray3 = new byte[]{27, 71, -8, -51, -15, 21, 66, -29, 105, -73, -49, -39, 80, -112, 98, -57};
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
