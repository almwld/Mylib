package Dc;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.encoders.json.BuildConfig;
import com.google.firebase.messaging.SendException;
import com.moonshot.kimichat.push.PushMessageReceiver;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yc.C5671e;
import yc.C5673g;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final /* synthetic */ class I6 implements jn.D {
    public static final I6 a;

    @NotNull
    private static final hn.g descriptor;

    static {
        I6 i6 = new I6();
        a = i6;
        jn.f0 f0Var = new jn.f0("com.moonshot.kimi.proto.kimi.chat.v1.ToolBlock", i6, 18);
        f0Var.b("toolCallId", true);
        f0Var.b("name", true);
        f0Var.b("args", true);
        f0Var.b("isError", true);
        f0Var.b("errorCode", true);
        f0Var.b("mcp", true);
        f0Var.b("status", true);
        f0Var.b("task", true);
        f0Var.b("createSubagent", true);
        f0Var.b("slidesGenerator", true);
        f0Var.b("appVersion", true);
        f0Var.b("cronJob", true);
        f0Var.b("subagent", true);
        f0Var.b("paywall", true);
        f0Var.b("loadType", true);
        f0Var.b("contentCount", true);
        f0Var.b("plugin", true);
        f0Var.b("contents", true);
        descriptor = f0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final fn.a[] childSerializers() {
        Sk.l[] lVarArr = Z6.s;
        jn.s0 s0Var = jn.s0.a;
        return new fn.a[]{s0Var, s0Var, s0Var, jn.g.a, lVarArr[4].getValue(), vb.N2.j(P6.a), lVarArr[6].getValue(), vb.N2.j(L7.a), vb.N2.j(C0665x7.a), vb.N2.j(E7.a), vb.N2.j(C0638u7.a), vb.N2.j(B7.a), vb.N2.j(I7.a), vb.N2.j(C5671e.a), lVarArr[14].getValue(), jn.L.a, vb.N2.j(C0661x3.a), lVarArr[17].getValue()};
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: fn.k */
    public final Object deserialize(in.c cVar) throws fn.k {
        O6 o6;
        R6 r6;
        int i;
        O6 o62;
        zc.N1 n1;
        Intrinsics.checkNotNullParameter(cVar, "decoder");
        hn.g gVar = descriptor;
        in.a aVarB = cVar.b(gVar);
        Sk.l[] lVarArr = Z6.s;
        C0683z7 c0683z7 = null;
        O6 o63 = null;
        C5673g c5673g = null;
        K7 k7 = null;
        G7 g7 = null;
        C0656w7 c0656w7 = null;
        C0679z3 c0679z3 = null;
        List list = null;
        D7 d7 = null;
        zc.N1 n12 = null;
        R6 r62 = null;
        Y6 y6 = null;
        N7 n7 = null;
        String strK = null;
        String strK2 = null;
        String strK3 = null;
        int i2 = 0;
        boolean z = true;
        boolean zQ = false;
        int iV = 0;
        while (z) {
            zc.N1 n13 = n12;
            int iG = aVarB.g(gVar);
            switch (iG) {
                case -1:
                    o6 = o63;
                    r6 = r62;
                    n12 = n13;
                    z = false;
                    o63 = o6;
                    r62 = r6;
                    break;
                case 0:
                    o6 = o63;
                    r6 = r62;
                    strK = aVarB.k(gVar, 0);
                    i2 |= 1;
                    n12 = n13;
                    o63 = o6;
                    r62 = r6;
                    break;
                case 1:
                    o62 = o63;
                    n1 = n13;
                    strK2 = aVarB.k(gVar, 1);
                    i2 |= 2;
                    n12 = n1;
                    o63 = o62;
                    break;
                case 2:
                    o62 = o63;
                    n1 = n13;
                    strK3 = aVarB.k(gVar, 2);
                    i2 |= 4;
                    n12 = n1;
                    o63 = o62;
                    break;
                case SendException.ERROR_TTL_EXCEEDED /* 3 */:
                    o62 = o63;
                    n1 = n13;
                    zQ = aVarB.q(gVar, 3);
                    i2 |= 8;
                    n12 = n1;
                    o63 = o62;
                    break;
                case SendException.ERROR_TOO_MANY_MESSAGES /* 4 */:
                    o6 = o63;
                    r6 = r62;
                    n12 = (zc.N1) aVarB.C(gVar, 4, (fn.a) lVarArr[4].getValue(), n13);
                    i2 |= 16;
                    o63 = o6;
                    r62 = r6;
                    break;
                case 5:
                    o62 = o63;
                    r62 = (R6) aVarB.l(gVar, 5, P6.a, r62);
                    i2 |= 32;
                    n12 = n13;
                    o63 = o62;
                    break;
                case 6:
                    r6 = r62;
                    y6 = (Y6) aVarB.C(gVar, 6, (fn.a) lVarArr[6].getValue(), y6);
                    i2 |= 64;
                    n12 = n13;
                    r62 = r6;
                    break;
                case 7:
                    r6 = r62;
                    n7 = (N7) aVarB.l(gVar, 7, L7.a, n7);
                    i2 |= 128;
                    n12 = n13;
                    r62 = r6;
                    break;
                case PushMessageReceiver.$stable /* 8 */:
                    r6 = r62;
                    c0683z7 = (C0683z7) aVarB.l(gVar, 8, C0665x7.a, c0683z7);
                    i2 |= 256;
                    n12 = n13;
                    r62 = r6;
                    break;
                case 9:
                    r6 = r62;
                    g7 = (G7) aVarB.l(gVar, 9, E7.a, g7);
                    i2 |= 512;
                    n12 = n13;
                    r62 = r6;
                    break;
                case 10:
                    r6 = r62;
                    c0656w7 = (C0656w7) aVarB.l(gVar, 10, C0638u7.a, c0656w7);
                    i2 |= 1024;
                    n12 = n13;
                    r62 = r6;
                    break;
                case 11:
                    r6 = r62;
                    d7 = (D7) aVarB.l(gVar, 11, B7.a, d7);
                    i2 |= 2048;
                    n12 = n13;
                    r62 = r6;
                    break;
                case 12:
                    r6 = r62;
                    k7 = (K7) aVarB.l(gVar, 12, I7.a, k7);
                    i2 |= 4096;
                    n12 = n13;
                    r62 = r6;
                    break;
                case 13:
                    r6 = r62;
                    c5673g = (C5673g) aVarB.l(gVar, 13, C5671e.a, c5673g);
                    i2 |= 8192;
                    n12 = n13;
                    r62 = r6;
                    break;
                case 14:
                    r6 = r62;
                    o63 = (O6) aVarB.C(gVar, 14, (fn.a) lVarArr[14].getValue(), o63);
                    i2 |= 16384;
                    n12 = n13;
                    r62 = r6;
                    break;
                case 15:
                    iV = aVarB.v(gVar, 15);
                    i2 |= 32768;
                    n12 = n13;
                    break;
                case 16:
                    r6 = r62;
                    c0679z3 = (C0679z3) aVarB.l(gVar, 16, C0661x3.a, c0679z3);
                    i = 65536;
                    i2 |= i;
                    n12 = n13;
                    r62 = r6;
                    break;
                case 17:
                    r6 = r62;
                    list = (List) aVarB.C(gVar, 17, (fn.a) lVarArr[17].getValue(), list);
                    i = 131072;
                    i2 |= i;
                    n12 = n13;
                    r62 = r6;
                    break;
                default:
                    throw new fn.k(iG);
            }
        }
        O6 o64 = o63;
        aVarB.a(gVar);
        List list2 = list;
        C0679z3 c0679z32 = c0679z3;
        return new Z6(i2, strK, strK2, strK3, zQ, n12, r62, y6, n7, c0683z7, g7, c0656w7, d7, k7, c5673g, o64, iV, c0679z32, list2);
    }

    public final hn.g getDescriptor() {
        return descriptor;
    }

    public final void serialize(in.d dVar, Object obj) {
        Z6 z6 = (Z6) obj;
        Intrinsics.checkNotNullParameter(dVar, "encoder");
        Intrinsics.checkNotNullParameter(z6, FirebaseAnalytics.Param.VALUE);
        hn.g gVar = descriptor;
        in.b bVarB = dVar.b(gVar);
        Sk.l[] lVarArr = Z6.s;
        if (bVarB.q(gVar) || !Intrinsics.b(z6.a, BuildConfig.FLAVOR)) {
            bVarB.l(gVar, 0, z6.a);
        }
        if (bVarB.q(gVar) || !Intrinsics.b(z6.b, BuildConfig.FLAVOR)) {
            bVarB.l(gVar, 1, z6.b);
        }
        if (bVarB.q(gVar) || !Intrinsics.b(z6.c, BuildConfig.FLAVOR)) {
            bVarB.l(gVar, 2, z6.c);
        }
        if (bVarB.q(gVar) || z6.d) {
            bVarB.m(gVar, 3, z6.d);
        }
        if (bVarB.q(gVar) || !Intrinsics.b(z6.e, zc.N1.Companion.M0(0))) {
            bVarB.t(gVar, 4, (fn.a) lVarArr[4].getValue(), z6.e);
        }
        if (bVarB.q(gVar) || z6.f != null) {
            bVarB.u(gVar, 5, P6.a, z6.f);
        }
        if (bVarB.q(gVar) || !Intrinsics.b(z6.g, Y6.Companion.M0(0))) {
            bVarB.t(gVar, 6, (fn.a) lVarArr[6].getValue(), z6.g);
        }
        if (bVarB.q(gVar) || z6.h != null) {
            bVarB.u(gVar, 7, L7.a, z6.h);
        }
        if (bVarB.q(gVar) || z6.i != null) {
            bVarB.u(gVar, 8, C0665x7.a, z6.i);
        }
        if (bVarB.q(gVar) || z6.j != null) {
            bVarB.u(gVar, 9, E7.a, z6.j);
        }
        if (bVarB.q(gVar) || z6.k != null) {
            bVarB.u(gVar, 10, C0638u7.a, z6.k);
        }
        if (bVarB.q(gVar) || z6.l != null) {
            bVarB.u(gVar, 11, B7.a, z6.l);
        }
        if (bVarB.q(gVar) || z6.m != null) {
            bVarB.u(gVar, 12, I7.a, z6.m);
        }
        if (bVarB.q(gVar) || z6.n != null) {
            bVarB.u(gVar, 13, C5671e.a, z6.n);
        }
        if (bVarB.q(gVar) || !Intrinsics.b(z6.o, O6.Companion.M0(0))) {
            bVarB.t(gVar, 14, (fn.a) lVarArr[14].getValue(), z6.o);
        }
        if (bVarB.q(gVar) || z6.p != 0) {
            bVarB.s(15, z6.p, gVar);
        }
        if (bVarB.q(gVar) || z6.q != null) {
            bVarB.u(gVar, 16, C0661x3.a, z6.q);
        }
        if (bVarB.q(gVar) || !Intrinsics.b(z6.r, kotlin.collections.I.a)) {
            bVarB.t(gVar, 17, (fn.a) lVarArr[17].getValue(), z6.r);
        }
        bVarB.a(gVar);
    }
}
