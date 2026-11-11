package Df;

import Mm.B;
import kotlin.jvm.internal.Intrinsics;
import ue.C4801l;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public interface b {
    default void a(boolean z) {
    }

    default void b(boolean z) {
    }

    default void d() {
    }

    default void e(B b, C4801l c4801l) {
        Intrinsics.checkNotNullParameter(b, "scope");
        Intrinsics.checkNotNullParameter(c4801l, "streamService");
    }
}
