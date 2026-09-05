/*
 * Decompiled with CFR 0.152.
 */
package KDFzREm;

import KDFzREm.do;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.OptionalDouble;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class kE {
    private static long[] y;
    private static short[] L;
    private static short[] u;
    private static boolean[] i;
    private static short[] R;
    private static float[] M;
    public Object[] N;
    private static short[] B;
    private static short[] Z;
    private static byte[] z;
    private static /* synthetic */ String lOrm0p;
    private static /* synthetic */ int[] lIOilIs;

    public void L() {
        CallSite callSite = kE.I1mOkq("adheossv", 666212407, 1997735563, 1997735562, 1997735561, 1425450611);
        float f = (float)(callSite - kE.I1mOkq("yglgc", 666212409, 1997735568, 1997735613, 1997735561, 1425450611, (Long)((Long)((Object)kE.I1mOkq("grknnc", 666212411, 1997735583, 1997735582, 1997735581, -1506745669, (kE)this)[kE.I1mOkq("tymecwgb", 666212413, 1997735583, 1997735614, 1997735579, 588609388)[3]])))) / kE.I1mOkq("jgsjrc", 666212413, 1997735583, 1997735612, 1997735611, -567326257)[1];
        if (f > kE.I1mOkq("ebcgvrrn", 666212413, 1997735583, 1997735612, 1997735611, -1096665872)[2]) {
            long l = (long)kE.I1mOkq("adheossv", 666212407, 1997735610, 1997735582, 1997735609, 1425450611, (float)(kE.I1mOkq("tymecwgb", 666212409, 1997735559, 1997735558, 1997735557, 1425450611, (Float)((Float)((Object)kE.I1mOkq("jjdwdo", 666212411, 1997735583, 1997735582, 1997735581, -252294050, (kE)this)[kE.I1mOkq("fpuocns", 666212413, 1997735583, 1997735614, 1997735579, 1956119744)[4]]))) / f), (float)kE.I1mOkq("ebcgvrrn", 666212413, 1997735583, 1997735612, 1997735611, -1485830969)[3], (float)kE.I1mOkq("yglgc", 666212409, 1997735559, 1997735558, 1997735557, 1425450611, (Float)((Float)((Object)kE.I1mOkq("ivaflhwr", 666212411, 1997735583, 1997735582, 1997735581, -1957779199, (kE)this)[kE.I1mOkq("ebcgvrrn", 666212413, 1997735583, 1997735614, 1997735579, 400213581)[5]]))));
            kE.I1mOkq("ntmik", 666212409, 1997735578, 1997735565, 1997735564, 1425450611, (do)((do)((Object)kE.I1mOkq("adheossv", 666212411, 1997735583, 1997735582, 1997735581, 2138234572, (kE)this)[kE.I1mOkq("adheossv", 666212413, 1997735583, 1997735608, 1997735579, 1954895422)[0]])), (Object)kE.I1mOkq("jjdwdo", 666212407, 1997735568, 1997735567, 1997735566, 1425450611, (long)l));
        }
        CallSite callSite2 = kE.I1mOkq("ntmik", 666212407, 1997735568, 1997735567, 1997735566, 1425450611, (long)callSite);
        kE.I1mOkq("ntmik", 666212411, 1997735583, 1997735582, 1997735581, -1218534283, (kE)this)[kE.I1mOkq("jjdwdo", 666212413, 1997735583, 1997735608, 1997735579, 698883175)[1]] = callSite2;
        kE.I1mOkq("grknnc", 666212409, 1997735583, 1997735560, 1997735576, 1425450611, (kE)this);
    }

    private static /* synthetic */ int L(int n) {
        return Integer.rotateLeft(Integer.rotateLeft(Integer.rotateRight(Integer.rotateRight(Integer.rotateRight(-Integer.rotateRight(Integer.rotateRight(n, 2), 13), 31), 12), 30), 3), 26);
    }

    private static void M() {
        y = new long[]{4000L, 0L, 0L, 0L, 0L};
    }

    public kE() {
        kE.I1mOkq("adheossv", 666212409, 1997735583, 1997735593, 1997735576, 666212409, (kE)this);
        CallSite callSite = kE.I1mOkq("yglgc", 666212407, 1997735573, 1997735567, 1997735553, 666212407, (int)kE.I1mOkq("tymecwgb", 666212413, 1997735583, 1997735593, 1997735592, 666212413)[0]);
        kE.I1mOkq("ebcgvrrn", 666212411, 1997735583, 1997735582, 1997735581, 666212411, (kE)this)[kE.I1mOkq("jjdwdo", 666212413, 1997735583, 1997735552, 1997735579, 666212413)[0]] = callSite;
        do do_ = new do((int)kE.I1mOkq("ntmik", 666212409, 1997735573, 1997735572, 1997735571, 666212409, (Integer)((Object)kE.I1mOkq("yglgc", 666212411, 1997735583, 1997735582, 1997735581, 666212411, (kE)this)[kE.I1mOkq("jxzsptcs", 666212413, 1997735583, 1997735552, 1997735579, 666212413)[1]])));
        kE.I1mOkq("jxzsptcs", 666212411, 1997735583, 1997735582, 1997735581, 666212411, (kE)this)[kE.I1mOkq("ivaflhwr", 666212413, 1997735583, 1997735552, 1997735579, 666212413)[2]] = do_;
        CallSite callSite2 = kE.I1mOkq("jjdwdo", 666212407, 1997735559, 1997735567, 1997735615, 666212407, (float)kE.I1mOkq("adheossv", 666212413, 1997735583, 1997735612, 1997735611, 666212413)[0]);
        kE.I1mOkq("grknnc", 666212411, 1997735583, 1997735582, 1997735581, 666212411, (kE)this)[kE.I1mOkq("jxzsptcs", 666212413, 1997735583, 1997735552, 1997735579, 666212413)[3]] = callSite2;
        CallSite callSite3 = kE.I1mOkq("ebcgvrrn", 666212407, 1997735559, 1997735567, 1997735615, 666212407, (float)kE.I1mOkq("ntmik", 666212409, 1997735559, 1997735558, 1997735557, 666212409, (Float)((Float)((Object)kE.I1mOkq("jgsjrc", 666212411, 1997735583, 1997735582, 1997735581, 666212411, (kE)this)[kE.I1mOkq("yglgc", 666212413, 1997735583, 1997735552, 1997735579, 666212413)[4]]))));
        kE.I1mOkq("jjdwdo", 666212411, 1997735583, 1997735582, 1997735581, 666212411, (kE)this)[kE.I1mOkq("adheossv", 666212413, 1997735583, 1997735552, 1997735579, 666212413)[5]] = callSite3;
    }

    static {
        kE.ntfClinit();
    }

    private static void B() {
        B = new short[]{0, 0, 1, 2, 2, 5, 0};
        L = new short[]{2, 0, 1, 3, 2, 2};
        Z = new short[]{1, 3};
        u = new short[]{4, 1, 2, 5};
        R = new short[]{4, 1, 0, 1, 3, 4, 5};
    }

    private static void Z() {
        M = new float[]{20.0f, 1000.0f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f};
    }

    private static void i() {
        i = new boolean[]{false, true, false, false, false};
    }

    private static /* synthetic */ int i(int n) {
        return Integer.rotateRight(Integer.rotateLeft(-Integer.rotateRight(-Integer.rotateLeft(-n, 22), 14), 21) ^ 0xC4BEE4F3, 21);
    }

    private void z() {
        this.N = new Object[6];
        this.N[0] = 0;
        this.N[2] = Float.valueOf(0.0f);
        this.N[3] = 0L;
        this.N[4] = 0L;
        this.N[5] = Float.valueOf(0.0f);
    }

    private static /* synthetic */ int u(int n) {
        return Integer.rotateLeft(Integer.rotateLeft((-n ^ 0x12AD8BBA) + 1, 20) ^ 0xF4A39568, 1);
    }

    public void u() {
        CallSite callSite = kE.I1mOkq("adheossv", 666212407, 1997735563, 1997735562, 1997735561, 1425450611);
        if (callSite - kE.I1mOkq("jjdwdo", 666212409, 1997735568, 1997735613, 1997735561, 1425450611, (Long)((Long)((Object)kE.I1mOkq("jxzsptcs", 666212411, 1997735583, 1997735582, 1997735581, -2029775065, (kE)this)[kE.I1mOkq("ntmik", 666212413, 1997735583, 1997735560, 1997735579, -446344399)[0]]))) < kE.I1mOkq("tymecwgb", 666212413, 1997735583, 1997735570, 1997735569, -428345670)[0]) {
            return;
        }
        CallSite callSite2 = kE.I1mOkq("ntmik", 666212409, 1997735597, 1997735596, 1997735554, 1425450611, (OptionalDouble)((Object)kE.I1mOkq("yglgc", 666212406, 1997735600, 1997735599, 1997735598, 1425450611, (LongStream)((Object)kE.I1mOkq("tymecwgb", 666212406, 1997735605, 1997735602, 1997735601, 1425450611, (Stream)((Object)kE.I1mOkq("yglgc", 666212406, 1997735605, 1997735604, 1997735603, 1425450611, (Stream)((Object)kE.I1mOkq("jjdwdo", 666212409, 1997735578, 1997735607, 1997735606, 1425450611, (do)((do)((Object)kE.I1mOkq("adheossv", 666212411, 1997735583, 1997735582, 1997735581, 1559810347, (kE)this)[kE.I1mOkq("adheossv", 666212413, 1997735583, 1997735560, 1997735579, 1405182996)[1]])))), l -> {
            CallSite callSite;
            if (l != null) {
                if (kE.I1mOkq("jjdwdo", 666212409, 1997735568, 1997735613, 1997735561, 1425450611, (Long)l) > kE.I1mOkq("ntmik", 666212413, 1997735583, 1997735570, 1997735569, 1360856885)[2]) {
                    callSite = kE.I1mOkq("adheossv", 666212413, 1997735583, 1997735575, 1997735574, 58453582)[1];
                    return (boolean)callSite;
                }
            }
            callSite = kE.I1mOkq("grknnc", 666212413, 1997735583, 1997735575, 1997735574, 400726648)[2];
            return (boolean)callSite;
        })), Long::longValue)))), (double)((double)kE.I1mOkq("fpuocns", 666212409, 1997735559, 1997735558, 1997735557, 1425450611, (Float)((Float)((Object)kE.I1mOkq("jxzsptcs", 666212411, 1997735583, 1997735582, 1997735581, -1940259219, (kE)this)[kE.I1mOkq("grknnc", 666212413, 1997735583, 1997735560, 1997735579, -611011771)[2]])))));
        CallSite callSite3 = kE.I1mOkq("ntmik", 666212407, 1997735559, 1997735567, 1997735615, 1425450611, (float)kE.I1mOkq("ivaflhwr", 666212407, 1997735595, 1997735582, 1997735594, 1425450611, (float)((float)callSite2), (float)kE.I1mOkq("fpuocns", 666212413, 1997735583, 1997735612, 1997735611, -2040320386)[4]));
        kE.I1mOkq("ivaflhwr", 666212411, 1997735583, 1997735582, 1997735581, -728739051, (kE)this)[kE.I1mOkq("grknnc", 666212413, 1997735583, 1997735560, 1997735579, -948762642)[3]] = callSite3;
        CallSite callSite4 = kE.I1mOkq("jjdwdo", 666212407, 1997735568, 1997735567, 1997735566, 1425450611, (long)callSite);
        kE.I1mOkq("fpuocns", 666212411, 1997735583, 1997735582, 1997735581, -773812216, (kE)this)[kE.I1mOkq("fpuocns", 666212413, 1997735583, 1997735580, 1997735579, -1380679661)[0]] = callSite4;
    }

    private static /* synthetic */ int y(int n) {
        return Integer.rotateRight(Integer.rotateLeft(-Integer.rotateLeft(n, 8), 16) ^ 0xEB5F4A5D, 20);
    }

    public float y() {
        return (float)kE.I1mOkq("ntmik", 666212409, 1997735559, 1997735558, 1997735557, 1425450611, (Float)((Float)((Object)kE.I1mOkq("ebcgvrrn", 666212411, 1997735583, 1997735582, 1997735581, -1541065922, (kE)this)[kE.I1mOkq("ntmik", 666212413, 1997735583, 1997735580, 1997735579, -737541755)[6]])));
    }

    private static /* synthetic */ long N(long l) {
        return Long.rotateLeft(Long.rotateRight(Long.rotateLeft(Long.rotateRight(l, 36) ^ 0x4836B092E28A955FL, 15), 14), 27) ^ 0xDD44945C5361E8A3L;
    }

    public void N(float f) {
        CallSite callSite = kE.I1mOkq("adheossv", 666212407, 1997735573, 1997735567, 1997735553, 1425450611, (int)kE.I1mOkq("yglgc", 666212407, 1997735556, 1997735555, 1997735554, 1425450611, (double)f));
        kE.I1mOkq("ivaflhwr", 666212411, 1997735583, 1997735582, 1997735581, 92767337, (kE)this)[kE.I1mOkq("ivaflhwr", 666212413, 1997735583, 1997735552, 1997735579, 673146886)[6]] = callSite;
        CallSite callSite2 = kE.I1mOkq("fpuocns", 666212407, 1997735559, 1997735567, 1997735615, 1425450611, (float)f);
        kE.I1mOkq("yglgc", 666212411, 1997735583, 1997735582, 1997735581, -188693159, (kE)this)[kE.I1mOkq("ivaflhwr", 666212413, 1997735583, 1997735614, 1997735579, 2080164044)[0]] = callSite2;
        do do_ = new do((int)kE.I1mOkq("jjdwdo", 666212409, 1997735573, 1997735572, 1997735571, 1425450611, (Integer)((Object)kE.I1mOkq("ntmik", 666212411, 1997735583, 1997735582, 1997735581, 434576421, (kE)this)[kE.I1mOkq("ebcgvrrn", 666212413, 1997735583, 1997735614, 1997735579, 99278921)[1]])));
        kE.I1mOkq("ivaflhwr", 666212411, 1997735583, 1997735582, 1997735581, 1125146936, (kE)this)[kE.I1mOkq("jxzsptcs", 666212413, 1997735583, 1997735614, 1997735579, 875549523)[2]] = do_;
    }

    /*
     * WARNING - void declaration
     */
    public void N() {
        void var1_2;
        kE.I1mOkq("jjdwdo", 666212409, 1997735578, 1997735577, 1997735576, 1425450611, (do)((do)((Object)kE.I1mOkq("jgsjrc", 666212411, 1997735583, 1997735582, 1997735581, 229542742, (kE)this)[kE.I1mOkq("jxzsptcs", 666212413, 1997735583, 1997735580, 1997735579, 1981806995)[1]])));
        CallSite callSite = kE.I1mOkq("jjdwdo", 666212413, 1997735583, 1997735575, 1997735574, 62522774)[0];
        while (var1_2 < kE.I1mOkq("yglgc", 666212409, 1997735573, 1997735572, 1997735571, 1425450611, (Integer)((Object)kE.I1mOkq("ntmik", 666212411, 1997735583, 1997735582, 1997735581, 2040769578, (kE)this)[kE.I1mOkq("ebcgvrrn", 666212413, 1997735583, 1997735580, 1997735579, 995407393)[2]]))) {
            kE.I1mOkq("grknnc", 666212409, 1997735578, 1997735565, 1997735564, 1425450611, (do)((do)((Object)kE.I1mOkq("grknnc", 666212411, 1997735583, 1997735582, 1997735581, -749784279, (kE)this)[kE.I1mOkq("yglgc", 666212413, 1997735583, 1997735580, 1997735579, 943496026)[3]])), (Object)kE.I1mOkq("jjdwdo", 666212407, 1997735568, 1997735567, 1997735566, 1425450611, (long)kE.I1mOkq("fpuocns", 666212413, 1997735583, 1997735570, 1997735569, 210980407)[1]));
            ++var1_2;
        }
        CallSite callSite2 = kE.I1mOkq("adheossv", 666212407, 1997735563, 1997735562, 1997735561, 1425450611);
        CallSite callSite3 = kE.I1mOkq("ivaflhwr", 666212407, 1997735568, 1997735567, 1997735566, 1425450611, (long)callSite2);
        kE.I1mOkq("ivaflhwr", 666212411, 1997735583, 1997735582, 1997735581, -452834808, (kE)this)[kE.I1mOkq("jgsjrc", 666212413, 1997735583, 1997735580, 1997735579, -1435038)[4]] = callSite3;
        CallSite callSite4 = kE.I1mOkq("tymecwgb", 666212407, 1997735568, 1997735567, 1997735566, 1425450611, (long)callSite2);
        kE.I1mOkq("tymecwgb", 666212411, 1997735583, 1997735582, 1997735581, 1058276000, (kE)this)[kE.I1mOkq("grknnc", 666212413, 1997735583, 1997735580, 1997735579, 1373735727)[5]] = callSite4;
        kE.I1mOkq("tymecwgb", 666212409, 1997735583, 1997735560, 1997735576, 1425450611, (kE)this);
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateRight(-Integer.rotateRight(-Integer.rotateLeft(n, 28), 5), 10);
    }

    private static /* synthetic */ int R(int n) {
        return Integer.rotateLeft(Integer.rotateLeft(Integer.rotateRight(-Integer.rotateRight(-Integer.rotateRight(Integer.rotateRight(n, 12), 10), 3), 15), 5), 30);
    }

    private static void R() {
        z = new byte[]{20, 6, 2, 3, 4, 5};
    }

    private static /* synthetic */ void ntfClinit() {
        lOrm0p = "\u00ef\u00a3}42\u00a83\u001f\u00ec\u00ac\u007f\u0003|\u00a8'\u0014\u00b0\u00167\u00e7\u00ca\u0005\u00a6\u00b0\u0097\u009f\u00ac\u007f\u0003|\u00a8'\u0014\u00b0\u0016)\u00ff\u00cd\u0019\n\u0000\u0089^\u00bfL\u000e \u00a1|c\u00a1l\u0003!\u0019\u0081c\u0003%\u00a5i\u0016\u00b6W\u001d\u00a9\u00f1\u000f\u0005\u000eR\u00b92K\t\u0016\u0084 .9\u00a50\u001b\u00f8U\u001b\u00e8\u00d9B&\u0083J\u00a8n\u0007!\u00ff(\u00e4C\u0083\u00ac\u007f\u0003|\u00a8'\u0014\u00b0\u0016<\u00ea\u00d1\f\u001bT\u0081c\u0003%\u00a5i\u000f\u00a3P\u0016\u00a9\u00d8\u0018\u0001\u00b9\b\u00a4f\f|\u00944\u001f\u00b3P\u0019\u00e7\u00ca\bT\u00f30\u00a7h\u00142\u00eb3\u000e\u00beUU\u00f5\u00ca\u001f\n\u00bb\u0011\u00e2Z\u0016!\u00a1'\u0017\u00ece\u0087\u00af\u00ac\u007f\u0003|\u00b12\u0013\u00bb\u0016\t\u00f2\u00cc\b\u000e\u0080\u00ea\u0081f\f4\u00972\b\u00b2X\u0017\u00b9\u00ac\u007f\u0003|\u00b12\u0013\u00bb\u00165\u00f6\u00ca\u0004\u0000\u0005\u00b2\u00a1M\r&\u00a6*\u001f\u00a9\u0089O\u0018\u0001\u0081+U\u0099w-\u00c3\u00be\u0089O\u0018\u0001\u0081+U\u00a0c\u00ca\u008bOK\u0015\u0007\u00ac\u007f\u0003|\u00b12\u0013\u00bb\u0016\t\u00f2\u00cc\b\u000edB\u009e}\u00106\u00a5+\u00c8\u0089O\u0018\u0001\u0081+U\u00bc|\u00bf\u00a2g\u0005\u0005\u00a5*\u000f\u00b2\u00ed\u00acy6<\u0088)\u0014\u00b0.\u00e4E\b2\u00b2'U\u00a2M\u0013\u00ea\u0091\"\u001fZo\u00a2g\u0003?\u0080)\u000f\u00b5U\u001f\u00bd\u00b2\u00a9mT\u00e4@\u00f9c\u00af\u00ac\u007f\u0003|\u00a8'\u0014\u00b0\u00166\u00e9\u00d0\n\u0088\u0081c\u0003%\u00a5i\u0016\u00b6W\u001d\u00a9\u00f1\u000f\u0005\u000e\u00b0\u00b92\u00ab\u008b .9\u00a50\u001b\u00f8U\u001b\u00e8\u00d9B)B\u00ec\u00ac}Y\u0080H\u0016\u0081c\u0003%\u00a5i\u000f\u00a3P\u0016\u00a9\u00d8\u0018\u0001\u008eJ\u00a4f\f|\u0090)6\u00b8W\u001d\u00c0\u00cb\u0003\f\u0099W\u00a2gYz\u0088,\u001b\u00a1XU\u00f3\u00ca\u0004\u0003\u00c2M\u00b9{\u00072\u00a9i6\u00b8W\u001d\u00d5\u00ca\u001f\n\u008cS\u00f6\u0081\u00b8{\u00106\u00aa2.\u00beT\u001f\u00cb\u00d7\u0001\u0003\u0004\u0091\u0007\u00ac\u007f\u0003|\u00a8'\u0014\u00b0\u00163\u00e8\u00ca\b\bl\u001f\u00d4\u00e4_\u009a\u00b9{\u00072\u00a9\u00ae\u009e.\u0087 .9\u00a50\u001b\u00f8U\u001b\u00e8\u00d9B#Ah\u00aa2z(\u008bO$z\u0082\u00a9\u0089O\u0018\u0001\u0081+U\u00b3V\u001f\u00a8`\u000e\u00e0\u00a4e\u00166\u00b6E\u00e4O\u00ae\u008b\u00a7\u008f\u0087\u00a8\u0089 &\u00c3\u00e4E\b2\u00b2'U\u00a2M\u0013\u00ea\u0091\u001e\u001be\u008e\u00acdM\u0000\u00b04\u001f\u00b6TA\u00e2\u00bbl\u00102\u00a3#\u00f5\u00ace\u00176\u008b J\u008d\u00a1f\u0003'\u0092'\u0016\u00a2\\";
        lIOilIs = new int[]{18022410, 25755649, 23134227, 22151169, 32964610, 34799626, 3211269, 32374787, 0x1880001, 1507330, 0x1DD0011, 8, 21889027, 0x1510001, 11272194, 22216718, 39124999, 33095699, 21692419, 3538965, 0x190010, 0x1CC0011, 6356995, 2686977, 6553615, 39649290, 36110339, 524302, 35454980, 36634628, 4915222, 36569089, 24379412, 39583745, 18677769, 0x300001, 0x22A0002, 14745612, 34406406, 0x160001, 32571398, 36896795, 16515095, 35717126, 7536697, 19267593, 25821250, 11403291, 38666247, 19857436, 13172760, 2752518, 15532042, 16187397, 34340865, 0x22C0002};
        kE.B();
        kE.R();
        kE.Z();
        kE.i();
        kE.M();
    }

    private static /* synthetic */ CallSite I1mOkq(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = lIOilIs[n2 ^ 0x7713069F];
        int n7 = n6 >>> 16;
        String string2 = kE.l1trmr(lOrm0p.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0x7713069F);
        n6 = lIOilIs[n3 ^ 0x7713069F];
        int n8 = n6 >>> 16;
        String string3 = kE.l1trmr(lOrm0p.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0x7713069F);
        n6 = lIOilIs[n4 ^ 0x7713069F];
        int n9 = n6 >>> 16;
        String string4 = kE.l1trmr(lOrm0p.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0x7713069F);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x27B5988F) + -178;
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

    private static /* synthetic */ void IIjjsmis(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[56];
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
        lOrm0p = stringBuilder.toString();
        lIOilIs = nArray;
    }

    private static /* synthetic */ CallSite ooqpjpm(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) throws Exception {
        int n9 = lIOilIs[n2 ^ 0x7713069F];
        int n10 = n9 >>> 16;
        String string2 = kE.l1trmr(lOrm0p.substring(n10, n10 + (n9 & 0xFFFF)), n2 ^ 0x7713069F);
        n9 = lIOilIs[n3 ^ 0x7713069F];
        int n11 = n9 >>> 16;
        String string3 = kE.l1trmr(lOrm0p.substring(n11, n11 + (n9 & 0xFFFF)), n3 ^ 0x7713069F);
        n9 = lIOilIs[n4 ^ 0x7713069F];
        int n12 = n9 >>> 16;
        String string4 = kE.l1trmr(lOrm0p.substring(n12, n12 + (n9 & 0xFFFF)), n4 ^ 0x7713069F);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x27B5988F) + -178;
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

    private static /* synthetic */ String l1trmr(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-37, 39, 46, 57, 8, -22, 88, -35, -27, 30, -89, 91, -74, 93, 50, 48};
        byte[] byArray3 = new byte[]{102, 112, -91, -122, -77, -115, -95, 95, 102, -8, 17, -12, -88, 84, -17, -112};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite l1rmnqp(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = lIOilIs[n2 ^ 0x7713069F];
        int n8 = n7 >>> 16;
        String string2 = kE.l1trmr(lOrm0p.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0x7713069F);
        n7 = lIOilIs[n3 ^ 0x7713069F];
        int n9 = n7 >>> 16;
        String string3 = kE.l1trmr(lOrm0p.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0x7713069F);
        n7 = lIOilIs[n4 ^ 0x7713069F];
        int n10 = n7 >>> 16;
        String string4 = kE.l1trmr(lOrm0p.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0x7713069F);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x27B5988F) + -178;
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

    private static /* synthetic */ CallSite oos0nn00(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = lIOilIs[n2 ^ 0x7713069F];
        int n8 = n7 >>> 16;
        String string2 = kE.l1trmr(lOrm0p.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0x7713069F);
        n7 = lIOilIs[n3 ^ 0x7713069F];
        int n9 = n7 >>> 16;
        String string3 = kE.l1trmr(lOrm0p.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0x7713069F);
        n7 = lIOilIs[n4 ^ 0x7713069F];
        int n10 = n7 >>> 16;
        String string4 = kE.l1trmr(lOrm0p.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0x7713069F);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x27B5988F) + -178;
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
