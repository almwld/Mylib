package ld;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.encoders.json.BuildConfig;
import com.google.firebase.messaging.SendException;
import com.moonshot.kimichat.push.PushMessageReceiver;
import jn.f0;
import jn.s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vb.N2;

/* JADX INFO: renamed from: ld.H, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final /* synthetic */ class C3841H implements jn.D {
    public static final C3841H a;

    @NotNull
    private static final hn.g descriptor;

    static {
        C3841H c3841h = new C3841H();
        a = c3841h;
        f0 f0Var = new f0("com.moonshot.kimi.proto.kimi.gateway.swarm.v1.Subagent", c3841h, 10);
        f0Var.b("id", true);
        f0Var.b(FirebaseAnalytics.Param.INDEX, true);
        f0Var.b("name", true);
        f0Var.b("iconUrl", true);
        f0Var.b("motto", true);
        f0Var.b("status", true);
        f0Var.b("progressPercent", true);
        f0Var.b("description", true);
        f0Var.b("type", true);
        f0Var.b("isAsync", true);
        descriptor = f0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final fn.a[] childSerializers() {
        Sk.l[] lVarArr = C3843J.k;
        s0 s0Var = s0.a;
        jn.L l = jn.L.a;
        return new fn.a[]{s0Var, l, s0Var, s0Var, s0Var, lVarArr[5].getValue(), N2.j(l), s0Var, s0Var, jn.g.a};
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: fn.k */
    public final Object deserialize(in.c cVar) throws fn.k {
        Intrinsics.checkNotNullParameter(cVar, "decoder");
        hn.g gVar = descriptor;
        in.a aVarB = cVar.b(gVar);
        Sk.l[] lVarArr = C3843J.k;
        String strK = null;
        String strK2 = null;
        String strK3 = null;
        String strK4 = null;
        AbstractC3834A abstractC3834A = null;
        Integer num = null;
        String strK5 = null;
        String strK6 = null;
        int i = 0;
        int iV = 0;
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
                    iV = aVarB.v(gVar, 1);
                    i |= 2;
                    break;
                case 2:
                    strK2 = aVarB.k(gVar, 2);
                    i |= 4;
                    break;
                case SendException.ERROR_TTL_EXCEEDED /* 3 */:
                    strK3 = aVarB.k(gVar, 3);
                    i |= 8;
                    break;
                case SendException.ERROR_TOO_MANY_MESSAGES /* 4 */:
                    strK4 = aVarB.k(gVar, 4);
                    i |= 16;
                    break;
                case 5:
                    abstractC3834A = (AbstractC3834A) aVarB.C(gVar, 5, (fn.a) lVarArr[5].getValue(), abstractC3834A);
                    i |= 32;
                    break;
                case 6:
                    num = (Integer) aVarB.l(gVar, 6, jn.L.a, num);
                    i |= 64;
                    break;
                case 7:
                    strK5 = aVarB.k(gVar, 7);
                    i |= 128;
                    break;
                case PushMessageReceiver.$stable /* 8 */:
                    strK6 = aVarB.k(gVar, 8);
                    i |= 256;
                    break;
                case 9:
                    zQ = aVarB.q(gVar, 9);
                    i |= 512;
                    break;
                default:
                    throw new fn.k(iG);
            }
        }
        aVarB.a(gVar);
        return new C3843J(i, strK, iV, strK2, strK3, strK4, abstractC3834A, num, strK5, strK6, zQ);
    }

    public final hn.g getDescriptor() {
        return descriptor;
    }

    public final void serialize(in.d dVar, Object obj) {
        C3843J c3843j = (C3843J) obj;
        Intrinsics.checkNotNullParameter(dVar, "encoder");
        Intrinsics.checkNotNullParameter(c3843j, FirebaseAnalytics.Param.VALUE);
        hn.g gVar = descriptor;
        in.b bVarB = dVar.b(gVar);
        Sk.l[] lVarArr = C3843J.k;
        if (bVarB.q(gVar) || !Intrinsics.b(c3843j.a, BuildConfig.FLAVOR)) {
            bVarB.l(gVar, 0, c3843j.a);
        }
        if (bVarB.q(gVar) || c3843j.b != 0) {
            bVarB.s(1, c3843j.b, gVar);
        }
        if (bVarB.q(gVar) || !Intrinsics.b(c3843j.c, BuildConfig.FLAVOR)) {
            bVarB.l(gVar, 2, c3843j.c);
        }
        if (bVarB.q(gVar) || !Intrinsics.b(c3843j.d, BuildConfig.FLAVOR)) {
            bVarB.l(gVar, 3, c3843j.d);
        }
        if (bVarB.q(gVar) || !Intrinsics.b(c3843j.e, BuildConfig.FLAVOR)) {
            bVarB.l(gVar, 4, c3843j.e);
        }
        if (bVarB.q(gVar) || !Intrinsics.b(c3843j.f, AbstractC3834A.Companion.M0(0))) {
            bVarB.t(gVar, 5, (fn.a) lVarArr[5].getValue(), c3843j.f);
        }
        if (bVarB.q(gVar) || c3843j.g != null) {
            bVarB.u(gVar, 6, jn.L.a, c3843j.g);
        }
        if (bVarB.q(gVar) || !Intrinsics.b(c3843j.h, BuildConfig.FLAVOR)) {
            bVarB.l(gVar, 7, c3843j.h);
        }
        if (bVarB.q(gVar) || !Intrinsics.b(c3843j.i, BuildConfig.FLAVOR)) {
            bVarB.l(gVar, 8, c3843j.i);
        }
        if (bVarB.q(gVar) || c3843j.j) {
            bVarB.m(gVar, 9, c3843j.j);
        }
        bVarB.a(gVar);
    }
}
