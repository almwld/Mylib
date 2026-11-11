package Uc;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.encoders.json.BuildConfig;
import com.google.firebase.messaging.SendException;
import com.moonshot.kimichat.push.PushMessageReceiver;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final /* synthetic */ class W implements jn.D {
    public static final W a;

    @NotNull
    private static final hn.g descriptor;

    static {
        W w = new W();
        a = w;
        jn.f0 f0Var = new jn.f0("com.moonshot.kimi.proto.kimi.gateway.im.v1.Event", w, 14);
        f0Var.b("id", true);
        f0Var.b("ping", true);
        f0Var.b("chatMessage", true);
        f0Var.b("reconnect", true);
        f0Var.b("typing", true);
        f0Var.b("disband", true);
        f0Var.b("botReport", true);
        f0Var.b("chatStatus", true);
        f0Var.b("chatChange", true);
        f0Var.b("subagentStatus", true);
        f0Var.b("notification", true);
        f0Var.b("operation", true);
        f0Var.b("pong", true);
        f0Var.b("notificationEvent", true);
        descriptor = f0Var;
    }

    public final fn.a[] childSerializers() {
        return new fn.a[]{jn.s0.a, vb.N2.j(C2050i2.a), vb.N2.j(C2074o.a), vb.N2.j(C2077o2.a), vb.N2.j(s3.a), vb.N2.j(T.a), vb.N2.j(C2007a.a), vb.N2.j(C2109x.a), vb.N2.j(C2022d.a), vb.N2.j(Y2.a), vb.N2.j(Zc.s.a), vb.N2.j(C2010a2.a), vb.N2.j(C2065l2.a), vb.N2.j(T1.a)};
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: fn.k */
    public final Object deserialize(in.c cVar) throws fn.k {
        C2105w c2105w;
        Z1 z1;
        C2105w c2105w2;
        Intrinsics.checkNotNullParameter(cVar, "decoder");
        hn.g gVar = descriptor;
        in.a aVarB = cVar.b(gVar);
        C2011a3 c2011a3 = null;
        Z1 z12 = null;
        C2073n2 c2073n2 = null;
        Zc.u uVar = null;
        C2045h2 c2045h2 = null;
        C2060k2 c2060k2 = null;
        C2105w c2105w3 = null;
        C2085q2 c2085q2 = null;
        u3 u3Var = null;
        V v = null;
        C2017c c2017c = null;
        C2117z c2117z = null;
        C2070n c2070n = null;
        String strK = null;
        int i = 0;
        boolean z = true;
        while (z) {
            C2060k2 c2060k22 = c2060k2;
            int iG = aVarB.g(gVar);
            switch (iG) {
                case -1:
                    c2105w = c2105w3;
                    z = false;
                    c2060k2 = c2060k22;
                    c2105w3 = c2105w;
                    break;
                case 0:
                    z1 = z12;
                    c2105w2 = c2105w3;
                    strK = aVarB.k(gVar, 0);
                    i |= 1;
                    c2060k2 = c2060k22;
                    c2105w3 = c2105w2;
                    z12 = z1;
                    break;
                case 1:
                    z1 = z12;
                    c2105w2 = c2105w3;
                    c2060k2 = (C2060k2) aVarB.l(gVar, 1, C2050i2.a, c2060k22);
                    i |= 2;
                    c2105w3 = c2105w2;
                    z12 = z1;
                    break;
                case 2:
                    z1 = z12;
                    c2105w3 = (C2105w) aVarB.l(gVar, 2, C2074o.a, c2105w3);
                    i |= 4;
                    c2060k2 = c2060k22;
                    z12 = z1;
                    break;
                case SendException.ERROR_TTL_EXCEEDED /* 3 */:
                    c2105w = c2105w3;
                    c2085q2 = (C2085q2) aVarB.l(gVar, 3, C2077o2.a, c2085q2);
                    i |= 8;
                    c2060k2 = c2060k22;
                    c2105w3 = c2105w;
                    break;
                case SendException.ERROR_TOO_MANY_MESSAGES /* 4 */:
                    c2105w = c2105w3;
                    u3Var = (u3) aVarB.l(gVar, 4, s3.a, u3Var);
                    i |= 16;
                    c2060k2 = c2060k22;
                    c2105w3 = c2105w;
                    break;
                case 5:
                    c2105w = c2105w3;
                    v = (V) aVarB.l(gVar, 5, T.a, v);
                    i |= 32;
                    c2060k2 = c2060k22;
                    c2105w3 = c2105w;
                    break;
                case 6:
                    c2105w = c2105w3;
                    c2017c = (C2017c) aVarB.l(gVar, 6, C2007a.a, c2017c);
                    i |= 64;
                    c2060k2 = c2060k22;
                    c2105w3 = c2105w;
                    break;
                case 7:
                    c2105w = c2105w3;
                    c2117z = (C2117z) aVarB.l(gVar, 7, C2109x.a, c2117z);
                    i |= 128;
                    c2060k2 = c2060k22;
                    c2105w3 = c2105w;
                    break;
                case PushMessageReceiver.$stable /* 8 */:
                    c2105w = c2105w3;
                    c2070n = (C2070n) aVarB.l(gVar, 8, C2022d.a, c2070n);
                    i |= 256;
                    c2060k2 = c2060k22;
                    c2105w3 = c2105w;
                    break;
                case 9:
                    c2105w = c2105w3;
                    c2011a3 = (C2011a3) aVarB.l(gVar, 9, Y2.a, c2011a3);
                    i |= 512;
                    c2060k2 = c2060k22;
                    c2105w3 = c2105w;
                    break;
                case 10:
                    c2105w = c2105w3;
                    uVar = (Zc.u) aVarB.l(gVar, 10, Zc.s.a, uVar);
                    i |= 1024;
                    c2060k2 = c2060k22;
                    c2105w3 = c2105w;
                    break;
                case 11:
                    c2105w = c2105w3;
                    c2045h2 = (C2045h2) aVarB.l(gVar, 11, C2010a2.a, c2045h2);
                    i |= 2048;
                    c2060k2 = c2060k22;
                    c2105w3 = c2105w;
                    break;
                case 12:
                    c2105w = c2105w3;
                    c2073n2 = (C2073n2) aVarB.l(gVar, 12, C2065l2.a, c2073n2);
                    i |= 4096;
                    c2060k2 = c2060k22;
                    c2105w3 = c2105w;
                    break;
                case 13:
                    c2105w = c2105w3;
                    z12 = (Z1) aVarB.l(gVar, 13, T1.a, z12);
                    i |= 8192;
                    c2060k2 = c2060k22;
                    c2105w3 = c2105w;
                    break;
                default:
                    throw new fn.k(iG);
            }
        }
        C2105w c2105w4 = c2105w3;
        C2060k2 c2060k23 = c2060k2;
        aVarB.a(gVar);
        return new Y(i, strK, c2060k23, c2105w4, c2085q2, u3Var, v, c2017c, c2117z, c2070n, c2011a3, uVar, c2045h2, c2073n2, z12);
    }

    public final hn.g getDescriptor() {
        return descriptor;
    }

    public final void serialize(in.d dVar, Object obj) {
        Y y = (Y) obj;
        Intrinsics.checkNotNullParameter(dVar, "encoder");
        Intrinsics.checkNotNullParameter(y, FirebaseAnalytics.Param.VALUE);
        hn.g gVar = descriptor;
        in.b bVarB = dVar.b(gVar);
        X x = Y.Companion;
        if (bVarB.q(gVar) || !Intrinsics.b(y.a, BuildConfig.FLAVOR)) {
            bVarB.l(gVar, 0, y.a);
        }
        if (bVarB.q(gVar) || y.b != null) {
            bVarB.u(gVar, 1, C2050i2.a, y.b);
        }
        if (bVarB.q(gVar) || y.c != null) {
            bVarB.u(gVar, 2, C2074o.a, y.c);
        }
        if (bVarB.q(gVar) || y.d != null) {
            bVarB.u(gVar, 3, C2077o2.a, y.d);
        }
        if (bVarB.q(gVar) || y.e != null) {
            bVarB.u(gVar, 4, s3.a, y.e);
        }
        if (bVarB.q(gVar) || y.f != null) {
            bVarB.u(gVar, 5, T.a, y.f);
        }
        if (bVarB.q(gVar) || y.g != null) {
            bVarB.u(gVar, 6, C2007a.a, y.g);
        }
        if (bVarB.q(gVar) || y.h != null) {
            bVarB.u(gVar, 7, C2109x.a, y.h);
        }
        if (bVarB.q(gVar) || y.i != null) {
            bVarB.u(gVar, 8, C2022d.a, y.i);
        }
        if (bVarB.q(gVar) || y.j != null) {
            bVarB.u(gVar, 9, Y2.a, y.j);
        }
        if (bVarB.q(gVar) || y.k != null) {
            bVarB.u(gVar, 10, Zc.s.a, y.k);
        }
        if (bVarB.q(gVar) || y.l != null) {
            bVarB.u(gVar, 11, C2010a2.a, y.l);
        }
        if (bVarB.q(gVar) || y.m != null) {
            bVarB.u(gVar, 12, C2065l2.a, y.m);
        }
        if (bVarB.q(gVar) || y.n != null) {
            bVarB.u(gVar, 13, T1.a, y.n);
        }
        bVarB.a(gVar);
    }
}
