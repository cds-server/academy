/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.edcore.exceptions;

/**
 *
 * @author cds-00
 */
public class NullException extends Exception {

    /**
     * Creates a new instance of <code>NullException</code> without detail
     * message.
     */
    public NullException() {
    }

    /**
     * Constructs an instance of <code>NullException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public NullException(String msg) {
        super(msg);
    }
}
