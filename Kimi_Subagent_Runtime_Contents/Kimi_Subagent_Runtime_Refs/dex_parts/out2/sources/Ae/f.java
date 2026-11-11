package Ae;

import Dc.C0639v;
import Dc.X4;
import Mm.C;
import Mm.E;
import Mm.j0;
import Pf.B;
import com.moonshot.kimichat.KimiApplication;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.collections.I;
import kotlin.collections.P;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import ld.C3843J;
import ld.C3869v;
import ld.C3870w;
import ng.C4068d;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class f {
    public static final f a = new f();
    public static final Kc.b b = new Kc.b(1);
    public static final jk.d c = Sf.d.a("SwarmDataCenter");
    public static final C4068d d = new C4068d(P.d());
    public static final LinkedHashMap e = new LinkedHashMap();
    public static final LinkedHashMap f = new LinkedHashMap();

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(java.lang.String r11, Xk.c r12) {
        /*
            boolean r0 = r12 instanceof Ae.c
            if (r0 == 0) goto L13
            r0 = r12
            Ae.c r0 = (Ae.c) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            Ae.c r0 = new Ae.c
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.b
            Wk.a r1 = Wk.a.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r11 = r0.a
            P8.a.s(r12)
            goto L75
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            P8.a.s(r12)
            ld.o r5 = new ld.o
            r5.<init>(r11, r3)
            r0.a = r11
            r0.c = r3
            Kc.b r12 = Ae.f.b
            xc.b r12 = r12.a
            eg.Q r2 = eg.C3109Q.a
            boolean r2 = eg.C3109Q.h()
            if (r2 == 0) goto L4d
            qk.i r2 = eg.C3109Q.e
        L4b:
            r6 = r2
            goto L50
        L4d:
            qk.i r2 = eg.C3109Q.c
            goto L4b
        L50:
            xc.c r12 = r12.a
            long r7 = r12.a
            eg.p r12 = eg.EnumC3133p.a
            qk.L r12 = qk.M.c
            r12.getClass()
            qk.s r9 = qk.L.b
            Bk.p r12 = Bk.q.a
            r12.getClass()
            Bk.t r4 = Bk.p.b
            qk.E r3 = qk.E.c
            Tm.e r12 = Mm.P.a
            ld.M r2 = new ld.M
            r10 = 0
            r2.<init>(r3, r4, r5, r6, r7, r9, r10)
            java.lang.Object r12 = Mm.E.I(r12, r2, r0)
            if (r12 != r1) goto L75
            return r1
        L75:
            eg.W r12 = (eg.C3114W) r12
            java.lang.Object r0 = r12.c
            ld.s r0 = (ld.C3866s) r0
            r1 = 0
            if (r0 == 0) goto L81
            java.util.List r0 = r0.a
            goto L82
        L81:
            r0 = r1
        L82:
            r2 = 0
            java.lang.String r3 = "SwarmDataCenter"
            if (r0 != 0) goto L94
            boolean r0 = dg.C2978a.a
            Ae.a r0 = new Ae.a
            r0.<init>(r11, r12, r2)
            dg.C2978a.e(r3, r1, r0)
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        L94:
            boolean r12 = dg.C2978a.a
            Ae.b r12 = new Ae.b
            r12.<init>(r11, r0, r2)
            dg.C2978a.a(r3, r1, r12)
            com.moonshot.kimichat.KimiApplication r12 = Pf.B.a
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Long r12 = new java.lang.Long
            r12.<init>(r1)
            java.util.LinkedHashMap r1 = Ae.f.f
            r1.put(r11, r12)
            ng.d r12 = Ae.f.d
            c1.n0 r1 = r12.a
            java.lang.Object r1 = r1.getValue()
            java.util.Map r1 = (java.util.Map) r1
            kotlin.Pair r2 = new kotlin.Pair
            r2.<init>(r11, r0)
            java.util.Map r11 = kotlin.collections.P.k(r1, r2)
            r12.setValue(r11)
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: Ae.f.a(java.lang.String, Xk.c):java.lang.Object");
    }

    public static ArrayList b(String str) {
        Intrinsics.checkNotNullParameter(str, "chatId");
        List listD = d(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listD) {
            C3843J c3843j = (C3843J) obj;
            if (Intrinsics.b(c3843j.f, C3870w.d) || Intrinsics.b(c3843j.f, C3869v.d)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static C3843J c(String str, String str2) {
        Object next;
        Intrinsics.checkNotNullParameter(str, "chatId");
        Intrinsics.checkNotNullParameter(str2, "agentId");
        Iterator it = d(str).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.b(((C3843J) next).a, str2)) {
                break;
            }
        }
        return (C3843J) next;
    }

    public static List d(String str) {
        Intrinsics.checkNotNullParameter(str, "chatId");
        List list = (List) ((Map) d.a.getValue()).get(str);
        return list == null ? I.a : list;
    }

    public static void e(C0639v c0639v, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(c0639v, "chat");
        if (!z2 || Intrinsics.b(c0639v.e().b, X4.d)) {
            g(c0639v.a, z);
        }
    }

    public static void g(String str, boolean z) {
        if (str.length() == 0) {
            return;
        }
        LinkedHashMap linkedHashMap = e;
        if (!z) {
            j0 j0Var = (j0) linkedHashMap.get(str);
            if (j0Var != null && j0Var.a()) {
                return;
            }
            KimiApplication kimiApplication = B.a;
            long jCurrentTimeMillis = System.currentTimeMillis();
            Long l = (Long) f.get(str);
            if (jCurrentTimeMillis - (l != null ? l.longValue() : 0L) < 2000) {
                return;
            }
        }
        j0 j0Var2 = (j0) linkedHashMap.get(str);
        if (j0Var2 != null) {
            j0Var2.m((CancellationException) null);
        }
        linkedHashMap.put(str, E.z(c, (CoroutineContext) null, (C) null, new d(str, null), 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r14, Xk.c r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof Ae.e
            if (r0 == 0) goto L13
            r0 = r15
            Ae.e r0 = (Ae.e) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            Ae.e r0 = new Ae.e
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.b
            Wk.a r1 = Wk.a.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r14 = r0.a
            P8.a.s(r15)
            goto L7e
        L29:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L31:
            P8.a.s(r15)
            int r15 = r14.length()
            if (r15 != 0) goto L3d
            java.lang.String r14 = ""
            return r14
        L3d:
            ld.D r7 = new ld.D
            r7.<init>(r14)
            r0.a = r14
            r0.d = r3
            Kc.b r15 = Ae.f.b
            xc.b r15 = r15.a
            eg.Q r2 = eg.C3109Q.a
            boolean r2 = eg.C3109Q.h()
            if (r2 == 0) goto L56
            qk.i r2 = eg.C3109Q.e
        L54:
            r8 = r2
            goto L59
        L56:
            qk.i r2 = eg.C3109Q.c
            goto L54
        L59:
            xc.c r15 = r15.a
            long r9 = r15.a
            eg.p r15 = eg.EnumC3133p.a
            qk.L r15 = qk.M.c
            r15.getClass()
            qk.s r11 = qk.L.b
            Bk.p r15 = Bk.q.a
            r15.getClass()
            Bk.t r6 = Bk.p.b
            qk.E r5 = qk.E.c
            Tm.e r15 = Mm.P.a
            ld.N r4 = new ld.N
            r12 = 0
            r4.<init>(r5, r6, r7, r8, r9, r11, r12)
            java.lang.Object r15 = Mm.E.I(r15, r4, r0)
            if (r15 != r1) goto L7e
            return r1
        L7e:
            eg.W r15 = (eg.C3114W) r15
            Ae.a r0 = new Ae.a
            r0.<init>(r14, r15, r3)
            java.lang.String r1 = "SwarmDataCenter"
            dg.C2978a.c(r1, r0)
            boolean r0 = r15.f
            if (r0 == 0) goto L93
            g(r14, r3)
            r14 = 0
            return r14
        L93:
            java.lang.String r14 = r15.a()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: Ae.f.h(java.lang.String, Xk.c):java.lang.Object");
    }
}
