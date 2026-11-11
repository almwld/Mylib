package Ie;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ub.N5;

/* JADX INFO: renamed from: Ie.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final /* synthetic */ class C1317u0 implements gl.m {
    public final /* synthetic */ int a;
    public final /* synthetic */ Zd.E b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ C1317u0(Zd.E e, boolean z) {
        this.a = 3;
        this.c = z;
        this.b = e;
    }

    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        Zn.L lA;
        Zn.L l;
        Zn.L l2;
        Zn.L l3;
        int i = this.a;
        boolean z = this.c;
        switch (i) {
            case 0:
                c1.t tVar = (c1.o) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                Qk.F f = Qk.F.d;
                Intrinsics.checkNotNullParameter((t0.k0) obj, "$this$CommonToolUi");
                Intrinsics.checkNotNullParameter((z1) obj2, "it");
                c1.t tVar2 = tVar;
                if (tVar2.Y(iIntValue & 1, (iIntValue & 129) != 128)) {
                    Zd.D d = Zd.D.h;
                    if (z) {
                        Sk.w wVar = Qk.g0.a;
                        Intrinsics.checkNotNullParameter(f, "<this>");
                        lA = (Zn.L) Qk.g0.F0.getValue();
                    } else {
                        lA = Qk.k0.a();
                    }
                    D.k(this.b, d, N5.e(lA, tVar2, 0), null, tVar2, 48, 8);
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
                    Zd.D d2 = Zd.D.e;
                    if (z) {
                        Sk.w wVar2 = Qk.Z0.a;
                        Intrinsics.checkNotNullParameter(f2, "<this>");
                        l = (Zn.L) Qk.Z0.f0.getValue();
                    } else {
                        Sk.w wVar3 = Qk.d1.a;
                        Intrinsics.checkNotNullParameter(f2, "<this>");
                        l = (Zn.L) Qk.d1.a.getValue();
                    }
                    D.k(this.b, d2, N5.e(l, tVar4, 0), null, tVar4, 48, 8);
                } else {
                    tVar4.b0();
                }
                break;
            case 2:
                c1.t tVar5 = (c1.o) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                Qk.F f3 = Qk.F.d;
                Intrinsics.checkNotNullParameter((t0.k0) obj, "$this$CommonToolUi");
                Intrinsics.checkNotNullParameter((z1) obj2, "it");
                c1.t tVar6 = tVar5;
                if (tVar6.Y(iIntValue3 & 1, (iIntValue3 & 129) != 128)) {
                    Zd.D d3 = Zd.D.s;
                    Sk.w wVar4 = Qk.x0.a;
                    if (z) {
                        Intrinsics.checkNotNullParameter(f3, "<this>");
                        l2 = (Zn.L) Qk.x0.p.getValue();
                    } else {
                        Intrinsics.checkNotNullParameter(f3, "<this>");
                        l2 = (Zn.L) Qk.x0.q.getValue();
                    }
                    D.k(this.b, d3, N5.e(l2, tVar6, 0), null, tVar6, 48, 8);
                } else {
                    tVar6.b0();
                }
                break;
            default:
                c1.t tVar7 = (c1.o) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                Qk.F f4 = Qk.F.d;
                Intrinsics.checkNotNullParameter((t0.k0) obj, "$this$CommonToolUi");
                Intrinsics.checkNotNullParameter((z1) obj2, "it");
                c1.t tVar8 = tVar7;
                if (tVar8.Y(iIntValue4 & 1, (iIntValue4 & 129) != 128)) {
                    Sk.w wVar5 = Qk.i1.a;
                    if (z) {
                        Intrinsics.checkNotNullParameter(f4, "<this>");
                        l3 = (Zn.L) Qk.i1.E.getValue();
                    } else {
                        Intrinsics.checkNotNullParameter(f4, "<this>");
                        l3 = (Zn.L) Qk.i1.F.getValue();
                    }
                    D.k(this.b, Zd.D.g, N5.e(l3, tVar8, 0), null, tVar8, 48, 8);
                } else {
                    tVar8.b0();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ C1317u0(Zd.E e, boolean z, int i) {
        this.a = i;
        this.b = e;
        this.c = z;
    }
}
