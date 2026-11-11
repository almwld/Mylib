package ve;

import Dc.C0639v;
import Uc.C2105w;
import Uc.C2117z;
import com.google.firebase.encoders.json.BuildConfig;
import com.google.firebase.messaging.SendException;
import dg.C2978a;
import java.util.Iterator;
import je.C3695k0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qi.C4277e;
import ue.C4791b;
import ue.C4795f;
import ue.C4801l;

/* JADX INFO: renamed from: ve.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class C5150s0 implements Pm.i {
    public final /* synthetic */ int a;
    public final /* synthetic */ P1.f0 b;

    public /* synthetic */ C5150s0(P1.f0 f0Var, int i) {
        this.a = i;
        this.b = f0Var;
    }

    public final Object emit(Object obj, Vk.a aVar) {
        Object next;
        int i = this.a;
        final int i2 = 1;
        final int i3 = 0;
        P1.f0 f0Var = this.b;
        switch (i) {
            case 0:
                final C2105w c2105w = (C2105w) obj;
                C4801l c4801l = (C4801l) f0Var.i;
                if (c4801l == null) {
                    Intrinsics.l("serviceImpl");
                    throw null;
                }
                if (!c4801l.p) {
                    boolean z = C2978a.a;
                    C2978a.a("StreamApiImpl", null, new C4791b(12, f0Var, c2105w));
                    return Unit.a;
                }
                C4277e c4277e = (C4277e) f0Var.g;
                if (c4277e == null) {
                    Intrinsics.l("onEvent");
                    throw null;
                }
                ze.B b = new ze.B(c2105w);
                String str = c2105w.g;
                String str2 = c2105w.a;
                c4277e.invoke(b);
                if (Intrinsics.b(str, f0Var.o()) || Intrinsics.b(str2, f0Var.o())) {
                    if (!Intrinsics.b(str, f0Var.o())) {
                        boolean z2 = C2978a.a;
                        final int i4 = 2;
                        C2978a.a("StreamApiImpl", null, new Function0() { // from class: ve.p0
                            public final Object invoke() {
                                switch (i4) {
                                    case 0:
                                        C2105w c2105w2 = c2105w;
                                        return "Main Room IM event: thread messageId=" + c2105w2.b + ", status=" + c2105w2.c;
                                    case 1:
                                        C2105w c2105w3 = c2105w;
                                        return "Main Room IM event: main messageId=" + c2105w3.b + ", status=" + c2105w3.c;
                                    case 2:
                                        C2105w c2105w4 = c2105w;
                                        return "Thread Room IM event: main messageId=" + c2105w4.b + ", status=" + c2105w4.c;
                                    case SendException.ERROR_TTL_EXCEEDED /* 3 */:
                                        return "checkAndTriggerLoadHistory, chatMessageEvent=" + c2105w;
                                    case SendException.ERROR_TOO_MANY_MESSAGES /* 4 */:
                                        return Ie.K0.A("Trigger_loadUpdates, localMessage_null, messageId: ", c2105w.b);
                                    case 5:
                                        return Ie.K0.A("Trigger_updateMessage, localMessage_generating, messageId: ", c2105w.b);
                                    default:
                                        return Ie.K0.A("Trigger_loadUpdates, localMessage_not_generating, messageId: ", c2105w.b);
                                }
                            }
                        });
                        f0Var.k(c2105w);
                    } else if (Intrinsics.b(str2, f0Var.o())) {
                        boolean z3 = C2978a.a;
                        C2978a.a("StreamApiImpl", null, new Function0() { // from class: ve.p0
                            public final Object invoke() {
                                switch (i2) {
                                    case 0:
                                        C2105w c2105w2 = c2105w;
                                        return "Main Room IM event: thread messageId=" + c2105w2.b + ", status=" + c2105w2.c;
                                    case 1:
                                        C2105w c2105w3 = c2105w;
                                        return "Main Room IM event: main messageId=" + c2105w3.b + ", status=" + c2105w3.c;
                                    case 2:
                                        C2105w c2105w4 = c2105w;
                                        return "Thread Room IM event: main messageId=" + c2105w4.b + ", status=" + c2105w4.c;
                                    case SendException.ERROR_TTL_EXCEEDED /* 3 */:
                                        return "checkAndTriggerLoadHistory, chatMessageEvent=" + c2105w;
                                    case SendException.ERROR_TOO_MANY_MESSAGES /* 4 */:
                                        return Ie.K0.A("Trigger_loadUpdates, localMessage_null, messageId: ", c2105w.b);
                                    case 5:
                                        return Ie.K0.A("Trigger_updateMessage, localMessage_generating, messageId: ", c2105w.b);
                                    default:
                                        return Ie.K0.A("Trigger_loadUpdates, localMessage_not_generating, messageId: ", c2105w.b);
                                }
                            }
                        });
                        f0Var.k(c2105w);
                    } else {
                        boolean z4 = C2978a.a;
                        C2978a.a("StreamApiImpl", null, new Function0() { // from class: ve.p0
                            public final Object invoke() {
                                switch (i3) {
                                    case 0:
                                        C2105w c2105w2 = c2105w;
                                        return "Main Room IM event: thread messageId=" + c2105w2.b + ", status=" + c2105w2.c;
                                    case 1:
                                        C2105w c2105w3 = c2105w;
                                        return "Main Room IM event: main messageId=" + c2105w3.b + ", status=" + c2105w3.c;
                                    case 2:
                                        C2105w c2105w4 = c2105w;
                                        return "Thread Room IM event: main messageId=" + c2105w4.b + ", status=" + c2105w4.c;
                                    case SendException.ERROR_TTL_EXCEEDED /* 3 */:
                                        return "checkAndTriggerLoadHistory, chatMessageEvent=" + c2105w;
                                    case SendException.ERROR_TOO_MANY_MESSAGES /* 4 */:
                                        return Ie.K0.A("Trigger_loadUpdates, localMessage_null, messageId: ", c2105w.b);
                                    case 5:
                                        return Ie.K0.A("Trigger_updateMessage, localMessage_generating, messageId: ", c2105w.b);
                                    default:
                                        return Ie.K0.A("Trigger_loadUpdates, localMessage_not_generating, messageId: ", c2105w.b);
                                }
                            }
                        });
                        f0Var.D(str2);
                    }
                }
                return Unit.a;
            default:
                C2117z c2117z = (C2117z) obj;
                C4801l c4801l2 = (C4801l) f0Var.i;
                if (c4801l2 == null) {
                    Intrinsics.l("serviceImpl");
                    throw null;
                }
                boolean z5 = c4801l2.p;
                if (!z5) {
                    boolean z6 = C2978a.a;
                    C2978a.a("StreamApiImpl", null, new C5143o0(f0Var, c2117z));
                    return Unit.a;
                }
                if (z5 && c2117z.a.length() != 0 && Intrinsics.b(c2117z.a, f0Var.o())) {
                    C4795f c4795f = (C4795f) f0Var.h;
                    if (c4795f == null) {
                        Intrinsics.l("chatStream");
                        throw null;
                    }
                    C0639v c0639v = (C0639v) c4795f.c;
                    C4277e c4277e2 = (C4277e) f0Var.g;
                    if (c4277e2 == null) {
                        Intrinsics.l("onEvent");
                        throw null;
                    }
                    String str3 = c2117z.d;
                    if (str3 == null) {
                        str3 = BuildConfig.FLAVOR;
                    }
                    if (str3.length() == 0) {
                        str3 = c0639v.b;
                    }
                    c4277e2.invoke(new ze.U(C0639v.a(c0639v, str3, null, null, null, null, c2117z.c, c2117z.e, null, 124925)));
                    if (c0639v.c() || Intrinsics.b(c2117z.c, Lc.e.d)) {
                        f0Var.x(BuildConfig.FLAVOR);
                    }
                }
                if (Intrinsics.b(c2117z.a, f0Var.o())) {
                    Iterator it = f0Var.p().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (Intrinsics.b(((C3695k0) next).a.a, c2117z.b)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    C3695k0 c3695k0 = (C3695k0) next;
                    Lc.k kVar = c2117z.c;
                    if (Intrinsics.b(kVar, Lc.e.d)) {
                        if (c3695k0 == null) {
                            boolean z7 = C2978a.a;
                            C2978a.a("StreamApiImpl", null, new C5143o0(c2117z, f0Var, 0));
                            f0Var.v();
                        }
                    } else if ((Intrinsics.b(kVar, Lc.c.d) || Intrinsics.b(kVar, Lc.d.d)) && (c3695k0 == null || c3695k0.t())) {
                        boolean z8 = C2978a.a;
                        C2978a.a("StreamApiImpl", null, new C5143o0(c2117z, f0Var, 1));
                        f0Var.v();
                    }
                }
                return Unit.a;
        }
    }
}
