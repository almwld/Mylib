package ue;

import Ab.E0;
import Aj.c0;
import Dc.AbstractC0616s3;
import Dc.C0497f0;
import Dc.C0551l0;
import Dc.C0568n;
import Dc.C0572n3;
import Dc.C0639v;
import Dc.C0675z;
import Dc.I4;
import Dc.J;
import Dc.L;
import Dc.N;
import Dc.T6;
import Dc.Z0;
import Dm.o;
import Ec.C0720i;
import Ie.W0;
import Mc.C1469e4;
import Mc.H;
import Mc.M3;
import Mm.C;
import Mm.E;
import Mm.j0;
import Mm.y0;
import Uc.E2;
import Uc.O2;
import Zd.B;
import Zd.s;
import Zd.u;
import Zd.w;
import Zd.x;
import bc.C2424a;
import com.google.firebase.encoders.json.BuildConfig;
import com.google.firebase.messaging.SendException;
import com.google.firebase.messaging.ServiceStarter;
import com.moonshot.kimichat.push.PushMessageReceiver;
import dd.C2919P;
import dg.C2978a;
import he.C3425b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import je.C3656N;
import je.C3657O;
import je.C3693j0;
import je.C3695k0;
import je.C3697l0;
import je.F0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.A;
import kotlin.collections.CollectionsKt;
import kotlin.collections.I;
import kotlin.collections.y;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import nf.C4048n0;
import nf.C4054q0;
import qi.C4277e;
import re.C4317A;
import tf.C4503a;
import th.C4529a;
import vb.I2;
import ve.EnumC5131i0;
import ze.AbstractC5865c;
import ze.AbstractC5881t;
import ze.C5863a;
import ze.C5864b;
import ze.C5867e;
import ze.C5868f;
import ze.C5871i;
import ze.C5879q;
import ze.C5880s;
import ze.C5882u;
import ze.C5885x;
import ze.D;
import ze.G;
import ze.K;
import ze.M;
import ze.O;
import ze.P;
import ze.S;
import ze.U;
import ze.V;
import ze.W;
import ze.X;
import ze.Z;
import ze.a0;
import ze.b0;
import ze.r;

