/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NXi
 */
package KDFzREm;

import KDFzREm.NF;
import KDFzREm.NXi;
import KDFzREm.dK;
import KDFzREm.kd;
import KDFzREm.kl;
import KDFzREm.kt;
import KDFzREm.kv;
import KDFzREm.uc;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Stream;

public class kG {
    private static short[] y;
    private static short[] L;
    private static byte[] u;
    private static short[] i;
    private static boolean[] R;
    public Object[] N;
    private static /* synthetic */ String Ilmsin0;
    private static /* synthetic */ int[] Ols0t;

    private static /* synthetic */ int L(int n) {
        return Integer.rotateRight(Integer.rotateRight(Integer.rotateRight(Integer.rotateLeft(n, 28), 20), 29), 15) ^ 0x72A1A21D;
    }

    public void L() {
        if (kG.lIsO0n("miie", 371562509, 56509541, 56509507, 56509554, -510392589, 1679417453, (dK)((dK)((Object)kG.lIsO0n("hxpbz", 371562511, 56509548, 56509551, 56509544, -1686435535, 292194563, (kG)this)[kG.lIsO0n("hxpbz", 371562505, 56509548, 56509540, 56509546, 914423164, -686565271)[2]]))) != false) {
            return;
        }
        kG.lIsO0n("ygcfzd", 371562509, 56509541, 56509532, 56509533, -510392589, 1679417453, (dK)((dK)((Object)kG.lIsO0n("pjjtl", 371562511, 56509548, 56509551, 56509544, -2066022863, 1308243677, (kG)this)[kG.lIsO0n("oydvcqr", 371562505, 56509548, 56509540, 56509546, 1049874559, -143419568)[3]])), kt::P);
        kG.lIsO0n("pjjtl", 371562509, 56509541, 56509534, 56509550, -510392589, 1679417453, (dK)((dK)((Object)kG.lIsO0n("igphcwi", 371562511, 56509548, 56509551, 56509544, -786903443, -1637418020, (kG)this)[kG.lIsO0n("zprx", 371562505, 56509548, 56509540, 56509546, -1840015126, 478383494)[4]])));
        kG.lIsO0n("miie", 371562509, 56509567, 56509537, 56509560, -510392589, 1679417453, (uc)((Object)kG.lIsO0n("hxpbz", 371562499, 56509536, 56509537, 56509538, -510392589, 1679417453)), (Object)kG.lIsO0n("zprx", 371562499, 56509565, 56509551, 56509566, -510392589, 1679417453, (NF)((NF)((Object)kG.lIsO0n("zprx", 371562505, 56509539, 56509564, 56509544, -125406407, 343600210)[kG.lIsO0n("whcrkw", 371562505, 56509548, 56509540, 56509546, 1576918659, -1653885750)[5]]))));
    }

    private void M() {
        if (kG.lIsO0n("lhtlxk", 371562511, 56509548, 56509551, 56509544, 371562511, 371562511, (kG)this) == null) {
            kG.lIsO0n("ygcfzd", 371562510, 56509548, 56509551, 56509544, 371562510, 371562510, (kG)this, (Object[])new Object[kG.lIsO0n("whcrkw", 371562505, 56509548, 56509535, 56509528, 371562505, 371562505)[0]]);
            CallSite callSite = kG.lIsO0n("lhtlxk", 371562511, 56509548, 56509551, 56509544, 371562511, 371562511, (kG)this);
        }
    }

    public kG() {
        kG.lIsO0n("whcrkw", 371562509, 56509548, 56509549, 56509550, 371562509, 371562509, (kG)this);
        dK dK2 = new dK();
        kG.lIsO0n("coeuwths", 371562511, 56509548, 56509551, 56509544, 371562511, 371562511, (kG)this)[kG.lIsO0n("igphcwi", 371562505, 56509548, 56509545, 56509546, 371562505, 371562505)[0]] = dK2;
        kl kl2 = new kl(this);
        kG.lIsO0n("coeuwths", 371562511, 56509548, 56509551, 56509544, 371562511, 371562511, (kG)this)[kG.lIsO0n("hxpbz", 371562505, 56509548, 56509545, 56509546, 371562505, 371562505)[1]] = kl2;
    }

    static {
        kG.ntfClinit();
    }

    private static void i() {
        u = new byte[]{2};
    }

