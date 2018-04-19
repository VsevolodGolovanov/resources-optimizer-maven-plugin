/*
 * Copyright 2011-2015 PrimeFaces Extensions
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * $Id$
 */

package org.primefaces.extensions.optimizerplugin.model;

import java.io.File;

/**
 * Class representing an aggregation configuration.
 *
 * @author  Oleg Varaksin (ovaraksin@googlemail.com)
 */
public class Aggregation {

    /**
     * Input directory.
     *
     * @parameter
     */
    private File inputDir;

    /**
     * Aggregation per sub-folder. Names of aggregated files should be the same as their folder names where they are placed.
     *
     * @parameter
     */
    private boolean subDirMode = false;

    /**
     * Flag whether included original files must be removed.
     *
     * @parameter
     */
    private boolean removeIncluded = true;
    
    /**
     * Flag whether the directories of the source files, if they are empty after the aggregation, should be removed.
     *
     * @parameter
     */
    private boolean removeEmptyDirectories = false;

    /**
     * Flag whether included files must be compressed or not.
     *
     * @parameter
     */
    private boolean withoutCompress = false;

    /**
     * Aggregation to one big file. Output file.
     *
     * @parameter
     */
    private File outputFile;

    /**
     * File to be prepended to the aggregated file.
     *
     * @parameter
     */
    private File prependedFile;

    public File getInputDir() {
        return inputDir;
    }

    public void setInputDir(File inputDir) {
        this.inputDir = inputDir;
    }

    public boolean isSubDirMode() {
        return subDirMode;
    }

    public void setSubDirMode(boolean subDirMode) {
        this.subDirMode = subDirMode;
    }

    public boolean isRemoveIncluded() {
        return removeIncluded;
    }

    public void setRemoveIncluded(boolean removeIncluded) {
        this.removeIncluded = removeIncluded;
    }

    public boolean isRemoveEmptyDirectories() {
        return removeEmptyDirectories;
    }

    public void setRemoveEmptyDirectories(boolean removeEmptyDirectories) {
        this.removeEmptyDirectories = removeEmptyDirectories;
    }

    public boolean isWithoutCompress() {
        return withoutCompress;
    }

    public void setWithoutCompress(boolean withoutCompress) {
        this.withoutCompress = withoutCompress;
    }

    public File getOutputFile() {
        return outputFile;
    }

    public void setOutputFile(File outputFile) {
        this.outputFile = outputFile;
    }

    public File getPrependedFile() {
        return prependedFile;
    }

    public void setPrependedFile(File prependedFile) {
        this.prependedFile = prependedFile;
    }
}
