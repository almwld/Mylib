package ek;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes3.dex */
public final class Y implements j0 {
    public final int a;
    public final Yj.c b;
    public int c;
    public Zj.f d;

    public Y(int i, Yj.c client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.a = i;
        this.b = client;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: Eb.b */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ek.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(lk.C1127c r6, Xk.c r7) throws Eb.b {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ek.X
            if (r0 == 0) goto L13
            r0 = r7
            ek.X r0 = (ek.X) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ek.X r0 = new ek.X
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            Wk.a r1 = Wk.a.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            P8.a.s(r7)
            goto L52
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            P8.a.s(r7)
            Zj.f r7 = r5.d
            if (r7 == 0) goto L3a
            Mm.E.h(r7, r3)
        L3a:
            int r7 = r5.c
            int r2 = r5.a
            if (r7 >= r2) goto L76
            int r7 = r7 + r4
            r5.c = r7
            Yj.c r7 = r5.b
            lk.g r7 = r7.h
            java.lang.Object r2 = r6.d
            r0.c = r4
            java.lang.Object r7 = r7.a(r6, r2, r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            boolean r6 = r7 instanceof Zj.f
            if (r6 == 0) goto L59
            r3 = r7
            Zj.f r3 = (Zj.f) r3
        L59:
            if (r3 == 0) goto L5e
            r5.d = r3
            return r3
        L5e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to execute send pipeline. Expected [HttpClientCall], but received "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L76:
            Eb.b r6 = new Eb.b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Max send count "
            r7.<init>(r0)
            r7.append(r2)
            java.lang.String r0 = " exceeded. Consider increasing the property maxSendCount if more is required."
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.String r0 = "message"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 3
            r1 = 0
            r6.<init>(r7, r0, r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ek.Y.a(lk.c, Xk.c):java.lang.Object");
    }
}