    private static void u() {
        i = new short[]{0, 1};
        L = new short[]{1, 0, 1, 0};
        y = new short[]{0, 1, 0, 0, 0, 1, 0, 0};
    }

    private static /* synthetic */ int y(int n) {
        return ((Integer.rotateRight(-n ^ 0xC7B30F35, 17) ^ 0xE54DBEDB) + 1 ^ 0x6689FFBA) + 1;
    }

    public Stream<String> y() {
        return kG.lIsO0n("mlgrrls", 371562498, 56509557, 56509558, 56509559, -510392589, 1679417453, (Stream)((Object)kG.lIsO0n("whcrkw", 371562509, 56509541, 56509563, 56509556, -510392589, 1679417453, (dK)((dK)((Object)kG.lIsO0n("pjjtl", 371562511, 56509548, 56509551, 56509544, -563687138, 1242473061, (kG)this)[kG.lIsO0n("ygcfzd", 371562505, 56509548, 56509540, 56509546, 2022746538, 1462815788)[6]])))), kt::m);
    }

    private void y(kt kt3) {
        kv kv2;
        if (!(kt3 instanceof kv) || kG.lIsO0n("zprx", 371562509, 56509552, 56509553, 56509554, -510392589, 1679417453, (kv)(kv2 = (kv)kt3)) == false) {
            return;
        }
        kG.lIsO0n("lhtlxk", 371562509, 56509541, 56509542, 56509543, -510392589, 1679417453, (dK)((dK)((Object)kG.lIsO0n("oydvcqr", 371562511, 56509548, 56509551, 56509544, -559099084, -918711396, (kG)this)[kG.lIsO0n("zprx", 371562505, 56509548, 56509537, 56509546, -540664548, -516022210)[3]])), kt2 -> {
            kv kv3;
            if (kt2 instanceof kv && kG.lIsO0n("lhtlxk", 371562509, 56509552, 56509553, 56509554, -510392589, 1679417453, (kv)(kv3 = (kv)kt2)) != false && kG.lIsO0n("pjjtl", 371562509, 56509552, 56509540, 56509555, -510392589, 1679417453, (kv)kv3) == kG.lIsO0n("oydvcqr", 371562509, 56509552, 56509540, 56509555, -510392589, 1679417453, (kv)kv2)) {
                kG.lIsO0n("ygcfzd", 371562509, 56509516, 56509517, 56509550, -510392589, 1679417453, (kt)kt2);
                return (boolean)kG.lIsO0n("igphcwi", 371562505, 56509548, 56509553, 56509518, -1626211029, 426195199)[3];
            }
            return (boolean)kG.lIsO0n("igphcwi", 371562505, 56509548, 56509553, 56509518, 268117892, 1900791512)[4];
        });
    }

    public void N(String string, NXi nXi, String string2) {
        kG.lIsO0n("igphcwi", 371562509, 56509548, 56509551, 56509547, -510392589, 1679417453, (kG)this, (kt)new kt(string, nXi, string2));
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateRight(Integer.rotateLeft(Integer.rotateLeft(-Integer.rotateLeft(Integer.rotateRight(n, 31), 24), 31), 10), 1) ^ 0x4F870203;
    }

    public boolean N(String string) {
        CallSite callSite = kG.lIsO0n("coeuwths", 371562509, 56509541, 56509542, 56509543, -510392589, 1679417453, (dK)((dK)((Object)kG.lIsO0n("hxpbz", 371562511, 56509548, 56509551, 56509544, -1083468502, 686883828, (kG)this)[kG.lIsO0n("igphcwi", 371562505, 56509548, 56509540, 56509546, -946748229, -654683833)[0]])), kt2 -> {
            if (kG.lIsO0n("coeuwths", 371562509, 56509504, 56509505, 56509509, -510392589, 1679417453, (String)((Object)kG.lIsO0n("mlgrrls", 371562509, 56509516, 56509510, 56509511, -510392589, 1679417453, (kt)kt2)), (Object)string) != false) {
                kG.lIsO0n("hxpbz", 371562509, 56509516, 56509551, 56509506, -510392589, 1679417453, (kt)kt2, (boolean)kG.lIsO0n("whcrkw", 371562505, 56509548, 56509553, 56509518, -123343046, 2072142281)[0]);
                return (boolean)kG.lIsO0n("pjjtl", 371562505, 56509548, 56509553, 56509518, 565221019, -1556890608)[1];
            }
            return (boolean)kG.lIsO0n("whcrkw", 371562505, 56509548, 56509553, 56509518, 1353876580, 2100123201)[2];
        });
        if (callSite != false) {
            kG.lIsO0n("mlgrrls", 371562509, 56509567, 56509537, 56509560, -510392589, 1679417453, (uc)((Object)kG.lIsO0n("whcrkw", 371562499, 56509536, 56509537, 56509538, -510392589, 1679417453)), (Object)kG.lIsO0n("whcrkw", 371562499, 56509565, 56509551, 56509566, -510392589, 1679417453, (NF)((NF)((Object)kG.lIsO0n("coeuwths", 371562505, 56509539, 56509564, 56509544, 1730269465, -1784023936)[kG.lIsO0n("hxpbz", 371562505, 56509548, 56509540, 56509546, -2004268118, 1545196085)[1]]))));
        }
        return (boolean)callSite;
    }

