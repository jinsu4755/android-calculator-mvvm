package edu.nextstep.camp.data.db;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0007\u00a8\u0006\t"}, d2 = {"Ledu/nextstep/camp/data/db/Convertors;", "", "()V", "expressionToJson", "", "expression", "Ledu/nextstep/camp/domain/calculator/Expression;", "jsonToExpression", "value", "data_debug"})
public final class Convertors {
    
    public Convertors() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.lang.String expressionToJson(@org.jetbrains.annotations.NotNull()
    edu.nextstep.camp.domain.calculator.Expression expression) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final edu.nextstep.camp.domain.calculator.Expression jsonToExpression(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
        return null;
    }
}