package N0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes.dex */
public final class Y extends Xk.i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0365d0 f5278b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(C0365d0 c0365d0, Vk.a aVar) {
        super(1, aVar);
        this.f5278b = c0365d0;
    }

    public final Vk.a create(Vk.a aVar) {
        return new Y(this.f5278b, aVar);
    }

    public final Object invoke(Object obj) {
        return create((Vk.a) obj).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        if (r8.c(r1, r5, r7) == r0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            Wk.a r0 = Wk.a.a
            int r1 = r7.f5277a
            r2 = 2
            r3 = 1
            N0.d0 r4 = r7.f5278b
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            P8.a.s(r8)
            goto L4d
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            P8.a.s(r8)
            goto L2c
        L1e:
            P8.a.s(r8)
            O0.O r8 = r4.f5318u
            r7.f5277a = r3
            kotlin.Unit r8 = r8.E()
            if (r8 != r0) goto L2c
            goto L4c
        L2c:
            R0.w r8 = r4.f5306A
            if (r8 == 0) goto L4d
            O0.O r1 = r4.f5318u
            N0.J0 r1 = r1.f5922a
            M0.h r1 = r1.f()
            java.lang.CharSequence r1 = r1.f4762c
            O0.O r3 = r4.f5318u
            N0.J0 r3 = r3.f5922a
            M0.h r3 = r3.f()
            long r5 = r3.f4763d
            r7.f5277a = r2
            java.lang.Object r8 = r8.c(r1, r5, r7)
            if (r8 != r0) goto L4d
        L4c:
            return r0
        L4d:
            O0.O r8 = r4.f5318u
            c1.n0 r8 = r8.f5941u
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r8.setValue(r0)
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: N0.Y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