    public dK N() {
        dK dK2 = new dK();
        kG.lIsO0n("igphcwi", 371562509, 56509541, 56509561, 56509562, 371562509, 371562509, (dK)dK2, (Collection)((Object)((dK)((Object)kG.lIsO0n("igphcwi", 371562511, 56509548, 56509551, 56509544, 371562511, 371562511, (kG)this)[kG.lIsO0n("ygcfzd", 371562505, 56509548, 56509540, 56509546, 371562505, 371562505)[7]]))));
        return dK2;
    }

    public void N(kt kt2) {
        kG.lIsO0n("pjjtl", 371562509, 56509548, 56509540, 56509547, -510392589, 1679417453, (kG)this, (kt)kt2);
        kG.lIsO0n("haecad", 371562509, 56509515, 56509551, 56509547, -510392589, 1679417453, (kd)((kd)((Object)kG.lIsO0n("pjjtl", 371562498, 56509512, 56509513, 56509514, -510392589, 1679417453, (Map)((Map)((Object)kG.lIsO0n("haecad", 371562511, 56509548, 56509551, 56509544, -2101277, 1534445161, (kG)this)[kG.lIsO0n("igphcwi", 371562505, 56509548, 56509537, 56509546, -153461988, -2011172729)[0]])), (Object)kG.lIsO0n("ygcfzd", 371562509, 56509516, 56509551, 56509519, -510392589, 1679417453, (kt)kt2)))), (kt)kt2);
        if (kG.lIsO0n("oydvcqr", 371562509, 56509541, 56509508, 56509509, -510392589, 1679417453, (dK)((dK)((Object)kG.lIsO0n("coeuwths", 371562511, 56509548, 56509551, 56509544, 1983219804, 638166911, (kG)this)[kG.lIsO0n("whcrkw", 371562505, 56509548, 56509537, 56509546, -1778891421, -1732033167)[1]])), (Object)kt2) != false) {
            kG.lIsO0n("ygcfzd", 371562509, 56509567, 56509537, 56509560, -510392589, 1679417453, (uc)((Object)kG.lIsO0n("coeuwths", 371562499, 56509536, 56509537, 56509538, -510392589, 1679417453)), (Object)kG.lIsO0n("mlgrrls", 371562499, 56509565, 56509551, 56509566, -510392589, 1679417453, (NF)((NF)((Object)kG.lIsO0n("haecad", 371562505, 56509539, 56509564, 56509544, 1548075643, 1208379027)[kG.lIsO0n("mlgrrls", 371562505, 56509548, 56509537, 56509546, 2094063839, -846042592)[2]]))));
        }
    }

    private static void R() {
        R = new boolean[]{true, true, false, true, false};
    }

