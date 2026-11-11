package jf;

import Ab.C0016c1;
import Cf.P3;
import Dc.C0568n;
import Dc.K7;
import Dc.N;
import Dc.T6;
import Dc.Z6;
import Gf.D1;
import Gf.j2;
import Ie.C1323x0;
import N1.d0;
import Qk.F;
import Ui.q;
import W0.f3;
import W0.l3;
import W0.t3;
import W0.z3;
import Wg.C2233j;
import Zd.B;
import Zn.L;
import a2.U;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import bc.C2424a;
import bf.Q;
import c1.X;
import c1.f0;
import c1.i1;
import c1.s0;
import c1.t;
import c1.z0;
import cf.C2600k;
import com.google.firebase.encoders.json.BuildConfig;
import e2.w;
import ek.K;
import gf.AbstractC3377a;
import gf.AbstractC3384h;
import gf.C3380d;
import gf.C3385i;
import gf.C3392p;
import gf.C3395s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import je.C1;
import je.C3695k0;
import je.C3708r;
import je.C3712t;
import je.EnumC3710s;
import je.z1;
import kotlin.Unit;
import kotlin.collections.A;
import kotlin.collections.CollectionsKt;
import kotlin.collections.E;
import kotlin.collections.I;
import kotlin.collections.z;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ld.AbstractC3834A;
import ld.C3843J;
import ld.C3869v;
import ld.C3871x;
import ng.C4068d;
import t0.r;
import t0.s;
import ub.AbstractC4773y7;
import v0.v;
import v0.x;
import yd.AbstractC5709r0;

