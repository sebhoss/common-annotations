/*
 * Copyright © 2013 Sebastian Hoß <mail@shoss.de>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See http://www.wtfpl.net/ for more details.
 */
package com.github.sebhoss.common.annotation;

import javax.annotation.Nullable;

/**
 * Utility classes which helps working with legacy (nullable) APIs.
 */
public final class Nullsafe {

    /**
     * @param reference
     *            A possible <code>null</code> reference.
     * @return Either the reference itself, or an {@link NullPointerException}, in case the reference was
     *         <code>null</code>.
     */
    public static <T> T nullsafe(@Nullable final T reference) {
        if (reference != null) {
            return reference;
        }

        throw new NullPointerException();
    }

}
