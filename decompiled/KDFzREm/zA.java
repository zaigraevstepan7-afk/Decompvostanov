/*
 * Decompiled with CFR 0.152.
 */
package KDFzREm;

import KDFzREm.NF;
import KDFzREm.uc;
import KDFzREm.zF;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class zA {
    private static short[] y;
    private static short[] L;
    private static boolean[] u;
    public Object[] N;
    private static /* synthetic */ String ooqmOr;
    private static /* synthetic */ int[] llmsit;

    private static /* synthetic */ int L(int n) {
        return Integer.rotateLeft(Integer.rotateRight(-Integer.rotateRight(-Integer.rotateRight(n, 19), 16), 3) ^ 0x7E6FCEC3, 31);
    }

    public List<zF> L() {
        return zA.l1Isrp("iuciln", -15972701, 113335462, 113335461, 113335460, -15972701, -15972701, (Collection)((Object)zA.l1Isrp("iuciln", -15972702, 113335430, 113335464, 113335463, -15972702, -15972702, (Map)((Map)((Object)zA.l1Isrp("nunxra", -15972689, 113335436, 113335438, 113335433, -15972689, -15972689, (zA)this)[zA.l1Isrp("dqmj", -15972695, 113335436, 113335432, 113335431, -15972695, -15972695)[5]])))));
    }

    public Optional<zF> L(String string) {
        return zA.l1Isrp("ucoxnvxk", -15972701, 113335469, 113335468, 113335467, 1423208235, 1808609198, (Object)((zF)((Object)zA.l1Isrp("ucoxnvxk", -15972702, 113335430, 113335470, 113335452, 1423208235, 1808609198, (Map)((Map)((Object)zA.l1Isrp("wxqd", -15972689, 113335436, 113335438, 113335433, 619614607, -323664545, (zA)this)[zA.l1Isrp("ivwgngt", -15972695, 113335436, 113335432, 113335431, 375806034, 2036138952)[2]])), (Object)string))));
    }

    public zA() {
        zA.l1Isrp("cxujdmze", -15972691, 113335436, 113335424, 113335455, -15972691, -15972691, (zA)this);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        zA.l1Isrp("ivwgngt", -15972689, 113335436, 113335438, 113335433, -15972689, -15972689, (zA)this)[zA.l1Isrp("cxujdmze", -15972695, 113335436, 113335454, 113335431, -15972695, -15972695)[0]] = linkedHashMap;
    }

    static {
        zA.ntfClinit();
    }

    private static void i() {
        y = new short[]{0, 0, 0, 2, 0, 2, 0, 0};
        L = new short[]{2, 0, 0, 0, 0, 0};
    }

    private static void u() {
        u = new boolean[]{false, true, true, false, true, false, true};
    }

    public boolean y(String string) {
        return (boolean)zA.l1Isrp("iuciln", -15972702, 113335430, 113335440, 113335471, 1423208235, 1808609198, (Map)((Map)((Object)zA.l1Isrp("woegin", -15972689, 113335436, 113335438, 113335433, 812255189, 1575633319, (zA)this)[zA.l1Isrp("dqmj", -15972695, 113335436, 113335432, 113335431, 634094225, -871741685)[1]])), (Object)string);
    }

    public void y() {
        if (zA.l1Isrp("kakin", -15972702, 113335430, 113335443, 113335442, 1423208235, 1808609198, (Map)((Map)((Object)zA.l1Isrp("lqxezqyt", -15972689, 113335436, 113335438, 113335433, -812389022, -1362963687, (zA)this)[zA.l1Isrp("ivwgngt", -15972695, 113335436, 113335454, 113335431, 413667860, -136941481)[6]]))) != false) {
            return;
        }
        zA.l1Isrp("kakin", -15972702, 113335430, 113335441, 113335455, 1423208235, 1808609198, (Map)((Map)((Object)zA.l1Isrp("mawepu", -15972689, 113335436, 113335438, 113335433, -1208805527, 1668720584, (zA)this)[zA.l1Isrp("wxqd", -15972695, 113335436, 113335454, 113335431, -1399687489, 240252752)[7]])));
        zA.l1Isrp("woegin", -15972691, 113335445, 113335432, 113335444, 1423208235, 1808609198, (uc)((Object)zA.l1Isrp("fhcb", -15972701, 113335451, 113335432, 113335450, 1423208235, 1808609198)), (Object)zA.l1Isrp("ivwgngt", -15972701, 113335447, 113335438, 113335446, 1423208235, 1808609198, (NF)((NF)((Object)zA.l1Isrp("mawepu", -15972695, 113335449, 113335448, 113335433, -1368903205, -1710425490)[zA.l1Isrp("fhcb", -15972695, 113335436, 113335432, 113335431, 2098314920, 1059835069)[0]]))));
    }

    private static /* synthetic */ int y(int n) {
        return Integer.rotateRight(Integer.rotateRight(n, 2) ^ 0x7FA3D898, 7);
    }

    public boolean N(String string, String string2, int n) {
        if (zA.l1Isrp("fhcb", -15972702, 113335430, 113335440, 113335471, 1423208235, 1808609198, (Map)((Map)((Object)zA.l1Isrp("mawepu", -15972689, 113335436, 113335438, 113335433, 1801710807, 1882862104, (zA)this)[zA.l1Isrp("dqmj", -15972695, 113335436, 113335454, 113335431, -621282578, 1069929277)[1]])), (Object)string) != false) {
            return (boolean)zA.l1Isrp("kakin", -15972695, 113335436, 113335435, 113335434, 1010566220, 1062655038)[0];
        }
        zA.l1Isrp("kakin", -15972702, 113335430, 113335466, 113335465, 1423208235, 1808609198, (Map)((Map)((Object)zA.l1Isrp("iuciln", -15972689, 113335436, 113335438, 113335433, 2071599070, -966391892, (zA)this)[zA.l1Isrp("nunxra", -15972695, 113335436, 113335454, 113335431, -1647275002, -629487685)[2]])), (Object)string, (Object)new zF(string, string2, n));
        zA.l1Isrp("cxujdmze", -15972691, 113335445, 113335432, 113335444, 1423208235, 1808609198, (uc)((Object)zA.l1Isrp("fhcb", -15972701, 113335451, 113335432, 113335450, 1423208235, 1808609198)), (Object)zA.l1Isrp("cxujdmze", -15972701, 113335447, 113335438, 113335446, 1423208235, 1808609198, (NF)((NF)((Object)zA.l1Isrp("ywdb", -15972695, 113335449, 113335448, 113335433, -1739946356, 848842072)[zA.l1Isrp("rxgd", -15972695, 113335436, 113335454, 113335431, 684740806, -70022780)[3]]))));
        return (boolean)zA.l1Isrp("fjbpbjb", -15972695, 113335436, 113335435, 113335434, -1834962891, -383784458)[1];
    }

    public Stream<String> N() {
        return zA.l1Isrp("lqxezqyt", -15972702, 113335427, 113335426, 113335425, 1423208235, 1808609198, (Set)((Object)zA.l1Isrp("wxqd", -15972702, 113335430, 113335429, 113335428, 1423208235, 1808609198, (Map)((Map)((Object)zA.l1Isrp("lqxezqyt", -15972689, 113335436, 113335438, 113335433, 521115336, -492750008, (zA)this)[zA.l1Isrp("ucoxnvxk", -15972695, 113335436, 113335432, 113335431, 1002706974, -855461317)[4]])))));
    }

    public List<zF> N(int n) {
        return zA.l1Isrp("wxqd", -15972702, 113335458, 113335487, 113335486, 1423208235, 1808609198, (Stream)((Object)zA.l1Isrp("fjbpbjb", -15972702, 113335458, 113335457, 113335456, 1423208235, 1808609198, (Stream)((Object)zA.l1Isrp("fjbpbjb", -15972702, 113335459, 113335426, 113335425, 1423208235, 1808609198, (Collection)((Object)zA.l1Isrp("dqmj", -15972702, 113335430, 113335464, 113335463, 1423208235, 1808609198, (Map)((Map)((Object)zA.l1Isrp("ucoxnvxk", -15972689, 113335436, 113335438, 113335433, -1639841657, -1255826592, (zA)this)[zA.l1Isrp("woegin", -15972695, 113335436, 113335432, 113335431, -162242333, -876280120)[3]])))))), zF2 -> (boolean)(zA.l1Isrp("ivwgngt", -15972691, 113335439, 113335438, 113335437, 1423208235, 1808609198, (zF)zF2) == n ? zA.l1Isrp("lqxezqyt", -15972695, 113335436, 113335435, 113335434, 2079118227, 1202766810)[4] : zA.l1Isrp("iuciln", -15972695, 113335436, 113335435, 113335434, -1579784053, -1440599715)[5]))));
    }

    public boolean N(String string) {
        CallSite callSite;
        CallSite callSite2 = zA.l1Isrp("woegin", -15972702, 113335430, 113335453, 113335452, 1423208235, 1808609198, (Map)((Map)((Object)zA.l1Isrp("ucoxnvxk", -15972689, 113335436, 113335438, 113335433, -450126750, -261499109, (zA)this)[zA.l1Isrp("wxqd", -15972695, 113335436, 113335454, 113335431, -520588555, -1832878268)[4]])), (Object)string) != null ? zA.l1Isrp("iuciln", -15972695, 113335436, 113335435, 113335434, 1479321009, 448809484)[2] : (callSite = zA.l1Isrp("mawepu", -15972695, 113335436, 113335435, 113335434, -989709147, 1442658035)[3]);
        if (callSite != false) {
            zA.l1Isrp("ywdb", -15972691, 113335445, 113335432, 113335444, 1423208235, 1808609198, (uc)((Object)zA.l1Isrp("kakin", -15972701, 113335451, 113335432, 113335450, 1423208235, 1808609198)), (Object)zA.l1Isrp("ywdb", -15972701, 113335447, 113335438, 113335446, 1423208235, 1808609198, (NF)((NF)((Object)zA.l1Isrp("lqxezqyt", -15972695, 113335449, 113335448, 113335433, 1134320618, 242518559)[zA.l1Isrp("ucoxnvxk", -15972695, 113335436, 113335454, 113335431, 997329967, 905471406)[5]]))));
        }
        return (boolean)callSite;
    }

    private void R() {
        if (zA.l1Isrp("kakin", -15972689, 113335436, 113335438, 113335433, -15972689, -15972689, (zA)this) == null) {
            zA.l1Isrp("ucoxnvxk", -15972690, 113335436, 113335438, 113335433, -15972690, -15972690, (zA)this, (Object[])new Object[zA.l1Isrp("iuciln", -15972695, 113335436, 113335435, 113335434, -15972695, -15972695)[6]]);
            CallSite callSite = zA.l1Isrp("ucoxnvxk", -15972689, 113335436, 113335438, 113335433, -15972689, -15972689, (zA)this);
        }
    }

    private static /* synthetic */ void ntfClinit() {
        ooqmOr = "E$\u00ab\rd\u009d,\u00ef.\u008ak\u00bf-\u00e60z>\u0012\u008dC$\u00bd2\u00eb*zs\u000b\u009c\r~\u00c9\u00a3t#\u000el\u009cw\u00d9(i9\u001f\u0085_\u00a6($\u00b8HA\u00ba\u001c\u00cc&I\u0019\u0013\u00c7*T\u00dd\u00f9L\u00ba$K\u008b\n\u00cf1453\u00d37^\u0091x\u0085\u00fcb\u0081!\u00c5:\u00e4A\u009b9\u00fc=40\u001f\u0086\u0003=\u00a9\u00b2j\u00d9\u00afy\u00caq\u00c66z*\u001f\u00c7\u0011f\u008f\u00bc/\u00f3\u00bcy\u00987\u00e4=wgrh\u009c7\u00fc9\ba\u00949\u00f8D$\u00bd2\u00eb*zs\u000b\u009c\r~\u00c9\u0093o\u009d\u0000h\u0092,\u00e33ug\u00ebl\u00879\u00a5)o5\u0012\u00c7'}\u008a\u00bce\u00df\u00f5d\u009e6q\u00c9$\u00bd\u0013\u00ce\u001aa\u000e;\u0085Kg\u0085\u00eb'I\u00b7\"\u00d8\u0019vs\u0017\u00a5\u00f4h\u0088\u000b\u00ef(,I\u00b7\"\u00d8\u0019vs0\u00ae\u008eI\u00b7\"\u00d8\u0019vs\u0004\u00ae\u001ey\u0083=\u00eb1\u0095A\u009b9\u00fc=4)\n\u0081\b=\u0080\u00a5n2\u00c9d\u009e6\u00a5\fi9\u001a\u0081\u0007s\u0092\u00b5;x\u00f1g\u0090.\u00ebsn(\u0017\u0084Ka\u0092\u00a2e0\u00d0\"\u00a2,\u00f89z1E\u00b1b\u00bd1\u00f9(\u00ed$\u00a7\u00deb\u009f,\u00eb5u/5\u008d\u001d\u00ebl\u00879\u00a5)o5\u0012\u00c77w\u0092\u0091\u00f6$\u00bd2\u00eb*zs\u000b\u009c\r~\u00c9\u0083e\u008c\u00e5OA\u009b9\u00fc=40\u001f\u0086\u0003=\u00a9\u00b2j4\u0004y\u00ca\u0014\u00e0=m=Q\u0084\u0005|\u0081\u00ffO3\rh\u0092,\u00b1uW6\u001f\u009e\u0005=\u008a\u00b1n6HB\u00932\u00ef?ogKl\u009d-\u00ef/\u00b9Ny\u0090,\u00e3?]5\u001b\u0084\u0000a\u00b9\u00e063\ni\u00c0;\u00bbl.?\u001f\u00d1Wq\u0085\u00e5bh\u000fn\u0097h\u00ebjz8H\u0089P%\u0080\u00e1\u00aeI\u00b7\"\u00d8\u0019vs\u0004\u00a9\u00f6A\u009b9\u00fc=40\u001f\u0086\u0003=\u00a9\u00b2j\u009d\u00bdy\u00caq\u00dc\u0007l\u00879\u00a5)o5\u0012\u00c7\u0017f\u0094\u00b5a\u00d1B^\u0085*\u00ef=v\u00f6A\u009b9\u00fc=4)\n\u0081\b=\u00a5\u00bfl\u0094\u00bbn\u00851\u00e52 u2\u0082\u0005d\u0087\u00ffu\u008c\u00b7a\u00de\u0014\u00e3/og\nl\u00879\u00a5)o5\u0012\u00c7)s\u0096\u00d4I\u00b7\"\u00d8\u0019vs\u000b\u008b\u00baW\u00c0$\u00bd2\u00eb*zs\u000b\u009c\r~\u00c9\u009ci\u0082\u009c6\u008fh\u0085\u00e8~\u00b45\u00fa(b<A\u009b9\u00fc=40\u001f\u0086\u0003=\u00a9\u00b2j4\u0004y\u00ca\u00edA\u009b9\u00fc=40\u001f\u0086\u0003=\u00a9\u00b2j\u0094\u00a6y\u00caq\u00d0\u00ef\u0087I\u00b7\"\u00d8\u0019vs\u0007jl\u00879\u00a5)o5\u0012\u00c7+b\u0092\u00b9o\u0096aa\nl\u00879\u00a5)o5\u0012\u00c7({\u0095\u00a4\u00cdA\u009b9\u00fc=40\u001f\u0086\u0003=\u00a9\u00b2j\u009d\u0086y\u00caq\u00c66z*\u001f\u00c7\bs\u0088\u00b7/\u00b7\u0087g\u0094;\u00feg";
        llmsit = new int[]{14614538, 3014657, 3080195, 29884426, 0x1990001, 37552130, 39518227, 11927553, 4980738, 36044813, 13565958, 21626897, 20709389, 15269894, 1245211, 42139649, 19791875, 21561345, 8323078, 44892198, 42205193, 11993102, 13959178, 26869806, 12910602, 3276826, 36896778, 30539797, 39059463, 3, 0x850005, 19988491, 40763413, 38862851, 42795026, 589834, 5701672, 5111811, 22741048, 26411014, 9043992, 43974670, 5308422, 33423400, 10616852, 31916055, 196614, 15663161, 19398662, 37683218};
        zA.i();
        zA.u();
    }

    private static /* synthetic */ void lImsimm0j(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[50];
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
        ooqmOr = stringBuilder.toString();
        llmsit = nArray;
    }

    private static /* synthetic */ CallSite l1siknq(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = llmsit[n2 ^ 0x6C15C8F];
        int n9 = n8 >>> 16;
        String string2 = zA.IIjqql(ooqmOr.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x6C15C8F);
        n8 = llmsit[n3 ^ 0x6C15C8F];
        int n10 = n8 >>> 16;
        String string3 = zA.IIjqql(ooqmOr.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x6C15C8F);
        n8 = llmsit[n4 ^ 0x6C15C8F];
        int n11 = n8 >>> 16;
        String string4 = zA.IIjqql(ooqmOr.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x6C15C8F);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xFF0C461B) + -178;
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

    private static /* synthetic */ String IIjqql(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-50, -82, 2, 43, -91, 47, 11, 115, 81, 38, 79, 16, -87, -93, -94, -13};
        byte[] byArray3 = new byte[]{-62, -126, 79, 62, -89, 94, 93, -120, 59, 7, -97, -85, -38, 62, -124, 87};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite l1Isrp(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = llmsit[n2 ^ 0x6C15C8F];
        int n8 = n7 >>> 16;
        String string2 = zA.IIjqql(ooqmOr.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0x6C15C8F);
        n7 = llmsit[n3 ^ 0x6C15C8F];
        int n9 = n7 >>> 16;
        String string3 = zA.IIjqql(ooqmOr.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0x6C15C8F);
        n7 = llmsit[n4 ^ 0x6C15C8F];
        int n10 = n7 >>> 16;
        String string4 = zA.IIjqql(ooqmOr.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0x6C15C8F);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xFF0C461B) + -178;
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

    private static /* synthetic */ CallSite l1lkisnr(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = llmsit[n2 ^ 0x6C15C8F];
        int n9 = n8 >>> 16;
        String string2 = zA.IIjqql(ooqmOr.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x6C15C8F);
        n8 = llmsit[n3 ^ 0x6C15C8F];
        int n10 = n8 >>> 16;
        String string3 = zA.IIjqql(ooqmOr.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x6C15C8F);
        n8 = llmsit[n4 ^ 0x6C15C8F];
        int n11 = n8 >>> 16;
        String string4 = zA.IIjqql(ooqmOr.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x6C15C8F);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xFF0C461B) + -178;
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
