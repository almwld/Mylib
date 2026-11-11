package ve;

import Uc.C2011a3;
import Uc.C2060k2;
import Uc.C2105w;
import Uc.C2117z;
import Uc.Z1;
import Uc.u3;
import com.moonshot.kimichat.KimiApplication;
import dg.C2978a;
import hg.C3433d;
import hg.C3434e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ld.AbstractC3834A;
import qg.C4262a;
import ti.C4532b;
import vb.N2;

/* JADX INFO: renamed from: ve.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class C5157w implements Pm.i {
    public static final C5157w b = new C5157w(0);
    public static final C5157w c = new C5157w(1);
    public final /* synthetic */ int a;

    public /* synthetic */ C5157w(int i) {
        this.a = i;
    }

    public final Object emit(Object obj, Vk.a aVar) throws C5127g0 {
        Object objA;
        final int i = 1;
        switch (this.a) {
            case 0:
                for (C3433d c3433d : ((C3434e) obj).a) {
                    Q q = Q.a;
                    final Uc.Y y = (Uc.Y) c3433d.b;
                    if (y == null) {
                        Zf.f fVar = Zf.f.a;
                        String str = c3433d.a;
                        if (str != null) {
                            try {
                            } catch (Throwable th2) {
                                boolean z = C2978a.a;
                                C2978a.b("KimiJson", null, new kf.p(5, str, th2));
                            }
                            if (str.length() == 0) {
                                objA = null;
                                y = (Uc.Y) objA;
                            } else {
                                kn.t tVar = Zf.f.c;
                                tVar.getClass();
                                objA = tVar.a(N2.j(Uc.Y.Companion.serializer()), str);
                                y = (Uc.Y) objA;
                            }
                        } else {
                            objA = null;
                            y = (Uc.Y) objA;
                        }
                    }
                    if (y != null) {
                        C2011a3 c2011a3 = y.j;
                        Q q2 = Q.a;
                        boolean z2 = C2978a.a;
                        final int i2 = 0;
                        C2978a.a("GlobalIMManager_processEvent", null, new Function0() { // from class: ve.j
                            public final Object invoke() {
                                C2011a3 c2011a32;
                                C2011a3 c2011a33;
                                switch (i2) {
                                    case 0:
                                        return "Received event: " + y;
                                    case 1:
                                        return "Received chat message: " + y;
                                    case 2:
                                        C2011a3 c2011a34 = y.j;
                                        if (c2011a34 == null) {
                                            C2011a3.Companion.getClass();
                                            c2011a32 = C2011a3.f;
                                        } else {
                                            c2011a32 = c2011a34;
                                        }
                                        String str2 = c2011a32.a;
                                        if (c2011a34 == null) {
                                            C2011a3.Companion.getClass();
                                            c2011a33 = C2011a3.f;
                                        } else {
                                            c2011a33 = c2011a34;
                                        }
                                        AbstractC3834A abstractC3834A = c2011a33.c;
                                        if (c2011a34 == null) {
                                            C2011a3.Companion.getClass();
                                            c2011a34 = C2011a3.f;
                                        }
                                        return "Received subagent status: subagentId=" + str2 + ", status=" + abstractC3834A + ", agentId=" + c2011a34.b;
                                    default:
                                        return "Unhandled event: " + y;
                                }
                            }
                        });
                        C2060k2 c2060k2 = y.b;
                        C2105w c2105w = y.c;
                        if (c2060k2 != null) {
                            KimiApplication kimiApplication = Pf.B.a;
                            Q.e = System.currentTimeMillis();
                        } else {
                            final int i3 = 2;
                            int i4 = 6;
                            if (y.d != null) {
                                C2978a.e("GlobalIMManager", null, new C5128h(2));
                                throw new C5127g0(EnumC5126g.e, null, 6);
                            }
                            if (c2105w != null) {
                                C2978a.a("GlobalIMManager", null, new Function0() { // from class: ve.j
                                    public final Object invoke() {
                                        C2011a3 c2011a32;
                                        C2011a3 c2011a33;
                                        switch (i) {
                                            case 0:
                                                return "Received event: " + y;
                                            case 1:
                                                return "Received chat message: " + y;
                                            case 2:
                                                C2011a3 c2011a34 = y.j;
                                                if (c2011a34 == null) {
                                                    C2011a3.Companion.getClass();
                                                    c2011a32 = C2011a3.f;
                                                } else {
                                                    c2011a32 = c2011a34;
                                                }
                                                String str2 = c2011a32.a;
                                                if (c2011a34 == null) {
                                                    C2011a3.Companion.getClass();
                                                    c2011a33 = C2011a3.f;
                                                } else {
                                                    c2011a33 = c2011a34;
                                                }
                                                AbstractC3834A abstractC3834A = c2011a33.c;
                                                if (c2011a34 == null) {
                                                    C2011a3.Companion.getClass();
                                                    c2011a34 = C2011a3.f;
                                                }
                                                return "Received subagent status: subagentId=" + str2 + ", status=" + abstractC3834A + ", agentId=" + c2011a34.b;
                                            default:
                                                return "Unhandled event: " + y;
                                        }
                                    }
                                });
                                String str2 = c2105w.g;
                                if (str2.length() > 0) {
                                    if (Intrinsics.b(c2105w.f, "sys")) {
                                        Q.h(new C5142o(str2));
                                    } else {
                                        Q.h(new C5140n(str2));
                                    }
                                }
                                Q.g.c(c2105w);
                            } else {
                                u3 u3Var = y.e;
                                if (u3Var != null) {
                                    C2978a.a("GlobalIMManager", null, new C4532b(i4, u3Var));
                                    if (u3Var.a.length() > 0) {
                                        Q.m.c(u3Var);
                                    }
                                } else {
                                    C2117z c2117z = y.h;
                                    if (c2117z != null) {
                                        C2978a.a("GlobalIMManager", null, new C4532b(7, c2117z));
                                        Q.i.c(c2117z);
                                    } else if (c2011a3 != null) {
                                        C2978a.a("GlobalIMManager", null, new Function0() { // from class: ve.j
                                            public final Object invoke() {
                                                C2011a3 c2011a32;
                                                C2011a3 c2011a33;
                                                switch (i3) {
                                                    case 0:
                                                        return "Received event: " + y;
                                                    case 1:
                                                        return "Received chat message: " + y;
                                                    case 2:
                                                        C2011a3 c2011a34 = y.j;
                                                        if (c2011a34 == null) {
                                                            C2011a3.Companion.getClass();
                                                            c2011a32 = C2011a3.f;
                                                        } else {
                                                            c2011a32 = c2011a34;
                                                        }
                                                        String str22 = c2011a32.a;
                                                        if (c2011a34 == null) {
                                                            C2011a3.Companion.getClass();
                                                            c2011a33 = C2011a3.f;
                                                        } else {
                                                            c2011a33 = c2011a34;
                                                        }
                                                        AbstractC3834A abstractC3834A = c2011a33.c;
                                                        if (c2011a34 == null) {
                                                            C2011a3.Companion.getClass();
                                                            c2011a34 = C2011a3.f;
                                                        }
                                                        return "Received subagent status: subagentId=" + str22 + ", status=" + abstractC3834A + ", agentId=" + c2011a34.b;
                                                    default:
                                                        return "Unhandled event: " + y;
                                                }
                                            }
                                        });
                                        Pm.h0 h0Var = Q.k;
                                        if (c2011a3 == null) {
                                            C2011a3.Companion.getClass();
                                            c2011a3 = C2011a3.f;
                                        }
                                        h0Var.c(c2011a3);
                                    } else {
                                        final Zc.u uVar = y.k;
                                        if (uVar != null) {
                                            C2978a.a("GlobalIMManager", null, new Function0() { // from class: ve.k
                                                public final Object invoke() {
                                                    switch (i2) {
                                                        case 0:
                                                            return "Received notification event: notification=" + uVar;
                                                        default:
                                                            Zc.u uVar2 = uVar;
                                                            return "notificationEvents: showing in-app push, deeplink=" + uVar2.d + ", notification=" + uVar2;
                                                    }
                                                }
                                            });
                                            Q.o.c(uVar);
                                        } else {
                                            Z1 z1 = y.n;
                                            if (z1 != null) {
                                                C2978a.a("GlobalIMManager", null, new C4532b(8, z1));
                                                Q.q.c(z1);
                                            } else {
                                                final int i5 = 3;
                                                C2978a.a("GlobalIMManager", null, new Function0() { // from class: ve.j
                                                    public final Object invoke() {
                                                        C2011a3 c2011a32;
                                                        C2011a3 c2011a33;
                                                        switch (i5) {
                                                            case 0:
                                                                return "Received event: " + y;
                                                            case 1:
                                                                return "Received chat message: " + y;
                                                            case 2:
                                                                C2011a3 c2011a34 = y.j;
                                                                if (c2011a34 == null) {
                                                                    C2011a3.Companion.getClass();
                                                                    c2011a32 = C2011a3.f;
                                                                } else {
                                                                    c2011a32 = c2011a34;
                                                                }
                                                                String str22 = c2011a32.a;
                                                                if (c2011a34 == null) {
                                                                    C2011a3.Companion.getClass();
                                                                    c2011a33 = C2011a3.f;
                                                                } else {
                                                                    c2011a33 = c2011a34;
                                                                }
                                                                AbstractC3834A abstractC3834A = c2011a33.c;
                                                                if (c2011a34 == null) {
                                                                    C2011a3.Companion.getClass();
                                                                    c2011a34 = C2011a3.f;
                                                                }
                                                                return "Received subagent status: subagentId=" + str22 + ", status=" + abstractC3834A + ", agentId=" + c2011a34.b;
                                                            default:
                                                                return "Unhandled event: " + y;
                                                        }
                                                    }
                                                });
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                return Unit.a;
            default:
                vj.d dVar = (vj.d) obj;
                boolean z3 = C2978a.a;
                C2978a.a("GlobalIMManager", null, new C4262a(dVar, i));
                if (dVar.d()) {
                    Q q3 = Q.a;
                    Q.d();
                }
                return Unit.a;
        }
    }
}
