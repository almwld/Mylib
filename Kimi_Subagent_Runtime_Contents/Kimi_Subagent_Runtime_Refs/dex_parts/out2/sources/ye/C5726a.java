package ye;

import Ce.J;
import Ce.x;
import Ce.z;
import Dc.C0639v;
import Dc.L3;
import Dc.N;
import I4.y;
import Mc.M3;
import Mm.E;
import Qk.O;
import Ri.B;
import Sk.w;
import Zn.L;
import com.google.firebase.encoders.json.BuildConfig;
import java.util.List;
import je.C3695k0;
import je.C3697l0;
import je.EnumC3699m0;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ue.C4801l;
import ue.EnumC4802m;
import vb.AbstractC4988t4;
import vb.J3;
import zc.C5770A;
import zc.C5801c;
import zc.C5856x0;
import zc.y1;
import ze.C;
import ze.C5863a;
import ze.C5872j;
import ze.C5880s;
import ze.F;
import ze.G;
import ze.H;
import ze.K;
import ze.P;
import ze.a0;
import ze.b0;
import ze.r;

/* JADX INFO: renamed from: ye.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class C5726a implements b0 {
    public final /* synthetic */ int a;

    public /* synthetic */ C5726a(int i) {
        this.a = i;
    }

    @Override // ze.b0
    public final void a(C4801l c4801l, a0 a0Var) {
        String str;
        Ac.c cVarA;
        F f;
        C3695k0 c3695k0;
        C3695k0 c3695k02;
        J j;
        C3695k0 c3695k03;
        N n;
        J j2;
        C3695k0 c3695k04;
        N n2;
        N n3;
        switch (this.a) {
            case 0:
                Intrinsics.checkNotNullParameter(c4801l, "service");
                Intrinsics.checkNotNullParameter(a0Var, "streamEvent");
                if (a0Var instanceof F) {
                    B b = B.a;
                    B.e("chat_streaming", true);
                } else if (!(a0Var instanceof ze.N)) {
                    if (!(a0Var instanceof ze.B)) {
                        if (!(a0Var instanceof C)) {
                            if (a0Var instanceof K) {
                                K k = (K) a0Var;
                                C3697l0 c3697l0 = k.d.b;
                                C5801c c5801c = c3697l0.b;
                                y1 y1Var = c5801c != null ? c5801c.a : null;
                                EnumC3699m0 enumC3699m0 = c3697l0.a;
                                if (enumC3699m0 != EnumC3699m0.d) {
                                    if (enumC3699m0 == EnumC3699m0.e) {
                                        w wVar = O.a;
                                        Intrinsics.checkNotNullParameter(Qk.F.d, "<this>");
                                        Pf.B.L(Pf.B.p((L) O.h.getValue()), null, 6);
                                    }
                                } else if (Intrinsics.b(y1Var, C5770A.d)) {
                                    J3.g();
                                } else if (!Intrinsics.b(y1Var, C5856x0.d)) {
                                    if (c5801c == null || c5801c.c == null) {
                                        if (!CollectionsKt.O(AbstractC5727b.a, c5801c != null ? c5801c.a : null) || AbstractC4988t4.d(k.d, (List) c4801l.j.getValue(), (C0639v) c4801l.i.getValue()) == null) {
                                            if (c5801c == null || (cVarA = c5801c.a()) == null || (str = cVarA.b) == null) {
                                                str = BuildConfig.FLAVOR;
                                            }
                                            if (str.length() <= 0) {
                                                J3.f();
                                            } else {
                                                Pf.B.L(str, null, 6);
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (Intrinsics.b(((C) a0Var).e.a, L3.d)) {
                            J3.g();
                            y.d(5, "chat_stream_block_error", (Function1) null);
                        }
                    } else if (c4801l.p) {
                        B b2 = B.a;
                        B.e("room_message", true);
                    }
                } else if (((ze.N) a0Var).f) {
                    B b3 = B.a;
                    B.e("new_block", true);
                }
                break;
            case 1:
                jk.d dVar = c4801l.e;
                Intrinsics.checkNotNullParameter(c4801l, "service");
                Intrinsics.checkNotNullParameter(a0Var, "streamEvent");
                if (a0Var instanceof G) {
                    E.z(dVar, (CoroutineContext) null, (Mm.C) null, new j(c4801l, ((G) a0Var).d, this, null), 3);
                    break;
                } else if (a0Var instanceof C5872j) {
                    C5872j c5872j = (C5872j) a0Var;
                    if (!c5872j.c && c5872j.g) {
                        List list = c5872j.f;
                        E.z(dVar, (CoroutineContext) null, (Mm.C) null, new j(c4801l, list != null ? (C3695k0) CollectionsKt.firstOrNull(list) : null, this, null), 3);
                        break;
                    }
                } else if ((a0Var instanceof F) && (c3695k0 = (f = (F) a0Var).e) != null && c3695k0.D()) {
                    E.z(dVar, (CoroutineContext) null, (Mm.C) null, new j(c4801l, f.e, this, null), 3);
                    break;
                }
                break;
            case 2:
                Intrinsics.checkNotNullParameter(c4801l, "service");
                Intrinsics.checkNotNullParameter(a0Var, "streamEvent");
                if (a0Var instanceof C5880s) {
                    c4801l.h(EnumC4802m.b);
                    break;
                } else if (a0Var instanceof r) {
                    if (!((r) a0Var).e || c4801l.b.a()) {
                        c4801l.h(EnumC4802m.a);
                    }
                    break;
                } else if (!(a0Var instanceof H) && !(a0Var instanceof F) && !(a0Var instanceof G)) {
                    if (a0Var instanceof ze.J) {
                        c4801l.h(EnumC4802m.c);
                        break;
                    } else if ((a0Var instanceof P) && (c3695k02 = ((P) a0Var).e) != null && c3695k02.t()) {
                        c4801l.h(EnumC4802m.c);
                        break;
                    }
                } else {
                    c4801l.h(EnumC4802m.a);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(c4801l, "service");
                Intrinsics.checkNotNullParameter(a0Var, "streamEvent");
                if (a0Var instanceof ze.L) {
                    J j3 = c4801l.o;
                    if (j3 != null) {
                        ze.L l = (ze.L) a0Var;
                        C3695k0 c3695k05 = l.d;
                        M3 m3 = l.e;
                        Intrinsics.checkNotNullParameter(c3695k05, "messageItem");
                        Intrinsics.checkNotNullParameter(m3, "speech");
                        E.z(j3.g, (CoroutineContext) null, (Mm.C) null, new x(j3, m3, c3695k05, null), 3);
                    }
                    break;
                } else if (a0Var instanceof F) {
                    C3695k0 c3695k06 = ((F) a0Var).e;
                    String str2 = (c3695k06 == null || (n3 = c3695k06.a) == null) ? null : n3.a;
                    J j4 = c4801l.o;
                    if (Intrinsics.b(str2, (j4 == null || (c3695k04 = j4.f) == null || (n2 = c3695k04.a) == null) ? null : n2.a) && (j2 = c4801l.o) != null) {
                        E.z(j2.g, (CoroutineContext) null, (Mm.C) null, new z(j2, false, null), 3);
                        break;
                    }
                } else if (a0Var instanceof G) {
                    J j5 = c4801l.o;
                    if (j5 != null) {
                        E.z(j5.g, (CoroutineContext) null, (Mm.C) null, new z(j5, false, null), 3);
                    }
                    break;
                } else if (a0Var instanceof C5863a) {
                    String str3 = ((C5863a) a0Var).c.a.a;
                    J j6 = c4801l.o;
                    if (Intrinsics.b(str3, (j6 == null || (c3695k03 = j6.f) == null || (n = c3695k03.a) == null) ? null : n.a) && (j = c4801l.o) != null) {
                        E.z(j.g, (CoroutineContext) null, (Mm.C) null, new z(j, false, null), 3);
                        break;
                    }
                }
                break;
        }
    }
}
