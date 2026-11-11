package jn;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import vb.c3;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes3.dex */
public final class Y implements hn.g {
    public static final Y a = new Y();

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // hn.g
    public final c3 f() {
        return hn.k.e;
    }

    @Override // hn.g
    public final String g() {
        return "kotlin.Nothing";
    }

    @Override // hn.g
    public final List getAnnotations() {
        return kotlin.collections.I.a;
    }

    @Override // hn.g
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return (hn.k.e.hashCode() * 31) - 1818355776;
    }

    @Override // hn.g
    public final int i(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // hn.g
    public final boolean isInline() {
        return false;
    }

    @Override // hn.g
    public final int j() {
        return 0;
    }

    @Override // hn.g
    public final String k(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // hn.g
    public final List l(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // hn.g
    public final hn.g m(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // hn.g
    public final boolean n(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    public final String toString() {
        return "NothingSerialDescriptor";
    }
}