    private static /* synthetic */ void ntfClinit() {
        Ilmsin0 = "(\u00e3\u00e7\u00d4\u00e2\u00a1K\u00be\u0091\u00a4{\u00b1\u0094\u00b4k\u00b8i\u00a4\u00cc\u0085\u00ed\u0090\u0082\u00f2\u00c8\u0093l\u00eb\u00af\u0080x\u00f9\u00d0\u0093$\u00e0\u008e\u00ed\u00c4\u00d1\u0092G\u00be\u0096\u00b3\u00c1\u00ab\u00dd\u00df\u00ac\u00bbK\u00ff\u009a\u00eaF\u00a2\u00c9\u008eq\u00ad&\u0086\u00c1\u00df\u00f5\u00b6\u0005\u00fd\u009c\u00abr\u00f9\u00f4\u0085u\u00af\u001e\u00be\u0090a\u00ae\u00cf\u00ff\u00ef\u00bb(\u0086\u00c1\u00df\u00f5\u00b6\u0005\u00e4\u0089\u00acy\u00f9\u00dd\u0092q\u00a9t\u00a3\u00c4\u00d0\u00ac\u0087X\u00f4\u0099\u00acv\u00b7\u00cf\u0082$\u00e3Zl\u008e\u00ed\u00c4\u00d1\u0092G\u00be\u0099\u008eI\u00be\u00ca\u00ca\u00ea\u00b4l\u00f8\u0098\u00a9q\u00a5\u00e4\u00d7)\u00a8\r\u00ae\u009a\u00dd\u00b2\u00e7\u001f\u00f2\u009c\u00fc&\u00b5\u00d8\u00d2}\u00f3\b\u00a9\u00cd\u008e\u00e2\u00e1K\u00f5\u00cb\u00a4!\u00e1\u00dd\u00d6\u0085L\u00be\u00d9\u00db\u00e2\u00ba\u00ed\u00e3\u00f1\u0085\u00ab\u00db\u008c\u00e3\u00e7\u00d4\u00e2\u00a1K\u00be\u0091\u00a4{\u00b1\u0094\u00a4s\u00ab\u00d7\u00b9\u0090\u000f\u0086\u00c1\u00df\u00f5\u00b6\u0005\u00fd\u009c\u00abr\u00f9\u00f4\u0085u\u00afD\u00be\u0090\u0097\u00d9\u00b3q\u008e\u00ed\u00c4\u00d1\u0092G\u00be\u0096\u0082G\u00e2\u00e3\u00e7\u00d4\u00e2\u00a1K\u00be\u0088\u00b1|\u00ba\u0094\u0094k\u00b8\u00af\u00ab\u00c6\u0091\u00d0\u00a3X\u00f4\u009c\u00a8.\\\u00a5\u00d9\u00fb\u00e2\u00b4B\u00ce\u00e8\u0086\u00e0\u00fa\u00c5\u00adx\u00d4\u0090\u00ea[\u0090\u0080\u00ceS\u0081\u0084\u008c\u00d1\u00ec\u00c6\u00ba\u0005\u00f8\u00b0\u00fe\u009b\u0090U\u0086\u00c1\u00df\u00f5\u00b6\u0005\u00fd\u009c\u00abr\u00f9\u00f4\u0085u\u00af\u001e\u00be\u0090\u0097\u00d5\u0017\u00ab\u00dd\u00df\u00ac\u00a2^\u00f8\u0091\u00eaX\u00b7\u00cb\u009a\u00af\u00c6\u00d1\u00f5\u00b2c\u00f7\u00e0\u008e\u00ed\u00c4\u00d1\u0092G\u00be\u0084(\u0086\u00c1\u00df\u00f5\u00b6\u0005\u00e4\u0089\u00acy\u00f9\u00dd\u0092q\u00a9t\u00a3\u00c4\u00d0\u00ac\u0091_\u00ff\u009e\u00b1|\u00b9\u00d5\u00dc6\u0086j\u00ab\u00dd\u00df\u00ac\u00a2^\u00f8\u0091\u00eaf\u00a2\u00c9\u0082~\u00a7/\u0099\u00df\u00cc\u00e6\u00b6G\u00aa\u00ef\u008e\u00ed\u00c4\u00d1\u0092G\u00be\u0088\u00a6i\u00ed\u00e3\u00e7\u00f5\u00c7\u0091P\u00c3\u00b8\u00a8:\u00a3\u00d8\u00dc\u00a3\u00a6\u00ce\u00df\u00f1p\u00bb\u00de\u00df\u00ef\u00a4Y&\u0088q\u008e\u00ed\u00c4\u00d1\u0092G\u00be\u0096\u00b1\u00b6\u0086\u00c1\u00df\u00f5\u00b6\u0005\u00e4\u0089\u00acy\u00f9\u00dd\u0092q\u00a9\u00ea\u00a3\u00c4\u00d0\u00ac\u0094E\u00ff\u008e\u00b0x\u00b3\u00c9\u00dc6\u009c\u00d1g\u00af\u00df\u00e8\u00e3\u00fd\u00d5\u008e\u00ed\u00c4\u00d1\u0092G\u00be\u0094\u0088\r\u00e3\u00e2\u00d3T\u0099L\u00b9\u00ee\u00d3\u00f3\u00a3S\u0017\u0086\u00e0\u00fa\u00c5\u00adx\u00d4\u0090\u00ea~\u00a2\u0080\u00ceI\u00eaM\u00ab\u00dd\u00df\u00ac\u00a2^\u00f8\u0091\u00eaf\u00a2\u00c9\u0082~\u00a7\b\u0099\u00df\u00cc\u00e6\u00b6G'\u0086\u00c1\u00df\u00f5\u00b6\u0005\u00fd\u009c\u00abr\u00f9\u00f4\u0085u\u00afl\u00be\u0090\u0097\u00cf\u00bdK\u00e7\u009c\u00eay\u00b7\u00d5\u00800\u0085m\u00a0\u00ce\u00dd\u00f7\u00ec'\u0086\u00c1\u00df\u00f5\u00b6\u0005\u00e4\u0089\u00acy\u00f9\u00f8\u0088s\u00a6j\u00a9\u00df\u00d7\u00ec\u00b9\u0011\u00b8\u00a7\u00ab\u00ae\u00cfn\u008e\u00ed\u00c4\u00d1\u0092G\u00be\u00b3\u0083t\u008e\u00ed\u00c4\u00d1\u0092G\u00be\u0096\u00a1";
        Ols0t = new int[]{15007754, 0x1FF0001, 32440323, 35127297, 3997715, 27525121, 0x2000002, 34144271, 14942209, 0x77000A, 22085640, 5636129, 22609929, 29229057, 27590670, 41025546, 8454190, 32636938, 18022426, 26869770, 19857429, 0x500006, 39190553, 0xB00006, 15728667, 35192855, 12124163, 23199800, 2293770, 15663105, 11927555, 33292291, 29425674, 0x1120001, 19726338, 12320787, 21233677, 32243715, 36700198, 41680906, 40828931, 13565973, 11468801, 20, 2949136, 28835846, 1310735, 0x2020007, 17498119, 30081056, 28508165, 32178177, 29294594};
        kG.u();
        kG.i();
        kG.R();
    }

