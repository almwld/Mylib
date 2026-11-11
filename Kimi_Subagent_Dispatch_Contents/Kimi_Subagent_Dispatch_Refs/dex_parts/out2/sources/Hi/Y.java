package Hi;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import ng.C4068d;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class Y {
    public static final Y a = new Y();
    public static final LinkedHashMap b = new LinkedHashMap();
    public static final C4068d c;
    public static final LinkedHashMap d;
    public static final C4068d e;

    static {
        kotlin.collections.I i = kotlin.collections.I.a;
        c = new C4068d(new Ii.f((List) i, 2, 0));
        d = new LinkedHashMap();
        e = new C4068d(new Ii.f((List) i, 2, 0));
    }

    public static Ii.f d() {
        return (Ii.f) c.a.getValue();
    }

    public static void e() {
        Mm.E.z(Sf.d.a, (CoroutineContext) null, (Mm.C) null, new V(2, null), 3);
    }

    public static Object g(Ii.f fVar, Xk.c cVar) {
        Intrinsics.checkNotNullParameter(fVar, "<set-?>");
        c.setValue(fVar);
        Object objI = Mm.E.I(Mm.P.a, new X(fVar, null), cVar);
        return objI == Wk.a.a ? objI : Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x011c, code lost:
    
        if (Mm.E.K(10000, r3, r4) == r6) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x014f, code lost:
    
        if (g(r3, r4) != r6) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(Ii.c r25, java.lang.String r26, java.lang.String r27, Xk.c r28) {
        /*
            Method dump skipped, instruction units count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Hi.Y.a(Ii.c, java.lang.String, java.lang.String, Xk.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r13, Xk.c r14) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Hi.Y.b(java.lang.String, Xk.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(Ii.c r12, Xk.c r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof Hi.Q
            if (r0 == 0) goto L13
            r0 = r13
            Hi.Q r0 = (Hi.Q) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            Hi.Q r0 = new Hi.Q
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.b
            Wk.a r1 = Wk.a.a
            int r2 = r0.d
            r3 = 1
            java.util.LinkedHashMap r4 = Hi.Y.d
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            Ii.c r12 = r0.a
            P8.a.s(r13)
            goto L74
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L33:
            P8.a.s(r13)
            boolean r13 = r12.e
            java.lang.String r2 = r12.a
            if (r13 != 0) goto L91
            java.lang.Object r13 = r4.get(r2)
            Ii.c r13 = (Ii.c) r13
            if (r13 == 0) goto L45
            return r13
        L45:
            Ic.g r13 = Dd.T.a
            r0.a = r12
            r0.d = r3
            eg.Q r13 = eg.C3109Q.a
            java.lang.String r13 = "/api/prompt-snippet/"
            java.lang.String r6 = Ie.K0.A(r13, r2)
            eg.p r13 = eg.EnumC3133p.a
            qk.L r13 = qk.M.c
            r13.getClass()
            qk.s r9 = qk.L.b
            Bk.p r13 = Bk.q.a
            r13.getClass()
            Bk.t r8 = Bk.p.b
            qk.E r7 = qk.E.b
            Tm.e r13 = Mm.P.a
            Dd.O r5 = new Dd.O
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.Object r13 = Mm.E.I(r13, r5, r0)
            if (r13 != r1) goto L74
            return r1
        L74:
            eg.W r13 = (eg.C3114W) r13
            java.lang.Object r0 = r13.c
            Ii.c r0 = (Ii.c) r0
            boolean r13 = r13.f
            if (r13 == 0) goto L85
            if (r0 == 0) goto L85
            java.lang.String r13 = r12.a
            r4.put(r13, r0)
        L85:
            java.lang.String r13 = r12.a
            java.lang.Object r13 = r4.get(r13)
            Ii.c r13 = (Ii.c) r13
            if (r13 != 0) goto L90
            return r12
        L90:
            return r13
        L91:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: Hi.Y.c(Ii.c, Xk.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(Xk.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof Hi.W
            if (r0 == 0) goto L13
            r0 = r8
            Hi.W r0 = (Hi.W) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            Hi.W r0 = new Hi.W
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            Wk.a r1 = Wk.a.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            P8.a.s(r8)
            goto L59
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L2f:
            P8.a.s(r8)
            Ic.g r8 = Dd.T.a
            r0.c = r3
            eg.Q r8 = eg.C3109Q.a
            eg.p r8 = eg.EnumC3133p.a
            qk.L r8 = qk.M.c
            r8.getClass()
            qk.s r8 = qk.L.b
            Bk.p r2 = Bk.q.a
            r2.getClass()
            Bk.t r2 = Bk.p.b
            qk.E r3 = qk.E.b
            Tm.e r4 = Mm.P.a
            Dd.Q r5 = new Dd.Q
            r6 = 0
            r5.<init>(r3, r2, r8, r6)
            java.lang.Object r8 = Mm.E.I(r4, r5, r0)
            if (r8 != r1) goto L59
            return r1
        L59:
            eg.W r8 = (eg.C3114W) r8
            boolean r0 = r8.f
            if (r0 == 0) goto L78
            java.lang.Object r8 = r8.c
            Ii.f r8 = (Ii.f) r8
            if (r8 != 0) goto L6e
            Ii.f r8 = new Ii.f
            kotlin.collections.I r0 = kotlin.collections.I.a
            r1 = 2
            r2 = 0
            r8.<init>(r0, r1, r2)
        L6e:
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            ng.d r0 = Hi.Y.e
            r0.setValue(r8)
        L78:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Hi.Y.f(Xk.c):java.lang.Object");
    }
}
