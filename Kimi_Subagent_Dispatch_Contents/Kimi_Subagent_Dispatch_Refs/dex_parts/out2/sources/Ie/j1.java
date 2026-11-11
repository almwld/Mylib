package Ie;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ub.N5;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final /* synthetic */ class j1 implements gl.m {
    public final /* synthetic */ int a;
    public final /* synthetic */ Zd.E b;

    public /* synthetic */ j1(Zd.E e, int i) {
        this.a = i;
        this.b = e;
    }

    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        Zn.L l;
        Zn.L l2;
        switch (this.a) {
            case 0:
                c1.t tVar = (c1.o) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                Intrinsics.checkNotNullParameter((t0.k0) obj, "$this$CommonToolUi");
                Intrinsics.checkNotNullParameter((z1) obj2, "it");
                c1.t tVar2 = tVar;
                if (tVar2.Y(iIntValue & 1, (iIntValue & 129) != 128)) {
                    Zd.D d = Zd.D.o;
                    Qk.F f = Qk.F.d;
                    Sk.w wVar = Qk.C0.a;
                    Intrinsics.checkNotNullParameter(f, "<this>");
                    D.k(this.b, d, N5.e((Zn.L) Qk.C0.n.getValue(), tVar2, 0), null, tVar2, 48, 8);
                } else {
                    tVar2.b0();
                }
                break;
            case 1:
                c1.t tVar3 = (c1.o) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                Qk.F f2 = Qk.F.d;
                Intrinsics.checkNotNullParameter((t0.k0) obj, "$this$CommonToolUi");
                Intrinsics.checkNotNullParameter((z1) obj2, "it");
                c1.t tVar4 = tVar3;
                if (tVar4.Y(iIntValue2 & 1, (iIntValue2 & 129) != 128)) {
                    Zd.D d2 = Zd.D.g;
                    Zd.E e = this.b;
                    if (e.d()) {
                        Sk.w wVar2 = Qk.Z0.a;
                        Intrinsics.checkNotNullParameter(f2, "<this>");
                        l = (Zn.L) Qk.Z0.e0.getValue();
                    } else {
                        Sk.w wVar3 = Qk.Z0.a;
                        Intrinsics.checkNotNullParameter(f2, "<this>");
                        l = (Zn.L) Qk.Z0.g0.getValue();
                    }
                    D.k(e, d2, N5.e(l, tVar4, 0), null, tVar4, 48, 8);
                } else {
                    tVar4.b0();
                }
                break;
            default:
                Qk.F f3 = Qk.F.d;
                c1.t tVar5 = (c1.o) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                Intrinsics.checkNotNullParameter((t0.k0) obj, "$this$CommonToolUi");
                Intrinsics.checkNotNullParameter((z1) obj2, "it");
                c1.t tVar6 = tVar5;
                if (tVar6.Y(iIntValue3 & 1, (iIntValue3 & 129) != 128)) {
                    Zd.D d3 = Zd.D.m;
                    Zd.E e2 = this.b;
                    if (e2.e()) {
                        Sk.w wVar4 = Qk.X.a;
                        Intrinsics.checkNotNullParameter(f3, "<this>");
                        l2 = (Zn.L) Qk.X.m0.getValue();
                    } else if (e2.f()) {
                        Sk.w wVar5 = Qk.X.a;
                        Intrinsics.checkNotNullParameter(f3, "<this>");
                        l2 = (Zn.L) Qk.X.o0.getValue();
                    } else {
                        Sk.w wVar6 = Qk.X.a;
                        Intrinsics.checkNotNullParameter(f3, "<this>");
                        l2 = (Zn.L) Qk.X.n0.getValue();
                    }
                    D.k(e2, d3, N5.e(l2, tVar6, 0), null, tVar6, 48, 8);
                } else {
                    tVar6.b0();
                }
                break;
        }
        return Unit.a;
    }
}
