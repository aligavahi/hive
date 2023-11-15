<?php
namespace metastore;

/**
 * Autogenerated by Thrift Compiler (0.14.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;

class AddPartitionsRequest
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'dbName',
            'isRequired' => true,
            'type' => TType::STRING,
        ),
        2 => array(
            'var' => 'tblName',
            'isRequired' => true,
            'type' => TType::STRING,
        ),
        3 => array(
            'var' => 'parts',
            'isRequired' => true,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\metastore\Partition',
                ),
        ),
        4 => array(
            'var' => 'ifNotExists',
            'isRequired' => true,
            'type' => TType::BOOL,
        ),
        5 => array(
            'var' => 'needResult',
            'isRequired' => false,
            'type' => TType::BOOL,
        ),
        6 => array(
            'var' => 'catName',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
    );

    /**
     * @var string
     */
    public $dbName = null;
    /**
     * @var string
     */
    public $tblName = null;
    /**
     * @var \metastore\Partition[]
     */
    public $parts = null;
    /**
     * @var bool
     */
    public $ifNotExists = null;
    /**
     * @var bool
     */
    public $needResult = true;
    /**
     * @var string
     */
    public $catName = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['dbName'])) {
                $this->dbName = $vals['dbName'];
            }
            if (isset($vals['tblName'])) {
                $this->tblName = $vals['tblName'];
            }
            if (isset($vals['parts'])) {
                $this->parts = $vals['parts'];
            }
            if (isset($vals['ifNotExists'])) {
                $this->ifNotExists = $vals['ifNotExists'];
            }
            if (isset($vals['needResult'])) {
                $this->needResult = $vals['needResult'];
            }
            if (isset($vals['catName'])) {
                $this->catName = $vals['catName'];
            }
        }
    }

    public function getName()
    {
        return 'AddPartitionsRequest';
    }


    public function read($input)
    {
        $xfer = 0;
        $fname = null;
        $ftype = 0;
        $fid = 0;
        $xfer += $input->readStructBegin($fname);
        while (true) {
            $xfer += $input->readFieldBegin($fname, $ftype, $fid);
            if ($ftype == TType::STOP) {
                break;
            }
            switch ($fid) {
                case 1:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->dbName);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->tblName);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::LST) {
                        $this->parts = array();
                        $_size371 = 0;
                        $_etype374 = 0;
                        $xfer += $input->readListBegin($_etype374, $_size371);
                        for ($_i375 = 0; $_i375 < $_size371; ++$_i375) {
                            $elem376 = null;
                            $elem376 = new \metastore\Partition();
                            $xfer += $elem376->read($input);
                            $this->parts []= $elem376;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::BOOL) {
                        $xfer += $input->readBool($this->ifNotExists);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 5:
                    if ($ftype == TType::BOOL) {
                        $xfer += $input->readBool($this->needResult);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 6:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->catName);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                default:
                    $xfer += $input->skip($ftype);
                    break;
            }
            $xfer += $input->readFieldEnd();
        }
        $xfer += $input->readStructEnd();
        return $xfer;
    }

    public function write($output)
    {
        $xfer = 0;
        $xfer += $output->writeStructBegin('AddPartitionsRequest');
        if ($this->dbName !== null) {
            $xfer += $output->writeFieldBegin('dbName', TType::STRING, 1);
            $xfer += $output->writeString($this->dbName);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->tblName !== null) {
            $xfer += $output->writeFieldBegin('tblName', TType::STRING, 2);
            $xfer += $output->writeString($this->tblName);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->parts !== null) {
            if (!is_array($this->parts)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('parts', TType::LST, 3);
            $output->writeListBegin(TType::STRUCT, count($this->parts));
            foreach ($this->parts as $iter377) {
                $xfer += $iter377->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->ifNotExists !== null) {
            $xfer += $output->writeFieldBegin('ifNotExists', TType::BOOL, 4);
            $xfer += $output->writeBool($this->ifNotExists);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->needResult !== null) {
            $xfer += $output->writeFieldBegin('needResult', TType::BOOL, 5);
            $xfer += $output->writeBool($this->needResult);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->catName !== null) {
            $xfer += $output->writeFieldBegin('catName', TType::STRING, 6);
            $xfer += $output->writeString($this->catName);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
