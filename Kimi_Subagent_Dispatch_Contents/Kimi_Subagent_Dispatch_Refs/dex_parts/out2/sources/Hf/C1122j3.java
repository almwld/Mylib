package Hf;

import Dc.C0568n;
import Dc.W5;
import bc.C2424a;
import com.google.firebase.encoders.json.BuildConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import je.C3695k0;
import je.C3708r;
import je.C3712t;
import je.EnumC3710s;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ub.AbstractC4766y0;

/* JADX INFO: renamed from: Hf.j3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class C1122j3 extends Xk.i implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ A3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1122j3(A3 a3, Vk.a aVar) {
        super(2, aVar);
        this.b = a3;
    }

    public final Vk.a create(Object obj, Vk.a aVar) {
        C1122j3 c1122j3 = new C1122j3(this.b, aVar);
        c1122j3.a = obj;
        return c1122j3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((Cf.A0) obj, (Vk.a) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        Object next;
        ArrayList arrayList;
        List list;
        Object objPrevious;
        Cf.A0 a0 = (Cf.A0) this.a;
        Wk.a aVar = Wk.a.a;
        P8.a.s(obj);
        int i = A3.m;
        A3 a3 = this.b;
        Cf.P3 p3 = a3.j;
        C0568n c0568n = a0.b;
        String str2 = BuildConfig.FLAVOR;
        if (c0568n == null || (str = c0568n.a) == null) {
            str = BuildConfig.FLAVOR;
        }
        C3695k0 c3695k0 = a0.a;
        Dc.N n = c3695k0.a;
        if (str.length() == 0) {
            List list2 = n.m;
            ListIterator listIterator = list2.listIterator(list2.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
                if (((C0568n) objPrevious).i()) {
                    break;
                }
            }
            C0568n c0568n2 = (C0568n) objPrevious;
            if (c0568n2 == null || (str = c0568n2.a) == null) {
                str = BuildConfig.FLAVOR;
            }
        }
        String str3 = n.a;
        Gf.F1 f1 = new Gf.F1(str3, str, a0.c, null, 48);
        W5 w5 = p3.y0;
        w5.g(f1);
        AbstractC4766y0.a(a3, p3, c0568n, new Aj.o0(17, a3, f1));
        w5.h(new Gf.G1());
        if (!a0.d || c0568n == null) {
            if (a0.c && c0568n != null) {
                C2424a c2424a = Zd.B.b;
                String str4 = c0568n.p().b;
                c2424a.getClass();
                if (C2424a.k(str4) == Zd.B.l1) {
                    Iterator it = c3695k0.g.iterator();
                    loop1: while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        C3708r c3708r = (C3708r) next;
                        if (c3708r.a == EnumC3710s.f) {
                            List list3 = c3708r.b;
                            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                                Iterator it2 = list3.iterator();
                                while (it2.hasNext()) {
                                    if (Intrinsics.b(((C3712t) it2.next()).a.a, c0568n.a)) {
                                        break loop1;
                                    }
                                }
                            }
                        }
                    }
                    C3708r c3708r2 = (C3708r) next;
                    if (c3708r2 == null || (list = c3708r2.b) == null) {
                        arrayList = kotlin.collections.I.a;
                    } else {
                        arrayList = new ArrayList();
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            String str5 = ((C3712t) it3.next()).a.p().b().a;
                            if (str5.length() <= 0) {
                                str5 = null;
                            }
                            if (str5 != null) {
                                arrayList.add(str5);
                            }
                        }
                    }
                    if (!arrayList.contains(w5.f().b)) {
                        String str6 = (String) CollectionsKt.firstOrNull(arrayList);
                        if (str6 != null) {
                            str2 = str6;
                        }
                        a3.I(str2, str3);
                    }
                }
            }
        } else if (c0568n.f()) {
            a3.I(c0568n.a().a, str3);
            Ae.f fVar = Ae.f.a;
            Ae.f.e(p3.p(), (4 & 2) == 0, (4 & 4) != 0);
        } else {
            C2424a c2424a2 = Zd.B.b;
            String str7 = c0568n.p().b;
            c2424a2.getClass();
            if (C2424a.k(str7) == Zd.B.l1) {
                a3.I(c0568n.p().b().a, str3);
                Ae.f fVar2 = Ae.f.a;
                Ae.f.e(p3.p(), (4 & 2) == 0, (4 & 4) != 0);
            } else {
                a3.H(c3695k0, c0568n);
            }
        }
        return Unit.a;
    }
}
