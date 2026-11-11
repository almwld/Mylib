package Ie;

import Dc.C0549k7;
import Dc.C0568n;
import Je.AbstractC1329a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ub.AbstractC4610g5;
import ub.I7;
import ub.N5;

/* JADX INFO: renamed from: Ie.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final /* synthetic */ class C1319v0 implements gl.m {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C1319v0(Zd.B b, C0568n c0568n, String str, boolean z) {
        this.a = 1;
        this.d = b;
        this.e = c0568n;
        this.b = str;
        this.c = z;
    }

    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        Zn.L l;
        int i = this.a;
        boolean z = this.c;
        Object obj5 = this.b;
        Object obj6 = this.e;
        Object obj7 = this.d;
        switch (i) {
            case 0:
                List list = (List) obj7;
                c1.h1 h1Var = (c1.h1) obj6;
                String str = (String) obj5;
                t0.k0 k0Var = (t0.k0) obj;
                c1.t tVar = (c1.o) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                Intrinsics.checkNotNullParameter(k0Var, "$this$CommonToolUi");
                Intrinsics.checkNotNullParameter((z1) obj2, "it");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= tVar.f(k0Var) ? 4 : 2;
                }
                c1.t tVar2 = tVar;
                if (tVar2.Y(iIntValue & 1, (iIntValue & 131) != 130)) {
                    a2.U uA = a2.U.a(((Ui.e) tVar2.j(Ui.q.c)).h, ((Ui.g) tVar2.j(Ui.q.a)).E(), 0L, (e2.w) null, (e2.q) null, (e2.j) null, 0L, (l2.l) null, (w1.P) null, 0, 0L, (a2.C) null, (l2.i) null, 0, 16777214);
                    List list2 = z ? (List) h1Var.getValue() : kotlin.collections.I.a;
                    StringBuilder sb2 = new StringBuilder(16);
                    ArrayList arrayListM = g6.a.m();
                    new ArrayList();
                    sb2.append(str);
                    String string = sb2.toString();
                    ArrayList arrayList = new ArrayList(arrayListM.size());
                    int size = arrayListM.size();
                    for (int iE = 0; iE < size; iE = S0.b.e(sb2, (a2.c) arrayListM.get(iE), arrayList, iE, 1)) {
                    }
                    D.i(k0Var, null, false, list2, new a2.g(string, arrayList), !list.isEmpty(), false, uA, tVar2, iIntValue & 14, 71);
                } else {
                    tVar2.b0();
                }
                break;
            case 1:
                Zd.B b = (Zd.B) obj7;
                C0568n c0568n = (C0568n) obj6;
                String str2 = (String) obj5;
                c1.t tVar3 = (c1.o) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                Intrinsics.checkNotNullParameter((t0.t) obj, "$this$CommonToolUi");
                Intrinsics.checkNotNullParameter((z1) obj2, "it");
                c1.t tVar4 = tVar3;
                if (tVar4.Y(iIntValue2 & 1, (iIntValue2 & 129) != 128)) {
                    AbstractC1329a.u(b, c0568n, str2, this.c, tVar4, 0);
                } else {
                    tVar4.b0();
                }
                break;
            case 2:
                C0568n c0568n2 = (C0568n) obj7;
                C0549k7 c0549k7 = (C0549k7) obj6;
                Zd.E e = (Zd.E) obj5;
                c1.t tVar5 = (c1.o) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                Qk.F f = Qk.F.d;
                Intrinsics.checkNotNullParameter((t0.k0) obj, "$this$CommonToolUi");
                Intrinsics.checkNotNullParameter((z1) obj2, "it");
                c1.t tVar6 = tVar5;
                if (tVar6.Y(iIntValue3 & 1, (iIntValue3 & 129) != 128)) {
                    if (!z) {
                        Sk.w wVar = Qk.q1.a;
                        Intrinsics.checkNotNullParameter(f, "<this>");
                        l = (Zn.L) Qk.q1.q.getValue();
                    } else if (!c0568n2.p().d) {
                        Sk.w wVar2 = Qk.q1.a;
                        Intrinsics.checkNotNullParameter(f, "<this>");
                        l = (Zn.L) Qk.q1.r.getValue();
                    } else if (I7.e(c0549k7)) {
                        Sk.w wVar3 = Qk.q1.a;
                        Intrinsics.checkNotNullParameter(f, "<this>");
                        l = (Zn.L) Qk.q1.t.getValue();
                    } else {
                        Sk.w wVar4 = Qk.q1.a;
                        Intrinsics.checkNotNullParameter(f, "<this>");
                        l = (Zn.L) Qk.q1.s.getValue();
                    }
                    D.k(e, Zd.D.p, N5.e(l, tVar6, 0), null, tVar6, 48, 8);
                } else {
                    tVar6.b0();
                }
                break;
            default:
                List list3 = (List) obj7;
                a2.U u = (a2.U) obj6;
                List list4 = (List) obj5;
                int iIntValue4 = ((Integer) obj2).intValue();
                c1.o oVar = (c1.o) obj3;
                ((Integer) obj4).getClass();
                Intrinsics.checkNotNullParameter((i0.k) obj, "$this$AnimatedContent");
                AbstractC4610g5.a(new a2.g((String) ((iIntValue4 < 0 || iIntValue4 >= list3.size()) ? CollectionsKt.U(list3) : list3.get(iIntValue4))), null, this.c, u, list4, 0, 0.0f, oVar, 0, 226);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ C1319v0(List list, boolean z, a2.U u, List list2) {
        this.a = 3;
        this.d = list;
        this.c = z;
        this.e = u;
        this.b = list2;
    }

    public /* synthetic */ C1319v0(boolean z, Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.c = z;
        this.d = obj;
        this.e = obj2;
        this.b = obj3;
    }
}