/* JADX INFO: renamed from: ue.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class C4795f implements b0 {
    public final /* synthetic */ int a;
    public C4801l b;
    public Object c;
    public Object d;
    public Object e;
    public final Object f;
    public final Object g;

    public C4795f() {
        this.a = 1;
        this.c = new LinkedHashMap();
        this.f = new Kc.b(1);
        this.g = new o(ServiceStarter.ERROR_UNKNOWN);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008e, code lost:
    
        if (r2 == r5) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00da, code lost:
    
        if (r2 == r5) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable b(ue.C4795f r19, java.lang.String r20, Xk.c r21) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ue.C4795f.b(ue.f, java.lang.String, Xk.c):java.io.Serializable");
    }

    public static boolean g(C4795f c4795f, C3695k0 c3695k0, boolean z, Function1 function1, Function1 function12, int i) {
        Object next;
        ArrayList arrayListD0;
        int i2 = 0;
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            function1 = new C4503a(19);
        }
        C4277e c4277e = (C4277e) c4795f.g;
        if (c3695k0 != null) {
            List listB0 = CollectionsKt.B0((Iterable) c4795f.d);
            Iterator it = listB0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                C3695k0 c3695k02 = (C3695k0) next;
                if (Intrinsics.b(c3695k02, c3695k0)) {
                    break;
                }
                String str = c3695k02.d;
                N n = c3695k02.a;
                if (Intrinsics.b(str, c3695k0.d) || (n.a.length() > 0 && Intrinsics.b(n.a, c3695k0.a.a))) {
                    break;
                }
            }
            C3695k0 c3695k03 = (C3695k0) next;
            if (c3695k03 != null && ((Boolean) function1.invoke(c3695k03)).booleanValue()) {
                AbstractC0616s3 abstractC0616s3E = c3695k03.a.e();
                C3697l0 c3697l0 = c3695k03.b;
                int iIndexOf = listB0.indexOf(c3695k03);
                if (iIndexOf != -1) {
                    C3693j0 c3693j0F = C3695k0.F(c3695k03);
                    function12.invoke(c3693j0F);
                    C3695k0 c3695k0A = c3693j0F.a();
                    if (z) {
                        List listC = y.c(c3695k0A);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : listB0) {
                            if (!Intrinsics.b((C3695k0) obj, c3695k03)) {
                                arrayList.add(obj);
                            }
                        }
                        arrayListD0 = CollectionsKt.j0(listC, arrayList);
                    } else {
                        arrayListD0 = CollectionsKt.D0(listB0);
                        arrayListD0.set(iIndexOf, c3695k0A);
                    }
                    c4795f.h(arrayListD0);
                    if (!Intrinsics.b(c3695k0A.a.e(), abstractC0616s3E)) {
                        c4277e.invoke(new M(c3695k0A, abstractC0616s3E));
                        boolean z2 = C2978a.a;
                        C2978a.a("ChatStream", null, new C4054q0(29, c3695k0A, abstractC0616s3E));
                    }
                    if (c3695k0A.b.a != c3697l0.a) {
                        c4277e.invoke(new K(c3695k0A, c3697l0));
                        boolean z3 = C2978a.a;
                        C2978a.a("ChatStream", null, new C4791b(i2, c3695k0A, c3697l0));
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static C0639v i(C0639v c0639v, C0639v c0639v2) {
        C0551l0 c0551l0G;
        String strC = c0639v2.g().c();
        if (strC.length() <= 0) {
            strC = null;
        }
        if (strC == null) {
            strC = c0639v2.f().a;
        }
        if (strC.length() == 0) {
            return c0639v;
        }
        boolean z = c0639v.f().a.length() == 0 && c0639v.f().b.length() == 0;
        boolean z2 = c0639v.g().c().length() == 0 || !Intrinsics.b(c0639v.g().a, C0497f0.d);
        if (!z && !z2) {
            return c0639v;
        }
        C2919P c2919pF = z ? c0639v2.f() : c0639v.f();
        if (z2) {
            C0551l0 c0551l0G2 = c0639v.g();
            C0497f0 c0497f0 = C0497f0.d;
            String strC2 = c0639v.g().c();
            String str = strC2.length() > 0 ? strC2 : null;
            if (str != null) {
                strC = str;
            }
            c0551l0G = C0551l0.a(c0551l0G2, c0497f0, strC);
        } else {
            c0551l0G = c0639v.g();
        }
        return C0639v.a(c0639v, null, null, null, c2919pF, c0551l0G, null, null, null, 130015);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: Sk.o */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v57, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v73, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r20v0, types: [ue.f] */
    /* JADX WARN: Type inference failed for: r2v121, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v130 */
    /* JADX WARN: Type inference failed for: r2v136, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v137 */
    /* JADX WARN: Type inference failed for: r2v140 */
    /* JADX WARN: Type inference failed for: r2v141 */
    /* JADX WARN: Type inference failed for: r2v142 */
    /* JADX WARN: Type inference failed for: r2v143 */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v80, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v91, types: [java.lang.Object, java.util.List] */
    @Override // ze.b0
    public final void a(C4801l c4801l, a0 a0Var) throws Sk.o {
        Object next;
        Object next2;
        Object next3;
        String str;
        Object next4;
        C3695k0 c3695k0;
        C3695k0 c3695k02;
        ArrayList arrayList;
        N n;
        Object next5;
        ?? r2;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        int i = 3;
        switch (this.a) {
            case 0:
                C4801l c4801l2 = this.b;
                Intrinsics.checkNotNullParameter(c4801l, "service");
                Intrinsics.checkNotNullParameter(a0Var, "streamEvent");
                int i2 = 5;
                int i3 = 2;
                boolean z = false;
                boolean z2 = false;
                z = false;
                int i4 = 1;
                if (a0Var instanceof C5879q) {
                    C5879q c5879q = (C5879q) a0Var;
                    C0639v c0639v = c5879q.b;
                    if (c0639v != null) {
                        this.c = i(c0639v, (C0639v) this.c);
                        e();
                    }
                    ?? r22 = this.d;
                    List list = c5879q.d;
                    EnumC5131i0 enumC5131i0 = c5879q.c;
                    Intrinsics.checkNotNullParameter((Object) r22, "oldList");
                    Intrinsics.checkNotNullParameter(list, "newList");
                    Intrinsics.checkNotNullParameter(enumC5131i0, "mergeStrategy");
                    C3695k0 c3695k03 = (C3695k0) CollectionsKt.firstOrNull((List) r22);
                    C3695k0 c3695k04 = (C3695k0) CollectionsKt.firstOrNull(list);
                    if (c3695k03 == null) {
                        boolean z3 = C2978a.a;
                        C2978a.b("ChatStream", null, new C4529a(3));
                        r2 = list;
                    } else if (c3695k04 == null) {
                        boolean z4 = C2978a.a;
                        C2978a.b("ChatStream", null, new C4529a(4));
                        r2 = r22;
                    } else {
                        int iOrdinal = enumC5131i0.ordinal();
                        if (iOrdinal == 0) {
                            if (c3695k04.t()) {
                                Iterator it = ((Iterable) r22).iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        next5 = it.next();
                                        C3695k0 c3695k05 = (C3695k0) next5;
                                        if (!c3695k05.t() || !c3695k05.G(c3695k04) || !Intrinsics.b(c3695k05.a.a, c3695k04.a.a)) {
                                        }
                                    } else {
                                        next5 = null;
                                    }
                                }
                                c3695k02 = (C3695k0) next5;
                            } else {
                                c3695k02 = null;
                            }
                            List<C3695k0> list2 = list;
                            arrayList = new ArrayList(A.t(list2, 10));
                            for (C3695k0 c3695k06 : list2) {
                                if (Intrinsics.b(c3695k06.a.a, (c3695k02 == null || (n = c3695k02.a) == null) ? null : n.a)) {
                                    c3695k06 = c3695k02;
                                }
                                arrayList.add(c3695k06);
                            }
                            boolean z5 = C2978a.a;
                            C2978a.b("ChatStream", null, new C4791b(arrayList, c3695k02, i4));
                        } else if (iOrdinal == 1) {
                            ArrayList arrayListJ0 = CollectionsKt.j0((Collection) r22, list);
                            boolean z6 = C2978a.a;
                            C2978a.b("ChatStream", null, new c0(arrayListJ0, 8));
                            r2 = arrayListJ0;
                        } else if (iOrdinal == 2) {
                            Iterator it2 = list.iterator();
                            int i5 = 0;
                            while (true) {
                                if (!it2.hasNext()) {
                                    i5 = -1;
                                } else if (!Intrinsics.b(((C3695k0) it2.next()).a.a, c3695k03.a.a)) {
                                    i5++;
                                }
                            }
                            boolean z7 = C2978a.a;
                            C2978a.b("ChatStream", null, new C4317A(i5, 1));
                            if (i5 == -1) {
                                C2978a.b("ChatStream", null, new C4529a(5));
                                r2 = r22;
                            } else {
                                C3695k0 c3695k07 = (C3695k0) list.get(i5);
                                C2978a.b("ChatStream", null, new W0(c3695k07, 6));
                                arrayList = c3695k07.G(c3695k03) ? CollectionsKt.j0(list.subList(0, i5 + 1), CollectionsKt.Q((Iterable) r22, 1)) : CollectionsKt.j0(list.subList(0, i5), (Iterable) r22);
                                C2978a.b("ChatStream", null, new Jd.e(arrayList, (List) r22, list));
                            }
                        } else {
                            if (iOrdinal != 3) {
                                throw new Sk.o();
                            }
                            List list3 = list;
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj6 : (Iterable) r22) {
                                if (z2) {
                                    arrayList2.add(obj6);
                                } else {
                                    C3695k0 c3695k08 = (C3695k0) obj6;
                                    List list4 = list;
                                    if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                                        Iterator it3 = list4.iterator();
                                        while (it3.hasNext()) {
                                            if (Intrinsics.b(((C3695k0) it3.next()).a.a, c3695k08.a.a)) {
                                            }
                                            break;
                                        }
                                    }
                                    arrayList2.add(obj6);
                                    z2 = true;
                                }
                            }
                            ArrayList arrayListJ02 = CollectionsKt.j0(list3, arrayList2);
                            boolean z8 = C2978a.a;
                            C2978a.b("ChatStream", null, new c0(arrayListJ02, 7));
                            r2 = arrayListJ02;
                        }
                        r2 = arrayList;
                    }
                    h(r2);
                    return;
                }
                if (a0Var instanceof C5867e) {
                    h(I.a);
                    return;
                }
                if (a0Var instanceof AbstractC5865c) {
                    AbstractC5865c abstractC5865c = (AbstractC5865c) a0Var;
                    if (abstractC5865c instanceof C5864b) {
                        g(this, ((C5864b) abstractC5865c).c, false, null, new C4503a(17), 6);
                        return;
                    } else {
                        if (!(abstractC5865c instanceof C5863a)) {
                            throw new Sk.o();
                        }
                        g(this, ((C5863a) abstractC5865c).c, false, null, new C4503a(18), 6);
                        return;
                    }
                }
                if (a0Var instanceof AbstractC5881t) {
                    AbstractC5881t abstractC5881t = (AbstractC5881t) a0Var;
                    LinkedHashMap linkedHashMap = (LinkedHashMap) this.f;
                    if (!(abstractC5881t instanceof C5880s)) {
                        if (!(abstractC5881t instanceof r)) {
                            throw new Sk.o();
                        }
                        r rVar = (r) abstractC5881t;
                        C3695k0 c3695k09 = rVar.d;
                        j0 j0Var = (j0) linkedHashMap.get(c3695k09 != null ? c3695k09.d : null);
                        if (j0Var != null) {
                            j0Var.m((CancellationException) null);
                            C3695k0 c3695k010 = rVar.d;
                        }
                        g(this, rVar.d, false, null, new C4793d(z ? 1 : 0, abstractC5881t), 6);
                        return;
                    }
                    C5880s c5880s = (C5880s) abstractC5881t;
                    E0 e0 = c5880s.c.a;
                    if (((e0 instanceof x) || (e0 instanceof s) || (e0 instanceof u) || (e0 instanceof w)) && (c3695k0 = c5880s.d) != null) {
                        C3693j0 c3693j0F = C3695k0.F(c3695k0);
                        c3693j0F.e.d = c5880s.c;
                        c(c3693j0F.a());
                        linkedHashMap.put(c3695k0.d, E.z(c4801l2.e, (CoroutineContext) null, (C) null, new C4794e(this, c3695k0, null), 3));
                        return;
                    }
                    return;
                }
                int i6 = 29;
                if (a0Var instanceof Z) {
                    Z z9 = (Z) a0Var;
                    if (z9 instanceof X) {
                        X x = (X) z9;
                        boolean z10 = x.e;
                        C3695k0 c3695k011 = x.c;
                        if (z10) {
                            g(this, x.c, false, null, new l1.c(29, x.d ? c3695k011.B() ? Dc.K.d : L.d : c3695k011.A() ? Dc.K.d : J.d), 6);
                            return;
                        }
                    }
                } else {
                    if (a0Var instanceof U) {
                        this.c = i(((U) a0Var).b, (C0639v) this.c);
                        e();
                        return;
                    }
                    if (a0Var instanceof P) {
                        P p = (P) a0Var;
                        Zd.A a = p.d;
                        H h = p.f;
                        C4277e c4277e = (C4277e) this.g;
                        Intrinsics.checkNotNullParameter(h, "response");
                        C3695k0 c3695k012 = a != null ? a.c : null;
                        switch (h.b().ordinal()) {
                            case 0:
                            case 5:
                            case PushMessageReceiver.$stable /* 8 */:
                            case 11:
                                return;
                            case 1:
                                C0639v c0639v2 = h.d;
                                if (c0639v2 == null) {
                                    C0639v.Companion.getClass();
                                    c0639v2 = C0639v.s;
                                }
                                C0639v c0639vI = i(c0639v2, (C0639v) this.c);
                                String str2 = c0639vI.a;
                                String str3 = c0639vI.b;
                                if (!StringsKt.W(str2) && !Intrinsics.b(((C0639v) this.c).a, c0639vI.a)) {
                                    this.c = c0639vI;
                                    c4277e.invoke(new ze.E(c0639vI));
                                }
                                C0675z c0675zD = I2.d((C0639v) this.c);
                                if (str3.length() > 0) {
                                    Intrinsics.checkNotNullParameter(str3, "<set-?>");
                                    c0675zD.b = str3;
                                }
                                if (c0639vI.h != null) {
                                    c0675zD.h = I2.B(c0639vI.e());
                                }
                                this.c = c0675zD.a();
                                e();
                                return;
                            case 2:
                                N nC = h.c();
                                Iterator it4 = ((Iterable) this.d).iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        next = it4.next();
                                        C3695k0 c3695k013 = (C3695k0) next;
                                        if (c3695k013.a.a.length() <= 0 || !Intrinsics.b(c3695k013.a.a, nC.a)) {
                                        }
                                    } else {
                                        next = null;
                                    }
                                }
                                C3695k0 c3695k014 = (C3695k0) next;
                                if (c3695k014 == null) {
                                    Intrinsics.checkNotNullParameter(nC, "<this>");
                                    if (Intrinsics.b(nC.c, I4.d)) {
                                        Iterator it5 = ((Iterable) this.d).iterator();
                                        while (true) {
                                            if (it5.hasNext()) {
                                                next2 = it5.next();
                                                C3695k0 c3695k015 = (C3695k0) next2;
                                                if (c3695k012 == null || (str = c3695k012.d) == null || str.length() <= 0 || !Intrinsics.b(c3695k015.d, str)) {
                                                }
                                            } else {
                                                next2 = null;
                                            }
                                        }
                                        c3695k014 = (C3695k0) next2;
                                        Iterator it6 = ((Iterable) this.d).iterator();
                                        while (true) {
                                            if (it6.hasNext()) {
                                                next3 = it6.next();
                                                C3695k0 c3695k016 = (C3695k0) next3;
                                                if (!c3695k016.z() || c3695k016.a.a.length() != 0) {
                                                }
                                            } else {
                                                next3 = null;
                                            }
                                        }
                                        C3695k0 c3695k017 = (C3695k0) next3;
                                        if (c3695k014 == null) {
                                            c3695k014 = c3695k017;
                                        }
                                    } else {
                                        c3695k014 = null;
                                    }
                                }
                                if (c3695k014 != null) {
                                    boolean z11 = C2978a.a;
                                    C2978a.a("ChatStream2", null, new W0(c3695k014, i2));
                                    Intrinsics.checkNotNullParameter(nC, "<this>");
                                    g(this, c3695k014, (Intrinsics.b(nC.c, I4.d) && c3695k014.a.a.length() == 0) || (Intrinsics.b(nC.e(), C0572n3.d) && !Intrinsics.b(c4801l2.b.b, E2.d)), null, new C4790a(h, z ? 1 : 0), 4);
                                } else {
                                    c(new C3695k0(nC, (C3697l0) null, 0, new C3657O(a, 62), (F0) null, 46));
                                }
                                c4277e.invoke(new ze.J((C3695k0) CollectionsKt.firstOrNull((List) this.d)));
                                return;
                            case SendException.ERROR_TTL_EXCEEDED /* 3 */:
                                kotlin.jvm.internal.E e = new kotlin.jvm.internal.E();
                                Iterator it7 = ((Iterable) this.d).iterator();
                                while (true) {
                                    if (it7.hasNext()) {
                                        next4 = it7.next();
                                        if (Intrinsics.b(((C3695k0) next4).a.e(), C0572n3.d)) {
                                        }
                                    } else {
                                        next4 = null;
                                    }
                                }
                                g(this, (C3695k0) next4, false, null, new C4048n0(i6, h, e), 6);
                                C3695k0 c3695k018 = (C3695k0) CollectionsKt.firstOrNull((List) this.d);
                                if (c3695k018 != null) {
                                    N n2 = c3695k018.a;
                                    if (h.a().C != null) {
                                        Z0 z0 = h.a().C;
                                        if (z0 == null) {
                                            Z0.Companion.getClass();
                                            z0 = Z0.e;
                                        }
                                        c4277e.invoke(new ze.C(c3695k018, z0));
                                    }
                                    List list5 = n2.m;
                                    C0568n c0568n = (C0568n) CollectionsKt.d0(list5);
                                    if (e.a && c0568n != null) {
                                        ArrayList arrayList3 = new ArrayList();
                                        for (Object obj7 : list5) {
                                            C0568n c0568n2 = (C0568n) obj7;
                                            if (c0568n2.h() || c0568n2.g != null) {
                                                arrayList3.add(obj7);
                                            }
                                        }
                                        if (arrayList3.size() == 1 && (c0568n.h() || c0568n.g != null)) {
                                            z = true;
                                        }
                                        c4277e.invoke(new ze.N(c3695k018, c0568n, z));
                                    }
                                    Iterator it8 = list5.iterator();
                                    while (true) {
                                        if (it8.hasNext()) {
                                            Object next6 = it8.next();
                                            if (Intrinsics.b(((C0568n) next6).a, h.a().a)) {
                                                obj5 = next6;
                                            }
                                        }
                                    }
                                    C0568n c0568n3 = (C0568n) obj5;
                                    if (c0568n3 != null) {
                                        c4277e.invoke(new D(c3695k018, h.a(), c0568n3));
                                        C2424a c2424a = B.b;
                                        String str4 = c0568n3.p().b;
                                        c2424a.getClass();
                                        B bK = C2424a.k(str4);
                                        if (Intrinsics.b(c0568n3.p().g, T6.d) && bK == B.r1) {
                                            c4801l2.e(BuildConfig.FLAVOR);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case SendException.ERROR_TOO_MANY_MESSAGES /* 4 */:
                                Iterator it9 = ((Iterable) this.d).iterator();
                                while (true) {
                                    if (it9.hasNext()) {
                                        Object next7 = it9.next();
                                        if (Intrinsics.b(((C3695k0) next7).a.e(), C0572n3.d)) {
                                            obj4 = next7;
                                        }
                                    }
                                }
                                g(this, (C3695k0) obj4, false, null, new C4790a(h, i4), 6);
                                return;
                            case 6:
                                Iterator it10 = ((Iterable) this.d).iterator();
                                while (true) {
                                    if (it10.hasNext()) {
                                        Object next8 = it10.next();
                                        if (Intrinsics.b(((C3695k0) next8).a.e(), C0572n3.d)) {
                                            obj3 = next8;
                                        }
                                    }
                                }
                                g(this, (C3695k0) obj3, false, null, new C4790a(h, i3), 6);
                                C3695k0 c3695k019 = (C3695k0) CollectionsKt.firstOrNull((List) this.d);
                                if (c3695k019 != null) {
                                    C1469e4 c1469e4 = h.i;
                                    if (c1469e4 == null) {
                                        C1469e4.Companion.getClass();
                                        c1469e4 = C1469e4.e;
                                    }
                                    c4277e.invoke(new O(c3695k019, c1469e4));
                                    return;
                                }
                                return;
                            case 7:
                                c4277e.invoke(new G((C3695k0) CollectionsKt.firstOrNull((List) this.d)));
                                e();
                                return;
                            case 9:
                                Iterator it11 = ((Iterable) this.d).iterator();
                                while (true) {
                                    if (it11.hasNext()) {
                                        Object next9 = it11.next();
                                        if (((C3695k0) next9).n()) {
                                            obj2 = next9;
                                        }
                                    }
                                }
                                C3695k0 c3695k020 = (C3695k0) obj2;
                                if (c3695k020 != null) {
                                    M3 m3 = h.l;
                                    if (m3 == null) {
                                        M3.Companion.getClass();
                                        m3 = M3.f;
                                    }
                                    c4277e.invoke(new ze.L(c3695k020, m3));
                                    return;
                                }
                                return;
                            case 10:
                                Iterator it12 = ((Iterable) this.d).iterator();
                                while (true) {
                                    if (it12.hasNext()) {
                                        Object next10 = it12.next();
                                        if (Intrinsics.b(((C3695k0) next10).a.e(), C0572n3.d)) {
                                            obj = next10;
                                        }
                                    }
                                }
                                g(this, (C3695k0) obj, false, null, new C4790a(h, i), 6);
                                C3695k0 c3695k021 = (C3695k0) CollectionsKt.firstOrNull((List) this.d);
                                C0720i c0720i = h.m;
                                if (c0720i == null) {
                                    C0720i.Companion.getClass();
                                    c0720i = C0720i.h;
                                }
                                c4277e.invoke(new ze.I(c3695k021, c0720i));
                                return;
                            default:
                                throw new Sk.o();
                        }
                    }
                    if (a0Var instanceof ze.H) {
                        ze.H h2 = (ze.H) a0Var;
                        C3695k0 c3695k022 = h2.d;
                        if (c3695k022 == null) {
                            return;
                        }
                        g(this, c3695k022, false, new C4503a(16), new l1.c(27, h2), 2);
                        return;
                    }
                    if (!(a0Var instanceof C5868f)) {
                        if (a0Var instanceof V) {
                            this.c = C0639v.a((C0639v) this.c, null, ((V) a0Var).b, null, null, null, null, null, null, 131063);
                            e();
                            return;
                        }
                        if (!(a0Var instanceof C5885x)) {
                            if (!(a0Var instanceof C5871i)) {
                                if (a0Var instanceof W) {
                                    boolean z12 = C2978a.a;
                                    C2978a.b("ChatStream", null, new C4792c(a0Var, z ? 1 : 0));
                                    g(this, ((W) a0Var).b, false, null, new l1.c(28, a0Var), 6);
                                    return;
                                }
                                return;
                            }
                            C5871i c5871i = (C5871i) a0Var;
                            O2 o2 = c5871i.d;
                            String str5 = o2 != null ? o2.a : null;
                            if (str5 == null || str5.length() <= 0) {
                                return;
                            }
                            g(this, c5871i.c, false, null, new C3425b(str5, i3), 6);
                            return;
                        }
                        if (((C5885x) a0Var).b) {
                            return;
                        }
                        Iterable iterable = (Iterable) this.d;
                        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                            return;
                        }
                        Iterator it13 = iterable.iterator();
                        while (it13.hasNext()) {
                            if (!((C3695k0) it13.next()).e.c.isEmpty()) {
                                Iterable iterable2 = (Iterable) this.d;
                                ArrayList arrayList4 = new ArrayList(A.t(iterable2, 10));
                                Iterator it14 = iterable2.iterator();
                                while (it14.hasNext()) {
                                    C3693j0 c3693j0F2 = C3695k0.F((C3695k0) it14.next());
                                    C3656N c3656n = c3693j0F2.e;
                                    ArrayList arrayList5 = new ArrayList();
                                    c3656n.getClass();
                                    Intrinsics.checkNotNullParameter(arrayList5, "<set-?>");
                                    c3656n.e = arrayList5;
                                    arrayList4.add(c3693j0F2.a());
                                }
                                this.d = arrayList4;
                                return;
                            }
                        }
                        return;
                    }
                    C5868f c5868f = (C5868f) a0Var;
                    if (c5868f.f) {
                        g(this, c5868f.e, false, null, new C4503a(15), 6);
                        return;
                    }
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(c4801l, "service");
                Intrinsics.checkNotNullParameter(a0Var, "streamEvent");
                this.b = c4801l;
                if (a0Var instanceof S) {
                    S s = (S) a0Var;
                    String str6 = s.b;
                    boolean z13 = s.c;
                    if (str6.length() == 0) {
                        return;
                    }
                    y0 y0Var = (y0) this.e;
                    if (y0Var != null) {
                        y0Var.m((CancellationException) null);
                    }
                    C4801l c4801l3 = this.b;
                    if (c4801l3 != null) {
                        this.e = E.z(c4801l3.e, (CoroutineContext) null, (C) null, new ye.l(this, str6, z13, null), 3);
                        return;
                    } else {
                        Intrinsics.l("service");
                        throw null;
                    }
                }
                return;
        }
    }

    public void c(C3695k0 c3695k0) {
        C4277e c4277e = (C4277e) this.g;
        boolean zN = c3695k0.n();
        N n = c3695k0.a;
        if (zN && n.a.length() == 0) {
            return;
        }
        c4277e.invoke(new C5882u(c3695k0));
        c4277e.invoke(new M(c3695k0, null));
        List listC = y.c(c3695k0);
        Iterable iterable = (Iterable) this.d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            C3695k0 c3695k02 = (C3695k0) obj;
            String str = c3695k02.d;
            N n2 = c3695k02.a;
            if (!Intrinsics.b(str, c3695k0.d) && (n2.a.length() <= 0 || !Intrinsics.b(n2.a, n.a))) {
                arrayList.add(obj);
            }
        }
        h(CollectionsKt.j0(listC, arrayList));
        boolean z = C2978a.a;
        C2978a.a("ChatStream", null, new W0(c3695k0, 7));
    }

    public void d(boolean z) {
        if (z && ((o) this.g).c()) {
            return;
        }
        C4801l c4801l = this.b;
        if (c4801l == null) {
            Intrinsics.l("service");
            throw null;
        }
        Map map = (Map) this.c;
        Intrinsics.checkNotNullParameter(map, "agentMessages");
        c4801l.l.j(map);
        boolean z2 = C2978a.a;
        C2978a.a("StreamServiceImpl", null, new Fh.W(map, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x010f  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e() {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ue.C4795f.e():void");
    }

    public void f(String str, String str2, Function1 function1) {
        List list = (List) ((Map) this.c).get(str);
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.b(((C3695k0) it.next()).a.a, str2)) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        C3693j0 c3693j0F = C3695k0.F((C3695k0) list.get(i));
        function1.invoke(c3693j0F);
        C3695k0 c3695k0A = c3693j0F.a();
        Map map = (Map) this.c;
        ArrayList arrayListD0 = CollectionsKt.D0(list);
        arrayListD0.set(i, c3695k0A);
        Unit unit = Unit.a;
        this.c = kotlin.collections.P.k(map, new Pair(str, arrayListD0));
    }

    public void h(List list) {
        Intrinsics.checkNotNullParameter(list, "newMessages");
        HashSet hashSet = new HashSet(list.size());
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C3695k0 c3695k0 = (C3695k0) obj;
            String str = c3695k0.a.a;
            if (StringsKt.W(str)) {
                str = c3695k0.d;
            }
            if (StringsKt.W(str) || hashSet.add(str)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() != list.size()) {
            boolean z = C2978a.a;
            C2978a.b("ChatStream", null, new C4791b(2, list, arrayList));
        }
        this.d = CollectionsKt.D0(arrayList);
        e();
    }

    public C4795f(C0639v c0639v, C4801l c4801l) {
        this.a = 0;
        Intrinsics.checkNotNullParameter(c0639v, "originChat");
        Intrinsics.checkNotNullParameter(c4801l, "serviceImpl");
        this.b = c4801l;
        this.c = c0639v;
        I i = I.a;
        this.d = i;
        this.f = new LinkedHashMap();
        this.g = new C4277e(1, c4801l, C4801l.class, "onEvent", "onEvent(Lcom/moonshot/kimichat/chat/stream/service/StreamEvent;)V", 0, 6);
        this.e = i;
    }
}