    private static /* synthetic */ CallSite lIsO0n(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = Ols0t[n2 ^ 0x35E446C];
        int n8 = n7 >>> 16;
        String string2 = kG.I10kktm(Ilmsin0.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0x35E446C);
        n7 = Ols0t[n3 ^ 0x35E446C];
        int n9 = n7 >>> 16;
        String string3 = kG.I10kktm(Ilmsin0.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0x35E446C);
        n7 = Ols0t[n4 ^ 0x35E446C];
        int n10 = n7 >>> 16;
        String string4 = kG.I10kktm(Ilmsin0.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0x35E446C);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x162598BB) + -178;
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

    private static /* synthetic */ void l1ikti(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[53];
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
        Ilmsin0 = stringBuilder.toString();
        Ols0t = nArray;
    }

    private static /* synthetic */ CallSite I1qkt(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) throws Exception {
        int n9 = Ols0t[n2 ^ 0x35E446C];
        int n10 = n9 >>> 16;
        String string2 = kG.I10kktm(Ilmsin0.substring(n10, n10 + (n9 & 0xFFFF)), n2 ^ 0x35E446C);
        n9 = Ols0t[n3 ^ 0x35E446C];
        int n11 = n9 >>> 16;
        String string3 = kG.I10kktm(Ilmsin0.substring(n11, n11 + (n9 & 0xFFFF)), n3 ^ 0x35E446C);
        n9 = Ols0t[n4 ^ 0x35E446C];
        int n12 = n9 >>> 16;
        String string4 = kG.I10kktm(Ilmsin0.substring(n12, n12 + (n9 & 0xFFFF)), n4 ^ 0x35E446C);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x162598BB) + -178;
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

    private static /* synthetic */ String I10kktm(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{5, 10, -95, -82, 34, -19, 58, 63, 16, -64, 5, 120, -101, -59, 32, -49};
        byte[] byArray3 = new byte[]{5, -38, 91, 21, 86, -35, 50, 92, 97, -19, 30, -118, 118, -89, 9, -47};
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