/* JADX INFO: renamed from: jf.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public abstract class AbstractC3726a {
    public static final k1.c a = new k1.c(new Vh.e(22), false, -1692930677);

    /* JADX WARN: Removed duplicated region for block: B:40:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(Cf.P3 r20, gf.C3395s r21, c1.o r22, int r23) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jf.AbstractC3726a.a(Cf.P3, gf.s, c1.o, int):void");
    }

    public static final void b(P3 p3, C3395s c3395s, c1.o oVar, int i) {
        C3695k0 c3695k0;
        int i2;
        Object next;
        ArrayList arrayList;
        ArrayList arrayList2;
        C0568n c0568n;
        Object next2;
        C0568n c0568n2;
        Object objPrevious;
        C0568n c0568n3;
        List list;
        Intrinsics.checkNotNullParameter(p3, "model");
        Intrinsics.checkNotNullParameter(c3395s, "okcUiState");
        t tVar = (t) oVar;
        tVar.j0(1644354385);
        c1.d dVar = tVar.a;
        int i3 = i | (tVar.f(p3) ? 4 : 2) | (tVar.f(c3395s) ? 32 : 16);
        if (tVar.Y(i3 & 1, (i3 & 19) != 18)) {
            int i4 = i3 & 14;
            int i5 = i3 & 112;
            int i6 = i3 & 126;
            Intrinsics.checkNotNullParameter(p3, "model");
            Intrinsics.checkNotNullParameter(c3395s, "okcUiState");
            C3695k0 c3695k02 = c3395s.b;
            C0568n c0568n4 = c3395s.c;
            j2 j2VarF = p3.y0.f();
            Map map = (Map) ((C4068d) p3.y0.h).a.getValue();
            Ae.f fVar = Ae.f.a;
            List listD = Ae.f.d(p3.p().a);
            boolean zF = tVar.f(c3695k02) | tVar.f(c0568n4) | tVar.f(j2VarF) | tVar.f(map) | tVar.f(listD);
            Object objT = tVar.T();
            X x = c1.n.a;
            if (zF || objT == x) {
                Iterator it = c3695k02.g.iterator();
                loop0: while (true) {
                    if (!it.hasNext()) {
                        c3695k0 = c3695k02;
                        i2 = i3;
                        next = null;
                        break;
                    }
                    next = it.next();
                    C3708r c3708r = (C3708r) next;
                    c3695k0 = c3695k02;
                    i2 = i3;
                    if (c3708r.a == EnumC3710s.f) {
                        List list2 = c3708r.b;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            Iterator it2 = list2.iterator();
                            while (it2.hasNext()) {
                                if (Intrinsics.b(((C3712t) it2.next()).a.a, c0568n4 != null ? c0568n4.a : null)) {
                                    break loop0;
                                }
                            }
                        }
                    }
                    c3695k02 = c3695k0;
                    i3 = i2;
                }
                C3708r c3708r2 = (C3708r) next;
                if (c3708r2 == null || (list = c3708r2.b) == null) {
                    arrayList = I.a;
                } else {
                    List list3 = list;
                    arrayList = new ArrayList(A.t(list3, 10));
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(((C3712t) it3.next()).a);
                    }
                }
                ArrayList arrayList3 = arrayList;
                AbstractC3834A abstractC3834A = c3695k0.x() ? C3869v.d : C3871x.d;
                ArrayList arrayList4 = new ArrayList();
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    K7 k7B = ((C0568n) it4.next()).p().b();
                    if (k7B.a.length() > 0) {
                        c0568n3 = c0568n4;
                        arrayList4.add(new C3843J(k7B.a, k7B.b, k7B.d, k7B.c, abstractC3834A, 976));
                    } else {
                        c0568n3 = c0568n4;
                    }
                    c0568n4 = c0568n3;
                }
                C0568n c0568n5 = c0568n4;
                if (c0568n5 != null && c0568n5.f() && c0568n5.a().a.length() > 0) {
                    arrayList4.add(new C3843J(c0568n5.a().a, 0, c0568n5.a().c, c0568n5.a().b, abstractC3834A, 978));
                }
                List list4 = listD;
                ArrayList arrayList5 = new ArrayList();
                Iterator it5 = arrayList4.iterator();
                while (it5.hasNext()) {
                    Object next3 = it5.next();
                    C3843J c3843j = (C3843J) next3;
                    Iterator it6 = it5;
                    List list5 = listD;
                    List list6 = listD;
                    if ((list5 instanceof Collection) && list5.isEmpty()) {
                        arrayList5.add(next3);
                    } else {
                        Iterator it7 = list5.iterator();
                        while (it7.hasNext()) {
                            Iterator it8 = it7;
                            if (Intrinsics.b(((C3843J) it7.next()).a, c3843j.a)) {
                                break;
                            } else {
                                it7 = it8;
                            }
                        }
                        arrayList5.add(next3);
                    }
                    it5 = it6;
                    listD = list6;
                }
                ArrayList arrayListJ0 = CollectionsKt.j0(list4, arrayList5);
                HashSet hashSet = new HashSet();
                ArrayList arrayList6 = new ArrayList();
                for (Object obj : arrayListJ0) {
                    if (hashSet.add(((C3843J) obj).a)) {
                        arrayList6.add(obj);
                    }
                }
                List listS0 = CollectionsKt.s0(arrayList6, new C0016c1(29));
                List list7 = (List) map.get(j2VarF.b);
                if (list7 != null) {
                    arrayList2 = new ArrayList();
                    Iterator it9 = list7.iterator();
                    while (it9.hasNext()) {
                        E.y(arrayList2, ((C3695k0) it9.next()).a.m);
                    }
                } else {
                    arrayList2 = null;
                }
                if (arrayList2 != null) {
                    Iterator it10 = arrayList2.iterator();
                    while (true) {
                        if (it10.hasNext()) {
                            next2 = it10.next();
                            if (Intrinsics.b(((C0568n) next2).a, j2VarF.d)) {
                                break;
                            }
                        } else {
                            next2 = null;
                            break;
                        }
                    }
                    C0568n c0568n6 = (C0568n) next2;
                    if (c0568n6 == null) {
                        ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                objPrevious = null;
                                break;
                            }
                            objPrevious = listIterator.previous();
                            C0568n c0568n7 = (C0568n) objPrevious;
                            if (c0568n7.i()) {
                                if (Intrinsics.b(c0568n7.p().g, T6.d)) {
                                    break;
                                }
                                C2424a c2424a = B.b;
                                String str = c0568n7.p().b;
                                c2424a.getClass();
                                if (C2424a.k(str).e()) {
                                    break;
                                }
                            }
                        }
                        c0568n2 = (C0568n) objPrevious;
                    } else {
                        c0568n2 = c0568n6;
                    }
                    c0568n = c0568n2;
                } else {
                    c0568n = null;
                }
                objT = new p(arrayList3, listS0, j2VarF.b, j2VarF.c, c0568n, j2VarF.e, list7);
                tVar.s0(objT);
            } else {
                i2 = i3;
            }
            p pVar = (p) objT;
            Function1 function1 = (Function1) tVar.j(aj.I.j);
            String str2 = pVar.c;
            List list8 = pVar.a;
            List list9 = pVar.b;
            boolean zF2 = tVar.f(pVar) | tVar.f(function1) | (i5 == 32);
            Object objT2 = tVar.T();
            if (zF2 || objT2 == x) {
                objT2 = new m(pVar, function1, c3395s, null);
                tVar.s0(objT2);
            }
            c1.c.g(str2, list8, list9, (Function2) objT2, tVar);
            e(pVar, tVar, 0);
            if (pVar.a()) {
                tVar.h0(-1434301108);
                h(c3395s, true, tVar, ((i2 >> 3) & 14) | 48, 0);
                tVar.q(false);
            } else {
                tVar.h0(-1434094059);
                FillElement fillElement = androidx.compose.foundation.layout.d.c;
                t0.f fVar2 = t0.j.c;
                p1.h hVar = p1.c.m;
                s sVarA = r.a(fVar2, hVar, tVar, 0);
                int iHashCode = Long.hashCode(tVar.T);
                s0 s0VarL = tVar.l();
                p1.r rVarD = p1.a.d(tVar, fillElement);
                P1.k.R0.getClass();
                P1.i iVar = P1.j.b;
                if (dVar == null) {
                    c1.c.v();
                    throw null;
                }
                tVar.l0();
                if (tVar.S) {
                    tVar.k(iVar);
                } else {
                    tVar.v0();
                }
                P1.h hVar2 = P1.j.f;
                c1.c.G(tVar, sVarA, hVar2);
                P1.h hVar3 = P1.j.e;
                c1.c.G(tVar, s0VarL, hVar3);
                P1.h hVar4 = P1.j.g;
                if (tVar.S || !Intrinsics.b(tVar.T(), Integer.valueOf(iHashCode))) {
                    A8.b.r(iHashCode, tVar, iHashCode, hVar4);
                }
                P1.h hVar5 = P1.j.d;
                c1.c.G(tVar, rVarD, hVar5);
                if (1.0f <= 0.0d) {
                    u0.a.a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                s sVarA2 = r.a(fVar2, hVar, tVar, 0);
                int iHashCode2 = Long.hashCode(tVar.T);
                s0 s0VarL2 = tVar.l();
                p1.r rVarD2 = p1.a.d(tVar, layoutWeightElement);
                tVar.l0();
                if (tVar.S) {
                    tVar.k(iVar);
                } else {
                    tVar.v0();
                }
                c1.c.G(tVar, sVarA2, hVar2);
                c1.c.G(tVar, s0VarL2, hVar3);
                if (tVar.S || !Intrinsics.b(tVar.T(), Integer.valueOf(iHashCode2))) {
                    A8.b.r(iHashCode2, tVar, iHashCode2, hVar4);
                }
                c1.c.G(tVar, rVarD2, hVar5);
                d(p3, pVar, tVar, i4);
                tVar.q(true);
                c(p3, c3395s, pVar, tVar, i6);
                tVar.q(true);
                tVar.q(false);
            }
        } else {
            tVar.b0();
        }
        z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new C3385i(p3, c3395s, i, 2);
        }
    }

    public static final void c(P3 p3, C3395s c3395s, p pVar, c1.o oVar, int i) {
        String str = pVar.c;
        t tVar = (t) oVar;
        tVar.j0(-379480395);
        int i2 = i | (tVar.f(c3395s) ? 32 : 16) | (tVar.f(pVar) ? 256 : 128);
        if (tVar.Y(i2 & 1, (i2 & 145) != 144)) {
            Function1 function1 = (Function1) tVar.j(aj.I.j);
            v vVarA = x.a(0, 0, tVar, 0, 3);
            List list = pVar.b;
            boolean zF = tVar.f(str) | tVar.f(list);
            Object objT = tVar.T();
            Object obj = c1.n.a;
            if (zF || objT == obj) {
                Iterator it = list.iterator();
                int i3 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i3 = -1;
                        break;
                    } else if (Intrinsics.b(((C3843J) it.next()).a, str)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i3 < 0) {
                    i3 = 0;
                }
                objT = Integer.valueOf(i3);
                tVar.s0(objT);
            }
            int iIntValue = ((Number) objT).intValue();
            Integer numValueOf = Integer.valueOf(iIntValue);
            boolean zF2 = tVar.f(vVarA) | tVar.d(iIntValue);
            Object objT2 = tVar.T();
            if (zF2 || objT2 == obj) {
                objT2 = new o(vVarA, iIntValue, null);
                tVar.s0(objT2);
            }
            c1.c.f(tVar, numValueOf, (Function2) objT2);
            float f = 12;
            p1.r rVarP = androidx.compose.foundation.layout.a.p(androidx.compose.foundation.layout.d.d(p1.o.a, 1.0f), 0.0f, f, 1);
            d0 d0VarD = t0.n.d(p1.c.e, false);
            int iHashCode = Long.hashCode(tVar.T);
            s0 s0VarL = tVar.l();
            p1.r rVarD = p1.a.d(tVar, rVarP);
            P1.k.R0.getClass();
            P1.i iVar = P1.j.b;
            if (tVar.a == null) {
                c1.c.v();
                throw null;
            }
            tVar.l0();
            if (tVar.S) {
                tVar.k(iVar);
            } else {
                tVar.v0();
            }
            c1.c.G(tVar, d0VarD, P1.j.f);
            c1.c.G(tVar, s0VarL, P1.j.e);
            P1.h hVar = P1.j.g;
            if (tVar.S || !Intrinsics.b(tVar.T(), Integer.valueOf(iHashCode))) {
                A8.b.r(iHashCode, tVar, iHashCode, hVar);
            }
            c1.c.G(tVar, rVarD, P1.j.d);
            t0.d0 d0VarB = androidx.compose.foundation.layout.a.b(2, f, 0.0f);
            t0.h hVarG = t0.j.g(f);
            boolean zF3 = ((i2 & 896) == 256) | tVar.f(function1) | ((i2 & 112) == 32);
            Object objT3 = tVar.T();
            if (zF3 || objT3 == obj) {
                objT3 = new d0.g(pVar, function1, c3395s, 5);
                tVar.s0(objT3);
            }
            AbstractC4773y7.b(null, vVarA, d0VarB, false, hVarG, null, null, false, null, (Function1) objT3, tVar, 24960, 489);
            tVar.q(true);
        } else {
            tVar.b0();
        }
        z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new Xe.b(p3, c3395s, pVar, i, 22);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x022f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(Cf.P3 r17, jf.p r18, c1.o r19, int r20) {
        /*
            Method dump skipped, instruction units count: 667
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jf.AbstractC3726a.d(Cf.P3, jf.p, c1.o, int):void");
    }

    public static final void e(final p pVar, c1.o oVar, final int i) {
        final int i2;
        Object next;
        String str;
        t tVar = (t) oVar;
        tVar.j0(-1684641952);
        int i3 = (tVar.f(pVar) ? 4 : 2) | i;
        final int i4 = 0;
        if (tVar.Y(i3 & 1, (i3 & 3) != 2)) {
            boolean zA = pVar.a();
            D1 d1 = pVar.d;
            if (zA) {
                z0 z0VarV = tVar.v();
                if (z0VarV != null) {
                    z0VarV.d = new Function2(pVar, i, i4) { // from class: jf.l
                        public final /* synthetic */ int a;
                        public final /* synthetic */ p b;

                        {
                            this.a = i4;
                        }

                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.a;
                            c1.o oVar2 = (c1.o) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    AbstractC3726a.e(this.b, oVar2, c1.c.J(1));
                                    break;
                                default:
                                    AbstractC3726a.e(this.b, oVar2, c1.c.J(1));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            Iterator it = pVar.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (Intrinsics.b(((C3843J) next).a, pVar.c)) {
                        break;
                    }
                }
            }
            C3843J c3843j = (C3843J) next;
            if (c3843j == null || (str = c3843j.c) == null) {
                str = BuildConfig.FLAVOR;
            }
            p1.o oVar2 = p1.o.a;
            float f = 12;
            p1.r rVarP = androidx.compose.foundation.layout.a.p(androidx.compose.foundation.layout.d.d(oVar2, 1.0f), f, 0.0f, 2);
            d0 d0VarD = t0.n.d(p1.c.a, false);
            int iHashCode = Long.hashCode(tVar.T);
            s0 s0VarL = tVar.l();
            p1.r rVarD = p1.a.d(tVar, rVarP);
            P1.k.R0.getClass();
            P1.i iVar = P1.j.b;
            if (tVar.a == null) {
                c1.c.v();
                throw null;
            }
            tVar.l0();
            if (tVar.S) {
                tVar.k(iVar);
            } else {
                tVar.v0();
            }
            c1.c.G(tVar, d0VarD, P1.j.f);
            c1.c.G(tVar, s0VarL, P1.j.e);
            P1.h hVar = P1.j.g;
            if (tVar.S || !Intrinsics.b(tVar.T(), Integer.valueOf(iHashCode))) {
                A8.b.r(iHashCode, tVar, iHashCode, hVar);
            }
            c1.c.G(tVar, rVarD, P1.j.d);
            p1.r rVarO = androidx.compose.foundation.layout.a.o(oVar2, f, 8);
            p1.j jVar = p1.c.e;
            androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.a;
            p1.r rVarA = bVar.a(rVarO, jVar);
            U u = ((Ui.e) tVar.j(q.c)).d;
            i1 i1Var = q.a;
            i2 = 1;
            l3.b(str, rVarA, ((Ui.g) tVar.j(i1Var)).F(), 0L, (w) null, (e2.j) null, 0L, new l2.k(3), 0L, 2, false, 1, 0, u, tVar, 0, 24960, 109560);
            tVar = tVar;
            Function1 function1 = (Function1) tVar.j(aj.I.j);
            int i5 = 5;
            z3 z3VarC = t3.c(true, tVar, 48, 5);
            Object objT = tVar.T();
            Object obj = c1.n.a;
            if (objT == obj) {
                objT = c1.c.o(kotlin.coroutines.g.a, tVar);
                tVar.s0(objT);
            }
            Mm.B b = (Mm.B) objT;
            boolean zD = tVar.d(d1.ordinal());
            Object objT2 = tVar.T();
            if (zD || objT2 == obj) {
                Sk.w wVar = Qk.X.a;
                F f2 = F.d;
                Intrinsics.checkNotNullParameter(f2, "<this>");
                mj.k kVar = new mj.k(null, Pf.B.p((L) Qk.X.g.getValue()), null, null, d1 == D1.b, null, null, null, null, new C3380d(z3VarC, b, function1, 2), 32749);
                Intrinsics.checkNotNullParameter(f2, "<this>");
                objT2 = z.m(new mj.k[]{kVar, new mj.k(null, Pf.B.p((L) Qk.X.f.getValue()), null, null, d1 == D1.a, null, null, null, null, new C3380d(z3VarC, b, function1, 3), 32749)});
                tVar.s0(objT2);
            }
            ej.B.B(bVar.a(oVar2, p1.c.f), z3VarC, 0.0f, 0.0f, true, false, 0L, 0.0f, false, k1.h.d(-1593793993, new C1323x0((List) objT2, 3, (byte) 0), tVar), k1.h.d(1661924997, new Ci.i(z3VarC, b, i5), tVar), tVar, 805330944, 492);
            tVar.q(true);
            f3.d(androidx.compose.foundation.layout.d.d(oVar2, 1.0f), (float) 0.5d, ((Ui.g) tVar.j(i1Var)).O(), tVar, 54, 0);
        } else {
            i2 = 1;
            tVar.b0();
        }
        z0 z0VarV2 = tVar.v();
        if (z0VarV2 != null) {
            z0VarV2.d = new Function2(pVar, i, i2) { // from class: jf.l
                public final /* synthetic */ int a;
                public final /* synthetic */ p b;

                {
                    this.a = i2;
                }

                public final Object invoke(Object obj2, Object obj22) {
                    int i52 = this.a;
                    c1.o oVar22 = (c1.o) obj2;
                    ((Integer) obj22).getClass();
                    switch (i52) {
                        case 0:
                            AbstractC3726a.e(this.b, oVar22, c1.c.J(1));
                            break;
                        default:
                            AbstractC3726a.e(this.b, oVar22, c1.c.J(1));
                            break;
                    }
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(P3 p3, C3395s c3395s, String str, List list, c1.o oVar, int i) {
        Object dVar;
        Unit unit;
        v vVar;
        List list2;
        t tVar = (t) oVar;
        tVar.j0(808629780);
        int i2 = i | (tVar.f(p3) ? 4 : 2) | (tVar.f(c3395s) ? 32 : 16) | (tVar.f(str) ? 256 : 128) | (tVar.h(list) ? 2048 : 1024);
        if (tVar.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Function1 function1 = (Function1) tVar.j(aj.I.j);
            Q q = (Q) tVar.j(aj.I.l);
            v vVarA = x.a(0, 0, tVar, 0, 3);
            Unit unit2 = Unit.a;
            boolean zH = ((i2 & 14) == 4) | tVar.h(list) | tVar.f(function1) | tVar.f(q);
            Object objT = tVar.T();
            X x = c1.n.a;
            if (zH || objT == x) {
                unit = unit2;
                vVar = vVarA;
                dVar = new d(p3, list, function1, q, null);
                list2 = list;
                tVar.s0(dVar);
            } else {
                list2 = list;
                unit = unit2;
                dVar = objT;
                vVar = vVarA;
            }
            c1.c.f(tVar, unit, (Function2) dVar);
            int i3 = i2 & 896;
            boolean zF = (i3 == 256) | tVar.f(list2);
            Object objT2 = tVar.T();
            if (zF || objT2 == x) {
                Iterator it = list2.iterator();
                int i4 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i4 = -1;
                        break;
                    } else if (Intrinsics.b(((C0568n) it.next()).a, str)) {
                        break;
                    } else {
                        i4++;
                    }
                }
                if (i4 < 0) {
                    i4 = 0;
                }
                objT2 = Integer.valueOf(i4);
                tVar.s0(objT2);
            }
            int iIntValue = ((Number) objT2).intValue();
            Integer numValueOf = Integer.valueOf(iIntValue);
            boolean zF2 = tVar.f(vVar) | tVar.d(iIntValue);
            Object objT3 = tVar.T();
            if (zF2 || objT3 == x) {
                objT3 = new g(vVar, iIntValue, null);
                tVar.s0(objT3);
            }
            c1.c.f(tVar, numValueOf, (Function2) objT3);
            float f = 12;
            p1.r rVarP = androidx.compose.foundation.layout.a.p(androidx.compose.foundation.layout.d.d(p1.o.a, 1.0f), 0.0f, f, 1);
            d0 d0VarD = t0.n.d(p1.c.e, false);
            int iHashCode = Long.hashCode(tVar.T);
            s0 s0VarL = tVar.l();
            p1.r rVarD = p1.a.d(tVar, rVarP);
            P1.k.R0.getClass();
            P1.i iVar = P1.j.b;
            if (tVar.a == null) {
                c1.c.v();
                throw null;
            }
            tVar.l0();
            if (tVar.S) {
                tVar.k(iVar);
            } else {
                tVar.v0();
            }
            c1.c.G(tVar, d0VarD, P1.j.f);
            c1.c.G(tVar, s0VarL, P1.j.e);
            P1.h hVar = P1.j.g;
            if (tVar.S || !Intrinsics.b(tVar.T(), Integer.valueOf(iHashCode))) {
                A8.b.r(iHashCode, tVar, iHashCode, hVar);
            }
            c1.c.G(tVar, rVarD, P1.j.d);
            t0.d0 d0VarB = androidx.compose.foundation.layout.a.b(2, f, 0.0f);
            t0.h hVarG = t0.j.g(f);
            boolean zH2 = tVar.h(list2) | (i3 == 256) | tVar.f(q) | tVar.f(function1) | ((i2 & 112) == 32);
            Object objT4 = tVar.T();
            if (zH2 || objT4 == x) {
                B4.g gVar = new B4.g(list2, str, q, function1, c3395s, 16);
                tVar.s0(gVar);
                objT4 = gVar;
            }
            AbstractC4773y7.b(null, vVar, d0VarB, false, hVarG, null, null, false, null, (Function1) objT4, tVar, 24960, 489);
            tVar.q(true);
        } else {
            tVar.b0();
        }
        z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new Re.b(p3, c3395s, str, list, i, 23);
        }
    }

    public static final void g(P3 p3, C3395s c3395s, C3392p c3392p, c1.o oVar, int i) {
        N n;
        t tVar = (t) oVar;
        tVar.j0(-2053622937);
        int i2 = i | (tVar.f(p3) ? 4 : 2) | (tVar.f(c3395s) ? 32 : 16) | (tVar.f(c3392p) ? 256 : 128);
        if (tVar.Y(i2 & 1, (i2 & 147) != 146)) {
            C3695k0 c3695k0 = c3392p.f;
            C0568n c0568n = c3392p.d;
            C0568n c0568n2 = c3392p.b;
            Function1 function1 = (Function1) tVar.j(aj.I.j);
            tVar.f0(-2141638290, (c3695k0 == null || (n = c3695k0.a) == null) ? null : n.a);
            v vVarA = x.a(1, 0, tVar, 6, 2);
            tVar.q(false);
            if (c3695k0 == null) {
                tVar.h0(-1966174132);
                kf.a.k(null, tVar, 0, 1);
                tVar.q(false);
            } else if (c3695k0.a.a.length() == 0) {
                tVar.h0(-1966078404);
                if (c0568n2.p().d) {
                    tVar.h0(-1966000067);
                    kf.a.j(c0568n2, tVar, 0);
                    tVar.q(false);
                } else {
                    tVar.h0(-1965933479);
                    AbstractC3384h.c(tVar, 0);
                    tVar.q(false);
                }
                tVar.q(false);
            } else {
                tVar.h0(-1965796831);
                D1 d1 = c3392p.c;
                D1 d12 = D1.a;
                Object obj = c1.n.a;
                if (d1 == d12) {
                    tVar.h0(-1965760964);
                    boolean zF = tVar.f(c3695k0);
                    Object objT = tVar.T();
                    if (zF || objT == obj) {
                        objT = z.m(new C3695k0[]{c3695k0, C3695k0.j});
                        tVar.s0(objT);
                    }
                    List list = (List) objT;
                    p1.r rVarP = androidx.compose.foundation.layout.a.p(p1.o.a, 16, 0.0f, 2);
                    boolean z = c3695k0.t() && c3395s.b.t();
                    Object objT2 = tVar.T();
                    if (objT2 == obj) {
                        objT2 = new K(13);
                        tVar.s0(objT2);
                    }
                    ej.B.k0(rVarP, z, vVarA, list, (Function2) objT2, k1.h.d(452325297, new b(0, list, function1), tVar), tVar, 221190);
                    tVar.q(false);
                } else if (c0568n == null) {
                    tVar.h0(-1963961538);
                    if (c3695k0.t()) {
                        tVar.h0(-1963866709);
                        kf.a.k(null, tVar, 0, 1);
                        tVar.q(false);
                    } else {
                        tVar.h0(-1963914511);
                        AbstractC3384h.c(tVar, 0);
                        tVar.q(false);
                    }
                    tVar.q(false);
                } else {
                    tVar.h0(-1963777956);
                    boolean zF2 = tVar.f(c0568n);
                    Object objT3 = tVar.T();
                    if (zF2 || objT3 == obj) {
                        C2424a c2424a = B.b;
                        String str = c0568n.p().b;
                        c2424a.getClass();
                        objT3 = C2424a.k(str);
                        tVar.s0(objT3);
                    }
                    B b = (B) objT3;
                    boolean z2 = c0568n.p().d || (c0568n.p().r.isEmpty() && !c3695k0.t());
                    boolean z3 = c0568n.p().r.isEmpty() && !b.e();
                    if (z2) {
                        tVar.h0(-1963280902);
                        kf.a.j(c0568n, tVar, 0);
                        tVar.q(false);
                    } else if (z3) {
                        tVar.h0(-1963183624);
                        kf.a.k(c0568n, tVar, 0, 0);
                        tVar.q(false);
                    } else {
                        tVar.h0(-1963089663);
                        Z6 z6P = c3392p.e;
                        if (z6P == null) {
                            z6P = c0568n.p();
                        }
                        AbstractC3377a.d(p3, z6P, tVar, i2 & 14);
                        tVar.q(false);
                    }
                    tVar.q(false);
                }
                tVar.q(false);
            }
        } else {
            tVar.b0();
        }
        z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new Xe.b(p3, c3395s, c3392p, i, 21);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final gf.C3395s r33, boolean r34, c1.o r35, final int r36, final int r37) {
        /*
            Method dump skipped, instruction units count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jf.AbstractC3726a.h(gf.s, boolean, c1.o, int, int):void");
    }

    public static final void i(C3395s c3395s, C0568n c0568n, c1.o oVar, int i) {
        t tVar = (t) oVar;
        tVar.j0(1352330650);
        int i2 = (tVar.f(c3395s) ? 4 : 2) | i | (tVar.f(c0568n) ? 32 : 16);
        if (tVar.Y(i2 & 1, (i2 & 19) != 18)) {
            Object objT = tVar.T();
            X x = c1.n.a;
            if (objT == x) {
                objT = c1.c.z(new C1());
                tVar.s0(objT);
            }
            f0 f0Var = (f0) objT;
            Object objT2 = tVar.T();
            if (objT2 == x) {
                objT2 = c1.c.z(new z1());
                tVar.s0(objT2);
            }
            f0 f0Var2 = (f0) objT2;
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objT3 = tVar.T();
            if (z || objT3 == x) {
                objT3 = new k(c0568n, f0Var, f0Var2, null);
                tVar.s0(objT3);
            }
            c1.c.f(tVar, c0568n, (Function2) objT3);
            float f = AbstractC5709r0.g(tVar).a;
            p1.o oVar2 = p1.o.a;
            p1.r rVarF = androidx.compose.foundation.layout.d.f(androidx.compose.foundation.layout.d.s(oVar2, f), 320);
            d0 d0VarD = t0.n.d(p1.c.a, false);
            int iHashCode = Long.hashCode(tVar.T);
            s0 s0VarL = tVar.l();
            p1.r rVarD = p1.a.d(tVar, rVarF);
            P1.k.R0.getClass();
            P1.i iVar = P1.j.b;
            if (tVar.a == null) {
                c1.c.v();
                throw null;
            }
            tVar.l0();
            if (tVar.S) {
                tVar.k(iVar);
            } else {
                tVar.v0();
            }
            c1.c.G(tVar, d0VarD, P1.j.f);
            c1.c.G(tVar, s0VarL, P1.j.e);
            P1.h hVar = P1.j.g;
            if (tVar.S || !Intrinsics.b(tVar.T(), Integer.valueOf(iHashCode))) {
                A8.b.r(iHashCode, tVar, iHashCode, hVar);
            }
            c1.c.G(tVar, rVarD, P1.j.d);
            v vVarA = x.a(0, 0, tVar, 0, 3);
            float f2 = 16;
            t0.d0 d0Var = new t0.d0(f2, f2, f2, f2);
            boolean z2 = (i3 == 32) | ((i2 & 14) == 4);
            Object objT4 = tVar.T();
            if (z2 || objT4 == x) {
                C2233j c2233j = new C2233j(c0568n, f0Var, f0Var2, c3395s, 8);
                tVar.s0(c2233j);
                objT4 = c2233j;
            }
            AbstractC4773y7.a(null, vVarA, d0Var, false, null, null, null, false, null, (Function1) objT4, tVar, 384, 505);
            tVar = tVar;
            com.moonshot.kimichat.ui.a.i(androidx.compose.foundation.layout.a.l(oVar2, -2, 0.0f, 2), vVarA, false, ((Ui.g) tVar.j(q.a)).J(), 0.0f, null, tVar, 3126, 48);
            tVar.q(true);
        } else {
            tVar.b0();
        }
        z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new C2600k(c3395s, c0568n, i, 15);
        }
    }
}
