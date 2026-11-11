package md;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.encoders.json.BuildConfig;
import com.google.firebase.messaging.SendException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vb.N2;
import zc.C5795a;
import zc.C5801c;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final /* synthetic */ class Y implements jn.D {
    public static final Y a;

    @NotNull
    private static final hn.g descriptor;

    static {
        Y y = new Y();
        a = y;
        jn.f0 f0Var = new jn.f0("com.moonshot.kimi.proto.kimi.gateway.trigger.v1.TaskExecution", y, 8);
        f0Var.b("executionId", true);
        f0Var.b("taskId", true);
        f0Var.b("executeTime", true);
        f0Var.b("status", true);
        f0Var.b("chatId", true);
        f0Var.b("failReason", true);
        f0Var.b("summary", true);
        f0Var.b("isRead", true);
        descriptor = f0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final fn.a[] childSerializers() {
        Sk.l[] lVarArr = C3934a0.j;
        jn.s0 s0Var = jn.s0.a;
        return new fn.a[]{s0Var, s0Var, N2.j(s0Var), lVarArr[3].getValue(), N2.j(s0Var), N2.j(C5795a.a), s0Var, jn.g.a};
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: fn.k */
    public final Object deserialize(in.c cVar) throws fn.k {
        Intrinsics.checkNotNullParameter(cVar, "decoder");
        hn.g gVar = descriptor;
        in.a aVarB = cVar.b(gVar);
        Sk.l[] lVarArr = C3934a0.j;
        String strK = null;
        String strK2 = null;
        String str = null;
        AbstractC3950i0 abstractC3950i0 = null;
        String str2 = null;
        C5801c c5801c = null;
        String strK3 = null;
        int i = 0;
        boolean zQ = false;
        boolean z = true;
        while (z) {
            int iG = aVarB.g(gVar);
            switch (iG) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strK = aVarB.k(gVar, 0);
                    i |= 1;
                    break;
                case 1:
                    strK2 = aVarB.k(gVar, 1);
                    i |= 2;
                    break;
                case 2:
                    str = (String) aVarB.l(gVar, 2, jn.s0.a, str);
                    i |= 4;
                    break;
                case SendException.ERROR_TTL_EXCEEDED /* 3 */:
                    abstractC3950i0 = (AbstractC3950i0) aVarB.C(gVar, 3, (fn.a) lVarArr[3].getValue(), abstractC3950i0);
                    i |= 8;
                    break;
                case SendException.ERROR_TOO_MANY_MESSAGES /* 4 */:
                    str2 = (String) aVarB.l(gVar, 4, jn.s0.a, str2);
                    i |= 16;
                    break;
                case 5:
                    c5801c = (C5801c) aVarB.l(gVar, 5, C5795a.a, c5801c);
                    i |= 32;
                    break;
                case 6:
                    strK3 = aVarB.k(gVar, 6);
                    i |= 64;
                    break;
                case 7:
                    zQ = aVarB.q(gVar, 7);
                    i |= 128;
                    break;
                default:
                    throw new fn.k(iG);
            }
        }
        aVarB.a(gVar);
        return new C3934a0(i, strK, strK2, str, abstractC3950i0, str2, c5801c, strK3, zQ);
    }

    public final hn.g getDescriptor() {
        return descriptor;
    }

    public final void serialize(in.d dVar, Object obj) {
        C3934a0 c3934a0 = (C3934a0) obj;
        Intrinsics.checkNotNullParameter(dVar, "encoder");
        Intrinsics.checkNotNullParameter(c3934a0, FirebaseAnalytics.Param.VALUE);
        hn.g gVar = descriptor;
        in.b bVarB = dVar.b(gVar);
        Sk.l[] lVarArr = C3934a0.j;
        if (bVarB.q(gVar) || !Intrinsics.b(c3934a0.a, BuildConfig.FLAVOR)) {
            bVarB.l(gVar, 0, c3934a0.a);
        }
        if (bVarB.q(gVar) || !Intrinsics.b(c3934a0.b, BuildConfig.FLAVOR)) {
            bVarB.l(gVar, 1, c3934a0.b);
        }
        if (bVarB.q(gVar) || c3934a0.c != null) {
            bVarB.u(gVar, 2, jn.s0.a, c3934a0.c);
        }
        if (bVarB.q(gVar) || !Intrinsics.b(c3934a0.d, AbstractC3950i0.Companion.M0(0))) {
            bVarB.t(gVar, 3, (fn.a) lVarArr[3].getValue(), c3934a0.d);
        }
        if (bVarB.q(gVar) || c3934a0.e != null) {
            bVarB.u(gVar, 4, jn.s0.a, c3934a0.e);
        }
        if (bVarB.q(gVar) || c3934a0.f != null) {
            bVarB.u(gVar, 5, C5795a.a, c3934a0.f);
        }
        if (bVarB.q(gVar) || !Intrinsics.b(c3934a0.g, BuildConfig.FLAVOR)) {
            bVarB.l(gVar, 6, c3934a0.g);
        }
        if (bVarB.q(gVar) || c3934a0.h) {
            bVarB.m(gVar, 7, c3934a0.h);
        }
        bVarB.a(gVar);
    }
}
