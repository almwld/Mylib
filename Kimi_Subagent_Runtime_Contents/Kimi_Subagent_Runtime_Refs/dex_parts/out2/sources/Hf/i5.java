package Hf;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import ue.C4801l;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class i5 extends Df.d implements Df.b {
    public static final /* synthetic */ int l = 0;
    public final Cf.S3 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(Cf.S3 s3) {
        super(s3);
        Intrinsics.checkNotNullParameter(s3, "delegate");
        this.k = s3;
    }

    public static void J(String str, Gc.F1 f1, String str2) {
        Ri.B b = Ri.B.a;
        Be.e.v(str, Ri.B.q() ? FirebaseAnalytics.Event.LEVEL_UP : "resource_over", "okc_html", str2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: Sk.o */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (I((Gf.I) r8, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
    
        if (H(r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(Gf.T r8, Xk.c r9) throws Sk.o {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Hf.i5.G(Gf.T, Xk.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H(Xk.c r7) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Hf.i5.H(Xk.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0269, code lost:
    
        if (r6.K(r1, r2) == r4) goto L152;
     */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0393 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0233  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I(Gf.I r25, Xk.c r26) {
        /*
            Method dump skipped, instruction units count: 960
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Hf.i5.I(Gf.I, Xk.c):java.lang.Object");
    }

    @Override // Df.c
    public final void c() {
        w(kotlin.jvm.internal.J.a.b(Gf.T.class), new Z4(this, null));
        Mm.E.z(androidx.lifecycle.Z.i(this), (CoroutineContext) null, (Mm.C) null, new b5(this, null), 3);
    }

    @Override // Df.b
    public final void e(Mm.B b, C4801l c4801l) {
        Intrinsics.checkNotNullParameter(b, "scope");
        Intrinsics.checkNotNullParameter(c4801l, "streamService");
        super.e(b, c4801l);
        Mm.E.z(androidx.lifecycle.Z.i(this), (CoroutineContext) null, (Mm.C) null, new g5(c4801l, this, null), 3);
    }
}
